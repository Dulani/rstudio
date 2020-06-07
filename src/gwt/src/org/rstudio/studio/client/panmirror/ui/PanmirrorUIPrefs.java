/*
 * PanmirrorUIPrefs.java
 *
 * Copyright (C) 2020 by RStudio, PBC
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */



package org.rstudio.studio.client.panmirror.ui;

import org.rstudio.studio.client.RStudioGinjector;
import org.rstudio.studio.client.workbench.prefs.model.UserPrefs;
import org.rstudio.studio.client.workbench.prefs.model.UserPrefsAccessor;
import org.rstudio.studio.client.workbench.prefs.model.UserState;

import com.google.inject.Inject;
import com.google.inject.Provider;

import jsinterop.annotations.JsType;

@JsType
public class PanmirrorUIPrefs {
   
   public PanmirrorUIPrefs() 
   {
      RStudioGinjector.INSTANCE.injectMembers(this);
   }

   @Inject
   void initialize(Provider<UserPrefs> pUIPrefs, Provider<UserState> pUserState)
   {
      pUIPrefs_ = pUIPrefs;
      pUserState_ = pUserState;
   }
   
   
   public Boolean darkMode()
   {
     return pUserState_.get().theme().getGlobalValue().getIsDark(); 
   }
   
   public Boolean equationPreview()
   {
      return !pUIPrefs_.get().latexPreviewOnCursorIdle().getValue()
               .equals(UserPrefsAccessor.LATEX_PREVIEW_ON_CURSOR_IDLE_NEVER);
   }
   
   public double emojiSkinTone() 
   {
	   String emojiSkinTone = pUIPrefs_.get().emojiSkintone().getValue();
	   if (emojiSkinTone.equals(UserPrefsAccessor.EMOJI_SKINTONE_DARK)) {
		   return 0x1F3FF;
	   } else if (emojiSkinTone.equals(UserPrefsAccessor.EMOJI_SKINTONE_MEDIUM_DARK)) {
		   return 0x1F3FE;
	   } else if (emojiSkinTone.equals(UserPrefsAccessor.EMOJI_SKINTONE_MEDIUM)) {
		   return 0x1F3FD;
	   } else if (emojiSkinTone.equals(UserPrefsAccessor.EMOJI_SKINTONE_MEDIUM_LIGHT)) {
		   return 0x1F3FC;
	   } else if (emojiSkinTone.equals(UserPrefsAccessor.EMOJI_SKINTONE_LIGHT)) {
		   return 0x1F3FB;		   
	   } else if (emojiSkinTone.equals(UserPrefsAccessor.EMOJI_SKINTONE_DEFAULT)) {
		   return 0;
	   } else if (emojiSkinTone.equals(UserPrefsAccessor.EMOJI_SKINTONE__NONE_)) {
		   return -1;
	   } else {
		   return -1;
	   }
   }
   
   public void setEmojiSkinTone(double skinTone) 
   {
	   String skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE__NONE_;
	   if (skinTone == 0x1F3FF) {
		   skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE_DARK;
	   } else if (skinTone == 0x1F3FE) {
		   skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE_MEDIUM_DARK;
	   } else if (skinTone == 0x1F3FD) {
		   skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE_MEDIUM;
	   } else if (skinTone == 0x1F3FC) {
		   skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE_MEDIUM_LIGHT;
	   } else if (skinTone == 0x1F3FB) {
		   skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE_LIGHT;		   
	   } else if (skinTone == 0) {
		   skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE_DEFAULT;
	   } else if (skinTone == -1) {
		   skinToneStr = UserPrefsAccessor.EMOJI_SKINTONE__NONE_;
	   }

	   pUIPrefs_.get().emojiSkintone().setGlobalValue(skinToneStr);
   }
   
   Provider<UserPrefs> pUIPrefs_;
   Provider<UserState> pUserState_;
}

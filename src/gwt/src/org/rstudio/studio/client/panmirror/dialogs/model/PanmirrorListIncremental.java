/*
 * PanmirrorListIncremental.java
 *
 * Copyright (C) 2021 by RStudio, PBC
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



package org.rstudio.studio.client.panmirror.dialogs.model;

import com.google.gwt.core.client.GWT;
import org.rstudio.studio.client.panmirror.PanmirrorConstants;

public class PanmirrorListIncremental
{
   private static final PanmirrorConstants constants_ = GWT.create(PanmirrorConstants.class);

   public static String Default = constants_.defaultLabel();
   public static String Incremental = constants_.incrementalLabel();
   public static String Nonincremental = constants_.nonincrementalLabel();
}

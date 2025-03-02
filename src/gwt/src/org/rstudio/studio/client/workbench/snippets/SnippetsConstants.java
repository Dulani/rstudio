/*
 * SnippetsConstants.java
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
package org.rstudio.studio.client.workbench.snippets;

public interface SnippetsConstants extends com.google.gwt.i18n.client.Messages {

    /**
     * Translated "Save".
     *
     * @return translated "Save"
     */
    @DefaultMessage("Save")
    @Key("saveTitle")
    String saveTitle();


    /**
     * Translated "Edit Snippets".
     *
     * @return translated "Edit Snippets"
     */
    @DefaultMessage("Edit Snippets")
    @Key("editSnippetsText")
    String editSnippetsText();

    /**
     * Translated "Using Code Snippets".
     *
     * @return translated "Using Code Snippets"
     */
    @DefaultMessage("Using Code Snippets")
    @Key("usingCodeSnippetsText")
    String usingCodeSnippetsText();

    /**
     * Translated "Error Applying Snippets ({0})".
     *
     * @return translated "Error Applying Snippets ({0})"
     */
    @DefaultMessage("Error Applying Snippets ({0})")
    @Key("applyingSnippetsError")
    String applyingSnippetsError(String fileTypeLabel);
}

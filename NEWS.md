## RStudio 2022-02.0 "Prairie Trillium" Release Notes

### New

#### Visual Mode

* Improved handling of table markdown in visual editor (#9830)
* Added option to show line numbers in visual mode code chunks (#9387)
* Made visual code chunks collapsible (#8613)
* Show source diagnostics in visual code chunks (#9874)
* Fixed code execution via selection in indented visual mode code chunks (#9108)
* Fixed detection of HTTP(S) URLs on Windows in the image resolver (#9837)
* Improved behavior of citekey removal in Insert Citation dialog (#9124)
* Fix issue with unicode characters in citation data (#9745)
* Fix issue with unicode characters in citekeys (#9754)
* Fix issue with delay showing newly added Zotero references when inserting citations (#9800)
* Add ability to insert citation for R Packages (#8921)
* Fixed BetterBibTeX detection on Linux (#10007)
* Fixed DT tables being squashed in the viewer pane (#10276)

#### RStudio Workbench

* Added support for setting the `subPath` on Kubernetes sessions using `KubernetesPersistentVolumeClaim` mounts in `/etc/rstudio/launcher-mounts` (Pro #2976).
* Added support for Slurm 21.08 to the Slurm Launcher plugin
* Fixed a bug where Slurm Launcher jobs that exited with a non-zero exit code would still have a zero exit code (#203)
* Fixed a bug where Slurm Launcher jobs with standard error would never be written to the output file (#203)
* Fixed a bug where Slurm Launcher jobs that exited due to a signal would not show the exit code as 128+signal (#203)
* Fixed a bug where Launcher log files could be stuck being owned by the root user (#9728)
* Added `license-warning-days` setting to make it possible to adjust or disable the license warnings that appear two weeks prior to expiration (Pro #440)
* When an R version defined in `r-versions` uses an environment module, the name of the module is displayed in the version select menus instead of the system R version name. (Pro #2687)
* Clicking on a session entry in the RSW homepage will always attempt to launch it -- the title is no longer a link. Clicking on "Info" will always show info. (Pro #3082)
* With the options `launcher-sessions-create-container-user`, and `launcher-sessions-container-forward-groups` enabled, RSW will now add a group to the user even if the group with a matching id exists but with a different name. (Pro #2971)
* Added SSL communication between RSW and remote sessions (using the job launcher). It's enabled by default and can be disabled in rserver.conf by setting session-ssl-enabled=0. Certificates are generated for each job by default or can be manually configured. (Pro #3026)

#### Misc

* RStudio now supports the experimental UTF-8 UCRT builds of R (#9824)
* Add commands to open selected files in columns or active editor (#7920)
* Add *New Blank File* command to Files pane to create empty files of selected type in the directory (#1564)
* Rename CSRF token header `X-CSRF-Token` and cookie `csrf-token` to `X-RS-CSRF-Token` and `rs-csrf-token`, respectively, to avoid clashing with similarly named headers and cookies in other services (#7319)
* Use double indent for function parameters to align with Tidyverse style (#9766)
* Sessions that attempt to automatically suspend, but were blocked by some operation, will report what's blocking suspension in the IDE in the R Console toolbar (pro #2618)
* Recognize `id_ed25519` key file in Version Control options UI (#9991)
* Updated Files Pane buttons to resize and remain visible at smaller widths (#9870)
* Remove 'Classic' IDE theme (#9738)
* Added support for Amazon Linux 2 (Pro #2474)
* Treat Alt and Caption fields differently depending on file type (#9713)
* Fixed shortcut conflict on German keyboard (#9276)

#### R

* Preliminary support for R graphics engine version 15 in R 4.2.0. (#10058)

### Fixed

* Fixed an issue that could cause calls to `grid` functions to fail after restart (#2919)
* Fixed errors when uploading files/directory names with invalid characters (Pro #698)
* Added error when rsession may be running a different version of R than expected (Pro #2477)
* Fixed "No such file or directory" errors when auto-saving R Notebook chunks while running them (#9284)
* Fixed issue causing unnecessary document switching when evaluating statements in debugger (#9918)
* Fixed scrolling past long sub-content (like kables) in RMD files. User must interact with sub-content in order to scroll through it (#2202)
* Fixed custom shortcuts not appearing correctly in menus (#9915)
* Fixed custom shortcuts not appearing correctly in "Keyboard Shortcuts Help" and Electron menus. (#9953)
* Fixed header scrolling in data viewer tables not following table contents in unfocused windows (#8208)
* Fixed permissions on Mac Desktop application so all user accounts can launch it (#9945, #10267)
* Fixed logging directory permissions to be more restrictive (775 instead of 777) (#3099)

### Breaking
There are no breaking changes in this release.

### Deprecated / Removed
There is no deprecated or removed functionality in this release.

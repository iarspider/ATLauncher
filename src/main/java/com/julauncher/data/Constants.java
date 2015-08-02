/*
 * JULauncher - https://github.com/iarspider/JULauncher
 * Copyright (C) 2015 JULauncher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.julauncher.data;

public class Constants {
    public static final LauncherVersion VERSION = new LauncherVersion(3, 2, 3, 2, 0);
    public static final String LAUNCHER_NAME = "JULauncher";
    public static final String API_BASE_URL = "https://iarazumov.com/jul/api/v1/launcher/";
    public static final String PASTE_CHECK_URL = "";
    public static final String PASTE_API_URL = "";
    public static final Server[] SERVERS = new Server[]{
            new Server("Auto", "iarazumov.com/jul", true, true),
            new Server("IHEP", "tnfserv.ihep.su/jul", true, false)
    };
}

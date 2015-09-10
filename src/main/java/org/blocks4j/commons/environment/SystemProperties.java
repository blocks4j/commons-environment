/*
 *   Copyright 2013-2015 Blocks4J Team (www.blocks4j.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.blocks4j.commons.environment;


public class SystemProperties {

    private static final String fileEncoding = System.getProperty("file.encoding");
    private static final String fileSeparator = System.getProperty("file.separator");
    private static final String pathSeparator = System.getProperty("path.separator");
    private static final String lineSeparator = System.getProperty("line.separator");

    public static String fileEncoding() {
        return fileEncoding;
    }

    public static String fileSeparator() {
        return fileSeparator;
    }

    public static String pathSeparator() {
        return pathSeparator;
    }

    public static String lineSeparator() {
        return lineSeparator;
    }
}

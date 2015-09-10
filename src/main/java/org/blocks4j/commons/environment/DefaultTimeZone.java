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

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;

public class DefaultTimeZone {

    public static String getOffset() {
        TimeZone tz = TimeZone.getDefault();
        String tzString = String.valueOf((TimeUnit.MILLISECONDS.toHours(Math.abs(tz.getRawOffset()))));
        tzString = StringUtils.leftPad(tzString, 2, '0');
        tzString = StringUtils.rightPad(tzString, 4, '0');
        return tzString;
    }
}

/**
 * @Project Name :  base
 * @Package Name :  com.orient.util
 * @Description :  TODO
 * @author :  panduanduan
 * @Creation Date:  2018-01-23 10:41 AM
 * @ModificationHistory Who    When    What
 * --------  ---------  --------------------------
 */
package com.orient.util;

import java.io.Serializable;
import java.util.List;

/**
 * @author :  panduanduan
 * @Description :  基础工具类
 * @Creation Date:  2018-01-23 10:41 AM
 */
public class CommonTools implements Serializable {

    public static boolean isEmptyList(List target) {
        return null != target && 0 != target.size();
    }
}
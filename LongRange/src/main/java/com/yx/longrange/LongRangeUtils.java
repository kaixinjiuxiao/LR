package com.yx.longrange;

import android.text.TextUtils;

public class LongRangeUtils {
    public static String showMsg(String msg) {
        return TextUtils.isEmpty(msg) ? "这是一条遥远的msg" : msg;
    }
}

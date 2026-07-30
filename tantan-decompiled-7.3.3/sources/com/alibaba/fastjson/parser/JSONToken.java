package com.alibaba.fastjson.parser;

import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;

/* JADX INFO: loaded from: classes.dex */
public class JSONToken {
    public static final int COLON = 17;
    public static final int COMMA = 16;
    public static final int DOT = 25;
    public static final int EOF = 20;
    public static final int ERROR = 1;
    public static final int FALSE = 7;
    public static final int FIELD_NAME = 19;
    public static final int HEX = 26;
    public static final int IDENTIFIER = 18;
    public static final int LBRACE = 12;
    public static final int LBRACKET = 14;
    public static final int LITERAL_FLOAT = 3;
    public static final int LITERAL_INT = 2;
    public static final int LITERAL_ISO8601_DATE = 5;
    public static final int LITERAL_STRING = 4;
    public static final int LPAREN = 10;
    public static final int NEW = 9;
    public static final int NULL = 8;
    public static final int RBRACE = 13;
    public static final int RBRACKET = 15;
    public static final int RPAREN = 11;
    public static final int SEMI = 24;
    public static final int SET = 21;
    public static final int TREE_SET = 22;
    public static final int TRUE = 6;
    public static final int UNDEFINED = 23;

    public static String name(int i) {
        switch (i) {
            case 1:
                return "error";
            case 2:
                return Constants.INT;
            case 3:
                return Constants.FLOAT;
            case 4:
                return "string";
            case 5:
                return "iso8601";
            case 6:
                return "true";
            case 7:
                return "false";
            case 8:
                return "null";
            case 9:
                return ShareConstants.NEW_VERSION;
            case 10:
                return "(";
            case 11:
                return ")";
            case 12:
                return "{";
            case 13:
                return "}";
            case 14:
                return "[";
            case 15:
                return com.clevertap.android.sdk.Constants.AES_SUFFIX;
            case 16:
                return com.clevertap.android.sdk.Constants.SEPARATOR_COMMA;
            case 17:
                return ":";
            case 18:
                return "ident";
            case 19:
                return "fieldName";
            case 20:
                return "EOF";
            case 21:
                return "Set";
            case 22:
                return "TreeSet";
            case 23:
                return NotificationStatus.undefined;
            case 24:
                return Constants.PACKNAME_END;
            case 25:
                return ".";
            case 26:
                return "hex";
            default:
                return "Unknown";
        }
    }
}

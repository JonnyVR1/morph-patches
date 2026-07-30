package com.alibaba.fastjson.asm;

import com.meituan.robust.Constants;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes.dex */
public class Type {
    private final char[] buf;
    private final int len;
    private final int off;
    protected final int sort;
    public static final Type VOID_TYPE = new Type(0, null, 1443168256, 1);
    public static final Type BOOLEAN_TYPE = new Type(1, null, 1509950721, 1);
    public static final Type CHAR_TYPE = new Type(2, null, 1124075009, 1);
    public static final Type BYTE_TYPE = new Type(3, null, 1107297537, 1);
    public static final Type SHORT_TYPE = new Type(4, null, 1392510721, 1);
    public static final Type INT_TYPE = new Type(5, null, 1224736769, 1);
    public static final Type FLOAT_TYPE = new Type(6, null, 1174536705, 1);
    public static final Type LONG_TYPE = new Type(7, null, 1241579778, 1);
    public static final Type DOUBLE_TYPE = new Type(8, null, 1141048066, 1);

    private Type(int i, char[] cArr, int i2, int i3) {
        this.sort = i;
        this.buf = cArr;
        this.off = i2;
        this.len = i3;
    }

    public static Type[] getArgumentTypes(String str) {
        char[] charArray = str.toCharArray();
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = charArray[i2];
            if (c == ')') {
                break;
            }
            if (c == 'L') {
                while (true) {
                    i2 = i4 + 1;
                    if (charArray[i4] == ';') {
                        break;
                    }
                    i4 = i2;
                }
                i3++;
            } else {
                if (c != '[') {
                    i3++;
                }
                i2 = i4;
            }
        }
        Type[] typeArr = new Type[i3];
        int i5 = 0;
        while (charArray[i] != ')') {
            Type type = getType(charArray, i);
            typeArr[i5] = type;
            i += type.len + (type.sort == 10 ? 2 : 0);
            i5++;
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        int i;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            i = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt == 'L') {
                while (true) {
                    i3 = i + 1;
                    if (str.charAt(i) == ';') {
                        break;
                    }
                    i = i3;
                }
                i4++;
            } else {
                i4 = (cCharAt == 'D' || cCharAt == 'J') ? i4 + 2 : i4 + 1;
                i3 = i;
            }
        }
        char cCharAt2 = str.charAt(i);
        int i5 = i4 << 2;
        if (cCharAt2 == 'V') {
            i2 = 0;
        } else if (cCharAt2 == 'D' || cCharAt2 == 'J') {
            i2 = 2;
        }
        return i5 | i2;
    }

    private int getDimensions() {
        int i = 1;
        while (this.buf[this.off + i] == '[') {
            i++;
        }
        return i;
    }

    private static Type getType(char[] cArr, int i) {
        char c;
        char c2 = cArr[i];
        if (c2 == 'F') {
            return FLOAT_TYPE;
        }
        if (c2 == 'S') {
            return SHORT_TYPE;
        }
        if (c2 == 'V') {
            return VOID_TYPE;
        }
        if (c2 == 'I') {
            return INT_TYPE;
        }
        if (c2 == 'J') {
            return LONG_TYPE;
        }
        if (c2 == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (c2 != '[') {
            switch (c2) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    int i2 = 1;
                    while (cArr[i + i2] != ';') {
                        i2++;
                    }
                    return new Type(10, cArr, i + 1, i2 - 1);
            }
        }
        int i3 = 1;
        while (true) {
            c = cArr[i + i3];
            if (c != '[') {
                break;
            }
            i3++;
        }
        if (c == 'L') {
            do {
                i3++;
            } while (cArr[i + i3] != ';');
        }
        return new Type(9, cArr, i, i3 + 1);
    }

    public String getClassName() {
        switch (this.sort) {
            case 0:
                return Constants.VOID;
            case 1:
                return Constants.BOOLEAN;
            case 2:
                return Constants.CHAR;
            case 3:
                return Constants.BYTE;
            case 4:
                return Constants.SHORT;
            case 5:
                return Constants.INT;
            case 6:
                return Constants.FLOAT;
            case 7:
                return Constants.LONG;
            case 8:
                return Constants.DOUBLE;
            case 9:
                StringBuilder sb = new StringBuilder(getType(this.buf, this.off + getDimensions()).getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    sb.append(WeJson.EMPTY_ARR);
                }
                return sb.toString();
            default:
                return new String(this.buf, this.off, this.len).replace('/', '.');
        }
    }

    public String getDescriptor() {
        return new String(this.buf, this.off, this.len);
    }

    public String getInternalName() {
        return new String(this.buf, this.off, this.len);
    }

    public static Type getType(String str) {
        return getType(str.toCharArray(), 0);
    }
}

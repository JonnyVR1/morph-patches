package com.p074ss.bytertc.audio.device.base;

import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public class ManufacturerChecker {
    private static final String hrType = "ronoh";
    private static final String hwType = "iewauh";
    private static final String oneType = "sulpeno";
    private static final String realType = "emlaer";
    private static final String rmType = "imder";
    private static Type typeResult = null;
    private static final String voType = "oviv";
    private static final String xmType = "imoaix";

    public enum Type {
        UNKNOWN,
        XM,
        RM,
        HW,
        HR,
        VO,
        OP
    }

    public static Type getManufacturerType(String str) {
        Type type = typeResult;
        if (type != null) {
            return type;
        }
        if (str == null || str.isEmpty()) {
            return Type.UNKNOWN;
        }
        String lowerCase = new StringBuilder(str).reverse().toString().toLowerCase();
        if (lowerCase.equalsIgnoreCase(xmType)) {
            typeResult = Type.XM;
        } else if (lowerCase.equalsIgnoreCase(rmType)) {
            typeResult = Type.RM;
        } else if (lowerCase.equalsIgnoreCase(hwType)) {
            typeResult = Type.HW;
        } else if (lowerCase.equalsIgnoreCase(hrType)) {
            typeResult = Type.HR;
        } else if (lowerCase.equalsIgnoreCase(voType)) {
            typeResult = Type.VO;
        } else if ((lowerCase.length() == 4 && lowerCase.startsWith("op") && lowerCase.endsWith("po")) || lowerCase.equalsIgnoreCase(oneType) || lowerCase.equalsIgnoreCase(realType)) {
            typeResult = Type.OP;
        } else {
            typeResult = Type.UNKNOWN;
        }
        return typeResult;
    }

    public static Type getManufacturerType() {
        return getManufacturerType(Build.BRAND);
    }
}

package org.apache.commons.sudcompress.archivers.zip;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum ZipMethod {
    STORED(0),
    UNSHRINKING(1),
    EXPANDING_LEVEL_1(2),
    EXPANDING_LEVEL_2(3),
    EXPANDING_LEVEL_3(4),
    EXPANDING_LEVEL_4(5),
    IMPLODING(6),
    TOKENIZATION(7),
    DEFLATED(8),
    ENHANCED_DEFLATED(9),
    PKWARE_IMPLODING(10),
    BZIP2(12),
    LZMA(14),
    XZ(95),
    JPEG(96),
    WAVPACK(97),
    PPMD(98),
    AES_ENCRYPTED(99),
    UNKNOWN;

    static final int UNKNOWN_CODE = -1;
    private static final Map<Integer, ZipMethod> codeToEnum;
    private final int code;

    static {
        HashMap map = new HashMap();
        for (ZipMethod zipMethod : values()) {
            map.put(Integer.valueOf(zipMethod.getCode()), zipMethod);
        }
        codeToEnum = Collections.unmodifiableMap(map);
    }

    ZipMethod(int i) {
        this.code = i;
    }

    public static ZipMethod getMethodByCode(int i) {
        return codeToEnum.get(Integer.valueOf(i));
    }

    public int getCode() {
        return this.code;
    }

    ZipMethod() {
        this(-1);
    }
}

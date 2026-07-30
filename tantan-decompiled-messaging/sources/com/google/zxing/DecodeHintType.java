package com.google.zxing;

import java.util.List;
import p149l.qxc0;

/* JADX INFO: loaded from: classes7.dex */
public enum DecodeHintType {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(qxc0.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);

    private final Class<?> valueType;

    DecodeHintType(Class cls) {
        this.valueType = cls;
    }

    public Class<?> getValueType() {
        return this.valueType;
    }
}

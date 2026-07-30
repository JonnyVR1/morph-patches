package com.google.zxing.multi.qrcode;

import com.google.zxing.ResultMetadataType;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import p149l.oxc0;

/* JADX INFO: loaded from: classes7.dex */
final class QRCodeMultiReader$SAComparator implements Serializable, Comparator<oxc0> {
    private QRCodeMultiReader$SAComparator() {
    }

    @Override // java.util.Comparator
    public int compare(oxc0 oxc0Var, oxc0 oxc0Var2) {
        Map<ResultMetadataType, Object> mapM166530d = oxc0Var.m166530d();
        ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
        return Integer.compare(((Integer) mapM166530d.get(resultMetadataType)).intValue(), ((Integer) oxc0Var2.m166530d().get(resultMetadataType)).intValue());
    }
}

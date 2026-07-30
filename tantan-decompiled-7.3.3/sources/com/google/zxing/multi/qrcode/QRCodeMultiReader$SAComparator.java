package com.google.zxing.multi.qrcode;

import com.google.zxing.ResultMetadataType;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import p153l.r5d0;

/* JADX INFO: loaded from: classes7.dex */
final class QRCodeMultiReader$SAComparator implements Serializable, Comparator<r5d0> {
    private QRCodeMultiReader$SAComparator() {
    }

    @Override // java.util.Comparator
    public int compare(r5d0 r5d0Var, r5d0 r5d0Var2) {
        Map<ResultMetadataType, Object> mapM179855d = r5d0Var.m179855d();
        ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
        return Integer.compare(((Integer) mapM179855d.get(resultMetadataType)).intValue(), ((Integer) r5d0Var2.m179855d().get(resultMetadataType)).intValue());
    }
}

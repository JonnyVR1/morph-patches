package com.google.zxing.multi.qrcode.detector;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.util.Comparator;
import p153l.ioi;

/* JADX INFO: loaded from: classes7.dex */
final class MultiFinderPatternFinder$ModuleSizeComparator implements Serializable, Comparator<ioi> {
    private MultiFinderPatternFinder$ModuleSizeComparator() {
    }

    @Override // java.util.Comparator
    public int compare(ioi ioiVar, ioi ioiVar2) {
        double dM141312i = ioiVar2.m141312i() - ioiVar.m141312i();
        if (dM141312i < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return -1;
        }
        return dM141312i > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : 0;
    }
}

package com.google.zxing.multi.qrcode.detector;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.util.Comparator;
import p149l.mli;

/* JADX INFO: loaded from: classes7.dex */
final class MultiFinderPatternFinder$ModuleSizeComparator implements Serializable, Comparator<mli> {
    private MultiFinderPatternFinder$ModuleSizeComparator() {
    }

    @Override // java.util.Comparator
    public int compare(mli mliVar, mli mliVar2) {
        double dM155151i = mliVar2.m155151i() - mliVar.m155151i();
        if (dM155151i < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return -1;
        }
        return dM155151i > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : 0;
    }
}

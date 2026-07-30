package org.spongycastle.util;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface Memoable {
    Memoable copy();

    void reset(Memoable memoable);
}

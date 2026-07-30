package com.tencent.cloud.p075ai.network.okio;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.p */
/* JADX INFO: loaded from: classes13.dex */
public final class C13787p extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final ByteString[] f56997a;

    public C13787p(ByteString[] byteStringArr) {
        this.f56997a = byteStringArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.f56997a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f56997a.length;
    }
}

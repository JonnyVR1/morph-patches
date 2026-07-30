package com.tencent.cloud.p080ai.network.okio;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.p */
/* JADX INFO: loaded from: classes12.dex */
public final class C13950p extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final ByteString[] f57845a;

    public C13950p(ByteString[] byteStringArr) {
        this.f57845a = byteStringArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.f57845a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57845a.length;
    }
}

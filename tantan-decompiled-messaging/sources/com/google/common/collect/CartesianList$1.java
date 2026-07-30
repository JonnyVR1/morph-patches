package com.google.common.collect;

import java.util.List;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
class CartesianList$1 extends ImmutableList<Object> {
    final /* synthetic */ C2967f this$0;
    final /* synthetic */ int val$index;

    public CartesianList$1(C2967f c2967f, int i) {
        this.val$index = i;
    }

    @Override // java.util.List
    public Object get(int i) {
        sf80.m183892n(i, size());
        return ((List) C2967f.m16256a(null).get(i)).get(C2967f.m16257c(null, this.val$index, i));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return C2967f.m16256a(null).size();
    }
}

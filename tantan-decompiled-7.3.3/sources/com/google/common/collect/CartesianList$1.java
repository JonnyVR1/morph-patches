package com.google.common.collect;

import java.util.List;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class CartesianList$1 extends ImmutableList<Object> {
    final /* synthetic */ C2990f this$0;
    final /* synthetic */ int val$index;

    public CartesianList$1(C2990f c2990f, int i) {
        this.val$index = i;
    }

    @Override // java.util.List
    public Object get(int i) {
        xn80.m212109n(i, size());
        return ((List) C2990f.m16310a(null).get(i)).get(C2990f.m16311c(null, this.val$index, i));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return C2990f.m16310a(null).size();
    }
}

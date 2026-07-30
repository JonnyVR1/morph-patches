package com.google.common.collect;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class Sets$CartesianSet$1 extends ImmutableList<List<Object>> {
    final /* synthetic */ ImmutableList val$axes;

    public Sets$CartesianSet$1(ImmutableList immutableList) {
        this.val$axes = immutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public List<Object> get(int i) {
        return ((ImmutableSet) this.val$axes.get(i)).asList();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.val$axes.size();
    }
}

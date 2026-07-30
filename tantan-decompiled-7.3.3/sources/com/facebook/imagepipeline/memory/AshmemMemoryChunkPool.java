package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import p153l.bj80;
import p153l.cj80;
import p153l.gqy;
import p153l.o11;
import p153l.w6e;

/* JADX INFO: loaded from: classes.dex */
@w6e
@TargetApi(27)
public class AshmemMemoryChunkPool extends AbstractC1642b {
    @w6e
    public AshmemMemoryChunkPool(gqy gqyVar, bj80 bj80Var, cj80 cj80Var) {
        super(gqyVar, bj80Var, cj80Var);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC1642b, com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public o11 mo8462g(int i) {
        return new o11(i);
    }
}

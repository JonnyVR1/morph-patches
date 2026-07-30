package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import p149l.h11;
import p149l.i5e;
import p149l.jhy;
import p149l.va80;
import p149l.wa80;

/* JADX INFO: loaded from: classes.dex */
@i5e
@TargetApi(27)
public class AshmemMemoryChunkPool extends AbstractC1619b {
    @i5e
    public AshmemMemoryChunkPool(jhy jhyVar, va80 va80Var, wa80 wa80Var) {
        super(jhyVar, va80Var, wa80Var);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC1619b, com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public h11 mo8408g(int i) {
        return new h11(i);
    }
}

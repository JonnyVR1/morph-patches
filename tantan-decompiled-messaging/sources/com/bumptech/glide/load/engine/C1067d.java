package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import p149l.l2e;
import p149l.px50;
import p149l.rze;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.d */
/* JADX INFO: loaded from: classes.dex */
class C1067d<DataType> implements l2e.InterfaceC18140b {

    /* JADX INFO: renamed from: a */
    private final rze<DataType> f4443a;

    /* JADX INFO: renamed from: b */
    private final DataType f4444b;

    /* JADX INFO: renamed from: c */
    private final px50 f4445c;

    public C1067d(rze<DataType> rzeVar, DataType datatype, px50 px50Var) {
        this.f4443a = rzeVar;
        this.f4444b = datatype;
        this.f4445c = px50Var;
    }

    @Override // p149l.l2e.InterfaceC18140b
    public boolean write(@NonNull File file) {
        return this.f4443a.mo98228a(this.f4444b, file, this.f4445c);
    }
}

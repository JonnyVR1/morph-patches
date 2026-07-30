package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import p153l.u560;
import p153l.v0f;
import p153l.z3e;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.d */
/* JADX INFO: loaded from: classes.dex */
class C1077d<DataType> implements z3e.InterfaceC21756b {

    /* JADX INFO: renamed from: a */
    private final v0f<DataType> f4454a;

    /* JADX INFO: renamed from: b */
    private final DataType f4455b;

    /* JADX INFO: renamed from: c */
    private final u560 f4456c;

    public C1077d(v0f<DataType> v0fVar, DataType datatype, u560 u560Var) {
        this.f4454a = v0fVar;
        this.f4455b = datatype;
        this.f4456c = u560Var;
    }

    @Override // p153l.z3e.InterfaceC21756b
    public boolean write(@NonNull File file) {
        return this.f4454a.mo99642a(this.f4455b, file, this.f4456c);
    }
}

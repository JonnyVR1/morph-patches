package com.vivo.push.p111b;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C14542h extends AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private String f60916a;

    public C14542h() {
        super(2013);
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        c14532a.m84716a("MsgArriveCommand.MSG_TAG", this.f60916a);
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        this.f60916a = c14532a.m84712a("MsgArriveCommand.MSG_TAG");
    }

    public C14542h(String str) {
        this();
        this.f60916a = str;
    }
}

package com.vivo.push.p116b;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C14690h extends AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private String f61763a;

    public C14690h() {
        super(2013);
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        c14680a.m85887a("MsgArriveCommand.MSG_TAG", this.f61763a);
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        this.f61763a = c14680a.m85883a("MsgArriveCommand.MSG_TAG");
    }

    public C14690h(String str) {
        this();
        this.f61763a = str;
    }
}

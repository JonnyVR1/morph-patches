package com.vivo.push.p116b;

import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14704v extends C14701s {

    /* JADX INFO: renamed from: a */
    private String f61789a;

    /* JADX INFO: renamed from: b */
    private long f61790b;

    public AbstractC14704v(int i) {
        super(i);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85887a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f61789a);
        c14680a.m85885a("notify_id", this.f61790b);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61789a = c14680a.m85883a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.f61790b = c14680a.m85892b("notify_id", -1L);
    }

    /* JADX INFO: renamed from: f */
    public final long m85951f() {
        return this.f61790b;
    }

    /* JADX INFO: renamed from: i */
    public final String m85952i() {
        return this.f61789a;
    }
}

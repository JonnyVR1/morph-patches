package com.vivo.push.p111b;

import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14556v extends C14553s {

    /* JADX INFO: renamed from: a */
    private String f60942a;

    /* JADX INFO: renamed from: b */
    private long f60943b;

    public AbstractC14556v(int i) {
        super(i);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84716a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f60942a);
        c14532a.m84714a("notify_id", this.f60943b);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60942a = c14532a.m84712a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.f60943b = c14532a.m84721b("notify_id", -1L);
    }

    /* JADX INFO: renamed from: f */
    public final long m84780f() {
        return this.f60943b;
    }

    /* JADX INFO: renamed from: i */
    public final String m84781i() {
        return this.f60942a;
    }
}

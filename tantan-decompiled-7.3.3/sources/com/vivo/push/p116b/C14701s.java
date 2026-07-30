package com.vivo.push.p116b;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.s */
/* JADX INFO: loaded from: classes2.dex */
public class C14701s extends AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private String f61783a;

    /* JADX INFO: renamed from: b */
    private int f61784b;

    public C14701s(int i) {
        super(i);
        this.f61783a = null;
        this.f61784b = 0;
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public void mo85914c(C14680a c14680a) {
        c14680a.m85887a("req_id", this.f61783a);
        c14680a.m85884a("status_msg_code", this.f61784b);
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public void mo85915d(C14680a c14680a) {
        this.f61783a = c14680a.m85883a("req_id");
        this.f61784b = c14680a.m85891b("status_msg_code", this.f61784b);
    }

    /* JADX INFO: renamed from: g */
    public final String m85945g() {
        return this.f61783a;
    }

    /* JADX INFO: renamed from: h */
    public final int m85946h() {
        return this.f61784b;
    }

    @Override // com.vivo.push.AbstractC14769o
    public String toString() {
        return "OnReceiveCommand";
    }
}

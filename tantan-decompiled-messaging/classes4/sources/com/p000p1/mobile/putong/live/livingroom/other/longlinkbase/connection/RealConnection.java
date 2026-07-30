package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.io.IOException;
import java.net.Socket;
import okio.Buffer;
import p002l.bi2;
import p002l.lec0;
import p002l.tul;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RealConnection extends bi2 {

    /* JADX INFO: renamed from: d */
    public lec0 f7260d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0476a.a f7261e;

    /* JADX INFO: renamed from: f */
    public int f7262f;

    public static class LongLinkConnectErrorException extends RuntimeException {
        public LongLinkConnectErrorException(String str, Throwable th) {
            super(str, th);
        }
    }

    public RealConnection(lec0 lec0Var, InterfaceC0476a.a aVar) {
        this.f7260d = lec0Var;
        this.f7261e = aVar;
        m9142n(new tul.C0847i(lec0Var.m17151g(), aVar));
    }

    @Override // p002l.bi2, com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo9132a() {
        if (super.mo9132a()) {
            m9140l();
        }
        return true;
    }

    @Override // p002l.bi2, com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    /* JADX INFO: renamed from: b */
    public void mo9133b(Buffer buffer) throws IOException {
        if (buffer == null) {
            mo9139k("write drop the the buffer is null");
        } else {
            super.mo9133b(buffer);
        }
    }

    @Override // p002l.bi2
    /* JADX INFO: renamed from: d */
    public Socket mo9134d() throws Exception {
        lec0 lec0Var;
        if (this.f7261e == null || (lec0Var = this.f7260d) == null) {
            return null;
        }
        return lec0Var.m17161q().mo14854a(this.f7261e.mo9145a());
    }

    @Override // p002l.bi2
    /* JADX INFO: renamed from: g */
    public void mo9135g(Throwable th) {
        this.f7260d.m17157m().mo26979b(new LongLinkConnectErrorException("connect error, clientIp" + this.f7261e.mo9146b() + ", net status:" + ConnectivityReceiver.g(), th));
        this.f7260d.m17153i().mo9786a(th);
        m9142n(new tul.C0841c(this.f7260d.m17151g(), this.f7261e, th));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    public int getCurrentState() {
        return this.f7262f;
    }

    @Override // p002l.bi2
    /* JADX INFO: renamed from: h */
    public void mo9136h() {
        m9142n(new tul.C0842d(this.f7260d.m17151g(), this.f7261e));
    }

    @Override // p002l.bi2
    /* JADX INFO: renamed from: i */
    public void mo9137i() {
        m9142n(new tul.C0843e(this.f7260d.m17151g(), this.f7261e));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC0476a
    public boolean isConnected() {
        int i = this.f7262f;
        return i == 3 || i == 6;
    }

    @Override // p002l.bi2
    /* JADX INFO: renamed from: j */
    public void mo9138j() {
        m9142n(new tul.C0844f(this.f7260d.m17151g(), this.f7261e));
    }

    @Override // p002l.bi2
    /* JADX INFO: renamed from: k */
    public void mo9139k(String str) {
        this.f7260d.m17157m().mo26979b(new RuntimeException("onWarn:" + str));
    }

    /* JADX INFO: renamed from: l */
    public final void m9140l() {
        try {
            this.f7260d.m17147c().mo9123b(this.f7260d);
            m9142n(new tul.C0840b(this.f7260d.m17151g(), this.f7261e));
        } catch (Auth.AuthException e) {
            m9142n(new tul.C0839a(this.f7260d.m17151g(), this.f7261e, e));
        }
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC0476a.a m9141m() {
        return this.f7261e;
    }

    /* JADX INFO: renamed from: n */
    public final void m9142n(tul tulVar) {
        this.f7262f = tulVar.m23176e();
        tulVar.m23172a();
    }

    /* JADX INFO: renamed from: o */
    public void m9143o(InterfaceC0476a.a aVar) {
        this.f7261e = aVar;
    }
}

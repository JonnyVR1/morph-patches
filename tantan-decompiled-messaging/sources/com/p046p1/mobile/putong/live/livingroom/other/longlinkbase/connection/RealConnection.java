package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection;

import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.io.IOException;
import java.net.Socket;
import okio.Buffer;
import p149l.bi2;
import p149l.lec0;
import p149l.tul;

/* JADX INFO: loaded from: classes4.dex */
public class RealConnection extends bi2 {

    /* JADX INFO: renamed from: d */
    public lec0 f51218d;

    /* JADX INFO: renamed from: e */
    public InterfaceC12887a.a f51219e;

    /* JADX INFO: renamed from: f */
    public int f51220f;

    public static class LongLinkConnectErrorException extends RuntimeException {
        public LongLinkConnectErrorException(String str, Throwable th) {
            super(str, th);
        }
    }

    public RealConnection(lec0 lec0Var, InterfaceC12887a.a aVar) {
        this.f51218d = lec0Var;
        this.f51219e = aVar;
        m75507n(new tul.C20290i(lec0Var.m149493g(), aVar));
    }

    @Override // p149l.bi2, com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo75497a() {
        if (super.mo75497a()) {
            m75505l();
        }
        return true;
    }

    @Override // p149l.bi2, com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    /* JADX INFO: renamed from: b */
    public void mo75498b(Buffer buffer) throws IOException {
        if (buffer == null) {
            mo75504k("write drop the the buffer is null");
        } else {
            super.mo75498b(buffer);
        }
    }

    @Override // p149l.bi2
    /* JADX INFO: renamed from: d */
    public Socket mo75499d() throws Exception {
        lec0 lec0Var;
        if (this.f51219e == null || (lec0Var = this.f51218d) == null) {
            return null;
        }
        return lec0Var.m149503q().mo133186a(this.f51219e.mo75510a());
    }

    @Override // p149l.bi2
    /* JADX INFO: renamed from: g */
    public void mo75500g(Throwable th) {
        this.f51218d.m149499m().mo216486b(new LongLinkConnectErrorException("connect error, clientIp" + this.f51219e.mo75511b() + ", net status:" + ConnectivityReceiver.m81284g(), th));
        this.f51218d.m149495i().mo96775a(th);
        m75507n(new tul.C20284c(this.f51218d.m149493g(), this.f51219e, th));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    public int getCurrentState() {
        return this.f51220f;
    }

    @Override // p149l.bi2
    /* JADX INFO: renamed from: h */
    public void mo75501h() {
        m75507n(new tul.C20285d(this.f51218d.m149493g(), this.f51219e));
    }

    @Override // p149l.bi2
    /* JADX INFO: renamed from: i */
    public void mo75502i() {
        m75507n(new tul.C20286e(this.f51218d.m149493g(), this.f51219e));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC12887a
    public boolean isConnected() {
        int i = this.f51220f;
        return i == 3 || i == 6;
    }

    @Override // p149l.bi2
    /* JADX INFO: renamed from: j */
    public void mo75503j() {
        m75507n(new tul.C20287f(this.f51218d.m149493g(), this.f51219e));
    }

    @Override // p149l.bi2
    /* JADX INFO: renamed from: k */
    public void mo75504k(String str) {
        this.f51218d.m149499m().mo216486b(new RuntimeException("onWarn:" + str));
    }

    /* JADX INFO: renamed from: l */
    public final void m75505l() {
        try {
            this.f51218d.m149489c().mo75488b(this.f51218d);
            m75507n(new tul.C20283b(this.f51218d.m149493g(), this.f51219e));
        } catch (Auth.AuthException e) {
            m75507n(new tul.C20282a(this.f51218d.m149493g(), this.f51219e, e));
        }
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC12887a.a m75506m() {
        return this.f51219e;
    }

    /* JADX INFO: renamed from: n */
    public final void m75507n(tul tulVar) {
        this.f51220f = tulVar.m190710e();
        tulVar.m190706a();
    }

    /* JADX INFO: renamed from: o */
    public void m75508o(InterfaceC12887a.a aVar) {
        this.f51219e = aVar;
    }
}

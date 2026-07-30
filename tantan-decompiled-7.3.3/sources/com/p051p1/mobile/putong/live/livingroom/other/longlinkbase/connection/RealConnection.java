package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection;

import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.io.IOException;
import java.net.Socket;
import okio.Buffer;
import p153l.gxl;
import p153l.ii2;
import p153l.smc0;

/* JADX INFO: loaded from: classes5.dex */
public class RealConnection extends ii2 {

    /* JADX INFO: renamed from: d */
    public smc0 f52066d;

    /* JADX INFO: renamed from: e */
    public InterfaceC13050a.a f52067e;

    /* JADX INFO: renamed from: f */
    public int f52068f;

    public static class LongLinkConnectErrorException extends RuntimeException {
        public LongLinkConnectErrorException(String str, Throwable th) {
            super(str, th);
        }
    }

    public RealConnection(smc0 smc0Var, InterfaceC13050a.a aVar) {
        this.f52066d = smc0Var;
        this.f52067e = aVar;
        m76690n(new gxl.C17343i(smc0Var.m186789g(), aVar));
    }

    @Override // p153l.ii2, com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo76680a() {
        if (super.mo76680a()) {
            m76688l();
        }
        return true;
    }

    @Override // p153l.ii2, com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    /* JADX INFO: renamed from: b */
    public void mo76681b(Buffer buffer) throws IOException {
        if (buffer == null) {
            mo76687k("write drop the the buffer is null");
        } else {
            super.mo76681b(buffer);
        }
    }

    @Override // p153l.ii2
    /* JADX INFO: renamed from: d */
    public Socket mo76682d() throws Exception {
        smc0 smc0Var;
        if (this.f52067e == null || (smc0Var = this.f52066d) == null) {
            return null;
        }
        return smc0Var.m186799q().mo156386a(this.f52067e.mo76693a());
    }

    @Override // p153l.ii2
    /* JADX INFO: renamed from: g */
    public void mo76683g(Throwable th) {
        this.f52066d.m186795m().mo204127b(new LongLinkConnectErrorException("connect error, clientIp" + this.f52067e.mo76694b() + ", net status:" + ConnectivityReceiver.m82467g(), th));
        this.f52066d.m186791i().mo135096a(th);
        m76690n(new gxl.C17337c(this.f52066d.m186789g(), this.f52067e, th));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    public int getCurrentState() {
        return this.f52068f;
    }

    @Override // p153l.ii2
    /* JADX INFO: renamed from: h */
    public void mo76684h() {
        m76690n(new gxl.C17338d(this.f52066d.m186789g(), this.f52067e));
    }

    @Override // p153l.ii2
    /* JADX INFO: renamed from: i */
    public void mo76685i() {
        m76690n(new gxl.C17339e(this.f52066d.m186789g(), this.f52067e));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.InterfaceC13050a
    public boolean isConnected() {
        int i = this.f52068f;
        return i == 3 || i == 6;
    }

    @Override // p153l.ii2
    /* JADX INFO: renamed from: j */
    public void mo76686j() {
        m76690n(new gxl.C17340f(this.f52066d.m186789g(), this.f52067e));
    }

    @Override // p153l.ii2
    /* JADX INFO: renamed from: k */
    public void mo76687k(String str) {
        this.f52066d.m186795m().mo204127b(new RuntimeException("onWarn:" + str));
    }

    /* JADX INFO: renamed from: l */
    public final void m76688l() {
        try {
            this.f52066d.m186785c().mo76671b(this.f52066d);
            m76690n(new gxl.C17336b(this.f52066d.m186789g(), this.f52067e));
        } catch (Auth.AuthException e) {
            m76690n(new gxl.C17335a(this.f52066d.m186789g(), this.f52067e, e));
        }
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC13050a.a m76689m() {
        return this.f52067e;
    }

    /* JADX INFO: renamed from: n */
    public final void m76690n(gxl gxlVar) {
        this.f52068f = gxlVar.m132880e();
        gxlVar.m132876a();
    }

    /* JADX INFO: renamed from: o */
    public void m76691o(InterfaceC13050a.a aVar) {
        this.f52067e = aVar;
    }
}

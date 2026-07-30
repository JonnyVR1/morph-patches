package p153l;

import okio.ByteString;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class yqg0 extends ksp0 {

    /* JADX INFO: renamed from: a */
    public boolean f201213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qug0 f201214b;

    public yqg0(qug0 qug0Var) {
        this.f201214b = qug0Var;
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: a */
    public final void mo151272a(hsp0 hsp0Var, int i, String str) {
        super.mo151272a(hsp0Var, i, str);
        LogUtils.file("SudGIPWebSocket", "===> onClosed： code:" + i + " reason:" + str);
        SudLogger.m222811d(this.f201214b.f159573a, "===> onClosed： code:" + i + " reason:" + str);
        this.f201214b.f159579g.post(new Runnable() { // from class: l.mqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f138054a.m217130g();
            }
        });
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: b */
    public final void mo151273b(hsp0 hsp0Var, int i, String str) {
        super.mo151273b(hsp0Var, i, str);
        hsp0Var.close(i, str);
        LogUtils.file("SudGIPWebSocket", "===> onClosing： code:" + i + " reason:" + str);
        SudLogger.m222811d(this.f201214b.f159573a, "===> onClosing： code:" + i + " reason:" + str);
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: c */
    public final void mo151274c(hsp0 hsp0Var, Throwable th, i5d0 i5d0Var) {
        super.mo151274c(hsp0Var, th, i5d0Var);
        StringBuilder sb = new StringBuilder("===> onFailure： Throwable:");
        sb.append(th.getMessage());
        sb.append(" Response:");
        sb.append(i5d0Var == null ? "null" : i5d0Var.toString());
        LogUtils.file("SudGIPWebSocket", sb.toString());
        String str = this.f201214b.f159573a;
        StringBuilder sb2 = new StringBuilder("===> onFailure： Throwable:");
        sb2.append(th.getMessage());
        sb2.append(" Response:");
        sb2.append(i5d0Var != null ? i5d0Var.toString() : "null");
        SudLogger.m222811d(str, sb2.toString());
        this.f201214b.f159579g.post(new Runnable() { // from class: l.hqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f111126a.m217132i();
            }
        });
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: e */
    public final void mo151276e(hsp0 hsp0Var, ByteString byteString) {
        super.mo151276e(hsp0Var, byteString);
        final byte[] byteArray = byteString.toByteArray();
        this.f201214b.f159579g.post(new Runnable() { // from class: l.kqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128225a.m217131h(byteArray);
            }
        });
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: f */
    public final void mo151277f(hsp0 hsp0Var, i5d0 i5d0Var) {
        super.mo151277f(hsp0Var, i5d0Var);
        SudLogger.m222811d(this.f201214b.f159573a, "websocket onOpen");
        LogUtils.file("SudGIPWebSocket", "websocket onOpen");
    }

    /* JADX INFO: renamed from: g */
    public final void m217130g() {
        if (this.f201213a) {
            return;
        }
        this.f201213a = true;
        SudLogger.m222811d(this.f201214b.f159573a, "reconnect mWebSocket:" + this.f201214b.f159580h);
        LogUtils.file("SudGIPWebSocket", "reconnect mWebSocket:" + this.f201214b.f159580h);
        qug0 qug0Var = this.f201214b;
        if (qug0Var.f159580h == null) {
            return;
        }
        qug0Var.f159580h = null;
        qug0Var.m178150b(1000L);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m217131h(byte[] bArr) {
        try {
            this.f201214b.m178151c(bArr);
        } catch (Exception e) {
            LogUtils.file("SudGIPWebSocket", "WebSocket解析数据发生了异常：" + LogUtils.getErrorInfo(e));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m217132i() {
        if (this.f201213a) {
            return;
        }
        this.f201213a = true;
        SudLogger.m222811d(this.f201214b.f159573a, "reconnect mWebSocket:" + this.f201214b.f159580h);
        LogUtils.file("SudGIPWebSocket", "reconnect mWebSocket:" + this.f201214b.f159580h);
        qug0 qug0Var = this.f201214b;
        if (qug0Var.f159580h == null) {
            return;
        }
        qug0Var.f159580h = null;
        qug0Var.m178150b(1000L);
    }
}

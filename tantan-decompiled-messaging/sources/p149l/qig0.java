package p149l;

import okio.ByteString;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qig0 extends gjp0 {

    /* JADX INFO: renamed from: a */
    public boolean f154768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ img0 f154769b;

    public qig0(img0 img0Var) {
        this.f154769b = img0Var;
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: a */
    public final void mo126548a(cjp0 cjp0Var, int i, String str) {
        super.mo126548a(cjp0Var, i, str);
        LogUtils.file("SudGIPWebSocket", "===> onClosed： code:" + i + " reason:" + str);
        SudLogger.m221565d(this.f154769b.f113927a, "===> onClosed： code:" + i + " reason:" + str);
        this.f154769b.f113933g.post(new Runnable() { // from class: l.eig0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91603a.m174876g();
            }
        });
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: b */
    public final void mo126549b(cjp0 cjp0Var, int i, String str) {
        super.mo126549b(cjp0Var, i, str);
        cjp0Var.close(i, str);
        LogUtils.file("SudGIPWebSocket", "===> onClosing： code:" + i + " reason:" + str);
        SudLogger.m221565d(this.f154769b.f113927a, "===> onClosing： code:" + i + " reason:" + str);
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: c */
    public final void mo126550c(cjp0 cjp0Var, Throwable th, exc0 exc0Var) {
        super.mo126550c(cjp0Var, th, exc0Var);
        StringBuilder sb = new StringBuilder("===> onFailure： Throwable:");
        sb.append(th.getMessage());
        sb.append(" Response:");
        sb.append(exc0Var == null ? "null" : exc0Var.toString());
        LogUtils.file("SudGIPWebSocket", sb.toString());
        String str = this.f154769b.f113927a;
        StringBuilder sb2 = new StringBuilder("===> onFailure： Throwable:");
        sb2.append(th.getMessage());
        sb2.append(" Response:");
        sb2.append(exc0Var != null ? exc0Var.toString() : "null");
        SudLogger.m221565d(str, sb2.toString());
        this.f154769b.f113933g.post(new Runnable() { // from class: l.zhg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f203168a.m174878i();
            }
        });
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: e */
    public final void mo126552e(cjp0 cjp0Var, ByteString byteString) {
        super.mo126552e(cjp0Var, byteString);
        final byte[] byteArray = byteString.toByteArray();
        this.f154769b.f113933g.post(new Runnable() { // from class: l.cig0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81086a.m174877h(byteArray);
            }
        });
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: f */
    public final void mo126553f(cjp0 cjp0Var, exc0 exc0Var) {
        super.mo126553f(cjp0Var, exc0Var);
        SudLogger.m221565d(this.f154769b.f113927a, "websocket onOpen");
        LogUtils.file("SudGIPWebSocket", "websocket onOpen");
    }

    /* JADX INFO: renamed from: g */
    public final void m174876g() {
        if (this.f154768a) {
            return;
        }
        this.f154768a = true;
        SudLogger.m221565d(this.f154769b.f113927a, "reconnect mWebSocket:" + this.f154769b.f113934h);
        LogUtils.file("SudGIPWebSocket", "reconnect mWebSocket:" + this.f154769b.f113934h);
        img0 img0Var = this.f154769b;
        if (img0Var.f113934h == null) {
            return;
        }
        img0Var.f113934h = null;
        img0Var.m137077b(1000L);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m174877h(byte[] bArr) {
        try {
            this.f154769b.m137078c(bArr);
        } catch (Exception e) {
            LogUtils.file("SudGIPWebSocket", "WebSocket解析数据发生了异常：" + LogUtils.getErrorInfo(e));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m174878i() {
        if (this.f154768a) {
            return;
        }
        this.f154768a = true;
        SudLogger.m221565d(this.f154769b.f113927a, "reconnect mWebSocket:" + this.f154769b.f113934h);
        LogUtils.file("SudGIPWebSocket", "reconnect mWebSocket:" + this.f154769b.f113934h);
        img0 img0Var = this.f154769b;
        if (img0Var.f113934h == null) {
            return;
        }
        img0Var.f113934h = null;
        img0Var.m137077b(1000L);
    }
}

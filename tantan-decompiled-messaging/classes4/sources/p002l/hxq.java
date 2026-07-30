package p002l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import l.hfw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hxq extends bxm {

    /* JADX INFO: renamed from: b */
    public HandlerC0613a f12340b;

    /* JADX INFO: renamed from: c */
    public g3f f12341c;

    /* JADX INFO: renamed from: l.hxq$a */
    public static class HandlerC0613a extends Handler {

        /* JADX INFO: renamed from: a */
        public g3f f12342a;

        public HandlerC0613a(g3f g3fVar) {
            super(Looper.getMainLooper());
            this.f12342a = g3fVar;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            g3f g3fVar;
            super.dispatchMessage(message);
            if (message.what != 0 || (g3fVar = this.f12342a) == null) {
                return;
            }
            new tul.C0848j(g3fVar).m23172a();
        }
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        m14904g(vq4Var.mo18694b().m17151g());
        HandlerC0613a handlerC0613a = this.f12340b;
        if (handlerC0613a != null) {
            handlerC0613a.removeMessages(0);
        }
        if (vq4Var.mo18695c().m22194b().m24689h()) {
            return;
        }
        vq4Var.mo18693a(vq4Var.mo18695c());
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: b */
    public void mo9116b(vq4 vq4Var) throws Exception {
        m14904g(vq4Var.mo18694b().m17151g());
        this.f12340b.sendEmptyMessageDelayed(0, mo10705f() * 1000);
        vq4Var.mo18693a(vq4Var.mo18695c());
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: d */
    public void mo9118d() {
        super.mo9118d();
        hfw.a("[live][longlink]", "KeepAliveInterceptor onDisconnected");
        this.f12340b.removeMessages(0);
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: e */
    public synchronized void mo10636e() {
        HandlerC0613a handlerC0613a = this.f12340b;
        if (handlerC0613a != null) {
            handlerC0613a.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public int mo10705f() {
        return 40;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m14904g(g3f g3fVar) {
        try {
            if (this.f12341c == null && g3fVar != null) {
                this.f12341c = g3fVar;
            }
            if (this.f12340b == null) {
                this.f12340b = new HandlerC0613a(this.f12341c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

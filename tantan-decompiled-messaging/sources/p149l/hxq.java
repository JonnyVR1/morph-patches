package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public class hxq extends bxm {

    /* JADX INFO: renamed from: b */
    public HandlerC17428a f109907b;

    /* JADX INFO: renamed from: c */
    public g3f f109908c;

    /* JADX INFO: renamed from: l.hxq$a */
    public static class HandlerC17428a extends Handler {

        /* JADX INFO: renamed from: a */
        public g3f f109909a;

        public HandlerC17428a(g3f g3fVar) {
            super(Looper.getMainLooper());
            this.f109909a = g3fVar;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            g3f g3fVar;
            super.dispatchMessage(message);
            if (message.what != 0 || (g3fVar = this.f109909a) == null) {
                return;
            }
            new tul.C20291j(g3fVar).m190706a();
        }
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        m133367g(vq4Var.mo159106b().m149493g());
        HandlerC17428a handlerC17428a = this.f109907b;
        if (handlerC17428a != null) {
            handlerC17428a.removeMessages(0);
        }
        if (vq4Var.mo159107c().m182209b().m203668h()) {
            return;
        }
        vq4Var.mo159105a(vq4Var.mo159107c());
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: b */
    public void mo75481b(vq4 vq4Var) throws Exception {
        m133367g(vq4Var.mo159106b().m149493g());
        this.f109907b.sendEmptyMessageDelayed(0, mo104772f() * 1000);
        vq4Var.mo159105a(vq4Var.mo159107c());
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: d */
    public void mo75483d() {
        super.mo75483d();
        hfw.m130790a("[live][longlink]", "KeepAliveInterceptor onDisconnected");
        this.f109907b.removeMessages(0);
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: e */
    public synchronized void mo104317e() {
        HandlerC17428a handlerC17428a = this.f109907b;
        if (handlerC17428a != null) {
            handlerC17428a.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public int mo104772f() {
        return 40;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m133367g(g3f g3fVar) {
        try {
            if (this.f109908c == null && g3fVar != null) {
                this.f109908c = g3fVar;
            }
            if (this.f109907b == null) {
                this.f109907b = new HandlerC17428a(this.f109908c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

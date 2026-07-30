package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes5.dex */
public class hzq extends bzm {

    /* JADX INFO: renamed from: b */
    public HandlerC17605a f112284b;

    /* JADX INFO: renamed from: c */
    public l4f f112285c;

    /* JADX INFO: renamed from: l.hzq$a */
    public static class HandlerC17605a extends Handler {

        /* JADX INFO: renamed from: a */
        public l4f f112286a;

        public HandlerC17605a(l4f l4fVar) {
            super(Looper.getMainLooper());
            this.f112286a = l4fVar;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            l4f l4fVar;
            super.dispatchMessage(message);
            if (message.what != 0 || (l4fVar = this.f112286a) == null) {
                return;
            }
            new gxl.C17344j(l4fVar).m132876a();
        }
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        m137916g(ur4Var.mo196643b().m186789g());
        HandlerC17605a handlerC17605a = this.f112284b;
        if (handlerC17605a != null) {
            handlerC17605a.removeMessages(0);
        }
        if (ur4Var.mo196644c().m215136b().m127320h()) {
            return;
        }
        ur4Var.mo196642a(ur4Var.mo196644c());
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: b */
    public void mo76664b(ur4 ur4Var) throws Exception {
        m137916g(ur4Var.mo196643b().m186789g());
        this.f112284b.sendEmptyMessageDelayed(0, mo113734f() * 1000);
        ur4Var.mo196642a(ur4Var.mo196644c());
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: d */
    public void mo76666d() {
        super.mo76666d();
        fhw.m125605a("[live][longlink]", "KeepAliveInterceptor onDisconnected");
        this.f112284b.removeMessages(0);
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: e */
    public synchronized void mo107179e() {
        HandlerC17605a handlerC17605a = this.f112284b;
        if (handlerC17605a != null) {
            handlerC17605a.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public int mo113734f() {
        return 40;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m137916g(l4f l4fVar) {
        try {
            if (this.f112285c == null && l4fVar != null) {
                this.f112285c = l4fVar;
            }
            if (this.f112284b == null) {
                this.f112284b = new HandlerC17605a(this.f112285c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

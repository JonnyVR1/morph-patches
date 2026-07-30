package p153l;

import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public final class n2s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o2s0 f139891a;

    public n2s0(o2s0 o2s0Var) {
        this.f139891a = o2s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f139891a.f144782n) {
            if (this.f139891a.f144783o) {
                return;
            }
            this.f139891a.f144783o = true;
            try {
                o2s0.m165752n(this.f139891a);
            } catch (Exception e) {
                this.f139891a.f144774f.m201302c(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_LOADING, -1L, e);
            }
            synchronized (this.f139891a.f144782n) {
                this.f139891a.f144783o = false;
            }
        }
    }
}

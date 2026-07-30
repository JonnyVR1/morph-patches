package p149l;

import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public final class htr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ itr0 f109445a;

    public htr0(itr0 itr0Var) {
        this.f109445a = itr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f109445a.f114925n) {
            if (this.f109445a.f114926o) {
                return;
            }
            this.f109445a.f114926o = true;
            try {
                itr0.m138243n(this.f109445a);
            } catch (Exception e) {
                this.f109445a.f114917f.m167827c(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_LOADING, -1L, e);
            }
            synchronized (this.f109445a.f114925n) {
                this.f109445a.f114926o = false;
            }
        }
    }
}

package p153l;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class fwx0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final Handler f101222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mwx0 f101223b;

    public fwx0(mwx0 mwx0Var, Handler handler) {
        this.f101223b = mwx0Var;
        this.f101222a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.f101222a.post(new Runnable() { // from class: l.awx0
            @Override // java.lang.Runnable
            public final void run() {
                mwx0.m160603c(this.f73802a.f101223b, i);
            }
        });
    }
}

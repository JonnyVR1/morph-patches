package p149l;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class zmx0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final Handler f203904a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnx0 f203905b;

    public zmx0(gnx0 gnx0Var, Handler handler) {
        this.f203905b = gnx0Var;
        this.f203904a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.f203904a.post(new Runnable() { // from class: l.umx0
            @Override // java.lang.Runnable
            public final void run() {
                gnx0.m127196c(this.f177325a.f203905b, i);
            }
        });
    }
}

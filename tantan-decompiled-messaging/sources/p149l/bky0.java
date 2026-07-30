package p149l;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class bky0 {

    /* JADX INFO: renamed from: a */
    public final Handler f76148a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b */
    public final AudioTrack$StreamEventCallback f76149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dky0 f76150c;

    public bky0(dky0 dky0Var) {
        this.f76150c = dky0Var;
        this.f76149b = new aky0(this, dky0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m102505a(AudioTrack audioTrack) {
        final Handler handler = this.f76148a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: l.hjy0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f76149b);
    }

    /* JADX INFO: renamed from: b */
    public final void m102506b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f76149b);
        this.f76148a.removeCallbacksAndMessages(null);
    }
}

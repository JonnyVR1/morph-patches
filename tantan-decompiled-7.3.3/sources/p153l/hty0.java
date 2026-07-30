package p153l;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class hty0 {

    /* JADX INFO: renamed from: a */
    public final Handler f111608a = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: b */
    public final AudioTrack$StreamEventCallback f111609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jty0 f111610c;

    public hty0(jty0 jty0Var) {
        this.f111610c = jty0Var;
        this.f111609b = new gty0(this, jty0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m137102a(AudioTrack audioTrack) {
        final Handler handler = this.f111608a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: l.nsy0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f111609b);
    }

    /* JADX INFO: renamed from: b */
    public final void m137103b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f111609b);
        this.f111608a.removeCallbacksAndMessages(null);
    }
}

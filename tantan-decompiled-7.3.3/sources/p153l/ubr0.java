package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes6.dex */
public final class ubr0 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f */
    public static final ubr0 f178349f = new ubr0();

    /* JADX INFO: renamed from: a */
    public volatile long f178350a = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final Handler f178351b;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f178352c;

    /* JADX INFO: renamed from: d */
    public Choreographer f178353d;

    /* JADX INFO: renamed from: e */
    public int f178354e;

    public ubr0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f178352c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f178351b = handler;
        handler.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: a */
    public static ubr0 m195292a() {
        return f178349f;
    }

    /* JADX INFO: renamed from: b */
    public final void m195293b() {
        this.f178351b.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: c */
    public final void m195294c() {
        this.f178351b.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f178350a = j;
        Choreographer choreographer = this.f178353d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.f178353d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                y4w0.m214279g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.f178353d;
            if (choreographer != null) {
                int i2 = this.f178354e + 1;
                this.f178354e = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f178353d;
        if (choreographer2 != null) {
            int i3 = this.f178354e - 1;
            this.f178354e = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f178350a = -9223372036854775807L;
            }
        }
        return true;
    }
}

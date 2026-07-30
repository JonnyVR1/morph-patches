package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes6.dex */
public final class o2r0 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f */
    public static final o2r0 f141546f = new o2r0();

    /* JADX INFO: renamed from: a */
    public volatile long f141547a = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final Handler f141548b;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f141549c;

    /* JADX INFO: renamed from: d */
    public Choreographer f141550d;

    /* JADX INFO: renamed from: e */
    public int f141551e;

    public o2r0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f141549c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f141548b = handler;
        handler.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: a */
    public static o2r0 m162318a() {
        return f141546f;
    }

    /* JADX INFO: renamed from: b */
    public final void m162319b() {
        this.f141548b.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: c */
    public final void m162320c() {
        this.f141548b.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f141547a = j;
        Choreographer choreographer = this.f141550d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.f141550d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                svv0.m186112g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.f141550d;
            if (choreographer != null) {
                int i2 = this.f141551e + 1;
                this.f141551e = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f141550d;
        if (choreographer2 != null) {
            int i3 = this.f141551e - 1;
            this.f141551e = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f141547a = -9223372036854775807L;
            }
        }
        return true;
    }
}

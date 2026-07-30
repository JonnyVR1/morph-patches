package tv.danmaku.ijk.media.streamer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class LoopLogReporter {

    /* JADX INFO: renamed from: a */
    protected int f12065a = 1000;

    /* JADX INFO: renamed from: b */
    private int f12066b = 30;

    /* JADX INFO: renamed from: c */
    private boolean f12067c = true;

    /* JADX INFO: renamed from: d */
    private boolean f12068d = true;

    /* JADX INFO: renamed from: e */
    protected ArrayList<String> f12069e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    HandlerThread f12070f;

    /* JADX INFO: renamed from: g */
    Handler f12071g;

    public class LogHandler extends Handler {
        public LogHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (LoopLogReporter.this.f12067c && !LoopLogReporter.this.f12068d && message.what == 90) {
                LoopLogReporter.this.mo10834c();
                removeMessages(90);
                sendEmptyMessageDelayed(90, LoopLogReporter.this.f12065a);
            }
        }
    }

    public LoopLogReporter() {
        this.f12070f = null;
        this.f12071g = null;
        HandlerThread handlerThread = new HandlerThread("loopReportCmdHandle", -4);
        this.f12070f = handlerThread;
        handlerThread.start();
        this.f12071g = new LogHandler(this.f12070f.getLooper());
    }

    /* JADX INFO: renamed from: c */
    public void mo10834c() {
        ArrayList<String> arrayList = this.f12069e;
        if (arrayList == null || arrayList.size() < this.f12066b) {
            return;
        }
        mo10835d();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo10835d();

    /* JADX INFO: renamed from: e */
    public void m10839e(boolean z) {
        this.f12067c = z;
        if (z) {
            return;
        }
        this.f12071g.removeMessages(90);
    }

    /* JADX INFO: renamed from: f */
    public void m10840f(int i) {
        if (i <= 0) {
            return;
        }
        this.f12065a = i;
    }

    /* JADX INFO: renamed from: g */
    public void m10841g(int i) {
        if (i <= 0) {
            return;
        }
        this.f12066b = i;
    }

    /* JADX INFO: renamed from: h */
    public void m10842h() {
        if (this.f12067c) {
            this.f12068d = false;
            this.f12071g.removeCallbacksAndMessages(null);
            this.f12071g.sendEmptyMessageDelayed(90, this.f12065a);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo10836i() {
        this.f12068d = true;
        if (this.f12067c) {
            this.f12071g.removeCallbacksAndMessages(null);
            this.f12070f.quit();
            mo10835d();
        }
    }
}

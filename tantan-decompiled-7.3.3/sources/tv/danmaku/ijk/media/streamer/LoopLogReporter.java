package tv.danmaku.ijk.media.streamer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LoopLogReporter {

    /* JADX INFO: renamed from: a */
    protected int f209362a = 1000;

    /* JADX INFO: renamed from: b */
    private int f209363b = 30;

    /* JADX INFO: renamed from: c */
    private boolean f209364c = true;

    /* JADX INFO: renamed from: d */
    private boolean f209365d = true;

    /* JADX INFO: renamed from: e */
    protected ArrayList<String> f209366e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    HandlerThread f209367f;

    /* JADX INFO: renamed from: g */
    Handler f209368g;

    public class LogHandler extends Handler {
        public LogHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (LoopLogReporter.this.f209364c && !LoopLogReporter.this.f209365d && message.what == 90) {
                LoopLogReporter.this.mo223609c();
                removeMessages(90);
                sendEmptyMessageDelayed(90, LoopLogReporter.this.f209362a);
            }
        }
    }

    public LoopLogReporter() {
        this.f209367f = null;
        this.f209368g = null;
        HandlerThread handlerThread = new HandlerThread("loopReportCmdHandle", -4);
        this.f209367f = handlerThread;
        handlerThread.start();
        this.f209368g = new LogHandler(this.f209367f.getLooper());
    }

    /* JADX INFO: renamed from: c */
    public void mo223609c() {
        ArrayList<String> arrayList = this.f209366e;
        if (arrayList == null || arrayList.size() < this.f209363b) {
            return;
        }
        mo223610d();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo223610d();

    /* JADX INFO: renamed from: e */
    public void m223614e(boolean z) {
        this.f209364c = z;
        if (z) {
            return;
        }
        this.f209368g.removeMessages(90);
    }

    /* JADX INFO: renamed from: f */
    public void m223615f(int i) {
        if (i <= 0) {
            return;
        }
        this.f209362a = i;
    }

    /* JADX INFO: renamed from: g */
    public void m223616g(int i) {
        if (i <= 0) {
            return;
        }
        this.f209363b = i;
    }

    /* JADX INFO: renamed from: h */
    public void m223617h() {
        if (this.f209364c) {
            this.f209365d = false;
            this.f209368g.removeCallbacksAndMessages(null);
            this.f209368g.sendEmptyMessageDelayed(90, this.f209362a);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo223611i() {
        this.f209365d = true;
        if (this.f209364c) {
            this.f209368g.removeCallbacksAndMessages(null);
            this.f209367f.quit();
            mo223610d();
        }
    }
}

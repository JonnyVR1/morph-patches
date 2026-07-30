package tv.danmaku.ijk.media.streamer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LoopLogReporter {

    /* JADX INFO: renamed from: a */
    protected int f208440a = 1000;

    /* JADX INFO: renamed from: b */
    private int f208441b = 30;

    /* JADX INFO: renamed from: c */
    private boolean f208442c = true;

    /* JADX INFO: renamed from: d */
    private boolean f208443d = true;

    /* JADX INFO: renamed from: e */
    protected ArrayList<String> f208444e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    HandlerThread f208445f;

    /* JADX INFO: renamed from: g */
    Handler f208446g;

    public class LogHandler extends Handler {
        public LogHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (LoopLogReporter.this.f208442c && !LoopLogReporter.this.f208443d && message.what == 90) {
                LoopLogReporter.this.mo222363c();
                removeMessages(90);
                sendEmptyMessageDelayed(90, LoopLogReporter.this.f208440a);
            }
        }
    }

    public LoopLogReporter() {
        this.f208445f = null;
        this.f208446g = null;
        HandlerThread handlerThread = new HandlerThread("loopReportCmdHandle", -4);
        this.f208445f = handlerThread;
        handlerThread.start();
        this.f208446g = new LogHandler(this.f208445f.getLooper());
    }

    /* JADX INFO: renamed from: c */
    public void mo222363c() {
        ArrayList<String> arrayList = this.f208444e;
        if (arrayList == null || arrayList.size() < this.f208441b) {
            return;
        }
        mo222364d();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo222364d();

    /* JADX INFO: renamed from: e */
    public void m222368e(boolean z) {
        this.f208442c = z;
        if (z) {
            return;
        }
        this.f208446g.removeMessages(90);
    }

    /* JADX INFO: renamed from: f */
    public void m222369f(int i) {
        if (i <= 0) {
            return;
        }
        this.f208440a = i;
    }

    /* JADX INFO: renamed from: g */
    public void m222370g(int i) {
        if (i <= 0) {
            return;
        }
        this.f208441b = i;
    }

    /* JADX INFO: renamed from: h */
    public void m222371h() {
        if (this.f208442c) {
            this.f208443d = false;
            this.f208446g.removeCallbacksAndMessages(null);
            this.f208446g.sendEmptyMessageDelayed(90, this.f208440a);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo222365i() {
        this.f208443d = true;
        if (this.f208442c) {
            this.f208446g.removeCallbacksAndMessages(null);
            this.f208445f.quit();
            mo222364d();
        }
    }
}

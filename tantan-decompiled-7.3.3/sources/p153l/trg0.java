package p153l;

import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class trg0 extends kug0 {

    /* JADX INFO: renamed from: a */
    private boolean f175873a;

    /* JADX INFO: renamed from: b */
    private boolean f175874b;

    /* JADX INFO: renamed from: c */
    private Timer f175875c;

    /* JADX INFO: renamed from: d */
    private TimerTask f175876d;

    /* JADX INFO: renamed from: e */
    private int f175877e = 60;

    /* JADX INFO: renamed from: f */
    private boolean f175878f = false;

    /* JADX INFO: renamed from: a */
    public void m192493a() {
        Timer timer = this.f175875c;
        if (timer == null && this.f175876d == null) {
            return;
        }
        this.f175878f = false;
        if (timer != null) {
            timer.cancel();
            this.f175875c = null;
        }
        TimerTask timerTask = this.f175876d;
        if (timerTask != null) {
            timerTask.cancel();
            this.f175876d = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m192495b() {
        if (this.f175877e <= 0) {
            return;
        }
        this.f175878f = true;
        Timer timer = this.f175875c;
        if (timer != null) {
            timer.cancel();
            this.f175875c = null;
        }
        TimerTask timerTask = this.f175876d;
        if (timerTask != null) {
            timerTask.cancel();
            this.f175876d = null;
        }
        this.f175875c = new Timer("WebSocketTimer");
        lkg0 lkg0Var = new lkg0(this);
        this.f175876d = lkg0Var;
        Timer timer2 = this.f175875c;
        long j = this.f175877e * 1000;
        timer2.scheduleAtFixedRate(lkg0Var, j, j);
    }

    /* JADX INFO: renamed from: c */
    public abstract Collection mo192497c();

    /* JADX INFO: renamed from: d */
    public boolean m192498d() {
        return this.f175873a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m192499e() {
        return this.f175874b;
    }

    /* JADX INFO: renamed from: a */
    public void m192494a(boolean z) {
        this.f175873a = z;
    }

    /* JADX INFO: renamed from: b */
    public void m192496b(boolean z) {
        this.f175874b = z;
    }
}

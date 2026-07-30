package p149l;

import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class ljg0 extends cmg0 {

    /* JADX INFO: renamed from: a */
    private boolean f128323a;

    /* JADX INFO: renamed from: b */
    private boolean f128324b;

    /* JADX INFO: renamed from: c */
    private Timer f128325c;

    /* JADX INFO: renamed from: d */
    private TimerTask f128326d;

    /* JADX INFO: renamed from: e */
    private int f128327e = 60;

    /* JADX INFO: renamed from: f */
    private boolean f128328f = false;

    /* JADX INFO: renamed from: a */
    public void m149973a() {
        Timer timer = this.f128325c;
        if (timer == null && this.f128326d == null) {
            return;
        }
        this.f128328f = false;
        if (timer != null) {
            timer.cancel();
            this.f128325c = null;
        }
        TimerTask timerTask = this.f128326d;
        if (timerTask != null) {
            timerTask.cancel();
            this.f128326d = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m149975b() {
        if (this.f128327e <= 0) {
            return;
        }
        this.f128328f = true;
        Timer timer = this.f128325c;
        if (timer != null) {
            timer.cancel();
            this.f128325c = null;
        }
        TimerTask timerTask = this.f128326d;
        if (timerTask != null) {
            timerTask.cancel();
            this.f128326d = null;
        }
        this.f128325c = new Timer("WebSocketTimer");
        dcg0 dcg0Var = new dcg0(this);
        this.f128326d = dcg0Var;
        Timer timer2 = this.f128325c;
        long j = this.f128327e * 1000;
        timer2.scheduleAtFixedRate(dcg0Var, j, j);
    }

    /* JADX INFO: renamed from: c */
    public abstract Collection mo149977c();

    /* JADX INFO: renamed from: d */
    public boolean m149978d() {
        return this.f128323a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m149979e() {
        return this.f128324b;
    }

    /* JADX INFO: renamed from: a */
    public void m149974a(boolean z) {
        this.f128323a = z;
    }

    /* JADX INFO: renamed from: b */
    public void m149976b(boolean z) {
        this.f128324b = z;
    }
}

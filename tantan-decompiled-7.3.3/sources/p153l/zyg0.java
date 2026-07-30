package p153l;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zyg0 {

    /* JADX INFO: renamed from: a */
    public final cng0 f206578a;

    /* JADX INFO: renamed from: b */
    public final mxg0 f206579b;

    /* JADX INFO: renamed from: c */
    public long f206580c;

    /* JADX INFO: renamed from: d */
    public long f206581d;

    /* JADX INFO: renamed from: e */
    public long f206582e;

    /* JADX INFO: renamed from: f */
    public long f206583f;

    /* JADX INFO: renamed from: g */
    public long f206584g;

    /* JADX INFO: renamed from: h */
    public long f206585h;

    /* JADX INFO: renamed from: i */
    public long f206586i;

    /* JADX INFO: renamed from: j */
    public long f206587j;

    /* JADX INFO: renamed from: k */
    public int f206588k;

    /* JADX INFO: renamed from: l */
    public int f206589l;

    /* JADX INFO: renamed from: m */
    public int f206590m;

    public zyg0(cng0 cng0Var) {
        this.f206578a = cng0Var;
        HandlerThread handlerThread = new HandlerThread("SudPicasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = yuq0.f201657a;
        ftg0 ftg0Var = new ftg0(looper);
        ftg0Var.sendMessageDelayed(ftg0Var.obtainMessage(), 1000L);
        this.f206579b = new mxg0(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public final dtg0 m222113a() {
        return new dtg0(this.f206578a.m111515a(), this.f206578a.m111518d(), this.f206580c, this.f206581d, this.f206582e, this.f206583f, this.f206584g, this.f206585h, this.f206586i, this.f206587j, this.f206588k, this.f206589l, this.f206590m, System.currentTimeMillis());
    }
}

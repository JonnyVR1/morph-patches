package p149l;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class rqg0 {

    /* JADX INFO: renamed from: a */
    public final ueg0 f160630a;

    /* JADX INFO: renamed from: b */
    public final epg0 f160631b;

    /* JADX INFO: renamed from: c */
    public long f160632c;

    /* JADX INFO: renamed from: d */
    public long f160633d;

    /* JADX INFO: renamed from: e */
    public long f160634e;

    /* JADX INFO: renamed from: f */
    public long f160635f;

    /* JADX INFO: renamed from: g */
    public long f160636g;

    /* JADX INFO: renamed from: h */
    public long f160637h;

    /* JADX INFO: renamed from: i */
    public long f160638i;

    /* JADX INFO: renamed from: j */
    public long f160639j;

    /* JADX INFO: renamed from: k */
    public int f160640k;

    /* JADX INFO: renamed from: l */
    public int f160641l;

    /* JADX INFO: renamed from: m */
    public int f160642m;

    public rqg0(ueg0 ueg0Var) {
        this.f160630a = ueg0Var;
        HandlerThread handlerThread = new HandlerThread("SudPicasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = slq0.f165256a;
        xkg0 xkg0Var = new xkg0(looper);
        xkg0Var.sendMessageDelayed(xkg0Var.obtainMessage(), 1000L);
        this.f160631b = new epg0(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public final vkg0 m180442a() {
        return new vkg0(this.f160630a.m193252a(), this.f160630a.m193255d(), this.f160632c, this.f160633d, this.f160634e, this.f160635f, this.f160636g, this.f160637h, this.f160638i, this.f160639j, this.f160640k, this.f160641l, this.f160642m, System.currentTimeMillis());
    }
}

package p149l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class x6g0 {

    /* JADX INFO: renamed from: a */
    public final long f191236a;

    /* JADX INFO: renamed from: b */
    public long f191237b;

    /* JADX INFO: renamed from: c */
    public final crg0 f191238c;

    /* JADX INFO: renamed from: e */
    public boolean f191240e;

    /* JADX INFO: renamed from: d */
    public final Handler f191239d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public final long f191241f = 100;

    /* JADX INFO: renamed from: g */
    public final iog0 f191242g = new iog0(this);

    public x6g0(long j, v8g0 v8g0Var) {
        this.f191236a = j;
        this.f191238c = v8g0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m207174a() {
        this.f191239d.removeCallbacks(this.f191242g);
        this.f191239d.postDelayed(this.f191242g, this.f191241f);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m207175b() {
        this.f191240e = true;
        this.f191237b = this.f191236a;
        m207174a();
    }
}

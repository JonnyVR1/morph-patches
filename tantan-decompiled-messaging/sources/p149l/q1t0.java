package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class q1t0 {

    /* JADX INFO: renamed from: a */
    public long f152166a = -1;

    /* JADX INFO: renamed from: b */
    public long f152167b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r1t0 f152168c;

    public q1t0(r1t0 r1t0Var) {
        this.f152168c = r1t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m172413a() {
        return this.f152167b;
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m172414b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f152166a);
        bundle.putLong("tclose", this.f152167b);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final void m172415c() {
        this.f152167b = this.f152168c.f157330a.elapsedRealtime();
    }

    /* JADX INFO: renamed from: d */
    public final void m172416d() {
        this.f152166a = this.f152168c.f157330a.elapsedRealtime();
    }
}

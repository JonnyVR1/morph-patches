package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class wat0 {

    /* JADX INFO: renamed from: a */
    public long f188166a = -1;

    /* JADX INFO: renamed from: b */
    public long f188167b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xat0 f188168c;

    public wat0(xat0 xat0Var) {
        this.f188168c = xat0Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m205681a() {
        return this.f188167b;
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m205682b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f188166a);
        bundle.putLong("tclose", this.f188167b);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final void m205683c() {
        this.f188167b = this.f188168c.f193074a.elapsedRealtime();
    }

    /* JADX INFO: renamed from: d */
    public final void m205684d() {
        this.f188166a = this.f188168c.f193074a.elapsedRealtime();
    }
}

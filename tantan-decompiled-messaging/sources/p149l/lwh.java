package p149l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class lwh {

    /* JADX INFO: renamed from: a */
    public d30 f130267a;

    /* JADX INFO: renamed from: b */
    public boolean f130268b;

    /* JADX INFO: renamed from: c */
    public lwh f130269c;

    public lwh(boolean z, d30 d30Var) {
        this.f130267a = d30Var;
        this.f130268b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m151969a() {
        if (this.f130268b) {
            this.f130267a.call();
        } else if (NullChecker.m81303a(this.f130269c)) {
            this.f130269c.m151969a();
        }
    }

    /* JADX INFO: renamed from: b */
    public lwh m151970b(lwh lwhVar) {
        this.f130269c = lwhVar;
        return lwhVar;
    }
}

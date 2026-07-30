package p153l;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public final class g9w0 {

    /* JADX INFO: renamed from: b */
    public final int f102898b;

    /* JADX INFO: renamed from: c */
    public final int f102899c;

    /* JADX INFO: renamed from: a */
    public final LinkedList f102897a = new LinkedList();

    /* JADX INFO: renamed from: d */
    public final jaw0 f102900d = new jaw0();

    public g9w0(int i, int i2) {
        this.f102898b = i;
        this.f102899c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m129634a() {
        return this.f102900d.m144078a();
    }

    /* JADX INFO: renamed from: b */
    public final int m129635b() {
        m129642i();
        return this.f102897a.size();
    }

    /* JADX INFO: renamed from: c */
    public final long m129636c() {
        return this.f102900d.m144079b();
    }

    /* JADX INFO: renamed from: d */
    public final long m129637d() {
        return this.f102900d.m144080c();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final u9w0 m129638e() {
        this.f102900d.m144083f();
        m129642i();
        if (this.f102897a.isEmpty()) {
            return null;
        }
        u9w0 u9w0Var = (u9w0) this.f102897a.remove();
        if (u9w0Var != null) {
            this.f102900d.m144085h();
        }
        return u9w0Var;
    }

    /* JADX INFO: renamed from: f */
    public final iaw0 m129639f() {
        return this.f102900d.m144081d();
    }

    /* JADX INFO: renamed from: g */
    public final String m129640g() {
        return this.f102900d.m144082e();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m129641h(u9w0 u9w0Var) {
        this.f102900d.m144083f();
        m129642i();
        if (this.f102897a.size() == this.f102898b) {
            return false;
        }
        this.f102897a.add(u9w0Var);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m129642i() {
        while (!this.f102897a.isEmpty()) {
            if (bxy0.m106918b().currentTimeMillis() - ((u9w0) this.f102897a.getFirst()).f178160d < this.f102899c) {
                return;
            }
            this.f102900d.m144084g();
            this.f102897a.remove();
        }
    }
}

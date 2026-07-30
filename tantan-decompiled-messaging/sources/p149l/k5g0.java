package p149l;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class k5g0 extends fhd implements e5g0 {

    /* JADX INFO: renamed from: d */
    @Nullable
    public e5g0 f121204d;

    /* JADX INFO: renamed from: e */
    public long f121205e;

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: a */
    public long mo114791a(int i) {
        return ((e5g0) p11.m167011e(this.f121204d)).mo114791a(i) + this.f121205e;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: b */
    public int mo114792b() {
        return ((e5g0) p11.m167011e(this.f121204d)).mo114792b();
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: f */
    public int mo114793f(long j) {
        return ((e5g0) p11.m167011e(this.f121204d)).mo114793f(j - this.f121205e);
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: g */
    public List<ywb> mo114794g(long j) {
        return ((e5g0) p11.m167011e(this.f121204d)).mo114794g(j - this.f121205e);
    }

    @Override // p149l.mg3
    /* JADX INFO: renamed from: i */
    public void mo9803i() {
        super.mo9803i();
        this.f121204d = null;
    }

    /* JADX INFO: renamed from: v */
    public void m144539v(long j, e5g0 e5g0Var, long j2) {
        this.f97498b = j;
        this.f121204d = e5g0Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f121205e = j;
    }
}

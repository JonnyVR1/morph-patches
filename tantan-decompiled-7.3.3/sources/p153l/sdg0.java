package p153l;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class sdg0 extends lid implements mdg0 {

    /* JADX INFO: renamed from: d */
    @Nullable
    public mdg0 f167413d;

    /* JADX INFO: renamed from: e */
    public long f167414e;

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: a */
    public long mo95502a(int i) {
        return ((mdg0) w11.m204369e(this.f167413d)).mo95502a(i) + this.f167414e;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: b */
    public int mo95503b() {
        return ((mdg0) w11.m204369e(this.f167413d)).mo95503b();
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: f */
    public int mo95504f(long j) {
        return ((mdg0) w11.m204369e(this.f167413d)).mo95504f(j - this.f167414e);
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: g */
    public List<myb> mo95505g(long j) {
        return ((mdg0) w11.m204369e(this.f167413d)).mo95505g(j - this.f167414e);
    }

    @Override // p153l.ah3
    /* JADX INFO: renamed from: i */
    public void mo9857i() {
        super.mo9857i();
        this.f167413d = null;
    }

    /* JADX INFO: renamed from: v */
    public void m185463v(long j, mdg0 mdg0Var, long j2) {
        this.f132210b = j;
        this.f167413d = mdg0Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f167414e = j;
    }
}

package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ypf0<Z> extends xr2<Z> {

    /* JADX INFO: renamed from: b */
    private final int f201065b;

    /* JADX INFO: renamed from: c */
    private final int f201066c;

    public ypf0(int i, int i2) {
        this.f201065b = i;
        this.f201066c = i2;
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: k */
    public final void mo95330k(@NonNull hrf0 hrf0Var) {
        boolean zM216597u = ylk0.m216597u(this.f201065b, this.f201066c);
        int i = this.f201065b;
        if (zM216597u) {
            hrf0Var.mo5695d(i, this.f201066c);
        } else {
            cmq.m111312a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i, " and height: ", this.f201066c, ", either provide dimensions in the constructor or call override()");
        }
    }

    public ypf0() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p153l.cli0
    /* JADX INFO: renamed from: a */
    public void mo95326a(@NonNull hrf0 hrf0Var) {
    }
}

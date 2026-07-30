package p153l;

import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightNormalTypeView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class scd0 extends e9d0<RightNormalTypeView> {

    /* JADX INFO: renamed from: e */
    public List<e9d0> f167238e;

    /* JADX INFO: renamed from: f */
    public j9d0 f167239f;

    /* JADX INFO: renamed from: g */
    public String f167240g;

    /* JADX INFO: renamed from: h */
    public boolean f167241h;

    /* JADX INFO: renamed from: i */
    public boolean f167242i;

    public scd0(List<e9d0> list, j9d0 j9d0Var, String str, boolean z, boolean z2) {
        this.f167238e = list;
        this.f167239f = j9d0Var;
        this.f167240g = str;
        this.f167241h = z;
        this.f167242i = z2;
    }

    /* JADX INFO: renamed from: I */
    public boolean m185367I() {
        return !jyb.m147479J(this.f167238e) && jyb.m147520m(this.f167238e, new qcj() { // from class: l.rcd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((e9d0) obj).f92627b);
            }
        });
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightNormalTypeView rightNormalTypeView) {
        super.mo71749u(rightNormalTypeView);
        rightNormalTypeView.m71824o0(this, this.f167239f);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193905r1;
    }

    public scd0(List<e9d0> list, j9d0 j9d0Var, boolean z, boolean z2) {
        this.f167238e = list;
        this.f167239f = j9d0Var;
        this.f167241h = z;
        this.f167242i = z2;
    }
}

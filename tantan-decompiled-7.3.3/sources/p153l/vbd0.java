package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightInfo;
import java.util.List;
import p151v.VButton;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class vbd0 implements iam<tbd0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f183226a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f183227b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f183228c;

    /* JADX INFO: renamed from: d */
    public View f183229d;

    /* JADX INFO: renamed from: e */
    public View f183230e;

    /* JADX INFO: renamed from: f */
    public VButton f183231f;

    /* JADX INFO: renamed from: g */
    public Group f183232g;

    /* JADX INFO: renamed from: h */
    public final Act f183233h;

    /* JADX INFO: renamed from: i */
    public tbd0 f183234i;

    /* JADX INFO: renamed from: j */
    public cbd0 f183235j;

    /* JADX INFO: renamed from: k */
    public GridLayoutManager f183236k;

    /* JADX INFO: renamed from: l */
    public final j9d0 f183237l = new C20802a();

    /* JADX INFO: renamed from: l.vbd0$a */
    public class C20802a implements j9d0 {
        public C20802a() {
        }

        @Override // p153l.j9d0
        /* JADX INFO: renamed from: a */
        public void mo143936a(d9d0 d9d0Var) {
            vbd0.this.f183235j.m108632k0(d9d0Var);
            if (!d9d0Var.f85763h || vbd0.this.f183234i.m190006z0()) {
                vbd0.this.m200698n(d9d0Var);
            } else {
                vbd0.this.f183234i.m189998V0(d9d0Var);
            }
        }

        @Override // p153l.j9d0
        /* JADX INFO: renamed from: b */
        public void mo143937b(String str) {
            vbd0.this.f183234i.m189992O0(str);
        }

        @Override // p153l.j9d0
        /* JADX INFO: renamed from: c */
        public void mo143938c(d9d0 d9d0Var) {
            vbd0.this.f183234i.m190002t0(d9d0Var);
        }

        @Override // p153l.j9d0
        /* JADX INFO: renamed from: d */
        public void mo143939d(ycd0 ycd0Var) {
            vbd0.this.f183234i.m189993P0(ycd0Var);
        }

        @Override // p153l.j9d0
        /* JADX INFO: renamed from: e */
        public void mo143940e(scd0 scd0Var, boolean z) {
            if (!z && scd0Var.m185367I()) {
                bnl0.m105524M(vbd0.this.f183232g, false);
            }
            vbd0.this.f183235j.m108631j0(scd0Var, z);
        }
    }

    /* JADX INFO: renamed from: l.vbd0$b */
    public class C20803b extends GridLayoutManager.AbstractC0554c {
        public C20803b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            d3q<?> d3qVar = vbd0.this.f183235j.m68538J().get(i);
            if (d3qVar instanceof e9d0) {
                return ((e9d0) d3qVar).f92628c;
            }
            return 2;
        }
    }

    public vbd0(Act act) {
        this.f183233h = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f183226a.getContext();
    }

    /* JADX INFO: renamed from: e */
    public View m200691e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wbd0.m205711b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tbd0 tbd0Var) {
        this.f183234i = tbd0Var;
    }

    /* JADX INFO: renamed from: i */
    public dbd0 m200693i(boolean z) {
        return v9d0.m200431o(this.f183235j.m68538J(), z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m200691e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m200694j() {
        bnl0.m105524M(this.f183232g, false);
    }

    /* JADX INFO: renamed from: k */
    public void m200695k(UserRightType userRightType) {
        this.f183227b.setLeftIconAsBack(this.f183233h);
        this.f183227b.setTitle(userRightType.getManageTitle(getContext()));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f183233h, 2);
        this.f183236k = gridLayoutManager;
        this.f183228c.setLayoutManager(gridLayoutManager);
        cbd0 cbd0Var = new cbd0();
        this.f183235j = cbd0Var;
        this.f183228c.setAdapter(cbd0Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m200696l(d9d0 d9d0Var, View view) {
        this.f183234i.m190003u0(d9d0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m200697m(BLiveRightInfo bLiveRightInfo, UserRightType userRightType, String str) {
        List<e9d0> listM200424h = v9d0.m200424h(bLiveRightInfo, userRightType, this.f183237l, str);
        this.f183236k.m3327v(new C20803b());
        this.f183235j.m108633l0(listM200424h);
    }

    /* JADX INFO: renamed from: n */
    public final void m200698n(final d9d0 d9d0Var) {
        if (d9d0Var.m115011H()) {
            bnl0.m105524M(this.f183232g, d9d0Var.f92627b);
            int i = R$string.f44980R0;
            if (d9d0Var.f85760e.isEquipped()) {
                i = R$string.f45047q1;
            } else if (d9d0Var.f85760e.canActive()) {
                i = R$string.f44966K0;
            } else if (d9d0Var.f85760e.isActive()) {
                i = R$string.f44980R0;
            }
            this.f183231f.setText(i);
            this.f183231f.setOnClickListener(new View.OnClickListener() { // from class: l.ubd0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178301a.m200696l(d9d0Var, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public void m200699p(ycd0 ycd0Var) {
        this.f183235j.m108634m0(ycd0Var);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveRightInfo;
import java.util.List;
import p147v.VButton;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class s3d0 implements s7m<q3d0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f162106a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f162107b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f162108c;

    /* JADX INFO: renamed from: d */
    public View f162109d;

    /* JADX INFO: renamed from: e */
    public View f162110e;

    /* JADX INFO: renamed from: f */
    public VButton f162111f;

    /* JADX INFO: renamed from: g */
    public Group f162112g;

    /* JADX INFO: renamed from: h */
    public final Act f162113h;

    /* JADX INFO: renamed from: i */
    public q3d0 f162114i;

    /* JADX INFO: renamed from: j */
    public z2d0 f162115j;

    /* JADX INFO: renamed from: k */
    public GridLayoutManager f162116k;

    /* JADX INFO: renamed from: l */
    public final g1d0 f162117l = new C19839a();

    /* JADX INFO: renamed from: l.s3d0$a */
    public class C19839a implements g1d0 {
        public C19839a() {
        }

        @Override // p149l.g1d0
        /* JADX INFO: renamed from: a */
        public void mo124069a(a1d0 a1d0Var) {
            s3d0.this.f162115j.m216959k0(a1d0Var);
            if (!a1d0Var.f67176h || s3d0.this.f162114i.m172805z0()) {
                s3d0.this.m182142n(a1d0Var);
            } else {
                s3d0.this.f162114i.m172797V0(a1d0Var);
            }
        }

        @Override // p149l.g1d0
        /* JADX INFO: renamed from: b */
        public void mo124070b(String str) {
            s3d0.this.f162114i.m172791O0(str);
        }

        @Override // p149l.g1d0
        /* JADX INFO: renamed from: c */
        public void mo124071c(a1d0 a1d0Var) {
            s3d0.this.f162114i.m172801t0(a1d0Var);
        }

        @Override // p149l.g1d0
        /* JADX INFO: renamed from: d */
        public void mo124072d(v4d0 v4d0Var) {
            s3d0.this.f162114i.m172792P0(v4d0Var);
        }

        @Override // p149l.g1d0
        /* JADX INFO: renamed from: e */
        public void mo124073e(p4d0 p4d0Var, boolean z) {
            if (!z && p4d0Var.m167387I()) {
                xdl0.m208344M(s3d0.this.f162112g, false);
            }
            s3d0.this.f162115j.m216958j0(p4d0Var, z);
        }
    }

    /* JADX INFO: renamed from: l.s3d0$b */
    public class C19840b extends GridLayoutManager.AbstractC0553c {
        public C19840b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            d1q<?> d1qVar = s3d0.this.f162115j.m67355J().get(i);
            if (d1qVar instanceof b1d0) {
                return ((b1d0) d1qVar).f72586c;
            }
            return 2;
        }
    }

    public s3d0(Act act) {
        this.f162113h = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f162106a.getContext();
    }

    /* JADX INFO: renamed from: e */
    public View m182135e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t3d0.m187112b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(q3d0 q3d0Var) {
        this.f162114i = q3d0Var;
    }

    /* JADX INFO: renamed from: i */
    public a3d0 m182137i(boolean z) {
        return s1d0.m181951o(this.f162115j.m67355J(), z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m182135e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m182138j() {
        xdl0.m208344M(this.f162112g, false);
    }

    /* JADX INFO: renamed from: k */
    public void m182139k(UserRightType userRightType) {
        this.f162107b.setLeftIconAsBack(this.f162113h);
        this.f162107b.setTitle(userRightType.getManageTitle(getContext()));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f162113h, 2);
        this.f162116k = gridLayoutManager;
        this.f162108c.setLayoutManager(gridLayoutManager);
        z2d0 z2d0Var = new z2d0();
        this.f162115j = z2d0Var;
        this.f162108c.setAdapter(z2d0Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m182140l(a1d0 a1d0Var, View view) {
        this.f162114i.m172802u0(a1d0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m182141m(BLiveRightInfo bLiveRightInfo, UserRightType userRightType, String str) {
        List<b1d0> listM181944h = s1d0.m181944h(bLiveRightInfo, userRightType, this.f162117l, str);
        this.f162116k.m3326v(new C19840b());
        this.f162115j.m216960l0(listM181944h);
    }

    /* JADX INFO: renamed from: n */
    public final void m182142n(final a1d0 a1d0Var) {
        if (a1d0Var.m94548H()) {
            xdl0.m208344M(this.f162112g, a1d0Var.f72585b);
            int i = R$string.f44132R0;
            if (a1d0Var.f67173e.isEquipped()) {
                i = R$string.f44199q1;
            } else if (a1d0Var.f67173e.canActive()) {
                i = R$string.f44118K0;
            } else if (a1d0Var.f67173e.isActive()) {
                i = R$string.f44132R0;
            }
            this.f162111f.setText(i);
            this.f162111f.setOnClickListener(new View.OnClickListener() { // from class: l.r3d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157523a.m182140l(a1d0Var, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public void m182143p(v4d0 v4d0Var) {
        this.f162115j.m216961m0(v4d0Var);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

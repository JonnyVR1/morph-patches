package p009l;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlLikedUsersAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.core.data.Privilege;
import java.util.List;
import l.b3c0;
import l.d30;
import l.drn;
import l.e30;
import l.hfr;
import l.hmb;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.xma;
import l.z0c0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VPullUpRecyclerView;
import v.VText;
import v.VText_NoTopPadding;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class crn implements s7m<zqn> {

    /* JADX INFO: renamed from: a */
    public VFrame f10734a;

    /* JADX INFO: renamed from: b */
    public VImage f10735b;

    /* JADX INFO: renamed from: c */
    public VLinear f10736c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f10737d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f10738e;

    /* JADX INFO: renamed from: f */
    public VFrame f10739f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f10740g;

    /* JADX INFO: renamed from: h */
    public VImage f10741h;

    /* JADX INFO: renamed from: i */
    public VText f10742i;

    /* JADX INFO: renamed from: j */
    public VPullUpRecyclerView f10743j;

    /* JADX INFO: renamed from: k */
    public View f10744k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f10745l;

    /* JADX INFO: renamed from: m */
    public final IntlLikedUsersAct f10746m;

    /* JADX INFO: renamed from: n */
    public zqn f10747n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public sqn f10748o;

    /* JADX INFO: renamed from: l.crn$a */
    public class C0825a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f10749a;

        public C0825a(GridLayoutManager gridLayoutManager) {
            this.f10749a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m12784f(int i) {
            if (crn.this.f10746m.m8329Y1().getItemViewType(i) == 0) {
                return this.f10749a.m();
            }
            return 1;
        }
    }

    public crn(IntlLikedUsersAct intlLikedUsersAct) {
        this.f10746m = intlLikedUsersAct;
    }

    /* JADX INFO: renamed from: l */
    private void m12768l() {
        sqn sqnVar = this.f10748o;
        if (sqnVar != null) {
            sqnVar.m22357k();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m12769u() {
        boolean zE4 = xma.e4();
        xdl0.M(this.f10745l, zE4);
        xdl0.M(this.f10744k, zE4);
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context m12770C0() {
        return this.f10746m;
    }

    /* JADX INFO: renamed from: d */
    public View m12771d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return drn.b(this, layoutInflater, viewGroup);
    }

    public void destroy() {
        sqn sqnVar = this.f10748o;
        if (sqnVar != null) {
            sqnVar.m22353g();
            this.f10748o = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m12772e() {
        if (this.f10748o != null) {
            return;
        }
        sqn sqnVar = new sqn(this.f10746m, this.f10747n);
        this.f10748o = sqnVar;
        sqnVar.m22351e(this.f10738e);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m12775i1(zqn zqnVar) {
        this.f10747n = zqnVar;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m12774i(View view) {
        rtl.m21800g(this.f10746m.pageId());
        if (CoreModule.c.p0.k3()) {
            CoreModule.P().a().r6(this.f10746m, "p_intl_like_i_sent,e_intl_like_sent_premiun_button,click", Privilege.immediately_match, (e30) null, (d30) null);
        } else {
            CoreModule.P().a().qm(this.f10746m, "p_intl_like_i_sent,e_intl_like_sent_premiun_button,click", Privilege.liked_user, (e30) null);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12771d(layoutInflater, viewGroup);
    }

    public void init() {
        m12780p();
        m12782s();
        m12781q();
        m12779n();
        m12783v();
        m12772e();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12776j(View view) {
        this.f10746m.finish();
    }

    /* JADX INFO: renamed from: k */
    public void m12777k() {
        sqn sqnVar = this.f10748o;
        if (sqnVar != null) {
            sqnVar.m22355i();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12778m(List<LikeUser> list) {
        if (list == null || vwb.J(list)) {
            xdl0.M(this.f10740g, true);
            xdl0.M(this.f10743j, false);
        } else {
            this.f10746m.m8329Y1().m19028S(list);
            xdl0.M(this.f10740g, false);
            xdl0.M(this.f10743j, true);
        }
        m12769u();
        m12768l();
    }

    /* JADX INFO: renamed from: n */
    public final void m12779n() {
        this.f10745l.setOnClickListener(new View.OnClickListener() { // from class: l.arn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9626a.m12774i(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m12780p() {
        this.f10737d.setLeftIconOnClick(new View.OnClickListener() { // from class: l.brn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10243a.m12776j(view);
            }
        });
        this.f10737d.setBackgroundColor(Color.parseColor("#00ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m12781q() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f10746m, 2);
        gridLayoutManager.v(new C0825a(gridLayoutManager));
        this.f10743j.setLayoutManager(gridLayoutManager);
        this.f10743j.setAdapter(this.f10746m.m8329Y1());
        if (IntlCountryCodeController.v()) {
            return;
        }
        new k(new hfr(this.f10747n)).g(this.f10743j);
    }

    /* JADX INFO: renamed from: s */
    public final void m12782s() {
        this.f10746m.setStatusBarColor(App.e.getColor(z0c0.k));
        int systemUiVisibility = this.f10746m.getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & (-8193);
        if (Build.VERSION.SDK_INT >= 26) {
            i = systemUiVisibility & (-8209);
        }
        this.f10746m.getWindow().getDecorView().setSystemUiVisibility(i);
        hmb.j1(this.f10737d);
    }

    /* JADX INFO: renamed from: v */
    public void m12783v() {
        boolean zY4 = xma.y4();
        this.f10735b.setImageResource(zY4 ? b3c0.D : b3c0.B);
        this.f10737d.setLeftIconResource(zY4 ? b3c0.A : b3c0.z);
        this.f10745l.setBackgroundResource(zY4 ? b3c0.I : b3c0.H);
        this.f10741h.setImageResource(zY4 ? b3c0.F : b3c0.E);
        if (this.f10737d.getTitleContainer().getChildCount() > 0 && (this.f10737d.getTitleContainer().getChildAt(0) instanceof TextView)) {
            ((TextView) this.f10737d.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor(zY4 ? "#F9E7FF" : "#cce8ca8a"));
        }
        m12769u();
        m12768l();
    }
}

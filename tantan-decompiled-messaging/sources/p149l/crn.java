package p149l;

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
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlLikedUsersAct;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class crn implements s7m<zqn> {

    /* JADX INFO: renamed from: a */
    public VFrame f82262a;

    /* JADX INFO: renamed from: b */
    public VImage f82263b;

    /* JADX INFO: renamed from: c */
    public VLinear f82264c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f82265d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f82266e;

    /* JADX INFO: renamed from: f */
    public VFrame f82267f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f82268g;

    /* JADX INFO: renamed from: h */
    public VImage f82269h;

    /* JADX INFO: renamed from: i */
    public VText f82270i;

    /* JADX INFO: renamed from: j */
    public VPullUpRecyclerView f82271j;

    /* JADX INFO: renamed from: k */
    public View f82272k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f82273l;

    /* JADX INFO: renamed from: m */
    public final IntlLikedUsersAct f82274m;

    /* JADX INFO: renamed from: n */
    public zqn f82275n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public sqn f82276o;

    /* JADX INFO: renamed from: l.crn$a */
    public class C16230a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f82277a;

        public C16230a(GridLayoutManager gridLayoutManager) {
            this.f82277a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (crn.this.f82274m.m46241Y1().getItemViewType(i) == 0) {
                return this.f82277a.m3317m();
            }
            return 1;
        }
    }

    public crn(IntlLikedUsersAct intlLikedUsersAct) {
        this.f82274m = intlLikedUsersAct;
    }

    /* JADX INFO: renamed from: l */
    private void m108425l() {
        sqn sqnVar = this.f82276o;
        if (sqnVar != null) {
            sqnVar.m185607k();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m108426u() {
        boolean zM210071e4 = xma.m210071e4();
        xdl0.m208344M(this.f82273l, zM210071e4);
        xdl0.m208344M(this.f82272k, zM210071e4);
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82274m;
    }

    /* JADX INFO: renamed from: d */
    public View m108427d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return drn.m113317b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
        sqn sqnVar = this.f82276o;
        if (sqnVar != null) {
            sqnVar.m185603g();
            this.f82276o = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m108428e() {
        if (this.f82276o != null) {
            return;
        }
        sqn sqnVar = new sqn(this.f82274m, this.f82275n);
        this.f82276o = sqnVar;
        sqnVar.m185601e(this.f82266e);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zqn zqnVar) {
        this.f82275n = zqnVar;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m108430i(View view) {
        rtl.m180794g(this.f82274m.pageId());
        if (CoreModule.f17545c.f19672p0.m173363k3()) {
            CoreModule.m29935P().m94651a().mo33574r6(this.f82274m, "p_intl_like_i_sent,e_intl_like_sent_premiun_button,click", Privilege.immediately_match, null, null);
        } else {
            CoreModule.m29935P().m94651a().mo33572qm(this.f82274m, "p_intl_like_i_sent,e_intl_like_sent_premiun_button,click", Privilege.liked_user, null);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m108427d(layoutInflater, viewGroup);
    }

    public void init() {
        m108435p();
        m108437s();
        m108436q();
        m108434n();
        m108438v();
        m108428e();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m108431j(View view) {
        this.f82274m.m47815F2();
    }

    /* JADX INFO: renamed from: k */
    public void m108432k() {
        sqn sqnVar = this.f82276o;
        if (sqnVar != null) {
            sqnVar.m185605i();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m108433m(List<LikeUser> list) {
        if (list == null || vwb.m200296J(list)) {
            xdl0.m208344M(this.f82268g, true);
            xdl0.m208344M(this.f82271j, false);
        } else {
            this.f82274m.m46241Y1().m160648S(list);
            xdl0.m208344M(this.f82268g, false);
            xdl0.m208344M(this.f82271j, true);
        }
        m108426u();
        m108425l();
    }

    /* JADX INFO: renamed from: n */
    public final void m108434n() {
        this.f82273l.setOnClickListener(new View.OnClickListener() { // from class: l.arn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71302a.m108430i(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m108435p() {
        this.f82265d.setLeftIconOnClick(new View.OnClickListener() { // from class: l.brn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76913a.m108431j(view);
            }
        });
        this.f82265d.setBackgroundColor(Color.parseColor("#00ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m108436q() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f82274m, 2);
        gridLayoutManager.m3326v(new C16230a(gridLayoutManager));
        this.f82271j.setLayoutManager(gridLayoutManager);
        this.f82271j.setAdapter(this.f82274m.m46241Y1());
        if (IntlCountryCodeController.m28126v()) {
            return;
        }
        new C0605k(new hfr(this.f82275n)).m3750g(this.f82271j);
    }

    /* JADX INFO: renamed from: s */
    public final void m108437s() {
        this.f82274m.setStatusBarColor(App.f15369e.getColor(z0c0.f200983k));
        int systemUiVisibility = this.f82274m.getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & (-8193);
        if (Build.VERSION.SDK_INT >= 26) {
            i = systemUiVisibility & (-8209);
        }
        this.f82274m.getWindow().getDecorView().setSystemUiVisibility(i);
        hmb.m131705j1(this.f82265d);
    }

    /* JADX INFO: renamed from: v */
    public void m108438v() {
        boolean zM210098y4 = xma.m210098y4();
        this.f82263b.setImageResource(zM210098y4 ? b3c0.f72841D : b3c0.f72827B);
        this.f82265d.setLeftIconResource(zM210098y4 ? b3c0.f72820A : b3c0.f73196z);
        this.f82273l.setBackgroundResource(zM210098y4 ? b3c0.f72876I : b3c0.f72869H);
        this.f82269h.setImageResource(zM210098y4 ? b3c0.f72855F : b3c0.f72848E);
        if (this.f82265d.getTitleContainer().getChildCount() > 0 && (this.f82265d.getTitleContainer().getChildAt(0) instanceof TextView)) {
            ((TextView) this.f82265d.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor(zM210098y4 ? "#F9E7FF" : "#cce8ca8a"));
        }
        m108426u();
        m108425l();
    }
}

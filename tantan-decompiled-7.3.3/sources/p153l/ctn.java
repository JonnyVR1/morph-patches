package p153l;

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
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.intllikedusers.IntlLikedUsersAct;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public class ctn implements iam<zsn> {

    /* JADX INFO: renamed from: a */
    public VFrame f83719a;

    /* JADX INFO: renamed from: b */
    public VImage f83720b;

    /* JADX INFO: renamed from: c */
    public VLinear f83721c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f83722d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f83723e;

    /* JADX INFO: renamed from: f */
    public VFrame f83724f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f83725g;

    /* JADX INFO: renamed from: h */
    public VImage f83726h;

    /* JADX INFO: renamed from: i */
    public VText f83727i;

    /* JADX INFO: renamed from: j */
    public VPullUpRecyclerView f83728j;

    /* JADX INFO: renamed from: k */
    public View f83729k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f83730l;

    /* JADX INFO: renamed from: m */
    public final IntlLikedUsersAct f83731m;

    /* JADX INFO: renamed from: n */
    public zsn f83732n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public ssn f83733o;

    /* JADX INFO: renamed from: l.ctn$a */
    public class C16359a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f83734a;

        public C16359a(GridLayoutManager gridLayoutManager) {
            this.f83734a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (ctn.this.f83731m.m47424Z1().getItemViewType(i) == 0) {
                return this.f83734a.m3318m();
            }
            return 1;
        }
    }

    public ctn(IntlLikedUsersAct intlLikedUsersAct) {
        this.f83731m = intlLikedUsersAct;
    }

    /* JADX INFO: renamed from: l */
    private void m112522l() {
        ssn ssnVar = this.f83733o;
        if (ssnVar != null) {
            ssnVar.m187769k();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m112523u() {
        boolean zM146386f4 = joa.m146386f4();
        bnl0.m105524M(this.f83730l, zM146386f4);
        bnl0.m105524M(this.f83729k, zM146386f4);
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f83731m;
    }

    /* JADX INFO: renamed from: d */
    public View m112524d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dtn.m117888b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
        ssn ssnVar = this.f83733o;
        if (ssnVar != null) {
            ssnVar.m187765g();
            this.f83733o = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m112525e() {
        if (this.f83733o != null) {
            return;
        }
        ssn ssnVar = new ssn(this.f83731m, this.f83732n);
        this.f83733o = ssnVar;
        ssnVar.m187763e(this.f83723e);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zsn zsnVar) {
        this.f83732n = zsnVar;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m112527i(View view) {
        fwl.m127801g(this.f83731m.pageId());
        if (CoreModule.f18264c.f20414p0.m219066k3()) {
            CoreModule.m30933P().m143405a().mo34577r6(this.f83731m, "p_intl_like_i_sent,e_intl_like_sent_premiun_button,click", Privilege.immediately_match, null, null);
        } else {
            CoreModule.m30933P().m143405a().mo34575qm(this.f83731m, "p_intl_like_i_sent,e_intl_like_sent_premiun_button,click", Privilege.liked_user, null);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m112524d(layoutInflater, viewGroup);
    }

    public void init() {
        m112532p();
        m112534s();
        m112533q();
        m112531n();
        m112535v();
        m112525e();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m112528j(View view) {
        this.f83731m.m48999H2();
    }

    /* JADX INFO: renamed from: k */
    public void m112529k() {
        ssn ssnVar = this.f83733o;
        if (ssnVar != null) {
            ssnVar.m187767i();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m112530m(List<LikeUser> list) {
        if (list == null || jyb.m147479J(list)) {
            bnl0.m105524M(this.f83725g, true);
            bnl0.m105524M(this.f83728j, false);
        } else {
            this.f83731m.m47424Z1().m164625S(list);
            bnl0.m105524M(this.f83725g, false);
            bnl0.m105524M(this.f83728j, true);
        }
        m112523u();
        m112522l();
    }

    /* JADX INFO: renamed from: n */
    public final void m112531n() {
        this.f83730l.setOnClickListener(new View.OnClickListener() { // from class: l.atn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73371a.m112527i(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m112532p() {
        this.f83722d.setLeftIconOnClick(new View.OnClickListener() { // from class: l.btn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78369a.m112528j(view);
            }
        });
        this.f83722d.setBackgroundColor(Color.parseColor("#00ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m112533q() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f83731m, 2);
        gridLayoutManager.m3327v(new C16359a(gridLayoutManager));
        this.f83728j.setLayoutManager(gridLayoutManager);
        this.f83728j.setAdapter(this.f83731m.m47424Z1());
        if (IntlCountryCodeController.m29125v()) {
            return;
        }
        new C0607k(new ihr(this.f83732n)).m3751g(this.f83728j);
    }

    /* JADX INFO: renamed from: s */
    public final void m112534s() {
        this.f83731m.setStatusBarColor(App.f16088e.getColor(f9c0.f97866k));
        int systemUiVisibility = this.f83731m.getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & (-8193);
        if (Build.VERSION.SDK_INT >= 26) {
            i = systemUiVisibility & (-8209);
        }
        this.f83731m.getWindow().getDecorView().setSystemUiVisibility(i);
        vnb.m201950j1(this.f83722d);
    }

    /* JADX INFO: renamed from: v */
    public void m112535v() {
        boolean zM146413z4 = joa.m146413z4();
        this.f83720b.setImageResource(zM146413z4 ? gbc0.f103092D : gbc0.f103078B);
        this.f83722d.setLeftIconResource(zM146413z4 ? gbc0.f103071A : gbc0.f103447z);
        this.f83730l.setBackgroundResource(zM146413z4 ? gbc0.f103127I : gbc0.f103120H);
        this.f83726h.setImageResource(zM146413z4 ? gbc0.f103106F : gbc0.f103099E);
        if (this.f83722d.getTitleContainer().getChildCount() > 0 && (this.f83722d.getTitleContainer().getChildAt(0) instanceof TextView)) {
            ((TextView) this.f83722d.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor(zM146413z4 ? "#F9E7FF" : "#cce8ca8a"));
        }
        m112523u();
        m112522l();
    }
}

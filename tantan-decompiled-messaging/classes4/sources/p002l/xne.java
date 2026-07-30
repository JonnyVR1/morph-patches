package p002l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.j760;
import l.mcr;
import l.t100;
import l.upa;
import l.vwb;
import l.wn90;
import l.xdl0;
import l.yne;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xne extends ah90 implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public VImage f22364A;

    /* JADX INFO: renamed from: B */
    public RecyclerView f22365B;

    /* JADX INFO: renamed from: C */
    public Map<String, Integer> f22366C;

    /* JADX INFO: renamed from: D */
    public iv10 f22367D;

    /* JADX INFO: renamed from: E */
    public List<Literatures> f22368E;

    /* JADX INFO: renamed from: F */
    public List<LiteraturesComments> f22369F;

    /* JADX INFO: renamed from: G */
    public List<Literatures> f22370G;

    /* JADX INFO: renamed from: u */
    public FrameLayout f22371u;

    /* JADX INFO: renamed from: v */
    public VText f22372v;

    /* JADX INFO: renamed from: w */
    public VImage f22373w;

    /* JADX INFO: renamed from: x */
    public VText f22374x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f22375y;

    /* JADX INFO: renamed from: z */
    public VText f22376z;

    /* JADX INFO: renamed from: l.xne$a */
    public class C0899a extends RecyclerView.t {
        public C0899a() {
        }

        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (vwb.J(xne.this.f22368E) || xne.this.f22368E.size() <= 10 || recyclerView.canScrollHorizontally(1)) {
                return;
            }
            xne.this.f22367D.m15426L(true);
        }
    }

    public xne(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f22366C = new HashMap();
        this.f22370G = new ArrayList();
    }

    /* JADX INFO: renamed from: S */
    public View m26038S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yne.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final void m26039T() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m14465w().getContext());
        linearLayoutManager.setOrientation(0);
        this.f22367D = new iv10(this.f22365B, mo3351O());
        this.f22365B.setLayoutManager(linearLayoutManager);
        this.f22365B.addOnScrollListener(new C0899a());
        this.f22365B.setAdapter(this.f22367D);
    }

    /* JADX INFO: renamed from: U */
    public void mo16729U() {
        if (vwb.J(this.f22369F)) {
            return;
        }
        this.f22368E = BookMoviesDramasHelper.k(this.f22369F);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f22372v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f22374x.setTypeface(typeface);
        this.f22376z.setTypeface(typeface);
        xdl0.V(this.f22365B, t100.d(20.0f));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        j760<List<Literatures>, List<LiteraturesComments>> j760VarMo1510H3 = mo3351O().mo1510H3();
        if (NullChecker.a(j760VarMo1510H3)) {
            this.f22368E = (List) j760VarMo1510H3.a;
            this.f22369F = (List) j760VarMo1510H3.b;
        }
        if (mo3351O().mo1570m0()) {
            return (vwb.J(this.f22368E) && vwb.J(this.f22369F)) ? false : true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f22374x) {
            zvf0.r("e_add_artwork_entrance", "p_edit_profile_view");
            mo3351O().act().startActivity(MkWebViewAct.a2(mo3351O().act(), "", p.p3()));
        } else if (view == this.f22364A) {
            mo3351O().act().startActivity(MkWebViewAct.a2(mo3351O().act(), "", p.p3()));
        } else if (view == this.f22373w) {
            if (!mo3351O().mo1523P1()) {
                zvf0.r("e_check_all_artwork_entrance", "p_suggest_user_profile_info_view");
            }
            mo3351O().act().startActivity(MkWebViewAct.a2(mo3351O().act(), "", mo3351O().mo1570m0() ? p.p3() : String.format(p.q3(), mo3351O().userId(), "0", mo3351O().from())));
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m26038S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m26039T();
        mo16729U();
        boolean z = true;
        int i = 0;
        if (vwb.J(this.f22369F) && mo3351O().mo1570m0()) {
            xdl0.M(this.f22374x, true);
            zvf0.x("e_add_artwork_entrance", "p_edit_profile_view");
        } else {
            xdl0.M(this.f22374x, false);
        }
        xdl0.M(this.f22375y, mo3351O().mo1570m0() && vwb.J(this.f22369F));
        xdl0.M(this.f22364A, false);
        boolean z2 = this.f22368E.size() > 3;
        VImage vImage = this.f22373w;
        if ((mo3351O().mo1570m0() || !z2) && (!mo3351O().mo1570m0() || vwb.J(this.f22369F))) {
            z = false;
        }
        xdl0.M(vImage, z);
        if (!mo3351O().mo1523P1() && z2) {
            zvf0.x("e_check_all_artwork_entrance", "p_suggest_user_profile_info_view");
        }
        if (this.f22370G.size() == 0) {
            if (vwb.J(this.f22369F)) {
                this.f22370G = new ArrayList();
            } else {
                this.f22370G = new ArrayList(this.f22368E);
            }
        }
        if (NullChecker.a(this.f22367D)) {
            this.f22367D.m15424J(this.f22370G);
        }
        iv10 iv10Var = this.f22367D;
        Act act = mo3351O().act();
        List<Literatures> list = this.f22368E;
        iv10Var.m15425K(act, list.subList(0, Math.min(list.size(), 10)), this.f22369F, this.f22366C);
        VText vText = this.f22372v;
        if (vwb.J(this.f22369F) && vwb.J(wn90.F().H()) && mo3351O().mo1570m0()) {
            i = upa.p().weight.myrecent;
        }
        m9650P(vText, "我的书影剧", i);
        xdl0.E0(this.f22374x, this);
        xdl0.E0(this.f22364A, this);
        xdl0.E0(this.f22373w, this);
    }
}

package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bpe extends ep90 implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public VImage f77755A;

    /* JADX INFO: renamed from: B */
    public RecyclerView f77756B;

    /* JADX INFO: renamed from: C */
    public Map<String, Integer> f77757C;

    /* JADX INFO: renamed from: D */
    public q320 f77758D;

    /* JADX INFO: renamed from: E */
    public List<Literatures> f77759E;

    /* JADX INFO: renamed from: F */
    public List<LiteraturesComments> f77760F;

    /* JADX INFO: renamed from: G */
    public List<Literatures> f77761G;

    /* JADX INFO: renamed from: u */
    public FrameLayout f77762u;

    /* JADX INFO: renamed from: v */
    public VText f77763v;

    /* JADX INFO: renamed from: w */
    public VImage f77764w;

    /* JADX INFO: renamed from: x */
    public VText f77765x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f77766y;

    /* JADX INFO: renamed from: z */
    public VText f77767z;

    /* JADX INFO: renamed from: l.bpe$a */
    public class C16077a extends RecyclerView.AbstractC0584t {
        public C16077a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (jyb.m147479J(bpe.this.f77759E) || bpe.this.f77759E.size() <= 10 || recyclerView.canScrollHorizontally(1)) {
                return;
            }
            bpe.this.f77758D.m175110L(true);
        }
    }

    public bpe(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f77757C = new HashMap();
        this.f77761G = new ArrayList();
    }

    /* JADX INFO: renamed from: S */
    public View m105809S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cpe.m111751b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final void m105810T() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m168325w().getContext());
        linearLayoutManager.setOrientation(0);
        this.f77758D = new q320(this.f77756B, mo53983O());
        this.f77756B.setLayoutManager(linearLayoutManager);
        this.f77756B.addOnScrollListener(new C16077a());
        this.f77756B.setAdapter(this.f77758D);
    }

    /* JADX INFO: renamed from: U */
    public void mo105811U() {
        if (jyb.m147479J(this.f77760F)) {
            return;
        }
        this.f77759E = BookMoviesDramasHelper.m60628k(this.f77760F);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f77763v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f77765x.setTypeface(typeface);
        this.f77767z.setTypeface(typeface);
        bnl0.m105538V(this.f77756B, qa00.m175859d(20.0f));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        pf60<List<Literatures>, List<LiteraturesComments>> pf60VarMo52245H3 = mo53983O().mo52245H3();
        if (NullChecker.m82486a(pf60VarMo52245H3)) {
            this.f77759E = pf60VarMo52245H3.f152156a;
            this.f77760F = pf60VarMo52245H3.f152157b;
        }
        if (mo53983O().mo52302m0()) {
            return (jyb.m147479J(this.f77759E) && jyb.m147479J(this.f77760F)) ? false : true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f77765x) {
            i4g0.m138520r("e_add_artwork_entrance", "p_edit_profile_view");
            mo53983O().act().startActivity(MkWebViewAct.m81419b2(mo53983O().act(), "", C4901p.m35366p3()));
        } else if (view == this.f77755A) {
            mo53983O().act().startActivity(MkWebViewAct.m81419b2(mo53983O().act(), "", C4901p.m35366p3()));
        } else if (view == this.f77764w) {
            if (!mo53983O().mo52258P1()) {
                i4g0.m138520r("e_check_all_artwork_entrance", OMSDialogPositon.p_suggest_user_profile_info_view);
            }
            mo53983O().act().startActivity(MkWebViewAct.m81419b2(mo53983O().act(), "", mo53983O().mo52302m0() ? C4901p.m35366p3() : String.format(C4901p.m35367q3(), mo53983O().userId(), "0", mo53983O().from())));
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m105809S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m105810T();
        mo105811U();
        boolean z = true;
        int i = 0;
        if (jyb.m147479J(this.f77760F) && mo53983O().mo52302m0()) {
            bnl0.m105524M(this.f77765x, true);
            i4g0.m138526x("e_add_artwork_entrance", "p_edit_profile_view");
        } else {
            bnl0.m105524M(this.f77765x, false);
        }
        bnl0.m105524M(this.f77766y, mo53983O().mo52302m0() && jyb.m147479J(this.f77760F));
        bnl0.m105524M(this.f77755A, false);
        boolean z2 = this.f77759E.size() > 3;
        VImage vImage = this.f77764w;
        if ((mo53983O().mo52302m0() || !z2) && (!mo53983O().mo52302m0() || jyb.m147479J(this.f77760F))) {
            z = false;
        }
        bnl0.m105524M(vImage, z);
        if (!mo53983O().mo52258P1() && z2) {
            i4g0.m138526x("e_check_all_artwork_entrance", OMSDialogPositon.p_suggest_user_profile_info_view);
        }
        if (this.f77761G.size() == 0) {
            if (jyb.m147479J(this.f77760F)) {
                this.f77761G = new ArrayList();
            } else {
                this.f77761G = new ArrayList(this.f77759E);
            }
        }
        if (NullChecker.m82486a(this.f77758D)) {
            this.f77758D.m175108J(this.f77761G);
        }
        q320 q320Var = this.f77758D;
        Act act = mo53983O().act();
        List<Literatures> list = this.f77759E;
        q320Var.m175109K(act, list.subList(0, Math.min(list.size(), 10)), this.f77760F, this.f77757C);
        VText vText = this.f77763v;
        if (jyb.m147479J(this.f77760F) && jyb.m147479J(aw90.m100562F().m100599H()) && mo53983O().mo52302m0()) {
            i = gra.m131728p().weight.myrecent;
        }
        m121844P(vText, "我的书影剧", i);
        bnl0.m105509E0(this.f77765x, this);
        bnl0.m105509E0(this.f77755A, this);
        bnl0.m105509E0(this.f77764w, this);
    }
}

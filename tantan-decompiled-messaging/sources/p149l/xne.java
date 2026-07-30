package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xne extends ah90 implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public VImage f193656A;

    /* JADX INFO: renamed from: B */
    public RecyclerView f193657B;

    /* JADX INFO: renamed from: C */
    public Map<String, Integer> f193658C;

    /* JADX INFO: renamed from: D */
    public iv10 f193659D;

    /* JADX INFO: renamed from: E */
    public List<Literatures> f193660E;

    /* JADX INFO: renamed from: F */
    public List<LiteraturesComments> f193661F;

    /* JADX INFO: renamed from: G */
    public List<Literatures> f193662G;

    /* JADX INFO: renamed from: u */
    public FrameLayout f193663u;

    /* JADX INFO: renamed from: v */
    public VText f193664v;

    /* JADX INFO: renamed from: w */
    public VImage f193665w;

    /* JADX INFO: renamed from: x */
    public VText f193666x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f193667y;

    /* JADX INFO: renamed from: z */
    public VText f193668z;

    /* JADX INFO: renamed from: l.xne$a */
    public class C21180a extends RecyclerView.AbstractC0582t {
        public C21180a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (vwb.m200296J(xne.this.f193660E) || xne.this.f193660E.size() <= 10 || recyclerView.canScrollHorizontally(1)) {
                return;
            }
            xne.this.f193659D.m138507L(true);
        }
    }

    public xne(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f193658C = new HashMap();
        this.f193662G = new ArrayList();
    }

    /* JADX INFO: renamed from: S */
    public View m210156S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yne.m215408b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final void m210157T() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m131825w().getContext());
        linearLayoutManager.setOrientation(0);
        this.f193659D = new iv10(this.f193657B, mo52800O());
        this.f193657B.setLayoutManager(linearLayoutManager);
        this.f193657B.addOnScrollListener(new C21180a());
        this.f193657B.setAdapter(this.f193659D);
    }

    /* JADX INFO: renamed from: U */
    public void mo146691U() {
        if (vwb.m200296J(this.f193661F)) {
            return;
        }
        this.f193660E = BookMoviesDramasHelper.m59444k(this.f193661F);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f193664v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f193666x.setTypeface(typeface);
        this.f193668z.setTypeface(typeface);
        xdl0.m208358V(this.f193657B, t100.m186890d(20.0f));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        j760<List<Literatures>, List<LiteraturesComments>> j760VarMo51062H3 = mo52800O().mo51062H3();
        if (NullChecker.m81303a(j760VarMo51062H3)) {
            this.f193660E = j760VarMo51062H3.f116564a;
            this.f193661F = j760VarMo51062H3.f116565b;
        }
        if (mo52800O().mo51119m0()) {
            return (vwb.m200296J(this.f193660E) && vwb.m200296J(this.f193661F)) ? false : true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f193666x) {
            zvf0.m220396r("e_add_artwork_entrance", "p_edit_profile_view");
            mo52800O().act().startActivity(MkWebViewAct.m80236a2(mo52800O().act(), "", C4750p.m34363p3()));
        } else if (view == this.f193656A) {
            mo52800O().act().startActivity(MkWebViewAct.m80236a2(mo52800O().act(), "", C4750p.m34363p3()));
        } else if (view == this.f193665w) {
            if (!mo52800O().mo51075P1()) {
                zvf0.m220396r("e_check_all_artwork_entrance", OMSDialogPositon.p_suggest_user_profile_info_view);
            }
            mo52800O().act().startActivity(MkWebViewAct.m80236a2(mo52800O().act(), "", mo52800O().mo51119m0() ? C4750p.m34363p3() : String.format(C4750p.m34364q3(), mo52800O().userId(), "0", mo52800O().from())));
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m210156S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m210157T();
        mo146691U();
        boolean z = true;
        int i = 0;
        if (vwb.m200296J(this.f193661F) && mo52800O().mo51119m0()) {
            xdl0.m208344M(this.f193666x, true);
            zvf0.m220402x("e_add_artwork_entrance", "p_edit_profile_view");
        } else {
            xdl0.m208344M(this.f193666x, false);
        }
        xdl0.m208344M(this.f193667y, mo52800O().mo51119m0() && vwb.m200296J(this.f193661F));
        xdl0.m208344M(this.f193656A, false);
        boolean z2 = this.f193660E.size() > 3;
        VImage vImage = this.f193665w;
        if ((mo52800O().mo51119m0() || !z2) && (!mo52800O().mo51119m0() || vwb.m200296J(this.f193661F))) {
            z = false;
        }
        xdl0.m208344M(vImage, z);
        if (!mo52800O().mo51075P1() && z2) {
            zvf0.m220402x("e_check_all_artwork_entrance", OMSDialogPositon.p_suggest_user_profile_info_view);
        }
        if (this.f193662G.size() == 0) {
            if (vwb.m200296J(this.f193661F)) {
                this.f193662G = new ArrayList();
            } else {
                this.f193662G = new ArrayList(this.f193660E);
            }
        }
        if (NullChecker.m81303a(this.f193659D)) {
            this.f193659D.m138505J(this.f193662G);
        }
        iv10 iv10Var = this.f193659D;
        Act act = mo52800O().act();
        List<Literatures> list = this.f193660E;
        iv10Var.m138506K(act, list.subList(0, Math.min(list.size(), 10)), this.f193661F, this.f193658C);
        VText vText = this.f193664v;
        if (vwb.m200296J(this.f193661F) && vwb.m200296J(wn90.m204602F().m204639H()) && mo52800O().mo51119m0()) {
            i = upa.m194797p().weight.myrecent;
        }
        m96419P(vText, "我的书影剧", i);
        xdl0.m208329E0(this.f193666x, this);
        xdl0.m208329E0(this.f193656A, this);
        xdl0.m208329E0(this.f193665w, this);
    }
}

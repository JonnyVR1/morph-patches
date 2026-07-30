package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.lqa;
import l.mcr;
import l.o53;
import l.upa;
import l.vwb;
import l.wn90;
import l.xdl0;
import l.yje;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VLinear_Dividers;
import v.VRecyclerView;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xje extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f22315u;

    /* JADX INFO: renamed from: v */
    public VLinear f22316v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f22317w;

    /* JADX INFO: renamed from: x */
    public VImage f22318x;

    /* JADX INFO: renamed from: y */
    public VRecyclerView f22319y;

    /* JADX INFO: renamed from: z */
    public VLinear f22320z;

    public xje(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    public View m25988U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yje.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m25989V() {
        zvf0.r("e_add_artwork_entrance", "p_edit_profile_view");
        mo3351O().act().startActivity(MkWebViewAct.a2(mo3351O().act(), "", String.format(p.q3(), mo3351O().userId(), "0", mo3351O().from())));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m25990W(View view) {
        m25989V();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m25991X(View view) {
        m25989V();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m25992Y(View view) {
        zvf0.r("e_add_artwork_entrance", "p_edit_profile_view");
        mo3351O().act().startActivity(MkWebViewAct.a2(mo3351O().act(), "", p.p3()));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m25988U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        List listL = BookMoviesDramasHelper.l(((DbObject) CoreModule.c.e0.p9()).id);
        this.f22319y.setLayoutManager(new GridLayoutManager(mo3351O().act(), 2));
        this.f22319y.setAdapter(new o53(mo3351O().act(), true, vwb.k0(listL, 4)));
        if (!lqa.w()) {
            m9650P(this.f22317w, "我的书影剧", (vwb.J(listL) && vwb.J(wn90.F().H()) && mo3351O().mo1570m0()) ? upa.p().weight.myrecent : 0);
        }
        xdl0.E0(this.f22317w, new View.OnClickListener() { // from class: l.uje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20675a.m25990W(view);
            }
        });
        xdl0.E0(this.f22318x, new View.OnClickListener() { // from class: l.vje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21189a.m25991X(view);
            }
        });
        xdl0.E0(this.f22320z, new View.OnClickListener() { // from class: l.wje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21802a.m25992Y(view);
            }
        });
        xdl0.M(this.f22318x, !vwb.J(listL));
    }
}

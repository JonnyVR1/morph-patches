package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.e9f;
import l.mcr;
import l.o53;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VLinear_Dividers;
import v.VRecyclerView;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d9f extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f9120u;

    /* JADX INFO: renamed from: v */
    public VRecyclerView f9121v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f9122w;

    public d9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    public View m11660U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e9f.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m11661V() {
        zvf0.r("e_add_artwork_entrance", "p_edit_profile_view");
        m1624x().act().startActivity(MkWebViewAct.a2(m1624x().act(), "", String.format(p.q3(), m1624x().userId(), "0", m1624x().from())));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m11662W(View view) {
        m11661V();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m11663X(View view) {
        zvf0.r("e_add_artwork_entrance", "p_edit_profile_view");
        m1624x().act().startActivity(MkWebViewAct.a2(m1624x().act(), "", p.p3()));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的书影剧";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "book";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        return m11660U(m1624x().mo9267H2(), viewGroup);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        List listL = BookMoviesDramasHelper.l(((DbObject) CoreModule.c.e0.p9()).id);
        this.f9121v.setLayoutManager(new GridLayoutManager(m1624x().act(), 2));
        this.f9121v.setAdapter(new o53(m1624x().act(), true, vwb.k0(listL, 4)));
        m1599D(new View.OnClickListener() { // from class: l.b9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8041a.m11662W(view);
            }
        });
        xdl0.E0(this.f9122w, new View.OnClickListener() { // from class: l.c9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8564a.m11663X(view);
            }
        });
        m1598C(!vwb.J(listL));
    }
}

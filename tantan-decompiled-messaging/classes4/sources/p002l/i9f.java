package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.newui.home.card.expanded.holder.item.BooksMoviesDramasItem;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.f6c0;
import l.mcr;
import l.u4c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i9f extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public VLinear f13115u;

    /* JADX INFO: renamed from: v */
    public View f13116v;

    /* JADX INFO: renamed from: w */
    public List<BooksMoviesDramasItem> f13117w;

    public i9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m15054V(View view) {
        zvf0.r("e_add_artwork_entrance", "p_edit_profile_view");
        m1624x().act().startActivity(MkWebViewAct.a2(m1624x().act(), "", String.format(p.q3(), m1624x().userId(), "0", m1624x().from())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m15055W(View view) {
        zvf0.r("e_add_artwork_entrance", "p_edit_profile_view");
        m1624x().act().startActivity(MkWebViewAct.a2(m1624x().act(), "", p.p3()));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m15056X(List list, LiteraturesComments literaturesComments) {
        list.remove(literaturesComments);
        mo1626z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的书影";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "book";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.p2, (ViewGroup) null);
        this.f13115u = viewInflate.findViewById(u4c0.O1);
        this.f13116v = viewInflate.findViewById(u4c0.r);
        ArrayList arrayList = new ArrayList();
        this.f13117w = arrayList;
        arrayList.add(viewInflate.findViewById(u4c0.x8));
        this.f13117w.add((BooksMoviesDramasItem) viewInflate.findViewById(u4c0.y8));
        this.f13117w.add((BooksMoviesDramasItem) viewInflate.findViewById(u4c0.z8));
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        m1599D(new View.OnClickListener() { // from class: l.f9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10198a.m15054V(view);
            }
        });
        xdl0.E0(this.f13116v, new View.OnClickListener() { // from class: l.g9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11310a.m15055W(view);
            }
        });
        final List listL = BookMoviesDramasHelper.l(((DbObject) CoreModule.c.e0.p9()).id);
        if (vwb.J(listL)) {
            m1598C(false);
            xdl0.M(this.f13115u, false);
            return;
        }
        m1598C(true);
        xdl0.M(this.f13115u, true);
        for (int i = 0; i < this.f13117w.size(); i++) {
            if (i < listL.size()) {
                LiteraturesComments literaturesComments = (LiteraturesComments) listL.get(i);
                xdl0.M(this.f13117w.get(i), true);
                this.f13117w.get(i).e(m1624x().act(), ((DbObject) CoreModule.c.e0.p9()).id, true, true, "", literaturesComments.localLiteratures, literaturesComments, i, new e30() { // from class: l.h9f
                    public final void call(Object obj) {
                        this.f11949a.m15056X(listL, (LiteraturesComments) obj);
                    }
                });
            } else {
                xdl0.M(this.f13117w.get(i), false);
            }
        }
    }
}

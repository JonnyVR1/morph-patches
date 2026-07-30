package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.item.BooksMoviesDramasItem;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class oaf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public VLinear f145706u;

    /* JADX INFO: renamed from: v */
    public View f145707v;

    /* JADX INFO: renamed from: w */
    public List<BooksMoviesDramasItem> f145708w;

    public oaf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m166835V(View view) {
        i4g0.m138520r("e_add_artwork_entrance", "p_edit_profile_view");
        m52355x().act().startActivity(MkWebViewAct.m81419b2(m52355x().act(), "", String.format(C4901p.m35367q3(), m52355x().userId(), "0", m52355x().from())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m166836W(View view) {
        i4g0.m138520r("e_add_artwork_entrance", "p_edit_profile_view");
        m52355x().act().startActivity(MkWebViewAct.m81419b2(m52355x().act(), "", C4901p.m35366p3()));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m166837X(List list, LiteraturesComments literaturesComments) {
        list.remove(literaturesComments);
        mo52357z();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的书影";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "book";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125993p2, (ViewGroup) null);
        this.f145706u = (VLinear) viewInflate.findViewById(adc0.f70044O1);
        this.f145707v = viewInflate.findViewById(adc0.f70530r);
        ArrayList arrayList = new ArrayList();
        this.f145708w = arrayList;
        arrayList.add((BooksMoviesDramasItem) viewInflate.findViewById(adc0.f70675z8));
        this.f145708w.add((BooksMoviesDramasItem) viewInflate.findViewById(adc0.f69813A8));
        this.f145708w.add((BooksMoviesDramasItem) viewInflate.findViewById(adc0.f69830B8));
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        m52330D(new View.OnClickListener() { // from class: l.laf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130690a.m166835V(view);
            }
        });
        bnl0.m105509E0(this.f145707v, new View.OnClickListener() { // from class: l.maf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135513a.m166836W(view);
            }
        });
        final List<LiteraturesComments> listM60629l = BookMoviesDramasHelper.m60629l(CoreModule.f18264c.f20381e0.m116600p9().f56859id);
        if (jyb.m147479J(listM60629l)) {
            m52329C(false);
            bnl0.m105524M(this.f145706u, false);
            return;
        }
        m52329C(true);
        bnl0.m105524M(this.f145706u, true);
        for (int i = 0; i < this.f145708w.size(); i++) {
            if (i < listM60629l.size()) {
                LiteraturesComments literaturesComments = listM60629l.get(i);
                bnl0.m105524M(this.f145708w.get(i), true);
                this.f145708w.get(i).m39174e(m52355x().act(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, true, true, "", literaturesComments.localLiteratures, literaturesComments, i, new y20() { // from class: l.naf
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f141010a.m166837X(listM60629l, (LiteraturesComments) obj);
                    }
                });
            } else {
                bnl0.m105524M(this.f145708w.get(i), false);
            }
        }
    }
}

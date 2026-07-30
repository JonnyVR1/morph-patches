package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.item.BooksMoviesDramasItem;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class i9f extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public VLinear f112211u;

    /* JADX INFO: renamed from: v */
    public View f112212v;

    /* JADX INFO: renamed from: w */
    public List<BooksMoviesDramasItem> f112213w;

    public i9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m135051V(View view) {
        zvf0.m220396r("e_add_artwork_entrance", "p_edit_profile_view");
        m51172x().act().startActivity(MkWebViewAct.m80236a2(m51172x().act(), "", String.format(C4750p.m34364q3(), m51172x().userId(), "0", m51172x().from())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m135052W(View view) {
        zvf0.m220396r("e_add_artwork_entrance", "p_edit_profile_view");
        m51172x().act().startActivity(MkWebViewAct.m80236a2(m51172x().act(), "", C4750p.m34363p3()));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m135053X(List list, LiteraturesComments literaturesComments) {
        list.remove(literaturesComments);
        mo51174z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的书影";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "book";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95939p2, (ViewGroup) null);
        this.f112211u = (VLinear) viewInflate.findViewById(u4c0.f173956O1);
        this.f112212v = viewInflate.findViewById(u4c0.f174439r);
        ArrayList arrayList = new ArrayList();
        this.f112213w = arrayList;
        arrayList.add((BooksMoviesDramasItem) viewInflate.findViewById(u4c0.f174550x8));
        this.f112213w.add((BooksMoviesDramasItem) viewInflate.findViewById(u4c0.f174567y8));
        this.f112213w.add((BooksMoviesDramasItem) viewInflate.findViewById(u4c0.f174584z8));
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        m51147D(new View.OnClickListener() { // from class: l.f9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96483a.m135051V(view);
            }
        });
        xdl0.m208329E0(this.f112212v, new View.OnClickListener() { // from class: l.g9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101560a.m135052W(view);
            }
        });
        final List<LiteraturesComments> listM59445l = BookMoviesDramasHelper.m59445l(CoreModule.f17545c.f19639e0.m169527p9().f56011id);
        if (vwb.m200296J(listM59445l)) {
            m51146C(false);
            xdl0.m208344M(this.f112211u, false);
            return;
        }
        m51146C(true);
        xdl0.m208344M(this.f112211u, true);
        for (int i = 0; i < this.f112213w.size(); i++) {
            if (i < listM59445l.size()) {
                LiteraturesComments literaturesComments = listM59445l.get(i);
                xdl0.m208344M(this.f112213w.get(i), true);
                this.f112213w.get(i).m38171e(m51172x().act(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, true, true, "", literaturesComments.localLiteratures, literaturesComments, i, new e30() { // from class: l.h9f
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f106574a.m135053X(listM59445l, (LiteraturesComments) obj);
                    }
                });
            } else {
                xdl0.m208344M(this.f112213w.get(i), false);
            }
        }
    }
}

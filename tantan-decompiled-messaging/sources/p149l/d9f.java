package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.List;
import p147v.VLinear_Dividers;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class d9f extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f85115u;

    /* JADX INFO: renamed from: v */
    public VRecyclerView f85116v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f85117w;

    public d9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    public View m110457U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e9f.m115349b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m110458V() {
        zvf0.m220396r("e_add_artwork_entrance", "p_edit_profile_view");
        m51172x().act().startActivity(MkWebViewAct.m80236a2(m51172x().act(), "", String.format(C4750p.m34364q3(), m51172x().userId(), "0", m51172x().from())));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m110459W(View view) {
        m110458V();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m110460X(View view) {
        zvf0.m220396r("e_add_artwork_entrance", "p_edit_profile_view");
        m51172x().act().startActivity(MkWebViewAct.m80236a2(m51172x().act(), "", C4750p.m34363p3()));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的书影剧";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "book";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        return m110457U(m51172x().mo94568H2(), viewGroup);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        List<LiteraturesComments> listM59445l = BookMoviesDramasHelper.m59445l(CoreModule.f17545c.f19639e0.m169527p9().f56011id);
        this.f85116v.setLayoutManager(new GridLayoutManager(m51172x().act(), 2));
        this.f85116v.setAdapter(new o53(m51172x().act(), true, vwb.m200334k0(listM59445l, 4)));
        m51147D(new View.OnClickListener() { // from class: l.b9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74571a.m110459W(view);
            }
        });
        xdl0.m208329E0(this.f85117w, new View.OnClickListener() { // from class: l.c9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79927a.m110460X(view);
            }
        });
        m51146C(!vwb.m200296J(listM59445l));
    }
}

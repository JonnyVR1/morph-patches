package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.List;
import p151v.VLinear_Dividers;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class jaf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f118977u;

    /* JADX INFO: renamed from: v */
    public VRecyclerView f118978v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f118979w;

    public jaf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: U */
    public View m144019U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kaf.m148945b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m144020V() {
        i4g0.m138520r("e_add_artwork_entrance", "p_edit_profile_view");
        m52355x().act().startActivity(MkWebViewAct.m81419b2(m52355x().act(), "", String.format(C4901p.m35367q3(), m52355x().userId(), "0", m52355x().from())));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m144021W(View view) {
        m144020V();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m144022X(View view) {
        i4g0.m138520r("e_add_artwork_entrance", "p_edit_profile_view");
        m52355x().act().startActivity(MkWebViewAct.m81419b2(m52355x().act(), "", C4901p.m35366p3()));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的书影剧";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "book";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        return m144019U(m52355x().mo146493H2(), viewGroup);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        List<LiteraturesComments> listM60629l = BookMoviesDramasHelper.m60629l(CoreModule.f18264c.f20381e0.m116600p9().f56859id);
        this.f118978v.setLayoutManager(new GridLayoutManager(m52355x().act(), 2));
        this.f118978v.setAdapter(new e63(m52355x().act(), true, jyb.m147517k0(listM60629l, 4)));
        m52330D(new View.OnClickListener() { // from class: l.haf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108493a.m144021W(view);
            }
        });
        bnl0.m105509E0(this.f118979w, new View.OnClickListener() { // from class: l.iaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113592a.m144022X(view);
            }
        });
        m52329C(!jyb.m147479J(listM60629l));
    }
}

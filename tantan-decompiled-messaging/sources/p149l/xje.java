package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class xje extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f193207u;

    /* JADX INFO: renamed from: v */
    public VLinear f193208v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f193209w;

    /* JADX INFO: renamed from: x */
    public VImage f193210x;

    /* JADX INFO: renamed from: y */
    public VRecyclerView f193211y;

    /* JADX INFO: renamed from: z */
    public VLinear f193212z;

    public xje(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    public View m209694U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yje.m215064b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m209695V() {
        zvf0.m220396r("e_add_artwork_entrance", "p_edit_profile_view");
        mo52800O().act().startActivity(MkWebViewAct.m80236a2(mo52800O().act(), "", String.format(C4750p.m34364q3(), mo52800O().userId(), "0", mo52800O().from())));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m209696W(View view) {
        m209695V();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m209697X(View view) {
        m209695V();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m209698Y(View view) {
        zvf0.m220396r("e_add_artwork_entrance", "p_edit_profile_view");
        mo52800O().act().startActivity(MkWebViewAct.m80236a2(mo52800O().act(), "", C4750p.m34363p3()));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m209694U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        List<LiteraturesComments> listM59445l = BookMoviesDramasHelper.m59445l(CoreModule.f17545c.f19639e0.m169527p9().f56011id);
        this.f193211y.setLayoutManager(new GridLayoutManager(mo52800O().act(), 2));
        this.f193211y.setAdapter(new o53(mo52800O().act(), true, vwb.m200334k0(listM59445l, 4)));
        if (!lqa.m150985w()) {
            m96419P(this.f193209w, "我的书影剧", (vwb.m200296J(listM59445l) && vwb.m200296J(wn90.m204602F().m204639H()) && mo52800O().mo51119m0()) ? upa.m194797p().weight.myrecent : 0);
        }
        xdl0.m208329E0(this.f193209w, new View.OnClickListener() { // from class: l.uje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176762a.m209696W(view);
            }
        });
        xdl0.m208329E0(this.f193210x, new View.OnClickListener() { // from class: l.vje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181682a.m209697X(view);
            }
        });
        xdl0.m208329E0(this.f193212z, new View.OnClickListener() { // from class: l.wje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186628a.m209698Y(view);
            }
        });
        xdl0.m208344M(this.f193210x, !vwb.m200296J(listM59445l));
    }
}

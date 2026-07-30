package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes4.dex */
public class ble extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f77186u;

    /* JADX INFO: renamed from: v */
    public VLinear f77187v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f77188w;

    /* JADX INFO: renamed from: x */
    public VImage f77189x;

    /* JADX INFO: renamed from: y */
    public VRecyclerView f77190y;

    /* JADX INFO: renamed from: z */
    public VLinear f77191z;

    public ble(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: U */
    public View m104908U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cle.m110589b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m104909V() {
        i4g0.m138520r("e_add_artwork_entrance", "p_edit_profile_view");
        mo53983O().act().startActivity(MkWebViewAct.m81419b2(mo53983O().act(), "", String.format(C4901p.m35367q3(), mo53983O().userId(), "0", mo53983O().from())));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m104910W(View view) {
        m104909V();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m104911X(View view) {
        m104909V();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m104912Y(View view) {
        i4g0.m138520r("e_add_artwork_entrance", "p_edit_profile_view");
        mo53983O().act().startActivity(MkWebViewAct.m81419b2(mo53983O().act(), "", C4901p.m35366p3()));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m104908U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        List<LiteraturesComments> listM60629l = BookMoviesDramasHelper.m60629l(CoreModule.f18264c.f20381e0.m116600p9().f56859id);
        this.f77190y.setLayoutManager(new GridLayoutManager(mo53983O().act(), 2));
        this.f77190y.setAdapter(new e63(mo53983O().act(), true, jyb.m147517k0(listM60629l, 4)));
        if (!xra.m212804w()) {
            m121844P(this.f77188w, "我的书影剧", (jyb.m147479J(listM60629l) && jyb.m147479J(aw90.m100562F().m100599H()) && mo53983O().mo52302m0()) ? gra.m131728p().weight.myrecent : 0);
        }
        bnl0.m105509E0(this.f77188w, new View.OnClickListener() { // from class: l.yke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200385a.m104910W(view);
            }
        });
        bnl0.m105509E0(this.f77189x, new View.OnClickListener() { // from class: l.zke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204770a.m104911X(view);
            }
        });
        bnl0.m105509E0(this.f77191z, new View.OnClickListener() { // from class: l.ale
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72102a.m104912Y(view);
            }
        });
        bnl0.m105524M(this.f77189x, !jyb.m147479J(listM60629l));
    }
}

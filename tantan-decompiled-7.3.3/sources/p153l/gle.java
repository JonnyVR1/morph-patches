package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gle extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f104840u;

    /* JADX INFO: renamed from: v */
    public VText f104841v;

    /* JADX INFO: renamed from: w */
    public ImageView f104842w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f104843x;

    /* JADX INFO: renamed from: y */
    public VText f104844y;

    /* JADX INFO: renamed from: z */
    public VText f104845z;

    public gle(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m130645W(View view) {
        m130649V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m130646X(View view) {
        m130649V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m130647Y(View view) {
        m130649V();
    }

    /* JADX INFO: renamed from: U */
    public View m130648U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hle.m135698b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m130649V() {
        sfj0.m185596c("e_dislike_type_entrance", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.DO_NOT_WISH);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: d */
    public int mo130650d() {
        return qa00.f156321h;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m130648U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        VText vText = this.f104845z;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f104841v.setTypeface(typeface);
        this.f104844y.setTypeface(typeface);
        sfj0.m185601h("e_dislike_type_entrance", "p_edit_profile_view", new sfj0.C20032a[0]);
        boolean zM192430r = tr90.m192430r(mo53983O().m189086i2());
        LinearLayout linearLayout = this.f104843x;
        if (zM192430r) {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(this.f104845z, true);
            bnl0.m105524M(this.f104842w, true);
            this.f104845z.setText(mo53983O().m189086i2().profile.extensions.basic.unideal.get(0));
        } else {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(this.f104845z, false);
            bnl0.m105524M(this.f104842w, false);
        }
        bnl0.m105509E0(this.f104845z, new View.OnClickListener() { // from class: l.dle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89528a.m130645W(view);
            }
        });
        bnl0.m105509E0(this.f104843x, new View.OnClickListener() { // from class: l.ele
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94512a.m130646X(view);
            }
        });
        bnl0.m105509E0(this.f104842w, new View.OnClickListener() { // from class: l.fle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99639a.m130647Y(view);
            }
        });
    }
}

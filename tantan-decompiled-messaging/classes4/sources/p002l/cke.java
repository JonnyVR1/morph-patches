package p002l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import l.dke;
import l.mcr;
import l.o6j0;
import l.pj90;
import l.t100;
import l.xdl0;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cke extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f8724u;

    /* JADX INFO: renamed from: v */
    public VText f8725v;

    /* JADX INFO: renamed from: w */
    public ImageView f8726w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f8727x;

    /* JADX INFO: renamed from: y */
    public VText f8728y;

    /* JADX INFO: renamed from: z */
    public VText f8729z;

    public cke(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m11095W(View view) {
        m11099V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m11096X(View view) {
        m11099V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m11097Y(View view) {
        m11099V();
    }

    /* JADX INFO: renamed from: U */
    public View m11098U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dke.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m11099V() {
        o6j0.c("e_dislike_type_entrance", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.DO_NOT_WISH);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: d */
    public int mo11100d() {
        return t100.h;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m11098U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        VText vText = this.f8729z;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f8725v.setTypeface(typeface);
        this.f8728y.setTypeface(typeface);
        o6j0.h("e_dislike_type_entrance", "p_edit_profile_view", new o6j0.a[0]);
        boolean zR = pj90.r(mo3351O().m9268i2());
        LinearLayout linearLayout = this.f8727x;
        if (zR) {
            xdl0.M(linearLayout, false);
            xdl0.M(this.f8729z, true);
            xdl0.M(this.f8726w, true);
            this.f8729z.setText((CharSequence) mo3351O().m9268i2().profile.extensions.basic.unideal.get(0));
        } else {
            xdl0.M(linearLayout, true);
            xdl0.M(this.f8729z, false);
            xdl0.M(this.f8726w, false);
        }
        xdl0.E0(this.f8729z, new View.OnClickListener() { // from class: l.zje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23452a.m11095W(view);
            }
        });
        xdl0.E0(this.f8727x, new View.OnClickListener() { // from class: l.ake
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7670a.m11096X(view);
            }
        });
        xdl0.E0(this.f8726w, new View.OnClickListener() { // from class: l.bke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8209a.m11097Y(view);
            }
        });
    }
}

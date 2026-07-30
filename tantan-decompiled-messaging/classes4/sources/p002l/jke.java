package p002l;

import android.graphics.Typeface;
import android.os.ResultReceiver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.view.CommonLabelShowView;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import java.util.List;
import l.kke;
import l.lqa;
import l.mcr;
import l.pj90;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jke extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f13846u;

    /* JADX INFO: renamed from: v */
    public VText f13847v;

    /* JADX INFO: renamed from: w */
    public ImageView f13848w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f13849x;

    /* JADX INFO: renamed from: y */
    public VText f13850y;

    /* JADX INFO: renamed from: z */
    public CommonLabelShowView f13851z;

    public jke(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ LabelData m15986R(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m15990X(View view) {
        m15993W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m15991Y(View view) {
        m15993W();
    }

    /* JADX INFO: renamed from: V */
    public View m15992V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kke.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public final void m15993W() {
        zvf0.r("e_ideal_type_entrance", "p_edit_profile_view");
        mo3351O().act().startActivity(MkWebViewAct.e2(mo3351O().act(), "", pj90.p, true, true, true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m15994Z(View view) {
        m15993W();
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
        return m15992V(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        VText vText = this.f13850y;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f13847v.setTypeface(typeface);
        m9650P(this.f13847v, "我的理想型", pj90.s(CoreModule.c.e0.p9()) ? 0 : lqa.s().weight.idealType);
        zvf0.x("e_ideal_type_entrance", "p_edit_profile_view");
        if (!pj90.s(CoreModule.c.e0.p9())) {
            xdl0.M(this.f13849x, true);
            xdl0.M(this.f13851z, false);
            xdl0.M(this.f13848w, false);
            xdl0.E0(this.f13849x, new View.OnClickListener() { // from class: l.ike
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13285a.m15994Z(view);
                }
            });
            return;
        }
        List list = CoreModule.c.e0.p9().profile.extensions.basic.ideal;
        xdl0.M(this.f13849x, false);
        xdl0.M(this.f13851z, true);
        xdl0.M(this.f13848w, true);
        this.f13851z.setLabel(vwb.Q(list, new w9j() { // from class: l.fke
            public final Object call(Object obj) {
                return jke.m15986R((IdealTag) obj);
            }
        }));
        xdl0.E0(this.f13848w, new View.OnClickListener() { // from class: l.gke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11485a.m15990X(view);
            }
        });
        xdl0.E0(this.f13851z, new View.OnClickListener() { // from class: l.hke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12094a.m15991Y(view);
            }
        });
    }
}

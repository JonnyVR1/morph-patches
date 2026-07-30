package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.view.CommonLabelShowView;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.List;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nle extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f142533u;

    /* JADX INFO: renamed from: v */
    public VText f142534v;

    /* JADX INFO: renamed from: w */
    public ImageView f142535w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f142536x;

    /* JADX INFO: renamed from: y */
    public VText f142537y;

    /* JADX INFO: renamed from: z */
    public CommonLabelShowView f142538z;

    public nle(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ LabelData m163676R(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m163680X(View view) {
        m163683W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m163681Y(View view) {
        m163683W();
    }

    /* JADX INFO: renamed from: V */
    public View m163682V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ole.m168103b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public final void m163683W() {
        i4g0.m138520r("e_ideal_type_entrance", "p_edit_profile_view");
        mo53983O().act().startActivity(MkWebViewAct.m81423g2(mo53983O().act(), "", tr90.f175822p, true, true, true, true, null));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m163684Z(View view) {
        m163683W();
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
        return m163682V(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        VText vText = this.f142537y;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f142534v.setTypeface(typeface);
        m121844P(this.f142534v, "我的理想型", tr90.m192431s(CoreModule.f18264c.f20381e0.m116600p9()) ? 0 : xra.m212800s().weight.idealType);
        i4g0.m138526x("e_ideal_type_entrance", "p_edit_profile_view");
        if (!tr90.m192431s(CoreModule.f18264c.f20381e0.m116600p9())) {
            bnl0.m105524M(this.f142536x, true);
            bnl0.m105524M(this.f142538z, false);
            bnl0.m105524M(this.f142535w, false);
            bnl0.m105509E0(this.f142536x, new View.OnClickListener() { // from class: l.mle
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137391a.m163684Z(view);
                }
            });
            return;
        }
        List<IdealTag> list = CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.basic.ideal;
        bnl0.m105524M(this.f142536x, false);
        bnl0.m105524M(this.f142538z, true);
        bnl0.m105524M(this.f142535w, true);
        this.f142538z.setLabel(jyb.m147486Q(list, new qcj() { // from class: l.jle
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return nle.m163676R((IdealTag) obj);
            }
        }));
        bnl0.m105509E0(this.f142535w, new View.OnClickListener() { // from class: l.kle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127365a.m163680X(view);
            }
        });
        bnl0.m105509E0(this.f142538z, new View.OnClickListener() { // from class: l.lle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132542a.m163681Y(view);
            }
        });
    }
}

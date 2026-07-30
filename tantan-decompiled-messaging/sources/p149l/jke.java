package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.view.CommonLabelShowView;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.List;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jke extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f118366u;

    /* JADX INFO: renamed from: v */
    public VText f118367v;

    /* JADX INFO: renamed from: w */
    public ImageView f118368w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f118369x;

    /* JADX INFO: renamed from: y */
    public VText f118370y;

    /* JADX INFO: renamed from: z */
    public CommonLabelShowView f118371z;

    public jke(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ LabelData m141859R(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m141863X(View view) {
        m141866W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m141864Y(View view) {
        m141866W();
    }

    /* JADX INFO: renamed from: V */
    public View m141865V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kke.m146318b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public final void m141866W() {
        zvf0.m220396r("e_ideal_type_entrance", "p_edit_profile_view");
        mo52800O().act().startActivity(MkWebViewAct.m80240e2(mo52800O().act(), "", pj90.f149728p, true, true, true, true, null));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m141867Z(View view) {
        m141866W();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: d */
    public int mo107404d() {
        return t100.f167259h;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m141865V(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        VText vText = this.f118370y;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f118367v.setTypeface(typeface);
        m96419P(this.f118367v, "我的理想型", pj90.m169806s(CoreModule.f17545c.f19639e0.m169527p9()) ? 0 : lqa.m150981s().weight.idealType);
        zvf0.m220402x("e_ideal_type_entrance", "p_edit_profile_view");
        if (!pj90.m169806s(CoreModule.f17545c.f19639e0.m169527p9())) {
            xdl0.m208344M(this.f118369x, true);
            xdl0.m208344M(this.f118371z, false);
            xdl0.m208344M(this.f118368w, false);
            xdl0.m208329E0(this.f118369x, new View.OnClickListener() { // from class: l.ike
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113657a.m141867Z(view);
                }
            });
            return;
        }
        List<IdealTag> list = CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.basic.ideal;
        xdl0.m208344M(this.f118369x, false);
        xdl0.m208344M(this.f118371z, true);
        xdl0.m208344M(this.f118368w, true);
        this.f118371z.setLabel(vwb.m200303Q(list, new w9j() { // from class: l.fke
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jke.m141859R((IdealTag) obj);
            }
        }));
        xdl0.m208329E0(this.f118368w, new View.OnClickListener() { // from class: l.gke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103186a.m141863X(view);
            }
        });
        xdl0.m208329E0(this.f118371z, new View.OnClickListener() { // from class: l.hke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108181a.m141864Y(view);
            }
        });
    }
}

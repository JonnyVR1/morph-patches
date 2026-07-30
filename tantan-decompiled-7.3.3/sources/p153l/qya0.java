package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qya0 extends ewa0 {

    /* JADX INFO: renamed from: U */
    public TextView f160124U;

    /* JADX INFO: renamed from: V */
    public FrameLayout f160125V;

    /* JADX INFO: renamed from: W */
    public View f160126W;

    public qya0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        m122925u0(mo53983O().from());
    }

    @Override // p153l.ewa0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.ewa0, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return super.mo53912l();
    }

    @Override // p153l.ewa0
    /* JADX INFO: renamed from: r0 */
    public void mo122923r0(boolean z) {
        this.f160124U.setText(z ? "" : k3d0.m148007c(R$string.f18462Fl));
        TextView textView = this.f160124U;
        if (z) {
            bnl0.m105565l(textView, k3d0.m148006b(dbc0.f87428ss));
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        bnl0.m105524M(this.f160125V, !z);
        bnl0.m105548c0(this.f96125v, z ? qa00.f156330q : qa00.f156323j);
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f125326Aa, viewGroup, false);
        m178626y0(viewInflate);
        return viewInflate;
    }

    @Override // p153l.ewa0, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
        m178627z0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m178626y0(View view) {
        this.f96124u = (LinearLayout) view.findViewById(adc0.f70624w8);
        this.f96125v = (VLinear) view.findViewById(adc0.f70590u8);
        this.f96126w = (VText) view.findViewById(adc0.f70641x8);
        this.f96108E = (VRelative) view.findViewById(adc0.f69866Da);
        this.f96109F = (VDraweeView) view.findViewById(adc0.f69900Fa);
        this.f96110G = (VText) view.findViewById(adc0.f69849Ca);
        this.f96111H = (VLinear) view.findViewById(adc0.f69883Ea);
        this.f96112I = (VText) view.findViewById(adc0.f69934Ha);
        this.f96113J = (VText) view.findViewById(adc0.f69917Ga);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(adc0.f70133T5);
        this.f96127x = vDraweeView;
        this.f96128y = (VDraweeView) vDraweeView.findViewById(adc0.f70031N5);
        VDraweeView vDraweeView2 = (VDraweeView) view.findViewById(adc0.f70150U5);
        this.f96129z = vDraweeView2;
        this.f96104A = (VDraweeView) vDraweeView2.findViewById(adc0.f70031N5);
        VDraweeView vDraweeView3 = (VDraweeView) view.findViewById(adc0.f70167V5);
        this.f96105B = vDraweeView3;
        this.f96106C = (VDraweeView) vDraweeView3.findViewById(adc0.f70031N5);
        this.f96107D = (RelativeLayout) view.findViewById(adc0.f70399j4);
        this.f160125V = (FrameLayout) view.findViewById(adc0.f70146U1);
        this.f160126W = view.findViewById(adc0.f70163V1);
        this.f96114K = view.findViewById(adc0.f70008M);
        this.f160124U = (TextView) view.findViewById(adc0.f69901Fb);
        if ("from_guess_liker_result".equals(mo53983O().from())) {
            bnl0.m105525M0(this.f160124U, false);
        }
        this.f96123T = (VLinear) view.findViewById(adc0.f70607v8);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m178627z0() {
        qza0.m178765a(this.f96126w);
        this.f160124U.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105538V(this.f96107D, qa00.f156318e);
        if (xra.m212796o()) {
            bnl0.m105539W(this.f96107D, qa00.f156323j);
        }
    }
}

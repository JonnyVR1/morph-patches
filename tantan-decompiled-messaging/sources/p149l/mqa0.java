package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mqa0 extends aoa0 {

    /* JADX INFO: renamed from: U */
    public TextView f135202U;

    /* JADX INFO: renamed from: V */
    public FrameLayout f135203V;

    /* JADX INFO: renamed from: W */
    public View f135204W;

    public mqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        m97874u0(mo52800O().from());
    }

    @Override // p149l.aoa0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.aoa0, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return super.mo52729l();
    }

    @Override // p149l.aoa0
    /* JADX INFO: renamed from: r0 */
    public void mo97872r0(boolean z) {
        this.f135202U.setText(z ? "" : hvc0.m133156c(R$string.f18644jl));
        TextView textView = this.f135202U;
        if (z) {
            xdl0.m208385l(textView, hvc0.m133155b(x2c0.f189309Er));
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        xdl0.m208344M(this.f135203V, !z);
        xdl0.m208368c0(this.f70821v, z ? t100.f167268q : t100.f167261j);
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f96015ta, viewGroup, false);
        m155880y0(viewInflate);
        return viewInflate;
    }

    @Override // p149l.aoa0, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
        m155881z0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m155880y0(View view) {
        this.f70820u = (LinearLayout) view.findViewById(u4c0.f174499u8);
        this.f70821v = (VLinear) view.findViewById(u4c0.f174465s8);
        this.f70822w = (VText) view.findViewById(u4c0.f174516v8);
        this.f70804E = (VRelative) view.findViewById(u4c0.f173744Ba);
        this.f70805F = (VDraweeView) view.findViewById(u4c0.f173778Da);
        this.f70806G = (VText) view.findViewById(u4c0.f173727Aa);
        this.f70807H = (VLinear) view.findViewById(u4c0.f173761Ca);
        this.f70808I = (VText) view.findViewById(u4c0.f173812Fa);
        this.f70809J = (VText) view.findViewById(u4c0.f173795Ea);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(u4c0.f174011R5);
        this.f70823x = vDraweeView;
        this.f70824y = (VDraweeView) vDraweeView.findViewById(u4c0.f173909L5);
        VDraweeView vDraweeView2 = (VDraweeView) view.findViewById(u4c0.f174028S5);
        this.f70825z = vDraweeView2;
        this.f70800A = (VDraweeView) vDraweeView2.findViewById(u4c0.f173909L5);
        VDraweeView vDraweeView3 = (VDraweeView) view.findViewById(u4c0.f174045T5);
        this.f70801B = vDraweeView3;
        this.f70802C = (VDraweeView) vDraweeView3.findViewById(u4c0.f173909L5);
        this.f70803D = (RelativeLayout) view.findViewById(u4c0.f174275h4);
        this.f135203V = (FrameLayout) view.findViewById(u4c0.f174057U1);
        this.f135204W = view.findViewById(u4c0.f174073V1);
        this.f70810K = view.findViewById(u4c0.f173920M);
        this.f135202U = (TextView) view.findViewById(u4c0.f173779Db);
        if ("from_guess_liker_result".equals(mo52800O().from())) {
            xdl0.m208345M0(this.f135202U, false);
        }
        this.f70819T = (VLinear) view.findViewById(u4c0.f174482t8);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m155881z0() {
        mra0.m156022a(this.f70822w);
        this.f135202U.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208358V(this.f70803D, t100.f167256e);
        if (lqa.m150977o()) {
            xdl0.m208359W(this.f70803D, t100.f167261j);
        }
    }
}

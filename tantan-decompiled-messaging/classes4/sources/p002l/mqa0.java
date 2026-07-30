package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.R;
import l.f6c0;
import l.hvc0;
import l.lqa;
import l.mcr;
import l.t100;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mqa0 extends aoa0 {

    /* JADX INFO: renamed from: U */
    public TextView f15587U;

    /* JADX INFO: renamed from: V */
    public FrameLayout f15588V;

    /* JADX INFO: renamed from: W */
    public View f15589W;

    public mqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        m9952u0(mo3351O().from());
    }

    @Override // p002l.aoa0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.aoa0, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return super.mo3280l();
    }

    @Override // p002l.aoa0
    /* JADX INFO: renamed from: r0 */
    public void mo9950r0(boolean z) {
        this.f15587U.setText(z ? "" : hvc0.c(R.string.jl));
        TextView textView = this.f15587U;
        if (z) {
            xdl0.l(textView, hvc0.b(x2c0.Er));
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        xdl0.M(this.f15588V, !z);
        xdl0.c0(this.f7797v, z ? t100.q : t100.j);
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.ta, viewGroup, false);
        m18133y0(viewInflate);
        return viewInflate;
    }

    @Override // p002l.aoa0, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
        m18134z0();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m18133y0(View view) {
        this.f7796u = (LinearLayout) view.findViewById(u4c0.u8);
        this.f7797v = view.findViewById(u4c0.s8);
        this.f7798w = view.findViewById(u4c0.v8);
        this.f7780E = view.findViewById(u4c0.Ba);
        this.f7781F = view.findViewById(u4c0.Da);
        this.f7782G = view.findViewById(u4c0.Aa);
        this.f7783H = view.findViewById(u4c0.Ca);
        this.f7784I = view.findViewById(u4c0.Fa);
        this.f7785J = view.findViewById(u4c0.Ea);
        VDraweeView vDraweeViewFindViewById = view.findViewById(u4c0.R5);
        this.f7799x = vDraweeViewFindViewById;
        this.f7800y = vDraweeViewFindViewById.findViewById(u4c0.L5);
        VDraweeView vDraweeViewFindViewById2 = view.findViewById(u4c0.S5);
        this.f7801z = vDraweeViewFindViewById2;
        this.f7776A = vDraweeViewFindViewById2.findViewById(u4c0.L5);
        VDraweeView vDraweeViewFindViewById3 = view.findViewById(u4c0.T5);
        this.f7777B = vDraweeViewFindViewById3;
        this.f7778C = vDraweeViewFindViewById3.findViewById(u4c0.L5);
        this.f7779D = (RelativeLayout) view.findViewById(u4c0.h4);
        this.f15588V = (FrameLayout) view.findViewById(u4c0.U1);
        this.f15589W = view.findViewById(u4c0.V1);
        this.f7786K = view.findViewById(u4c0.M);
        this.f15587U = (TextView) view.findViewById(u4c0.Db);
        if ("from_guess_liker_result".equals(mo3351O().from())) {
            xdl0.M0(this.f15587U, false);
        }
        this.f7795T = view.findViewById(u4c0.t8);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m18134z0() {
        mra0.m18142a(this.f7798w);
        this.f15587U.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.V(this.f7779D, t100.e);
        if (lqa.o()) {
            xdl0.W(this.f7779D, t100.j);
        }
    }
}

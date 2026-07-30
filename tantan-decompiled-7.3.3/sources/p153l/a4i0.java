package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinCheckstandFrag;
import com.p051p1.mobile.putong.core.pay.R$string;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes12.dex */
public class a4i0 implements iam<z3i0> {

    /* JADX INFO: renamed from: a */
    public CardView f68395a;

    /* JADX INFO: renamed from: b */
    public VText f68396b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f68397c;

    /* JADX INFO: renamed from: d */
    public CardView f68398d;

    /* JADX INFO: renamed from: e */
    public z3i0 f68399e;

    /* JADX INFO: renamed from: f */
    public TanTanCoinCheckstandFrag f68400f;

    /* JADX INFO: renamed from: l.a4i0$a */
    public static class C15636a {
        /* JADX INFO: renamed from: b */
        public static void m95943b(a4i0 a4i0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            a4i0Var.f68395a = (CardView) viewGroup.getChildAt(0);
            a4i0Var.f68396b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            a4i0Var.f68397c = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            a4i0Var.f68398d = (CardView) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m95944c(a4i0 a4i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(rec0.f162564i2, viewGroup, false);
            m95943b(a4i0Var, viewInflate);
            return viewInflate;
        }
    }

    public a4i0(TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag) {
        this.f68400f = tanTanCoinCheckstandFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f68400f.getContext();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f68400f.act();
    }

    /* JADX INFO: renamed from: e */
    public View m95937e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15636a.m95944c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z3i0 z3i0Var) {
        this.f68399e = z3i0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m95939i(String str) {
        this.f68397c.setText(str);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m95937e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m95940j(int i) {
        this.f68397c.setTextSize(i);
    }

    /* JADX INFO: renamed from: r */
    public void m95941r() {
        this.f68396b.setText(String.format("%s (%s)", this.f68400f.m21603x4(R$string.f28182W1), this.f68400f.m21603x4(l9n.m153440e())));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

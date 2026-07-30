package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinCheckstandFrag;
import com.p046p1.mobile.putong.core.pay.R$string;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes9.dex */
public class svh0 implements s7m<rvh0> {

    /* JADX INFO: renamed from: a */
    public CardView f166571a;

    /* JADX INFO: renamed from: b */
    public VText f166572b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f166573c;

    /* JADX INFO: renamed from: d */
    public CardView f166574d;

    /* JADX INFO: renamed from: e */
    public rvh0 f166575e;

    /* JADX INFO: renamed from: f */
    public TanTanCoinCheckstandFrag f166576f;

    /* JADX INFO: renamed from: l.svh0$a */
    public static class C20039a {
        /* JADX INFO: renamed from: b */
        public static void m186093b(svh0 svh0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            svh0Var.f166571a = (CardView) viewGroup.getChildAt(0);
            svh0Var.f166572b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            svh0Var.f166573c = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            svh0Var.f166574d = (CardView) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m186094c(svh0 svh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(m6c0.f131604i2, viewGroup, false);
            m186093b(svh0Var, viewInflate);
            return viewInflate;
        }
    }

    public svh0(TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag) {
        this.f166576f = tanTanCoinCheckstandFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f166576f.getContext();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f166576f.act();
    }

    /* JADX INFO: renamed from: e */
    public View m186087e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20039a.m186094c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rvh0 rvh0Var) {
        this.f166575e = rvh0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m186089i(String str) {
        this.f166573c.setText(str);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186087e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m186090j(int i) {
        this.f166573c.setTextSize(i);
    }

    /* JADX INFO: renamed from: r */
    public void m186091r() {
        this.f166572b.setText(String.format("%s (%s)", this.f166576f.m20604x4(R$string.f27334W1), this.f166576f.m20604x4(l7n.m148817e())));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

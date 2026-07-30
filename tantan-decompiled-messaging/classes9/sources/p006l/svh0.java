package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinCheckstandFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.pay.R;
import l.l7n;
import l.m6c0;
import l.s7m;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class svh0 implements s7m<rvh0> {

    /* JADX INFO: renamed from: a */
    public CardView f21688a;

    /* JADX INFO: renamed from: b */
    public VText f21689b;

    /* JADX INFO: renamed from: c */
    public VText_AutoFit f21690c;

    /* JADX INFO: renamed from: d */
    public CardView f21691d;

    /* JADX INFO: renamed from: e */
    public rvh0 f21692e;

    /* JADX INFO: renamed from: f */
    public TanTanCoinCheckstandFrag f21693f;

    /* JADX INFO: renamed from: l.svh0$a */
    public static class C1285a {
        /* JADX INFO: renamed from: b */
        public static void m24225b(svh0 svh0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            svh0Var.f21688a = viewGroup.getChildAt(0);
            svh0Var.f21689b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            svh0Var.f21690c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            svh0Var.f21691d = viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m24226c(svh0 svh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(m6c0.i2, viewGroup, false);
            m24225b(svh0Var, viewInflate);
            return viewInflate;
        }
    }

    public svh0(TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag) {
        this.f21693f = tanTanCoinCheckstandFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24217C0() {
        return this.f21693f.getContext();
    }

    @Nullable
    public Act act() {
        return this.f21693f.act();
    }

    /* JADX INFO: renamed from: e */
    public View m24218e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1285a.m24226c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m24221i1(rvh0 rvh0Var) {
        this.f21692e = rvh0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m24220i(String str) {
        this.f21690c.setText(str);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24218e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m24222j(int i) {
        this.f21690c.setTextSize(i);
    }

    /* JADX INFO: renamed from: r */
    public void m24223r() {
        this.f21689b.setText(String.format("%s (%s)", this.f21693f.x4(R.string.W1), this.f21693f.x4(l7n.e())));
    }

    public void destroy() {
    }
}

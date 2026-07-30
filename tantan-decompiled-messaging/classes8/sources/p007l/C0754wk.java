package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.profile.R;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.xdl0;
import l.xk;
import v.VButton;
import v.VLinear;

/* JADX INFO: renamed from: l.wk */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0754wk implements s7m<C0673qk> {

    /* JADX INFO: renamed from: a */
    public VButton f5041a;

    /* JADX INFO: renamed from: b */
    public VLinear f5042b;

    /* JADX INFO: renamed from: c */
    public C0673qk f5043c;

    /* JADX INFO: renamed from: d */
    public Act f5044d;

    public C0754wk(Act act) {
        this.f5044d = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11358a(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11359b(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11360c(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11361d(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m11362e(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m11363j(Act act, String str, String str2, String str3, String str4, String str5, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        Dialog dialogM838z = act.dialog().m799X(true).m778G0(str).m775F(str2).m829u0(str3).m814m0(str4).m821q0(str5, new Runnable() { // from class: l.tk
            @Override // java.lang.Runnable
            public final void run() {
                C0754wk.m11360c(d30Var3);
            }
        }).m767B(true).m838z();
        dialogM838z.m745o0(new Runnable() { // from class: l.uk
            @Override // java.lang.Runnable
            public final void run() {
                C0754wk.m11361d(d30Var);
            }
        });
        dialogM838z.m743m0(new Runnable() { // from class: l.vk
            @Override // java.lang.Runnable
            public final void run() {
                C0754wk.m11358a(d30Var2);
            }
        });
        dialogM838z.show();
    }

    /* JADX INFO: renamed from: m */
    public static void m11364m(Act act, String str, String str2, String str3, String str4, final d30 d30Var, final d30 d30Var2) {
        Dialog dialogM838z = act.dialog().m778G0(str).m775F(str2).m829u0(str3).m814m0(str4).m767B(true).m838z();
        dialogM838z.m745o0(new Runnable() { // from class: l.rk
            @Override // java.lang.Runnable
            public final void run() {
                C0754wk.m11359b(d30Var);
            }
        });
        dialogM838z.m743m0(new Runnable() { // from class: l.sk
            @Override // java.lang.Runnable
            public final void run() {
                C0754wk.m11362e(d30Var2);
            }
        });
        dialogM838z.show();
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f5044d;
    }

    @Override // p007l.s7m
    @Nullable
    public Act act() {
        return this.f5044d;
    }

    /* JADX INFO: renamed from: f */
    public View m11365f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xk.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(C0673qk c0673qk) {
        this.f5043c = c0673qk;
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11365f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m11367k(d30 d30Var, d30 d30Var2, d30 d30Var3) {
        m11363j(act(), act().string(R.string.L0), act().string(R.string.K0), act().string(R.string.Q0), act().string(R.string.N0), act().string(R.string.a4), d30Var, d30Var2, d30Var3);
    }

    /* JADX INFO: renamed from: l */
    public void m11368l(d30 d30Var, d30 d30Var2) {
        m11364m(act(), act().string(R.string.P0), act().string(R.string.O0), act().string(R.string.Q0), act().string(R.string.a4), d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: r */
    public void m11369r() {
        xdl0.E0(this.f5041a, this.f5043c.m10444D0());
        xdl0.E0(this.f5042b, this.f5043c.m10446q0());
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}

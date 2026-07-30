package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VLinear;

/* JADX INFO: renamed from: l.wk */
/* JADX INFO: loaded from: classes8.dex */
public class C20883wk implements s7m<C19526qk> {

    /* JADX INFO: renamed from: a */
    public VButton f186694a;

    /* JADX INFO: renamed from: b */
    public VLinear f186695b;

    /* JADX INFO: renamed from: c */
    public C19526qk f186696c;

    /* JADX INFO: renamed from: d */
    public Act f186697d;

    public C20883wk(Act act) {
        this.f186697d = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m203583a(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m203584b(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m203585c(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m203586d(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m203587e(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m203588j(Act act, String str, String str2, String str3, String str4, String str5, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        Dialog dialogM20567z = act.dialog().m20528X(true).m20507G0(str).m20504F(str2).m20558u0(str3).m20543m0(str4).m20550q0(str5, new Runnable() { // from class: l.tk
            @Override // java.lang.Runnable
            public final void run() {
                C20883wk.m203585c(d30Var3);
            }
        }).m20496B(true).m20567z();
        dialogM20567z.m20474o0(new Runnable() { // from class: l.uk
            @Override // java.lang.Runnable
            public final void run() {
                C20883wk.m203586d(d30Var);
            }
        });
        dialogM20567z.m20472m0(new Runnable() { // from class: l.vk
            @Override // java.lang.Runnable
            public final void run() {
                C20883wk.m203583a(d30Var2);
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: m */
    public static void m203589m(Act act, String str, String str2, String str3, String str4, final d30 d30Var, final d30 d30Var2) {
        Dialog dialogM20567z = act.dialog().m20507G0(str).m20504F(str2).m20558u0(str3).m20543m0(str4).m20496B(true).m20567z();
        dialogM20567z.m20474o0(new Runnable() { // from class: l.rk
            @Override // java.lang.Runnable
            public final void run() {
                C20883wk.m203584b(d30Var);
            }
        });
        dialogM20567z.m20472m0(new Runnable() { // from class: l.sk
            @Override // java.lang.Runnable
            public final void run() {
                C20883wk.m203587e(d30Var2);
            }
        });
        dialogM20567z.show();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f186697d;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f186697d;
    }

    /* JADX INFO: renamed from: f */
    public View m203590f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21163xk.m209763b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C19526qk c19526qk) {
        this.f186696c = c19526qk;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m203590f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m203592k(d30 d30Var, d30 d30Var2, d30 d30Var3) {
        m203588j(act(), act().string(R$string.f27741L0), act().string(R$string.f27736K0), act().string(R$string.f27766Q0), act().string(R$string.f27751N0), act().string(R$string.f27820a4), d30Var, d30Var2, d30Var3);
    }

    /* JADX INFO: renamed from: l */
    public void m203593l(d30 d30Var, d30 d30Var2) {
        m203589m(act(), act().string(R$string.f27761P0), act().string(R$string.f27756O0), act().string(R$string.f27766Q0), act().string(R$string.f27820a4), d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: r */
    public void m203594r() {
        xdl0.m208329E0(this.f186694a, this.f186696c.m175061D0());
        xdl0.m208329E0(this.f186695b, this.f186696c.m175063q0());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

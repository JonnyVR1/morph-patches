package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VLinear;

/* JADX INFO: renamed from: l.rk */
/* JADX INFO: loaded from: classes6.dex */
public class C19858rk implements iam<C18405lk> {

    /* JADX INFO: renamed from: a */
    public VButton f163528a;

    /* JADX INFO: renamed from: b */
    public VLinear f163529b;

    /* JADX INFO: renamed from: c */
    public C18405lk f163530c;

    /* JADX INFO: renamed from: d */
    public Act f163531d;

    public C19858rk(Act act) {
        this.f163531d = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m181765a(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m181766b(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m181767c(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m181768d(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m181769e(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m181770j(Act act, String str, String str2, String str3, String str4, String str5, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
        Dialog dialogM21566z = act.dialog().m21527X(true).m21506G0(str).m21503F(str2).m21557u0(str3).m21542m0(str4).m21549q0(str5, new Runnable() { // from class: l.ok
            @Override // java.lang.Runnable
            public final void run() {
                C19858rk.m181767c(x20Var3);
            }
        }).m21495B(true).m21566z();
        dialogM21566z.m21473o0(new Runnable() { // from class: l.pk
            @Override // java.lang.Runnable
            public final void run() {
                C19858rk.m181768d(x20Var);
            }
        });
        dialogM21566z.m21471m0(new Runnable() { // from class: l.qk
            @Override // java.lang.Runnable
            public final void run() {
                C19858rk.m181765a(x20Var2);
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: m */
    public static void m181771m(Act act, String str, String str2, String str3, String str4, final x20 x20Var, final x20 x20Var2) {
        Dialog dialogM21566z = act.dialog().m21506G0(str).m21503F(str2).m21557u0(str3).m21542m0(str4).m21495B(true).m21566z();
        dialogM21566z.m21473o0(new Runnable() { // from class: l.mk
            @Override // java.lang.Runnable
            public final void run() {
                C19858rk.m181766b(x20Var);
            }
        });
        dialogM21566z.m21471m0(new Runnable() { // from class: l.nk
            @Override // java.lang.Runnable
            public final void run() {
                C19858rk.m181769e(x20Var2);
            }
        });
        dialogM21566z.show();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f163531d;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f163531d;
    }

    /* JADX INFO: renamed from: f */
    public View m181772f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20082sk.m186350b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C18405lk c18405lk) {
        this.f163530c = c18405lk;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m181772f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m181774k(x20 x20Var, x20 x20Var2, x20 x20Var3) {
        m181770j(act(), act().string(R$string.f28589L0), act().string(R$string.f28584K0), act().string(R$string.f28614Q0), act().string(R$string.f28599N0), act().string(R$string.f28668a4), x20Var, x20Var2, x20Var3);
    }

    /* JADX INFO: renamed from: l */
    public void m181775l(x20 x20Var, x20 x20Var2) {
        m181771m(act(), act().string(R$string.f28609P0), act().string(R$string.f28604O0), act().string(R$string.f28614Q0), act().string(R$string.f28668a4), x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: r */
    public void m181776r() {
        bnl0.m105509E0(this.f163528a, this.f163530c.m154610D0());
        bnl0.m105509E0(this.f163529b, this.f163530c.m154612q0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

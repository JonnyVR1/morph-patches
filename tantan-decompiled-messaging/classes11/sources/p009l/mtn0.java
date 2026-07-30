package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.livingroom.R;
import kotlin.Metadata;
import l.d30;
import l.f2s;
import l.s7m;
import l.w8u;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0004J%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\b¨\u0006#"}, d2 = {"Ll/mtn0;", "Ll/s7m;", "Ll/cho0;", "<init>", "()V", "presenter", "", "c", "(Ll/cho0;)V", "e", "d", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Ll/f2s;", "a", "Ll/f2s;", "getDialog", "()Ll/f2s;", "setDialog", "(Ll/f2s;)V", "dialog", "b", "Ll/cho0;", "getPresenter", "()Ll/cho0;", "setPresenter", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mtn0 implements s7m<cho0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public f2s dialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public cho0 presenter;

    /* JADX INFO: renamed from: a */
    public static void m18627a(mtn0 mtn0Var) {
        f2s f2sVar = mtn0Var.dialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        cho0 cho0Var = mtn0Var.presenter;
        if (cho0Var != null) {
            cho0Var.m12575k4();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18628b(mtn0 mtn0Var) {
        f2s f2sVar = mtn0Var.dialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        cho0 cho0Var = mtn0Var.presenter;
        if (cho0Var != null) {
            cho0Var.m12577m4();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18629C0() {
        cho0 cho0Var = this.presenter;
        cho0Var.getClass();
        return cho0Var.act();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m18633i1(@Nullable cho0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: d */
    public final void m18631d() {
        f2s f2sVar;
        f2s f2sVar2 = this.dialog;
        if (f2sVar2 == null || f2sVar2 == null || !f2sVar2.isShowing() || (f2sVar = this.dialog) == null) {
            return;
        }
        f2sVar.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m18632e() {
        if (this.dialog == null) {
            cho0 cho0Var = this.presenter;
            cho0Var.getClass();
            boolean zM12576l4 = cho0Var.m12576l4();
            cho0 cho0Var2 = this.presenter;
            if (zM12576l4) {
                cho0Var2.getClass();
                Act act = cho0Var2.act();
                act.getClass();
                fyu fyuVar = new fyu(act);
                f2s f2sVar = new f2s(this.presenter, fyuVar.b());
                this.dialog = f2sVar;
                cho0 cho0Var3 = this.presenter;
                cho0Var3.getClass();
                fyuVar.m14671f(f2sVar, cho0Var3);
            } else {
                cho0Var2.getClass();
                Act act2 = cho0Var2.act();
                act2.getClass();
                vsn0 vsn0Var = new vsn0(act2);
                this.dialog = new f2s(this.presenter, vsn0Var.getView());
                String strT = w8u.t(R.string.Jh);
                strT.getClass();
                String strT2 = w8u.t(R.string.Kh);
                strT2.getClass();
                vsn0Var.m23718j(strT, strT2, R.string.Ub, R.string.v, new d30() { // from class: l.ktn0
                    public final void call() {
                        mtn0.m18628b(this.f15855a);
                    }
                }, new d30() { // from class: l.ltn0
                    public final void call() {
                        mtn0.m18627a(this.f16412a);
                    }
                });
            }
        }
        f2s f2sVar2 = this.dialog;
        if (f2sVar2 != null) {
            f2sVar2.show();
        }
    }

    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    public void destroy() {
    }
}

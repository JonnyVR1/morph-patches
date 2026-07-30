package p009l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d8c0;
import l.e30;
import l.l5j0;
import l.nnn0;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k4m0<D extends nnn0> implements s7m<v4m0<D>> {

    /* JADX INFO: renamed from: a */
    public mwl0 f15404a;

    /* JADX INFO: renamed from: b */
    public l5j0 f15405b;

    /* JADX INFO: renamed from: c */
    public v4m0<D> f15406c;

    /* JADX INFO: renamed from: d */
    public final e30<String> f15407d = new C0983a();

    /* JADX INFO: renamed from: l.k4m0$a */
    public class C0983a implements e30<String> {
        public C0983a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (NullChecker.a(k4m0.this.f15406c)) {
                k4m0.this.f15406c.m23290U4(str);
            }
            k4m0.this.m17297e();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17295C0() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m17300i1(v4m0<D> v4m0Var) {
        this.f15406c = v4m0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m17297e() {
        if (isShowing()) {
            this.f15405b.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m17298f(DialogInterface dialogInterface) {
        this.f15405b.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m17299i(DialogInterface dialogInterface) {
        this.f15405b.dismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return NullChecker.a(this.f15404a) && this.f15405b.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m17301j(List<gzo0> list) {
        if (NullChecker.a(this.f15404a)) {
            mwl0 mwl0Var = this.f15404a;
            v4m0<D> v4m0Var = this.f15406c;
            mwl0Var.m18660h(list, v4m0Var, ((DbObject) ((User) v4m0Var.f21448m.a)).id, this.f15407d);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m17302k(List<gzo0> list) {
        if (this.f15405b == null) {
            this.f15404a = new mwl0(this.f15406c.act());
            l5j0 l5j0Var = new l5j0(this.f15406c.act(), d8c0.d);
            this.f15405b = l5j0Var;
            l5j0Var.setCancelable(true);
            this.f15405b.setContentView(this.f15404a.m18657e());
            this.f15405b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.i4m0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f14397a.m17298f(dialogInterface);
                }
            });
            this.f15404a.m18661i(new DialogInterface.OnDismissListener() { // from class: l.j4m0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f14934a.m17299i(dialogInterface);
                }
            });
        }
        mwl0 mwl0Var = this.f15404a;
        v4m0<D> v4m0Var = this.f15406c;
        mwl0Var.m18660h(list, v4m0Var, ((DbObject) ((User) v4m0Var.f21448m.a)).id, this.f15407d);
        this.f15405b.show();
    }

    public void destroy() {
    }
}

package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class k4m0<D extends nnn0> implements s7m<v4m0<D>> {

    /* JADX INFO: renamed from: a */
    public mwl0 f121106a;

    /* JADX INFO: renamed from: b */
    public l5j0 f121107b;

    /* JADX INFO: renamed from: c */
    public v4m0<D> f121108c;

    /* JADX INFO: renamed from: d */
    public final e30<String> f121109d = new C17926a();

    /* JADX INFO: renamed from: l.k4m0$a */
    public class C17926a implements e30<String> {
        public C17926a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (NullChecker.m81303a(k4m0.this.f121108c)) {
                k4m0.this.f121108c.m197032U4(str);
            }
            k4m0.this.m144493e();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(v4m0<D> v4m0Var) {
        this.f121108c = v4m0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m144493e() {
        if (isShowing()) {
            this.f121107b.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m144494f(DialogInterface dialogInterface) {
        this.f121107b.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m144495i(DialogInterface dialogInterface) {
        this.f121107b.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return NullChecker.m81303a(this.f121106a) && this.f121107b.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m144496j(List<gzo0> list) {
        if (NullChecker.m81303a(this.f121106a)) {
            mwl0 mwl0Var = this.f121106a;
            v4m0<D> v4m0Var = this.f121108c;
            mwl0Var.m156747h(list, v4m0Var, v4m0Var.f179945m.f135304a.f56011id, this.f121109d);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m144497k(List<gzo0> list) {
        if (this.f121107b == null) {
            this.f121106a = new mwl0(this.f121108c.act());
            l5j0 l5j0Var = new l5j0(this.f121108c.act(), d8c0.f84849d);
            this.f121107b = l5j0Var;
            l5j0Var.setCancelable(true);
            this.f121107b.setContentView(this.f121106a.m156744e());
            this.f121107b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.i4m0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f111471a.m144494f(dialogInterface);
                }
            });
            this.f121106a.m156748i(new DialogInterface.OnDismissListener() { // from class: l.j4m0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f116205a.m144495i(dialogInterface);
                }
            });
        }
        mwl0 mwl0Var = this.f121106a;
        v4m0<D> v4m0Var = this.f121108c;
        mwl0Var.m156747h(list, v4m0Var, v4m0Var.f179945m.f135304a.f56011id, this.f121109d);
        this.f121107b.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

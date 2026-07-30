package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.byr;
import l.e30;
import l.nnn0;
import l.s7m;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xyo0<D extends nnn0> implements s7m<fzo0<D>> {

    /* JADX INFO: renamed from: a */
    public zsn0 f22810a;

    /* JADX INFO: renamed from: b */
    public byr f22811b;

    /* JADX INFO: renamed from: c */
    public fzo0<D> f22812c;

    /* JADX INFO: renamed from: d */
    public final e30<String> f22813d = new C1317a();

    /* JADX INFO: renamed from: l.xyo0$a */
    public class C1317a implements e30<String> {
        public C1317a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (NullChecker.a(xyo0.this.f22812c)) {
                xyo0.this.f22812c.m14698J4(str);
            }
            xyo0.this.m25080e();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25078C0() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m25083i1(fzo0<D> fzo0Var) {
        this.f22812c = fzo0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m25080e() {
        if (isShowing()) {
            this.f22811b.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m25081f(View view) {
        this.f22811b.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m25082i(View view) {
        this.f22811b.dismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return NullChecker.a(this.f22810a) && this.f22811b.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m25084j(List<gzo0> list) {
        if (NullChecker.a(this.f22810a)) {
            zsn0 zsn0Var = this.f22810a;
            fzo0<D> fzo0Var = this.f22812c;
            zsn0Var.m25954h(list, fzo0Var, ((DbObject) ((User) fzo0Var.f13249m.a)).id, this.f22813d);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m25085k(List<gzo0> list) {
        if (this.f22811b == null) {
            this.f22810a = new zsn0(this.f22812c.act());
            this.f22811b = new byr(this.f22812c, this.f22810a.getView());
            xdl0.E0(this.f22810a._empty, new View.OnClickListener() { // from class: l.vyo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21821a.m25081f(view);
                }
            });
            xdl0.E0(this.f22810a._cancel, new View.OnClickListener() { // from class: l.wyo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22370a.m25082i(view);
                }
            });
        }
        zsn0 zsn0Var = this.f22810a;
        fzo0<D> fzo0Var = this.f22812c;
        zsn0Var.m25954h(list, fzo0Var, ((DbObject) ((User) fzo0Var.f13249m.a)).id, this.f22813d);
        this.f22811b.show();
    }

    public void destroy() {
    }
}

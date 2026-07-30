package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class odm0<D extends rwn0> implements iam<zdm0<D>> {

    /* JADX INFO: renamed from: a */
    public q5m0 f146925a;

    /* JADX INFO: renamed from: b */
    public pej0 f146926b;

    /* JADX INFO: renamed from: c */
    public zdm0<D> f146927c;

    /* JADX INFO: renamed from: d */
    public final y20<String> f146928d = new C19111a();

    /* JADX INFO: renamed from: l.odm0$a */
    public class C19111a implements y20<String> {
        public C19111a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (NullChecker.m82486a(odm0.this.f146927c)) {
                odm0.this.f146927c.m219334U4(str);
            }
            odm0.this.m167323e();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zdm0<D> zdm0Var) {
        this.f146927c = zdm0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m167323e() {
        if (isShowing()) {
            this.f146926b.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m167324f(DialogInterface dialogInterface) {
        this.f146926b.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m167325i(DialogInterface dialogInterface) {
        this.f146926b.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return NullChecker.m82486a(this.f146925a) && this.f146926b.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m167326j(List<k8p0> list) {
        if (NullChecker.m82486a(this.f146925a)) {
            q5m0 q5m0Var = this.f146925a;
            zdm0<D> zdm0Var = this.f146927c;
            q5m0Var.m175507h(list, zdm0Var, zdm0Var.f203898m.f143542a.f56859id, this.f146928d);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m167327k(List<k8p0> list) {
        if (this.f146926b == null) {
            this.f146925a = new q5m0(this.f146927c.act());
            pej0 pej0Var = new pej0(this.f146927c.act(), jgc0.f120697d);
            this.f146926b = pej0Var;
            pej0Var.setCancelable(true);
            this.f146926b.setContentView(this.f146925a.m175504e());
            this.f146926b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mdm0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f136395a.m167324f(dialogInterface);
                }
            });
            this.f146925a.m175508i(new DialogInterface.OnDismissListener() { // from class: l.ndm0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f141508a.m167325i(dialogInterface);
                }
            });
        }
        q5m0 q5m0Var = this.f146925a;
        zdm0<D> zdm0Var = this.f146927c;
        q5m0Var.m175507h(list, zdm0Var, zdm0Var.f203898m.f143542a.f56859id, this.f146928d);
        this.f146926b.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class b8p0<D extends rwn0> implements iam<j8p0<D>> {

    /* JADX INFO: renamed from: a */
    public d2o0 f75459a;

    /* JADX INFO: renamed from: b */
    public c0s f75460b;

    /* JADX INFO: renamed from: c */
    public j8p0<D> f75461c;

    /* JADX INFO: renamed from: d */
    public final y20<String> f75462d = new C15946a();

    /* JADX INFO: renamed from: l.b8p0$a */
    public class C15946a implements y20<String> {
        public C15946a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            if (NullChecker.m82486a(b8p0.this.f75461c)) {
                b8p0.this.f75461c.m143870J4(str);
            }
            b8p0.this.m103031e();
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
    public void mo22064i1(j8p0<D> j8p0Var) {
        this.f75461c = j8p0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m103031e() {
        if (isShowing()) {
            this.f75460b.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m103032f(View view) {
        this.f75460b.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m103033i(View view) {
        this.f75460b.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return NullChecker.m82486a(this.f75459a) && this.f75460b.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m103034j(List<k8p0> list) {
        if (NullChecker.m82486a(this.f75459a)) {
            d2o0 d2o0Var = this.f75459a;
            j8p0<D> j8p0Var = this.f75461c;
            d2o0Var.m113731h(list, j8p0Var, j8p0Var.f118800m.f143542a.f56859id, this.f75462d);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m103035k(List<k8p0> list) {
        if (this.f75460b == null) {
            this.f75459a = new d2o0(this.f75461c.act());
            this.f75460b = new c0s(this.f75461c, this.f75459a.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
            bnl0.m105509E0(this.f75459a._empty, new View.OnClickListener() { // from class: l.z7p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203259a.m103032f(view);
                }
            });
            bnl0.m105509E0(this.f75459a._cancel, new View.OnClickListener() { // from class: l.a8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68937a.m103033i(view);
                }
            });
        }
        d2o0 d2o0Var = this.f75459a;
        j8p0<D> j8p0Var = this.f75461c;
        d2o0Var.m113731h(list, j8p0Var, j8p0Var.f118800m.f143542a.f56859id, this.f75462d);
        this.f75460b.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

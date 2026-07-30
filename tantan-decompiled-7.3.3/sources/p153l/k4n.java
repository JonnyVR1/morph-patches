package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlDynamicGreetListAct;
import java.util.List;
import p151v.navigationbar.VNavigationBar;
import p153l.j4n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k4n<P extends j4n<?>> implements iam<P> {

    /* JADX INFO: renamed from: a */
    public IntlDynamicGreetListAct f123901a;

    /* JADX INFO: renamed from: b */
    public P f123902b;

    /* JADX INFO: renamed from: c */
    public Boolean f123903c = Boolean.FALSE;

    public k4n(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        this.f123901a = intlDynamicGreetListAct;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f123901a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f123902b = p;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<fzq> mo111816b();

    /* JADX INFO: renamed from: c */
    public void m148269c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconAsBack(this.f123901a);
        vNavigationBar.setTitle(this.f123901a.string(R$string.f21654Z3));
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo111817e();

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo111825r();

    /* JADX INFO: renamed from: d */
    public void m148270d() {
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlDynamicGreetListAct;
import java.util.List;
import p147v.navigationbar.VNavigationBar;
import p149l.j2n;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k2n<P extends j2n<?>> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public IntlDynamicGreetListAct f120749a;

    /* JADX INFO: renamed from: b */
    public P f120750b;

    /* JADX INFO: renamed from: c */
    public Boolean f120751c = Boolean.FALSE;

    public k2n(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        this.f120749a = intlDynamicGreetListAct;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f120749a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f120750b = p;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<fxq> mo107810b();

    /* JADX INFO: renamed from: c */
    public void m144322c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconAsBack(this.f120749a);
        vNavigationBar.setTitle(this.f120749a.string(R$string.f20912Z3));
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo107811e();

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo107819r();

    /* JADX INFO: renamed from: d */
    public void m144323d() {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

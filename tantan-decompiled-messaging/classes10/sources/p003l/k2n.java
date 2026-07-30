package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlDynamicGreetListAct;
import java.util.List;
import l.fxq;
import l.s7m;
import p003l.j2n;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class k2n<P extends j2n<?>> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public IntlDynamicGreetListAct f5414a;

    /* JADX INFO: renamed from: b */
    public P f5415b;

    /* JADX INFO: renamed from: c */
    public Boolean f5416c = Boolean.FALSE;

    public k2n(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        this.f5414a = intlDynamicGreetListAct;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7482C0() {
        return this.f5414a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m7488i1(P p) {
        this.f5415b = p;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<fxq> m7484b();

    /* JADX INFO: renamed from: c */
    public void m7485c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconAsBack(this.f5414a);
        vNavigationBar.setTitle(this.f5414a.string(R$string.f574Z3));
    }

    /* JADX INFO: renamed from: e */
    public abstract void m7487e();

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public abstract void m7489r();

    /* JADX INFO: renamed from: d */
    public void m7486d() {
    }

    public void destroy() {
    }
}

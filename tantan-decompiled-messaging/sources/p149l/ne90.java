package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class ne90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public FrameLayout f138595u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f138596v;

    public ne90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m159101S(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public View m159103U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oe90.m163936b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m159104V(User user) {
        xdl0.m208344M(this.f138595u, m96414J(user));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        xdl0.m208344M(this.f138595u, false);
        m131821p().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new C21368yd()).distinctUntilChanged(new w9j() { // from class: l.ke90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.le90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127658a.m159104V((User) obj);
            }
        }, new e30() { // from class: l.me90
            @Override // p149l.e30
            public final void call(Object obj) {
                ne90.m159101S((Throwable) obj);
            }
        }));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m159103U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }
}

package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.mcr;
import l.mkd0;
import l.oe90;
import l.w9j;
import l.xdl0;
import l.yd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ne90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public FrameLayout f15965u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f15966v;

    public ne90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m18689S(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public View m18691U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oe90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m18692V(User user) {
        xdl0.M(this.f15965u, m9645J(user));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        xdl0.M(this.f15965u, false);
        m14461p().duringCreated(CoreModule.c.e0.o9()).filter(new yd()).distinctUntilChanged(new w9j() { // from class: l.ke90
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.le90
            public final void call(Object obj) {
                this.f14791a.m18692V((User) obj);
            }
        }, new e30() { // from class: l.me90
            public final void call(Object obj) {
                ne90.m18689S((Throwable) obj);
            }
        }));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m18691U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}

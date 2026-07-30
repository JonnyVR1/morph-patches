package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class rm90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public FrameLayout f163835u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f163836v;

    public rm90(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m182047S(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public View m182049U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sm90.m186782b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m182050V(User user) {
        bnl0.m105524M(this.f163835u, m121839J(user));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        bnl0.m105524M(this.f163835u, false);
        m168321p().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new C20291td()).distinctUntilChanged(new qcj() { // from class: l.om90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.pm90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153129a.m182050V((User) obj);
            }
        }, new y20() { // from class: l.qm90
            @Override // p153l.y20
            public final void call(Object obj) {
                rm90.m182047S((Throwable) obj);
            }
        }));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m182049U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }
}

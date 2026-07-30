package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.view.MessageKnowHimLayout;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.e30;
import l.f6c0;
import l.ilk;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.w9j;
import l.xma;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vr90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public MessageKnowHimLayout f21275u;

    /* JADX INFO: renamed from: v */
    public c4g0 f21276v;

    public vr90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m24101S(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    private boolean m24105X() {
        if (CoreModule.P().g().yc()) {
            return xma.B3();
        }
        if (CoreModule.P().g().d9()) {
            return xma.L3();
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    private void m24106Y() {
        if (NullChecker.a(this.f21276v)) {
            return;
        }
        this.f21276v = m14461p().duringCreated(m24107W()).flatMap(new w9j() { // from class: l.qr90
            public final Object call(Object obj) {
                return this.f18189a.m24108Z((Boolean) obj);
            }
        }).filter(new ilk()).subscribe(mkd0.H(new e30() { // from class: l.rr90
            public final void call(Object obj) {
                this.f18660a.m24109a0((roj0) obj);
            }
        }, new e30() { // from class: l.sr90
            public final void call(Object obj) {
                vr90.m24101S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final c<Boolean> m24107W() {
        return CoreModule.P().g().yc() ? CoreModule.c.C0.u3(SummarizedPrivilegesId.get("femaleVip")).map(new w9j() { // from class: l.tr90
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.B3());
            }
        }).distinctUntilChanged() : CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.ur90
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.L3());
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ c m24108Z(Boolean bool) {
        return CoreModule.c.e0.W9(mo3351O().userId());
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m24109a0(roj0 roj0Var) {
        MessageKnowHimLayout messageKnowHimLayout = this.f21275u;
        if (messageKnowHimLayout != null) {
            messageKnowHimLayout.setLocked(!m24105X());
            this.f21275u.g(mo3351O().mo1517K2().userActivityInfo, mo3351O().mo1517K2().isFemale());
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f21275u.setPage(1);
        if (m24105X()) {
            return;
        }
        m24106Y();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return ((mo3351O().mo1517K2().isFemale() && CoreModule.P().g().yc()) || mo3351O().mo1517K2().isTeamAccount() || mo3351O().mo1517K2().userActivityInfo == null) ? false : true;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        MessageKnowHimLayout messageKnowHimLayoutInflate = mo3351O().mo9267H2().inflate(f6c0.s7, viewGroup, false);
        if (messageKnowHimLayoutInflate instanceof MessageKnowHimLayout) {
            this.f21275u = messageKnowHimLayoutInflate;
        }
        return messageKnowHimLayoutInflate;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        this.f21275u.setLocked(!m24105X());
        this.f21275u.g(mo3351O().mo1517K2().userActivityInfo, mo3351O().mo1517K2().isFemale());
    }
}

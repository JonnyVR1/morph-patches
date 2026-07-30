package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.view.MessageKnowHimLayout;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class vr90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public MessageKnowHimLayout f182707u;

    /* JADX INFO: renamed from: v */
    public c4g0 f182708v;

    public vr90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m199642S(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    private boolean m199646X() {
        if (CoreModule.m29935P().m94656g().mo35087yc()) {
            return xma.m210039B3();
        }
        if (CoreModule.m29935P().m94656g().mo35054d9()) {
            return xma.m210047L3();
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    private void m199647Y() {
        if (NullChecker.m81303a(this.f182708v)) {
            return;
        }
        this.f182708v = m131821p().duringCreated(m199648W()).flatMap(new w9j() { // from class: l.qr90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f155975a.m199649Z((Boolean) obj);
            }
        }).filter(new ilk()).subscribe(mkd0.m154956H(new e30() { // from class: l.rr90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160731a.m199650a0((roj0) obj);
            }
        }, new e30() { // from class: l.sr90
            @Override // p149l.e30
            public final void call(Object obj) {
                vr90.m199642S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final C22306c<Boolean> m199648W() {
        return CoreModule.m29935P().m94656g().mo35087yc() ? CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("femaleVip")).map(new w9j() { // from class: l.tr90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210039B3());
            }
        }).distinctUntilChanged() : CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.ur90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22306c m199649Z(Boolean bool) {
        return CoreModule.f17545c.f19639e0.m169454W9(mo52800O().userId());
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m199650a0(roj0 roj0Var) {
        MessageKnowHimLayout messageKnowHimLayout = this.f182707u;
        if (messageKnowHimLayout != null) {
            messageKnowHimLayout.setLocked(!m199646X());
            this.f182707u.m56145g(mo52800O().mo51069K2().userActivityInfo, mo52800O().mo51069K2().isFemale());
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f182707u.setPage(1);
        if (m199646X()) {
            return;
        }
        m199647Y();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return ((mo52800O().mo51069K2().isFemale() && CoreModule.m29935P().m94656g().mo35087yc()) || mo52800O().mo51069K2().isTeamAccount() || mo52800O().mo51069K2().userActivityInfo == null) ? false : true;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f95995s7, viewGroup, false);
        if (viewInflate instanceof MessageKnowHimLayout) {
            this.f182707u = (MessageKnowHimLayout) viewInflate;
        }
        return viewInflate;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        this.f182707u.setLocked(!m199646X());
        this.f182707u.m56145g(mo52800O().mo51069K2().userActivityInfo, mo52800O().mo51069K2().isFemale());
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.view.MessageKnowHimLayout;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class zz90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public MessageKnowHimLayout f206683u;

    /* JADX INFO: renamed from: v */
    public kcg0 f206684v;

    public zz90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m222233S(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    private boolean m222237X() {
        if (CoreModule.m30933P().m143410g().mo36090yc()) {
            return joa.m146353C3();
        }
        if (CoreModule.m30933P().m143410g().mo36057d9()) {
            return joa.m146361M3();
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    private void m222238Y() {
        if (NullChecker.m82486a(this.f206684v)) {
            return;
        }
        this.f206684v = m168321p().duringCreated(m222239W()).flatMap(new qcj() { // from class: l.uz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181714a.m222240Z((Boolean) obj);
            }
        }).filter(new ynk()).subscribe(psd0.m173597H(new y20() { // from class: l.vz90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186456a.m222241a0((uxj0) obj);
            }
        }, new y20() { // from class: l.wz90
            @Override // p153l.y20
            public final void call(Object obj) {
                zz90.m222233S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final C22421c<Boolean> m222239W() {
        return CoreModule.m30933P().m143410g().mo36090yc() ? CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("femaleVip")).map(new qcj() { // from class: l.xz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146353C3());
            }
        }).distinctUntilChanged() : CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.yz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22421c m222240Z(Boolean bool) {
        return CoreModule.f18264c.f20381e0.m116527W9(mo53983O().userId());
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m222241a0(uxj0 uxj0Var) {
        MessageKnowHimLayout messageKnowHimLayout = this.f206683u;
        if (messageKnowHimLayout != null) {
            messageKnowHimLayout.setLocked(!m222237X());
            this.f206683u.m57328g(mo53983O().mo52252K2().userActivityInfo, mo53983O().mo52252K2().isFemale());
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f206683u.setPage(1);
        if (m222237X()) {
            return;
        }
        m222238Y();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return ((mo53983O().mo52252K2().isFemale() && CoreModule.m30933P().m143410g().mo36090yc()) || mo53983O().mo52252K2().isTeamAccount() || mo53983O().mo52252K2().userActivityInfo == null) ? false : true;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f126168z7, viewGroup, false);
        if (viewInflate instanceof MessageKnowHimLayout) {
            this.f206683u = (MessageKnowHimLayout) viewInflate;
        }
        return viewInflate;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        this.f206683u.setLocked(!m222237X());
        this.f206683u.m57328g(mo53983O().mo52252K2().userActivityInfo, mo53983O().mo52252K2().isFemale());
    }
}

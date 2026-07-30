package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class wdq0 extends jq2<beq0> {
    public wdq0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m202785h0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i || c4319c == C4319c.f15549j) {
            CoreModule.f17545c.f19552B0.f19746T.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m202787j0(Bundle bundle) {
        ((beq0) this.viewModel).m101372n();
        CoreModule.m29936Q().mo67229M6().mo102417b();
        act().setSwipeBackEnable(false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.rdq0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158964a.m202787j0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.sdq0
            @Override // p149l.e30
            public final void call(Object obj) {
                wdq0.m202785h0((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.tdq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.udq0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175957a.m202788k0((List) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19552B0.m31611j4()).subscribe(mkd0.m154955G(new e30() { // from class: l.vdq0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181111a.m202789l0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m202788k0(List list) {
        if (CoreModule.f17545c.f19639e0.m169520na().isYoungRisk()) {
            return;
        }
        act().m50458m2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m202789l0(VerificationCenter verificationCenter) {
        if (!NullChecker.m81303a(verificationCenter.idCard) || !NullChecker.m81303a(verificationCenter.idCard.status)) {
            ((beq0) this.viewModel).m101373p(true);
            return;
        }
        StudentVerificationStatus studentVerificationStatus = verificationCenter.idCard.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            act().m50458m2();
        } else if (TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, StudentVerificationStatus.prePending)) {
            ((beq0) this.viewModel).m101373p(false);
        } else {
            ((beq0) this.viewModel).m101373p(true);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

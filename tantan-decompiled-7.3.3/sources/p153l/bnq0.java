package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class bnq0 extends ar2<gnq0> {
    public bnq0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m105612h0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i || c4470c == C4470c.f16268j) {
            CoreModule.f18264c.f20294B0.f20488T.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m105614j0(Bundle bundle) {
        ((gnq0) this.viewModel).m130976n();
        CoreModule.m30934Q().mo68412M6().mo127331b();
        act().setSwipeBackEnable(false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.wmq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189823a.m105614j0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.xmq0
            @Override // p153l.y20
            public final void call(Object obj) {
                bnq0.m105612h0((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.ymq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.zmq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205096a.m105615k0((List) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20294B0.m32614j4()).subscribe(psd0.m173596G(new y20() { // from class: l.anq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72375a.m105616l0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m105615k0(List list) {
        if (CoreModule.f18264c.f20381e0.m116593na().isYoungRisk()) {
            return;
        }
        act().m51642n2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m105616l0(VerificationCenter verificationCenter) {
        if (!NullChecker.m82486a(verificationCenter.idCard) || !NullChecker.m82486a(verificationCenter.idCard.status)) {
            ((gnq0) this.viewModel).m130977p(true);
            return;
        }
        StudentVerificationStatus studentVerificationStatus = verificationCenter.idCard.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            act().m51642n2();
        } else if (TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, StudentVerificationStatus.prePending)) {
            ((gnq0) this.viewModel).m130977p(false);
        } else {
            ((gnq0) this.viewModel).m130977p(true);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

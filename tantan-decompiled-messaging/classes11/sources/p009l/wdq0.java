package p009l;

import android.os.Bundle;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wdq0 extends jq2<beq0> {
    public wdq0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m24102h0(c cVar) {
        if (cVar == c.i || cVar == c.j) {
            CoreModule.c.B0.T.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m24104j0(Bundle bundle) {
        ((beq0) ((jq2) this).viewModel).m11982n();
        CoreModule.Q().m9019M6().m12083b();
        act().setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m24105a0() {
        super.a0();
        creates(new e30() { // from class: l.rdq0
            public final void call(Object obj) {
                this.f19779a.m24104j0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.sdq0
            public final void call(Object obj) {
                wdq0.m24102h0((c) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.tdq0
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.udq0
            public final void call(Object obj) {
                this.f21091a.m24106k0((List) obj);
            }
        }));
        duringCreated(CoreModule.c.B0.j4()).subscribe(mkd0.G(new e30() { // from class: l.vdq0
            public final void call(Object obj) {
                this.f21548a.m24107l0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m24106k0(List list) {
        if (CoreModule.c.e0.na().isYoungRisk()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m24107l0(VerificationCenter verificationCenter) {
        if (!NullChecker.a(verificationCenter.idCard) || !NullChecker.a(verificationCenter.idCard.status)) {
            ((beq0) ((jq2) this).viewModel).m11983p(true);
            return;
        }
        StudentVerificationStatus studentVerificationStatus = verificationCenter.idCard.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            act().finish();
        } else if (TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "prePending")) {
            ((beq0) ((jq2) this).viewModel).m11983p(false);
        } else {
            ((beq0) ((jq2) this).viewModel).m11983p(true);
        }
    }

    public void destroy() {
    }
}

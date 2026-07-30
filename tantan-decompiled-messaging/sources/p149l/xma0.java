package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopVerificationFrag;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes4.dex */
public class xma0 extends jq2<yma0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopVerificationFrag f193541a;

    public xma0(mcr mcrVar) {
        super(mcrVar);
        this.f193541a = (ProfileLoopVerificationFrag) mcrVar;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.wma0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187057a.m210117f0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m210117f0(VerificationCenter verificationCenter) {
        if (verificationCenter != null) {
            if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
                this.f193541a.mo51586H();
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: g0 */
    public void m210118g0(int i, int i2, Intent intent) {
    }
}

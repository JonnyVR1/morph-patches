package p002l;

import android.content.Intent;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopVerificationFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xma0 extends jq2<yma0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopVerificationFrag f22355a;

    public xma0(mcr mcrVar) {
        super(mcrVar);
        this.f22355a = (ProfileLoopVerificationFrag) mcrVar;
    }

    /* JADX INFO: renamed from: a0 */
    public void m26029a0() {
        super.a0();
        duringCreated(CoreModule.c.B0.j4().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.wma0
            public final void call(Object obj) {
                this.f21827a.m26030f0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m26030f0(VerificationCenter verificationCenter) {
        if (verificationCenter != null) {
            if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
                this.f22355a.mo2072H();
            }
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: g0 */
    public void m26031g0(int i, int i2, Intent intent) {
    }
}

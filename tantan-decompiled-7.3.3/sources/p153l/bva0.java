package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopVerificationFrag;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes4.dex */
public class bva0 extends ar2<cva0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopVerificationFrag f78577a;

    public bva0(ner nerVar) {
        super(nerVar);
        this.f78577a = (ProfileLoopVerificationFrag) nerVar;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ava0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73601a.m106556f0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m106556f0(VerificationCenter verificationCenter) {
        if (verificationCenter != null) {
            if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
                this.f78577a.mo52769H();
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: g0 */
    public void m106557g0(int i, int i2, Intent intent) {
    }
}

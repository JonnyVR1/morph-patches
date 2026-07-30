package p003l;

import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.mcr;
import l.mkd0;
import l.zo6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tvw extends hww<vvw> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f7806a;

    public tvw(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
        duringCreated(CoreModule.c.B0.j4().filter(new zo6())).subscribe((m250) mkd0.G(new e30() { // from class: l.svw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7341a.m8044k0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m8044k0(VerificationCenter verificationCenter) {
        this.f7806a = verificationCenter;
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) {
            m5005f0().m501a2().f2884k.performClick();
        }
    }
}

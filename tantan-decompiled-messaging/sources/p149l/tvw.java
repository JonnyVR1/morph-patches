package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes3.dex */
public class tvw extends hww<vvw> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f172347a;

    public tvw(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
        duringCreated(CoreModule.f17545c.f19552B0.m31611j4().filter(new zo6())).subscribe(mkd0.m154955G(new e30() { // from class: l.svw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166599a.m190818k0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m190818k0(VerificationCenter verificationCenter) {
        this.f172347a = verificationCenter;
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) {
            m133274f0().m47454a2().f83131k.performClick();
        }
    }
}

package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes3.dex */
public class syw extends gzw<uyw> {

    /* JADX INFO: renamed from: a */
    public VerificationCenter f171322a;

    public syw(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
        duringCreated(CoreModule.f18264c.f20294B0.m32614j4().filter(new cq6())).subscribe(psd0.m173596G(new y20() { // from class: l.ryw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165470a.m188609k0((VerificationCenter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m188609k0(VerificationCenter verificationCenter) {
        this.f171322a = verificationCenter;
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) {
            m133134f0().m48637b2().f74685k.performClick();
        }
    }
}

package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class n7v extends bwr<t7v> {

    /* JADX INFO: renamed from: a */
    public final mss f137558a;

    /* JADX INFO: renamed from: b */
    public BaseLiveListBean<LiveVoiceInternalSquareTabBean> f137559b;

    public n7v(mss mssVar) {
        super(mssVar.f135531b);
        this.f137558a = mssVar;
    }

    public Act act() {
        return this.f137558a.f135531b.act();
    }

    /* JADX INFO: renamed from: r2 */
    public mss m158165r2() {
        return this.f137558a;
    }

    /* JADX INFO: renamed from: u2 */
    public void m158167u2() {
        if (NullChecker.m81303a(((t7v) this.viewModel).f168777d)) {
            V v2 = this.viewModel;
            ((t7v) v2).f168777d.m162173n(((t7v) v2).m187512i());
        }
    }

    /* JADX INFO: renamed from: v2 */
    public void m158168v2(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, String str, String str2) {
        this.f137559b = baseLiveListBean;
        ((t7v) this.viewModel).m187515l(baseLiveListBean, str, str2);
    }

    /* JADX INFO: renamed from: w2 */
    public void m158169w2(final String str) {
        int iM200293G;
        BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean = this.f137559b;
        if (baseLiveListBean == null || vwb.m200296J(baseLiveListBean.getList()) || (iM200293G = vwb.m200293G(this.f137559b.getList(), new w9j() { // from class: l.m7v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) < 0) {
            return;
        }
        ((t7v) this.viewModel).f168775b.setCurrentItem(iM200293G);
    }

    /* JADX INFO: renamed from: s2 */
    public void m158166s2(int i) {
    }
}

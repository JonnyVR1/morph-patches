package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class o9v extends cyr<u9v> {

    /* JADX INFO: renamed from: a */
    public final nus f145634a;

    /* JADX INFO: renamed from: b */
    public BaseLiveListBean<LiveVoiceInternalSquareTabBean> f145635b;

    public o9v(nus nusVar) {
        super(nusVar.f143738b);
        this.f145634a = nusVar;
    }

    public Act act() {
        return this.f145634a.f143738b.act();
    }

    /* JADX INFO: renamed from: r2 */
    public nus m166813r2() {
        return this.f145634a;
    }

    /* JADX INFO: renamed from: u2 */
    public void m166815u2() {
        if (NullChecker.m82486a(((u9v) this.viewModel).f178141d)) {
            V v2 = this.viewModel;
            ((u9v) v2).f178141d.m170401n(((u9v) v2).m195127i());
        }
    }

    /* JADX INFO: renamed from: v2 */
    public void m166816v2(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, String str, String str2) {
        this.f145635b = baseLiveListBean;
        ((u9v) this.viewModel).m195130l(baseLiveListBean, str, str2);
    }

    /* JADX INFO: renamed from: w2 */
    public void m166817w2(final String str) {
        int iM147476G;
        BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean = this.f145635b;
        if (baseLiveListBean == null || jyb.m147479J(baseLiveListBean.getList()) || (iM147476G = jyb.m147476G(this.f145635b.getList(), new qcj() { // from class: l.n9v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) < 0) {
            return;
        }
        ((u9v) this.viewModel).f178139b.setCurrentItem(iM147476G);
    }

    /* JADX INFO: renamed from: s2 */
    public void m166814s2(int i) {
    }
}

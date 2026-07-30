package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class q9v extends cyr<x9v> {

    /* JADX INFO: renamed from: a */
    public final nus f156267a;

    /* JADX INFO: renamed from: b */
    public BaseLiveListBean<LiveVoiceInternalSquareTabBean> f156268b;

    public q9v(nus nusVar) {
        super(nusVar.f143738b);
        this.f156267a = nusVar;
    }

    public Act act() {
        return this.f156267a.f143738b.act();
    }

    /* JADX INFO: renamed from: r2 */
    public nus m175846r2() {
        return this.f156267a;
    }

    /* JADX INFO: renamed from: u2 */
    public void m175848u2() {
        if (NullChecker.m82486a(((x9v) this.viewModel).f192969d)) {
            V v2 = this.viewModel;
            ((x9v) v2).f192969d.m170401n(((x9v) v2).m209819f());
        }
    }

    /* JADX INFO: renamed from: v2 */
    public void m175849v2(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, String str, String str2) {
        this.f156268b = baseLiveListBean;
        ((x9v) this.viewModel).m209821k(baseLiveListBean, str, str2);
    }

    /* JADX INFO: renamed from: w2 */
    public void m175850w2(final String str) {
        int iM147476G;
        BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean = this.f156268b;
        if (baseLiveListBean == null || jyb.m147479J(baseLiveListBean.getList()) || (iM147476G = jyb.m147476G(this.f156268b.getList(), new qcj() { // from class: l.p9v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) < 0) {
            return;
        }
        ((x9v) this.viewModel).f192967b.setCurrentItem(iM147476G);
    }

    /* JADX INFO: renamed from: s2 */
    public void m175847s2(int i) {
    }
}

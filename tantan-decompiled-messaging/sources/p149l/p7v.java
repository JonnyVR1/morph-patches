package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class p7v extends bwr<w7v> {

    /* JADX INFO: renamed from: a */
    public final mss f147545a;

    /* JADX INFO: renamed from: b */
    public BaseLiveListBean<LiveVoiceInternalSquareTabBean> f147546b;

    public p7v(mss mssVar) {
        super(mssVar.f135531b);
        this.f147545a = mssVar;
    }

    public Act act() {
        return this.f147545a.f135531b.act();
    }

    /* JADX INFO: renamed from: r2 */
    public mss m167773r2() {
        return this.f147545a;
    }

    /* JADX INFO: renamed from: u2 */
    public void m167775u2() {
        if (NullChecker.m81303a(((w7v) this.viewModel).f185103d)) {
            V v2 = this.viewModel;
            ((w7v) v2).f185103d.m162173n(((w7v) v2).m202078f());
        }
    }

    /* JADX INFO: renamed from: v2 */
    public void m167776v2(BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean, String str, String str2) {
        this.f147546b = baseLiveListBean;
        ((w7v) this.viewModel).m202080k(baseLiveListBean, str, str2);
    }

    /* JADX INFO: renamed from: w2 */
    public void m167777w2(final String str) {
        int iM200293G;
        BaseLiveListBean<LiveVoiceInternalSquareTabBean> baseLiveListBean = this.f147546b;
        if (baseLiveListBean == null || vwb.m200296J(baseLiveListBean.getList()) || (iM200293G = vwb.m200293G(this.f147546b.getList(), new w9j() { // from class: l.o7v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveVoiceInternalSquareTabBean) obj).getTabId(), str));
            }
        })) < 0) {
            return;
        }
        ((w7v) this.viewModel).f185101b.setCurrentItem(iM200293G);
    }

    /* JADX INFO: renamed from: s2 */
    public void m167774s2(int i) {
    }
}

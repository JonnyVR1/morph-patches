package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamCdnInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;

/* JADX INFO: loaded from: classes13.dex */
public class z1k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: c */
    public void mo124162c(Act act, LiveGoAction liveGoAction) {
        super.mo124162c(act, liveGoAction);
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f44323id = liveGoAction.getGoData();
        BLiveStreamUrl bLiveStreamUrlNew_ = BLiveStreamUrl.new_();
        bLiveNew_.streamUrl = bLiveStreamUrlNew_;
        bLiveStreamUrlNew_.pullFlv = ytl.m216066m(liveGoAction, "pullFlv");
        bLiveNew_.streamUrl.pullFlvIpv6 = ytl.m216066m(liveGoAction, "pullFlvIpv6");
        bLiveNew_.callback = ytl.m216066m(liveGoAction, "callback");
        BLiveStreamCdnInfo bLiveStreamCdnInfoNew_ = BLiveStreamCdnInfo.new_();
        bLiveNew_.streamCdnInfo = bLiveStreamCdnInfoNew_;
        bLiveStreamCdnInfoNew_.provider = ytl.m216068o(ytl.m216066m(liveGoAction, "provider"));
        bLiveNew_.streamCdnInfo.businessType = ytl.m216068o(ytl.m216066m(liveGoAction, "businessType"));
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveNew_.room = bLiveOwnerNew_;
        bLiveOwnerNew_.f44419id = ytl.m216066m(liveGoAction, "roomId");
        bLiveNew_.liveMode = ytl.m216066m(liveGoAction, "liveMode");
        String strM216066m = ytl.m216066m(liveGoAction, "source");
        act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67593D(bLiveNew_).m67604O(strM216066m).m67615y(ytl.m216066m(liveGoAction, "category")).m67611u()));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (ytl.m216064h(act)) {
            return;
        }
        m216069b(act, SchemeKey.liveSquare, null);
        String strM181411j = rwj0.m181411j(w2e0Var, "liveId");
        if (TextUtils.isEmpty(strM181411j)) {
            return;
        }
        String strM181411j2 = rwj0.m181411j(w2e0Var, "source");
        String strM181411j3 = rwj0.m181411j(w2e0Var, "category");
        String strM181411j4 = rwj0.m181411j(w2e0Var, "liveMode");
        AudienceStartData.C11430a c11430aM67615y = AudienceStartData.getBuilder().m67594E(strM181411j).m67596G(mwj0.m156661O(rwj0.m181411j(w2e0Var, "liveSchema"))).m67604O(strM181411j2).m67615y(strM181411j3);
        c11430aM67615y.m67595F(strM181411j4);
        act.startActivity(s9s.f163232f.m134373f(act, c11430aM67615y.m67611u()));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: j */
    public boolean mo124163j(int i) {
        return 3 == i;
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return mo99015a("liveRoom").equals(str);
    }
}

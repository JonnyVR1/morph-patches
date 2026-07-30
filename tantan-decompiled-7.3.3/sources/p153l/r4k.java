package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamCdnInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;

/* JADX INFO: loaded from: classes9.dex */
public class r4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: c */
    public void mo108063c(Act act, LiveGoAction liveGoAction) {
        super.mo108063c(act, liveGoAction);
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f45171id = liveGoAction.getGoData();
        BLiveStreamUrl bLiveStreamUrlNew_ = BLiveStreamUrl.new_();
        bLiveNew_.streamUrl = bLiveStreamUrlNew_;
        bLiveStreamUrlNew_.pullFlv = mwl.m160560m(liveGoAction, "pullFlv");
        bLiveNew_.streamUrl.pullFlvIpv6 = mwl.m160560m(liveGoAction, "pullFlvIpv6");
        bLiveNew_.callback = mwl.m160560m(liveGoAction, "callback");
        BLiveStreamCdnInfo bLiveStreamCdnInfoNew_ = BLiveStreamCdnInfo.new_();
        bLiveNew_.streamCdnInfo = bLiveStreamCdnInfoNew_;
        bLiveStreamCdnInfoNew_.provider = mwl.m160562o(mwl.m160560m(liveGoAction, "provider"));
        bLiveNew_.streamCdnInfo.businessType = mwl.m160562o(mwl.m160560m(liveGoAction, "businessType"));
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveNew_.room = bLiveOwnerNew_;
        bLiveOwnerNew_.f45267id = mwl.m160560m(liveGoAction, "roomId");
        bLiveNew_.liveMode = mwl.m160560m(liveGoAction, "liveMode");
        String strM160560m = mwl.m160560m(liveGoAction, "source");
        act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68776D(bLiveNew_).m68787O(strM160560m).m68798y(mwl.m160560m(liveGoAction, "category")).m68794u()));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (mwl.m160558h(act)) {
            return;
        }
        m160564b(act, SchemeKey.liveSquare, null);
        String strM199898j = v5k0.m199898j(abe0Var, "liveId");
        if (TextUtils.isEmpty(strM199898j)) {
            return;
        }
        String strM199898j2 = v5k0.m199898j(abe0Var, "source");
        String strM199898j3 = v5k0.m199898j(abe0Var, "category");
        String strM199898j4 = v5k0.m199898j(abe0Var, "liveMode");
        AudienceStartData.C11593a c11593aM68798y = AudienceStartData.getBuilder().m68777E(strM199898j).m68779G(q5k0.m175373O(v5k0.m199898j(abe0Var, "liveSchema"))).m68787O(strM199898j2).m68798y(strM199898j3);
        c11593aM68798y.m68778F(strM199898j4);
        act.startActivity(tbs.f172993f.m143704f(act, c11593aM68798y.m68794u()));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: j */
    public boolean mo108064j(int i) {
        return 3 == i;
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return mo160563a("liveRoom").equals(str);
    }
}

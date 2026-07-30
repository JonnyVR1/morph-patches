package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;

/* JADX INFO: loaded from: classes4.dex */
public class bn80 extends a3g0 {
    @Override // p153l.a3g0
    /* JADX INFO: renamed from: a */
    public void mo95802a(p2g0 p2g0Var) {
        d3g0 d3g0VarMo170350a = p2g0Var.mo170350a();
        if (!q2f.m175025b(d3g0VarMo170350a.m113813c(), true) && !d3g0VarMo170350a.m113815e() && !d3g0VarMo170350a.m113814d()) {
            BLiveAbsData bLiveAbsData = d3g0VarMo170350a.m113813c().live;
            if (!bLiveAbsData.isVoiceLive() && !(bLiveAbsData instanceof BLiveVoice) && !TextUtils.isEmpty(bLiveAbsData.streamUrl.pullFlv) && !TextUtils.isEmpty(bLiveAbsData.room.f45267id) && elt.m121283u()) {
                qwl qwlVarM115508b = df80.m115507a().m115508b(true);
                qwlVarM115508b.mo178532l("", "prePlay", bLiveAbsData);
                BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
                qwlVarM115508b.mo178530j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.f45267id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
            }
        }
        p2g0Var.mo170351b(d3g0VarMo170350a);
    }
}

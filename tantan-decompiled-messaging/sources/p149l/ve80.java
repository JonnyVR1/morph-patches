package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;

/* JADX INFO: loaded from: classes4.dex */
public class ve80 extends ruf0 {
    @Override // p149l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo98305a(guf0 guf0Var) {
        uuf0 uuf0VarMo128030a = guf0Var.mo128030a();
        if (!l1f.m148174b(uuf0VarMo128030a.m195359c(), true) && !uuf0VarMo128030a.m195361e() && !uuf0VarMo128030a.m195360d()) {
            BLiveAbsData bLiveAbsData = uuf0VarMo128030a.m195359c().live;
            if (!bLiveAbsData.isVoiceLive() && !(bLiveAbsData instanceof BLiveVoice) && !TextUtils.isEmpty(bLiveAbsData.streamUrl.pullFlv) && !TextUtils.isEmpty(bLiveAbsData.room.f44419id) && djt.m112138u()) {
                cul culVarM207169b = x680.m207168a().m207169b(true);
                culVarM207169b.mo108800l("", "prePlay", bLiveAbsData);
                BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
                culVarM207169b.mo108798j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.f44419id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
            }
        }
        guf0Var.mo128031b(uuf0VarMo128030a);
    }
}

package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import l.cul;
import l.djt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ve80 extends ruf0 {
    @Override // p002l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo10063a(guf0 guf0Var) {
        uuf0 uuf0VarMo14046a = guf0Var.mo14046a();
        if (!l1f.m16935b(uuf0VarMo14046a.m23633c(), true) && !uuf0VarMo14046a.m23635e() && !uuf0VarMo14046a.m23634d()) {
            BLiveAbsData bLiveAbsData = uuf0VarMo14046a.m23633c().live;
            if (!bLiveAbsData.isVoiceLive() && !(bLiveAbsData instanceof BLiveVoice) && !TextUtils.isEmpty(bLiveAbsData.streamUrl.pullFlv) && !TextUtils.isEmpty(bLiveAbsData.room.id) && djt.u()) {
                cul culVarM25693b = x680.m25692a().m25693b(true);
                culVarM25693b.l("", "prePlay", bLiveAbsData);
                BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
                culVarM25693b.j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
            }
        }
        guf0Var.mo14047b(uuf0VarMo14046a);
    }
}

package p153l;

import android.text.TextUtils;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGameInfoReq;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class hgs {
    /* JADX INFO: renamed from: a */
    public final BLiveGameInfoReq m134970a(GiftTrayData giftTrayData) {
        BLiveGameInfoReq bLiveGameInfoReqNew_ = BLiveGameInfoReq.new_();
        bLiveGameInfoReqNew_.scenario = "live";
        bLiveGameInfoReqNew_.roomId = giftTrayData.f50923E;
        bLiveGameInfoReqNew_.liveId = giftTrayData.f50950h;
        bLiveGameInfoReqNew_.anchorId = giftTrayData.f50921C;
        bLiveGameInfoReqNew_.giftId = String.valueOf(giftTrayData.f50947e);
        bLiveGameInfoReqNew_.tradeNo = giftTrayData.f50960r;
        return bLiveGameInfoReqNew_;
    }

    /* JADX INFO: renamed from: b */
    public C22421c<BLiveEnvelope> m134971b(GiftTrayData giftTrayData, String str) {
        String string;
        String string2;
        String string3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("url");
            try {
                string2 = jSONObject.getString(CommandMessage.PARAMS);
                try {
                    string3 = new JSONObject(string2).getString("gameInfoExt");
                } catch (JSONException e) {
                    e = e;
                    CrashHelper.m82479c(e);
                }
            } catch (JSONException e2) {
                e = e2;
                string2 = "";
            }
        } catch (JSONException e3) {
            e = e3;
            string = "";
            string2 = string;
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            clj.m110636o("上报的 url 或者参数 params 为空了。 错误");
        }
        BLiveGameInfoReq bLiveGameInfoReqM134970a = m134970a(giftTrayData);
        bLiveGameInfoReqM134970a.gameInfoExt = string3;
        return aiv.m98141u1(string, bLiveGameInfoReqM134970a);
    }
}

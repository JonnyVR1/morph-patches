package p149l;

import android.text.TextUtils;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGameInfoReq;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class ges {
    /* JADX INFO: renamed from: a */
    public final BLiveGameInfoReq m125849a(GiftTrayData giftTrayData) {
        BLiveGameInfoReq bLiveGameInfoReqNew_ = BLiveGameInfoReq.new_();
        bLiveGameInfoReqNew_.scenario = "live";
        bLiveGameInfoReqNew_.roomId = giftTrayData.f50075E;
        bLiveGameInfoReqNew_.liveId = giftTrayData.f50102h;
        bLiveGameInfoReqNew_.anchorId = giftTrayData.f50073C;
        bLiveGameInfoReqNew_.giftId = String.valueOf(giftTrayData.f50099e);
        bLiveGameInfoReqNew_.tradeNo = giftTrayData.f50112r;
        return bLiveGameInfoReqNew_;
    }

    /* JADX INFO: renamed from: b */
    public C22306c<BLiveEnvelope> m125850b(GiftTrayData giftTrayData, String str) {
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
                    CrashHelper.m81296c(e);
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
            iij.m136421o("上报的 url 或者参数 params 为空了。 错误");
        }
        BLiveGameInfoReq bLiveGameInfoReqM125849a = m125849a(giftTrayData);
        bLiveGameInfoReqM125849a.gameInfoExt = string3;
        return zfv.m218607u1(string, bLiveGameInfoReqM125849a);
    }
}

package p149l;

import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lag0 extends mng0 {
    @Override // p149l.mng0
    /* JADX INFO: renamed from: a */
    public final gpg0 mo146978a(JSONObject jSONObject) {
        try {
            jSONObject.getString("adUnitId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("style");
            jSONObject2.optInt(BLiveGiftBubblePopupTitlePosition.left);
            jSONObject2.optInt(StickStatus.top);
            jSONObject2.optInt("width");
            jSONObject2.optInt("height");
            return new xjg0();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}

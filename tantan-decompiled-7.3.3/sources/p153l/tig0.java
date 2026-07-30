package p153l;

import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tig0 extends uvg0 {
    @Override // p153l.uvg0
    /* JADX INFO: renamed from: a */
    public final oxg0 mo105060a(JSONObject jSONObject) {
        try {
            jSONObject.getString("adUnitId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("style");
            jSONObject2.optInt(BLiveGiftBubblePopupTitlePosition.left);
            jSONObject2.optInt(StickStatus.top);
            jSONObject2.optInt("width");
            jSONObject2.optInt("height");
            return new fsg0();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}

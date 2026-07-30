package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class wut0 implements hvs0 {

    /* JADX INFO: renamed from: a */
    public final Context f190886a;

    /* JADX INFO: renamed from: b */
    public final v6s0 f190887b;

    /* JADX INFO: renamed from: c */
    public final PowerManager f190888c;

    public wut0(Context context, v6s0 v6s0Var) {
        this.f190886a = context;
        this.f190887b = v6s0Var;
        this.f190888c = (PowerManager) context.getSystemService("power");
    }

    @Override // p153l.hvs0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(gvt0 gvt0Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        x6s0 x6s0Var = gvt0Var.f106686f;
        if (x6s0Var == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f190887b.m200138d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = x6s0Var.f192621a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f190887b.m200136b()).put("activeViewJSON", this.f190887b.m200138d()).put("timestamp", gvt0Var.f106684d).put("adFormat", this.f190887b.m200135a()).put("hashCode", this.f190887b.m200137c()).put("isMraid", false).put("isStopped", false).put("isPaused", gvt0Var.f106682b).put("isNative", this.f190887b.m200139e()).put("isScreenOn", this.f190888c.isInteractive()).put("appMuted", bxy0.m106936t().m157993e()).put("appVolume", bxy0.m106936t().m157990a()).put("deviceVolume", mdr0.m157989b(this.f190886a.getApplicationContext()));
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168017I5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f190886a.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f190886a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", x6s0Var.f192622b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put(StickStatus.top, x6s0Var.f192623c.top).put("bottom", x6s0Var.f192623c.bottom).put(BLiveGiftBubblePopupTitlePosition.left, x6s0Var.f192623c.left).put("right", x6s0Var.f192623c.right)).put("adBox", new JSONObject().put(StickStatus.top, x6s0Var.f192624d.top).put("bottom", x6s0Var.f192624d.bottom).put(BLiveGiftBubblePopupTitlePosition.left, x6s0Var.f192624d.left).put("right", x6s0Var.f192624d.right)).put("globalVisibleBox", new JSONObject().put(StickStatus.top, x6s0Var.f192625e.top).put("bottom", x6s0Var.f192625e.bottom).put(BLiveGiftBubblePopupTitlePosition.left, x6s0Var.f192625e.left).put("right", x6s0Var.f192625e.right)).put("globalVisibleBoxVisible", x6s0Var.f192626f).put("localVisibleBox", new JSONObject().put(StickStatus.top, x6s0Var.f192627g.top).put("bottom", x6s0Var.f192627g.bottom).put(BLiveGiftBubblePopupTitlePosition.left, x6s0Var.f192627g.left).put("right", x6s0Var.f192627g.right)).put("localVisibleBoxVisible", x6s0Var.f192628h).put("hitBox", new JSONObject().put(StickStatus.top, x6s0Var.f192629i.top).put("bottom", x6s0Var.f192629i.bottom).put(BLiveGiftBubblePopupTitlePosition.left, x6s0Var.f192629i.left).put("right", x6s0Var.f192629i.right)).put("screenDensity", this.f190886a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", gvt0Var.f106681a);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168424p1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = x6s0Var.f192631k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put(StickStatus.top, rect2.top).put("bottom", rect2.bottom).put(BLiveGiftBubblePopupTitlePosition.left, rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(gvt0Var.f106685e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}

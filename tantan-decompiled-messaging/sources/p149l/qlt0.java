package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qlt0 implements bms0 {

    /* JADX INFO: renamed from: a */
    public final Context f155255a;

    /* JADX INFO: renamed from: b */
    public final pxr0 f155256b;

    /* JADX INFO: renamed from: c */
    public final PowerManager f155257c;

    public qlt0(Context context, pxr0 pxr0Var) {
        this.f155255a = context;
        this.f155256b = pxr0Var;
        this.f155257c = (PowerManager) context.getSystemService("power");
    }

    @Override // p149l.bms0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(amt0 amt0Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        rxr0 rxr0Var = amt0Var.f70683f;
        if (rxr0Var == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f155256b.m171951d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = rxr0Var.f161495a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f155256b.m171949b()).put("activeViewJSON", this.f155256b.m171951d()).put("timestamp", amt0Var.f70681d).put("adFormat", this.f155256b.m171948a()).put("hashCode", this.f155256b.m171950c()).put("isMraid", false).put("isStopped", false).put("isPaused", amt0Var.f70679b).put("isNative", this.f155256b.m171952e()).put("isScreenOn", this.f155257c.isInteractive()).put("appMuted", vny0.m199082t().m124398e()).put("appVolume", vny0.m199082t().m124395a()).put("deviceVolume", g4r0.m124394b(this.f155255a.getApplicationContext()));
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131946I5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f155255a.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f155255a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", rxr0Var.f161496b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put(StickStatus.top, rxr0Var.f161497c.top).put("bottom", rxr0Var.f161497c.bottom).put(BLiveGiftBubblePopupTitlePosition.left, rxr0Var.f161497c.left).put("right", rxr0Var.f161497c.right)).put("adBox", new JSONObject().put(StickStatus.top, rxr0Var.f161498d.top).put("bottom", rxr0Var.f161498d.bottom).put(BLiveGiftBubblePopupTitlePosition.left, rxr0Var.f161498d.left).put("right", rxr0Var.f161498d.right)).put("globalVisibleBox", new JSONObject().put(StickStatus.top, rxr0Var.f161499e.top).put("bottom", rxr0Var.f161499e.bottom).put(BLiveGiftBubblePopupTitlePosition.left, rxr0Var.f161499e.left).put("right", rxr0Var.f161499e.right)).put("globalVisibleBoxVisible", rxr0Var.f161500f).put("localVisibleBox", new JSONObject().put(StickStatus.top, rxr0Var.f161501g.top).put("bottom", rxr0Var.f161501g.bottom).put(BLiveGiftBubblePopupTitlePosition.left, rxr0Var.f161501g.left).put("right", rxr0Var.f161501g.right)).put("localVisibleBoxVisible", rxr0Var.f161502h).put("hitBox", new JSONObject().put(StickStatus.top, rxr0Var.f161503i.top).put("bottom", rxr0Var.f161503i.bottom).put(BLiveGiftBubblePopupTitlePosition.left, rxr0Var.f161503i.left).put("right", rxr0Var.f161503i.right)).put("screenDensity", this.f155255a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", amt0Var.f70678a);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132353p1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = rxr0Var.f161505k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put(StickStatus.top, rect2.top).put("bottom", rect2.bottom).put(BLiveGiftBubblePopupTitlePosition.left, rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(amt0Var.f70682e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}

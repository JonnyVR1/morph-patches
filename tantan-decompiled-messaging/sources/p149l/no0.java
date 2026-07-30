package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 J2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0015R\"\u0010!\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0015R\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0015R\"\u0010)\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0015R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b*\u0010\u0015R\"\u00101\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00107\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00103\u001a\u0004\b\r\u00104\"\u0004\b5\u00106R\"\u0010:\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b&\u00104\"\u0004\b9\u00106R\"\u0010<\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010,\u001a\u0004\b8\u0010.\"\u0004\b;\u00100R\"\u0010>\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b=\u0010\u0015R$\u0010D\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010@\u001a\u0004\b\"\u0010A\"\u0004\bB\u0010CR$\u0010I\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010E\u001a\u0004\b\u001e\u0010F\"\u0004\bG\u0010H¨\u0006K"}, m87232d2 = {"Ll/no0;", "", "<init>", "()V", "Lorg/json/JSONObject;", "json", "", "m", "(Lorg/json/JSONObject;)Z", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getVersion", "()I", WBConstants.AUTH_PARAMS_VERSION, "b", "getTotalFrames", "setTotalFrames", "(I)V", "totalFrames", "c", "j", "w", "width", Constants.INAPP_DATA_TAG, "r", "height", "e", RXScreenCaptureService.KEY_INDEX, ResourceDirection.f38808v, "videoWidth", "f", "h", "u", "videoHeight", "g", "getOrien", "setOrien", "orien", "q", "fps", "Z", BLiveStormDanmakuGiftResourceType.f44444l, "()Z", "setMix", "(Z)V", "isMix", "Ll/ga80;", "Ll/ga80;", "()Ll/ga80;", "n", "(Ll/ga80;)V", "alphaPointRect", "k", Constants.KEY_T, "rgbPointRect", "o", "isDefaultConfig", "p", "defaultVideoMode", "Ll/d3x;", "Ll/d3x;", "()Ll/d3x;", "setMaskConfig", "(Ll/d3x;)V", "maskConfig", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", BLiveStormDanmakuGiftResourceType.f44446s, "(Lorg/json/JSONObject;)V", "jsonConfig", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class no0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int totalFrames;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int height;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int videoWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int videoHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int orien;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int fps;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isMix;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isDefaultConfig;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public d3x maskConfig;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public JSONObject jsonConfig;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int version = 2;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public ga80 alphaPointRect = new ga80(0, 0, 0, 0);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public ga80 rgbPointRect = new ga80(0, 0, 0, 0);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int defaultVideoMode = 1;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ga80 getAlphaPointRect() {
        return this.alphaPointRect;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDefaultVideoMode() {
        return this.defaultVideoMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFps() {
        return this.fps;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final JSONObject getJsonConfig() {
        return this.jsonConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final d3x getMaskConfig() {
        return this.maskConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final ga80 getRgbPointRect() {
        return this.rgbPointRect;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getVideoHeight() {
        return this.videoHeight;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsDefaultConfig() {
        return this.isDefaultConfig;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsMix() {
        return this.isMix;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m160388m(@NotNull JSONObject json) {
        json.getClass();
        try {
            JSONObject jSONObject = json.getJSONObject(BaseSei.INFO);
            int i = jSONObject.getInt(ResourceDirection.f38808v);
            int i2 = this.version;
            if (i2 != i) {
                C21588z0.INSTANCE.m216707b("AnimPlayer.AnimConfig", "current version=" + i2 + " target=" + i);
                return false;
            }
            this.totalFrames = jSONObject.getInt("f");
            this.width = jSONObject.getInt("w");
            this.height = jSONObject.getInt("h");
            this.videoWidth = jSONObject.getInt("videoW");
            this.videoHeight = jSONObject.getInt("videoH");
            this.orien = jSONObject.getInt("orien");
            this.fps = jSONObject.getInt("fps");
            this.isMix = jSONObject.getInt("isVapx") == 1;
            JSONArray jSONArray = jSONObject.getJSONArray("aFrame");
            if (jSONArray == null) {
                return false;
            }
            this.alphaPointRect = new ga80(jSONArray.getInt(0), jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3));
            JSONArray jSONArray2 = jSONObject.getJSONArray("rgbFrame");
            if (jSONArray2 == null) {
                return false;
            }
            this.rgbPointRect = new ga80(jSONArray2.getInt(0), jSONArray2.getInt(1), jSONArray2.getInt(2), jSONArray2.getInt(3));
            return true;
        } catch (JSONException e) {
            C21588z0.INSTANCE.m216708c("AnimPlayer.AnimConfig", "json parse fail " + e, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m160389n(@NotNull ga80 ga80Var) {
        ga80Var.getClass();
        this.alphaPointRect = ga80Var;
    }

    /* JADX INFO: renamed from: o */
    public final void m160390o(boolean z) {
        this.isDefaultConfig = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m160391p(int i) {
        this.defaultVideoMode = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m160392q(int i) {
        this.fps = i;
    }

    /* JADX INFO: renamed from: r */
    public final void m160393r(int i) {
        this.height = i;
    }

    /* JADX INFO: renamed from: s */
    public final void m160394s(@Nullable JSONObject jSONObject) {
        this.jsonConfig = jSONObject;
    }

    /* JADX INFO: renamed from: t */
    public final void m160395t(@NotNull ga80 ga80Var) {
        ga80Var.getClass();
        this.rgbPointRect = ga80Var;
    }

    @NotNull
    public String toString() {
        return "AnimConfig(version=" + this.version + ", totalFrames=" + this.totalFrames + ", width=" + this.width + ", height=" + this.height + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", orien=" + this.orien + ", fps=" + this.fps + ", isMix=" + this.isMix + ", alphaPointRect=" + this.alphaPointRect + ", rgbPointRect=" + this.rgbPointRect + ", isDefaultConfig=" + this.isDefaultConfig + ")";
    }

    /* JADX INFO: renamed from: u */
    public final void m160396u(int i) {
        this.videoHeight = i;
    }

    /* JADX INFO: renamed from: v */
    public final void m160397v(int i) {
        this.videoWidth = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m160398w(int i) {
        this.width = i;
    }
}

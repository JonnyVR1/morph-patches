package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.feed.data.Frame;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\b\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\r\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\"\u0010\u0017¨\u0006$"}, m88121d2 = {"Ll/e6j;", "", "", FirebaseAnalytics.Param.INDEX, "Lorg/json/JSONObject;", "json", "<init>", "(ILorg/json/JSONObject;)V", "a", "I", "getIndex", "()I", "", "b", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "setSrcId", "(Ljava/lang/String;)V", "srcId", "c", "e", "setZ", "(I)V", BaseSei.f14626Z, "Ll/mi80;", "Ll/mi80;", "()Ll/mi80;", "setFrame", "(Ll/mi80;)V", Frame.TYPE, "setMFrame", "mFrame", "f", "setMt", "mt", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class e6j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String srcId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int z;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public mi80 frame;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public mi80 mFrame;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int mt;

    public e6j(int i, @NotNull JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        this.index = i;
        this.srcId = "";
        String string = jSONObject.getString("srcId");
        string.getClass();
        this.srcId = string;
        this.z = jSONObject.getInt(BaseSei.f14626Z);
        JSONArray jSONArray = jSONObject.getJSONArray(Frame.TYPE);
        this.frame = new mi80(jSONArray.getInt(0), jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3));
        JSONArray jSONArray2 = jSONObject.getJSONArray("mFrame");
        this.mFrame = new mi80(jSONArray2.getInt(0), jSONArray2.getInt(1), jSONArray2.getInt(2), jSONArray2.getInt(3));
        this.mt = jSONObject.getInt("mt");
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final mi80 getFrame() {
        return this.frame;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final mi80 getMFrame() {
        return this.mFrame;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMt() {
        return this.mt;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSrcId() {
        return this.srcId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getZ() {
        return this.z;
    }
}

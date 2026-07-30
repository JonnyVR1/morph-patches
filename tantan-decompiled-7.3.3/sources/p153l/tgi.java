package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u0000 42\u00020\u0001:\u0001\u0016B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u009a\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b)\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b.\u0010\u001bR'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b0\u00101R'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b*\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b-\u00103¨\u00065"}, m88121d2 = {"Ll/tgi;", "", "", "bid", "", "localVersion", "newVersion", "zipUrl", "patchUrl", "", "asymEncrypt", "isSandbox", "", "sourceJson", "mkConfigMap", "Lorg/json/JSONObject;", "originSourceJson", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IILjava/util/Map;Ljava/util/Map;Lorg/json/JSONObject;)V", "", "j", "()Z", "a", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IILjava/util/Map;Ljava/util/Map;Lorg/json/JSONObject;)Ll/tgi;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBid", "b", "J", Constants.INAPP_DATA_TAG, "()J", BLiveStormDanmakuGiftResourceType.f45292l, "(J)V", "c", "f", RXScreenCaptureService.KEY_INDEX, "e", "h", "I", "g", "k", "Ljava/util/Map;", "getSourceJson", "()Ljava/util/Map;", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "Companion", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class tgi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String bid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long localVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long newVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String zipUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String patchUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int asymEncrypt;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int isSandbox;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Map<String, Object> sourceJson;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final Map<String, Object> mkConfigMap;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final JSONObject originSourceJson;

    public tgi(@NotNull String str, long j, long j2, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, ? extends Object> map2, @Nullable JSONObject jSONObject) {
        str.getClass();
        this.bid = str;
        this.localVersion = j;
        this.newVersion = j2;
        this.zipUrl = str2;
        this.patchUrl = str3;
        this.asymEncrypt = i;
        this.isSandbox = i2;
        this.sourceJson = map;
        this.mkConfigMap = map2;
        this.originSourceJson = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ tgi m191026b(tgi tgiVar, String str, long j, long j2, String str2, String str3, int i, int i2, Map map, Map map2, JSONObject jSONObject, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tgiVar.bid;
        }
        if ((i3 & 2) != 0) {
            j = tgiVar.localVersion;
        }
        if ((i3 & 4) != 0) {
            j2 = tgiVar.newVersion;
        }
        if ((i3 & 8) != 0) {
            str2 = tgiVar.zipUrl;
        }
        if ((i3 & 16) != 0) {
            str3 = tgiVar.patchUrl;
        }
        if ((i3 & 32) != 0) {
            i = tgiVar.asymEncrypt;
        }
        if ((i3 & 64) != 0) {
            i2 = tgiVar.isSandbox;
        }
        if ((i3 & 128) != 0) {
            map = tgiVar.sourceJson;
        }
        if ((i3 & 256) != 0) {
            map2 = tgiVar.mkConfigMap;
        }
        if ((i3 & 512) != 0) {
            jSONObject = tgiVar.originSourceJson;
        }
        Map map3 = map2;
        JSONObject jSONObject2 = jSONObject;
        Map map4 = map;
        int i4 = i;
        String str4 = str2;
        long j3 = j2;
        return tgiVar.m191027a(str, j, j3, str4, str3, i4, i2, map4, map3, jSONObject2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final tgi m191027a(@NotNull String bid, long localVersion, long newVersion, @Nullable String zipUrl, @Nullable String patchUrl, int asymEncrypt, int isSandbox, @Nullable Map<String, ? extends Object> sourceJson, @Nullable Map<String, ? extends Object> mkConfigMap, @Nullable JSONObject originSourceJson) {
        bid.getClass();
        return new tgi(bid, localVersion, newVersion, zipUrl, patchUrl, asymEncrypt, isSandbox, sourceJson, mkConfigMap, originSourceJson);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAsymEncrypt() {
        return this.asymEncrypt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLocalVersion() {
        return this.localVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Map<String, Object> m191030e() {
        return this.mkConfigMap;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tgi)) {
            return false;
        }
        tgi tgiVar = (tgi) other;
        return Intrinsics.m88377d(this.bid, tgiVar.bid) && this.localVersion == tgiVar.localVersion && this.newVersion == tgiVar.newVersion && Intrinsics.m88377d(this.zipUrl, tgiVar.zipUrl) && Intrinsics.m88377d(this.patchUrl, tgiVar.patchUrl) && this.asymEncrypt == tgiVar.asymEncrypt && this.isSandbox == tgiVar.isSandbox && Intrinsics.m88377d(this.sourceJson, tgiVar.sourceJson) && Intrinsics.m88377d(this.mkConfigMap, tgiVar.mkConfigMap) && Intrinsics.m88377d(this.originSourceJson, tgiVar.originSourceJson);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getNewVersion() {
        return this.newVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final JSONObject getOriginSourceJson() {
        return this.originSourceJson;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPatchUrl() {
        return this.patchUrl;
    }

    public int hashCode() {
        String str = this.bid;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.localVersion)) * 31) + Long.hashCode(this.newVersion)) * 31;
        String str2 = this.zipUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.patchUrl;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.asymEncrypt)) * 31) + Integer.hashCode(this.isSandbox)) * 31;
        Map<String, Object> map = this.sourceJson;
        int iHashCode4 = (iHashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.mkConfigMap;
        int iHashCode5 = (iHashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.originSourceJson;
        return iHashCode5 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getZipUrl() {
        return this.zipUrl;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m191035j() {
        return this.localVersion != this.newVersion;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getIsSandbox() {
        return this.isSandbox;
    }

    /* JADX INFO: renamed from: l */
    public final void m191037l(long j) {
        this.localVersion = j;
    }

    @NotNull
    public String toString() {
        return "FepPackageCheckResult(bid=" + this.bid + ", localVersion=" + this.localVersion + ", newVersion=" + this.newVersion + ", zipUrl=" + this.zipUrl + ", patchUrl=" + this.patchUrl + ", asymEncrypt=" + this.asymEncrypt + ", isSandbox=" + this.isSandbox + ", sourceJson=" + this.sourceJson + ", mkConfigMap=" + this.mkConfigMap + ", originSourceJson=" + this.originSourceJson + ")";
    }

    /* JADX INFO: renamed from: l.tgi$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\u00132\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/tgi$a;", "", "<init>", "()V", "", "zipUrl", "patchUrl", "bid", "", "localVersion", "newVersion", "", "asymEncrypt", "isSandbox", "", "mkConfig", "sourceJson", "Lorg/json/JSONObject;", "originSourceJson", "Ll/tgi;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIILjava/util/Map;Ljava/util/Map;Lorg/json/JSONObject;)Ll/tgi;", "json", "c", "(Lorg/json/JSONObject;Ljava/lang/String;JLorg/json/JSONObject;)Ll/tgi;", "map", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;Ljava/lang/String;)Ll/tgi;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        private final tgi m191038a(String zipUrl, String patchUrl, String bid, long localVersion, long newVersion, int asymEncrypt, int isSandbox, Map<String, ? extends Object> mkConfig, Map<String, ? extends Object> sourceJson, JSONObject originSourceJson) {
            String strM195903a = ugi.m195903a(zipUrl);
            String strM195903a2 = ugi.m195903a(patchUrl);
            if (mkConfig.isEmpty()) {
                mkConfig = null;
            }
            return new tgi(bid, localVersion, newVersion, strM195903a, strM195903a2, asymEncrypt, isSandbox, sourceJson, mkConfig, originSourceJson);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ tgi m191039b(Companion companion, String str, String str2, String str3, long j, long j2, int i, int i2, Map map, Map map2, JSONObject jSONObject, int i3, Object obj) {
            return companion.m191038a(str, str2, str3, j, j2, i, i2, map, map2, (i3 & 512) != 0 ? null : jSONObject);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final tgi m191040c(@NotNull JSONObject json, @NotNull String bid, long localVersion, @Nullable JSONObject originSourceJson) {
            json.getClass();
            bid.getClass();
            long jOptLong = json.optLong("newest_version", 0L);
            String strOptString = json.optString("zip_url");
            String strOptString2 = json.optString("patch_url");
            int iOptInt = json.optInt("asymEncrypt", 0);
            int iOptInt2 = json.optInt("isSandbox", 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = json.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                linkedHashMap.put(next, json.opt(next));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("mk_config");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next2);
                    next2.getClass();
                    linkedHashMap2.put(next2, objOpt);
                }
            }
            strOptString.getClass();
            strOptString2.getClass();
            return m191038a(strOptString, strOptString2, bid, localVersion, jOptLong, iOptInt, iOptInt2, linkedHashMap2, linkedHashMap, originSourceJson);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final tgi m191041d(@NotNull Map<String, ? extends Object> map, @NotNull String bid) {
            map.getClass();
            bid.getClass();
            Long lM151325m = kt0.m151325m(map.get("newest_version"));
            long jLongValue = lM151325m != null ? lM151325m.longValue() : 0L;
            String strM114836a = d8g0.m114836a(kt0.m151327o(map.get("zip_url")));
            String strM114836a2 = d8g0.m114836a(kt0.m151327o(map.get("patch_url")));
            Integer numM151323k = kt0.m151323k(map.get("asymEncrypt"));
            int iIntValue = numM151323k != null ? numM151323k.intValue() : 0;
            Integer numM151323k2 = kt0.m151323k(map.get("isSandbox"));
            int iIntValue2 = numM151323k2 != null ? numM151323k2.intValue() : 0;
            Map mapM151326n = kt0.m151326n(map.get("mk_config"));
            if (mapM151326n == null) {
                mapM151326n = new LinkedHashMap();
            }
            return m191039b(this, strM114836a, strM114836a2, bid, 0L, jLongValue, iIntValue, iIntValue2, mapM151326n, map, null, 512, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

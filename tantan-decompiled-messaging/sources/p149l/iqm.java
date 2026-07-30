package p149l;

import com.clevertap.android.sdk.C1289j;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.cryption.InterfaceC1176c;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b1\b\u0000\u0018\u0000 C2\u00020\u0001:\u00012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001a\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001c\u0010\u0016J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b$\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\r¢\u0006\u0004\b)\u0010\u0011J\r\u0010*\u001a\u00020\u000f¢\u0006\u0004\b*\u0010'J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b+\u0010#J\u001b\u0010-\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b-\u0010\u0016J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b.\u0010#J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\nJ\u001f\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00106R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00106R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00106R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00106R.\u0010B\u001a\u0004\u0018\u00010\r2\b\u0010<\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, m87232d2 = {"Ll/iqm;", "Ll/fr4;", "Ll/hnl;", "ctPreference", "Lcom/clevertap/android/sdk/cryption/c;", "cryptHandler", "<init>", "(Ll/hnl;Lcom/clevertap/android/sdk/cryption/c;)V", "", BLiveStormDanmakuGiftResourceType.f44444l, "()V", "n", "m", "", "inAppIds", "Lorg/json/JSONArray;", "c", "(Ljava/lang/String;)Lorg/json/JSONArray;", "", "Lorg/json/JSONObject;", "clientSideInApps", "q", "(Ljava/util/List;)V", "serverSideInAppsMetaData", "u", "serverSideInActionMetaData", BLiveStormDanmakuGiftResourceType.f44446s, "serverSideInApps", Constants.KEY_T, "evaluatedServerSideInAppIds", "r", "(Lorg/json/JSONArray;)V", "suppressedClientSideInAppIds", ResourceDirection.f38808v, "e", "()Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "g", "f", "()Lorg/json/JSONArray;", "evaluatedIds", "b", "j", "h", "delayedInApps", "p", Constants.INAPP_DATA_TAG, "k", Constants.DEVICE_ID_TAG, "accountId", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Ll/hnl;", "Lcom/clevertap/android/sdk/cryption/c;", "Ljava/util/List;", "clientSideInAppsCache", "serverSideInAppsCache", "clientSideDelayedInAppsCache", "serverSideMetaCache", "serverSideInActionCache", "value", "Ljava/lang/String;", "getMode", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "mode", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class iqm implements fr4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final hnl ctPreference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC1176c cryptHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private List<? extends JSONObject> clientSideInAppsCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<? extends JSONObject> serverSideInAppsCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<? extends JSONObject> clientSideDelayedInAppsCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private List<? extends JSONObject> serverSideMetaCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private List<? extends JSONObject> serverSideInActionCache;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String mode;

    public iqm(@NotNull hnl hnlVar, @NotNull InterfaceC1176c interfaceC1176c) {
        hnlVar.getClass();
        interfaceC1176c.getClass();
        this.ctPreference = hnlVar;
        this.cryptHandler = interfaceC1176c;
    }

    /* JADX INFO: renamed from: c */
    private final JSONArray m137761c(String inAppIds) {
        try {
            JSONObject jSONObject = new JSONObject(inAppIds);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.RAISED);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("profile");
            JSONArray jSONArray = new JSONArray();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    jSONArray.put(jSONArrayOptJSONArray.get(i));
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    jSONArray.put(jSONArrayOptJSONArray2.get(i2));
                }
            }
            return jSONArray;
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m137762l() {
        this.ctPreference.remove("inapp_notifs_cs");
        this.clientSideInAppsCache = null;
    }

    /* JADX INFO: renamed from: m */
    private final void m137763m() {
        this.ctPreference.remove("inaction_inapp_notifs_ss");
        this.serverSideInActionCache = null;
    }

    /* JADX INFO: renamed from: n */
    private final void m137764n() {
        this.ctPreference.remove("inapp_notifs_ss");
        this.serverSideMetaCache = null;
    }

    @Override // p149l.fr4
    /* JADX INFO: renamed from: a */
    public void mo122801a(@NotNull String deviceId, @NotNull String accountId) {
        deviceId.getClass();
        accountId.getClass();
        this.ctPreference.mo131947d(C1289j.INSTANCE.m6769a().m6762c(1, deviceId, accountId));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JSONArray m137765b(@NotNull String evaluatedIds) {
        evaluatedIds.getClass();
        try {
            JSONObject jSONObject = new JSONObject(evaluatedIds);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.RAISED);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("profile");
            JSONArray jSONArray = new JSONArray();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    jSONArray.put(jSONArrayOptJSONArray.get(i));
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    jSONArray.put(jSONArrayOptJSONArray2.get(i2));
                }
            }
            return jSONArray;
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<JSONObject> m137766d() {
        List listEmptyList;
        List list = this.clientSideDelayedInAppsCache;
        if (list != null) {
            return list;
        }
        String strMo131945b = this.ctPreference.mo131945b("delayed_inapp_notifs_cs", "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            try {
                JSONArray jSONArray = new JSONArray(this.cryptHandler.mo5948a(strMo131945b));
                listEmptyList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        listEmptyList.add(obj);
                    }
                }
            } catch (Exception unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        this.clientSideDelayedInAppsCache = listEmptyList;
        return listEmptyList;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<JSONObject> m137767e() {
        List listEmptyList;
        List list = this.clientSideInAppsCache;
        if (list != null) {
            return list;
        }
        String strMo131945b = this.ctPreference.mo131945b("inapp_notifs_cs", "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            try {
                JSONArray jSONArray = new JSONArray(this.cryptHandler.mo5948a(strMo131945b));
                listEmptyList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        listEmptyList.add(obj);
                    }
                }
            } catch (Exception unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        this.clientSideInAppsCache = listEmptyList;
        return listEmptyList;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final JSONArray m137768f() {
        String strMo131945b = this.ctPreference.mo131945b(Constants.PREFS_EVALUATED_INAPP_KEY_SS, "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            return new JSONArray();
        }
        try {
            return new JSONArray(strMo131945b);
        } catch (JSONException unused) {
            return m137765b(strMo131945b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<JSONObject> m137769g() {
        List listEmptyList;
        List list = this.serverSideInActionCache;
        if (list != null) {
            return list;
        }
        String strMo131945b = this.ctPreference.mo131945b("inaction_inapp_notifs_ss", "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            try {
                JSONArray jSONArray = new JSONArray(strMo131945b);
                listEmptyList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        listEmptyList.add(obj);
                    }
                }
            } catch (JSONException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        this.serverSideInActionCache = listEmptyList;
        return listEmptyList;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<JSONObject> m137770h() {
        List listEmptyList;
        List list = this.serverSideInAppsCache;
        if (list != null) {
            return list;
        }
        String strMo131945b = this.ctPreference.mo131945b("inApp", "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            try {
                JSONArray jSONArray = new JSONArray(this.cryptHandler.mo5948a(strMo131945b));
                listEmptyList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        listEmptyList.add(obj);
                    }
                }
            } catch (Exception unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        this.serverSideInAppsCache = listEmptyList;
        return listEmptyList;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<JSONObject> m137771i() {
        List listEmptyList;
        List list = this.serverSideMetaCache;
        if (list != null) {
            return list;
        }
        String strMo131945b = this.ctPreference.mo131945b("inapp_notifs_ss", "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            try {
                JSONArray jSONArray = new JSONArray(strMo131945b);
                listEmptyList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        listEmptyList.add(obj);
                    }
                }
            } catch (JSONException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        this.serverSideMetaCache = listEmptyList;
        return listEmptyList;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final JSONArray m137772j() {
        String strMo131945b = this.ctPreference.mo131945b(Constants.PREFS_SUPPRESSED_INAPP_KEY_CS, "");
        if (strMo131945b == null || StringsKt.m93438e0(strMo131945b)) {
            return new JSONArray();
        }
        try {
            return new JSONArray(strMo131945b);
        } catch (JSONException unused) {
            return m137761c(strMo131945b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m137773k() {
        this.ctPreference.remove("delayed_inapp_notifs_cs");
        this.clientSideDelayedInAppsCache = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m137774o(@Nullable String str) {
        if (Intrinsics.m87488d(this.mode, str)) {
            return;
        }
        this.mode = str;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1437347487) {
                if (str.equals("NO_MODE")) {
                    m137764n();
                    m137763m();
                    m137762l();
                    m137773k();
                    return;
                }
                return;
            }
            if (iHashCode == 2160) {
                if (str.equals("CS")) {
                    m137764n();
                    m137763m();
                    return;
                }
                return;
            }
            if (iHashCode == 2656 && str.equals("SS")) {
                m137762l();
                m137773k();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m137775p(@NotNull List<? extends JSONObject> delayedInApps) {
        delayedInApps.getClass();
        this.clientSideDelayedInAppsCache = delayedInApps;
        JSONArray jSONArray = new JSONArray((Collection) delayedInApps);
        InterfaceC1176c interfaceC1176c = this.cryptHandler;
        String string = jSONArray.toString();
        string.getClass();
        String strMo5952e = interfaceC1176c.mo5952e(string);
        if (strMo5952e != null) {
            this.ctPreference.mo131944a("delayed_inapp_notifs_cs", strMo5952e);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m137776q(@NotNull List<? extends JSONObject> clientSideInApps) {
        clientSideInApps.getClass();
        this.clientSideInAppsCache = clientSideInApps;
        JSONArray jSONArray = new JSONArray((Collection) clientSideInApps);
        InterfaceC1176c interfaceC1176c = this.cryptHandler;
        String string = jSONArray.toString();
        string.getClass();
        String strMo5952e = interfaceC1176c.mo5952e(string);
        if (strMo5952e != null) {
            this.ctPreference.mo131944a("inapp_notifs_cs", strMo5952e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m137777r(@NotNull JSONArray evaluatedServerSideInAppIds) {
        evaluatedServerSideInAppIds.getClass();
        hnl hnlVar = this.ctPreference;
        String string = evaluatedServerSideInAppIds.toString();
        string.getClass();
        hnlVar.mo131944a(Constants.PREFS_EVALUATED_INAPP_KEY_SS, string);
    }

    /* JADX INFO: renamed from: s */
    public final void m137778s(@NotNull List<? extends JSONObject> serverSideInActionMetaData) {
        serverSideInActionMetaData.getClass();
        this.serverSideInActionCache = serverSideInActionMetaData;
        JSONArray jSONArray = new JSONArray((Collection) serverSideInActionMetaData);
        hnl hnlVar = this.ctPreference;
        String string = jSONArray.toString();
        string.getClass();
        hnlVar.mo131944a("inaction_inapp_notifs_ss", string);
    }

    /* JADX INFO: renamed from: t */
    public final void m137779t(@NotNull List<? extends JSONObject> serverSideInApps) {
        serverSideInApps.getClass();
        this.serverSideInAppsCache = serverSideInApps;
        JSONArray jSONArray = new JSONArray((Collection) serverSideInApps);
        InterfaceC1176c interfaceC1176c = this.cryptHandler;
        String string = jSONArray.toString();
        string.getClass();
        String strMo5952e = interfaceC1176c.mo5952e(string);
        if (strMo5952e != null) {
            this.ctPreference.mo131944a("inApp", strMo5952e);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m137780u(@NotNull List<? extends JSONObject> serverSideInAppsMetaData) {
        serverSideInAppsMetaData.getClass();
        this.serverSideMetaCache = serverSideInAppsMetaData;
        JSONArray jSONArray = new JSONArray((Collection) serverSideInAppsMetaData);
        hnl hnlVar = this.ctPreference;
        String string = jSONArray.toString();
        string.getClass();
        hnlVar.mo131944a("inapp_notifs_ss", string);
    }

    /* JADX INFO: renamed from: v */
    public final void m137781v(@NotNull JSONArray suppressedClientSideInAppIds) {
        suppressedClientSideInAppIds.getClass();
        hnl hnlVar = this.ctPreference;
        String string = suppressedClientSideInAppIds.toString();
        string.getClass();
        hnlVar.mo131944a(Constants.PREFS_SUPPRESSED_INAPP_KEY_CS, string);
    }
}

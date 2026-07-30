package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.evaluation.C1262a;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0017\u0010(\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR&\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b-\u0010.R&\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0017\u00101\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b&\u0010\u001aR&\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0015R\u0017\u00104\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b)\u0010\"R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b3\u0010=R)\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020?0\u00120\u00148\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\b5\u0010=R\u0017\u0010F\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b$\u0010ER\u0017\u0010H\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\b\u001f\u0010ER\u0017\u0010L\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b\u001c\u0010KR%\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010M0\u00128\u0006¢\u0006\f\n\u0004\bN\u0010\u0015\u001a\u0004\b8\u0010O¨\u0006R"}, m88121d2 = {"Ll/fsm;", "", "Lorg/json/JSONObject;", "responseJson", "Ll/cqi0;", "templatesManager", "<init>", "(Lorg/json/JSONObject;Ll/cqi0;)V", "", "", "imageList", "gifList", "", "b", "(Ljava/util/List;Ljava/util/List;)V", "filesList", "a", "(Ljava/util/List;Ll/cqi0;)V", "Lkotlin/Pair;", "", "", "Lkotlin/Pair;", "legacyInApps", "Ll/ufe$a;", "Ll/ufe$a;", RXScreenCaptureService.KEY_INDEX, "()Ll/ufe$a;", "partitionedLegacyInApps", "c", "legacyMetaInApps", "Ll/ufe$b;", Constants.INAPP_DATA_TAG, "Ll/ufe$b;", "j", "()Ll/ufe$b;", "partitionedLegacyMetaInApps", "e", "clientSideInApps", "f", "h", "partitionedClientSideInApps", "g", "serverSideInApps", "Ll/ufe$c;", "Ll/ufe$c;", "k", "()Ll/ufe$c;", "partitionedServerSideInAppsMeta", "appLaunchServerSideInApps", "partitionedAppLaunchServerSideInApps", "appLaunchServerSideMetaInApps", BLiveStormDanmakuGiftResourceType.f45292l, "partitionedAppLaunchServerSideMetaInApps", "m", "Ljava/util/List;", "preloadImages", "n", "preloadGifs", "o", "preloadFiles", "p", "()Ljava/util/List;", "preloadAssets", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "q", "preloadAssetsMeta", "", "r", "I", "()I", "inAppsPerSession", BLiveStormDanmakuGiftResourceType.f45294s, "inAppsPerDay", Constants.KEY_T, "Ljava/lang/String;", "()Ljava/lang/String;", "inAppMode", "Lorg/json/JSONArray;", "u", "()Lkotlin/Pair;", "staleInApps", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fsm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, List<JSONObject>> legacyInApps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ufe.C20557a partitionedLegacyInApps;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, List<JSONObject>> legacyMetaInApps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ufe.C20558b partitionedLegacyMetaInApps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, List<JSONObject>> clientSideInApps;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ufe.C20557a partitionedClientSideInApps;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, List<JSONObject>> serverSideInApps;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ufe.C20559c partitionedServerSideInAppsMeta;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, List<JSONObject>> appLaunchServerSideInApps;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ufe.C20557a partitionedAppLaunchServerSideInApps;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, List<JSONObject>> appLaunchServerSideMetaInApps;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ufe.C20558b partitionedAppLaunchServerSideMetaInApps;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final List<String> preloadImages;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final List<String> preloadGifs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final List<String> preloadFiles;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final List<String> preloadAssets;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final List<Pair<String, CtCacheType>> preloadAssetsMeta;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int inAppsPerSession;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int inAppsPerDay;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final String inAppMode;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Pair<Boolean, JSONArray> staleInApps;

    public fsm(@NotNull JSONObject jSONObject, @NotNull cqi0 cqi0Var) throws JSONException {
        jSONObject.getClass();
        cqi0Var.getClass();
        Pair<Boolean, List<JSONObject>> pairM151802w = kx3.m151802w(jSONObject, Constants.INAPP_JSON_RESPONSE_KEY);
        this.legacyInApps = pairM151802w;
        rqm rqmVar = rqm.INSTANCE;
        this.partitionedLegacyInApps = rqmVar.m182655i(pairM151802w.getSecond());
        Pair<Boolean, List<JSONObject>> pairM151802w2 = kx3.m151802w(jSONObject, Constants.INAPP_NOTIFS_META_KEY);
        this.legacyMetaInApps = pairM151802w2;
        this.partitionedLegacyMetaInApps = rqmVar.m182656j(pairM151802w2.getSecond());
        Pair<Boolean, List<JSONObject>> pairM151802w3 = kx3.m151802w(jSONObject, "inapp_notifs_cs");
        this.clientSideInApps = pairM151802w3;
        this.partitionedClientSideInApps = rqmVar.m182654h(pairM151802w3.getSecond());
        Pair<Boolean, List<JSONObject>> pairM151802w4 = kx3.m151802w(jSONObject, "inapp_notifs_ss");
        this.serverSideInApps = pairM151802w4;
        this.partitionedServerSideInAppsMeta = rqmVar.m182657k(pairM151802w4.getSecond());
        Pair<Boolean, List<JSONObject>> pairM151802w5 = kx3.m151802w(jSONObject, Constants.INAPP_NOTIFS_APP_LAUNCHED_KEY);
        this.appLaunchServerSideInApps = pairM151802w5;
        this.partitionedAppLaunchServerSideInApps = rqmVar.m182652e(pairM151802w5.getSecond());
        Pair<Boolean, List<JSONObject>> pairM151802w6 = kx3.m151802w(jSONObject, Constants.INAPP_NOTIFS_APP_LAUNCHED_META_KEY);
        this.appLaunchServerSideMetaInApps = pairM151802w6;
        this.partitionedAppLaunchServerSideMetaInApps = rqmVar.m182653f(pairM151802w6.getSecond());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        m127211b(arrayList, arrayList2);
        m127210a(arrayList3, cqi0Var);
        this.preloadImages = arrayList;
        this.preloadGifs = arrayList2;
        this.preloadFiles = arrayList3;
        this.preloadAssets = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2), (Iterable) arrayList3);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList4.add(new Pair((String) it.next(), CtCacheType.IMAGE));
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(new Pair((String) it2.next(), CtCacheType.GIF));
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList6.add(new Pair((String) it3.next(), CtCacheType.FILES));
        }
        List listPlus2 = CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList6);
        HashSet hashSet = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj : listPlus2) {
            if (hashSet.add((String) ((Pair) obj).getFirst())) {
                arrayList7.add(obj);
            }
        }
        this.preloadAssetsMeta = arrayList7;
        this.inAppsPerSession = jSONObject.optInt(Constants.INAPP_MAX_PER_SESSION_KEY, 10);
        this.inAppsPerDay = jSONObject.optInt(Constants.INAPP_MAX_PER_DAY_KEY, 10);
        String strOptString = jSONObject.optString(Constants.INAPP_DELIVERY_MODE_KEY, "");
        strOptString.getClass();
        this.inAppMode = strOptString;
        this.staleInApps = kx3.m151801v(jSONObject, Constants.INAPP_NOTIFS_STALE_KEY);
    }

    /* JADX INFO: renamed from: a */
    private final void m127210a(List<String> filesList, cqi0 templatesManager) {
        if (this.clientSideInApps.getFirst().booleanValue()) {
            Iterator<T> it = this.clientSideInApps.getSecond().iterator();
            while (it.hasNext()) {
                CustomTemplateInAppData customTemplateInAppDataM6363a = CustomTemplateInAppData.INSTANCE.m6363a((JSONObject) it.next());
                if (customTemplateInAppDataM6363a != null) {
                    customTemplateInAppDataM6363a.m6358d(templatesManager, filesList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m127211b(List<String> imageList, List<String> gifList) {
        CTInAppNotificationMedia cTInAppNotificationMediaM6259a;
        CTInAppNotificationMedia cTInAppNotificationMediaM6259a2;
        if (this.clientSideInApps.getFirst().booleanValue()) {
            for (JSONObject jSONObject : this.clientSideInApps.getSecond()) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("media");
                if (jSONObjectOptJSONObject != null && (cTInAppNotificationMediaM6259a2 = CTInAppNotificationMedia.INSTANCE.m6259a(jSONObjectOptJSONObject, 1)) != null && !StringsKt.m94329e0(cTInAppNotificationMediaM6259a2.getMediaUrl())) {
                    if (cTInAppNotificationMediaM6259a2.m6254g()) {
                        imageList.add(cTInAppNotificationMediaM6259a2.getMediaUrl());
                    } else if (cTInAppNotificationMediaM6259a2.m6253f()) {
                        gifList.add(cTInAppNotificationMediaM6259a2.getMediaUrl());
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(Constants.KEY_MEDIA_LANDSCAPE);
                if (jSONObjectOptJSONObject2 != null && (cTInAppNotificationMediaM6259a = CTInAppNotificationMedia.INSTANCE.m6259a(jSONObjectOptJSONObject2, 2)) != null && !StringsKt.m94329e0(cTInAppNotificationMediaM6259a.getMediaUrl())) {
                    if (cTInAppNotificationMediaM6259a.m6254g()) {
                        imageList.add(cTInAppNotificationMediaM6259a.getMediaUrl());
                    } else if (cTInAppNotificationMediaM6259a.m6253f()) {
                        gifList.add(cTInAppNotificationMediaM6259a.getMediaUrl());
                    }
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInAppMode() {
        return this.inAppMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getInAppsPerDay() {
        return this.inAppsPerDay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getInAppsPerSession() {
        return this.inAppsPerSession;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ufe.C20557a getPartitionedAppLaunchServerSideInApps() {
        return this.partitionedAppLaunchServerSideInApps;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final ufe.C20558b getPartitionedAppLaunchServerSideMetaInApps() {
        return this.partitionedAppLaunchServerSideMetaInApps;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ufe.C20557a getPartitionedClientSideInApps() {
        return this.partitionedClientSideInApps;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final ufe.C20557a getPartitionedLegacyInApps() {
        return this.partitionedLegacyInApps;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final ufe.C20558b getPartitionedLegacyMetaInApps() {
        return this.partitionedLegacyMetaInApps;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ufe.C20559c getPartitionedServerSideInAppsMeta() {
        return this.partitionedServerSideInAppsMeta;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<String> m127221l() {
        return this.preloadAssets;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<Pair<String, CtCacheType>> m127222m() {
        return this.preloadAssetsMeta;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final Pair<Boolean, JSONArray> m127223n() {
        return this.staleInApps;
    }

    /* JADX INFO: renamed from: l.fsm$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/fsm$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "limitJSON", "", "Lcom/clevertap/android/sdk/inapp/evaluation/a;", "a", "(Lorg/json/JSONObject;)Ljava/util/List;", "", "IN_APP_DEFAULT_DAILY", "I", "IN_APP_DEFAULT_SESSION", "", "IN_APP_SESSION_KEY", "Ljava/lang/String;", "IN_APP_DAILY_KEY", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<C1262a> m127224a(@NotNull JSONObject limitJSON) {
            limitJSON.getClass();
            JSONArray jSONArrayM151800u = kx3.m151800u(limitJSON.optJSONArray(Constants.INAPP_FC_LIMITS));
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayM151800u.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArrayM151800u.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C1262a((JSONObject) it.next()));
            }
            return CollectionsKt.toMutableList((Collection) arrayList2);
        }

        private Companion() {
        }
    }
}

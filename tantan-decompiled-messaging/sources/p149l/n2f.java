package p149l;

import android.location.Location;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.evaluation.C1239a;
import com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher;
import com.clevertap.android.sdk.network.EndpointId;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.ErrorBundle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u008d\u00012\u00020\u0001:\u0001jB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u001fJ3\u0010)\u001a\u00020(2\u0006\u0010\"\u001a\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b)\u0010*JE\u0010-\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#0\u000e2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b-\u0010.JM\u00100\u001a\u00020(2 \u0010%\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010$0#0#2\b\u0010'\u001a\u0004\u0018\u00010&2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b0\u00101J+\u00103\u001a\u0002022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b3\u00104J?\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b6\u00107J?\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b9\u00107J#\u0010=\u001a\u00020\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010<\u001a\u00020!¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\b?\u0010\u0018J#\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\bB\u0010AJ#\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\bC\u0010AJP\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010D\u001a\u00020\u000f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2#\b\u0002\u0010J\u001a\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\u00160FH\u0001¢\u0006\u0004\bK\u0010LJ5\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010N\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020\u001aH\u0001¢\u0006\u0004\bP\u0010QJE\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010N\u001a\u00020M2\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u00020R\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0FH\u0001¢\u0006\u0004\bT\u0010UJI\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bV\u0010WJ\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u000e2\u0006\u0010X\u001a\u00020\u0011H\u0001¢\u0006\u0004\bZ\u0010[J\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010\\\u001a\u00020\u0011H\u0000¢\u0006\u0004\b]\u0010[J#\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0000¢\u0006\u0004\b_\u0010AJ\u0017\u0010`\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0001¢\u0006\u0004\b`\u0010\u001fJ!\u0010d\u001a\u00020!2\u0006\u0010a\u001a\u00020!2\b\b\u0002\u0010c\u001a\u00020bH\u0001¢\u0006\u0004\bd\u0010eJ!\u0010f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010c\u001a\u00020bH\u0000¢\u0006\u0004\bf\u0010gJ\u0019\u0010j\u001a\u0004\u0018\u00010\u00112\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010m\u001a\u00020\u00162\u0006\u0010l\u001a\u00020\u00112\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0016H\u0007¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0016H\u0001¢\u0006\u0004\bq\u0010pJ\u000f\u0010r\u001a\u00020\u0016H\u0001¢\u0006\u0004\br\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR2\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020|0{8\u0000@\u0000X\u0081\u000e¢\u0006\u001b\n\u0004\b}\u0010~\u0012\u0005\b\u0082\u0001\u0010p\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u0010\u0018RB\u0010\u0088\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010$0#0{8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b\u0084\u0001\u0010~\u0012\u0005\b\u0087\u0001\u0010p\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001\"\u0005\b\u0086\u0001\u0010\u0018R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008e\u0001"}, m87232d2 = {"Ll/n2f;", "Ll/nb20;", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "triggersMatcher", "Ll/saj0;", "triggersManager", "Ll/gmr;", "limitsMatcher", "Ll/zxf0;", "storeRegistry", "Ll/chi0;", "templatesManager", "<init>", "(Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;Ll/saj0;Ll/gmr;Ll/zxf0;Ll/chi0;)V", "", "Ll/p2f;", "events", "Lorg/json/JSONObject;", "metadata", "m", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "eligibleInApps", "", "L", "(Ljava/util/List;)V", "inApp", "", "I", "(Lorg/json/JSONObject;)Z", "header", "D", "(Lorg/json/JSONObject;)V", "E", "", "eventName", "", "", "eventProperties", "Landroid/location/Location;", "userLocation", "Ll/g2f;", "r", "(Ljava/lang/String;Ljava/util/Map;Landroid/location/Location;)Ll/g2f;", ErrorBundle.DETAIL_ENTRY, FirebaseAnalytics.Param.ITEMS, "q", "(Ljava/util/Map;Ljava/util/List;Landroid/location/Location;)Ll/g2f;", "appFields", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/util/Map;Landroid/location/Location;Ljava/util/Map;)Ll/g2f;", "Ll/g95;", "n", "(Ljava/util/Map;Landroid/location/Location;)Ll/g95;", "appLaunchedNotifs", "p", "(Ljava/util/List;Ljava/util/Map;Landroid/location/Location;)Ljava/util/List;", "appLaunchedDelayedNotifs", "o", "Lcom/clevertap/android/sdk/inapp/evaluation/a;", "listOfLimitAdapter", "campaignId", b2s.C_ZONE, "(Ljava/util/List;Ljava/lang/String;)Z", Constants.KEY_T, "u", "(Ljava/util/List;)Ljava/util/List;", "k", BLiveStormDanmakuGiftResourceType.f44444l, NotificationCompat.CATEGORY_EVENT, "inappNotifs", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "url", "clearResource", RXScreenCaptureService.KEY_INDEX, "(Ll/p2f;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Ll/hqm;", "strategy", "shouldUpdateTTLForThisContext", "H", "(Ljava/util/List;Ll/hqm;Z)Ljava/util/List;", "Ll/iqm;", "readInAppsFromStore", ResourceDirection.f38808v, "(Ljava/util/List;Ll/hqm;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "w", "(Ljava/util/List;Ljava/util/Map;Landroid/location/Location;Ll/hqm;)Ljava/util/List;", "triggerJson", "Ll/laj0;", "A", "(Lorg/json/JSONObject;)Ljava/util/List;", "limitJSON", BaseSei.f13932Z, "inApps", "J", "K", Constants.INAPP_ID_IN_PAYLOAD, "Ll/n95;", "clock", BaseSei.f13930X, "(Ljava/lang/String;Ll/n95;)Ljava/lang/String;", "M", "(Lorg/json/JSONObject;Ll/n95;)V", "Lcom/clevertap/android/sdk/network/EndpointId;", "endpointId", "a", "(Lcom/clevertap/android/sdk/network/EndpointId;)Lorg/json/JSONObject;", "allHeaders", "b", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/network/EndpointId;)V", "B", "()V", "F", "G", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "Ll/saj0;", "c", "Ll/gmr;", Constants.INAPP_DATA_TAG, "Ll/zxf0;", "e", "Ll/chi0;", "", "", "f", "Ljava/util/List;", "getEvaluatedServerSideCampaignIds$clevertap_core_release", "()Ljava/util/List;", "setEvaluatedServerSideCampaignIds$clevertap_core_release", "getEvaluatedServerSideCampaignIds$clevertap_core_release$annotations", "evaluatedServerSideCampaignIds", "g", "getSuppressedClientSideInApps$clevertap_core_release", "setSuppressedClientSideInApps$clevertap_core_release", "getSuppressedClientSideInApps$clevertap_core_release$annotations", "suppressedClientSideInApps", "Ljava/text/SimpleDateFormat;", "h", "Ljava/text/SimpleDateFormat;", "dateFormatter", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class n2f implements nb20 {

    /* JADX INFO: renamed from: i */
    private static final String f136815i = n2f.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TriggersMatcher triggersMatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final saj0 triggersManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final gmr limitsMatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final zxf0 storeRegistry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final chi0 templatesManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private List<Long> evaluatedServerSideCampaignIds;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private List<Map<String, Object>> suppressedClientSideInApps;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final SimpleDateFormat dateFormatter;

    /* JADX INFO: renamed from: l.n2f$b */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C18612b<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f136824a;

        public C18612b(Function1 function1) {
            this.f136824a = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return cn5.m107733d((Comparable) this.f136824a.invoke((JSONObject) t2), (Comparable) this.f136824a.invoke((JSONObject) t));
        }
    }

    /* JADX INFO: renamed from: l.n2f$c */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C18613c<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Comparator f136825a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f136826b;

        public C18613c(Comparator comparator, Function1 function1) {
            this.f136825a = comparator;
            this.f136826b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f136825a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            return cn5.m107733d((Comparable) this.f136826b.invoke((JSONObject) t), (Comparable) this.f136826b.invoke((JSONObject) t2));
        }
    }

    public n2f(@NotNull TriggersMatcher triggersMatcher, @NotNull saj0 saj0Var, @NotNull gmr gmrVar, @NotNull zxf0 zxf0Var, @NotNull chi0 chi0Var) {
        triggersMatcher.getClass();
        saj0Var.getClass();
        gmrVar.getClass();
        zxf0Var.getClass();
        chi0Var.getClass();
        this.triggersMatcher = triggersMatcher;
        this.triggersManager = saj0Var;
        this.limitsMatcher = gmrVar;
        this.storeRegistry = zxf0Var;
        this.templatesManager = chi0Var;
        this.evaluatedServerSideCampaignIds = new ArrayList();
        this.suppressedClientSideInApps = new ArrayList();
        this.dateFormatter = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    }

    /* JADX INFO: renamed from: D */
    private final void m157600D(JSONObject header) throws JSONException {
        JSONArray jSONArrayOptJSONArray = header.optJSONArray(Constants.INAPP_SS_EVAL_META);
        int i = 0;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (i < length) {
                long jOptLong = jSONArrayOptJSONArray.optLong(i);
                if (jOptLong != 0) {
                    this.evaluatedServerSideCampaignIds.remove(Long.valueOf(jOptLong));
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            m157617F();
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m157601E(JSONObject header) throws JSONException {
        JSONArray jSONArrayOptJSONArray = header.optJSONArray(Constants.INAPP_SUPPRESSED_META);
        boolean z = false;
        if (jSONArrayOptJSONArray != null) {
            Iterator<Map<String, Object>> it = this.suppressedClientSideInApps.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Object obj = it.next().get(Constants.NOTIFICATION_ID_TAG);
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    String string = jSONArrayOptJSONArray.toString();
                    string.getClass();
                    if (StringsKt.m93412P(string, str, false, 2, null)) {
                        it.remove();
                        z2 = true;
                    }
                }
            }
            z = z2;
        }
        if (z) {
            m157618G();
        }
    }

    /* JADX INFO: renamed from: I */
    private final boolean m157602I(JSONObject inApp) {
        return inApp.optBoolean(Constants.INAPP_SUPPRESSED);
    }

    /* JADX INFO: renamed from: L */
    private final void m157603L(List<? extends JSONObject> eligibleInApps) throws JSONException {
        Iterator<T> it = eligibleInApps.iterator();
        boolean z = false;
        while (it.hasNext()) {
            long jOptLong = ((JSONObject) it.next()).optLong(Constants.INAPP_ID_IN_PAYLOAD);
            if (jOptLong != 0) {
                this.evaluatedServerSideCampaignIds.add(Long.valueOf(jOptLong));
                z = true;
            }
        }
        if (z) {
            m157617F();
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m157604N(n2f n2fVar, JSONObject jSONObject, n95 n95Var, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            n95Var = n95.f137721a;
        }
        n2fVar.m157622M(jSONObject, n95Var);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m157605c(n2f n2fVar, Ref.BooleanRef booleanRef, JSONObject jSONObject) {
        n2fVar.getClass();
        booleanRef.getClass();
        jSONObject.getClass();
        boolean zM157602I = n2fVar.m157602I(jSONObject);
        if (zM157602I) {
            booleanRef.element = true;
            n2fVar.m157621K(jSONObject);
            Logger.m5874v(f136815i, "Suppressed in-app: " + jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD));
        }
        return zM157602I;
    }

    /* JADX INFO: renamed from: d */
    public static String m157606d(JSONObject jSONObject) {
        jSONObject.getClass();
        return jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD, String.valueOf(n95.f137721a.mo158532b().getTime() / 1000));
    }

    /* JADX INFO: renamed from: e */
    public static int m157607e(JSONObject jSONObject) {
        jSONObject.getClass();
        return jSONObject.optInt("priority", 1);
    }

    /* JADX INFO: renamed from: f */
    public static Unit m157608f(String str) {
        str.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static List m157609g(iqm iqmVar) {
        iqmVar.getClass();
        return CollectionsKt.toList(iqmVar.m137767e());
    }

    /* JADX INFO: renamed from: h */
    public static List m157610h(iqm iqmVar) {
        iqmVar.getClass();
        return CollectionsKt.toList(iqmVar.m137766d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m157611j(n2f n2fVar, p2f p2fVar, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: l.h2f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return n2f.m157608f((String) obj2);
                }
            };
        }
        return n2fVar.m157625i(p2fVar, list, function1);
    }

    /* JADX INFO: renamed from: m */
    private final List<JSONObject> m157612m(List<p2f> events, List<? extends JSONObject> metadata) {
        ArrayList arrayList = new ArrayList();
        Iterator<p2f> it = events.iterator();
        while (it.hasNext()) {
            n2f n2fVar = this;
            arrayList.addAll(m157611j(n2fVar, it.next(), metadata, null, 4, null));
            this = n2fVar;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m157613y(n2f n2fVar, String str, n95 n95Var, int i, Object obj) {
        if ((i & 2) != 0) {
            n95Var = n95.f137721a;
        }
        return n2fVar.m157638x(str, n95Var);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: A */
    public final List<laj0> m157614A(@NotNull JSONObject triggerJson) throws JSONException {
        triggerJson.getClass();
        JSONArray jSONArrayM151951u = lw3.m151951u(triggerJson.optJSONArray(Constants.INAPP_WHEN_TRIGGERS));
        IntRange intRangeM87605k = C15167a.m87605k(0, jSONArrayM151951u.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeM87605k.iterator();
        while (it.hasNext()) {
            Object obj = jSONArrayM151951u.get(((IntIterator) it).nextInt());
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            laj0 laj0Var = jSONObject != null ? new laj0(jSONObject) : null;
            if (laj0Var != null) {
                arrayList.add(laj0Var);
            }
        }
        return arrayList;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final void m157615B() {
        iqm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            JSONArray jSONArrayM137768f = inAppStore.m137768f();
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayM137768f.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArrayM137768f.get(i);
                if (obj instanceof Long) {
                    arrayList.add(obj);
                }
            }
            this.evaluatedServerSideCampaignIds = arrayList;
            this.suppressedClientSideInApps = vpq.m199284d(inAppStore.m137772j());
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m157616C(@NotNull List<C1239a> listOfLimitAdapter, @NotNull String campaignId) {
        listOfLimitAdapter.getClass();
        campaignId.getClass();
        return this.limitsMatcher.m127052b(listOfLimitAdapter, campaignId);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: F */
    public final void m157617F() throws JSONException {
        iqm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            JSONArray jSONArrayM199285e = vpq.m199285e(this.evaluatedServerSideCampaignIds);
            jSONArrayM199285e.getClass();
            inAppStore.m137777r(jSONArrayM199285e);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: G */
    public final void m157618G() throws JSONException {
        iqm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            JSONArray jSONArrayM199285e = vpq.m199285e(this.suppressedClientSideInApps);
            jSONArrayM199285e.getClass();
            inAppStore.m137781v(jSONArrayM199285e);
        }
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: H */
    public final List<JSONObject> m157619H(@NotNull List<? extends JSONObject> eligibleInApps, @NotNull hqm strategy, boolean shouldUpdateTTLForThisContext) throws JSONException {
        eligibleInApps.getClass();
        strategy.getClass();
        List<JSONObject> listM157620J = m157620J(eligibleInApps);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        List<JSONObject> listMo132457b = strategy.mo132457b(listM157620J, new Function1() { // from class: l.i2f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n2f.m157605c(this.f110551a, booleanRef, (JSONObject) obj));
            }
        });
        if (shouldUpdateTTLForThisContext && strategy.mo132456a()) {
            for (JSONObject jSONObject : listMo132457b) {
                m157604N(this, jSONObject, null, 2, null);
                Logger.m5874v(f136815i, "Updated TTL for in-app: " + jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD));
            }
        }
        if (booleanRef.element) {
            m157618G();
        }
        return listMo132457b;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final List<JSONObject> m157620J(@NotNull List<? extends JSONObject> inApps) {
        inApps.getClass();
        Function1 function1 = new Function1() { // from class: l.k2f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n2f.m157607e((JSONObject) obj));
            }
        };
        return CollectionsKt.sortedWith(inApps, new C18613c(new C18612b(function1), new Function1() { // from class: l.l2f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n2f.m157606d((JSONObject) obj);
            }
        }));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: K */
    public final void m157621K(@NotNull JSONObject inApp) {
        inApp.getClass();
        String strOptString = inApp.optString(Constants.INAPP_ID_IN_PAYLOAD);
        strOptString.getClass();
        this.suppressedClientSideInApps.add(MapsKt.mapOf(TuplesKt.m87240a(Constants.NOTIFICATION_ID_TAG, m157613y(this, strOptString, null, 2, null)), TuplesKt.m87240a(Constants.INAPP_WZRK_PIVOT, inApp.optString(Constants.INAPP_WZRK_PIVOT, "wzrk_default")), TuplesKt.m87240a(Constants.INAPP_WZRK_CGID, Integer.valueOf(inApp.optInt(Constants.INAPP_WZRK_CGID)))));
    }

    /* JADX INFO: renamed from: M */
    public final void m157622M(@NotNull JSONObject inApp, @NotNull n95 clock) throws JSONException {
        inApp.getClass();
        clock.getClass();
        Object objOpt = inApp.opt(Constants.WZRK_TIME_TO_LIVE_OFFSET);
        Long l2 = objOpt instanceof Long ? (Long) objOpt : null;
        if (l2 != null) {
            inApp.put("wzrk_ttl", clock.mo158533c() + l2.longValue());
        } else {
            inApp.remove("wzrk_ttl");
        }
    }

    @Override // p149l.nb20
    @Nullable
    /* JADX INFO: renamed from: a */
    public JSONObject mo157623a(@NotNull EndpointId endpointId) throws JSONException {
        endpointId.getClass();
        JSONObject jSONObject = new JSONObject();
        if (endpointId == EndpointId.ENDPOINT_A1) {
            if (!this.evaluatedServerSideCampaignIds.isEmpty()) {
                jSONObject.put(Constants.INAPP_SS_EVAL_META, vpq.m199285e(this.evaluatedServerSideCampaignIds));
            }
            if (!this.suppressedClientSideInApps.isEmpty()) {
                jSONObject.put(Constants.INAPP_SUPPRESSED_META, vpq.m199285e(this.suppressedClientSideInApps));
            }
        }
        if (lw3.m151947q(jSONObject)) {
            return jSONObject;
        }
        return null;
    }

    @Override // p149l.nb20
    /* JADX INFO: renamed from: b */
    public void mo157624b(@NotNull JSONObject allHeaders, @NotNull EndpointId endpointId) throws JSONException {
        allHeaders.getClass();
        endpointId.getClass();
        if (endpointId == EndpointId.ENDPOINT_A1) {
            m157600D(allHeaders);
            m157601E(allHeaders);
        }
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<JSONObject> m157625i(@NotNull p2f event, @NotNull List<? extends JSONObject> inappNotifs, @NotNull Function1<? super String, Unit> clearResource) {
        event.getClass();
        inappNotifs.getClass();
        clearResource.getClass();
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : inappNotifs) {
            CustomTemplateInAppData customTemplateInAppDataM6309a = CustomTemplateInAppData.INSTANCE.m6309a(jSONObject);
            String templateName = customTemplateInAppDataM6309a != null ? customTemplateInAppDataM6309a.getTemplateName() : null;
            if (templateName == null || this.templatesManager.m106885f(templateName)) {
                String strOptString = jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD);
                if (this.triggersMatcher.m6377j(m157614A(jSONObject), event)) {
                    Logger.m5874v("INAPP", "Triggers matched for event " + event.getEventName() + " against inApp " + strOptString);
                    saj0 saj0Var = this.triggersManager;
                    strOptString.getClass();
                    saj0Var.m183064c(strOptString);
                    boolean zM127052b = this.limitsMatcher.m127052b(m157639z(jSONObject), strOptString);
                    if (this.limitsMatcher.m127053c(m157639z(jSONObject), strOptString)) {
                        clearResource.invoke("");
                    }
                    if (zM127052b) {
                        Logger.m5874v("INAPP", "Limits matched for event " + event.getEventName() + " against inApp " + strOptString);
                        arrayList.add(jSONObject);
                    } else {
                        Logger.m5874v("INAPP", "Limits did not matched for event " + event.getEventName() + " against inApp " + strOptString);
                    }
                } else {
                    Logger.m5874v("INAPP", "Triggers did not matched for event " + event.getEventName() + " against inApp " + strOptString);
                }
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<JSONObject> m157626k(@NotNull List<p2f> events) {
        events.getClass();
        return m157636v(events, hqm.C17372b.INSTANCE, new Function1() { // from class: l.m2f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n2f.m157609g((iqm) obj);
            }
        });
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<JSONObject> m157627l(@NotNull List<p2f> events) {
        events.getClass();
        return m157636v(events, hqm.C17371a.INSTANCE, new Function1() { // from class: l.j2f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n2f.m157610h((iqm) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final g95 m157628n(@NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) {
        eventProperties.getClass();
        List<p2f> listListOf = CollectionsKt.listOf(new p2f(Constants.APP_LAUNCHED_EVENT, eventProperties, null, userLocation, null, 20, null));
        return new g95(m157626k(listListOf), m157627l(listListOf));
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<JSONObject> m157629o(@NotNull List<? extends JSONObject> appLaunchedDelayedNotifs, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) {
        appLaunchedDelayedNotifs.getClass();
        eventProperties.getClass();
        return m157637w(appLaunchedDelayedNotifs, eventProperties, userLocation, hqm.C17371a.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<JSONObject> m157630p(@NotNull List<? extends JSONObject> appLaunchedNotifs, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) {
        appLaunchedNotifs.getClass();
        eventProperties.getClass();
        return m157637w(appLaunchedNotifs, eventProperties, userLocation, hqm.C17372b.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final g2f m157631q(@NotNull Map<String, ? extends Object> details, @NotNull List<? extends Map<String, ? extends Object>> items, @Nullable Location userLocation) throws JSONException {
        details.getClass();
        items.getClass();
        List<p2f> listListOf = CollectionsKt.listOf(new p2f(Constants.CHARGED_EVENT, details, items, userLocation, null, 16, null));
        m157634t(listListOf);
        return new g2f(m157626k(listListOf), m157627l(listListOf), m157635u(listListOf));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final g2f m157632r(@NotNull String eventName, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) throws JSONException {
        eventName.getClass();
        eventProperties.getClass();
        List<p2f> listListOf = CollectionsKt.listOf(new p2f(eventName, eventProperties, null, userLocation, null, 20, null));
        m157634t(listListOf);
        return new g2f(m157626k(listListOf), m157627l(listListOf), m157635u(listListOf));
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final g2f m157633s(@NotNull Map<String, ? extends Map<String, ? extends Object>> eventProperties, @Nullable Location userLocation, @NotNull Map<String, ? extends Object> appFields) throws JSONException {
        eventProperties.getClass();
        appFields.getClass();
        ArrayList arrayList = new ArrayList(eventProperties.size());
        for (Map.Entry<String, ? extends Map<String, ? extends Object>> entry : eventProperties.entrySet()) {
            Map mutableMap = MapsKt.toMutableMap(entry.getValue());
            mutableMap.putAll(appFields);
            arrayList.add(new p2f(entry.getKey() + Constants.USER_ATTRIBUTE_CHANGE, mutableMap, null, userLocation, entry.getKey(), 4, null));
        }
        m157634t(arrayList);
        return new g2f(m157626k(arrayList), m157627l(arrayList), m157635u(arrayList));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: t */
    public final void m157634t(@NotNull List<p2f> events) throws JSONException {
        events.getClass();
        iqm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            m157603L(m157612m(events, CollectionsKt.toList(inAppStore.m137771i())));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final List<JSONObject> m157635u(@NotNull List<p2f> events) throws JSONException {
        events.getClass();
        iqm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            List<JSONObject> listM157612m = m157612m(events, CollectionsKt.toList(inAppStore.m137769g()));
            m157603L(listM157612m);
            if (listM157612m != null) {
                return listM157612m;
            }
        }
        return CollectionsKt.emptyList();
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: v */
    public final List<JSONObject> m157636v(@NotNull List<p2f> events, @NotNull hqm strategy, @NotNull Function1<? super iqm, ? extends List<? extends JSONObject>> readInAppsFromStore) {
        n2f n2fVar;
        events.getClass();
        strategy.getClass();
        readInAppsFromStore.getClass();
        ArrayList arrayList = new ArrayList();
        iqm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore == null) {
            return CollectionsKt.emptyList();
        }
        for (p2f p2fVar : events) {
            Object obj = p2fVar.m167165d().get(Constants.KEY_OLD_VALUE);
            Object obj2 = p2fVar.m167165d().get(Constants.KEY_NEW_VALUE);
            if (obj2 == null || !Intrinsics.m87488d(obj2, obj)) {
                n2fVar = this;
                arrayList.addAll(m157611j(n2fVar, p2fVar, readInAppsFromStore.invoke(inAppStore), null, 4, null));
            } else {
                n2fVar = this;
            }
            this = n2fVar;
        }
        return this.m157619H(arrayList, strategy, true);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: w */
    public final List<JSONObject> m157637w(@NotNull List<? extends JSONObject> appLaunchedNotifs, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation, @NotNull hqm strategy) {
        appLaunchedNotifs.getClass();
        eventProperties.getClass();
        strategy.getClass();
        return m157619H(m157611j(this, new p2f(Constants.APP_LAUNCHED_EVENT, eventProperties, null, userLocation, null, 20, null), appLaunchedNotifs, null, 4, null), strategy, false);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: x */
    public final String m157638x(@NotNull String ti, @NotNull n95 clock) {
        ti.getClass();
        clock.getClass();
        return ti + '_' + this.dateFormatter.format(clock.mo158532b());
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final List<C1239a> m157639z(@NotNull JSONObject limitJSON) throws JSONException {
        limitJSON.getClass();
        JSONArray jSONArrayM151951u = lw3.m151951u(limitJSON.optJSONArray(Constants.INAPP_FC_LIMITS));
        JSONArray jSONArrayM151951u2 = lw3.m151951u(limitJSON.optJSONArray(Constants.INAPP_OCCURRENCE_LIMITS));
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayM151951u.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayM151951u.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int length2 = jSONArrayM151951u2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj2 = jSONArrayM151951u2.get(i2);
            if (obj2 instanceof JSONObject) {
                arrayList2.add(obj2);
            }
        }
        List<JSONObject> listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (JSONObject jSONObject : listPlus) {
            C1239a c1239a = lw3.m151947q(jSONObject) ? new C1239a(jSONObject) : null;
            if (c1239a != null) {
                arrayList3.add(c1239a);
            }
        }
        return arrayList3;
    }
}

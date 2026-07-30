package p153l;

import android.location.Location;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.evaluation.C1262a;
import com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher;
import com.clevertap.android.sdk.network.EndpointId;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.ErrorBundle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u008d\u00012\u00020\u0001:\u0001jB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u001fJ3\u0010)\u001a\u00020(2\u0006\u0010\"\u001a\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b)\u0010*JE\u0010-\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#0\u000e2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b-\u0010.JM\u00100\u001a\u00020(2 \u0010%\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010$0#0#2\b\u0010'\u001a\u0004\u0018\u00010&2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b0\u00101J+\u00103\u001a\u0002022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b3\u00104J?\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b6\u00107J?\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b9\u00107J#\u0010=\u001a\u00020\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010<\u001a\u00020!¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\b?\u0010\u0018J#\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\bB\u0010AJ#\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\bC\u0010AJP\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010D\u001a\u00020\u000f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2#\b\u0002\u0010J\u001a\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\u00160FH\u0001¢\u0006\u0004\bK\u0010LJ5\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010N\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020\u001aH\u0001¢\u0006\u0004\bP\u0010QJE\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010N\u001a\u00020M2\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u00020R\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0FH\u0001¢\u0006\u0004\bT\u0010UJI\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bV\u0010WJ\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u000e2\u0006\u0010X\u001a\u00020\u0011H\u0001¢\u0006\u0004\bZ\u0010[J\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\u0006\u0010\\\u001a\u00020\u0011H\u0000¢\u0006\u0004\b]\u0010[J#\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0000¢\u0006\u0004\b_\u0010AJ\u0017\u0010`\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0001¢\u0006\u0004\b`\u0010\u001fJ!\u0010d\u001a\u00020!2\u0006\u0010a\u001a\u00020!2\b\b\u0002\u0010c\u001a\u00020bH\u0001¢\u0006\u0004\bd\u0010eJ!\u0010f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010c\u001a\u00020bH\u0000¢\u0006\u0004\bf\u0010gJ\u0019\u0010j\u001a\u0004\u0018\u00010\u00112\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010m\u001a\u00020\u00162\u0006\u0010l\u001a\u00020\u00112\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0016H\u0007¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0016H\u0001¢\u0006\u0004\bq\u0010pJ\u000f\u0010r\u001a\u00020\u0016H\u0001¢\u0006\u0004\br\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR2\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020|0{8\u0000@\u0000X\u0081\u000e¢\u0006\u001b\n\u0004\b}\u0010~\u0012\u0005\b\u0082\u0001\u0010p\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u0010\u0018RB\u0010\u0088\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010$0#0{8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b\u0084\u0001\u0010~\u0012\u0005\b\u0087\u0001\u0010p\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001\"\u0005\b\u0086\u0001\u0010\u0018R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008e\u0001"}, m88121d2 = {"Ll/s3f;", "Ll/wj20;", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "triggersMatcher", "Ll/wjj0;", "triggersManager", "Ll/hor;", "limitsMatcher", "Ll/h6g0;", "storeRegistry", "Ll/cqi0;", "templatesManager", "<init>", "(Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;Ll/wjj0;Ll/hor;Ll/h6g0;Ll/cqi0;)V", "", "Ll/u3f;", "events", "Lorg/json/JSONObject;", "metadata", "m", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "eligibleInApps", "", "L", "(Ljava/util/List;)V", "inApp", "", "I", "(Lorg/json/JSONObject;)Z", "header", "D", "(Lorg/json/JSONObject;)V", "E", "", "eventName", "", "", "eventProperties", "Landroid/location/Location;", "userLocation", "Ll/l3f;", "r", "(Ljava/lang/String;Ljava/util/Map;Landroid/location/Location;)Ll/l3f;", ErrorBundle.DETAIL_ENTRY, FirebaseAnalytics.Param.ITEMS, "q", "(Ljava/util/Map;Ljava/util/List;Landroid/location/Location;)Ll/l3f;", "appFields", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/Map;Landroid/location/Location;Ljava/util/Map;)Ll/l3f;", "Ll/ha5;", "n", "(Ljava/util/Map;Landroid/location/Location;)Ll/ha5;", "appLaunchedNotifs", "p", "(Ljava/util/List;Ljava/util/Map;Landroid/location/Location;)Ljava/util/List;", "appLaunchedDelayedNotifs", "o", "Lcom/clevertap/android/sdk/inapp/evaluation/a;", "listOfLimitAdapter", "campaignId", c4s.C_ZONE, "(Ljava/util/List;Ljava/lang/String;)Z", Constants.KEY_T, "u", "(Ljava/util/List;)Ljava/util/List;", "k", BLiveStormDanmakuGiftResourceType.f45292l, NotificationCompat.CATEGORY_EVENT, "inappNotifs", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "url", "clearResource", RXScreenCaptureService.KEY_INDEX, "(Ll/u3f;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Ll/jsm;", "strategy", "shouldUpdateTTLForThisContext", "H", "(Ljava/util/List;Ll/jsm;Z)Ljava/util/List;", "Ll/ksm;", "readInAppsFromStore", ResourceDirection.f39656v, "(Ljava/util/List;Ll/jsm;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "w", "(Ljava/util/List;Ljava/util/Map;Landroid/location/Location;Ll/jsm;)Ljava/util/List;", "triggerJson", "Ll/pjj0;", "A", "(Lorg/json/JSONObject;)Ljava/util/List;", "limitJSON", BaseSei.f14626Z, "inApps", "J", "K", Constants.INAPP_ID_IN_PAYLOAD, "Ll/oa5;", "clock", BaseSei.f14624X, "(Ljava/lang/String;Ll/oa5;)Ljava/lang/String;", "M", "(Lorg/json/JSONObject;Ll/oa5;)V", "Lcom/clevertap/android/sdk/network/EndpointId;", "endpointId", "a", "(Lcom/clevertap/android/sdk/network/EndpointId;)Lorg/json/JSONObject;", "allHeaders", "b", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/network/EndpointId;)V", "B", "()V", "F", "G", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "Ll/wjj0;", "c", "Ll/hor;", Constants.INAPP_DATA_TAG, "Ll/h6g0;", "e", "Ll/cqi0;", "", "", "f", "Ljava/util/List;", "getEvaluatedServerSideCampaignIds$clevertap_core_release", "()Ljava/util/List;", "setEvaluatedServerSideCampaignIds$clevertap_core_release", "getEvaluatedServerSideCampaignIds$clevertap_core_release$annotations", "evaluatedServerSideCampaignIds", "g", "getSuppressedClientSideInApps$clevertap_core_release", "setSuppressedClientSideInApps$clevertap_core_release", "getSuppressedClientSideInApps$clevertap_core_release$annotations", "suppressedClientSideInApps", "Ljava/text/SimpleDateFormat;", "h", "Ljava/text/SimpleDateFormat;", "dateFormatter", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class s3f implements wj20 {

    /* JADX INFO: renamed from: i */
    private static final String f165996i = s3f.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TriggersMatcher triggersMatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final wjj0 triggersManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final hor limitsMatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final h6g0 storeRegistry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final cqi0 templatesManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private List<Long> evaluatedServerSideCampaignIds;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private List<Map<String, Object>> suppressedClientSideInApps;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final SimpleDateFormat dateFormatter;

    /* JADX INFO: renamed from: l.s3f$b */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C19968b<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f166005a;

        public C19968b(Function1 function1) {
            this.f166005a = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return go5.m131087d((Comparable) this.f166005a.invoke((JSONObject) t2), (Comparable) this.f166005a.invoke((JSONObject) t));
        }
    }

    /* JADX INFO: renamed from: l.s3f$c */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C19969c<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Comparator f166006a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f166007b;

        public C19969c(Comparator comparator, Function1 function1) {
            this.f166006a = comparator;
            this.f166007b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f166006a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            return go5.m131087d((Comparable) this.f166007b.invoke((JSONObject) t), (Comparable) this.f166007b.invoke((JSONObject) t2));
        }
    }

    public s3f(@NotNull TriggersMatcher triggersMatcher, @NotNull wjj0 wjj0Var, @NotNull hor horVar, @NotNull h6g0 h6g0Var, @NotNull cqi0 cqi0Var) {
        triggersMatcher.getClass();
        wjj0Var.getClass();
        horVar.getClass();
        h6g0Var.getClass();
        cqi0Var.getClass();
        this.triggersMatcher = triggersMatcher;
        this.triggersManager = wjj0Var;
        this.limitsMatcher = horVar;
        this.storeRegistry = h6g0Var;
        this.templatesManager = cqi0Var;
        this.evaluatedServerSideCampaignIds = new ArrayList();
        this.suppressedClientSideInApps = new ArrayList();
        this.dateFormatter = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    }

    /* JADX INFO: renamed from: D */
    private final void m184236D(JSONObject header) throws JSONException {
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
            m184253F();
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m184237E(JSONObject header) throws JSONException {
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
                    if (StringsKt.m94303P(string, str, false, 2, null)) {
                        it.remove();
                        z2 = true;
                    }
                }
            }
            z = z2;
        }
        if (z) {
            m184254G();
        }
    }

    /* JADX INFO: renamed from: I */
    private final boolean m184238I(JSONObject inApp) {
        return inApp.optBoolean(Constants.INAPP_SUPPRESSED);
    }

    /* JADX INFO: renamed from: L */
    private final void m184239L(List<? extends JSONObject> eligibleInApps) throws JSONException {
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
            m184253F();
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m184240N(s3f s3fVar, JSONObject jSONObject, oa5 oa5Var, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            oa5Var = oa5.f145660a;
        }
        s3fVar.m184258M(jSONObject, oa5Var);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m184241c(s3f s3fVar, Ref.BooleanRef booleanRef, JSONObject jSONObject) {
        s3fVar.getClass();
        booleanRef.getClass();
        jSONObject.getClass();
        boolean zM184238I = s3fVar.m184238I(jSONObject);
        if (zM184238I) {
            booleanRef.element = true;
            s3fVar.m184257K(jSONObject);
            Logger.m5928v(f165996i, "Suppressed in-app: " + jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD));
        }
        return zM184238I;
    }

    /* JADX INFO: renamed from: d */
    public static String m184242d(JSONObject jSONObject) {
        jSONObject.getClass();
        return jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD, String.valueOf(oa5.f145660a.mo166826b().getTime() / 1000));
    }

    /* JADX INFO: renamed from: e */
    public static int m184243e(JSONObject jSONObject) {
        jSONObject.getClass();
        return jSONObject.optInt("priority", 1);
    }

    /* JADX INFO: renamed from: f */
    public static Unit m184244f(String str) {
        str.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static List m184245g(ksm ksmVar) {
        ksmVar.getClass();
        return CollectionsKt.toList(ksmVar.m151257e());
    }

    /* JADX INFO: renamed from: h */
    public static List m184246h(ksm ksmVar) {
        ksmVar.getClass();
        return CollectionsKt.toList(ksmVar.m151256d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m184247j(s3f s3fVar, u3f u3fVar, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: l.m3f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s3f.m184244f((String) obj2);
                }
            };
        }
        return s3fVar.m184261i(u3fVar, list, function1);
    }

    /* JADX INFO: renamed from: m */
    private final List<JSONObject> m184248m(List<u3f> events, List<? extends JSONObject> metadata) {
        ArrayList arrayList = new ArrayList();
        Iterator<u3f> it = events.iterator();
        while (it.hasNext()) {
            s3f s3fVar = this;
            arrayList.addAll(m184247j(s3fVar, it.next(), metadata, null, 4, null));
            this = s3fVar;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m184249y(s3f s3fVar, String str, oa5 oa5Var, int i, Object obj) {
        if ((i & 2) != 0) {
            oa5Var = oa5.f145660a;
        }
        return s3fVar.m184274x(str, oa5Var);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: A */
    public final List<pjj0> m184250A(@NotNull JSONObject triggerJson) throws JSONException {
        triggerJson.getClass();
        JSONArray jSONArrayM151800u = kx3.m151800u(triggerJson.optJSONArray(Constants.INAPP_WHEN_TRIGGERS));
        IntRange intRangeM88496l = C15274a.m88496l(0, jSONArrayM151800u.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeM88496l.iterator();
        while (it.hasNext()) {
            Object obj = jSONArrayM151800u.get(((IntIterator) it).nextInt());
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            pjj0 pjj0Var = jSONObject != null ? new pjj0(jSONObject) : null;
            if (pjj0Var != null) {
                arrayList.add(pjj0Var);
            }
        }
        return arrayList;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final void m184251B() {
        ksm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            JSONArray jSONArrayM151258f = inAppStore.m151258f();
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayM151258f.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArrayM151258f.get(i);
                if (obj instanceof Long) {
                    arrayList.add(obj);
                }
            }
            this.evaluatedServerSideCampaignIds = arrayList;
            this.suppressedClientSideInApps = wrq.m207617d(inAppStore.m151262j());
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m184252C(@NotNull List<C1262a> listOfLimitAdapter, @NotNull String campaignId) {
        listOfLimitAdapter.getClass();
        campaignId.getClass();
        return this.limitsMatcher.m136453b(listOfLimitAdapter, campaignId);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: F */
    public final void m184253F() throws JSONException {
        ksm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            JSONArray jSONArrayM207618e = wrq.m207618e(this.evaluatedServerSideCampaignIds);
            jSONArrayM207618e.getClass();
            inAppStore.m151267r(jSONArrayM207618e);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: G */
    public final void m184254G() throws JSONException {
        ksm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            JSONArray jSONArrayM207618e = wrq.m207618e(this.suppressedClientSideInApps);
            jSONArrayM207618e.getClass();
            inAppStore.m151271v(jSONArrayM207618e);
        }
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: H */
    public final List<JSONObject> m184255H(@NotNull List<? extends JSONObject> eligibleInApps, @NotNull jsm strategy, boolean shouldUpdateTTLForThisContext) throws JSONException {
        eligibleInApps.getClass();
        strategy.getClass();
        List<JSONObject> listM184256J = m184256J(eligibleInApps);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        List<JSONObject> listMo146851b = strategy.mo146851b(listM184256J, new Function1() { // from class: l.n3f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s3f.m184241c(this.f139964a, booleanRef, (JSONObject) obj));
            }
        });
        if (shouldUpdateTTLForThisContext && strategy.mo146850a()) {
            for (JSONObject jSONObject : listMo146851b) {
                m184240N(this, jSONObject, null, 2, null);
                Logger.m5928v(f165996i, "Updated TTL for in-app: " + jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD));
            }
        }
        if (booleanRef.element) {
            m184254G();
        }
        return listMo146851b;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final List<JSONObject> m184256J(@NotNull List<? extends JSONObject> inApps) {
        inApps.getClass();
        Function1 function1 = new Function1() { // from class: l.p3f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(s3f.m184243e((JSONObject) obj));
            }
        };
        return CollectionsKt.sortedWith(inApps, new C19969c(new C19968b(function1), new Function1() { // from class: l.q3f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s3f.m184242d((JSONObject) obj);
            }
        }));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: K */
    public final void m184257K(@NotNull JSONObject inApp) {
        inApp.getClass();
        String strOptString = inApp.optString(Constants.INAPP_ID_IN_PAYLOAD);
        strOptString.getClass();
        this.suppressedClientSideInApps.add(MapsKt.mapOf(TuplesKt.m88129a(Constants.NOTIFICATION_ID_TAG, m184249y(this, strOptString, null, 2, null)), TuplesKt.m88129a(Constants.INAPP_WZRK_PIVOT, inApp.optString(Constants.INAPP_WZRK_PIVOT, "wzrk_default")), TuplesKt.m88129a(Constants.INAPP_WZRK_CGID, Integer.valueOf(inApp.optInt(Constants.INAPP_WZRK_CGID)))));
    }

    /* JADX INFO: renamed from: M */
    public final void m184258M(@NotNull JSONObject inApp, @NotNull oa5 clock) throws JSONException {
        inApp.getClass();
        clock.getClass();
        Object objOpt = inApp.opt(Constants.WZRK_TIME_TO_LIVE_OFFSET);
        Long l2 = objOpt instanceof Long ? (Long) objOpt : null;
        if (l2 != null) {
            inApp.put("wzrk_ttl", clock.mo166827c() + l2.longValue());
        } else {
            inApp.remove("wzrk_ttl");
        }
    }

    @Override // p153l.wj20
    @Nullable
    /* JADX INFO: renamed from: a */
    public JSONObject mo184259a(@NotNull EndpointId endpointId) throws JSONException {
        endpointId.getClass();
        JSONObject jSONObject = new JSONObject();
        if (endpointId == EndpointId.ENDPOINT_A1) {
            if (!this.evaluatedServerSideCampaignIds.isEmpty()) {
                jSONObject.put(Constants.INAPP_SS_EVAL_META, wrq.m207618e(this.evaluatedServerSideCampaignIds));
            }
            if (!this.suppressedClientSideInApps.isEmpty()) {
                jSONObject.put(Constants.INAPP_SUPPRESSED_META, wrq.m207618e(this.suppressedClientSideInApps));
            }
        }
        if (kx3.m151796q(jSONObject)) {
            return jSONObject;
        }
        return null;
    }

    @Override // p153l.wj20
    /* JADX INFO: renamed from: b */
    public void mo184260b(@NotNull JSONObject allHeaders, @NotNull EndpointId endpointId) throws JSONException {
        allHeaders.getClass();
        endpointId.getClass();
        if (endpointId == EndpointId.ENDPOINT_A1) {
            m184236D(allHeaders);
            m184237E(allHeaders);
        }
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<JSONObject> m184261i(@NotNull u3f event, @NotNull List<? extends JSONObject> inappNotifs, @NotNull Function1<? super String, Unit> clearResource) {
        event.getClass();
        inappNotifs.getClass();
        clearResource.getClass();
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : inappNotifs) {
            CustomTemplateInAppData customTemplateInAppDataM6363a = CustomTemplateInAppData.INSTANCE.m6363a(jSONObject);
            String templateName = customTemplateInAppDataM6363a != null ? customTemplateInAppDataM6363a.getTemplateName() : null;
            if (templateName == null || this.templatesManager.m111909f(templateName)) {
                String strOptString = jSONObject.optString(Constants.INAPP_ID_IN_PAYLOAD);
                if (this.triggersMatcher.m6431j(m184250A(jSONObject), event)) {
                    Logger.m5928v("INAPP", "Triggers matched for event " + event.getEventName() + " against inApp " + strOptString);
                    wjj0 wjj0Var = this.triggersManager;
                    strOptString.getClass();
                    wjj0Var.m206688c(strOptString);
                    boolean zM136453b = this.limitsMatcher.m136453b(m184275z(jSONObject), strOptString);
                    if (this.limitsMatcher.m136454c(m184275z(jSONObject), strOptString)) {
                        clearResource.invoke("");
                    }
                    if (zM136453b) {
                        Logger.m5928v("INAPP", "Limits matched for event " + event.getEventName() + " against inApp " + strOptString);
                        arrayList.add(jSONObject);
                    } else {
                        Logger.m5928v("INAPP", "Limits did not matched for event " + event.getEventName() + " against inApp " + strOptString);
                    }
                } else {
                    Logger.m5928v("INAPP", "Triggers did not matched for event " + event.getEventName() + " against inApp " + strOptString);
                }
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<JSONObject> m184262k(@NotNull List<u3f> events) {
        events.getClass();
        return m184272v(events, jsm.C18026b.INSTANCE, new Function1() { // from class: l.r3f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s3f.m184245g((ksm) obj);
            }
        });
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<JSONObject> m184263l(@NotNull List<u3f> events) {
        events.getClass();
        return m184272v(events, jsm.C18025a.INSTANCE, new Function1() { // from class: l.o3f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s3f.m184246h((ksm) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final ha5 m184264n(@NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) {
        eventProperties.getClass();
        List<u3f> listListOf = CollectionsKt.listOf(new u3f(Constants.APP_LAUNCHED_EVENT, eventProperties, null, userLocation, null, 20, null));
        return new ha5(m184262k(listListOf), m184263l(listListOf));
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<JSONObject> m184265o(@NotNull List<? extends JSONObject> appLaunchedDelayedNotifs, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) {
        appLaunchedDelayedNotifs.getClass();
        eventProperties.getClass();
        return m184273w(appLaunchedDelayedNotifs, eventProperties, userLocation, jsm.C18025a.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<JSONObject> m184266p(@NotNull List<? extends JSONObject> appLaunchedNotifs, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) {
        appLaunchedNotifs.getClass();
        eventProperties.getClass();
        return m184273w(appLaunchedNotifs, eventProperties, userLocation, jsm.C18026b.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final l3f m184267q(@NotNull Map<String, ? extends Object> details, @NotNull List<? extends Map<String, ? extends Object>> items, @Nullable Location userLocation) throws JSONException {
        details.getClass();
        items.getClass();
        List<u3f> listListOf = CollectionsKt.listOf(new u3f(Constants.CHARGED_EVENT, details, items, userLocation, null, 16, null));
        m184270t(listListOf);
        return new l3f(m184262k(listListOf), m184263l(listListOf), m184271u(listListOf));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final l3f m184268r(@NotNull String eventName, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) throws JSONException {
        eventName.getClass();
        eventProperties.getClass();
        List<u3f> listListOf = CollectionsKt.listOf(new u3f(eventName, eventProperties, null, userLocation, null, 20, null));
        m184270t(listListOf);
        return new l3f(m184262k(listListOf), m184263l(listListOf), m184271u(listListOf));
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final l3f m184269s(@NotNull Map<String, ? extends Map<String, ? extends Object>> eventProperties, @Nullable Location userLocation, @NotNull Map<String, ? extends Object> appFields) throws JSONException {
        eventProperties.getClass();
        appFields.getClass();
        ArrayList arrayList = new ArrayList(eventProperties.size());
        for (Map.Entry<String, ? extends Map<String, ? extends Object>> entry : eventProperties.entrySet()) {
            Map mutableMap = MapsKt.toMutableMap(entry.getValue());
            mutableMap.putAll(appFields);
            arrayList.add(new u3f(entry.getKey() + Constants.USER_ATTRIBUTE_CHANGE, mutableMap, null, userLocation, entry.getKey(), 4, null));
        }
        m184270t(arrayList);
        return new l3f(m184262k(arrayList), m184263l(arrayList), m184271u(arrayList));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: t */
    public final void m184270t(@NotNull List<u3f> events) throws JSONException {
        events.getClass();
        ksm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            m184239L(m184248m(events, CollectionsKt.toList(inAppStore.m151261i())));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final List<JSONObject> m184271u(@NotNull List<u3f> events) throws JSONException {
        events.getClass();
        ksm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            List<JSONObject> listM184248m = m184248m(events, CollectionsKt.toList(inAppStore.m151259g()));
            m184239L(listM184248m);
            if (listM184248m != null) {
                return listM184248m;
            }
        }
        return CollectionsKt.emptyList();
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: v */
    public final List<JSONObject> m184272v(@NotNull List<u3f> events, @NotNull jsm strategy, @NotNull Function1<? super ksm, ? extends List<? extends JSONObject>> readInAppsFromStore) {
        s3f s3fVar;
        events.getClass();
        strategy.getClass();
        readInAppsFromStore.getClass();
        ArrayList arrayList = new ArrayList();
        ksm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore == null) {
            return CollectionsKt.emptyList();
        }
        for (u3f u3fVar : events) {
            Object obj = u3fVar.m194365d().get(Constants.KEY_OLD_VALUE);
            Object obj2 = u3fVar.m194365d().get(Constants.KEY_NEW_VALUE);
            if (obj2 == null || !Intrinsics.m88377d(obj2, obj)) {
                s3fVar = this;
                arrayList.addAll(m184247j(s3fVar, u3fVar, readInAppsFromStore.invoke(inAppStore), null, 4, null));
            } else {
                s3fVar = this;
            }
            this = s3fVar;
        }
        return this.m184255H(arrayList, strategy, true);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: w */
    public final List<JSONObject> m184273w(@NotNull List<? extends JSONObject> appLaunchedNotifs, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation, @NotNull jsm strategy) {
        appLaunchedNotifs.getClass();
        eventProperties.getClass();
        strategy.getClass();
        return m184255H(m184247j(this, new u3f(Constants.APP_LAUNCHED_EVENT, eventProperties, null, userLocation, null, 20, null), appLaunchedNotifs, null, 4, null), strategy, false);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: x */
    public final String m184274x(@NotNull String ti, @NotNull oa5 clock) {
        ti.getClass();
        clock.getClass();
        return ti + '_' + this.dateFormatter.format(clock.mo166826b());
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final List<C1262a> m184275z(@NotNull JSONObject limitJSON) throws JSONException {
        limitJSON.getClass();
        JSONArray jSONArrayM151800u = kx3.m151800u(limitJSON.optJSONArray(Constants.INAPP_FC_LIMITS));
        JSONArray jSONArrayM151800u2 = kx3.m151800u(limitJSON.optJSONArray(Constants.INAPP_OCCURRENCE_LIMITS));
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayM151800u.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayM151800u.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int length2 = jSONArrayM151800u2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj2 = jSONArrayM151800u2.get(i2);
            if (obj2 instanceof JSONObject) {
                arrayList2.add(obj2);
            }
        }
        List<JSONObject> listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (JSONObject jSONObject : listPlus) {
            C1262a c1262a = kx3.m151796q(jSONObject) ? new C1262a(jSONObject) : null;
            if (c1262a != null) {
                arrayList3.add(c1262a);
            }
        }
        return arrayList3;
    }
}

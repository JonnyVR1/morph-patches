package com.clevertap.android.sdk.network;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.interfaces.NotificationRenderedListener;
import com.clevertap.android.sdk.network.C1296b;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.C20092t1;
import p149l.b2s;
import p149l.cpb0;
import p149l.dpb0;
import p149l.f0f;
import p149l.fxc0;
import p149l.g0f;
import p149l.hyd;
import p149l.i0f;
import p149l.j0f;
import p149l.jb20;
import p149l.jc20;
import p149l.kwb;
import p149l.l9r;
import p149l.lw3;
import p149l.nb20;
import p149l.nul;
import p149l.nwb;
import p149l.p85;
import p149l.qs9;
import p149l.r26;
import p149l.st3;
import p149l.ui2;
import p149l.vg2;
import p149l.xge0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.network.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0093\u00012\u00020\u0001:\u0001{By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b1\u00102J5\u0010:\u001a\u00020\"2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\f\u00108\u001a\b\u0012\u0004\u0012\u00020+072\u0006\u00109\u001a\u00020\"H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020+2\b\u0010@\u001a\u0004\u0018\u00010&2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020)2\u0006\u00104\u001a\u0002032\u0006\u0010C\u001a\u000205H\u0003¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020)2\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020)2\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bH\u0010GJ\u0017\u0010I\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bI\u0010/J\u001f\u0010K\u001a\u00020+2\u0006\u0010*\u001a\u00020)2\u0006\u0010J\u001a\u00020 H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\bM\u0010/J5\u0010O\u001a\u00020\"2\u0006\u0010*\u001a\u00020)2\u0006\u0010N\u001a\u00020\"2\f\u00108\u001a\b\u0012\u0004\u0012\u00020+072\u0006\u00109\u001a\u00020\"H\u0003¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bQ\u0010-J\u0017\u0010R\u001a\u00020\"2\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020+2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020+2\u0006\u0010X\u001a\u00020 H\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020+2\b\u0010[\u001a\u0004\u0018\u00010 H\u0003¢\u0006\u0004\b\\\u0010ZJ\u0017\u0010_\u001a\u00020+2\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020+2\u0006\u0010a\u001a\u00020 H\u0003¢\u0006\u0004\bb\u0010ZJ#\u0010e\u001a\u00020+2\u0006\u0010c\u001a\u00020\"2\n\b\u0002\u0010d\u001a\u0004\u0018\u000100H\u0003¢\u0006\u0004\be\u0010fJ\u0015\u0010i\u001a\u00020+2\u0006\u0010h\u001a\u00020g¢\u0006\u0004\bi\u0010jJ/\u0010k\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\b\u0010%\u001a\u0004\u0018\u00010 2\u0006\u00109\u001a\u00020\"¢\u0006\u0004\bk\u0010lJ\r\u0010m\u001a\u00020]¢\u0006\u0004\bm\u0010nJ\u001f\u0010q\u001a\u00020+2\u0006\u00104\u001a\u0002032\u0006\u0010p\u001a\u00020oH\u0007¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\"2\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020+2\u0006\u00104\u001a\u0002032\u0006\u0010p\u001a\u00020oH\u0007¢\u0006\u0004\bu\u0010rJ;\u0010v\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010%\u001a\u0004\u0018\u00010 2\b\b\u0002\u00109\u001a\u00020\"¢\u0006\u0004\bv\u0010wJ\u0019\u0010y\u001a\u0004\u0018\u00010&2\u0006\u0010x\u001a\u00020 H\u0007¢\u0006\u0004\by\u0010(J\u0015\u0010z\u001a\u00020\"2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bz\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010\u007fR\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010\u0080\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010\u0081\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010\u0082\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bR\u0010\u0083\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0084\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0085\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bm\u0010\u0088\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0089\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010\u008a\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010bR\u0017\u0010\u008d\u0001\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010bR\u0017\u0010\u008e\u0001\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010bR\u001d\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020g0\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0090\u0001R\u0013\u0010\u0092\u0001\u001a\u00020]8G¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010n¨\u0006\u0094\u0001"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/b;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/hyd;", "deviceInfo", "Ll/qs9;", "coreMetaData", "Ll/r26;", "controllerManager", "Ll/ui2;", "databaseManager", "Ll/vg2;", "callbackManager", "Ll/nwb;", "ctApiWrapper", "Ll/jb20;", "encryptionManager", "Ll/t1;", "arpResponse", "Ll/jc20;", "networkRepo", "Ll/dpb0;", "queueHeaderBuilder", "Ll/p85;", "cleverTapResponseHandler", "Ll/nul;", "logger", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/hyd;Ll/qs9;Ll/r26;Ll/ui2;Ll/vg2;Ll/nwb;Ll/jb20;Ll/t1;Ll/jc20;Ll/dpb0;Ll/p85;Ll/nul;)V", "", "newDomain", "", "r", "(Ljava/lang/String;)Z", BLiveRole.caller, "Lorg/json/JSONObject;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;)Lorg/json/JSONObject;", "Ll/fxc0;", "response", "", "A", "(Ll/fxc0;)V", "J", "(Ll/fxc0;)Z", "", BaseSei.f13931Y, "(Ll/fxc0;)Ljava/lang/Long;", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "Ll/xge0;", "requestBody", "Lkotlin/Function0;", "notifyNetworkHeaderListeners", "isUserSwitchFlush", "u", "(Lcom/clevertap/android/sdk/events/EventGroup;Ll/xge0;Lkotlin/jvm/functions/Function0;Z)Z", "Lcom/clevertap/android/sdk/network/EndpointId;", "endpointId", ResourceDirection.f38808v, "(Ll/xge0;Lcom/clevertap/android/sdk/network/EndpointId;)V", "queueHeader", "e", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/network/EndpointId;)V", "body", "f", "(Lcom/clevertap/android/sdk/events/EventGroup;Ll/xge0;)Ll/fxc0;", "D", "(Ll/xge0;)Ll/fxc0;", "B", "p", "logTag", "q", "(Ll/fxc0;Ljava/lang/String;)V", "m", "isFullResponse", "n", "(Ll/fxc0;ZLkotlin/jvm/functions/Function0;Z)Z", "o", "g", "(Ll/xge0;)Z", "Lorg/json/JSONArray;", "queue", BaseSei.f13930X, "(Lorg/json/JSONArray;)V", "listenerKey", "w", "(Ljava/lang/String;)V", "domainName", "E", "", com.tencent.connect.common.Constants.f57189TS, "F", "(I)V", "spikyDomainName", "I", BLiveButtonType.mute, "muteExpiryMs", "G", "(ZLjava/lang/Long;)V", "Ll/nb20;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, Constants.INAPP_DATA_TAG, "(Ll/nb20;)V", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/String;Z)V", "k", "()I", "Ljava/lang/Runnable;", "handshakeSuccessCallback", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/Runnable;)V", Constants.KEY_T, "(Lcom/clevertap/android/sdk/events/EventGroup;)Z", BaseSei.f13932Z, b2s.C_ZONE, "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Lorg/json/JSONArray;Ljava/lang/String;Z)Z", "url", "h", "c", "a", "Landroid/content/Context;", "b", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/hyd;", "Ll/qs9;", "Ll/r26;", "Ll/ui2;", "Ll/vg2;", "Ll/nwb;", "Ll/jb20;", "j", "Ll/t1;", "Ll/jc20;", "Ll/dpb0;", "Ll/p85;", "Ll/nul;", "responseFailureCount", "networkRetryCount", "minDelayFrequency", "", "Ljava/util/List;", "mNetworkHeadersListeners", "currentRequestTimestamp", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1296b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final hyd deviceInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final qs9 coreMetaData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final r26 controllerManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ui2 databaseManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final vg2 callbackManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final nwb ctApiWrapper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final jb20 encryptionManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final C20092t1 arpResponse;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final jc20 networkRepo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final dpb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final p85 cleverTapResponseHandler;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int responseFailureCount;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int networkRetryCount;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int minDelayFrequency;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final List<nb20> mNetworkHeadersListeners;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.b$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5411a;

        static {
            int[] iArr = new int[EventGroup.values().length];
            try {
                iArr[EventGroup.VARIABLES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventGroup.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventGroup.PUSH_NOTIFICATION_VIEWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5411a = iArr;
        }
    }

    public C1296b(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull hyd hydVar, @NotNull qs9 qs9Var, @NotNull r26 r26Var, @NotNull ui2 ui2Var, @NotNull vg2 vg2Var, @NotNull nwb nwbVar, @NotNull jb20 jb20Var, @NotNull C20092t1 c20092t1, @NotNull jc20 jc20Var, @NotNull dpb0 dpb0Var, @NotNull p85 p85Var, @NotNull nul nulVar) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        hydVar.getClass();
        qs9Var.getClass();
        r26Var.getClass();
        ui2Var.getClass();
        vg2Var.getClass();
        nwbVar.getClass();
        jb20Var.getClass();
        c20092t1.getClass();
        jc20Var.getClass();
        dpb0Var.getClass();
        p85Var.getClass();
        nulVar.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.deviceInfo = hydVar;
        this.coreMetaData = qs9Var;
        this.controllerManager = r26Var;
        this.databaseManager = ui2Var;
        this.callbackManager = vg2Var;
        this.ctApiWrapper = nwbVar;
        this.encryptionManager = jb20Var;
        this.arpResponse = c20092t1;
        this.networkRepo = jc20Var;
        this.queueHeaderBuilder = dpb0Var;
        this.cleverTapResponseHandler = p85Var;
        this.logger = nulVar;
        this.mNetworkHeadersListeners = new ArrayList();
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    private final void m6818A(fxc0 response) {
        String strM123625m = response.m123625m("X-WZRK-RD");
        Logger.m5873v("Getting domain from header - " + strM123625m);
        if (strM123625m == null || StringsKt.m93438e0(strM123625m)) {
            return;
        }
        String strM123625m2 = response.m123625m("X-WZRK-SPIKY-RD");
        Logger.m5873v("Getting spiky domain from header - " + strM123625m2);
        m6824H(this, false, null, 2, null);
        m6821E(strM123625m);
        Logger.m5873v("Setting spiky domain from header as -" + strM123625m2);
        if (strM123625m2 == null) {
            m6825I(strM123625m);
        } else {
            m6825I(strM123625m2);
        }
    }

    /* JADX INFO: renamed from: B */
    private final fxc0 m6819B(xge0 body) {
        return this.ctApiWrapper.m161866b().m147537n(body.toString());
    }

    /* JADX INFO: renamed from: D */
    private final fxc0 m6820D(xge0 body) throws JSONException {
        if (this.config.isEncryptionInTransitEnabled() && !this.coreMetaData.m176182I()) {
            i0f i0fVarM140739c = this.encryptionManager.m140739c(body.toString());
            String strM140740d = this.encryptionManager.m140740d();
            if (i0fVarM140739c instanceof j0f) {
                j0f j0fVar = (j0f) i0fVarM140739c;
                String data = j0fVar.getData();
                strM140740d.getClass();
                String strM119037a = new f0f(data, strM140740d, j0fVar.getIv()).m119037a();
                this.logger.verbose(this.config.getAccountId(), "Encrypted Request = " + strM119037a);
                return this.ctApiWrapper.m161866b().m147540q(strM119037a, true);
            }
            this.logger.verbose(this.config.getAccountId(), "Normal Request cause encryption failed = " + body);
        }
        return kwb.m147528r(this.ctApiWrapper.m161866b(), body.toString(), false, 2, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    private final void m6821E(String domainName) {
        this.logger.verbose(this.config.getAccountId(), "Setting domain to " + domainName);
        this.networkRepo.m140861l(domainName);
        this.ctApiWrapper.m161866b().m147541s(domainName);
        this.callbackManager.mo100744r();
    }

    /* JADX INFO: renamed from: F */
    private final void m6822F(int ts) {
        if (this.networkRepo.m140854e() > 0) {
            return;
        }
        this.networkRepo.m140862m(ts);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    private final void m6823G(boolean mute, Long muteExpiryMs) {
        if (!mute) {
            this.networkRepo.m140865p(false);
            return;
        }
        jc20 jc20Var = this.networkRepo;
        if (muteExpiryMs != null) {
            jc20Var.m140864o(muteExpiryMs.longValue());
        } else {
            jc20Var.m140865p(true);
        }
        this.networkRepo.m140861l(null);
        st3.m185849c(this.config).m190592d().m6946g("CommsManager#setMuted", new Callable() { // from class: l.cc20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1296b.m6828b(this.f80197a);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m6824H(C1296b c1296b, boolean z, Long l2, int i, Object obj) {
        if ((i & 2) != 0) {
            l2 = null;
        }
        c1296b.m6823G(z, l2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    private final void m6825I(String spikyDomainName) {
        this.logger.verbose(this.config.getAccountId(), "Setting spiky domain to " + spikyDomainName);
        this.networkRepo.m140866q(spikyDomainName);
        this.ctApiWrapper.m161866b().m147542t(spikyDomainName);
    }

    /* JADX INFO: renamed from: J */
    private final boolean m6826J(fxc0 response) {
        String string;
        String strM123625m = response.m123625m("X-WZRK-MUTE");
        if (strM123625m != null && (string = StringsKt.m93433Z0(strM123625m).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                if (Intrinsics.m87488d(string, "true")) {
                    m6823G(true, m6843y(response));
                    return true;
                }
                m6824H(this, false, null, 2, null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6827a(C1296b c1296b, xge0 xge0Var, EndpointId endpointId) {
        c1296b.getClass();
        xge0Var.getClass();
        endpointId.getClass();
        c1296b.m6840v(xge0Var, endpointId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6828b(C1296b c1296b) {
        c1296b.getClass();
        c1296b.databaseManager.mo94409b(c1296b.context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private final void m6829e(JSONObject queueHeader, EndpointId endpointId) {
        if (queueHeader != null) {
            Iterator<nb20> it = this.mNetworkHeadersListeners.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectMo157623a = it.next().mo157623a(endpointId);
                if (jSONObjectMo157623a != null) {
                    lw3.m151937g(queueHeader, jSONObjectMo157623a);
                }
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    private final fxc0 m6830f(EventGroup eventGroup, xge0 body) {
        int i = b.f5411a[eventGroup.ordinal()];
        if (i == 1) {
            return this.ctApiWrapper.m161866b().m147529e(body);
        }
        if (i == 2) {
            return m6820D(body);
        }
        if (i == 3) {
            return m6819B(body);
        }
        l9r.m149037a();
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m6831g(xge0 body) {
        int length = body.getQueue().length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = body.getQueue().getJSONObject(i);
                if (Intrinsics.m87488d(NotificationCompat.CATEGORY_EVENT, jSONObject.getString("type"))) {
                    String string = jSONObject.getString(Constants.KEY_EVT_NAME);
                    if (Intrinsics.m87488d(Constants.APP_LAUNCHED_EVENT, string) || Intrinsics.m87488d(Constants.WZRK_FETCH, string)) {
                        return true;
                    }
                } else {
                    continue;
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private final JSONObject m6832l(String caller) {
        return this.queueHeaderBuilder.m112886s(caller);
    }

    @WorkerThread
    /* JADX INFO: renamed from: m */
    private final boolean m6833m(fxc0 response) {
        if (!response.m123626n()) {
            this.logger.info(this.config.getAccountId(), "Received error response code: " + response.getCode());
            return false;
        }
        if (m6845c(response) || m6826J(response)) {
            return false;
        }
        m6818A(response);
        this.logger.debug(this.config.getAccountId(), "Push Impressions sent successfully");
        this.networkRepo.m140863n(m6849j());
        m6822F(m6849j());
        this.logger.verbose(this.config.getAccountId(), "Processing response : " + lw3.m151954x(response.m123627q()));
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    private final boolean m6834n(fxc0 response, boolean isFullResponse, Function0<Unit> notifyNetworkHeaderListeners, boolean isUserSwitchFlush) {
        if (!response.m123626n()) {
            m6835o(response);
            return false;
        }
        if (m6845c(response) || m6826J(response)) {
            return false;
        }
        this.coreMetaData.m176195Y();
        m6818A(response);
        notifyNetworkHeaderListeners.invoke();
        this.logger.debug(this.config.getAccountId(), "Queue sent successfully");
        this.networkRepo.m140863n(m6849j());
        m6822F(m6849j());
        String strM123627q = response.m123627q();
        JSONObject jSONObjectM151954x = lw3.m151954x(strM123627q);
        this.logger.verbose(this.config.getAccountId(), "Processing response : " + jSONObjectM151954x);
        if (strM123627q != null && !StringsKt.m93438e0(strM123627q) && jSONObjectM151954x != null) {
            if (Boolean.parseBoolean(response.m123625m("X-CleverTap-Encryption-Enabled"))) {
                i0f i0fVarM140738b = this.encryptionManager.m140738b(strM123627q);
                if (i0fVarM140738b instanceof g0f) {
                    this.logger.verbose(this.config.getAccountId(), "Failed to decrypt response");
                    return false;
                }
                if (!(i0fVarM140738b instanceof j0f)) {
                    l9r.m149037a();
                    return false;
                }
                strM123627q = ((j0f) i0fVarM140738b).getData();
                jSONObjectM151954x = lw3.m151954x(strM123627q);
                this.logger.verbose(this.config.getAccountId(), "Decrypted response = " + strM123627q);
            }
            this.cleverTapResponseHandler.m167790a(isFullResponse, jSONObjectM151954x, strM123627q, isUserSwitchFlush);
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private final void m6835o(fxc0 response) {
        this.logger.info(this.config.getAccountId(), "Received error response code: " + response.getCode());
        int code = response.getCode();
        if (code == 402) {
            this.logger.verbose(this.config.getAccountId(), "Encryption in transit feature on not enabled for your account, please contact Clevertap support.");
            this.coreMetaData.m176211i0(true);
        } else {
            if (code != 419) {
                return;
            }
            this.logger.verbose(this.config.getAccountId(), "There is decryption failure on backend, disabling encrypted requests.");
            this.coreMetaData.m176211i0(true);
        }
    }

    /* JADX INFO: renamed from: p */
    private final boolean m6836p(fxc0 response) {
        if (!response.m123626n()) {
            m6837q(response, "Variables");
            return false;
        }
        String strM123627q = response.m123627q();
        JSONObject jSONObjectM151954x = lw3.m151954x(strM123627q);
        this.logger.verbose(this.config.getAccountId(), "Processing variables response : " + jSONObjectM151954x);
        this.arpResponse.mo98525a(jSONObjectM151954x, strM123627q, this.context);
        return true;
    }

    /* JADX INFO: renamed from: q */
    private final void m6837q(fxc0 response, String logTag) {
        int code = response.getCode();
        if (code != 400) {
            nul nulVar = this.logger;
            if (code == 401) {
                nulVar.info(logTag, "Unauthorized access from a non-test profile. Please mark this profile as a test profile from the CleverTap dashboard.");
                return;
            }
            nulVar.info(logTag, "Response code " + response.getCode() + " while syncing.");
            return;
        }
        JSONObject jSONObjectM151954x = lw3.m151954x(response.m123627q());
        if (jSONObjectM151954x == null || TextUtils.isEmpty(jSONObjectM151954x.optString("error"))) {
            this.logger.info(logTag, "Error while syncing.");
            return;
        }
        String strOptString = jSONObjectM151954x.optString("error");
        this.logger.info(logTag, "Error while syncing: " + strOptString);
    }

    /* JADX INFO: renamed from: r */
    private final boolean m6838r(String newDomain) {
        return !Intrinsics.m87488d(newDomain, this.networkRepo.m140853d());
    }

    /* JADX INFO: renamed from: u */
    private final boolean m6839u(EventGroup eventGroup, xge0 requestBody, Function0<Unit> notifyNetworkHeaderListeners, boolean isUserSwitchFlush) {
        boolean zM6836p;
        fxc0 fxc0VarM6830f = m6830f(eventGroup, requestBody);
        int i = 0;
        try {
            this.networkRetryCount = 0;
            int i2 = b.f5411a[eventGroup.ordinal()];
            if (i2 == 1) {
                zM6836p = m6836p(fxc0VarM6830f);
            } else if (i2 == 2) {
                zM6836p = m6834n(fxc0VarM6830f, m6831g(requestBody), notifyNetworkHeaderListeners, isUserSwitchFlush);
                if (!zM6836p) {
                    i = this.responseFailureCount + 1;
                }
                this.responseFailureCount = i;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zM6836p = m6833m(fxc0VarM6830f);
                if (!zM6836p) {
                    i = this.responseFailureCount + 1;
                }
                this.responseFailureCount = i;
            }
            CloseableKt.m87404a(fxc0VarM6830f, null);
            return zM6836p;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(fxc0VarM6830f, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m6840v(xge0 requestBody, EndpointId endpointId) {
        if (requestBody.getQueueHeader() != null) {
            Iterator<nb20> it = this.mNetworkHeadersListeners.iterator();
            while (it.hasNext()) {
                it.next().mo157624b(requestBody.getQueueHeader(), endpointId);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m6841w(String listenerKey) {
        NotificationRenderedListener notificationRenderedListenerM5757Q = CleverTapAPI.m5757Q(listenerKey);
        if (notificationRenderedListenerM5757Q != null) {
            this.logger.verbose(this.config.getAccountId(), "notifying listener " + listenerKey + ", that push impression sent successfully");
            notificationRenderedListenerM5757Q.onNotificationRendered(true);
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m6842x(JSONArray queue) throws JSONException {
        int length = queue.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObjectOptJSONObject = queue.getJSONObject(i).optJSONObject(Constants.KEY_EVT_DATA);
                if (jSONObjectOptJSONObject != null) {
                    String strM6929a = PushNotificationUtil.m6929a(jSONObjectOptJSONObject.optString(Constants.WZRK_ACCT_ID_KEY), jSONObjectOptJSONObject.optString(Constants.WZRK_PUSH_ID));
                    strM6929a.getClass();
                    m6841w(strM6929a);
                }
            } catch (JSONException e) {
                this.logger.verbose(this.config.getAccountId(), "Encountered an exception while parsing the push notification viewed event queue", e);
            } catch (Exception e2) {
                this.logger.verbose(this.config.getAccountId(), "Exception occurred while notifying push impression listeners", e2);
            }
        }
        this.logger.verbose(this.config.getAccountId(), "push notification viewed event sent successfully");
    }

    /* JADX INFO: renamed from: y */
    private final Long m6843y(fxc0 response) {
        String string;
        String strM123625m = response.m123625m("X-WZRK-MUTE-DURATION");
        if (strM123625m != null && (string = StringsKt.m93433Z0(strM123625m).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                try {
                    return Long.valueOf(Long.parseLong(string));
                } catch (NumberFormatException unused) {
                    this.logger.verbose(this.config.getAccountId(), "Invalid X-WZRK-MUTE-DURATION value: " + string + ", falling back to default mute");
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m6844C(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable JSONArray queue, @Nullable String caller, boolean isUserSwitchFlush) {
        context.getClass();
        eventGroup.getClass();
        if (queue != null && queue.length() > 0) {
            if (this.deviceInfo.m133539E() == null) {
                this.logger.debug(this.config.getAccountId(), "CleverTap Id not finalized, unable to send queue");
                return false;
            }
            final EndpointId endpointIdM6787a = EndpointId.INSTANCE.m6787a(eventGroup);
            JSONObject jSONObjectM6832l = m6832l(caller);
            m6829e(jSONObjectM6832l, endpointIdM6787a);
            final xge0 xge0Var = new xge0(jSONObjectM6832l, queue);
            this.logger.debug(this.config.getAccountId(), "Send queue contains " + queue.length() + " items: " + xge0Var);
            try {
                return m6839u(eventGroup, xge0Var, new Function0() { // from class: l.bc20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C1296b.m6827a(this.f74896a, xge0Var, endpointIdM6787a);
                    }
                }, isUserSwitchFlush);
            } catch (Exception e) {
                this.networkRetryCount++;
                this.responseFailureCount++;
                this.logger.debug(this.config.getAccountId(), "An exception occurred while sending the queue, will retry: ", e);
                if (this.callbackManager.mo100733g() != null) {
                    this.callbackManager.mo100733g().mo104154a(context);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6845c(@NotNull fxc0 response) {
        response.getClass();
        String strM123625m = response.m123625m("X-WZRK-RD");
        if (!lw3.m151946p(strM123625m) || !m6838r(strM123625m)) {
            return false;
        }
        m6821E(strM123625m);
        this.logger.debug(this.config.getAccountId(), "The domain has changed to " + strM123625m + ". The request will be retried shortly.");
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m6846d(@NotNull nb20 listener) {
        listener.getClass();
        this.mNetworkHeadersListeners.add(listener);
    }

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: h */
    public final JSONObject m6847h(@NotNull String url) {
        url.getClass();
        try {
            fxc0 fxc0VarM147530f = this.ctApiWrapper.m161866b().m147530f(url);
            try {
                if (fxc0VarM147530f.m123626n()) {
                    JSONObject jSONObjectM151954x = lw3.m151954x(fxc0VarM147530f.m123627q());
                    CloseableKt.m87404a(fxc0VarM147530f, null);
                    return jSONObjectM151954x;
                }
                this.logger.debug(this.config.getAccountId(), "Failed to fetch inapp payload. Response code: " + fxc0VarM147530f.getCode());
                CloseableKt.m87404a(fxc0VarM147530f, null);
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(fxc0VarM147530f, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.debug(this.config.getAccountId(), "An exception occurred while fetching the inapp payload from URL", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6848i(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable String caller, boolean isUserSwitchFlush) throws JSONException {
        C1296b c1296b;
        context.getClass();
        eventGroup.getClass();
        this.config.getLogger().verbose(this.config.getAccountId(), "Starting queue flush to CleverTap servers");
        boolean hasMore = true;
        int i = 0;
        while (hasMore) {
            cpb0 cpb0VarMo94411d = this.databaseManager.mo94411d(context, 50, eventGroup);
            if (cpb0VarMo94411d.m108119e()) {
                this.config.getLogger().verbose(this.config.getAccountId(), "No more events in queue");
                break;
            }
            JSONArray data = cpb0VarMo94411d.getData();
            int length = data.length();
            this.config.getLogger().verbose(this.config.getAccountId(), "Processing batch of " + length + " events (" + cpb0VarMo94411d.m108116b().size() + " from events, " + cpb0VarMo94411d.m108118d().size() + " from profile)");
            c1296b = this;
            Context context2 = context;
            EventGroup eventGroup2 = eventGroup;
            String str = caller;
            boolean z = isUserSwitchFlush;
            if (c1296b.m6844C(context2, eventGroup2, data, str, z)) {
                c1296b.controllerManager.m177578m(data, true);
                i += length;
                EventGroup eventGroup3 = EventGroup.PUSH_NOTIFICATION_VIEWED;
                ui2 ui2Var = c1296b.databaseManager;
                if (eventGroup2 == eventGroup3) {
                    ui2Var.mo94414g(context2, cpb0VarMo94411d.m108116b());
                    c1296b.m6842x(cpb0VarMo94411d.getData());
                } else {
                    ui2Var.mo94412e(context2, cpb0VarMo94411d.m108116b(), cpb0VarMo94411d.m108118d());
                }
                hasMore = cpb0VarMo94411d.getHasMore();
                this = c1296b;
                context = context2;
                eventGroup = eventGroup2;
                caller = str;
                isUserSwitchFlush = z;
            } else {
                c1296b.config.getLogger().verbose(c1296b.config.getAccountId(), "Failed to send batch - will retry later");
                c1296b.controllerManager.m177579n();
                c1296b.controllerManager.m177578m(data, false);
            }
            c1296b.config.getLogger().verbose(c1296b.config.getAccountId(), "Queue flush completed. Total events sent: " + i);
        }
        c1296b = this;
        c1296b.config.getLogger().verbose(c1296b.config.getAccountId(), "Queue flush completed. Total events sent: " + i);
    }

    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final int m6849j() {
        return this.ctApiWrapper.m161866b().getCurrentRequestTimestampSeconds();
    }

    /* JADX INFO: renamed from: k */
    public final int m6850k() {
        this.minDelayFrequency = this.networkRepo.m140856g(this.minDelayFrequency, this.networkRetryCount);
        this.logger.debug(this.config.getAccountId(), "Setting delay frequency to " + this.minDelayFrequency);
        return this.minDelayFrequency;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final void m6851s(@NotNull EventGroup eventGroup, @NotNull Runnable handshakeSuccessCallback) {
        eventGroup.getClass();
        handshakeSuccessCallback.getClass();
        this.responseFailureCount = 0;
        m6853z(eventGroup, handshakeSuccessCallback);
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final boolean m6852t(@NotNull EventGroup eventGroup) {
        eventGroup.getClass();
        boolean zM161867c = this.ctApiWrapper.m161867c(eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED);
        boolean z = this.responseFailureCount > 5;
        if (z) {
            m6821E(null);
        }
        return zM161867c || z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final void m6853z(@NotNull EventGroup eventGroup, @NotNull Runnable handshakeSuccessCallback) {
        eventGroup.getClass();
        handshakeSuccessCallback.getClass();
        try {
            fxc0 fxc0VarM147535l = this.ctApiWrapper.m161866b().m147535l(eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED);
            try {
                boolean zM123626n = fxc0VarM147535l.m123626n();
                nul nulVar = this.logger;
                if (zM123626n) {
                    nulVar.verbose(this.config.getAccountId(), "Received success from handshake :)");
                    if (m6826J(fxc0VarM147535l)) {
                        CloseableKt.m87404a(fxc0VarM147535l, null);
                        return;
                    } else {
                        m6818A(fxc0VarM147535l);
                        this.logger.verbose(this.config.getAccountId(), "We are not muted");
                        handshakeSuccessCallback.run();
                    }
                } else {
                    nulVar.verbose(this.config.getAccountId(), "Invalid HTTP status code received for handshake - " + fxc0VarM147535l.getCode());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(fxc0VarM147535l, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(fxc0VarM147535l, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to perform handshake!", e);
        }
    }

    public /* synthetic */ C1296b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, hyd hydVar, qs9 qs9Var, r26 r26Var, ui2 ui2Var, vg2 vg2Var, nwb nwbVar, jb20 jb20Var, C20092t1 c20092t1, jc20 jc20Var, dpb0 dpb0Var, p85 p85Var, nul nulVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cleverTapInstanceConfig, hydVar, qs9Var, r26Var, ui2Var, vg2Var, nwbVar, jb20Var, c20092t1, jc20Var, dpb0Var, p85Var, (i & 8192) != 0 ? cleverTapInstanceConfig.getLogger() : nulVar);
    }
}

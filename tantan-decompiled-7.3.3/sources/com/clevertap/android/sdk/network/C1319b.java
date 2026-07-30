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
import com.clevertap.android.sdk.network.C1319b;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.p122io.CloseableKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.C20206t1;
import p153l.axl;
import p153l.bj2;
import p153l.bu9;
import p153l.byb;
import p153l.c4s;
import p153l.ch2;
import p153l.cpe0;
import p153l.gxb0;
import p153l.hxb0;
import p153l.j1f;
import p153l.j5d0;
import p153l.k1f;
import p153l.kx3;
import p153l.m1f;
import p153l.n1f;
import p153l.nbr;
import p153l.q95;
import p153l.ru3;
import p153l.sj20;
import p153l.tk20;
import p153l.uzd;
import p153l.w36;
import p153l.wj20;
import p153l.yxb;

/* JADX INFO: renamed from: com.clevertap.android.sdk.network.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0093\u00012\u00020\u0001:\u0001{By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b1\u00102J5\u0010:\u001a\u00020\"2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\f\u00108\u001a\b\u0012\u0004\u0012\u00020+072\u0006\u00109\u001a\u00020\"H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020+2\b\u0010@\u001a\u0004\u0018\u00010&2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020)2\u0006\u00104\u001a\u0002032\u0006\u0010C\u001a\u000205H\u0003¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020)2\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020)2\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bH\u0010GJ\u0017\u0010I\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bI\u0010/J\u001f\u0010K\u001a\u00020+2\u0006\u0010*\u001a\u00020)2\u0006\u0010J\u001a\u00020 H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\bM\u0010/J5\u0010O\u001a\u00020\"2\u0006\u0010*\u001a\u00020)2\u0006\u0010N\u001a\u00020\"2\f\u00108\u001a\b\u0012\u0004\u0012\u00020+072\u0006\u00109\u001a\u00020\"H\u0003¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bQ\u0010-J\u0017\u0010R\u001a\u00020\"2\u0006\u0010C\u001a\u000205H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020+2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020+2\u0006\u0010X\u001a\u00020 H\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020+2\b\u0010[\u001a\u0004\u0018\u00010 H\u0003¢\u0006\u0004\b\\\u0010ZJ\u0017\u0010_\u001a\u00020+2\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020+2\u0006\u0010a\u001a\u00020 H\u0003¢\u0006\u0004\bb\u0010ZJ#\u0010e\u001a\u00020+2\u0006\u0010c\u001a\u00020\"2\n\b\u0002\u0010d\u001a\u0004\u0018\u000100H\u0003¢\u0006\u0004\be\u0010fJ\u0015\u0010i\u001a\u00020+2\u0006\u0010h\u001a\u00020g¢\u0006\u0004\bi\u0010jJ/\u0010k\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\b\u0010%\u001a\u0004\u0018\u00010 2\u0006\u00109\u001a\u00020\"¢\u0006\u0004\bk\u0010lJ\r\u0010m\u001a\u00020]¢\u0006\u0004\bm\u0010nJ\u001f\u0010q\u001a\u00020+2\u0006\u00104\u001a\u0002032\u0006\u0010p\u001a\u00020oH\u0007¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\"2\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020+2\u0006\u00104\u001a\u0002032\u0006\u0010p\u001a\u00020oH\u0007¢\u0006\u0004\bu\u0010rJ;\u0010v\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010%\u001a\u0004\u0018\u00010 2\b\b\u0002\u00109\u001a\u00020\"¢\u0006\u0004\bv\u0010wJ\u0019\u0010y\u001a\u0004\u0018\u00010&2\u0006\u0010x\u001a\u00020 H\u0007¢\u0006\u0004\by\u0010(J\u0015\u0010z\u001a\u00020\"2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\bz\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010\u007fR\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010\u0080\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010\u0081\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010\u0082\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bR\u0010\u0083\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0084\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0085\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bm\u0010\u0088\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0089\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010\u008a\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010bR\u0017\u0010\u008d\u0001\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010bR\u0017\u0010\u008e\u0001\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010bR\u001d\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020g0\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0090\u0001R\u0013\u0010\u0092\u0001\u001a\u00020]8G¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010n¨\u0006\u0094\u0001"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/b;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/uzd;", "deviceInfo", "Ll/bu9;", "coreMetaData", "Ll/w36;", "controllerManager", "Ll/bj2;", "databaseManager", "Ll/ch2;", "callbackManager", "Ll/byb;", "ctApiWrapper", "Ll/sj20;", "encryptionManager", "Ll/t1;", "arpResponse", "Ll/tk20;", "networkRepo", "Ll/hxb0;", "queueHeaderBuilder", "Ll/q95;", "cleverTapResponseHandler", "Ll/axl;", "logger", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/uzd;Ll/bu9;Ll/w36;Ll/bj2;Ll/ch2;Ll/byb;Ll/sj20;Ll/t1;Ll/tk20;Ll/hxb0;Ll/q95;Ll/axl;)V", "", "newDomain", "", "r", "(Ljava/lang/String;)Z", BLiveRole.caller, "Lorg/json/JSONObject;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;)Lorg/json/JSONObject;", "Ll/j5d0;", "response", "", "A", "(Ll/j5d0;)V", "J", "(Ll/j5d0;)Z", "", BaseSei.f14625Y, "(Ll/j5d0;)Ljava/lang/Long;", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "Ll/cpe0;", "requestBody", "Lkotlin/Function0;", "notifyNetworkHeaderListeners", "isUserSwitchFlush", "u", "(Lcom/clevertap/android/sdk/events/EventGroup;Ll/cpe0;Lkotlin/jvm/functions/Function0;Z)Z", "Lcom/clevertap/android/sdk/network/EndpointId;", "endpointId", ResourceDirection.f39656v, "(Ll/cpe0;Lcom/clevertap/android/sdk/network/EndpointId;)V", "queueHeader", "e", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/network/EndpointId;)V", "body", "f", "(Lcom/clevertap/android/sdk/events/EventGroup;Ll/cpe0;)Ll/j5d0;", "D", "(Ll/cpe0;)Ll/j5d0;", "B", "p", "logTag", "q", "(Ll/j5d0;Ljava/lang/String;)V", "m", "isFullResponse", "n", "(Ll/j5d0;ZLkotlin/jvm/functions/Function0;Z)Z", "o", "g", "(Ll/cpe0;)Z", "Lorg/json/JSONArray;", "queue", BaseSei.f14624X, "(Lorg/json/JSONArray;)V", "listenerKey", "w", "(Ljava/lang/String;)V", "domainName", "E", "", com.tencent.connect.common.Constants.f58037TS, "F", "(I)V", "spikyDomainName", "I", BLiveButtonType.mute, "muteExpiryMs", "G", "(ZLjava/lang/Long;)V", "Ll/wj20;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, Constants.INAPP_DATA_TAG, "(Ll/wj20;)V", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/String;Z)V", "k", "()I", "Ljava/lang/Runnable;", "handshakeSuccessCallback", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/clevertap/android/sdk/events/EventGroup;Ljava/lang/Runnable;)V", Constants.KEY_T, "(Lcom/clevertap/android/sdk/events/EventGroup;)Z", BaseSei.f14626Z, c4s.C_ZONE, "(Landroid/content/Context;Lcom/clevertap/android/sdk/events/EventGroup;Lorg/json/JSONArray;Ljava/lang/String;Z)Z", "url", "h", "c", "a", "Landroid/content/Context;", "b", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/uzd;", "Ll/bu9;", "Ll/w36;", "Ll/bj2;", "Ll/ch2;", "Ll/byb;", "Ll/sj20;", "j", "Ll/t1;", "Ll/tk20;", "Ll/hxb0;", "Ll/q95;", "Ll/axl;", "responseFailureCount", "networkRetryCount", "minDelayFrequency", "", "Ljava/util/List;", "mNetworkHeadersListeners", "currentRequestTimestamp", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1319b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final uzd deviceInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final w36 controllerManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final bj2 databaseManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ch2 callbackManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final byb ctApiWrapper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final sj20 encryptionManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final C20206t1 arpResponse;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final tk20 networkRepo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final hxb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final q95 cleverTapResponseHandler;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int responseFailureCount;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int networkRetryCount;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int minDelayFrequency;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final List<wj20> mNetworkHeadersListeners;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.b$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5448a;

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
            f5448a = iArr;
        }
    }

    public C1319b(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull uzd uzdVar, @NotNull bu9 bu9Var, @NotNull w36 w36Var, @NotNull bj2 bj2Var, @NotNull ch2 ch2Var, @NotNull byb bybVar, @NotNull sj20 sj20Var, @NotNull C20206t1 c20206t1, @NotNull tk20 tk20Var, @NotNull hxb0 hxb0Var, @NotNull q95 q95Var, @NotNull axl axlVar) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        uzdVar.getClass();
        bu9Var.getClass();
        w36Var.getClass();
        bj2Var.getClass();
        ch2Var.getClass();
        bybVar.getClass();
        sj20Var.getClass();
        c20206t1.getClass();
        tk20Var.getClass();
        hxb0Var.getClass();
        q95Var.getClass();
        axlVar.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.deviceInfo = uzdVar;
        this.coreMetaData = bu9Var;
        this.controllerManager = w36Var;
        this.databaseManager = bj2Var;
        this.callbackManager = ch2Var;
        this.ctApiWrapper = bybVar;
        this.encryptionManager = sj20Var;
        this.arpResponse = c20206t1;
        this.networkRepo = tk20Var;
        this.queueHeaderBuilder = hxb0Var;
        this.cleverTapResponseHandler = q95Var;
        this.logger = axlVar;
        this.mNetworkHeadersListeners = new ArrayList();
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    private final void m6872A(j5d0 response) {
        String strM143518m = response.m143518m("X-WZRK-RD");
        Logger.m5927v("Getting domain from header - " + strM143518m);
        if (strM143518m == null || StringsKt.m94329e0(strM143518m)) {
            return;
        }
        String strM143518m2 = response.m143518m("X-WZRK-SPIKY-RD");
        Logger.m5927v("Getting spiky domain from header - " + strM143518m2);
        m6878H(this, false, null, 2, null);
        m6875E(strM143518m);
        Logger.m5927v("Setting spiky domain from header as -" + strM143518m2);
        if (strM143518m2 == null) {
            m6879I(strM143518m);
        } else {
            m6879I(strM143518m2);
        }
    }

    /* JADX INFO: renamed from: B */
    private final j5d0 m6873B(cpe0 body) {
        return this.ctApiWrapper.m106993b().m217703n(body.toString());
    }

    /* JADX INFO: renamed from: D */
    private final j5d0 m6874D(cpe0 body) throws JSONException {
        if (this.config.isEncryptionInTransitEnabled() && !this.coreMetaData.m106449I()) {
            m1f m1fVarM186053c = this.encryptionManager.m186053c(body.toString());
            String strM186054d = this.encryptionManager.m186054d();
            if (m1fVarM186053c instanceof n1f) {
                n1f n1fVar = (n1f) m1fVarM186053c;
                String data = n1fVar.getData();
                strM186054d.getClass();
                String strM143128a = new j1f(data, strM186054d, n1fVar.getIv()).m143128a();
                this.logger.verbose(this.config.getAccountId(), "Encrypted Request = " + strM143128a);
                return this.ctApiWrapper.m106993b().m217706q(strM143128a, true);
            }
            this.logger.verbose(this.config.getAccountId(), "Normal Request cause encryption failed = " + body);
        }
        return yxb.m217694r(this.ctApiWrapper.m106993b(), body.toString(), false, 2, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    private final void m6875E(String domainName) {
        this.logger.verbose(this.config.getAccountId(), "Setting domain to " + domainName);
        this.networkRepo.m191497l(domainName);
        this.ctApiWrapper.m106993b().m217707s(domainName);
        this.callbackManager.mo96524r();
    }

    /* JADX INFO: renamed from: F */
    private final void m6876F(int ts) {
        if (this.networkRepo.m191490e() > 0) {
            return;
        }
        this.networkRepo.m191498m(ts);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    private final void m6877G(boolean mute, Long muteExpiryMs) {
        if (!mute) {
            this.networkRepo.m191501p(false);
            return;
        }
        tk20 tk20Var = this.networkRepo;
        if (muteExpiryMs != null) {
            tk20Var.m191500o(muteExpiryMs.longValue());
        } else {
            tk20Var.m191501p(true);
        }
        this.networkRepo.m191497l(null);
        ru3.m183186c(this.config).m187990d().m7000g("CommsManager#setMuted", new Callable() { // from class: l.lk20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1319b.m6882b(this.f132430a);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m6878H(C1319b c1319b, boolean z, Long l2, int i, Object obj) {
        if ((i & 2) != 0) {
            l2 = null;
        }
        c1319b.m6877G(z, l2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    private final void m6879I(String spikyDomainName) {
        this.logger.verbose(this.config.getAccountId(), "Setting spiky domain to " + spikyDomainName);
        this.networkRepo.m191502q(spikyDomainName);
        this.ctApiWrapper.m106993b().m217708t(spikyDomainName);
    }

    /* JADX INFO: renamed from: J */
    private final boolean m6880J(j5d0 response) {
        String string;
        String strM143518m = response.m143518m("X-WZRK-MUTE");
        if (strM143518m != null && (string = StringsKt.m94324Z0(strM143518m).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                if (Intrinsics.m88377d(string, "true")) {
                    m6877G(true, m6897y(response));
                    return true;
                }
                m6878H(this, false, null, 2, null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6881a(C1319b c1319b, cpe0 cpe0Var, EndpointId endpointId) {
        c1319b.getClass();
        cpe0Var.getClass();
        endpointId.getClass();
        c1319b.m6894v(cpe0Var, endpointId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6882b(C1319b c1319b) {
        c1319b.getClass();
        c1319b.databaseManager.mo104582b(c1319b.context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private final void m6883e(JSONObject queueHeader, EndpointId endpointId) {
        if (queueHeader != null) {
            Iterator<wj20> it = this.mNetworkHeadersListeners.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectMo184259a = it.next().mo184259a(endpointId);
                if (jSONObjectMo184259a != null) {
                    kx3.m151786g(queueHeader, jSONObjectMo184259a);
                }
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    private final j5d0 m6884f(EventGroup eventGroup, cpe0 body) {
        int i = b.f5448a[eventGroup.ordinal()];
        if (i == 1) {
            return this.ctApiWrapper.m106993b().m217695e(body);
        }
        if (i == 2) {
            return m6874D(body);
        }
        if (i == 3) {
            return m6873B(body);
        }
        nbr.m162172a();
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m6885g(cpe0 body) {
        int length = body.getQueue().length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = body.getQueue().getJSONObject(i);
                if (Intrinsics.m88377d(NotificationCompat.CATEGORY_EVENT, jSONObject.getString("type"))) {
                    String string = jSONObject.getString(Constants.KEY_EVT_NAME);
                    if (Intrinsics.m88377d(Constants.APP_LAUNCHED_EVENT, string) || Intrinsics.m88377d(Constants.WZRK_FETCH, string)) {
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
    private final JSONObject m6886l(String caller) {
        return this.queueHeaderBuilder.m137579s(caller);
    }

    @WorkerThread
    /* JADX INFO: renamed from: m */
    private final boolean m6887m(j5d0 response) {
        if (!response.m143519n()) {
            this.logger.info(this.config.getAccountId(), "Received error response code: " + response.getCode());
            return false;
        }
        if (m6899c(response) || m6880J(response)) {
            return false;
        }
        m6872A(response);
        this.logger.debug(this.config.getAccountId(), "Push Impressions sent successfully");
        this.networkRepo.m191499n(m6903j());
        m6876F(m6903j());
        this.logger.verbose(this.config.getAccountId(), "Processing response : " + kx3.m151803x(response.m143520q()));
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    private final boolean m6888n(j5d0 response, boolean isFullResponse, Function0<Unit> notifyNetworkHeaderListeners, boolean isUserSwitchFlush) {
        if (!response.m143519n()) {
            m6889o(response);
            return false;
        }
        if (m6899c(response) || m6880J(response)) {
            return false;
        }
        this.coreMetaData.m106462Y();
        m6872A(response);
        notifyNetworkHeaderListeners.invoke();
        this.logger.debug(this.config.getAccountId(), "Queue sent successfully");
        this.networkRepo.m191499n(m6903j());
        m6876F(m6903j());
        String strM143520q = response.m143520q();
        JSONObject jSONObjectM151803x = kx3.m151803x(strM143520q);
        this.logger.verbose(this.config.getAccountId(), "Processing response : " + jSONObjectM151803x);
        if (strM143520q != null && !StringsKt.m94329e0(strM143520q) && jSONObjectM151803x != null) {
            if (Boolean.parseBoolean(response.m143518m("X-CleverTap-Encryption-Enabled"))) {
                m1f m1fVarM186052b = this.encryptionManager.m186052b(strM143520q);
                if (m1fVarM186052b instanceof k1f) {
                    this.logger.verbose(this.config.getAccountId(), "Failed to decrypt response");
                    return false;
                }
                if (!(m1fVarM186052b instanceof n1f)) {
                    nbr.m162172a();
                    return false;
                }
                strM143520q = ((n1f) m1fVarM186052b).getData();
                jSONObjectM151803x = kx3.m151803x(strM143520q);
                this.logger.verbose(this.config.getAccountId(), "Decrypted response = " + strM143520q);
            }
            this.cleverTapResponseHandler.m175834a(isFullResponse, jSONObjectM151803x, strM143520q, isUserSwitchFlush);
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private final void m6889o(j5d0 response) {
        this.logger.info(this.config.getAccountId(), "Received error response code: " + response.getCode());
        int code = response.getCode();
        if (code == 402) {
            this.logger.verbose(this.config.getAccountId(), "Encryption in transit feature on not enabled for your account, please contact Clevertap support.");
            this.coreMetaData.m106478i0(true);
        } else {
            if (code != 419) {
                return;
            }
            this.logger.verbose(this.config.getAccountId(), "There is decryption failure on backend, disabling encrypted requests.");
            this.coreMetaData.m106478i0(true);
        }
    }

    /* JADX INFO: renamed from: p */
    private final boolean m6890p(j5d0 response) {
        if (!response.m143519n()) {
            m6891q(response, "Variables");
            return false;
        }
        String strM143520q = response.m143520q();
        JSONObject jSONObjectM151803x = kx3.m151803x(strM143520q);
        this.logger.verbose(this.config.getAccountId(), "Processing variables response : " + jSONObjectM151803x);
        this.arpResponse.mo98656a(jSONObjectM151803x, strM143520q, this.context);
        return true;
    }

    /* JADX INFO: renamed from: q */
    private final void m6891q(j5d0 response, String logTag) {
        int code = response.getCode();
        if (code != 400) {
            axl axlVar = this.logger;
            if (code == 401) {
                axlVar.info(logTag, "Unauthorized access from a non-test profile. Please mark this profile as a test profile from the CleverTap dashboard.");
                return;
            }
            axlVar.info(logTag, "Response code " + response.getCode() + " while syncing.");
            return;
        }
        JSONObject jSONObjectM151803x = kx3.m151803x(response.m143520q());
        if (jSONObjectM151803x == null || TextUtils.isEmpty(jSONObjectM151803x.optString("error"))) {
            this.logger.info(logTag, "Error while syncing.");
            return;
        }
        String strOptString = jSONObjectM151803x.optString("error");
        this.logger.info(logTag, "Error while syncing: " + strOptString);
    }

    /* JADX INFO: renamed from: r */
    private final boolean m6892r(String newDomain) {
        return !Intrinsics.m88377d(newDomain, this.networkRepo.m191489d());
    }

    /* JADX INFO: renamed from: u */
    private final boolean m6893u(EventGroup eventGroup, cpe0 requestBody, Function0<Unit> notifyNetworkHeaderListeners, boolean isUserSwitchFlush) {
        boolean zM6890p;
        j5d0 j5d0VarM6884f = m6884f(eventGroup, requestBody);
        int i = 0;
        try {
            this.networkRetryCount = 0;
            int i2 = b.f5448a[eventGroup.ordinal()];
            if (i2 == 1) {
                zM6890p = m6890p(j5d0VarM6884f);
            } else if (i2 == 2) {
                zM6890p = m6888n(j5d0VarM6884f, m6885g(requestBody), notifyNetworkHeaderListeners, isUserSwitchFlush);
                if (!zM6890p) {
                    i = this.responseFailureCount + 1;
                }
                this.responseFailureCount = i;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zM6890p = m6887m(j5d0VarM6884f);
                if (!zM6890p) {
                    i = this.responseFailureCount + 1;
                }
                this.responseFailureCount = i;
            }
            CloseableKt.m88293a(j5d0VarM6884f, null);
            return zM6890p;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(j5d0VarM6884f, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m6894v(cpe0 requestBody, EndpointId endpointId) {
        if (requestBody.getQueueHeader() != null) {
            Iterator<wj20> it = this.mNetworkHeadersListeners.iterator();
            while (it.hasNext()) {
                it.next().mo184260b(requestBody.getQueueHeader(), endpointId);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m6895w(String listenerKey) {
        NotificationRenderedListener notificationRenderedListenerM5811Q = CleverTapAPI.m5811Q(listenerKey);
        if (notificationRenderedListenerM5811Q != null) {
            this.logger.verbose(this.config.getAccountId(), "notifying listener " + listenerKey + ", that push impression sent successfully");
            notificationRenderedListenerM5811Q.onNotificationRendered(true);
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m6896x(JSONArray queue) throws JSONException {
        int length = queue.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObjectOptJSONObject = queue.getJSONObject(i).optJSONObject(Constants.KEY_EVT_DATA);
                if (jSONObjectOptJSONObject != null) {
                    String strM6983a = PushNotificationUtil.m6983a(jSONObjectOptJSONObject.optString(Constants.WZRK_ACCT_ID_KEY), jSONObjectOptJSONObject.optString(Constants.WZRK_PUSH_ID));
                    strM6983a.getClass();
                    m6895w(strM6983a);
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
    private final Long m6897y(j5d0 response) {
        String string;
        String strM143518m = response.m143518m("X-WZRK-MUTE-DURATION");
        if (strM143518m != null && (string = StringsKt.m94324Z0(strM143518m).toString()) != null) {
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
    public final boolean m6898C(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable JSONArray queue, @Nullable String caller, boolean isUserSwitchFlush) {
        context.getClass();
        eventGroup.getClass();
        if (queue != null && queue.length() > 0) {
            if (this.deviceInfo.m198762E() == null) {
                this.logger.debug(this.config.getAccountId(), "CleverTap Id not finalized, unable to send queue");
                return false;
            }
            final EndpointId endpointIdM6841a = EndpointId.INSTANCE.m6841a(eventGroup);
            JSONObject jSONObjectM6886l = m6886l(caller);
            m6883e(jSONObjectM6886l, endpointIdM6841a);
            final cpe0 cpe0Var = new cpe0(jSONObjectM6886l, queue);
            this.logger.debug(this.config.getAccountId(), "Send queue contains " + queue.length() + " items: " + cpe0Var);
            try {
                return m6893u(eventGroup, cpe0Var, new Function0() { // from class: l.kk20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C1319b.m6881a(this.f127163a, cpe0Var, endpointIdM6841a);
                    }
                }, isUserSwitchFlush);
            } catch (Exception e) {
                this.networkRetryCount++;
                this.responseFailureCount++;
                this.logger.debug(this.config.getAccountId(), "An exception occurred while sending the queue, will retry: ", e);
                if (this.callbackManager.mo96513g() != null) {
                    this.callbackManager.mo96513g().mo174218a(context);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6899c(@NotNull j5d0 response) {
        response.getClass();
        String strM143518m = response.m143518m("X-WZRK-RD");
        if (!kx3.m151795p(strM143518m) || !m6892r(strM143518m)) {
            return false;
        }
        m6875E(strM143518m);
        this.logger.debug(this.config.getAccountId(), "The domain has changed to " + strM143518m + ". The request will be retried shortly.");
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m6900d(@NotNull wj20 listener) {
        listener.getClass();
        this.mNetworkHeadersListeners.add(listener);
    }

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: h */
    public final JSONObject m6901h(@NotNull String url) {
        url.getClass();
        try {
            j5d0 j5d0VarM217696f = this.ctApiWrapper.m106993b().m217696f(url);
            try {
                if (j5d0VarM217696f.m143519n()) {
                    JSONObject jSONObjectM151803x = kx3.m151803x(j5d0VarM217696f.m143520q());
                    CloseableKt.m88293a(j5d0VarM217696f, null);
                    return jSONObjectM151803x;
                }
                this.logger.debug(this.config.getAccountId(), "Failed to fetch inapp payload. Response code: " + j5d0VarM217696f.getCode());
                CloseableKt.m88293a(j5d0VarM217696f, null);
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(j5d0VarM217696f, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.debug(this.config.getAccountId(), "An exception occurred while fetching the inapp payload from URL", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6902i(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable String caller, boolean isUserSwitchFlush) throws JSONException {
        C1319b c1319b;
        context.getClass();
        eventGroup.getClass();
        this.config.getLogger().verbose(this.config.getAccountId(), "Starting queue flush to CleverTap servers");
        boolean hasMore = true;
        int i = 0;
        while (hasMore) {
            gxb0 gxb0VarMo104584d = this.databaseManager.mo104584d(context, 50, eventGroup);
            if (gxb0VarMo104584d.m132818e()) {
                this.config.getLogger().verbose(this.config.getAccountId(), "No more events in queue");
                break;
            }
            JSONArray data = gxb0VarMo104584d.getData();
            int length = data.length();
            this.config.getLogger().verbose(this.config.getAccountId(), "Processing batch of " + length + " events (" + gxb0VarMo104584d.m132815b().size() + " from events, " + gxb0VarMo104584d.m132817d().size() + " from profile)");
            c1319b = this;
            Context context2 = context;
            EventGroup eventGroup2 = eventGroup;
            String str = caller;
            boolean z = isUserSwitchFlush;
            if (c1319b.m6898C(context2, eventGroup2, data, str, z)) {
                c1319b.controllerManager.m204750m(data, true);
                i += length;
                EventGroup eventGroup3 = EventGroup.PUSH_NOTIFICATION_VIEWED;
                bj2 bj2Var = c1319b.databaseManager;
                if (eventGroup2 == eventGroup3) {
                    bj2Var.mo104587g(context2, gxb0VarMo104584d.m132815b());
                    c1319b.m6896x(gxb0VarMo104584d.getData());
                } else {
                    bj2Var.mo104585e(context2, gxb0VarMo104584d.m132815b(), gxb0VarMo104584d.m132817d());
                }
                hasMore = gxb0VarMo104584d.getHasMore();
                this = c1319b;
                context = context2;
                eventGroup = eventGroup2;
                caller = str;
                isUserSwitchFlush = z;
            } else {
                c1319b.config.getLogger().verbose(c1319b.config.getAccountId(), "Failed to send batch - will retry later");
                c1319b.controllerManager.m204751n();
                c1319b.controllerManager.m204750m(data, false);
            }
            c1319b.config.getLogger().verbose(c1319b.config.getAccountId(), "Queue flush completed. Total events sent: " + i);
        }
        c1319b = this;
        c1319b.config.getLogger().verbose(c1319b.config.getAccountId(), "Queue flush completed. Total events sent: " + i);
    }

    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final int m6903j() {
        return this.ctApiWrapper.m106993b().getCurrentRequestTimestampSeconds();
    }

    /* JADX INFO: renamed from: k */
    public final int m6904k() {
        this.minDelayFrequency = this.networkRepo.m191492g(this.minDelayFrequency, this.networkRetryCount);
        this.logger.debug(this.config.getAccountId(), "Setting delay frequency to " + this.minDelayFrequency);
        return this.minDelayFrequency;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final void m6905s(@NotNull EventGroup eventGroup, @NotNull Runnable handshakeSuccessCallback) {
        eventGroup.getClass();
        handshakeSuccessCallback.getClass();
        this.responseFailureCount = 0;
        m6907z(eventGroup, handshakeSuccessCallback);
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final boolean m6906t(@NotNull EventGroup eventGroup) {
        eventGroup.getClass();
        boolean zM106994c = this.ctApiWrapper.m106994c(eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED);
        boolean z = this.responseFailureCount > 5;
        if (z) {
            m6875E(null);
        }
        return zM106994c || z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final void m6907z(@NotNull EventGroup eventGroup, @NotNull Runnable handshakeSuccessCallback) {
        eventGroup.getClass();
        handshakeSuccessCallback.getClass();
        try {
            j5d0 j5d0VarM217701l = this.ctApiWrapper.m106993b().m217701l(eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED);
            try {
                boolean zM143519n = j5d0VarM217701l.m143519n();
                axl axlVar = this.logger;
                if (zM143519n) {
                    axlVar.verbose(this.config.getAccountId(), "Received success from handshake :)");
                    if (m6880J(j5d0VarM217701l)) {
                        CloseableKt.m88293a(j5d0VarM217701l, null);
                        return;
                    } else {
                        m6872A(j5d0VarM217701l);
                        this.logger.verbose(this.config.getAccountId(), "We are not muted");
                        handshakeSuccessCallback.run();
                    }
                } else {
                    axlVar.verbose(this.config.getAccountId(), "Invalid HTTP status code received for handshake - " + j5d0VarM217701l.getCode());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(j5d0VarM217701l, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(j5d0VarM217701l, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to perform handshake!", e);
        }
    }

    public /* synthetic */ C1319b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, uzd uzdVar, bu9 bu9Var, w36 w36Var, bj2 bj2Var, ch2 ch2Var, byb bybVar, sj20 sj20Var, C20206t1 c20206t1, tk20 tk20Var, hxb0 hxb0Var, q95 q95Var, axl axlVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cleverTapInstanceConfig, uzdVar, bu9Var, w36Var, bj2Var, ch2Var, bybVar, sj20Var, c20206t1, tk20Var, hxb0Var, q95Var, (i & 8192) != 0 ? cleverTapInstanceConfig.getLogger() : axlVar);
    }
}

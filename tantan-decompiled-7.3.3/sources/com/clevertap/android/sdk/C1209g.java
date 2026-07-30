package com.clevertap.android.sdk;

import com.clevertap.android.sdk.cryption.InterfaceC1199c;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inbox.InboxV2Bridge;
import com.clevertap.android.sdk.network.C1319b;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.b5f;
import p153l.bj2;
import p153l.bu9;
import p153l.c4s;
import p153l.ch2;
import p153l.cob0;
import p153l.cqi0;
import p153l.duv;
import p153l.ex3;
import p153l.h6g0;
import p153l.ik2;
import p153l.k1l0;
import p153l.ksw;
import p153l.mg60;
import p153l.nw3;
import p153l.q0w;
import p153l.s3f;
import p153l.sk0;
import p153l.su3;
import p153l.u0l0;
import p153l.uzd;
import p153l.w36;
import p153l.wpm;
import p153l.xse0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bk\b\u0010\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bH\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bL\u0010]\u001a\u0004\bB\u0010^R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\bF\u0010aR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bT\u0010b\u001a\u0004\bJ\u0010cR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bN\u0010fR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bR\u0010iR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bY\u0010lR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bm\u0010oR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bd\u0010rR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b[\u0010s\u001a\u0004\bj\u0010tR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bD\u0010u\u001a\u0004\bv\u0010wR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bv\u0010x\u001a\u0004\by\u0010zR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010)\u001a\u00020(8\u0006¢\u0006\u000e\n\u0004\by\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010+\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010-\u001a\u00020,8\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010/\u001a\u00020.8\u0006¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b{\u0010\u008c\u0001R\u001b\u00101\u001a\u0002008\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u00103\u001a\u0002028\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u00105\u001a\u0002048\u0006¢\u0006\u000f\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0005\b_\u0010\u0097\u0001R\u001b\u00107\u001a\u0002068\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u0082\u0001\u0010\u009a\u0001R\u001b\u00109\u001a\u0002088\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010;\u001a\u00020:8\u0006¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010=\u001a\u00020<8\u0006¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\bg\u0010¥\u0001R\u001a\u0010?\u001a\u00020>8\u0006¢\u0006\u000f\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0005\bp\u0010¨\u0001¨\u0006©\u0001"}, m88121d2 = {"Lcom/clevertap/android/sdk/g;", "", "Lcom/clevertap/android/sdk/e;", "locationManager", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/bu9;", "coreMetaData", "Ll/bj2;", "databaseManager", "Ll/uzd;", "deviceInfo", "Ll/b5f;", "eventMediator", "Ll/duv;", "localDataStore", "Lcom/clevertap/android/sdk/b;", "activityLifeCycleManager", "Ll/sk0;", "analyticsManager", "Ll/ik2;", "baseEventQueueManager", "Ll/nw3;", "cTLockManager", "Ll/ch2;", "callbackManager", "Ll/w36;", "controllerManager", "Lcom/clevertap/android/sdk/inapp/InAppController;", "inAppController", "Ll/s3f;", "evaluationManager", "Ll/wpm;", "impressionManager", "Ll/q0w;", "loginController", "Ll/xse0;", "sessionManager", "Ll/u0l0;", "validationResultStack", "Ll/ksw;", "mainLooperHandler", "Lcom/clevertap/android/sdk/network/b;", "networkManager", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "Ll/cob0;", "pushProviders", "Ll/k1l0;", "varCache", "Ll/mg60;", "parser", "Lcom/clevertap/android/sdk/cryption/c;", "cryptHandler", "Ll/h6g0;", "storeRegistry", "Ll/cqi0;", "templatesManager", "Ll/ex3;", "cTVariables", "Ll/su3;", "executors", "Lcom/clevertap/android/sdk/inbox/InboxV2Bridge;", "inboxV2Bridge", "<init>", "(Lcom/clevertap/android/sdk/e;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/bu9;Ll/bj2;Ll/uzd;Ll/b5f;Ll/duv;Lcom/clevertap/android/sdk/b;Ll/sk0;Ll/ik2;Ll/nw3;Ll/ch2;Ll/w36;Lcom/clevertap/android/sdk/inapp/InAppController;Ll/s3f;Ll/wpm;Ll/q0w;Ll/xse0;Ll/u0l0;Ll/ksw;Lcom/clevertap/android/sdk/network/b;Lcom/clevertap/android/sdk/network/NetworkMonitor;Ll/cob0;Ll/k1l0;Ll/mg60;Lcom/clevertap/android/sdk/cryption/c;Ll/h6g0;Ll/cqi0;Ll/ex3;Ll/su3;Lcom/clevertap/android/sdk/inbox/InboxV2Bridge;)V", "a", "Lcom/clevertap/android/sdk/e;", "q", "()Lcom/clevertap/android/sdk/e;", "b", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "f", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "c", "Ll/bu9;", "h", "()Ll/bu9;", Constants.INAPP_DATA_TAG, "Ll/bj2;", "getDatabaseManager", "()Ll/bj2;", "e", "Ll/uzd;", "j", "()Ll/uzd;", "Ll/b5f;", "getEventMediator", "()Ll/b5f;", "g", "Ll/duv;", "p", "()Ll/duv;", "Lcom/clevertap/android/sdk/b;", "()Lcom/clevertap/android/sdk/b;", RXScreenCaptureService.KEY_INDEX, "Ll/sk0;", "()Ll/sk0;", "Ll/ik2;", "()Ll/ik2;", "k", "Ll/nw3;", "()Ll/nw3;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/ch2;", "()Ll/ch2;", "m", "Ll/w36;", "()Ll/w36;", "n", "Lcom/clevertap/android/sdk/inapp/InAppController;", "()Lcom/clevertap/android/sdk/inapp/InAppController;", "o", "Ll/s3f;", "()Ll/s3f;", "Ll/wpm;", "()Ll/wpm;", "Ll/q0w;", "r", "()Ll/q0w;", "Ll/xse0;", Constants.KEY_T, "()Ll/xse0;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/u0l0;", "getValidationResultStack", "()Ll/u0l0;", "Ll/ksw;", "getMainLooperHandler", "()Ll/ksw;", "u", "Lcom/clevertap/android/sdk/network/b;", "getNetworkManager", "()Lcom/clevertap/android/sdk/network/b;", ResourceDirection.f39656v, "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "getNetworkMonitor", "()Lcom/clevertap/android/sdk/network/NetworkMonitor;", "w", "Ll/cob0;", "()Ll/cob0;", BaseSei.f14624X, "Ll/k1l0;", "getVarCache", "()Ll/k1l0;", BaseSei.f14625Y, "Ll/mg60;", "getParser", "()Ll/mg60;", BaseSei.f14626Z, "Lcom/clevertap/android/sdk/cryption/c;", "()Lcom/clevertap/android/sdk/cryption/c;", "A", "Ll/h6g0;", "()Ll/h6g0;", "B", "Ll/cqi0;", "getTemplatesManager", "()Ll/cqi0;", c4s.C_ZONE, "Ll/ex3;", "getCTVariables", "()Ll/ex3;", "D", "Ll/su3;", "()Ll/su3;", "E", "Lcom/clevertap/android/sdk/inbox/InboxV2Bridge;", "()Lcom/clevertap/android/sdk/inbox/InboxV2Bridge;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class C1209g {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final h6g0 storeRegistry;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final cqi0 templatesManager;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final ex3 cTVariables;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final su3 executors;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final InboxV2Bridge inboxV2Bridge;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AbstractC1207e locationManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final bj2 databaseManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final uzd deviceInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final b5f eventMediator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final duv localDataStore;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final C1192b activityLifeCycleManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final sk0 analyticsManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ik2 baseEventQueueManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final nw3 cTLockManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ch2 callbackManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final w36 controllerManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final InAppController inAppController;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final s3f evaluationManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final wpm impressionManager;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final q0w loginController;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final xse0 sessionManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final u0l0 validationResultStack;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final ksw mainLooperHandler;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final C1319b networkManager;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final NetworkMonitor networkMonitor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final cob0 pushProviders;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final k1l0 varCache;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final mg60 parser;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC1199c cryptHandler;

    public C1209g(@NotNull AbstractC1207e abstractC1207e, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull bu9 bu9Var, @NotNull bj2 bj2Var, @NotNull uzd uzdVar, @NotNull b5f b5fVar, @NotNull duv duvVar, @NotNull C1192b c1192b, @NotNull sk0 sk0Var, @NotNull ik2 ik2Var, @NotNull nw3 nw3Var, @NotNull ch2 ch2Var, @NotNull w36 w36Var, @NotNull InAppController inAppController, @NotNull s3f s3fVar, @NotNull wpm wpmVar, @NotNull q0w q0wVar, @NotNull xse0 xse0Var, @NotNull u0l0 u0l0Var, @NotNull ksw kswVar, @NotNull C1319b c1319b, @NotNull NetworkMonitor networkMonitor, @NotNull cob0 cob0Var, @NotNull k1l0 k1l0Var, @NotNull mg60 mg60Var, @NotNull InterfaceC1199c interfaceC1199c, @NotNull h6g0 h6g0Var, @NotNull cqi0 cqi0Var, @NotNull ex3 ex3Var, @NotNull su3 su3Var, @NotNull InboxV2Bridge inboxV2Bridge) {
        abstractC1207e.getClass();
        cleverTapInstanceConfig.getClass();
        bu9Var.getClass();
        bj2Var.getClass();
        uzdVar.getClass();
        b5fVar.getClass();
        duvVar.getClass();
        c1192b.getClass();
        sk0Var.getClass();
        ik2Var.getClass();
        nw3Var.getClass();
        ch2Var.getClass();
        w36Var.getClass();
        inAppController.getClass();
        s3fVar.getClass();
        wpmVar.getClass();
        q0wVar.getClass();
        xse0Var.getClass();
        u0l0Var.getClass();
        kswVar.getClass();
        c1319b.getClass();
        networkMonitor.getClass();
        cob0Var.getClass();
        k1l0Var.getClass();
        mg60Var.getClass();
        interfaceC1199c.getClass();
        h6g0Var.getClass();
        cqi0Var.getClass();
        ex3Var.getClass();
        su3Var.getClass();
        inboxV2Bridge.getClass();
        this.locationManager = abstractC1207e;
        this.config = cleverTapInstanceConfig;
        this.coreMetaData = bu9Var;
        this.databaseManager = bj2Var;
        this.deviceInfo = uzdVar;
        this.eventMediator = b5fVar;
        this.localDataStore = duvVar;
        this.activityLifeCycleManager = c1192b;
        this.analyticsManager = sk0Var;
        this.baseEventQueueManager = ik2Var;
        this.cTLockManager = nw3Var;
        this.callbackManager = ch2Var;
        this.controllerManager = w36Var;
        this.inAppController = inAppController;
        this.evaluationManager = s3fVar;
        this.impressionManager = wpmVar;
        this.loginController = q0wVar;
        this.sessionManager = xse0Var;
        this.validationResultStack = u0l0Var;
        this.mainLooperHandler = kswVar;
        this.networkManager = c1319b;
        this.networkMonitor = networkMonitor;
        this.pushProviders = cob0Var;
        this.varCache = k1l0Var;
        this.parser = mg60Var;
        this.cryptHandler = interfaceC1199c;
        this.storeRegistry = h6g0Var;
        this.templatesManager = cqi0Var;
        this.cTVariables = ex3Var;
        this.executors = su3Var;
        this.inboxV2Bridge = inboxV2Bridge;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1192b getActivityLifeCycleManager() {
        return this.activityLifeCycleManager;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final sk0 getAnalyticsManager() {
        return this.analyticsManager;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ik2 getBaseEventQueueManager() {
        return this.baseEventQueueManager;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final nw3 getCTLockManager() {
        return this.cTLockManager;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ch2 getCallbackManager() {
        return this.callbackManager;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final CleverTapInstanceConfig getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final w36 getControllerManager() {
        return this.controllerManager;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final bu9 getCoreMetaData() {
        return this.coreMetaData;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC1199c getCryptHandler() {
        return this.cryptHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final uzd getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final s3f getEvaluationManager() {
        return this.evaluationManager;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final su3 getExecutors() {
        return this.executors;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final wpm getImpressionManager() {
        return this.impressionManager;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final InAppController getInAppController() {
        return this.inAppController;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final InboxV2Bridge getInboxV2Bridge() {
        return this.inboxV2Bridge;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final duv getLocalDataStore() {
        return this.localDataStore;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final AbstractC1207e getLocationManager() {
        return this.locationManager;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final q0w getLoginController() {
        return this.loginController;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final cob0 getPushProviders() {
        return this.pushProviders;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final xse0 getSessionManager() {
        return this.sessionManager;
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final h6g0 getStoreRegistry() {
        return this.storeRegistry;
    }
}

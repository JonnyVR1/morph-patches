package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapFactory;
import com.clevertap.android.sdk.cryption.C1174a;
import com.clevertap.android.sdk.cryption.C1175b;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.inapp.C1213a;
import com.clevertap.android.sdk.inapp.C1214b;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.delay.InAppScheduler;
import com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inbox.InboxDeleteCoordinator;
import com.clevertap.android.sdk.inbox.InboxV2Bridge;
import com.clevertap.android.sdk.inbox.InboxV2Fetcher;
import com.clevertap.android.sdk.network.C1296b;
import com.clevertap.android.sdk.network.ContentFetchManager;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.clevertap.android.sdk.network.fetch.InboxFetchCall;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C20092t1;
import p149l.a0c;
import p149l.afi;
import p149l.arm;
import p149l.ayf0;
import p149l.b84;
import p149l.cfi;
import p149l.chi0;
import p149l.cqm;
import p149l.crk0;
import p149l.csv;
import p149l.dpb0;
import p149l.drm;
import p149l.esk0;
import p149l.fqm;
import p149l.fw3;
import p149l.gmr;
import p149l.gqm;
import p149l.gtl;
import p149l.gwb;
import p149l.h4e;
import p149l.h860;
import p149l.hw3;
import p149l.hyd;
import p149l.ikg;
import p149l.iqm;
import p149l.isk0;
import p149l.jb20;
import p149l.jc20;
import p149l.krk0;
import p149l.kwb;
import p149l.l100;
import p149l.lpw;
import p149l.n2f;
import p149l.n85;
import p149l.n95;
import p149l.npm;
import p149l.nta0;
import p149l.nv3;
import p149l.nwb;
import p149l.ork0;
import p149l.ov3;
import p149l.p85;
import p149l.pjj;
import p149l.q920;
import p149l.qs9;
import p149l.qw0;
import p149l.r26;
import p149l.saj0;
import p149l.sgi;
import p149l.ske0;
import p149l.st3;
import p149l.t06;
import p149l.t4c;
import p149l.t4f;
import p149l.tc20;
import p149l.tom;
import p149l.tt3;
import p149l.tyv;
import p149l.tz0;
import p149l.tzb;
import p149l.unm;
import p149l.upk0;
import p149l.uw5;
import p149l.v260;
import p149l.vd90;
import p149l.vg2;
import p149l.vnm;
import p149l.vsd;
import p149l.vt3;
import p149l.vzb;
import p149l.wcb0;
import p149l.wei;
import p149l.wk0;
import p149l.wr5;
import p149l.wsd;
import p149l.wyv;
import p149l.x3f;
import p149l.yfb0;
import p149l.zhh0;
import p149l.zsd;
import p149l.zxf0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0017\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Lcom/clevertap/android/sdk/CleverTapFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "cleverTapInstanceConfig", "", "cleverTapID", "Lcom/clevertap/android/sdk/g;", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;)Lcom/clevertap/android/sdk/g;", "Ll/r26;", "controllerManager", Constants.KEY_CONFIG, "Ll/hyd;", "deviceInfo", "Ll/vg2;", "callbackManager", "Ll/wk0;", "analyticsManager", "", "m", "(Landroid/content/Context;Ll/r26;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/hyd;Ll/vg2;Ll/wk0;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CleverTapFactory {

    @NotNull
    public static final CleverTapFactory INSTANCE = new CleverTapFactory();

    private CleverTapFactory() {
    }

    /* JADX INFO: renamed from: a */
    public static Unit m5826a(hyd hydVar, r26 r26Var, CleverTapInstanceConfig cleverTapInstanceConfig, Context context, zxf0 zxf0Var, unm unmVar, tt3 tt3Var) {
        hydVar.getClass();
        r26Var.getClass();
        cleverTapInstanceConfig.getClass();
        zxf0Var.getClass();
        unmVar.getClass();
        tt3Var.getClass();
        String strM133539E = hydVar.m133539E();
        if (strM133539E != null && r26Var.m177574i() == null) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "Initializing InAppFC with device Id = ".concat(strM133539E));
            r26Var.m177586u(new tom(context, cleverTapInstanceConfig, strM133539E, zxf0Var, unmVar, tt3Var, n95.f137721a));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m5827b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NetworkMonitor networkMonitor) {
        cleverTapInstanceConfig.getClass();
        networkMonitor.getClass();
        FileResourceProvider.INSTANCE.m6503b(context, cleverTapInstanceConfig.getLogger(), networkMonitor);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static FileResourceProvider m5828c(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NetworkMonitor networkMonitor) {
        cleverTapInstanceConfig.getClass();
        networkMonitor.getClass();
        return FileResourceProvider.INSTANCE.m6503b(context, cleverTapInstanceConfig.getLogger(), networkMonitor);
    }

    /* JADX INFO: renamed from: d */
    public static tzb m5829d(a0c a0cVar, Context context) {
        a0cVar.getClass();
        return a0cVar.mo94410c(context);
    }

    /* JADX INFO: renamed from: e */
    public static Unit m5830e(hyd hydVar, zxf0 zxf0Var, C1289j c1289j, Context context, CryptHandler cryptHandler, CleverTapInstanceConfig cleverTapInstanceConfig, n2f n2fVar, vg2 vg2Var) {
        hydVar.getClass();
        zxf0Var.getClass();
        c1289j.getClass();
        cryptHandler.getClass();
        cleverTapInstanceConfig.getClass();
        n2fVar.getClass();
        vg2Var.getClass();
        if (hydVar.m133539E() != null) {
            if (zxf0Var.getInAppStore() == null) {
                String strM133539E = hydVar.m133539E();
                strM133539E.getClass();
                String accountId = cleverTapInstanceConfig.getAccountId();
                accountId.getClass();
                iqm iqmVarM6767j = c1289j.m6767j(context, cryptHandler, strM133539E, accountId);
                zxf0Var.m220795g(iqmVarM6767j);
                n2fVar.m157615B();
                vg2Var.mo100729c(iqmVarM6767j);
            }
            if (zxf0Var.getImpressionStore() == null) {
                String strM133539E2 = hydVar.m133539E();
                strM133539E2.getClass();
                String accountId2 = cleverTapInstanceConfig.getAccountId();
                accountId2.getClass();
                vnm vnmVarM6765h = c1289j.m6765h(context, strM133539E2, accountId2);
                zxf0Var.m220794f(vnmVarM6765h);
                vg2Var.mo100729c(vnmVarM6765h);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static String m5831f(hyd hydVar) {
        hydVar.getClass();
        return hydVar.m133536A();
    }

    /* JADX INFO: renamed from: g */
    public static Unit m5832g(Context context, r26 r26Var, CleverTapInstanceConfig cleverTapInstanceConfig, hyd hydVar, vg2 vg2Var, wk0 wk0Var) {
        r26Var.getClass();
        cleverTapInstanceConfig.getClass();
        hydVar.getClass();
        vg2Var.getClass();
        wk0Var.getClass();
        INSTANCE.m5838m(context, r26Var, cleverTapInstanceConfig, hydVar, vg2Var, wk0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m5833h(fw3 fw3Var) {
        fw3Var.getClass();
        fw3Var.m123509l();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static FileResourceProvider m5834i(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NetworkMonitor networkMonitor) {
        cleverTapInstanceConfig.getClass();
        networkMonitor.getClass();
        return FileResourceProvider.INSTANCE.m6503b(context, cleverTapInstanceConfig.getLogger(), networkMonitor);
    }

    /* JADX INFO: renamed from: j */
    public static Unit m5835j(a0c a0cVar, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CryptHandler cryptHandler, gwb gwbVar, isk0 isk0Var) {
        a0cVar.getClass();
        cleverTapInstanceConfig.getClass();
        cryptHandler.getClass();
        gwbVar.getClass();
        isk0Var.getClass();
        tzb tzbVarMo94410c = a0cVar.mo94410c(context);
        t4c t4cVar = new t4c(context, cleverTapInstanceConfig, tzbVarMo94410c);
        String accountId = cleverTapInstanceConfig.getAccountId();
        accountId.getClass();
        int encryptionLevel = cleverTapInstanceConfig.getEncryptionLevel();
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        new C1175b(accountId, encryptionLevel, logger, cryptHandler, gwbVar, t4cVar, isk0Var, tzbVarMo94410c).m5977k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m5836k(InAppScheduler inAppScheduler, a0c a0cVar, Context context, CryptHandler cryptHandler, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        inAppScheduler.getClass();
        a0cVar.getClass();
        cryptHandler.getClass();
        cleverTapInstanceConfig.getClass();
        gqm storageStrategy = inAppScheduler.getStorageStrategy();
        storageStrategy.getClass();
        wsd wsdVarM191174k = a0cVar.mo94410c(context).m191174k();
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        str.getClass();
        ((vsd) storageStrategy).m199854e(new zsd(wsdVarM191174k, cryptHandler, logger, str));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final C1186g m5837l(@Nullable final Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig, @Nullable String cleverTapID) {
        if (context == null || cleverTapInstanceConfig == null) {
            upk0.m194883a("This is invalid case and will not happen. Context/Config is null");
            return null;
        }
        final C1289j c1289jM6769a = C1289j.INSTANCE.m6769a();
        final String accountId = cleverTapInstanceConfig.getAccountId();
        accountId.getClass();
        final zxf0 zxf0Var = new zxf0(null, null, c1289jM6769a.m6768k(context, accountId), c1289jM6769a.m6766i(context, accountId), c1289jM6769a.m6764g(context, accountId));
        qs9 qs9Var = new qs9();
        ork0 ork0Var = new ork0();
        ov3 ov3Var = new ov3();
        lpw lpwVar = new lpw();
        final CleverTapInstanceConfig cleverTapInstanceConfig2 = new CleverTapInstanceConfig(cleverTapInstanceConfig);
        String accountId2 = cleverTapInstanceConfig2.getAccountId();
        accountId2.getClass();
        Logger logger = cleverTapInstanceConfig2.getLogger();
        logger.getClass();
        final NetworkMonitor networkMonitor = new NetworkMonitor(context, accountId2, logger);
        jc20 jc20Var = new jc20(context, cleverTapInstanceConfig2, null, null, 12, null);
        gtl gtlVar = new gtl(cleverTapInstanceConfig2);
        final tt3 tt3VarM185849c = st3.m185849c(cleverTapInstanceConfig2);
        fqm fqmVar = fqm.INSTANCE;
        Logger logger2 = cleverTapInstanceConfig2.getLogger();
        logger2.getClass();
        final InAppScheduler inAppSchedulerM122726b = fqm.m122726b(fqmVar, accountId, logger2, null, null, null, null, 60, null);
        Logger logger3 = cleverTapInstanceConfig2.getLogger();
        logger3.getClass();
        InAppScheduler inAppSchedulerM122727d = fqm.m122727d(fqmVar, accountId, logger3, null, null, null, 28, null);
        tt3VarM185849c.m190589a().m6946g("initFileResourceProvider", new Callable() { // from class: l.b85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5827b(context, cleverTapInstanceConfig2, networkMonitor);
            }
        });
        String accountId3 = cleverTapInstanceConfig2.getAccountId();
        accountId3.getClass();
        final gwb gwbVar = new gwb(context, accountId3);
        nv3 nv3Var = new nv3(gwbVar);
        String accountId4 = cleverTapInstanceConfig2.getAccountId();
        accountId4.getClass();
        C1174a c1174a = new C1174a(accountId4, nv3Var);
        final CryptHandler cryptHandler = new CryptHandler(gwbVar, c1174a);
        Logger logger4 = cleverTapInstanceConfig2.getLogger();
        logger4.getClass();
        vzb vzbVar = new vzb(cryptHandler, logger4, EncryptionLevel.INSTANCE.m5957a(cleverTapInstanceConfig2.getEncryptionLevel()));
        String accountId5 = cleverTapInstanceConfig2.getAccountId();
        accountId5.getClass();
        final isk0 isk0Var = new isk0(context, accountId5, vzbVar);
        String strM191187a = tzb.INSTANCE.m191187a(cleverTapInstanceConfig2);
        String accountId6 = cleverTapInstanceConfig2.getAccountId();
        accountId6.getClass();
        Logger logger5 = cleverTapInstanceConfig2.getLogger();
        logger5.getClass();
        final a0c a0cVar = new a0c(accountId6, logger5, strM191187a, ov3Var, gtlVar, vzbVar, new CleverTapFactory$getCoreState$databaseManager$1(jc20Var), new CleverTapFactory$getCoreState$databaseManager$2(jc20Var));
        tt3VarM185849c.m190592d().m6946g("migratingEncryption", new Callable() { // from class: l.e85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5835j(a0cVar, context, cleverTapInstanceConfig2, cryptHandler, gwbVar, isk0Var);
            }
        });
        tt3VarM185849c.m190592d().m6946g("loadInAppsDao", new Callable() { // from class: l.f85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5836k(inAppSchedulerM122726b, a0cVar, context, cryptHandler, cleverTapInstanceConfig2, accountId);
            }
        });
        final hyd hydVar = new hyd(context, cleverTapInstanceConfig2, cleverTapID, qs9Var, networkMonitor);
        hydVar.m133560g0(cleverTapID);
        crk0 crk0VarM108412n = crk0.INSTANCE.m108417a(new Function0() { // from class: l.g85
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5831f(hydVar);
            }
        }).m108412n();
        Logger logger6 = cleverTapInstanceConfig2.getLogger();
        logger6.getClass();
        krk0 krk0Var = new krk0(ork0Var, logger6);
        Logger logger7 = cleverTapInstanceConfig2.getLogger();
        logger7.getClass();
        csv csvVar = new csv(context, cleverTapInstanceConfig2, cryptHandler, hydVar, a0cVar, new nta0(logger7), new q920());
        x3f x3fVar = new x3f(cleverTapInstanceConfig2, qs9Var, jc20Var);
        C1185f.INSTANCE.m6019c(context, cleverTapInstanceConfig2);
        final b84 b84Var = new b84(cleverTapInstanceConfig2, hydVar);
        ske0 ske0Var = new ske0(cleverTapInstanceConfig2, qs9Var, crk0VarM108412n, csvVar);
        final r26 r26Var = new r26(context, cleverTapInstanceConfig2, ov3Var, b84Var, hydVar, a0cVar);
        TriggersMatcher triggersMatcher = new TriggersMatcher(csvVar);
        String accountId7 = cleverTapInstanceConfig2.getAccountId();
        accountId7.getClass();
        saj0 saj0Var = new saj0(context, accountId7, hydVar);
        final unm unmVar = new unm(zxf0Var, null, null, 6, null);
        gmr gmrVar = new gmr(unmVar, saj0Var);
        C1213a c1213a = new C1213a(context, cleverTapInstanceConfig2, new C1198i(cleverTapInstanceConfig2, b84Var.mo100743q(), null, null, null, 28, null), 0 == true ? 1 : 0, 8, null);
        chi0 chi0VarM106887a = chi0.INSTANCE.m106887a(cleverTapInstanceConfig2, zhh0.INSTANCE.m218797a(c1213a));
        final n2f n2fVar = new n2f(triggersMatcher, saj0Var, gmrVar, zxf0Var, chi0VarM106887a);
        tt3VarM185849c.m190589a().m6946g("initStores", new Callable() { // from class: l.h85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5830e(hydVar, zxf0Var, c1289jM6769a, context, cryptHandler, cleverTapInstanceConfig2, n2fVar, b84Var);
            }
        });
        tt3VarM185849c.m190589a().m6946g("initFCManager", new Callable() { // from class: l.i85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5826a(hydVar, r26Var, cleverTapInstanceConfig2, context, zxf0Var, unmVar, tt3VarM185849c);
            }
        });
        sgi.Companion companion = sgi.INSTANCE;
        Logger logger8 = cleverTapInstanceConfig2.getLogger();
        logger8.getClass();
        esk0 esk0Var = new esk0(cleverTapInstanceConfig2, context, companion.m184085b(context, logger8, zxf0Var), isk0Var);
        final fw3 fw3Var = new fw3(esk0Var);
        r26Var.m177584s(fw3Var);
        h860 h860Var = new h860(fw3Var);
        tt3VarM185849c.m190589a().m6946g("initCTVariables", new Callable() { // from class: l.j85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5833h(fw3Var);
            }
        });
        cqm cqmVar = new cqm(cleverTapInstanceConfig2, r26Var, false, zxf0Var, saj0Var, chi0VarM106887a, qs9Var);
        nwb nwbVar = new nwb(jc20Var, cleverTapInstanceConfig2, hydVar);
        jb20 jb20Var = new jb20(nv3Var, c1174a.m5958a());
        String accountId8 = cleverTapInstanceConfig2.getAccountId();
        accountId8.getClass();
        Logger logger9 = cleverTapInstanceConfig2.getLogger();
        logger9.getClass();
        tz0 tz0Var = new tz0(accountId8, logger9, hydVar);
        CleverTapFactory$getCoreState$queueHeaderBuilder$1 cleverTapFactory$getCoreState$queueHeaderBuilder$1 = new CleverTapFactory$getCoreState$queueHeaderBuilder$1(jc20Var);
        CleverTapFactory$getCoreState$queueHeaderBuilder$2 cleverTapFactory$getCoreState$queueHeaderBuilder$2 = new CleverTapFactory$getCoreState$queueHeaderBuilder$2(jc20Var);
        Logger logger10 = cleverTapInstanceConfig2.getLogger();
        logger10.getClass();
        dpb0 dpb0Var = new dpb0(context, cleverTapInstanceConfig2, qs9Var, r26Var, hydVar, tz0Var, gtlVar, a0cVar, ork0Var, cleverTapFactory$getCoreState$queueHeaderBuilder$1, cleverTapFactory$getCoreState$queueHeaderBuilder$2, logger10);
        C20092t1 c20092t1 = new C20092t1(cleverTapInstanceConfig2, crk0VarM108412n, r26Var, tz0Var);
        ContentFetchManager contentFetchManager = new ContentFetchManager(cleverTapInstanceConfig2, qs9Var, dpb0Var, nwbVar, 0, null, null, 112, null);
        t06 t06Var = new t06(cleverTapInstanceConfig2, contentFetchManager);
        drm drmVar = new drm(cleverTapInstanceConfig2, ov3Var, b84Var, r26Var, null, 16, null);
        p85 p85Var = new p85(context, CollectionsKt.listOf((Object[]) new n85[]{cqmVar, new l100(cleverTapInstanceConfig2, hydVar, gtlVar), c20092t1, new uw5(cleverTapInstanceConfig2), new arm(cleverTapInstanceConfig2, ov3Var, b84Var, r26Var), drmVar, new wcb0(context, cleverTapInstanceConfig2, a0cVar, b84Var, r26Var), new cfi(cleverTapInstanceConfig2, r26Var, b84Var), new h4e(cleverTapInstanceConfig2, b84Var, r26Var), new ikg(cleverTapInstanceConfig2, r26Var), new vd90(cleverTapInstanceConfig2, qs9Var, r26Var), new pjj(cleverTapInstanceConfig2, b84Var), t06Var}));
        contentFetchManager.m6781l(p85Var);
        C1296b c1296b = new C1296b(context, cleverTapInstanceConfig2, hydVar, qs9Var, r26Var, a0cVar, b84Var, nwbVar, jb20Var, c20092t1, jc20Var, dpb0Var, p85Var, null, 8192, null);
        wyv wyvVar = new wyv(context, cleverTapInstanceConfig2, cryptHandler);
        t4f t4fVar = new t4f(a0cVar, context, cleverTapInstanceConfig2, x3fVar, ske0Var, b84Var, lpwVar, hydVar, ork0Var, c1296b, qs9Var, ov3Var, csvVar, r26Var, wyvVar, networkMonitor);
        cqm cqmVar2 = new cqm(cleverTapInstanceConfig2, r26Var, true, zxf0Var, saj0Var, chi0VarM106887a, qs9Var);
        Logger logger11 = cleverTapInstanceConfig2.getLogger();
        logger11.getClass();
        npm npmVar = new npm(tt3VarM185849c, c1296b, cqmVar2, context, logger11);
        n95 n95Var = n95.f137721a;
        final wk0 wk0Var = new wk0(context, cleverTapInstanceConfig2, t4fVar, krk0Var, crk0VarM108412n, qs9Var, hydVar, b84Var, r26Var, ov3Var, n95Var, tt3VarM185849c, csvVar, npmVar);
        C1214b c1214b = new C1214b(zxf0Var, chi0VarM106887a, tt3VarM185849c, new Function0() { // from class: l.k85
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5834i(context, cleverTapInstanceConfig2, networkMonitor);
            }
        }, false, 16, null);
        c1296b.m6846d(n2fVar);
        v260 v260Var = new v260(new Function0() { // from class: l.l85
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5828c(context, cleverTapInstanceConfig2, networkMonitor);
            }
        });
        ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
        manifestInfo.getClass();
        String accountId9 = cleverTapInstanceConfig2.getAccountId();
        accountId9.getClass();
        InAppController inAppController = new InAppController(context, cleverTapInstanceConfig2, tt3VarM185849c, r26Var, b84Var, wk0Var, qs9Var, manifestInfo, hydVar, new ayf0(zxf0Var, accountId9), n2fVar, chi0VarM106887a, c1213a, c1214b, inAppSchedulerM122726b, inAppSchedulerM122727d, n95Var, networkMonitor, v260Var);
        r26Var.m177585t(inAppController);
        wr5 wr5Var = new wr5();
        qw0 qw0Var = new qw0();
        qw0Var.m176739b(inAppController.m6257I());
        wr5Var.m205119b(qw0Var);
        wr5Var.m205119b(new wei(b84Var));
        b84Var.mo100748v(wr5Var);
        tt3VarM185849c.m190589a().m6946g("initFeatureFlags", new Callable() { // from class: l.c85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5832g(context, r26Var, cleverTapInstanceConfig2, hydVar, b84Var, wk0Var);
            }
        });
        C1197h c1197h = new C1197h(context, cleverTapInstanceConfig2, qs9Var, t4fVar);
        yfb0 yfb0VarM214498I = yfb0.m214498I(context, cleverTapInstanceConfig2, a0cVar, ork0Var, wk0Var, r26Var, new hw3(context, cleverTapInstanceConfig2), n95Var);
        yfb0VarM214498I.getClass();
        tc20 tc20Var = new tc20(null, 1, 0 == true ? 1 : 0);
        kwb kwbVarM161866b = nwbVar.m161866b();
        String packageName = context.getPackageName();
        packageName.getClass();
        Logger logger12 = cleverTapInstanceConfig2.getLogger();
        logger12.getClass();
        InboxFetchCall inboxFetchCall = new InboxFetchCall(kwbVarM161866b, dpb0Var, qs9Var, packageName, logger12, null, null, 96, null);
        afi afiVar = new afi(Constants.INBOX_V2_THROTTLE_WINDOW_MS, null, 2, null);
        Logger logger13 = cleverTapInstanceConfig2.getLogger();
        logger13.getClass();
        InboxV2Bridge inboxV2Bridge = new InboxV2Bridge(new InboxV2Fetcher(inboxFetchCall, afiVar, drmVar, logger13), tc20Var);
        kwb kwbVarM161866b2 = nwbVar.m161866b();
        Function0 function0 = new Function0() { // from class: l.d85
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5829d(a0cVar, context);
            }
        };
        String packageName2 = context.getPackageName();
        packageName2.getClass();
        Logger logger14 = cleverTapInstanceConfig2.getLogger();
        logger14.getClass();
        r26Var.m177587v(new InboxDeleteCoordinator(tc20Var, kwbVarM161866b2, dpb0Var, function0, qs9Var, packageName2, logger14, null, null, 384, null));
        return new C1186g(c1197h, cleverTapInstanceConfig2, qs9Var, a0cVar, hydVar, x3fVar, csvVar, new C1169b(context, cleverTapInstanceConfig2, wk0Var, qs9Var, ske0Var, yfb0VarM214498I, b84Var, inAppController, t4fVar, tt3VarM185849c, n95Var, inboxV2Bridge), wk0Var, t4fVar, ov3Var, b84Var, r26Var, inAppController, n2fVar, unmVar, new tyv(context, cleverTapInstanceConfig2, hydVar, ork0Var, t4fVar, wk0Var, qs9Var, r26Var, ske0Var, csvVar, b84Var, a0cVar, ov3Var, wyvVar, contentFetchManager, inboxV2Bridge), ske0Var, ork0Var, lpwVar, c1296b, networkMonitor, yfb0VarM214498I, esk0Var, h860Var, cryptHandler, zxf0Var, chi0VarM106887a, fw3Var, tt3VarM185849c, inboxV2Bridge);
    }

    /* JADX INFO: renamed from: m */
    private final void m5838m(Context context, r26 controllerManager, CleverTapInstanceConfig config, hyd deviceInfo, vg2 callbackManager, wk0 analyticsManager) {
        config.getLogger().verbose(config.getAccountId() + ":async_deviceID", "Initializing Feature Flags with device Id = " + deviceInfo.m133539E());
        if (config.isAnalyticsOnly()) {
            config.getLogger().debug(config.getAccountId(), "Feature Flag is not enabled for this instance");
            return;
        }
        controllerManager.m177581p(vt3.m199914a(context, deviceInfo.m133539E(), config, callbackManager, analyticsManager));
        config.getLogger().verbose(config.getAccountId() + ":async_deviceID", "Feature Flags initialized");
    }
}

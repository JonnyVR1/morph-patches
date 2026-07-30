package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapFactory;
import com.clevertap.android.sdk.cryption.C1197a;
import com.clevertap.android.sdk.cryption.C1198b;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.inapp.C1236a;
import com.clevertap.android.sdk.inapp.C1237b;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.delay.InAppScheduler;
import com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inbox.InboxDeleteCoordinator;
import com.clevertap.android.sdk.inbox.InboxV2Bridge;
import com.clevertap.android.sdk.inbox.InboxV2Fetcher;
import com.clevertap.android.sdk.network.C1319b;
import com.clevertap.android.sdk.network.ContentFetchManager;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.clevertap.android.sdk.network.fetch.InboxFetchCall;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20206t1;
import p153l.a01;
import p153l.a94;
import p153l.ab60;
import p153l.alb0;
import p153l.at5;
import p153l.azk0;
import p153l.b5f;
import p153l.b6c;
import p153l.bu9;
import p153l.byb;
import p153l.ch2;
import p153l.cob0;
import p153l.cqi0;
import p153l.ctm;
import p153l.dl20;
import p153l.duv;
import p153l.esm;
import p153l.ex3;
import p153l.ftm;
import p153l.gqh0;
import p153l.gx3;
import p153l.h1c;
import p153l.h6g0;
import p153l.hor;
import p153l.hsm;
import p153l.hxb0;
import p153l.i0l0;
import p153l.i6g0;
import p153l.ia00;
import p153l.imj;
import p153l.ism;
import p153l.j1c;
import p153l.jud;
import p153l.k1l0;
import p153l.ksm;
import p153l.ksw;
import p153l.kud;
import p153l.mg60;
import p153l.mw3;
import p153l.n1c;
import p153l.nud;
import p153l.nw3;
import p153l.o1l0;
import p153l.o95;
import p153l.oa5;
import p153l.pji;
import p153l.prm;
import p153l.q0l0;
import p153l.q0w;
import p153l.q95;
import p153l.r1b0;
import p153l.ru3;
import p153l.s3f;
import p153l.shi;
import p153l.sj20;
import p153l.sk0;
import p153l.su3;
import p153l.tk20;
import p153l.u0l0;
import p153l.u0w;
import p153l.uu3;
import p153l.uvl;
import p153l.uxb;
import p153l.uzd;
import p153l.v5e;
import p153l.vqm;
import p153l.w36;
import p153l.whi;
import p153l.wjj0;
import p153l.wpm;
import p153l.x5f;
import p153l.xlg;
import p153l.xpm;
import p153l.xse0;
import p153l.xw0;
import p153l.y16;
import p153l.yh20;
import p153l.yhi;
import p153l.yxb;
import p153l.zl90;
import p153l.zx5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0017\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lcom/clevertap/android/sdk/CleverTapFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "cleverTapInstanceConfig", "", "cleverTapID", "Lcom/clevertap/android/sdk/g;", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;)Lcom/clevertap/android/sdk/g;", "Ll/w36;", "controllerManager", Constants.KEY_CONFIG, "Ll/uzd;", "deviceInfo", "Ll/ch2;", "callbackManager", "Ll/sk0;", "analyticsManager", "", "m", "(Landroid/content/Context;Ll/w36;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/uzd;Ll/ch2;Ll/sk0;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class CleverTapFactory {

    @NotNull
    public static final CleverTapFactory INSTANCE = new CleverTapFactory();

    private CleverTapFactory() {
    }

    /* JADX INFO: renamed from: a */
    public static Unit m5880a(uzd uzdVar, w36 w36Var, CleverTapInstanceConfig cleverTapInstanceConfig, Context context, h6g0 h6g0Var, wpm wpmVar, su3 su3Var) {
        uzdVar.getClass();
        w36Var.getClass();
        cleverTapInstanceConfig.getClass();
        h6g0Var.getClass();
        wpmVar.getClass();
        su3Var.getClass();
        String strM198762E = uzdVar.m198762E();
        if (strM198762E != null && w36Var.m204746i() == null) {
            cleverTapInstanceConfig.getLogger().verbose(cleverTapInstanceConfig.getAccountId() + ":async_deviceID", "Initializing InAppFC with device Id = ".concat(strM198762E));
            w36Var.m204758u(new vqm(context, cleverTapInstanceConfig, strM198762E, h6g0Var, wpmVar, su3Var, oa5.f145660a));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m5881b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NetworkMonitor networkMonitor) {
        cleverTapInstanceConfig.getClass();
        networkMonitor.getClass();
        FileResourceProvider.INSTANCE.m6557b(context, cleverTapInstanceConfig.getLogger(), networkMonitor);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static FileResourceProvider m5882c(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NetworkMonitor networkMonitor) {
        cleverTapInstanceConfig.getClass();
        networkMonitor.getClass();
        return FileResourceProvider.INSTANCE.m6557b(context, cleverTapInstanceConfig.getLogger(), networkMonitor);
    }

    /* JADX INFO: renamed from: d */
    public static h1c m5883d(n1c n1cVar, Context context) {
        n1cVar.getClass();
        return n1cVar.mo104583c(context);
    }

    /* JADX INFO: renamed from: e */
    public static Unit m5884e(uzd uzdVar, h6g0 h6g0Var, C1312j c1312j, Context context, CryptHandler cryptHandler, CleverTapInstanceConfig cleverTapInstanceConfig, s3f s3fVar, ch2 ch2Var) {
        uzdVar.getClass();
        h6g0Var.getClass();
        c1312j.getClass();
        cryptHandler.getClass();
        cleverTapInstanceConfig.getClass();
        s3fVar.getClass();
        ch2Var.getClass();
        if (uzdVar.m198762E() != null) {
            if (h6g0Var.getInAppStore() == null) {
                String strM198762E = uzdVar.m198762E();
                strM198762E.getClass();
                String accountId = cleverTapInstanceConfig.getAccountId();
                accountId.getClass();
                ksm ksmVarM6821j = c1312j.m6821j(context, cryptHandler, strM198762E, accountId);
                h6g0Var.m133707g(ksmVarM6821j);
                s3fVar.m184251B();
                ch2Var.mo96509c(ksmVarM6821j);
            }
            if (h6g0Var.getImpressionStore() == null) {
                String strM198762E2 = uzdVar.m198762E();
                strM198762E2.getClass();
                String accountId2 = cleverTapInstanceConfig.getAccountId();
                accountId2.getClass();
                xpm xpmVarM6819h = c1312j.m6819h(context, strM198762E2, accountId2);
                h6g0Var.m133706f(xpmVarM6819h);
                ch2Var.mo96509c(xpmVarM6819h);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static String m5885f(uzd uzdVar) {
        uzdVar.getClass();
        return uzdVar.m198759A();
    }

    /* JADX INFO: renamed from: g */
    public static Unit m5886g(Context context, w36 w36Var, CleverTapInstanceConfig cleverTapInstanceConfig, uzd uzdVar, ch2 ch2Var, sk0 sk0Var) {
        w36Var.getClass();
        cleverTapInstanceConfig.getClass();
        uzdVar.getClass();
        ch2Var.getClass();
        sk0Var.getClass();
        INSTANCE.m5892m(context, w36Var, cleverTapInstanceConfig, uzdVar, ch2Var, sk0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static Unit m5887h(ex3 ex3Var) {
        ex3Var.getClass();
        ex3Var.m123010l();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static FileResourceProvider m5888i(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, NetworkMonitor networkMonitor) {
        cleverTapInstanceConfig.getClass();
        networkMonitor.getClass();
        return FileResourceProvider.INSTANCE.m6557b(context, cleverTapInstanceConfig.getLogger(), networkMonitor);
    }

    /* JADX INFO: renamed from: j */
    public static Unit m5889j(n1c n1cVar, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CryptHandler cryptHandler, uxb uxbVar, o1l0 o1l0Var) {
        n1cVar.getClass();
        cleverTapInstanceConfig.getClass();
        cryptHandler.getClass();
        uxbVar.getClass();
        o1l0Var.getClass();
        h1c h1cVarMo104583c = n1cVar.mo104583c(context);
        b6c b6cVar = new b6c(context, cleverTapInstanceConfig, h1cVarMo104583c);
        String accountId = cleverTapInstanceConfig.getAccountId();
        accountId.getClass();
        int encryptionLevel = cleverTapInstanceConfig.getEncryptionLevel();
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        new C1198b(accountId, encryptionLevel, logger, cryptHandler, uxbVar, b6cVar, o1l0Var, h1cVarMo104583c).m6031k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m5890k(InAppScheduler inAppScheduler, n1c n1cVar, Context context, CryptHandler cryptHandler, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        inAppScheduler.getClass();
        n1cVar.getClass();
        cryptHandler.getClass();
        cleverTapInstanceConfig.getClass();
        ism storageStrategy = inAppScheduler.getStorageStrategy();
        storageStrategy.getClass();
        kud kudVarM133306k = n1cVar.mo104583c(context).m133306k();
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        str.getClass();
        ((jud) storageStrategy).m146977e(new nud(kudVarM133306k, cryptHandler, logger, str));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final C1209g m5891l(@Nullable final Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig, @Nullable String cleverTapID) {
        if (context == null || cleverTapInstanceConfig == null) {
            azk0.m101074a("This is invalid case and will not happen. Context/Config is null");
            return null;
        }
        final C1312j c1312jM6823a = C1312j.INSTANCE.m6823a();
        final String accountId = cleverTapInstanceConfig.getAccountId();
        accountId.getClass();
        final h6g0 h6g0Var = new h6g0(null, null, c1312jM6823a.m6822k(context, accountId), c1312jM6823a.m6820i(context, accountId), c1312jM6823a.m6818g(context, accountId));
        bu9 bu9Var = new bu9();
        u0l0 u0l0Var = new u0l0();
        nw3 nw3Var = new nw3();
        ksw kswVar = new ksw();
        final CleverTapInstanceConfig cleverTapInstanceConfig2 = new CleverTapInstanceConfig(cleverTapInstanceConfig);
        String accountId2 = cleverTapInstanceConfig2.getAccountId();
        accountId2.getClass();
        Logger logger = cleverTapInstanceConfig2.getLogger();
        logger.getClass();
        final NetworkMonitor networkMonitor = new NetworkMonitor(context, accountId2, logger);
        tk20 tk20Var = new tk20(context, cleverTapInstanceConfig2, null, null, 12, null);
        uvl uvlVar = new uvl(cleverTapInstanceConfig2);
        final su3 su3VarM183186c = ru3.m183186c(cleverTapInstanceConfig2);
        hsm hsmVar = hsm.INSTANCE;
        Logger logger2 = cleverTapInstanceConfig2.getLogger();
        logger2.getClass();
        final InAppScheduler inAppSchedulerM136986b = hsm.m136986b(hsmVar, accountId, logger2, null, null, null, null, 60, null);
        Logger logger3 = cleverTapInstanceConfig2.getLogger();
        logger3.getClass();
        InAppScheduler inAppSchedulerM136987d = hsm.m136987d(hsmVar, accountId, logger3, null, null, null, 28, null);
        su3VarM183186c.m187987a().m7000g("initFileResourceProvider", new Callable() { // from class: l.c95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5881b(context, cleverTapInstanceConfig2, networkMonitor);
            }
        });
        String accountId3 = cleverTapInstanceConfig2.getAccountId();
        accountId3.getClass();
        final uxb uxbVar = new uxb(context, accountId3);
        mw3 mw3Var = new mw3(uxbVar);
        String accountId4 = cleverTapInstanceConfig2.getAccountId();
        accountId4.getClass();
        C1197a c1197a = new C1197a(accountId4, mw3Var);
        final CryptHandler cryptHandler = new CryptHandler(uxbVar, c1197a);
        Logger logger4 = cleverTapInstanceConfig2.getLogger();
        logger4.getClass();
        j1c j1cVar = new j1c(cryptHandler, logger4, EncryptionLevel.INSTANCE.m6011a(cleverTapInstanceConfig2.getEncryptionLevel()));
        String accountId5 = cleverTapInstanceConfig2.getAccountId();
        accountId5.getClass();
        final o1l0 o1l0Var = new o1l0(context, accountId5, j1cVar);
        String strM133319a = h1c.INSTANCE.m133319a(cleverTapInstanceConfig2);
        String accountId6 = cleverTapInstanceConfig2.getAccountId();
        accountId6.getClass();
        Logger logger5 = cleverTapInstanceConfig2.getLogger();
        logger5.getClass();
        final n1c n1cVar = new n1c(accountId6, logger5, strM133319a, nw3Var, uvlVar, j1cVar, new CleverTapFactory$getCoreState$databaseManager$1(tk20Var), new CleverTapFactory$getCoreState$databaseManager$2(tk20Var));
        su3VarM183186c.m187990d().m7000g("migratingEncryption", new Callable() { // from class: l.f95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5889j(n1cVar, context, cleverTapInstanceConfig2, cryptHandler, uxbVar, o1l0Var);
            }
        });
        su3VarM183186c.m187990d().m7000g("loadInAppsDao", new Callable() { // from class: l.g95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5890k(inAppSchedulerM136986b, n1cVar, context, cryptHandler, cleverTapInstanceConfig2, accountId);
            }
        });
        final uzd uzdVar = new uzd(context, cleverTapInstanceConfig2, cleverTapID, bu9Var, networkMonitor);
        uzdVar.m198783g0(cleverTapID);
        i0l0 i0l0VarM138010n = i0l0.INSTANCE.m138015a(new Function0() { // from class: l.h95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5885f(uzdVar);
            }
        }).m138010n();
        Logger logger6 = cleverTapInstanceConfig2.getLogger();
        logger6.getClass();
        q0l0 q0l0Var = new q0l0(u0l0Var, logger6);
        Logger logger7 = cleverTapInstanceConfig2.getLogger();
        logger7.getClass();
        duv duvVar = new duv(context, cleverTapInstanceConfig2, cryptHandler, uzdVar, n1cVar, new r1b0(logger7), new yh20());
        b5f b5fVar = new b5f(cleverTapInstanceConfig2, bu9Var, tk20Var);
        C1208f.INSTANCE.m6073c(context, cleverTapInstanceConfig2);
        final a94 a94Var = new a94(cleverTapInstanceConfig2, uzdVar);
        xse0 xse0Var = new xse0(cleverTapInstanceConfig2, bu9Var, i0l0VarM138010n, duvVar);
        final w36 w36Var = new w36(context, cleverTapInstanceConfig2, nw3Var, a94Var, uzdVar, n1cVar);
        TriggersMatcher triggersMatcher = new TriggersMatcher(duvVar);
        String accountId7 = cleverTapInstanceConfig2.getAccountId();
        accountId7.getClass();
        wjj0 wjj0Var = new wjj0(context, accountId7, uzdVar);
        final wpm wpmVar = new wpm(h6g0Var, null, null, 6, null);
        hor horVar = new hor(wpmVar, wjj0Var);
        C1236a c1236a = new C1236a(context, cleverTapInstanceConfig2, new C1221i(cleverTapInstanceConfig2, a94Var.mo96523q(), null, null, null, 28, null), 0 == true ? 1 : 0, 8, null);
        cqi0 cqi0VarM111911a = cqi0.INSTANCE.m111911a(cleverTapInstanceConfig2, gqh0.INSTANCE.m131376a(c1236a));
        final s3f s3fVar = new s3f(triggersMatcher, wjj0Var, horVar, h6g0Var, cqi0VarM111911a);
        su3VarM183186c.m187987a().m7000g("initStores", new Callable() { // from class: l.i95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5884e(uzdVar, h6g0Var, c1312jM6823a, context, cryptHandler, cleverTapInstanceConfig2, s3fVar, a94Var);
            }
        });
        su3VarM183186c.m187987a().m7000g("initFCManager", new Callable() { // from class: l.j95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5880a(uzdVar, w36Var, cleverTapInstanceConfig2, context, h6g0Var, wpmVar, su3VarM183186c);
            }
        });
        pji.Companion companion = pji.INSTANCE;
        Logger logger8 = cleverTapInstanceConfig2.getLogger();
        logger8.getClass();
        k1l0 k1l0Var = new k1l0(cleverTapInstanceConfig2, context, companion.m172494b(context, logger8, h6g0Var), o1l0Var);
        final ex3 ex3Var = new ex3(k1l0Var);
        w36Var.m204756s(ex3Var);
        mg60 mg60Var = new mg60(ex3Var);
        su3VarM183186c.m187987a().m7000g("initCTVariables", new Callable() { // from class: l.k95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5887h(ex3Var);
            }
        });
        esm esmVar = new esm(cleverTapInstanceConfig2, w36Var, false, h6g0Var, wjj0Var, cqi0VarM111911a, bu9Var);
        byb bybVar = new byb(tk20Var, cleverTapInstanceConfig2, uzdVar);
        sj20 sj20Var = new sj20(mw3Var, c1197a.m6012a());
        String accountId8 = cleverTapInstanceConfig2.getAccountId();
        accountId8.getClass();
        Logger logger9 = cleverTapInstanceConfig2.getLogger();
        logger9.getClass();
        a01 a01Var = new a01(accountId8, logger9, uzdVar);
        CleverTapFactory$getCoreState$queueHeaderBuilder$1 cleverTapFactory$getCoreState$queueHeaderBuilder$1 = new CleverTapFactory$getCoreState$queueHeaderBuilder$1(tk20Var);
        CleverTapFactory$getCoreState$queueHeaderBuilder$2 cleverTapFactory$getCoreState$queueHeaderBuilder$2 = new CleverTapFactory$getCoreState$queueHeaderBuilder$2(tk20Var);
        Logger logger10 = cleverTapInstanceConfig2.getLogger();
        logger10.getClass();
        hxb0 hxb0Var = new hxb0(context, cleverTapInstanceConfig2, bu9Var, w36Var, uzdVar, a01Var, uvlVar, n1cVar, u0l0Var, cleverTapFactory$getCoreState$queueHeaderBuilder$1, cleverTapFactory$getCoreState$queueHeaderBuilder$2, logger10);
        C20206t1 c20206t1 = new C20206t1(cleverTapInstanceConfig2, i0l0VarM138010n, w36Var, a01Var);
        ContentFetchManager contentFetchManager = new ContentFetchManager(cleverTapInstanceConfig2, bu9Var, hxb0Var, bybVar, 0, null, null, 112, null);
        y16 y16Var = new y16(cleverTapInstanceConfig2, contentFetchManager);
        ftm ftmVar = new ftm(cleverTapInstanceConfig2, nw3Var, a94Var, w36Var, null, 16, null);
        q95 q95Var = new q95(context, CollectionsKt.listOf((Object[]) new o95[]{esmVar, new ia00(cleverTapInstanceConfig2, uzdVar, uvlVar), c20206t1, new zx5(cleverTapInstanceConfig2), new ctm(cleverTapInstanceConfig2, nw3Var, a94Var, w36Var), ftmVar, new alb0(context, cleverTapInstanceConfig2, n1cVar, a94Var, w36Var), new yhi(cleverTapInstanceConfig2, w36Var, a94Var), new v5e(cleverTapInstanceConfig2, a94Var, w36Var), new xlg(cleverTapInstanceConfig2, w36Var), new zl90(cleverTapInstanceConfig2, bu9Var, w36Var), new imj(cleverTapInstanceConfig2, a94Var), y16Var}));
        contentFetchManager.m6835l(q95Var);
        C1319b c1319b = new C1319b(context, cleverTapInstanceConfig2, uzdVar, bu9Var, w36Var, n1cVar, a94Var, bybVar, sj20Var, c20206t1, tk20Var, hxb0Var, q95Var, null, 8192, null);
        u0w u0wVar = new u0w(context, cleverTapInstanceConfig2, cryptHandler);
        x5f x5fVar = new x5f(n1cVar, context, cleverTapInstanceConfig2, b5fVar, xse0Var, a94Var, kswVar, uzdVar, u0l0Var, c1319b, bu9Var, nw3Var, duvVar, w36Var, u0wVar, networkMonitor);
        esm esmVar2 = new esm(cleverTapInstanceConfig2, w36Var, true, h6g0Var, wjj0Var, cqi0VarM111911a, bu9Var);
        Logger logger11 = cleverTapInstanceConfig2.getLogger();
        logger11.getClass();
        prm prmVar = new prm(su3VarM183186c, c1319b, esmVar2, context, logger11);
        oa5 oa5Var = oa5.f145660a;
        final sk0 sk0Var = new sk0(context, cleverTapInstanceConfig2, x5fVar, q0l0Var, i0l0VarM138010n, bu9Var, uzdVar, a94Var, w36Var, nw3Var, oa5Var, su3VarM183186c, duvVar, prmVar);
        C1237b c1237b = new C1237b(h6g0Var, cqi0VarM111911a, su3VarM183186c, new Function0() { // from class: l.l95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5888i(context, cleverTapInstanceConfig2, networkMonitor);
            }
        }, false, 16, null);
        c1319b.m6900d(s3fVar);
        ab60 ab60Var = new ab60(new Function0() { // from class: l.m95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5882c(context, cleverTapInstanceConfig2, networkMonitor);
            }
        });
        ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
        manifestInfo.getClass();
        String accountId9 = cleverTapInstanceConfig2.getAccountId();
        accountId9.getClass();
        InAppController inAppController = new InAppController(context, cleverTapInstanceConfig2, su3VarM183186c, w36Var, a94Var, sk0Var, bu9Var, manifestInfo, uzdVar, new i6g0(h6g0Var, accountId9), s3fVar, cqi0VarM111911a, c1236a, c1237b, inAppSchedulerM136986b, inAppSchedulerM136987d, oa5Var, networkMonitor, ab60Var);
        w36Var.m204757t(inAppController);
        at5 at5Var = new at5();
        xw0 xw0Var = new xw0();
        xw0Var.m213284b(inAppController.m6311I());
        at5Var.m100023b(xw0Var);
        at5Var.m100023b(new shi(a94Var));
        a94Var.mo96528v(at5Var);
        su3VarM183186c.m187987a().m7000g("initFeatureFlags", new Callable() { // from class: l.d95
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CleverTapFactory.m5886g(context, w36Var, cleverTapInstanceConfig2, uzdVar, a94Var, sk0Var);
            }
        });
        C1220h c1220h = new C1220h(context, cleverTapInstanceConfig2, bu9Var, x5fVar);
        cob0 cob0VarM111587I = cob0.m111587I(context, cleverTapInstanceConfig2, n1cVar, u0l0Var, sk0Var, w36Var, new gx3(context, cleverTapInstanceConfig2), oa5Var);
        cob0VarM111587I.getClass();
        dl20 dl20Var = new dl20(null, 1, 0 == true ? 1 : 0);
        yxb yxbVarM106993b = bybVar.m106993b();
        String packageName = context.getPackageName();
        packageName.getClass();
        Logger logger12 = cleverTapInstanceConfig2.getLogger();
        logger12.getClass();
        InboxFetchCall inboxFetchCall = new InboxFetchCall(yxbVarM106993b, hxb0Var, bu9Var, packageName, logger12, null, null, 96, null);
        whi whiVar = new whi(Constants.INBOX_V2_THROTTLE_WINDOW_MS, null, 2, null);
        Logger logger13 = cleverTapInstanceConfig2.getLogger();
        logger13.getClass();
        InboxV2Bridge inboxV2Bridge = new InboxV2Bridge(new InboxV2Fetcher(inboxFetchCall, whiVar, ftmVar, logger13), dl20Var);
        yxb yxbVarM106993b2 = bybVar.m106993b();
        Function0 function0 = new Function0() { // from class: l.e95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CleverTapFactory.m5883d(n1cVar, context);
            }
        };
        String packageName2 = context.getPackageName();
        packageName2.getClass();
        Logger logger14 = cleverTapInstanceConfig2.getLogger();
        logger14.getClass();
        w36Var.m204759v(new InboxDeleteCoordinator(dl20Var, yxbVarM106993b2, hxb0Var, function0, bu9Var, packageName2, logger14, null, null, 384, null));
        return new C1209g(c1220h, cleverTapInstanceConfig2, bu9Var, n1cVar, uzdVar, b5fVar, duvVar, new C1192b(context, cleverTapInstanceConfig2, sk0Var, bu9Var, xse0Var, cob0VarM111587I, a94Var, inAppController, x5fVar, su3VarM183186c, oa5Var, inboxV2Bridge), sk0Var, x5fVar, nw3Var, a94Var, w36Var, inAppController, s3fVar, wpmVar, new q0w(context, cleverTapInstanceConfig2, uzdVar, u0l0Var, x5fVar, sk0Var, bu9Var, w36Var, xse0Var, duvVar, a94Var, n1cVar, nw3Var, u0wVar, contentFetchManager, inboxV2Bridge), xse0Var, u0l0Var, kswVar, c1319b, networkMonitor, cob0VarM111587I, k1l0Var, mg60Var, cryptHandler, h6g0Var, cqi0VarM111911a, ex3Var, su3VarM183186c, inboxV2Bridge);
    }

    /* JADX INFO: renamed from: m */
    private final void m5892m(Context context, w36 controllerManager, CleverTapInstanceConfig config, uzd deviceInfo, ch2 callbackManager, sk0 analyticsManager) {
        config.getLogger().verbose(config.getAccountId() + ":async_deviceID", "Initializing Feature Flags with device Id = " + deviceInfo.m198762E());
        if (config.isAnalyticsOnly()) {
            config.getLogger().debug(config.getAccountId(), "Feature Flag is not enabled for this instance");
            return;
        }
        controllerManager.m204753p(uu3.m198148a(context, deviceInfo.m198762E(), config, callbackManager, analyticsManager));
        config.getLogger().verbose(config.getAccountId() + ":async_deviceID", "Feature Flags initialized");
    }
}

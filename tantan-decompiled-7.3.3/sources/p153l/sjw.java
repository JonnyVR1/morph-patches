package p153l;

import android.app.Application;
import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.p036mk.core.base.p039kv.DefaultMKKVImp;
import com.hellogroup.p036mk.core.configs.p040ua.MKCoreUserAgent;
import com.hellogroup.p036mk.core.impl.DefaultMKDownLoaderImpl;
import com.hellogroup.p036mk.core.utils.globalevent.MKEventManager;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.feed.data.Configs;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URI;
import java.net.URL;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u0015J\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b%\u0010\u0015J\u0019\u0010'\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0010H\u0007¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010\u0006J%\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u00104R\u0018\u00107\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00108R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R\u0016\u0010:\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00104¨\u0006;"}, m88121d2 = {"Ll/sjw;", "", "<init>", "()V", "", "p", "()Z", "o", "m", "Ll/g4k;", "e", "()Ll/g4k;", "h", "Ll/p7m;", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/p7m;", "", "pageUrl", "j", "(Ljava/lang/String;)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/String;", Constants.KEY_T, "r", "b", "a", "w", "", ResourceDirection.f39656v, "()I", "u", "Ll/yym;", "g", "()Ll/yym;", "Ll/i5m;", "k", "()Ll/i5m;", "c", "source", "f", "n", Constants.INAPP_DATA_TAG, "q", "Landroid/content/Context;", "context", "Ll/pjw;", Configs.TYPE, "Ll/qjw;", "mkCoreDelegate", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/content/Context;Ll/pjw;Ll/qjw;)V", "Z", "isInit", "Ll/pjw;", "mkCoreConfig", "Ll/qjw;", "showDebugTip", "textZoomEnable", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class sjw {
    public static final sjw INSTANCE = new sjw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public static boolean isInit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static pjw mkCoreConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static qjw mkCoreDelegate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static boolean showDebugTip;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static boolean textZoomEnable;

    private sjw() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m186312a() {
        to2 to2VarM172532b;
        Function0<String> function0M192001a;
        String strInvoke;
        pjw pjwVar = mkCoreConfig;
        return (pjwVar == null || (to2VarM172532b = pjwVar.getBaseCoreInfo()) == null || (function0M192001a = to2VarM172532b.m192001a()) == null || (strInvoke = function0M192001a.invoke()) == null) ? "" : strInvoke;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m186313b() {
        to2 to2VarM172532b;
        Function0<String> function0M192002b;
        String strInvoke;
        pjw pjwVar = mkCoreConfig;
        return (pjwVar == null || (to2VarM172532b = pjwVar.getBaseCoreInfo()) == null || (function0M192002b = to2VarM172532b.m192002b()) == null || (strInvoke = function0M192002b.invoke()) == null) ? "" : strInvoke;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m186314c() {
        return String.valueOf(System.currentTimeMillis()) + "" + new Random(123456L).nextInt();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m186315d() {
        pjw pjwVar = mkCoreConfig;
        return d8g0.m114836a(pjwVar != null ? pjwVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String() : null);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final g4k m186316e() {
        qjw qjwVar = mkCoreDelegate;
        if (qjwVar != null) {
            return qjwVar.getEventAdapter();
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m186317f(@Nullable String source) {
        try {
            Result.Companion companion = Result.INSTANCE;
            i5m i5mVarM186322k = m186322k();
            if (i5mVarM186322k == null || !i5mVarM186322k.mo115649d()) {
                String host = new URL(source).getHost();
                return host != null ? host : "";
            }
            String host2 = new URI(source).getHost();
            return host2 != null ? host2 : "";
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
            return "";
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final yym m186318g() {
        qjw qjwVar = mkCoreDelegate;
        if (qjwVar != null) {
            return qjwVar.getInterceptConfig();
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m186319h() {
        pjw pjwVar = mkCoreConfig;
        return C15493d.m94381x("momo", pjwVar != null ? pjwVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String() : null, true);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m186320i() {
        return m186321j(null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m186321j(@Nullable String pageUrl) {
        elw elwVarM172536f;
        pjw pjwVar = mkCoreConfig;
        if (pjwVar == null || (elwVarM172536f = pjwVar.getMkUA()) == null) {
            return "";
        }
        String strMo121294a = elwVarM172536f.mo121294a();
        return (strMo121294a == null || strMo121294a.length() == 0) ? MKCoreUserAgent.m18384a(elwVarM172536f.mo121295b(), pageUrl) : strMo121294a;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final i5m m186322k() {
        qjw qjwVar = mkCoreDelegate;
        if (qjwVar != null) {
            return qjwVar.getSafetyConfig();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final p7m m186323l() {
        qjw qjwVar = mkCoreDelegate;
        if (qjwVar != null) {
            return qjwVar.getPureWebLoadInterceptConfig();
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m186324m() {
        pjw pjwVar = mkCoreConfig;
        if (pjwVar != null) {
            return pjwVar.getIsDebug();
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final boolean m186325n() {
        return !bjw.INSTANCE.m104782b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m186326o() {
        pjw pjwVar = mkCoreConfig;
        if (pjwVar != null) {
            return pjwVar.getIsKeepLowSysContext();
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m186327p() {
        return showDebugTip;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m186328q() {
        return textZoomEnable;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m186329r() {
        to2 to2VarM172532b;
        Function0<String> function0M192003c;
        String strInvoke;
        pjw pjwVar = mkCoreConfig;
        return (pjwVar == null || (to2VarM172532b = pjwVar.getBaseCoreInfo()) == null || (function0M192003c = to2VarM172532b.m192003c()) == null || (strInvoke = function0M192003c.invoke()) == null) ? "" : strInvoke;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final String m186330t() {
        to2 to2VarM172532b;
        Function0<String> function0M192004d;
        String strInvoke;
        pjw pjwVar = mkCoreConfig;
        return (pjwVar == null || (to2VarM172532b = pjwVar.getBaseCoreInfo()) == null || (function0M192004d = to2VarM172532b.m192004d()) == null || (strInvoke = function0M192004d.invoke()) == null) ? "1" : strInvoke;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m186331u() {
        to2 to2VarM172532b;
        Function0<String> function0M192005e;
        String strInvoke;
        pjw pjwVar = mkCoreConfig;
        return (pjwVar == null || (to2VarM172532b = pjwVar.getBaseCoreInfo()) == null || (function0M192005e = to2VarM172532b.m192005e()) == null || (strInvoke = function0M192005e.invoke()) == null) ? "" : strInvoke;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final int m186332v() {
        to2 to2VarM172532b;
        Function0<Integer> function0M192006f;
        Integer numInvoke;
        pjw pjwVar = mkCoreConfig;
        if (pjwVar == null || (to2VarM172532b = pjwVar.getBaseCoreInfo()) == null || (function0M192006f = to2VarM172532b.m192006f()) == null || (numInvoke = function0M192006f.invoke()) == null) {
            return 0;
        }
        return numInvoke.intValue();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: w */
    public static final String m186333w() {
        to2 to2VarM172532b;
        Function0<String> function0M192007g;
        String strInvoke;
        pjw pjwVar = mkCoreConfig;
        return (pjwVar == null || (to2VarM172532b = pjwVar.getBaseCoreInfo()) == null || (function0M192007g = to2VarM172532b.m192007g()) == null || (strInvoke = function0M192007g.invoke()) == null) ? "" : strInvoke;
    }

    /* JADX INFO: renamed from: s */
    public final void m186334s(@NotNull Context context, @NotNull pjw configs, @NotNull qjw mkCoreDelegate2) {
        context.getClass();
        configs.getClass();
        mkCoreDelegate2.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            C0799b.m4641a("null cannot be cast to non-null type android.app.Application");
            return;
        }
        Application application = (Application) applicationContext;
        lv0.m155975e(context);
        mkCoreConfig = configs;
        mkCoreDelegate = mkCoreDelegate2;
        FepManager.INSTANCE.m17610a().m17598u(new ss8());
        jzv.m147735h(configs.getDebugPrintLog());
        ckw.m110407p(configs.getMkSdcardPath());
        ckw.m110406o(configs.getMkHomeDir());
        gkw.m130601b().m130603c(mkCoreDelegate2.getIHttpRequester());
        mkw.m158843f().m158851l(configs.getWriteDebugLogs());
        if (mkCoreDelegate2.getIMKKV() != null) {
            ikw.m140420b().m140424e(mkCoreDelegate2.getIMKKV());
        } else {
            ikw.m140420b().m140424e(new DefaultMKKVImp());
        }
        if (mkCoreDelegate2.getIMKDownloader() != null) {
            zjw.INSTANCE.m219987b(mkCoreDelegate2.getIMKDownloader());
        } else {
            zjw.INSTANCE.m219987b(new DefaultMKDownLoaderImpl());
        }
        if (mkCoreDelegate2.getIImageloader() != null) {
            hkw.m135646a().m135647b(mkCoreDelegate2.getIImageloader());
        }
        if (mkCoreDelegate2.getIMKDns() != null) {
            xjw.m211265a().m211268d(mkCoreDelegate2.getIMKDns());
        }
        if (mkCoreDelegate2.getCustomHostSwitch() != null) {
            tjw.INSTANCE.m191460b(mkCoreDelegate2.getCustomHostSwitch());
        }
        application.registerActivityLifecycleCallbacks(new bjw());
        MKEventManager.m18492b().m18493c(context);
        isInit = true;
    }
}

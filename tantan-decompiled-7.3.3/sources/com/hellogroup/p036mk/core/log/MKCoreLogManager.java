package com.hellogroup.p036mk.core.log;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.p036mk.core.log.core.MKLogReporter;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import com.hellogroup.p036mk.core.log.global.MKGlobalErrorType;
import com.hellogroup.p036mk.core.log.global.MKGlobalLog;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.d8g0;
import p153l.kt0;
import p153l.rjw;
import p153l.wo2;
import p153l.xkw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u00100R\u001a\u00104\u001a\u00020-8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0003\u001a\u0004\b2\u00100¨\u00065"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/MKCoreLogManager;", "", "<init>", "()V", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "reporter", "", "j", "(Lcom/hellogroup/mk/core/log/core/MKLogReporter;)V", "", "hashCode", "Ll/xkw;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ll/xkw;", "g", "h", "sessionKey", "c", "(Ljava/lang/String;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "message", "", "extraInfo", "", "errorCode", "", "throwable", Constants.INAPP_DATA_TAG, "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "", "k", "(Lcom/hellogroup/fep/base/FepLogLevel;)Z", "", "a", "Ljava/util/Set;", "CHECK_UPDATE_ERROR_CODES", "b", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "logReporter", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "logCache", "Lcom/hellogroup/mk/core/log/global/MKGlobalLog;", "Lkotlin/Lazy;", "f", "()Lcom/hellogroup/mk/core/log/global/MKGlobalLog;", "globalLog", "e", "global$annotations", "global", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKCoreLogManager {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static MKLogReporter logReporter;
    public static final MKCoreLogManager INSTANCE = new MKCoreLogManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Set<Integer> CHECK_UPDATE_ERROR_CODES = SetsKt.setOf((Object[]) new Integer[]{-3003, -3001, -3008});

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static ConcurrentHashMap<String, xkw> logCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Lazy globalLog = LazyKt__LazyJVMKt.m88118b(new Function0<MKGlobalLog>() { // from class: com.hellogroup.mk.core.log.MKCoreLogManager$globalLog$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MKGlobalLog invoke() {
            return new MKGlobalLog();
        }
    });

    private MKCoreLogManager() {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ MKLogReporter m18423a(MKCoreLogManager mKCoreLogManager) {
        MKLogReporter mKLogReporter = logReporter;
        if (mKLogReporter == null) {
            Intrinsics.m88391r("logReporter");
        }
        return mKLogReporter;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m18425c(@NotNull String sessionKey) {
        sessionKey.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m225066constructorimpl(logCache.remove(sessionKey));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m18426d(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        String str;
        Object obj;
        String strM151327o;
        moduleType.getClass();
        level.getClass();
        message.getClass();
        MKCoreLogManager mKCoreLogManager = INSTANCE;
        if (mKCoreLogManager.m18433k(level)) {
            int i = rjw.f163522a[moduleType.ordinal()];
            boolean z = true;
            if (i == 1) {
                mKCoreLogManager.m18428f().m18444B(message);
                return;
            }
            String str2 = "";
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = extraInfo != null ? extraInfo.get("bid") : null;
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str3 = (String) obj2;
                if (str3 != null && !StringsKt.m94329e0(str3)) {
                    z = false;
                }
                str = z ? null : str3;
                String str4 = str != null ? str : "";
                wo2.m207246c(mKCoreLogManager.m18428f(), MKGlobalErrorType.GREY_ERROR, MKLogSource.NATIVE, str4, "", extraInfo != null ? extraInfo : new HashMap(), d8g0.m114836a(str4), String.valueOf(errorCode), null, moduleType.name(), 128, null);
                return;
            }
            Object obj3 = extraInfo != null ? extraInfo.get("bid") : null;
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str5 = (String) obj3;
            if (str5 != null && !StringsKt.m94329e0(str5)) {
                z = false;
            }
            str = z ? null : str5;
            if (str == null) {
                str = "unknown";
            }
            if (CHECK_UPDATE_ERROR_CODES.contains(Integer.valueOf(errorCode))) {
                mKCoreLogManager.m18428f().m18445e(str, message, false, extraInfo);
                return;
            }
            if (extraInfo != null && (obj = extraInfo.get("repData")) != null && (strM151327o = kt0.m151327o(obj)) != null) {
                str2 = strM151327o;
            }
            mKCoreLogManager.m18428f().m18455r(str, str2, message, extraInfo);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final MKGlobalLog m18427e() {
        return INSTANCE.m18428f();
    }

    /* JADX INFO: renamed from: f */
    private final MKGlobalLog m18428f() {
        return (MKGlobalLog) globalLog.getValue();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m18429g() {
        for (Map.Entry<String, xkw> entry : logCache.entrySet()) {
            entry.getKey();
            entry.getValue().m211427B();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m18430h() {
        for (Map.Entry<String, xkw> entry : logCache.entrySet()) {
            entry.getKey();
            entry.getValue().m211426A();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final xkw m18431i(@NotNull String hashCode) {
        hashCode.getClass();
        ConcurrentHashMap<String, xkw> concurrentHashMap = logCache;
        xkw xkwVar = concurrentHashMap.get(hashCode);
        if (xkwVar == null) {
            MKLogReporter mKLogReporter = logReporter;
            if (mKLogReporter == null) {
                Intrinsics.m88391r("logReporter");
            }
            xkwVar = new xkw(mKLogReporter, "", "");
            xkw xkwVarPutIfAbsent = concurrentHashMap.putIfAbsent(hashCode, xkwVar);
            if (xkwVarPutIfAbsent != null) {
                xkwVar = xkwVarPutIfAbsent;
            }
        }
        return xkwVar;
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m18432j(@NotNull MKLogReporter reporter) {
        reporter.getClass();
        logReporter = reporter;
        INSTANCE.m18428f().m207248d(reporter);
    }

    /* JADX INFO: renamed from: k */
    private final boolean m18433k(FepLogLevel level) {
        if (logReporter == null) {
            return false;
        }
        int i = rjw.f163523b[level.ordinal()];
        if (i == 1) {
            MKLogReporter mKLogReporter = logReporter;
            if (mKLogReporter == null) {
                Intrinsics.m88391r("logReporter");
            }
            return mKLogReporter.getConfiguration().getInfoEnabled();
        }
        if (i == 2) {
            MKLogReporter mKLogReporter2 = logReporter;
            if (mKLogReporter2 == null) {
                Intrinsics.m88391r("logReporter");
            }
            return mKLogReporter2.getConfiguration().getWarningEnabled();
        }
        if (i != 3) {
            return false;
        }
        MKLogReporter mKLogReporter3 = logReporter;
        if (mKLogReporter3 == null) {
            Intrinsics.m88391r("logReporter");
        }
        return mKLogReporter3.getConfiguration().getEnabled();
    }
}

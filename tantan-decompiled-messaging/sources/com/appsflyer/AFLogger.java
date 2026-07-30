package com.appsflyer;

import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0016J3\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u000bJ'\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&JG\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010&J!\u00100\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b2\u00101J'\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010&R\u0019\u00108\u001a\u0006*\u000205058CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001098CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b:\u00107"}, m87232d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "msg", Constants.INAPP_DATA_TAG, "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "", "client", "registerClient", "([Lcom/appsflyer/internal/AFh1ySDK;)V", "unregisterClient", ResourceDirection.f38808v, "w", "Ljava/util/concurrent/ExecutorService;", "getRevenue", "Lkotlin/Lazy;", "getMonetizationNetwork", "", "getMediationNetwork", "LogLevel"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class AFLogger extends AFh1ySDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getRevenue = LazyKt__LazyJVMKt.m87229b(new Function0<Set<AFh1ySDK>>() { // from class: com.appsflyer.AFLogger.6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFh1ySDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    });

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getMonetizationNetwork = LazyKt__LazyJVMKt.m87229b(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, m87232d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", FirebaseAnalytics.Param.LEVEL, "I", "getLevel", "()I", Constraint.NONE, "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        @JvmName
        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(Function1 function1) {
        function1.getClass();
        Lazy lazy = getRevenue;
        Object value = lazy.getValue();
        value.getClass();
        synchronized (((Set) value)) {
            try {
                Object value2 = lazy.getValue();
                value2.getClass();
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFh1ySDK) it.next());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        debugLogMessage.getClass();
        INSTANCE.mo5182d(AFg1cSDK.OTHER, debugLogMessage, true);
    }

    @Deprecated
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.m93438e0(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, false, false, 120, null);
    }

    @Deprecated
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.m93438e0(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    @Deprecated
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage) {
        logMessage.getClass();
        INSTANCE.mo5184i(AFg1cSDK.OTHER, logMessage, true);
    }

    @Deprecated
    @JvmStatic
    public static final void afLogForce(@NotNull String logMessage) {
        logMessage.getClass();
        INSTANCE.force(AFg1cSDK.OTHER, logMessage);
    }

    @Deprecated
    @JvmStatic
    public static final void afRDLog(@NotNull String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.mo5185v(AFg1cSDK.OTHER, rdLogMessage, true);
    }

    @Deprecated
    @JvmStatic
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.mo5185v(AFg1cSDK.OTHER, rdLogMessage, false);
    }

    @Deprecated
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        warningLogMessage.getClass();
        AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFh1ySDK[] aFh1ySDKArr) {
        aFh1ySDKArr.getClass();
        Lazy lazy = getRevenue;
        Object value = lazy.getValue();
        value.getClass();
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            value2.getClass();
            ((Set) value2).removeAll(ArraysKt.toSet(aFh1ySDKArr));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: d */
    public final void mo5182d(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC0934a(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getCurrencyIso4217Code(@NotNull AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.mo5182d(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getCurrencyIso4217Code(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: e */
    public final void mo5183e(@NotNull final AFg1cSDK tag, @NotNull final String msg, @NotNull final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC0934a(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getCurrencyIso4217Code(@NotNull AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.mo5183e(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getCurrencyIso4217Code(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(@NotNull final AFg1cSDK tag, @NotNull final String msg) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC0934a(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMediationNetwork(@NotNull AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.force(tag, msg);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getMediationNetwork(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: i */
    public final void mo5184i(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC0934a(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMediationNetwork(@NotNull AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.mo5184i(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                getMediationNetwork(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    public final void registerClient(@NotNull final AFh1ySDK... client) {
        client.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.AFAdRevenueData(client);
            }
        });
    }

    public final void unregisterClient(@NotNull final AFh1ySDK... client) {
        client.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new Runnable() { // from class: com.appsflyer.b
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMonetizationNetwork(client);
            }
        });
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: v */
    public final void mo5185v(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC0934a(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFAdRevenueData(@NotNull AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.mo5185v(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                AFAdRevenueData(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: w */
    public final void mo5186w(@NotNull final AFg1cSDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC0934a(new Function1<AFh1ySDK, Unit>() { // from class: com.appsflyer.AFLogger.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFAdRevenueData(@NotNull AFh1ySDK aFh1ySDK) {
                aFh1ySDK.getClass();
                aFh1ySDK.mo5186w(tag, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFh1ySDK aFh1ySDK) {
                AFAdRevenueData(aFh1ySDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Deprecated
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        debugLogMessage.getClass();
        INSTANCE.mo5182d(AFg1cSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @Deprecated
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        logMessage.getClass();
        INSTANCE.mo5184i(AFg1cSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @Deprecated
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        warningLogMessage.getClass();
        INSTANCE.mo5186w(AFg1cSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    @Deprecated
    @JvmStatic
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        message.getClass();
        ex.getClass();
        AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @Deprecated
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.m93438e0(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, true, false, 64, null);
    }

    @Deprecated
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.m93438e0(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    @Deprecated
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.m93438e0(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFh1ySDK[] aFh1ySDKArr) {
        aFh1ySDKArr.getClass();
        Lazy lazy = getRevenue;
        Object value = lazy.getValue();
        value.getClass();
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            value2.getClass();
            CollectionsKt.addAll((Set) value2, aFh1ySDKArr);
            Unit unit = Unit.INSTANCE;
        }
    }
}

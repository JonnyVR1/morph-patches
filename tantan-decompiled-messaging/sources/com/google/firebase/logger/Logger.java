package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p069ss.bytertc.engine.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;
import p149l.qq3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b&\u0018\u0000 %2\u00020\u0001:\u0004$%&'B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ9\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0002\u0010 J;\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0012\b\u0002\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010 J9\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\"\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010#\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m87232d2 = {"Lcom/google/firebase/logger/Logger;", "", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getMinLevel", "()Lcom/google/firebase/logger/Logger$Level;", "setMinLevel", "(Lcom/google/firebase/logger/Logger$Level;)V", "getTag", "()Ljava/lang/String;", BuildConfig.BUILD_TYPE, "", "format", "args", "", "throwable", "", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "msg", "error", BaseSei.INFO, "log", FirebaseAnalytics.Param.LEVEL, "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "logIfAble", "verbose", "warn", "AndroidLogger", "Companion", "FakeLogger", "Level", "com.google.firebase-firebase-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;

    @NotNull
    private Level minLevel;

    @NotNull
    private final String tag;

    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ9\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/google/firebase/logger/Logger$AndroidLogger;", "Lcom/google/firebase/logger/Logger;", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "log", "", FirebaseAnalytics.Param.LEVEL, "format", "args", "", "", "throwable", "", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "com.google.firebase-firebase-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class AndroidLogger extends Logger {

        @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(@NotNull String str, boolean z, @NotNull Level level) {
            super(str, z, level, null);
            str.getClass();
            level.getClass();
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
            level.getClass();
            format.getClass();
            args.getClass();
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                String tag = getTag();
                return throwable != null ? Log.v(tag, format, throwable) : Log.v(tag, format);
            }
            if (i == 2) {
                String tag2 = getTag();
                return throwable != null ? Log.d(tag2, format, throwable) : Log.d(tag2, format);
            }
            if (i == 3) {
                String tag3 = getTag();
                return throwable != null ? Log.i(tag3, format, throwable) : Log.i(tag3, format);
            }
            if (i == 4) {
                String tag4 = getTag();
                return throwable != null ? Log.w(tag4, format, throwable) : Log.w(tag4, format);
            }
            if (i == 5) {
                String tag5 = getTag();
                return throwable != null ? Log.e(tag5, format, throwable) : Log.e(tag5, format);
            }
            l9r.m149037a();
            return 0;
        }
    }

    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m87232d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "()V", "loggers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/google/firebase/logger/Logger;", "getLogger", "tag", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "setupFakeLogger", "Lcom/google/firebase/logger/Logger$FakeLogger;", "com.google.firebase-firebase-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        @JvmStatic
        @NotNull
        public final Logger getLogger(@NotNull String tag, boolean enabled, @NotNull Level minLevel) {
            Object objPutIfAbsent;
            tag.getClass();
            minLevel.getClass();
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new AndroidLogger(tag, enabled, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            return (Logger) androidLogger;
        }

        @JvmStatic
        @VisibleForTesting
        @NotNull
        public final FakeLogger setupFakeLogger(@NotNull String tag, boolean enabled, @NotNull Level minLevel) {
            tag.getClass();
            minLevel.getClass();
            FakeLogger fakeLogger = new FakeLogger(tag, enabled, minLevel);
            Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }

        private Companion() {
        }
    }

    @Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H\u0007J\u001c\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0011H\u0007J9\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010\u001bJ9\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001dR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m87232d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "record", "", "clearLogMessages", "", "hasLogMessage", "message", "hasLogMessageThat", "predicate", "Lkotlin/Function1;", "log", "", FirebaseAnalytics.Param.LEVEL, "format", "args", "", "", "throwable", "", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "toLogMessage", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/String;", "com.google.firebase-firebase-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @VisibleForTesting
    @SourceDebugExtension
    public static final class FakeLogger extends Logger {

        @NotNull
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(@NotNull String str, boolean z, @NotNull Level level) {
            super(str, z, level, null);
            str.getClass();
            level.getClass();
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String format, Object[] args, Throwable throwable) {
            StringBuilder sb;
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (throwable != null) {
                sb = new StringBuilder();
                sb.append(level);
                sb.append(' ');
                sb.append(format);
                sb.append(' ');
                sb.append(Log.getStackTraceString(throwable));
            } else {
                sb = new StringBuilder();
                sb.append(level);
                sb.append(' ');
                sb.append(format);
            }
            return sb.toString();
        }

        @VisibleForTesting
        public final void clearLogMessages() {
            this.record.clear();
        }

        @VisibleForTesting
        public final boolean hasLogMessage(@NotNull String message) {
            message.getClass();
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.m93412P((String) it.next(), message, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @VisibleForTesting
        public final boolean hasLogMessageThat(@NotNull Function1<? super String, Boolean> predicate) {
            predicate.getClass();
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
            level.getClass();
            format.getClass();
            args.getClass();
            String logMessage = toLogMessage(level, format, args, throwable);
            System.out.println((Object) ("Log: " + logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m87232d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "com.google.firebase-firebase-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i) {
            this.priority = i;
        }

        /* JADX INFO: renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }
    }

    private Logger(String str, boolean z, Level level) {
        this.tag = str;
        this.enabled = z;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: debug");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: error");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    @JvmStatic
    @NotNull
    public static final Logger getLogger(@NotNull String str, boolean z, @NotNull Level level) {
        return INSTANCE.getLogger(str, z, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: info");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String format, Object[] args, Throwable throwable) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority() <= level.getPriority() || Log.isLoggable(this.tag, level.getPriority())) {
            return log(level, format, args, throwable);
        }
        return 0;
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: logIfAble");
            return 0;
        }
        if ((i & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    public static final FakeLogger setupFakeLogger(@NotNull String str, boolean z, @NotNull Level level) {
        return INSTANCE.setupFakeLogger(str, z, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: verbose");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: warn");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    @JvmOverloads
    public final int debug(@NotNull String str, @NotNull Object... objArr) {
        str.getClass();
        objArr.getClass();
        return debug$default(this, str, objArr, null, 4, null);
    }

    @JvmOverloads
    public final int error(@NotNull String str, @NotNull Object... objArr) {
        str.getClass();
        objArr.getClass();
        return error$default(this, str, objArr, null, 4, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Level getMinLevel() {
        return this.minLevel;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @JvmOverloads
    public final int info(@NotNull String str, @NotNull Object... objArr) {
        str.getClass();
        objArr.getClass();
        return info$default(this, str, objArr, null, 4, null);
    }

    public abstract int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable);

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setMinLevel(@NotNull Level level) {
        level.getClass();
        this.minLevel = level;
    }

    @JvmOverloads
    public final int verbose(@NotNull String str, @NotNull Object... objArr) {
        str.getClass();
        objArr.getClass();
        return verbose$default(this, str, objArr, null, 4, null);
    }

    @JvmOverloads
    public final int warn(@NotNull String str, @NotNull Object... objArr) {
        str.getClass();
        objArr.getClass();
        return warn$default(this, str, objArr, null, 4, null);
    }

    @JvmOverloads
    public final int debug(@NotNull String str) {
        str.getClass();
        return debug$default(this, str, null, 2, null);
    }

    @JvmOverloads
    public final int error(@NotNull String str) {
        str.getClass();
        return error$default(this, str, null, 2, null);
    }

    @JvmOverloads
    public final int info(@NotNull String str) {
        str.getClass();
        return info$default(this, str, null, 2, null);
    }

    @JvmOverloads
    public final int verbose(@NotNull String str) {
        str.getClass();
        return verbose$default(this, str, null, 2, null);
    }

    @JvmOverloads
    public final int warn(@NotNull String str) {
        str.getClass();
        return warn$default(this, str, null, 2, null);
    }

    @JvmOverloads
    public final int debug(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.DEBUG, format, args, throwable);
    }

    @JvmOverloads
    public final int error(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.ERROR, format, args, throwable);
    }

    @JvmOverloads
    public final int info(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.INFO, format, args, throwable);
    }

    @JvmOverloads
    public final int verbose(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.VERBOSE, format, args, throwable);
    }

    @JvmOverloads
    public final int warn(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.WARN, format, args, throwable);
    }

    @JvmOverloads
    public final int debug(@NotNull String msg, @Nullable Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.DEBUG, msg, null, throwable, 4, null);
    }

    @JvmOverloads
    public final int error(@NotNull String msg, @Nullable Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.ERROR, msg, null, throwable, 4, null);
    }

    @JvmOverloads
    public final int info(@NotNull String msg, @Nullable Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.INFO, msg, null, throwable, 4, null);
    }

    @JvmOverloads
    public final int verbose(@NotNull String msg, @Nullable Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.VERBOSE, msg, null, throwable, 4, null);
    }

    @JvmOverloads
    public final int warn(@NotNull String msg, @Nullable Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.WARN, msg, null, throwable, 4, null);
    }

    public /* synthetic */ Logger(String str, boolean z, Level level, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, level);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: debug");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: error");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: info");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: verbose");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: warn");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }
}

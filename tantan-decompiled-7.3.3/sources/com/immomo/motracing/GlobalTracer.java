package com.immomo.motracing;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Target;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.uej0;
import p153l.yki;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u00021IB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0017\u0010\rJ \u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"H\u0082 ¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u001dH\u0082 ¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000bH\u0000¢\u0006\u0004\b*\u0010+J$\u0010,\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010!J\u0015\u00101\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b3\u0010\bJ\u001a\u00105\u001a\u0004\u0018\u00010\u00062\u0006\u00104\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0011H\u0086 ¢\u0006\u0004\b7\u0010\u0003R\u0017\u00108\u001a\u00020\t8\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0016\u0010>\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010ER#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060F8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bG\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, m88121d2 = {"Lcom/immomo/motracing/GlobalTracer;", "", "<init>", "()V", "", Constants.KEY_KEY, "Lcom/immomo/motracing/Tracer;", "b", "(Ljava/lang/String;)Lcom/immomo/motracing/Tracer;", "Lkotlin/ULong;", "tracerId", "Lcom/immomo/motracing/Span;", "c", "(J)Lcom/immomo/motracing/Span;", "", "traceId", "spanId", "", "_setCurrentSpan", "(JJJ)V", Target.TYPE, "_setCurrentSpan2", "(JJJJ)V", "_getCurrentSpan", "path", "storePrefix", "_getGlobalTracer", "(Ljava/lang/String;Ljava/lang/String;)J", AuthenticationTokenClaims.JSON_KEY_NAME, "", "_compressRecordFile", "(Ljava/lang/String;Ljava/lang/String;)Z", "_getStoreTimeId", "()J", "", FirebaseAnalytics.Param.LEVEL, "_setLogLevel", "(I)V", "enable", "_setEnable", "(Z)V", "span", "e", "(Lcom/immomo/motracing/Span;)V", "f", "(JLcom/immomo/motracing/Span;)V", Constants.INAPP_DATA_TAG, "Ljava/io/File;", "file", "a", "(Ljava/io/File;)Z", "_getOrCreate", "id", "_getByTracerId", "(J)Lcom/immomo/motracing/Tracer;", "_debugLog", "INVALID_ID", "J", "Lcom/immomo/motracing/GlobalTracer$a;", "libraryLoader", "Lcom/immomo/motracing/GlobalTracer$a;", "_np", "inited", "Z", "isEnable", "Ll/uej0;", Constants.KEY_CONFIG, "Ll/uej0;", "logPath", "Ljava/lang/String;", "", "tracers", "Ljava/util/Map;", "LogLevel", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class GlobalTracer {
    public static final long INVALID_ID = -1;
    private static long _np;
    private static uej0 config;
    private static boolean inited;
    private static boolean isEnable;
    private static String logPath;
    public static final GlobalTracer INSTANCE = new GlobalTracer();
    private static InterfaceC4061a libraryLoader = new C4062b();
    private static String storePrefix = "";
    private static final Map<ULong, Tracer> tracers = new LinkedHashMap();

    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m88121d2 = {"Lcom/immomo/motracing/GlobalTracer$LogLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DEBUG", "INFO", "WARN", "ERROR", Constraint.NONE, "MoTracing_release"}, m88122k = 1, m88123mv = {1, 1, 16})
    public enum LogLevel {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3),
        NONE(4);

        private final int value;

        LogLevel(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.immomo.motracing.GlobalTracer$a */
    @Metadata(m88120d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"Lcom/immomo/motracing/GlobalTracer$a;", "", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public interface InterfaceC4061a {
    }

    /* JADX INFO: renamed from: com.immomo.motracing.GlobalTracer$b */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"com/immomo/motracing/GlobalTracer$b", "Lcom/immomo/motracing/GlobalTracer$a;", "MoTracing_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C4062b implements InterfaceC4061a {
    }

    private GlobalTracer() {
    }

    private final native boolean _compressRecordFile(String name, String path);

    private final native Span _getCurrentSpan(long tracerId);

    private final native long _getGlobalTracer(String path, String storePrefix2);

    private final native long _getStoreTimeId();

    private final native void _setCurrentSpan(long tracerId, long traceId, long spanId);

    private final native void _setCurrentSpan2(long target, long tracerId, long traceId, long spanId);

    private final native void _setEnable(boolean enable);

    private final native void _setLogLevel(int level);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Tracer m20319b(@NotNull String key) {
        key.getClass();
        if (!inited || !isEnable) {
            return C4067b.INSTANCE;
        }
        long jM20337a = Tracer.INSTANCE.m20337a(key);
        Map<ULong, Tracer> map = tracers;
        if (!map.containsKey(ULong.m88176a(jM20337a))) {
            Tracer tracer_getOrCreate = INSTANCE._getOrCreate(key);
            map.put(ULong.m88176a(jM20337a), tracer_getOrCreate);
            return tracer_getOrCreate;
        }
        Tracer tracer = map.get(ULong.m88176a(jM20337a));
        if (tracer == null) {
            Intrinsics.m88386m();
        }
        return tracer;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Span m20320c(long tracerId) {
        if (!inited || !isEnable) {
            return C4066a.INSTANCE;
        }
        Span span_getCurrentSpan = INSTANCE._getCurrentSpan(tracerId);
        return span_getCurrentSpan != null ? span_getCurrentSpan : C4066a.INSTANCE;
    }

    public final native void _debugLog();

    @Nullable
    public final native Tracer _getByTracerId(long id);

    @NotNull
    public final native Tracer _getOrCreate(@NotNull String key);

    /* JADX INFO: renamed from: a */
    public final boolean m20321a(@NotNull File file) {
        file.getClass();
        if (!inited || !isEnable) {
            return false;
        }
        String strM216472t = yki.m216472t(file);
        String parent = file.getParent();
        parent.getClass();
        return _compressRecordFile(strM216472t, parent);
    }

    /* JADX INFO: renamed from: d */
    public final long m20322d() {
        if (!inited || !isEnable) {
            return Long.MAX_VALUE;
        }
        long j_getStoreTimeId = _getStoreTimeId();
        if (j_getStoreTimeId <= 0) {
            return Long.MAX_VALUE;
        }
        return j_getStoreTimeId;
    }

    /* JADX INFO: renamed from: e */
    public final void m20323e(@NotNull Span span) {
        span.getClass();
        if (inited && isEnable) {
            _setCurrentSpan(span.mo20312c(), span.mo20311b(), span.mo20310a());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20324f(long tracerId, @Nullable Span span) {
        if (inited && isEnable) {
            if (span == null) {
                span = C4066a.INSTANCE;
            }
            INSTANCE._setCurrentSpan2(tracerId, span.mo20312c(), span.mo20311b(), span.mo20310a());
        }
    }
}

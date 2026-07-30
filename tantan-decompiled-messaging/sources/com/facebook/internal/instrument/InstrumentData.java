package com.facebook.internal.instrument;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1657e;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.core.data.Reason;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.fwm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u00020\u0001:\u0003\u0019\u00144B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0012\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB\u001d\b\u0012\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\u000eB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010'\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0011\u0010-\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b&\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010/R\u0016\u00101\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010/R\u0016\u00102\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010/¨\u00065"}, m87232d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", "Lorg/json/JSONArray;", "features", "<init>", "(Lorg/json/JSONArray;)V", "", "e", "Lcom/facebook/internal/instrument/InstrumentData$Type;", Constants.KEY_T, "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)V", "", "anrCause", "st", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "data", "", "b", "(Lcom/facebook/internal/instrument/InstrumentData;)I", "", "g", "()V", "a", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "filename", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "type", "c", "Lorg/json/JSONArray;", "featureNames", Constants.INAPP_DATA_TAG, RemoteConfigConstants.RequestFieldKey.APP_VERSION, "cause", "f", "stackTrace", "", "Ljava/lang/Long;", "timestamp", "", "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "analysisReportParameters", "exceptionReportParameters", "Companion", "Type", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String filename;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Type type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public JSONArray featureNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String appVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String cause;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String stackTrace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Long timestamp;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m87232d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$Type$a */
        @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
        public /* synthetic */ class C1658a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6712a;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f6712a = iArr;
            }
        }

        @NotNull
        public final String getLogPrefix() {
            int i = C1658a.f6712a[ordinal()];
            if (i == 1) {
                return "analysis_log_";
            }
            if (i == 2) {
                return "anr_log_";
            }
            if (i == 3) {
                return "crash_log_";
            }
            if (i != 4) {
                return i != 5 ? "Unknown" : "thread_check_log_";
            }
            return "shield_log_";
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            int i = C1658a.f6712a[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "AnrReport";
            }
            if (i == 3) {
                return "CrashReport";
            }
            if (i != 4) {
                return i != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$a */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Lcom/facebook/internal/instrument/InstrumentData$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/facebook/internal/instrument/InstrumentData;", Constants.INAPP_DATA_TAG, "(Ljava/io/File;)Lcom/facebook/internal/instrument/InstrumentData;", "", "e", "Lcom/facebook/internal/instrument/InstrumentData$Type;", Constants.KEY_T, "b", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)Lcom/facebook/internal/instrument/InstrumentData;", "Lorg/json/JSONArray;", "features", "c", "(Lorg/json/JSONArray;)Lcom/facebook/internal/instrument/InstrumentData;", "", "anrCause", "st", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/instrument/InstrumentData;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1659a {

        @NotNull
        public static final C1659a INSTANCE = new C1659a();

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public static final InstrumentData m8897a(@Nullable String anrCause, @Nullable String st) {
            return new InstrumentData(anrCause, st, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public static final InstrumentData m8898b(@Nullable Throwable e, @NotNull Type t) {
            t.getClass();
            return new InstrumentData(e, t, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public static final InstrumentData m8899c(@NotNull JSONArray features) {
            features.getClass();
            return new InstrumentData(features, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public static final InstrumentData m8900d(@NotNull File file) {
            file.getClass();
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m87232d2 = {"Lcom/facebook/internal/instrument/InstrumentData$b;", "", "<init>", "()V", "", "filename", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "b", "(Ljava/lang/String;)Lcom/facebook/internal/instrument/InstrumentData$Type;", "PARAM_APP_VERSION", "Ljava/lang/String;", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final Type m8902b(String filename) {
            if (C15386d.m93483J(filename, "crash_log_", false, 2, null)) {
                return Type.CrashReport;
            }
            if (C15386d.m93483J(filename, "shield_log_", false, 2, null)) {
                return Type.CrashShield;
            }
            if (C15386d.m93483J(filename, "thread_check_log_", false, 2, null)) {
                return Type.ThreadCheck;
            }
            if (C15386d.m93483J(filename, "analysis_log_", false, 2, null)) {
                return Type.Analysis;
            }
            return C15386d.m93483J(filename, "anr_log_", false, 2, null) ? Type.AnrReport : Type.Unknown;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$c */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class C1661c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6713a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6713a = iArr;
        }
    }

    public InstrumentData(File file) {
        String name = file.getName();
        name.getClass();
        this.filename = name;
        this.type = INSTANCE.m8902b(name);
        JSONObject jSONObjectM123544o = fwm.m123544o(this.filename, true);
        if (jSONObjectM123544o != null) {
            this.timestamp = Long.valueOf(jSONObjectM123544o.optLong("timestamp", 0L));
            this.appVersion = jSONObjectM123544o.optString("app_version", null);
            this.cause = jSONObjectM123544o.optString(Reason.TYPE, null);
            this.stackTrace = jSONObjectM123544o.optString("callstack", null);
            this.featureNames = jSONObjectM123544o.optJSONArray("feature_names");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8890a() {
        fwm.m123533d(this.filename);
    }

    /* JADX INFO: renamed from: b */
    public final int m8891b(@NotNull InstrumentData data) {
        data.getClass();
        Long l2 = this.timestamp;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l3 = data.timestamp;
        if (l3 != null) {
            return Intrinsics.m87490f(l3.longValue(), jLongValue);
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m8892c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l2 = this.timestamp;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m8893d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l2 = this.timestamp;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put(Reason.TYPE, str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m8894e() {
        Type type = this.type;
        int i = type == null ? -1 : C1661c.f6713a[type.ordinal()];
        if (i == 1) {
            return m8892c();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return m8893d();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8895f() {
        Type type = this.type;
        int i = type == null ? -1 : C1661c.f6713a[type.ordinal()];
        if (i == 1) {
            return (this.featureNames == null || this.timestamp == null) ? false : true;
        }
        if (i != 2) {
            return ((i != 3 && i != 4 && i != 5) || this.stackTrace == null || this.timestamp == null) ? false : true;
        }
        return (this.stackTrace == null || this.cause == null || this.timestamp == null) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final void m8896g() {
        if (m8895f()) {
            fwm.m123546q(this.filename, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectM8894e = m8894e();
        if (jSONObjectM8894e == null) {
            String string = new JSONObject().toString();
            string.getClass();
            return string;
        }
        String string2 = jSONObjectM8894e.toString();
        string2.getClass();
        return string2;
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    public InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        this.filename = string;
    }

    public InstrumentData(Throwable th, Type type) {
        this.type = type;
        this.appVersion = C1657e.m8865w();
        this.cause = fwm.m123534e(th);
        this.stackTrace = fwm.m123537h(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        this.filename = string;
    }

    public InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = C1657e.m8865w();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        this.filename = string;
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }
}

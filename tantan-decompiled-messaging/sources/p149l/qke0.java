package p149l;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C1554f;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003R\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/qke0;", "", "<init>", "()V", "", "activityName", "Ll/wlf0;", "sourceApplicationInfo", RemoteConfigConstants.RequestFieldKey.APP_ID, "Landroid/content/Context;", "context", "", "b", "(Ljava/lang/String;Ll/wlf0;Ljava/lang/String;Landroid/content/Context;)V", "Ll/oke0;", "sessionInfo", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ll/oke0;Ljava/lang/String;)V", "", "timeBetweenSessions", "", "a", "(J)I", "c", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "[J", "INACTIVE_SECONDS_QUANTA", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class qke0 {

    @NotNull
    public static final qke0 INSTANCE = new qke0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = qke0.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final long[] INACTIVE_SECONDS_QUANTA = {Constants.INBOX_V2_THROTTLE_WINDOW_MS, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m175369a(long timeBetweenSessions) {
        if (lsb.m151554d(qke0.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i >= jArr.length || jArr[i] >= timeBetweenSessions) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                lsb.m151552b(th, qke0.class);
                return 0;
            }
        }
        return i;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m175370b(@NotNull String activityName, @Nullable wlf0 sourceApplicationInfo, @Nullable String appId, @NotNull Context context) {
        String string;
        if (lsb.m151554d(qke0.class)) {
            return;
        }
        try {
            activityName.getClass();
            context.getClass();
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            C1554f.Companion companion = C1554f.INSTANCE;
            C1554f c1554fM7782b = companion.m7782b(activityName, appId, null);
            c1554fM7782b.m7774d("fb_mobile_activate_app", bundle);
            if (companion.m7784d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                c1554fM7782b.m7771a();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, qke0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m175371d(@NotNull String activityName, @Nullable oke0 sessionInfo, @Nullable String appId) {
        long jLongValue;
        String string;
        if (lsb.m151554d(qke0.class)) {
            return;
        }
        try {
            activityName.getClass();
            if (sessionInfo == null) {
                return;
            }
            Long lM164842b = sessionInfo.m164842b();
            if (lM164842b != null) {
                jLongValue = lM164842b.longValue();
            } else {
                Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                jLongValue = 0 - (sessionLastEventTime != null ? sessionLastEventTime.longValue() : 0L);
            }
            if (jLongValue < 0) {
                INSTANCE.m175372c();
                jLongValue = 0;
            }
            long jM164846f = sessionInfo.m164846f();
            if (jM164846f < 0) {
                INSTANCE.m175372c();
                jM164846f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", sessionInfo.getInterruptionCount());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m175369a(jLongValue))}, 1)));
            wlf0 sourceApplicationInfo = sessionInfo.getSourceApplicationInfo();
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            bundle.putLong("_logTime", (sessionLastEventTime2 != null ? sessionLastEventTime2.longValue() : 0L) / 1000);
            C1554f.INSTANCE.m7782b(activityName, appId, null).m7773c("fb_mobile_deactivate_app", jM164846f / 1000.0d, bundle);
        } catch (Throwable th) {
            lsb.m151552b(th, qke0.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m175372c() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            uxv.Companion companion = uxv.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.m196207b(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}

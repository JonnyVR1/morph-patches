package p153l;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C1577f;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003R\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/vse0;", "", "<init>", "()V", "", "activityName", "Ll/fuf0;", "sourceApplicationInfo", RemoteConfigConstants.RequestFieldKey.APP_ID, "Landroid/content/Context;", "context", "", "b", "(Ljava/lang/String;Ll/fuf0;Ljava/lang/String;Landroid/content/Context;)V", "Ll/tse0;", "sessionInfo", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ll/tse0;Ljava/lang/String;)V", "", "timeBetweenSessions", "", "a", "(J)I", "c", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "[J", "INACTIVE_SECONDS_QUANTA", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class vse0 {

    @NotNull
    public static final vse0 INSTANCE = new vse0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = vse0.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final long[] INACTIVE_SECONDS_QUANTA = {Constants.INBOX_V2_THROTTLE_WINDOW_MS, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m202606a(long timeBetweenSessions) {
        if (ztb.m221490d(vse0.class)) {
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
                ztb.m221488b(th, vse0.class);
                return 0;
            }
        }
        return i;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m202607b(@NotNull String activityName, @Nullable fuf0 sourceApplicationInfo, @Nullable String appId, @NotNull Context context) {
        String string;
        if (ztb.m221490d(vse0.class)) {
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
            C1577f.Companion companion = C1577f.INSTANCE;
            C1577f c1577fM7836b = companion.m7836b(activityName, appId, null);
            c1577fM7836b.m7828d("fb_mobile_activate_app", bundle);
            if (companion.m7838d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                c1577fM7836b.m7825a();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, vse0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m202608d(@NotNull String activityName, @Nullable tse0 sessionInfo, @Nullable String appId) {
        long jLongValue;
        String string;
        if (ztb.m221490d(vse0.class)) {
            return;
        }
        try {
            activityName.getClass();
            if (sessionInfo == null) {
                return;
            }
            Long lM192589b = sessionInfo.m192589b();
            if (lM192589b != null) {
                jLongValue = lM192589b.longValue();
            } else {
                Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                jLongValue = 0 - (sessionLastEventTime != null ? sessionLastEventTime.longValue() : 0L);
            }
            if (jLongValue < 0) {
                INSTANCE.m202609c();
                jLongValue = 0;
            }
            long jM192593f = sessionInfo.m192593f();
            if (jM192593f < 0) {
                INSTANCE.m202609c();
                jM192593f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", sessionInfo.getInterruptionCount());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m202606a(jLongValue))}, 1)));
            fuf0 sourceApplicationInfo = sessionInfo.getSourceApplicationInfo();
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            bundle.putLong("_logTime", (sessionLastEventTime2 != null ? sessionLastEventTime2.longValue() : 0L) / 1000);
            C1577f.INSTANCE.m7836b(activityName, appId, null).m7827c("fb_mobile_deactivate_app", jM192593f / 1000.0d, bundle);
        } catch (Throwable th) {
            ztb.m221488b(th, vse0.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m202609c() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            rzv.Companion companion = rzv.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.m183848b(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}

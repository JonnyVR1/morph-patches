package p149l;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/d100;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "c", "(Landroid/app/Activity;)V", "b", Constants.INAPP_DATA_TAG, "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "", "Z", "enabled", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d100 {

    @NotNull
    public static final d100 INSTANCE = new d100();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = d100.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    public static void m109561a() {
        if (lsb.m151554d(d100.class)) {
            return;
        }
        try {
            if (AttributionIdentifiers.INSTANCE.m8655h(C1577c.m8047l())) {
                return;
            }
            INSTANCE.m109564d();
            enabled = true;
        } catch (Throwable th) {
            lsb.m151552b(th, d100.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m109562b() {
        try {
            if (lsb.m151554d(d100.class)) {
                return;
            }
            try {
                C1577c.m8056u().execute(new Runnable() { // from class: l.c100
                    @Override // java.lang.Runnable
                    public final void run() {
                        d100.m109561a();
                    }
                });
            } catch (Exception e) {
                C1657e.m8842i0(TAG, e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, d100.class);
        }
    }

    @JvmStatic
    @UiThread
    /* JADX INFO: renamed from: c */
    public static final void m109563c(@NotNull Activity activity) {
        if (lsb.m151554d(d100.class)) {
            return;
        }
        try {
            activity.getClass();
            try {
                if (enabled && !m100.INSTANCE.m152554c().isEmpty()) {
                    p100.INSTANCE.m167006e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, d100.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m109564d() {
        String rawAamRules;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r == null || (rawAamRules = c1656dM8693r.getRawAamRules()) == null) {
                return;
            }
            m100.INSTANCE.m152555d(rawAamRules);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}

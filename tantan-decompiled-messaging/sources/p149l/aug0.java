package p149l;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.p026ml.ModelManager;
import com.facebook.internal.C1656d;
import com.facebook.internal.FetchedAppSettingsManager;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, m87232d2 = {"Ll/aug0;", "", "<init>", "()V", "", "b", "Landroid/app/Activity;", "activity", "g", "(Landroid/app/Activity;)V", "", NotificationCompat.CATEGORY_EVENT, "", "e", "(Ljava/lang/String;)Z", Constants.INAPP_DATA_TAG, "rawSuggestedEventSetting", "f", "(Ljava/lang/String;)V", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "", "Ljava/util/Set;", "productionEvents", "eligibleEvents", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class aug0 {

    @NotNull
    public static final aug0 INSTANCE = new aug0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> productionEvents = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> eligibleEvents = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public static void m98986a() {
        if (lsb.m151554d(aug0.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = enabled;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            INSTANCE.m98991c();
        } catch (Throwable th) {
            lsb.m151552b(th, aug0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final synchronized void m98987b() {
        if (lsb.m151554d(aug0.class)) {
            return;
        }
        try {
            C1577c.m8056u().execute(new Runnable() { // from class: l.ztg0
                @Override // java.lang.Runnable
                public final void run() {
                    aug0.m98986a();
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, aug0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m98988d(@NotNull String event) {
        if (lsb.m151554d(aug0.class)) {
            return false;
        }
        try {
            event.getClass();
            return eligibleEvents.contains(event);
        } catch (Throwable th) {
            lsb.m151552b(th, aug0.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m98989e(@NotNull String event) {
        if (lsb.m151554d(aug0.class)) {
            return false;
        }
        try {
            event.getClass();
            return productionEvents.contains(event);
        } catch (Throwable th) {
            lsb.m151552b(th, aug0.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m98990g(@NotNull Activity activity) {
        if (lsb.m151554d(aug0.class)) {
            return;
        }
        try {
            activity.getClass();
            try {
                if (!enabled.get() || !hkg.m131496f() || (productionEvents.isEmpty() && eligibleEvents.isEmpty())) {
                    rcl0.INSTANCE.m178808b(activity);
                    return;
                }
                rcl0.INSTANCE.m178807a(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, aug0.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m98991c() {
        String suggestedEventsSetting;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r != null && (suggestedEventsSetting = c1656dM8693r.getSuggestedEventsSetting()) != null) {
                m98992f(suggestedEventsSetting);
                if (productionEvents.isEmpty() && eligibleEvents.isEmpty()) {
                    return;
                }
                File fileM7940i = ModelManager.m7940i(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
                if (fileM7940i == null) {
                    return;
                }
                hkg.m131495d(fileM7940i);
                Activity activityM157970m = n50.m157970m();
                if (activityM157970m != null) {
                    m98990g(activityM157970m);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: f */
    public final void m98992f(@Nullable String rawSuggestedEventSetting) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(rawSuggestedEventSetting);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Set<String> set = productionEvents;
                    String string = jSONArray.getString(i);
                    string.getClass();
                    set.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    Set<String> set2 = eligibleEvents;
                    String string2 = jSONArray2.getString(i2);
                    string2.getClass();
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}

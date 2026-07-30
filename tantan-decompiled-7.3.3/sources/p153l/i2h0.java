package p153l;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.appevents.p027ml.ModelManager;
import com.facebook.internal.C1679d;
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
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, m88121d2 = {"Ll/i2h0;", "", "<init>", "()V", "", "b", "Landroid/app/Activity;", "activity", "g", "(Landroid/app/Activity;)V", "", NotificationCompat.CATEGORY_EVENT, "", "e", "(Ljava/lang/String;)Z", Constants.INAPP_DATA_TAG, "rawSuggestedEventSetting", "f", "(Ljava/lang/String;)V", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "", "Ljava/util/Set;", "productionEvents", "eligibleEvents", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class i2h0 {

    @NotNull
    public static final i2h0 INSTANCE = new i2h0();

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
    public static void m138191a() {
        if (ztb.m221490d(i2h0.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = enabled;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            INSTANCE.m138196c();
        } catch (Throwable th) {
            ztb.m221488b(th, i2h0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final synchronized void m138192b() {
        if (ztb.m221490d(i2h0.class)) {
            return;
        }
        try {
            C1600c.m8110u().execute(new Runnable() { // from class: l.h2h0
                @Override // java.lang.Runnable
                public final void run() {
                    i2h0.m138191a();
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, i2h0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m138193d(@NotNull String event) {
        if (ztb.m221490d(i2h0.class)) {
            return false;
        }
        try {
            event.getClass();
            return eligibleEvents.contains(event);
        } catch (Throwable th) {
            ztb.m221488b(th, i2h0.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m138194e(@NotNull String event) {
        if (ztb.m221490d(i2h0.class)) {
            return false;
        }
        try {
            event.getClass();
            return productionEvents.contains(event);
        } catch (Throwable th) {
            ztb.m221488b(th, i2h0.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m138195g(@NotNull Activity activity) {
        if (ztb.m221490d(i2h0.class)) {
            return;
        }
        try {
            activity.getClass();
            try {
                if (!enabled.get() || !wlg.m207026f() || (productionEvents.isEmpty() && eligibleEvents.isEmpty())) {
                    vll0.INSTANCE.m201650b(activity);
                    return;
                }
                vll0.INSTANCE.m201649a(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, i2h0.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m138196c() {
        String suggestedEventsSetting;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1679d c1679dM8747r = FetchedAppSettingsManager.m8747r(C1600c.m8102m(), false);
            if (c1679dM8747r != null && (suggestedEventsSetting = c1679dM8747r.getSuggestedEventsSetting()) != null) {
                m138197f(suggestedEventsSetting);
                if (productionEvents.isEmpty() && eligibleEvents.isEmpty()) {
                    return;
                }
                File fileM7994i = ModelManager.m7994i(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
                if (fileM7994i == null) {
                    return;
                }
                wlg.m207025d(fileM7994i);
                Activity activityM138595m = i50.m138595m();
                if (activityM138595m != null) {
                    m138195g(activityM138595m);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: f */
    public final void m138197f(@Nullable String rawSuggestedEventSetting) {
        if (ztb.m221490d(this)) {
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
            ztb.m221488b(th, this);
        }
    }
}

package p153l;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/aa00;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "c", "(Landroid/app/Activity;)V", "b", Constants.INAPP_DATA_TAG, "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "", "Z", "enabled", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class aa00 {

    @NotNull
    public static final aa00 INSTANCE = new aa00();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = aa00.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    public static void m96617a() {
        if (ztb.m221490d(aa00.class)) {
            return;
        }
        try {
            if (AttributionIdentifiers.INSTANCE.m8709h(C1600c.m8101l())) {
                return;
            }
            INSTANCE.m96620d();
            enabled = true;
        } catch (Throwable th) {
            ztb.m221488b(th, aa00.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m96618b() {
        try {
            if (ztb.m221490d(aa00.class)) {
                return;
            }
            try {
                C1600c.m8110u().execute(new Runnable() { // from class: l.z900
                    @Override // java.lang.Runnable
                    public final void run() {
                        aa00.m96617a();
                    }
                });
            } catch (Exception e) {
                C1680e.m8896i0(TAG, e);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, aa00.class);
        }
    }

    @JvmStatic
    @UiThread
    /* JADX INFO: renamed from: c */
    public static final void m96619c(@NotNull Activity activity) {
        if (ztb.m221490d(aa00.class)) {
            return;
        }
        try {
            activity.getClass();
            try {
                if (enabled && !ja00.INSTANCE.m143959c().isEmpty()) {
                    ma00.INSTANCE.m157613e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, aa00.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m96620d() {
        String rawAamRules;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1679d c1679dM8747r = FetchedAppSettingsManager.m8747r(C1600c.m8102m(), false);
            if (c1679dM8747r == null || (rawAamRules = c1679dM8747r.getRawAamRules()) == null) {
                return;
            }
            ja00.INSTANCE.m143960d(rawAamRules);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}

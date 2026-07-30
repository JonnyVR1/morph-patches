package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.internal.C1680e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/uv0;", "", "<init>", "()V", "", "b", "a", "", "value", "", "f", "(Ljava/lang/String;)D", "", "e", "()Z", "c", "()Ljava/lang/String;", "Landroid/app/Activity;", "activity", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/app/Activity;)Landroid/view/View;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class uv0 {

    @NotNull
    public static final uv0 INSTANCE = new uv0();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m198219c() {
        Context contextM8101l = C1600c.m8101l();
        try {
            String str = contextM8101l.getPackageManager().getPackageInfo(contextM8101l.getPackageName(), 0).versionName;
            str.getClass();
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final View m198220d(@Nullable Activity activity) {
        if (ztb.m221490d(uv0.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, uv0.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m198221e() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (C15493d.m94374J(str, "generic", false, 2, null)) {
            return true;
        }
        str.getClass();
        if (C15493d.m94374J(str, "unknown", false, 2, null)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (StringsKt.m94303P(str2, "google_sdk", false, 2, null)) {
            return true;
        }
        str2.getClass();
        if (StringsKt.m94303P(str2, "Emulator", false, 2, null)) {
            return true;
        }
        str2.getClass();
        if (StringsKt.m94303P(str2, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (StringsKt.m94303P(str3, "Genymotion", false, 2, null)) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (C15493d.m94374J(str4, "generic", false, 2, null)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (C15493d.m94374J(str5, "generic", false, 2, null)) {
                return true;
            }
        }
        return Intrinsics.m88377d("google_sdk", Build.PRODUCT);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final double m198222f(@Nullable String value) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(value);
            if (!matcher.find()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            return NumberFormat.getNumberInstance(C1680e.m8861B()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m198217a() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m198218b() {
    }
}

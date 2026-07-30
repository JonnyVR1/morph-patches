package p149l;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1577c;
import com.facebook.FacebookSdkNotInitializedException;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0005H\u0007¢\u0006\u0004\b!\u0010\"R\u001c\u0010%\u001a\n #*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006&"}, m87232d2 = {"Ll/ark0;", "", "<init>", "()V", "arg", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "j", "(Ljava/lang/Object;Ljava/lang/String;)V", j6f.GPS_DIRECTION_TRUE, "", "container", "h", "(Ljava/util/Collection;Ljava/lang/String;)V", "a", RXScreenCaptureService.KEY_INDEX, "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g", "(Ljava/lang/String;Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f44444l, "b", "()Ljava/lang/String;", "c", "Landroid/content/Context;", "context", "", "shouldThrow", "f", "(Landroid/content/Context;Z)V", "e", "redirectURI", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/lang/String;)Z", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ark0 {

    @NotNull
    public static final ark0 INSTANCE = new ark0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = ark0.class.getName();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final <T> void m98512a(@NotNull Collection<? extends T> container, @NotNull String name) {
        container.getClass();
        name.getClass();
        Iterator<? extends T> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                mxk.m156912a("Container '", name, "' cannot contain null values");
                return;
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m98513b() {
        String strM8048m = C1577c.m8048m();
        if (strM8048m != null) {
            return strM8048m;
        }
        qkq0.m175383a("No App ID found, please set the App ID.");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m98514c() {
        String strM8054s = C1577c.m8054s();
        if (strM8054s != null) {
            return strM8054s;
        }
        qkq0.m175383a("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml");
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m98515d(@NotNull Context context, @NotNull String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        context.getClass();
        redirectURI.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.m87488d(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.m87488d(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: e */
    public static final void m98516e(@NotNull Context context, boolean shouldThrow) {
        ActivityInfo activityInfo;
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null && shouldThrow) {
            qkq0.m175383a("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m98517f(@NotNull Context context, boolean shouldThrow) {
        context.getClass();
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && shouldThrow) {
            qkq0.m175383a("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m98518g(@NotNull String arg, @NotNull String name) {
        arg.getClass();
        name.getClass();
        if (arg.length() > 0) {
            return;
        }
        f7d0.m119786a("Argument '", name, "' cannot be empty");
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final <T> void m98519h(@NotNull Collection<? extends T> container, @NotNull String name) {
        container.getClass();
        name.getClass();
        if (container.isEmpty()) {
            f7d0.m119786a("Container '", name, "' cannot be empty");
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final <T> void m98520i(@NotNull Collection<? extends T> container, @NotNull String name) {
        container.getClass();
        name.getClass();
        m98512a(container, name);
        m98519h(container, name);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m98521j(@Nullable Object arg, @NotNull String name) {
        name.getClass();
        if (arg != null) {
            return;
        }
        mxk.m156912a("Argument '", name, "' cannot be null");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m98522k(@Nullable String arg, @NotNull String name) {
        name.getClass();
        if (arg != null && arg.length() > 0) {
            return arg;
        }
        f7d0.m119786a("Argument '", name, "' cannot be null or empty");
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m98523l() {
        if (!C1577c.m8027F()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}

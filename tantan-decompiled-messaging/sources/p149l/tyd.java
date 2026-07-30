package p149l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.p046p1.mobile.putong.data.Device;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\fJ\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R4\u0010\u001f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u001c0\u001bj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/tyd;", "", "<init>", "()V", "", "", "deviceInfo", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;)Ljava/lang/String;", "userCode", "", "f", "(Ljava/lang/String;)Z", "e", "()Z", "url", "Landroid/graphics/Bitmap;", "c", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "", "a", "(Ljava/lang/String;)V", "g", "b", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/util/HashMap;", "Landroid/net/nsd/NsdManager$RegistrationListener;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "deviceRequestsListeners", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class tyd {

    @NotNull
    public static final tyd INSTANCE = new tyd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = tyd.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners = new HashMap<>();

    /* JADX INFO: renamed from: l.tyd$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m87232d2 = {"l/tyd$a", "Landroid/net/nsd/NsdManager$RegistrationListener;", "Landroid/net/nsd/NsdServiceInfo;", "NsdServiceInfo", "", "onServiceRegistered", "(Landroid/net/nsd/NsdServiceInfo;)V", "serviceInfo", "onServiceUnregistered", "", "errorCode", "onRegistrationFailed", "(Landroid/net/nsd/NsdServiceInfo;I)V", "onUnregistrationFailed", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class C20311a implements NsdManager.RegistrationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f172579a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f172580b;

        public C20311a(String str, String str2) {
            this.f172579a = str;
            this.f172580b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(@NotNull NsdServiceInfo serviceInfo, int errorCode) {
            serviceInfo.getClass();
            tyd tydVar = tyd.INSTANCE;
            tyd.m191011a(this.f172580b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(@NotNull NsdServiceInfo NsdServiceInfo) {
            NsdServiceInfo.getClass();
            if (Intrinsics.m87488d(this.f172579a, NsdServiceInfo.getServiceName())) {
                return;
            }
            tyd tydVar = tyd.INSTANCE;
            tyd.m191011a(this.f172580b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(@NotNull NsdServiceInfo serviceInfo) {
            serviceInfo.getClass();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(@NotNull NsdServiceInfo serviceInfo, int errorCode) {
            serviceInfo.getClass();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m191011a(@Nullable String userCode) {
        if (lsb.m151554d(tyd.class)) {
            return;
        }
        try {
            INSTANCE.m191016b(userCode);
        } catch (Throwable th) {
            lsb.m151552b(th, tyd.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Bitmap m191012c(@Nullable String url) {
        if (lsb.m151554d(tyd.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.MARGIN, 2);
            try {
                o03 o03VarMo17346a = new tj10().mo17346a(url, BarcodeFormat.QR_CODE, 200, 200, enumMap);
                int iM162113j = o03VarMo17346a.m162113j();
                int iM162116m = o03VarMo17346a.m162116m();
                int[] iArr = new int[iM162113j * iM162116m];
                if (iM162113j > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        int i3 = i * iM162116m;
                        if (iM162116m > 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                iArr[i3 + i4] = o03VarMo17346a.m162110d(i4, i) ? RoundedDrawable.DEFAULT_BORDER_COLOR : -1;
                                if (i5 >= iM162116m) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        if (i2 >= iM162113j) {
                            break;
                        }
                        i = i2;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM162116m, iM162113j, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.setPixels(iArr, 0, iM162116m, 0, 0, iM162116m, iM162113j);
                    return bitmapCreateBitmap;
                } catch (WriterException unused) {
                    return bitmapCreateBitmap;
                }
            } catch (WriterException unused2) {
                return null;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, tyd.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m191013d(@Nullable Map<String, String> deviceInfo) {
        if (lsb.m151554d(tyd.class)) {
            return null;
        }
        if (deviceInfo == null) {
            try {
                deviceInfo = new HashMap<>();
            } catch (Throwable th) {
                lsb.m151552b(th, tyd.class);
                return null;
            }
        }
        String str = Build.DEVICE;
        str.getClass();
        deviceInfo.put(Device.TYPE, str);
        String str2 = Build.MODEL;
        str2.getClass();
        deviceInfo.put("model", str2);
        String string = new JSONObject(deviceInfo).toString();
        string.getClass();
        return string;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m191014e() {
        if (lsb.m151554d(tyd.class)) {
            return false;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
            return c1656dM8689f != null && c1656dM8689f.m8797w().contains(SmartLoginOption.Enabled);
        } catch (Throwable th) {
            lsb.m151552b(th, tyd.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m191015f(@Nullable String userCode) {
        if (lsb.m151554d(tyd.class)) {
            return false;
        }
        try {
            if (m191014e()) {
                return INSTANCE.m191017g(userCode);
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, tyd.class);
            return false;
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: b */
    public final void m191016b(String userCode) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = deviceRequestsListeners.get(userCode);
            if (registrationListener != null) {
                Object systemService = C1577c.m8047l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e) {
                    C1657e c1657e = C1657e.INSTANCE;
                    C1657e.m8842i0(TAG, e);
                }
                deviceRequestsListeners.remove(userCode);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: g */
    public final boolean m191017g(String userCode) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> map = deviceRequestsListeners;
            if (map.containsKey(userCode)) {
                return true;
            }
            String str = "fbsdk_" + Intrinsics.m87496l("android-", C15386d.m93478E(C1577c.m8024C(), '.', '|', false, 4, null)) + '_' + ((Object) userCode);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str);
            nsdServiceInfo.setPort(80);
            Object systemService = C1577c.m8047l().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            C20311a c20311a = new C20311a(str, userCode);
            map.put(userCode, c20311a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c20311a);
            return true;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}

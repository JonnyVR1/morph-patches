package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1cSDK extends AFf1oSDK<Map<String, String>> {
    private final UUID AFKeystoreWrapper;

    @Nullable
    public AFa1zSDK component3;
    private String copy;
    private final AFe1sSDK copydefault;
    private String equals;
    private String hashCode;
    private final boolean toString;

    public interface AFa1zSDK {
        void getMonetizationNetwork(Map<String, String> map);

        void getRevenue(String str);
    }

    public AFf1cSDK(@NonNull AFd1fSDK aFd1fSDK, @NonNull UUID uuid, @NonNull Uri uri) throws Throwable {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1fSDK, uuid.toString());
        this.copydefault = aFd1fSDK.getMonetizationNetwork();
        this.AFKeystoreWrapper = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFc1tSDK.getCurrencyIso4217Code(uri.getHost()) && !AFc1tSDK.getCurrencyIso4217Code(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1fSDK.unregisterClient()};
                    Map map = AFc1gSDK.registerClient;
                    Object declaredConstructor = map.get(-1342566330);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFc1gSDK.getCurrencyIso4217Code(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 36 - View.MeasureSpec.getSize(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14342))).getDeclaredConstructor(Uri.class, AFc1sSDK.class);
                        map.put(-1342566330, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(-991081684);
                        if (method == null) {
                            method = ((Class) AFc1gSDK.getCurrencyIso4217Code((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 35 - ImageFormat.getBitsPerPixel(0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14343))).getMethod("getMonetizationNetwork", null);
                            map.put(-991081684, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(-2111519037);
                            if (method2 == null) {
                                method2 = ((Class) AFc1gSDK.getCurrencyIso4217Code((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, 'b' - AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(0, 0))).getMethod("AFAdRevenueData", null);
                                map.put(-2111519037, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(936263333);
                                if (method3 == null) {
                                    method3 = ((Class) AFc1gSDK.getCurrencyIso4217Code(ExpandableListView.getPackedPositionChild(0L) + 37, 50 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("getRevenue", null);
                                    map.put(936263333, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.copy = strArrSplit[1];
                                    this.equals = strArrSplit[2];
                                    this.hashCode = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.toString = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<Map<String, String>> AFAdRevenueData(@NonNull String str) {
        return this.copydefault.getMediationNetwork(this.copy, this.equals, this.AFKeystoreWrapper, str);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    /* JADX INFO: renamed from: a_ */
    public final boolean mo5242a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    public final boolean copy() {
        return (TextUtils.isEmpty(this.copy) || TextUtils.isEmpty(this.equals) || this.copy.equals("app")) ? false : true;
    }

    public final boolean copydefault() {
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean equals() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final void getCurrencyIso4217Code() {
        ResponseNetwork responseNetwork;
        super.getCurrencyIso4217Code();
        AFa1zSDK aFa1zSDK = this.component3;
        if (aFa1zSDK != null) {
            if (this.getMediationNetwork == AFe1dSDK.SUCCESS && (responseNetwork = ((AFf1oSDK) this).component1) != null) {
                aFa1zSDK.getMonetizationNetwork((Map) responseNetwork.getBody());
                return;
            }
            Throwable thComponent2 = component2();
            if (!(thComponent2 instanceof ParsingException)) {
                String str = this.hashCode;
                aFa1zSDK.getRevenue(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thComponent2).getRawResponse().isSuccessful()) {
                aFa1zSDK.getRevenue("Can't parse one link data");
            } else {
                String str2 = this.hashCode;
                aFa1zSDK.getRevenue(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }
}

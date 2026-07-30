package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.facebook.C1600c;
import com.p051p1.mobile.putong.data.Link;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.zw0;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1zSDK implements AFc1eSDK {

    @NotNull
    private final AFd1kSDK getCurrencyIso4217Code;

    @Nullable
    Map<String, Object> getMonetizationNetwork;
    private boolean getRevenue;

    public static final class AFa1ySDK implements AFa1rSDK.AFa1tSDK {
        private /* synthetic */ long getMediationNetwork;

        public AFa1ySDK(long j) {
            this.getMediationNetwork = j;
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1tSDK
        public final void getMonetizationNetwork(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFd1zSDK.this.getMonetizationNetwork;
                if (map2 != null) {
                    map2.put(Link.TYPE, str);
                }
                if (str2 != null && (map = AFd1zSDK.this.getMonetizationNetwork) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFd1zSDK aFd1zSDK = AFd1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFd1zSDK.getMonetizationNetwork;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFd1zSDK.this.getMonetizationNetwork;
                if (map4 != null) {
                    map4.put(Link.TYPE, "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.getMediationNetwork);
            Map<String, Object> map5 = AFd1zSDK.this.getMonetizationNetwork;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1tSDK
        public final void getRevenue(@Nullable String str) {
            Map<String, Object> map = AFd1zSDK.this.getMonetizationNetwork;
            if (map != null) {
                map.put("error", str);
            }
        }
    }

    public AFd1zSDK(@NotNull AFd1kSDK aFd1kSDK) {
        aFd1kSDK.getClass();
        this.getCurrencyIso4217Code = aFd1kSDK;
    }

    private boolean getCurrencyIso4217Code() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1eSDK
    public final void AFAdRevenueData(boolean z) {
        this.getRevenue = z;
    }

    @Override // com.appsflyer.internal.AFc1eSDK
    public final boolean getMonetizationNetwork() {
        if (!getCurrencyIso4217Code()) {
            return false;
        }
        Map<String, Object> map = this.getMonetizationNetwork;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFc1eSDK
    public final void getRevenue() {
        Context context;
        if (getCurrencyIso4217Code() && (context = this.getCurrencyIso4217Code.getCurrencyIso4217Code) != null) {
            this.getMonetizationNetwork = new LinkedHashMap();
            AFa1ySDK aFa1ySDK = new AFa1ySDK(System.currentTimeMillis());
            try {
                C1600c c1600c = C1600c.INSTANCE;
                C1600c.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
                String str = zw0.f206306g;
                Method method = zw0.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, zw0.InterfaceC21910b.class);
                Object objNewProxyInstance = Proxy.newProxyInstance(zw0.InterfaceC21910b.class.getClassLoader(), new Class[]{zw0.InterfaceC21910b.class}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1rSDK.3
                    private /* synthetic */ Class getMediationNetwork;
                    private /* synthetic */ AFa1tSDK getRevenue;

                    public C09423() {
                        cls = cls;
                        aFa1tSDK = aFa1ySDK;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1tSDK aFa1tSDK = aFa1tSDK;
                            if (aFa1tSDK != null) {
                                aFa1tSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1tSDK aFa1tSDK2 = aFa1tSDK;
                            if (aFa1tSDK2 != null) {
                                aFa1tSDK2.getMonetizationNetwork(string2, string3, string);
                            }
                        } else {
                            AFa1tSDK aFa1tSDK3 = aFa1tSDK;
                            if (aFa1tSDK3 != null) {
                                aFa1tSDK3.getMonetizationNetwork(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1ySDK.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1ySDK.getRevenue(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1ySDK.getRevenue(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1ySDK.getRevenue(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1ySDK.getRevenue(e4.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1eSDK
    @Nullable
    public final Map<String, Object> AFAdRevenueData() {
        return this.getMonetizationNetwork;
    }
}

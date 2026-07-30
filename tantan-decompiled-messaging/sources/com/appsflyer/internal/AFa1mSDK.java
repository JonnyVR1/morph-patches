package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.Counter;
import java.util.HashMap;
import java.util.Map;
import p149l.ig3;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFa1mSDK {
    protected final Map<String, Object> AFAdRevenueData;
    public int areAllFieldsValid;

    @Nullable
    public String component1;
    public String component2;
    public String component3;
    public String component4;
    private final boolean copydefault;
    private byte[] equals;

    @Nullable
    public String getCurrencyIso4217Code;
    public String getMediationNetwork;

    @Nullable
    public Map<String, Object> getMonetizationNetwork;

    @Nullable
    public AppsFlyerRequestListener getRevenue;

    public AFa1mSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.component4 = str;
        this.component3 = str2;
        this.copydefault = bool != null ? bool.booleanValue() : true;
    }

    @NonNull
    public static String AFAdRevenueData(String str) {
        String strComponent4 = AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().getMediationNetwork().component4();
        return strComponent4 != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", strComponent4).build().toString() : str;
    }

    public boolean areAllFieldsValid() {
        return true;
    }

    public boolean component1() {
        return true;
    }

    public boolean component2() {
        return true;
    }

    public boolean component3() {
        return false;
    }

    public final AFa1mSDK getCurrencyIso4217Code(byte[] bArr) {
        this.equals = bArr;
        return this;
    }

    public abstract AFf1zSDK getCurrencyIso4217Code();

    public final AFa1mSDK getMediationNetwork(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public final AFa1mSDK getMonetizationNetwork(int i) {
        this.areAllFieldsValid = i;
        synchronized (this.AFAdRevenueData) {
            try {
                if (this.AFAdRevenueData.containsKey(Counter.TYPE)) {
                    this.AFAdRevenueData.put(Counter.TYPE, Integer.toString(i));
                }
                if (this.AFAdRevenueData.containsKey("launch_counter")) {
                    this.AFAdRevenueData.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final Map<String, Object> getRevenue() {
        return this.AFAdRevenueData;
    }

    public final byte[] getMediationNetwork() {
        return this.equals;
    }

    public AFa1mSDK() {
        this(null, null, null);
    }

    public final boolean AFAdRevenueData() {
        return this.component4 == null && this.getMediationNetwork == null;
    }

    public final AFa1mSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public AFa1mSDK getMonetizationNetwork(String str) {
        this.component3 = str;
        return this;
    }

    public final boolean getMonetizationNetwork() {
        return this.copydefault;
    }

    public static boolean getMonetizationNetwork(double d) {
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d >= 1.0d) {
            return false;
        }
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return true;
        }
        int i = (int) (1.0d / d);
        if (i + 1 > 0) {
            return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
        }
        ig3.m135964a("Unsupported max value");
        return false;
    }
}

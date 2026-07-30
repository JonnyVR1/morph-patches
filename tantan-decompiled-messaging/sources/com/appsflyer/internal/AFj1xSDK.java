package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1xSDK implements SensorEventListener {
    private final int AFAdRevenueData;

    @NonNull
    private final Executor areAllFieldsValid;
    private long component1;

    @NonNull
    private final String getCurrencyIso4217Code;
    private final int getMediationNetwork;

    @NonNull
    private final String getMonetizationNetwork;
    private double getRevenue;
    private final float[][] component4 = new float[2][];
    private final long[] component3 = new long[2];

    public AFj1xSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.AFAdRevenueData = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.areAllFieldsValid = executorService;
    }

    private static double AFAdRevenueData(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (int i = 0; i < iMin; i++) {
            dPow += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void m5275G_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component4;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component3[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component4[1] = fArrCopyOf;
            this.component3[1] = jCurrentTimeMillis;
            this.getRevenue = AFAdRevenueData(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j - this.component1) {
            this.component1 = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.component3[1] = jCurrentTimeMillis;
                return;
            }
            double dAFAdRevenueData = AFAdRevenueData(fArr3, fArr);
            if (dAFAdRevenueData > this.getRevenue) {
                this.component4[1] = Arrays.copyOf(fArr, fArr.length);
                this.component3[1] = jCurrentTimeMillis;
                this.getRevenue = dAFAdRevenueData;
            }
        }
    }

    private boolean getCurrencyIso4217Code(int i, @NonNull String str, @NonNull String str2) {
        return this.AFAdRevenueData == i && this.getCurrencyIso4217Code.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    @NonNull
    private Map<String, Object> getMonetizationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFAdRevenueData));
        concurrentHashMap.put("sN", this.getCurrencyIso4217Code);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.component4[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getRevenue(fArr));
        }
        float[] fArr2 = this.component4[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getRevenue(fArr2));
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1xSDK)) {
            return false;
        }
        AFj1xSDK aFj1xSDK = (AFj1xSDK) obj;
        return getCurrencyIso4217Code(aFj1xSDK.AFAdRevenueData, aFj1xSDK.getCurrencyIso4217Code, aFj1xSDK.getMonetizationNetwork);
    }

    public final void getRevenue(@NonNull Map<AFj1xSDK, Map<String, Object>> map, boolean z) {
        if (!getRevenue()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMonetizationNetwork());
            return;
        }
        map.put(this, getMonetizationNetwork());
        if (z) {
            int length = this.component4.length;
            for (int i = 0; i < length; i++) {
                this.component4[i] = null;
            }
            int length2 = this.component3.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.component3[i2] = 0;
            }
            this.getRevenue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.component1 = 0L;
        }
    }

    public final int hashCode() {
        return this.getMediationNetwork;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.areAllFieldsValid.execute(new Runnable() { // from class: com.appsflyer.internal.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4300a.m5275G_(sensorEvent);
                }
            });
        } else {
            m5275G_(sensorEvent);
        }
    }

    @NonNull
    private static List<Float> getRevenue(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    private boolean getRevenue() {
        return this.component4[0] != null;
    }
}

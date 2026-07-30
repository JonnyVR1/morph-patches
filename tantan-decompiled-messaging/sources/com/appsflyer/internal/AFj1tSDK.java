package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1tSDK implements AFj1uSDK {
    private static final BitSet getMediationNetwork;
    private final Object AFAdRevenueData;
    private final Runnable areAllFieldsValid;
    private boolean component1;
    private final Map<AFj1xSDK, Map<String, Object>> component2;
    private boolean component3;
    private final Map<AFj1xSDK, AFj1xSDK> component4;
    private final Runnable copydefault;
    private final Runnable equals;
    private final SensorManager getCurrencyIso4217Code;
    private final Handler getMonetizationNetwork;
    private final ExecutorService getRevenue;

    static {
        BitSet bitSet = new BitSet(6);
        getMediationNetwork = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    @VisibleForTesting
    private AFj1tSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFAdRevenueData = new Object();
        BitSet bitSet = getMediationNetwork;
        this.component4 = new HashMap(bitSet.size());
        this.component2 = new ConcurrentHashMap(bitSet.size());
        this.areAllFieldsValid = new Runnable() { // from class: com.appsflyer.internal.AFj1tSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1tSDK.this.AFAdRevenueData) {
                    AFj1tSDK.this.getMonetizationNetwork();
                    AFj1tSDK.this.getMonetizationNetwork.postDelayed(AFj1tSDK.this.equals, 150L);
                    AFj1tSDK.this.component3 = true;
                }
            }
        };
        this.equals = new Runnable() { // from class: com.appsflyer.internal.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4279a.component2();
            }
        };
        this.copydefault = new Runnable() { // from class: com.appsflyer.internal.AFj1tSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1tSDK.this.AFAdRevenueData) {
                    try {
                        if (AFj1tSDK.this.component3) {
                            AFj1tSDK.this.getMonetizationNetwork.removeCallbacks(AFj1tSDK.this.areAllFieldsValid);
                            AFj1tSDK.this.getMonetizationNetwork.removeCallbacks(AFj1tSDK.this.equals);
                            AFj1tSDK.this.AFAdRevenueData();
                            AFj1tSDK.this.component3 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.getCurrencyIso4217Code = sensorManager;
        this.getMonetizationNetwork = handler;
        this.getRevenue = executorService;
    }

    private static boolean AFAdRevenueData(int i) {
        return i >= 0 && getMediationNetwork.get(i);
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.AFAdRevenueData) {
            try {
                Iterator<AFj1xSDK> it = this.component4.values().iterator();
                while (it.hasNext()) {
                    it.next().getRevenue(this.component2, true);
                }
                if (this.component2.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        try {
            for (Sensor sensor : this.getCurrencyIso4217Code.getSensorList(-1)) {
                if (AFAdRevenueData(sensor.getType())) {
                    AFj1xSDK aFj1xSDK = new AFj1xSDK(sensor, this.getRevenue);
                    if (!this.component4.containsKey(aFj1xSDK)) {
                        this.component4.put(aFj1xSDK, aFj1xSDK);
                    }
                    this.getCurrencyIso4217Code.registerListener(this.component4.get(aFj1xSDK), sensor, 1, this.getMonetizationNetwork);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.component1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2() {
        synchronized (this.AFAdRevenueData) {
            this.getMonetizationNetwork.post(new RunnableC0989e0(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        try {
            if (!this.component4.isEmpty()) {
                for (AFj1xSDK aFj1xSDK : this.component4.values()) {
                    this.getCurrencyIso4217Code.unregisterListener(aFj1xSDK);
                    aFj1xSDK.getRevenue(this.component2, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.component1 = false;
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> component4() {
        synchronized (this.AFAdRevenueData) {
            try {
                if (!this.component4.isEmpty() && this.component1) {
                    Iterator<AFj1xSDK> it = this.component4.values().iterator();
                    while (it.hasNext()) {
                        it.next().getRevenue(this.component2, false);
                    }
                }
                if (this.component2.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.component2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1uSDK
    public final synchronized void getCurrencyIso4217Code() {
        this.getMonetizationNetwork.post(this.copydefault);
    }

    @Override // com.appsflyer.internal.AFj1uSDK
    @NonNull
    public final Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listComponent4 = component4();
        if (!listComponent4.isEmpty()) {
            concurrentHashMap.put("sensors", listComponent4);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
        if (!listAreAllFieldsValid.isEmpty()) {
            concurrentHashMap.put("sensors", listAreAllFieldsValid);
        }
        return concurrentHashMap;
    }

    @VisibleForTesting
    public final void getMonetizationNetwork() {
        this.getMonetizationNetwork.post(new Runnable() { // from class: com.appsflyer.internal.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4281a.component1();
            }
        });
    }

    @Override // com.appsflyer.internal.AFj1uSDK
    public final void getRevenue() {
        this.getMonetizationNetwork.post(this.copydefault);
        this.getMonetizationNetwork.post(this.areAllFieldsValid);
    }

    public final void AFAdRevenueData() {
        this.getMonetizationNetwork.post(new RunnableC0989e0(this));
    }

    public AFj1tSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}

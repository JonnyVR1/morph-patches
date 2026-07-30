package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFf1wSDK<Result> implements Comparable<AFf1wSDK<?>>, Callable<AFe1dSDK> {
    private static final AtomicInteger component3 = new AtomicInteger();

    @NonNull
    public final AFf1zSDK AFAdRevenueData;

    @Nullable
    private Throwable areAllFieldsValid;
    private long component1;
    private final int component2;
    private final String component4;

    @NonNull
    public final Set<AFf1zSDK> getCurrencyIso4217Code;

    @Nullable
    public AFe1dSDK getMediationNetwork;

    @NonNull
    public final Set<AFf1zSDK> getMonetizationNetwork;
    public volatile int getRevenue;
    private boolean hashCode;

    public AFf1wSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.getCurrencyIso4217Code = hashSet;
        this.getMonetizationNetwork = new HashSet();
        int iIncrementAndGet = component3.incrementAndGet();
        this.component2 = iIncrementAndGet;
        this.hashCode = false;
        this.getRevenue = 0;
        this.AFAdRevenueData = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.component4 = str;
        } else {
            this.component4 = String.valueOf(iIncrementAndGet);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFf1wSDK<?> aFf1wSDK) {
        int i = this.AFAdRevenueData.unregisterClient - aFf1wSDK.AFAdRevenueData.unregisterClient;
        if (i != 0) {
            return i;
        }
        if (this.component4.equals(aFf1wSDK.component4)) {
            return 0;
        }
        return this.component2 - aFf1wSDK.component2;
    }

    @WorkerThread
    public abstract boolean AFAdRevenueData();

    @Nullable
    public final Throwable component2() {
        return this.areAllFieldsValid;
    }

    public final boolean component3() {
        return this.hashCode;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: component4, reason: merged with bridge method [inline-methods] */
    public final AFe1dSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMediationNetwork = null;
        this.areAllFieldsValid = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.getRevenue++;
        try {
            AFe1dSDK monetizationNetwork = getMonetizationNetwork();
            this.getMediationNetwork = monetizationNetwork;
            this.component1 = System.currentTimeMillis() - jCurrentTimeMillis;
            getCurrencyIso4217Code();
            return monetizationNetwork;
        } catch (Throwable th) {
            try {
                this.areAllFieldsValid = th;
                this.getMediationNetwork = AFe1dSDK.FAILURE;
                getMediationNetwork(th);
                throw th;
            } catch (Throwable th2) {
                this.component1 = System.currentTimeMillis() - jCurrentTimeMillis;
                getCurrencyIso4217Code();
                throw th2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFf1wSDK aFf1wSDK = (AFf1wSDK) obj;
        if (this.AFAdRevenueData != aFf1wSDK.AFAdRevenueData) {
            return false;
        }
        return this.component4.equals(aFf1wSDK.component4);
    }

    @WorkerThread
    public void getCurrencyIso4217Code() {
    }

    @CallSuper
    @WorkerThread
    public void getMediationNetwork() {
        this.hashCode = true;
    }

    @NonNull
    @WorkerThread
    public abstract AFe1dSDK getMonetizationNetwork() throws Exception;

    public abstract long getRevenue();

    public final int hashCode() {
        return (this.AFAdRevenueData.hashCode() * 31) + this.component4.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AFAdRevenueData);
        sb.append("-");
        sb.append(this.component4);
        String string = sb.toString();
        if (String.valueOf(this.component2).equals(this.component4)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("-");
        sb2.append(this.component2);
        return sb2.toString();
    }

    @WorkerThread
    public void getMediationNetwork(Throwable th) {
    }
}

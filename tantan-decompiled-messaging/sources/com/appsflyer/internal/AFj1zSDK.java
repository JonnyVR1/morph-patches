package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFj1zSDK extends Observable {
    public final String component1;
    long component4;
    public final String getMonetizationNetwork;
    final Runnable getRevenue;
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public AFa1zSDK component3 = AFa1zSDK.NOT_STARTED;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1zSDK$4 */
    public class C09794 implements Observer {
        public C09794() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1zSDK.this.getRevenue.run();
        }
    }

    public enum AFa1zSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1zSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.getMonetizationNetwork = str2;
        this.component1 = str;
    }

    public final void AFAdRevenueData() {
        this.getMediationNetwork.put("source", this.getMonetizationNetwork);
        this.getMediationNetwork.put("type", this.component1);
        this.getMediationNetwork.put("latency", Long.valueOf(System.currentTimeMillis() - this.component4));
        this.component3 = AFa1zSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void getMonetizationNetwork(Context context);
}

package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class AFi1tSDK extends AFi1wSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: x_ */
    private static boolean m5255x_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1wSDK
    public final boolean AFAdRevenueData() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    ConnectivityManager connectivityManager2 = this.getMonetizationNetwork;
                    connectivityManager2.getClass();
                    NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (m5255x_((NetworkCapabilities) it.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1wSDK
    @NotNull
    public final String getMediationNetwork() {
        Network[] allNetworks;
        Sequence sequenceAsSequence;
        Sequence sequenceM93295O;
        Object next;
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (sequenceAsSequence = ArraysKt.asSequence(allNetworks)) != null && (sequenceM93295O = SequencesKt___SequencesKt.m93295O(sequenceAsSequence, new Function1<Network, NetworkInfo>() { // from class: com.appsflyer.internal.AFi1tSDK.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: y_, reason: merged with bridge method [inline-methods] */
            public final NetworkInfo invoke(Network network) {
                ConnectivityManager connectivityManager2 = AFi1tSDK.this.getMonetizationNetwork;
                connectivityManager2.getClass();
                return connectivityManager2.getNetworkInfo(network);
            }
        })) != null) {
            Iterator it = sequenceM93295O.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AFi1wSDK.m5257w_((NetworkInfo) next));
            NetworkInfo networkInfo = (NetworkInfo) next;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type != 0) {
                    return type != 1 ? "unknown" : "WIFI";
                }
                return "MOBILE";
            }
        }
        return "unknown";
    }
}

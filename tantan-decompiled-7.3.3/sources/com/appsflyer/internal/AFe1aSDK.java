package com.appsflyer.internal;

import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1aSDK {
    public Executor AFAdRevenueData;
    final Set<AFf1zSDK> areAllFieldsValid;
    final NavigableSet<AFf1wSDK<?>> component1;
    final NavigableSet<AFf1wSDK<?>> component2;
    final Set<AFf1wSDK<?>> component3;
    final List<AFf1wSDK<?>> component4;
    public final List<AFe1eSDK> getCurrencyIso4217Code;
    final Set<AFf1zSDK> getMediationNetwork;
    final ExecutorService getMonetizationNetwork;
    final Timer getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1aSDK$2 */
    public class RunnableC09572 implements Runnable {
        public RunnableC09572() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1aSDK.this.component1) {
                try {
                    final AFf1wSDK<?> aFf1wSDKPollFirst = AFe1aSDK.this.component1.pollFirst();
                    if (aFf1wSDKPollFirst == null) {
                        return;
                    }
                    AFe1aSDK.this.component3.add(aFf1wSDKPollFirst);
                    long revenue = aFf1wSDKPollFirst.getRevenue();
                    AFf1xSDK aFf1xSDK = new AFf1xSDK(Thread.currentThread());
                    if (revenue > 0) {
                        AFe1aSDK.this.getRevenue.schedule(aFf1xSDK, revenue);
                    }
                    final AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                    aFe1aSDK.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<AFe1eSDK> it = AFe1aSDK.this.getCurrencyIso4217Code.iterator();
                            while (it.hasNext()) {
                                it.next().getCurrencyIso4217Code(aFf1wSDKPollFirst);
                            }
                        }
                    });
                    if (!AFe1aSDK.this.component1.isEmpty()) {
                        AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                        aFe1aSDK2.getMonetizationNetwork.submit(aFe1aSDK2.new RunnableC09572());
                    }
                    try {
                        AFLogger.INSTANCE.m5250d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFf1wSDKPollFirst)));
                        final AFe1dSDK aFe1dSDKCall = aFf1wSDKPollFirst.call();
                        aFf1xSDK.cancel();
                        final AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                        aFe1aSDK3.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(aFf1wSDKPollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1dSDKCall);
                                aFLogger.m5250d(aFg1cSDK, sb.toString());
                                AFe1aSDK.this.component3.remove(aFf1wSDKPollFirst);
                                Iterator<AFe1eSDK> it = AFe1aSDK.this.getCurrencyIso4217Code.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFf1wSDKPollFirst, aFe1dSDKCall);
                                }
                                if (aFe1dSDKCall == AFe1dSDK.SUCCESS) {
                                    AFe1aSDK.this.getMediationNetwork.add(aFf1wSDKPollFirst.AFAdRevenueData);
                                    AFe1aSDK.getRevenue(AFe1aSDK.this);
                                    return;
                                }
                                boolean zAFAdRevenueData = aFf1wSDKPollFirst.AFAdRevenueData();
                                AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                                if (!zAFAdRevenueData) {
                                    aFe1aSDK4.getMediationNetwork.add(aFf1wSDKPollFirst.AFAdRevenueData);
                                    AFe1aSDK.getRevenue(AFe1aSDK.this);
                                } else if (AFe1aSDK.getMediationNetwork(aFf1wSDKPollFirst)) {
                                    synchronized (AFe1aSDK.this.component1) {
                                        try {
                                            AFe1aSDK.this.component4.add(aFf1wSDKPollFirst);
                                            for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.getCurrencyIso4217Code) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.m5250d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFf1wSDKPollFirst)));
                        final AFe1dSDK aFe1dSDK = AFe1dSDK.TIMEOUT;
                        aFf1wSDKPollFirst.getMediationNetwork = aFe1dSDK;
                        final AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                        aFe1aSDK4.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(aFf1wSDKPollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1dSDK);
                                aFLogger.m5250d(aFg1cSDK, sb.toString());
                                AFe1aSDK.this.component3.remove(aFf1wSDKPollFirst);
                                Iterator<AFe1eSDK> it = AFe1aSDK.this.getCurrencyIso4217Code.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFf1wSDKPollFirst, aFe1dSDK);
                                }
                                if (aFe1dSDK == AFe1dSDK.SUCCESS) {
                                    AFe1aSDK.this.getMediationNetwork.add(aFf1wSDKPollFirst.AFAdRevenueData);
                                    AFe1aSDK.getRevenue(AFe1aSDK.this);
                                    return;
                                }
                                boolean zAFAdRevenueData = aFf1wSDKPollFirst.AFAdRevenueData();
                                AFe1aSDK aFe1aSDK5 = AFe1aSDK.this;
                                if (!zAFAdRevenueData) {
                                    aFe1aSDK5.getMediationNetwork.add(aFf1wSDKPollFirst.AFAdRevenueData);
                                    AFe1aSDK.getRevenue(AFe1aSDK.this);
                                } else if (AFe1aSDK.getMediationNetwork(aFf1wSDKPollFirst)) {
                                    synchronized (AFe1aSDK.this.component1) {
                                        try {
                                            AFe1aSDK.this.component4.add(aFf1wSDKPollFirst);
                                            for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.getCurrencyIso4217Code) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFf1xSDK.cancel();
                        final AFe1aSDK aFe1aSDK5 = AFe1aSDK.this;
                        final AFe1dSDK aFe1dSDK2 = AFe1dSDK.FAILURE;
                        aFe1aSDK5.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(aFf1wSDKPollFirst);
                                sb.append(", result: ");
                                sb.append(aFe1dSDK2);
                                aFLogger.m5250d(aFg1cSDK, sb.toString());
                                AFe1aSDK.this.component3.remove(aFf1wSDKPollFirst);
                                Iterator<AFe1eSDK> it = AFe1aSDK.this.getCurrencyIso4217Code.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFf1wSDKPollFirst, aFe1dSDK2);
                                }
                                if (aFe1dSDK2 == AFe1dSDK.SUCCESS) {
                                    AFe1aSDK.this.getMediationNetwork.add(aFf1wSDKPollFirst.AFAdRevenueData);
                                    AFe1aSDK.getRevenue(AFe1aSDK.this);
                                    return;
                                }
                                boolean zAFAdRevenueData = aFf1wSDKPollFirst.AFAdRevenueData();
                                AFe1aSDK aFe1aSDK6 = AFe1aSDK.this;
                                if (!zAFAdRevenueData) {
                                    aFe1aSDK6.getMediationNetwork.add(aFf1wSDKPollFirst.AFAdRevenueData);
                                    AFe1aSDK.getRevenue(AFe1aSDK.this);
                                } else if (AFe1aSDK.getMediationNetwork(aFf1wSDKPollFirst)) {
                                    synchronized (AFe1aSDK.this.component1) {
                                        try {
                                            AFe1aSDK.this.component4.add(aFf1wSDKPollFirst);
                                            for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.getCurrencyIso4217Code) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1aSDK$5 */
    public class RunnableC09595 implements Runnable {
        private /* synthetic */ AFf1wSDK getMonetizationNetwork;

        public RunnableC09595(AFf1wSDK aFf1wSDK) {
            this.getMonetizationNetwork = aFf1wSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1aSDK.this.component1) {
                try {
                    if (AFe1aSDK.this.component3.contains(this.getMonetizationNetwork)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                        StringBuilder sb = new StringBuilder("tried to add already running task: ");
                        sb.append(this.getMonetizationNetwork);
                        aFLogger.m5250d(aFg1cSDK, sb.toString());
                        return;
                    }
                    if (!AFe1aSDK.this.component1.contains(this.getMonetizationNetwork) && !AFe1aSDK.this.component2.contains(this.getMonetizationNetwork)) {
                        AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                        AFf1wSDK aFf1wSDK = this.getMonetizationNetwork;
                        for (AFf1zSDK aFf1zSDK : aFf1wSDK.getMonetizationNetwork) {
                            if (aFe1aSDK.areAllFieldsValid.contains(aFf1zSDK)) {
                                aFf1wSDK.getCurrencyIso4217Code.add(aFf1zSDK);
                            }
                        }
                        boolean zAFAdRevenueData = AFe1aSDK.this.AFAdRevenueData(this.getMonetizationNetwork);
                        AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                        if (zAFAdRevenueData) {
                            zAdd = aFe1aSDK2.component1.add(this.getMonetizationNetwork);
                        } else {
                            zAdd = aFe1aSDK2.component2.add(this.getMonetizationNetwork);
                            if (zAdd) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK2 = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("new task was blocked: ");
                                sb2.append(this.getMonetizationNetwork);
                                aFLogger2.m5250d(aFg1cSDK2, sb2.toString());
                                this.getMonetizationNetwork.getMediationNetwork();
                            }
                        }
                        if (zAdd) {
                            AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                            aFe1aSDK3.component1.addAll(aFe1aSDK3.component4);
                            AFe1aSDK.this.component4.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK3 = AFg1cSDK.QUEUE;
                            StringBuilder sb3 = new StringBuilder("task not added, it's already in the queue: ");
                            sb3.append(this.getMonetizationNetwork);
                            aFLogger3.m5250d(aFg1cSDK3, sb3.toString());
                        }
                        if (!zAdd) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK4 = AFg1cSDK.QUEUE;
                            StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb4.append(this.getMonetizationNetwork);
                            aFLogger4.m5257w(aFg1cSDK4, sb4.toString());
                            return;
                        }
                        AFe1aSDK.this.areAllFieldsValid.add(this.getMonetizationNetwork.AFAdRevenueData);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK5 = AFg1cSDK.QUEUE;
                        StringBuilder sb5 = new StringBuilder("new task added: ");
                        sb5.append(this.getMonetizationNetwork);
                        aFLogger5.m5250d(aFg1cSDK5, sb5.toString());
                        for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.getCurrencyIso4217Code) {
                        }
                        AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                        aFe1aSDK4.getMonetizationNetwork.submit(aFe1aSDK4.new RunnableC09572());
                        AFe1aSDK aFe1aSDK5 = AFe1aSDK.this;
                        synchronized (aFe1aSDK5.component1) {
                            try {
                                for (int size = (aFe1aSDK5.component1.size() + aFe1aSDK5.component2.size()) - 40; size > 0; size--) {
                                    boolean zIsEmpty = aFe1aSDK5.component2.isEmpty();
                                    boolean zIsEmpty2 = aFe1aSDK5.component1.isEmpty();
                                    if (zIsEmpty2 || zIsEmpty) {
                                        if (!zIsEmpty2) {
                                            aFe1aSDK5.getMonetizationNetwork(aFe1aSDK5.component1);
                                        } else if (!zIsEmpty) {
                                            aFe1aSDK5.getMonetizationNetwork(aFe1aSDK5.component2);
                                        }
                                    } else if (aFe1aSDK5.component1.first().compareTo(aFe1aSDK5.component2.first()) > 0) {
                                        aFe1aSDK5.getMonetizationNetwork(aFe1aSDK5.component1);
                                    } else {
                                        aFe1aSDK5.getMonetizationNetwork(aFe1aSDK5.component2);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK6 = AFg1cSDK.QUEUE;
                    StringBuilder sb6 = new StringBuilder("tried to add already scheduled task: ");
                    sb6.append(this.getMonetizationNetwork);
                    aFLogger6.m5250d(aFg1cSDK6, sb6.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AFe1aSDK(ExecutorService executorService) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        this.AFAdRevenueData = executorServiceNewSingleThreadExecutor;
        this.getRevenue = new Timer(true);
        this.getCurrencyIso4217Code = new CopyOnWriteArrayList();
        this.getMediationNetwork = new CopyOnWriteArraySet();
        this.areAllFieldsValid = Collections.newSetFromMap(new ConcurrentHashMap());
        this.component1 = new ConcurrentSkipListSet();
        this.component2 = new ConcurrentSkipListSet();
        this.component4 = new ArrayList();
        this.component3 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.getMonetizationNetwork = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AFAdRevenueData(AFf1wSDK<?> aFf1wSDK) {
        return this.getMediationNetwork.containsAll(aFf1wSDK.getCurrencyIso4217Code);
    }

    @VisibleForTesting
    public static boolean getMediationNetwork(AFf1wSDK<?> aFf1wSDK) {
        return ((aFf1wSDK instanceof AFf1fSDK) && aFf1wSDK.AFAdRevenueData == AFf1zSDK.ARS_VALIDATE) ? false : true;
    }

    public static /* synthetic */ void getRevenue(AFe1aSDK aFe1aSDK) {
        synchronized (aFe1aSDK.component1) {
            try {
                Iterator<AFf1wSDK<?>> it = aFe1aSDK.component2.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    AFf1wSDK<?> next = it.next();
                    if (aFe1aSDK.AFAdRevenueData(next)) {
                        it.remove();
                        aFe1aSDK.component1.add(next);
                        z = true;
                    }
                }
                if (z) {
                    aFe1aSDK.getMonetizationNetwork.submit(aFe1aSDK.new RunnableC09572());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void getMonetizationNetwork(NavigableSet<AFf1wSDK<?>> navigableSet) {
        AFf1wSDK<?> aFf1wSDKPollFirst = navigableSet.pollFirst();
        this.getMediationNetwork.add(aFf1wSDKPollFirst.AFAdRevenueData);
        Iterator<AFe1eSDK> it = this.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            it.next().getMonetizationNetwork(aFf1wSDKPollFirst);
        }
    }
}

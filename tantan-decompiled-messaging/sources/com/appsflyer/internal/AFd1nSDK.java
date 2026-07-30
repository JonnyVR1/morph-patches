package com.appsflyer.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1nSDK implements AFd1fSDK {
    private static final int getCurrencyIso4217Code = 30000;
    private ScheduledExecutorService AFAdRevenueData;
    private AFg1rSDK AFInAppEventParameterName;
    private AFi1lSDK AFInAppEventType;
    private AFe1fSDK AFKeystoreWrapper;
    private AFd1wSDK AFLogger;
    private AFd1mSDK afErrorLog;
    private AFb1zSDK afInfoLog;
    private AFg1kSDK afRDLog;

    @Nullable
    private AFi1mSDK afVerboseLog;
    private AFd1pSDK areAllFieldsValid;
    private PurchaseHandler component1;
    private AFe1tSDK component2;
    private AFh1qSDK component3;
    private AFg1wSDK component4;
    private AFe1aSDK copy;
    private AFg1fSDK copydefault;

    /* JADX INFO: renamed from: d */
    private AFd1vSDK f4251d;

    /* JADX INFO: renamed from: e */
    private AFi1xSDK f4252e;
    private AFb1bSDK equals;
    private AFh1vSDK force;
    public final AFd1kSDK getMediationNetwork = new AFd1kSDK();
    private ExecutorService getMonetizationNetwork;
    private ExecutorService getRevenue;
    private AFj1vSDK hashCode;

    /* JADX INFO: renamed from: i */
    private AFg1nSDK f4253i;
    private AFc1eSDK registerClient;
    private AFj1uSDK toString;
    private AFc1sSDK unregisterClient;

    /* JADX INFO: renamed from: v */
    private AFi1pSDK f4254v;
    private AFd1dSDK valueOf;
    private AFb1uSDK values;

    /* JADX INFO: renamed from: w */
    private AFc1oSDK f4255w;

    public static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getRevenue = new AtomicInteger();

        public AFa1zSDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = getCurrencyIso4217Code.get();
            int iIncrementAndGet = this.getRevenue.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(iIncrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    /* JADX INFO: renamed from: afErrorLog, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1dSDK afDebugLog() {
        try {
            if (this.valueOf == null) {
                this.valueOf = new AFd1dSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.valueOf;
    }

    @NonNull
    private synchronized AFe1tSDK afRDLog() {
        try {
            if (this.component2 == null) {
                this.component2 = new AFe1tSDK(new AFe1nSDK(getCurrencyIso4217Code), AFAdRevenueData());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component2;
    }

    @NonNull
    private synchronized ExecutorService afVerboseLog() {
        try {
            if (this.getRevenue == null) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                executorServiceNewSingleThreadExecutor.getClass();
                this.getRevenue = executorServiceNewSingleThreadExecutor;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getRevenue;
    }

    @NonNull
    private synchronized AFg1kSDK afWarnLog() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = new AFg1kSDK(valueOf(), getMediationNetwork());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized ExecutorService AFAdRevenueData() {
        try {
            if (this.getMonetizationNetwork == null) {
                this.getMonetizationNetwork = AFd1qSDK.getRevenue();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFi1lSDK AFInAppEventParameterName() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new AFi1nSDK();
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFb1uSDK AFInAppEventType() {
        try {
            if (this.values == null) {
                this.values = new AFb1jSDK(valueOf());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFg1rSDK AFKeystoreWrapper() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = new AFg1rSDK(valueOf(), new AFg1sSDK());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFi1xSDK AFLogger() {
        if (this.f4252e == null) {
            Context context = this.getMediationNetwork.getCurrencyIso4217Code;
            if (context == null) {
                qkq0.m175383a("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            this.f4252e = new AFi1xSDK(context);
        }
        return this.f4252e;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @Nullable
    public final AFi1mSDK afInfoLog() {
        try {
            if (this.afVerboseLog == null) {
                try {
                    Object[] objArr = {getMediationNetwork(), valueOf(), AFKeystoreWrapper()};
                    Map map = AFc1gSDK.registerClient;
                    Object declaredConstructor = map.get(609014363);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFc1gSDK.getCurrencyIso4217Code(Gravity.getAbsoluteGravity(0, 0) + 159, 36 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())))).getDeclaredConstructor(AFd1pSDK.class, AFd1kSDK.class, AFg1rSDK.class);
                        map.put(609014363, declaredConstructor);
                    }
                    this.afVerboseLog = (AFi1mSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5243e(AFg1cSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized PurchaseHandler areAllFieldsValid() {
        try {
            if (this.component1 == null) {
                this.component1 = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFj1uSDK component1() {
        if (this.toString == null) {
            Context context = this.getMediationNetwork.getCurrencyIso4217Code;
            if (context == null) {
                qkq0.m175383a("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            this.toString = new AFj1tSDK(context, afVerboseLog());
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFg1wSDK component2() {
        try {
            if (this.component4 == null) {
                AFg1tSDK aFg1tSDK = new AFg1tSDK(getRevenue());
                this.component4 = new AFg1wSDK(new AFg1xSDK(), getMediationNetwork(), AFKeystoreWrapper(), aFg1tSDK, new AFe1sSDK(afRDLog(), getMediationNetwork(), AppsFlyerProperties.getInstance(), values()), new AFg1vSDK(getMediationNetwork(), aFg1tSDK), copy());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFg1fSDK component3() {
        if (this.copydefault == null) {
            Context context = this.getMediationNetwork.getCurrencyIso4217Code;
            if (context == null) {
                qkq0.m175383a("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new AFi1nSDK();
            }
            AFi1lSDK aFi1lSDK = this.AFInAppEventType;
            if (this.f4251d == null) {
                this.f4251d = new AFa1uSDK();
            }
            AFd1vSDK aFd1vSDK = this.f4251d;
            if (this.toString == null) {
                Context context2 = this.getMediationNetwork.getCurrencyIso4217Code;
                if (context2 == null) {
                    qkq0.m175383a("Context must be set via setContext method before calling this dependency.");
                    return null;
                }
                this.toString = new AFj1tSDK(context2, afVerboseLog());
            }
            AFj1uSDK aFj1uSDK = this.toString;
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFa1aSDK();
            }
            AFb1zSDK aFb1zSDK = this.afInfoLog;
            AFh1qSDK aFh1qSDKComponent4 = component4();
            AFd1rSDK revenue = getRevenue();
            AFd1pSDK mediationNetwork = getMediationNetwork();
            if (this.f4252e == null) {
                Context context3 = this.getMediationNetwork.getCurrencyIso4217Code;
                if (context3 == null) {
                    qkq0.m175383a("Context must be set via setContext method before calling this dependency.");
                    return null;
                }
                this.f4252e = new AFi1xSDK(context3);
            }
            AFi1xSDK aFi1xSDK = this.f4252e;
            AFg1rSDK aFg1rSDKAFKeystoreWrapper = AFKeystoreWrapper();
            AFb1aSDK aFb1aSDK = new AFb1aSDK();
            AFd1kSDK aFd1kSDKValueOf = valueOf();
            AFg1kSDK aFg1kSDKAfWarnLog = afWarnLog();
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFd1mSDK();
            }
            this.copydefault = new AFg1eSDK(context, aFi1lSDK, aFd1vSDK, aFj1uSDK, aFb1zSDK, aFh1qSDKComponent4, revenue, mediationNetwork, aFi1xSDK, aFg1rSDKAFKeystoreWrapper, aFb1aSDK, aFd1kSDKValueOf, aFg1kSDKAfWarnLog, this.afErrorLog);
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFh1qSDK component4() {
        try {
            if (this.component3 == null) {
                this.component3 = new AFh1qSDK(getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFe1aSDK copy() {
        try {
            if (this.copy == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1nSDK.2
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1zSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.m
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFd1nSDK.getRevenue(runnable, threadPoolExecutor2);
                    }
                });
                this.copy = new AFe1aSDK(threadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFb1bSDK copydefault() {
        try {
            if (this.equals == null) {
                this.equals = new AFb1cSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    /* JADX INFO: renamed from: d */
    public final synchronized AFc1eSDK mo5218d() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFd1zSDK(valueOf());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    /* JADX INFO: renamed from: e */
    public final AFd1mSDK mo5219e() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFd1mSDK();
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFj1vSDK equals() {
        try {
            if (this.hashCode == null) {
                this.hashCode = new AFj1vSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFg1nSDK force() {
        if (this.f4253i == null) {
            Context context = this.getMediationNetwork.getCurrencyIso4217Code;
            if (context == null) {
                qkq0.m175383a("Context must be set via setContext method before calling this dependency.");
                return null;
            }
            AFg1pSDK aFg1pSDK = new AFg1pSDK(context, AppsFlyerProperties.getInstance());
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFd1mSDK();
            }
            this.f4253i = new AFg1qSDK(aFg1pSDK, this.afErrorLog, AppsFlyerProperties.getInstance());
        }
        return this.f4253i;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized ScheduledExecutorService getCurrencyIso4217Code() {
        try {
            if (this.AFAdRevenueData == null) {
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
                scheduledExecutorServiceNewScheduledThreadPool.getClass();
                this.AFAdRevenueData = scheduledExecutorServiceNewScheduledThreadPool;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFd1pSDK getMediationNetwork() {
        try {
            if (this.areAllFieldsValid == null) {
                AFd1kSDK aFd1kSDKValueOf = valueOf();
                Context context = this.getMediationNetwork.getCurrencyIso4217Code;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                AFd1tSDK aFd1tSDK = new AFd1tSDK(AFb1tSDK.m5199i_(context));
                if (this.afErrorLog == null) {
                    this.afErrorLog = new AFd1mSDK();
                }
                this.areAllFieldsValid = new AFd1pSDK(aFd1kSDKValueOf, aFd1tSDK, this.afErrorLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFe1sSDK getMonetizationNetwork() {
        return new AFe1sSDK(afRDLog(), getMediationNetwork(), AppsFlyerProperties.getInstance(), values());
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFd1rSDK getRevenue() {
        Context context = this.getMediationNetwork.getCurrencyIso4217Code;
        if (context != null) {
            return new AFd1tSDK(AFb1tSDK.m5199i_(context));
        }
        qkq0.m175383a("Context must be set via setContext method before calling this dependency.");
        return null;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    /* JADX INFO: renamed from: i */
    public final AFd1wSDK mo5220i() {
        if (this.AFLogger == null) {
            ExecutorService executorServiceAfVerboseLog = afVerboseLog();
            ScheduledExecutorService currencyIso4217Code = getCurrencyIso4217Code();
            AFc1sSDK aFc1sSDKUnregisterClient = unregisterClient();
            if (this.f4254v == null) {
                this.f4254v = new AFi1sSDK();
            }
            this.AFLogger = new AFd1xSDK(executorServiceAfVerboseLog, currencyIso4217Code, aFc1sSDKUnregisterClient, this.f4254v);
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFi1pSDK registerClient() {
        if (this.f4254v == null) {
            this.f4254v = new AFi1sSDK();
        }
        return this.f4254v;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFc1sSDK unregisterClient() {
        try {
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFc1sSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    /* JADX INFO: renamed from: v */
    public final AFh1vSDK mo5221v() {
        if (this.force == null) {
            this.force = new AFh1wSDK(this);
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFd1kSDK valueOf() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFe1fSDK values() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = new AFe1fSDK(getMediationNetwork(), getRevenue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    /* JADX INFO: renamed from: w */
    public final AFc1oSDK mo5222w() {
        if (this.f4255w == null) {
            this.f4255w = new AFc1iSDK(getRevenue());
        }
        return this.f4255w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p149l.hzq0;
import p149l.i01;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {

    @NonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();

    @Nullable
    private static GoogleApiManager zad;

    @Nullable
    private TelemetryData zag;

    @Nullable
    private TelemetryLoggingClient zah;
    private final Context zai;
    private final GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;

    @NotOnlyInitialized
    private final Handler zar;
    private volatile boolean zas;
    private long zae = 10000;
    private boolean zaf = false;
    private final AtomicInteger zal = new AtomicInteger(1);
    private final AtomicInteger zam = new AtomicInteger(0);
    private final Map zan = new ConcurrentHashMap(5, 0.75f, 1);

    @Nullable
    private zaae zao = null;
    private final Set zap = new i01();
    private final Set zaq = new i01();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zas = true;
        this.zai = context;
        hzq0 hzq0Var = new hzq0(looper, this);
        this.zar = hzq0Var;
        this.zaj = googleApiAvailability;
        this.zak = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zas = false;
        }
        hzq0Var.sendMessage(hzq0Var.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            try {
                GoogleApiManager googleApiManager = zad;
                if (googleApiManager != null) {
                    googleApiManager.zam.incrementAndGet();
                    Handler handler = googleApiManager.zar;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaF(ApiKey apiKey, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + apiKey.zaa() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @ResultIgnorabilityUnspecified
    @WorkerThread
    private final zabq zaG(GoogleApi googleApi) {
        Map map = this.zan;
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            this.zan.put(apiKey, zabqVar);
        }
        if (zabqVar.zaA()) {
            this.zaq.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    @WorkerThread
    private final TelemetryLoggingClient zaH() {
        if (this.zah == null) {
            this.zah = TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    @WorkerThread
    private final void zaI() {
        TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                zaH().log(telemetryData);
            }
            this.zag = null;
        }
    }

    private final void zaJ(sei0 sei0Var, int i, GoogleApi googleApi) {
        zacd zacdVarZaa;
        if (i == 0 || (zacdVarZaa = zacd.zaa(this, i, googleApi.getApiKey())) == null) {
            return;
        }
        Task taskM183657a = sei0Var.m183657a();
        final Handler handler = this.zar;
        handler.getClass();
        taskM183657a.mo15363b(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zacdVarZaa);
    }

    @NonNull
    public static GoogleApiManager zaj() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static GoogleApiManager zak(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            try {
                if (zad == null) {
                    zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
                }
                googleApiManager = zad;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0207  */
    /* JADX WARN: Code duplicated, block: B:66:0x0214  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01d9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0214, please report this as an issue */
    @Override // android.os.Handler.Callback
    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        int i = message.what;
        long j = Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        zabq zabqVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.zae = j;
                this.zar.removeMessages(12);
                for (ApiKey apiKey : this.zan.keySet()) {
                    Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.zae);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                for (ApiKey apiKey2 : zalVar.zab()) {
                    zabq zabqVar2 = (zabq) this.zan.get(apiKey2);
                    if (zabqVar2 == null) {
                        zalVar.zac(apiKey2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (zabqVar2.zaz()) {
                        zalVar.zac(apiKey2, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultZad = zabqVar2.zad();
                        if (connectionResultZad != null) {
                            zalVar.zac(apiKey2, connectionResultZad, null);
                        } else {
                            zabqVar2.zat(zalVar);
                            zabqVar2.zao();
                        }
                    }
                }
                return true;
            case 3:
                for (zabq zabqVar3 : this.zan.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq zabqVarZaG = (zabq) this.zan.get(zachVar.zac.getApiKey());
                if (zabqVarZaG == null) {
                    zabqVarZaG = zaG(zachVar.zac);
                }
                if (!zabqVarZaG.zaA() || this.zam.get() == zachVar.zab) {
                    zabqVarZaG.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVarZaG.zav();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (zabq zabqVar4 : this.zan.values()) {
                    if (zabqVar4.zab() == i2) {
                        zabqVar = zabqVar4;
                        if (zabqVar != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                        } else if (connectionResult.getErrorCode() == 13) {
                            zabqVar.zaE(new Status(17, "Error resolution was canceled by the user, original error message: " + this.zaj.getErrorString(connectionResult.getErrorCode()) + ": " + connectionResult.getErrorMessage()));
                        } else {
                            zabqVar.zaE(zaF(zabqVar.zad, connectionResult));
                        }
                        return true;
                    }
                }
                if (zabqVar != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    zabqVar.zaE(new Status(17, "Error resolution was canceled by the user, original error message: " + this.zaj.getErrorString(connectionResult.getErrorCode()) + ": " + connectionResult.getErrorMessage()));
                } else {
                    zabqVar.zaE(zaF(zabqVar.zad, connectionResult));
                }
                return true;
            case 6:
                if (this.zai.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zai.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabl(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = Constants.INBOX_V2_THROTTLE_WINDOW_MS;
                    }
                }
                return true;
            case 7:
                zaG((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zau();
                }
                return true;
            case 10:
                Iterator it = this.zaq.iterator();
                while (it.hasNext()) {
                    zabq zabqVar5 = (zabq) this.zan.remove((ApiKey) it.next());
                    if (zabqVar5 != null) {
                        zabqVar5.zav();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaB();
                }
                return true;
            case 14:
                zaaf zaafVar = (zaaf) message.obj;
                ApiKey apiKeyZaa = zaafVar.zaa();
                if (this.zan.containsKey(apiKeyZaa)) {
                    zaafVar.zab().m183659c(Boolean.valueOf(((zabq) this.zan.get(apiKeyZaa)).zaO(false)));
                } else {
                    zaafVar.zab().m183659c(Boolean.FALSE);
                }
                return true;
            case 15:
                zabs zabsVar = (zabs) message.obj;
                if (this.zan.containsKey(zabsVar.zaa)) {
                    zabq.zal((zabq) this.zan.get(zabsVar.zaa), zabsVar);
                }
                return true;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                if (this.zan.containsKey(zabsVar2.zaa)) {
                    zabq.zam((zabq) this.zan.get(zabsVar2.zaa), zabsVar2);
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaH().log(new TelemetryData(zaceVar.zab, Arrays.asList(zaceVar.zaa)));
                } else {
                    TelemetryData telemetryData = this.zag;
                    if (telemetryData != null) {
                        List listZab = telemetryData.zab();
                        if (telemetryData.zaa() != zaceVar.zab || (listZab != null && listZab.size() >= zaceVar.zad)) {
                            this.zar.removeMessages(17);
                            zaI();
                        } else {
                            this.zag.zac(zaceVar.zaa);
                        }
                    }
                    if (this.zag == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zag = new TelemetryData(zaceVar.zab, arrayList);
                        Handler handler2 = this.zar;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                return false;
        }
    }

    public final void zaA(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao != zaaeVar) {
                    this.zao = zaaeVar;
                    this.zap.clear();
                }
                this.zap.addAll(zaaeVar.zaa());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zaB(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao == zaaeVar) {
                    this.zao = null;
                    this.zap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.zak.zaa(this.zai, 203400000);
        return iZaa == -1 || iZaa == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean zaE(ConnectionResult connectionResult, int i) {
        return this.zaj.zah(this.zai, connectionResult, i);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    @Nullable
    public final zabq zai(ApiKey apiKey) {
        return (zabq) this.zan.get(apiKey);
    }

    @NonNull
    public final Task zam(@NonNull Iterable iterable) {
        zal zalVar = new zal(iterable);
        this.zar.sendMessage(this.zar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public final Task zan(@NonNull GoogleApi googleApi) {
        zaaf zaafVar = new zaaf(googleApi.getApiKey());
        this.zar.sendMessage(this.zar.obtainMessage(14, zaafVar));
        return zaafVar.zab().m183657a();
    }

    @NonNull
    public final Task zao(@NonNull GoogleApi googleApi, @NonNull RegisterListenerMethod registerListenerMethod, @NonNull UnregisterListenerMethod unregisterListenerMethod, @NonNull Runnable runnable) {
        sei0 sei0Var = new sei0();
        zaJ(sei0Var, registerListenerMethod.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(8, new zach(new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), sei0Var), this.zam.get(), googleApi)));
        return sei0Var.m183657a();
    }

    @NonNull
    public final Task zap(@NonNull GoogleApi googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i) {
        sei0 sei0Var = new sei0();
        zaJ(sei0Var, i, googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(13, new zach(new zah(listenerKey, sei0Var), this.zam.get(), googleApi)));
        return sei0Var.m183657a();
    }

    public final void zau(@NonNull GoogleApi googleApi, int i, @NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zae(i, apiMethodImpl), this.zam.get(), googleApi)));
    }

    public final void zav(@NonNull GoogleApi googleApi, int i, @NonNull TaskApiCall taskApiCall, @NonNull sei0 sei0Var, @NonNull StatusExceptionMapper statusExceptionMapper) {
        zaJ(sei0Var, taskApiCall.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zag(i, taskApiCall, sei0Var, statusExceptionMapper), this.zam.get(), googleApi)));
    }

    public final void zaw(MethodInvocation methodInvocation, int i, long j, int i2) {
        this.zar.sendMessage(this.zar.obtainMessage(18, new zace(methodInvocation, i, j, i2)));
    }

    public final void zax(@NonNull ConnectionResult connectionResult, int i) {
        if (zaE(connectionResult, i)) {
            return;
        }
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void zay() {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(@NonNull GoogleApi googleApi) {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}

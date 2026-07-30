package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p153l.o8r0;
import p153l.sni0;
import p153l.toi0;
import p153l.zdg0;

/* JADX INFO: loaded from: classes6.dex */
public final class zay extends GoogleApi implements ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final Api.ClientKey zac;
    private static final Api.AbstractClientBuilder zad;
    private static final Api zae;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zac = clientKey;
        zaq zaqVar = new zaq();
        zad = zaqVar;
        zae = new Api("ModuleInstall.API", zaqVar, clientKey);
    }

    public zay(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static final ApiFeatureRequest zad(boolean z, OptionalModuleApi... optionalModuleApiArr) {
        Preconditions.checkNotNull(optionalModuleApiArr, "Requested APIs must not be null.");
        Preconditions.checkArgument(optionalModuleApiArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (OptionalModuleApi optionalModuleApi : optionalModuleApiArr) {
            Preconditions.checkNotNull(optionalModuleApi, "Requested API must not be null.");
        }
        return ApiFeatureRequest.zaa(Arrays.asList(optionalModuleApiArr), z);
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<ModuleAvailabilityResponse> areModulesAvailable(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return toi0.m192068f(new ModuleAvailabilityResponse(true, 0));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(o8r0.f145460a);
        builder.setMethodKey(27301);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zal
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zaf) ((zaz) obj).getService()).zae(new zar(this.zaa, (sni0) obj2), apiFeatureRequestZad);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<Void> deferredInstall(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return toi0.m192068f(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(o8r0.f145460a);
        builder.setMethodKey(27302);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zap
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zaf) ((zaz) obj).getService()).zag(new zas(this.zaa, (sni0) obj2), apiFeatureRequestZad, null);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<ModuleInstallIntentResponse> getInstallModulesIntent(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest apiFeatureRequestZad = zad(true, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return toi0.m192068f(new ModuleInstallIntentResponse(null));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(o8r0.f145460a);
        builder.setMethodKey(27307);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zan
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zaf) ((zaz) obj).getService()).zaf(new zaw(this.zaa, (sni0) obj2), apiFeatureRequestZad);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<ModuleInstallResponse> installModules(ModuleInstallRequest moduleInstallRequest) {
        final ApiFeatureRequest apiFeatureRequestFromModuleInstallRequest = ApiFeatureRequest.fromModuleInstallRequest(moduleInstallRequest);
        final InstallStatusListener listener = moduleInstallRequest.getListener();
        Executor listenerExecutor = moduleInstallRequest.getListenerExecutor();
        if (apiFeatureRequestFromModuleInstallRequest.getApiFeatures().isEmpty()) {
            return toi0.m192068f(new ModuleInstallResponse(0));
        }
        if (listener == null) {
            TaskApiCall.Builder builder = TaskApiCall.builder();
            builder.setFeatures(o8r0.f145460a);
            builder.setAutoResolveMissingFeatures(true);
            builder.setMethodKey(27304);
            builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zao
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    ((zaf) ((zaz) obj).getService()).zag(new zat(this.zaa, (sni0) obj2), apiFeatureRequestFromModuleInstallRequest, null);
                }
            });
            return doRead(builder.build());
        }
        Preconditions.checkNotNull(listener);
        ListenerHolder listenerHolderRegisterListener = listenerExecutor == null ? registerListener(listener, InstallStatusListener.class.getSimpleName()) : ListenerHolders.createListenerHolder(listener, listenerExecutor, InstallStatusListener.class.getSimpleName());
        final zaab zaabVar = new zaab(listenerHolderRegisterListener);
        final AtomicReference atomicReference = new AtomicReference();
        RemoteCall remoteCall = new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zaf) ((zaz) obj).getService()).zag(new zau(this.zaa, atomicReference, (sni0) obj2, listener), apiFeatureRequestFromModuleInstallRequest, zaabVar);
            }
        };
        RemoteCall remoteCall2 = new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zaf) ((zaz) obj).getService()).zai(new zav(this.zaa, (sni0) obj2), zaabVar);
            }
        };
        RegistrationMethods.Builder builder2 = RegistrationMethods.builder();
        builder2.withHolder(listenerHolderRegisterListener);
        builder2.setFeatures(o8r0.f145460a);
        builder2.setAutoResolveMissingFeatures(true);
        builder2.register(remoteCall);
        builder2.unregister(remoteCall2);
        builder2.setMethodKey(27305);
        return doRegisterEventListener(builder2.build()).mo15433r(new zdg0() { // from class: com.google.android.gms.common.moduleinstall.internal.zak
            @Override // p153l.zdg0
            public final Task then(Object obj) {
                int i = zay.zab;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? toi0.m192068f((ModuleInstallResponse) atomicReference2.get()) : toi0.m192067e(new ApiException(Status.RESULT_INTERNAL_ERROR));
            }
        });
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final Task<Void> releaseModules(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest apiFeatureRequestZad = zad(false, optionalModuleApiArr);
        if (apiFeatureRequestZad.getApiFeatures().isEmpty()) {
            return toi0.m192068f(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(o8r0.f145460a);
        builder.setMethodKey(27303);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zam
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zaf) ((zaz) obj).getService()).zah(new zax(this.zaa, (sni0) obj2), apiFeatureRequestZad);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    @ResultIgnorabilityUnspecified
    public final Task<Boolean> unregisterListener(InstallStatusListener installStatusListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(installStatusListener, InstallStatusListener.class.getSimpleName()), 27306);
    }

    public zay(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}

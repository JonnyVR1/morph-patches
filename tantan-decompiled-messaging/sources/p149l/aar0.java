package p149l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zza;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzm;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class aar0 extends GoogleApi implements ActivityRecognitionClient {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey f68601a;

    /* JADX INFO: renamed from: b */
    public static final Api f68602b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f68601a = clientKey;
        f68602b = new Api("ActivityRecognition.API", new x5r0(), clientKey);
    }

    public aar0(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f68602b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.rty0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = aar0.f68601a;
                u8r0 u8r0Var = new u8r0((sei0) obj2);
                Preconditions.checkNotNull(u8r0Var, "ResultHolder not provided.");
                ((iby0) ((sov0) obj).getService()).mo135292f1(pendingIntent2, new StatusCallback(u8r0Var));
            }
        }).setMethodKey(2406).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.kvy0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = aar0.f68601a;
                ((sov0) obj).m185304c(pendingIntent2);
                ((sei0) obj2).m183659c(null);
            }
        }).setMethodKey(2402).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.c3r0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = aar0.f68601a;
                u8r0 u8r0Var = new u8r0((sei0) obj2);
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(u8r0Var, "ResultHolder not provided.");
                ((iby0) ((sov0) obj).getService()).mo135288c2(pendingIntent2, new StatusCallback(u8r0Var));
            }
        }).setMethodKey(2411).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> requestActivityTransitionUpdates(final ActivityTransitionRequest activityTransitionRequest, final PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.s1r0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ActivityTransitionRequest activityTransitionRequest2 = activityTransitionRequest;
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = aar0.f68601a;
                u8r0 u8r0Var = new u8r0((sei0) obj2);
                Preconditions.checkNotNull(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(u8r0Var, "ResultHolder not provided.");
                ((iby0) ((sov0) obj).getService()).mo135280N3(activityTransitionRequest2, pendingIntent2, new StatusCallback(u8r0Var));
            }
        }).setMethodKey(2405).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> requestActivityUpdates(long j, final PendingIntent pendingIntent) {
        zza zzaVar = new zza();
        zzaVar.zza(j);
        final zzb zzbVarZzb = zzaVar.zzb();
        zzbVarZzb.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.ixy0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzb zzbVar = zzbVarZzb;
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = aar0.f68601a;
                u8r0 u8r0Var = new u8r0((sei0) obj2);
                Preconditions.checkNotNull(zzbVar, "ActivityRecognitionRequest can't be null.");
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(u8r0Var, "ResultHolder not provided.");
                ((iby0) ((sov0) obj).getService()).mo135297z2(zzbVar, pendingIntent2, new StatusCallback(u8r0Var));
            }
        }).setMethodKey(2401).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final SleepSegmentRequest sleepSegmentRequest) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.l4r0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                aar0 aar0Var = this.f126054a;
                ((iby0) ((sov0) obj).getService()).mo135281P0(pendingIntent, sleepSegmentRequest, new i7r0(aar0Var, (sei0) obj2));
            }
        }).setFeatures(zzm.zzb).setMethodKey(2410).build());
    }

    public aar0(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f68602b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}

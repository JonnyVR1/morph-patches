package p153l;

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
public final class gjr0 extends GoogleApi implements ActivityRecognitionClient {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey f104647a;

    /* JADX INFO: renamed from: b */
    public static final Api f104648b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f104647a = clientKey;
        f104648b = new Api("ActivityRecognition.API", new dfr0(), clientKey);
    }

    public gjr0(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f104648b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.x2z0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = gjr0.f104647a;
                air0 air0Var = new air0((sni0) obj2);
                Preconditions.checkNotNull(air0Var, "ResultHolder not provided.");
                ((oky0) ((yxv0) obj).getService()).mo168081f1(pendingIntent2, new StatusCallback(air0Var));
            }
        }).setMethodKey(2406).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.q4z0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = gjr0.f104647a;
                ((yxv0) obj).m217740c(pendingIntent2);
                ((sni0) obj2).m186941c(null);
            }
        }).setMethodKey(2402).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.icr0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = gjr0.f104647a;
                air0 air0Var = new air0((sni0) obj2);
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(air0Var, "ResultHolder not provided.");
                ((oky0) ((yxv0) obj).getService()).mo168077c2(pendingIntent2, new StatusCallback(air0Var));
            }
        }).setMethodKey(2411).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> requestActivityTransitionUpdates(final ActivityTransitionRequest activityTransitionRequest, final PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.yar0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ActivityTransitionRequest activityTransitionRequest2 = activityTransitionRequest;
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = gjr0.f104647a;
                air0 air0Var = new air0((sni0) obj2);
                Preconditions.checkNotNull(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(air0Var, "ResultHolder not provided.");
                ((oky0) ((yxv0) obj).getService()).mo168069N3(activityTransitionRequest2, pendingIntent2, new StatusCallback(air0Var));
            }
        }).setMethodKey(2405).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> requestActivityUpdates(long j, final PendingIntent pendingIntent) {
        zza zzaVar = new zza();
        zzaVar.zza(j);
        final zzb zzbVarZzb = zzaVar.zzb();
        zzbVarZzb.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.o6z0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzb zzbVar = zzbVarZzb;
                PendingIntent pendingIntent2 = pendingIntent;
                Api.ClientKey clientKey = gjr0.f104647a;
                air0 air0Var = new air0((sni0) obj2);
                Preconditions.checkNotNull(zzbVar, "ActivityRecognitionRequest can't be null.");
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(air0Var, "ResultHolder not provided.");
                ((oky0) ((yxv0) obj).getService()).mo168086z2(zzbVar, pendingIntent2, new StatusCallback(air0Var));
            }
        }).setMethodKey(2401).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final SleepSegmentRequest sleepSegmentRequest) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.rdr0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                gjr0 gjr0Var = this.f162353a;
                ((oky0) ((yxv0) obj).getService()).mo168070P0(pendingIntent, sleepSegmentRequest, new ogr0(gjr0Var, (sni0) obj2));
            }
        }).setFeatures(zzm.zzb).setMethodKey(2410).build());
    }

    public gjr0(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f104648b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}

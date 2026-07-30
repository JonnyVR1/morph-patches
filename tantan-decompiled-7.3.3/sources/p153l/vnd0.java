package p153l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class vnd0 {

    /* JADX INFO: renamed from: h */
    public static int f184863h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f184864i;

    /* JADX INFO: renamed from: j */
    public static final Executor f184865j = new Executor() { // from class: l.z4z0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k */
    public static final Pattern f184866k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f184868b;

    /* JADX INFO: renamed from: c */
    public final r1z0 f184869c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f184870d;

    /* JADX INFO: renamed from: f */
    public Messenger f184872f;

    /* JADX INFO: renamed from: g */
    public zzd f184873g;

    /* JADX INFO: renamed from: a */
    public final oof0 f184867a = new oof0();

    /* JADX INFO: renamed from: e */
    public final Messenger f184871e = new Messenger(new lgr0(this, Looper.getMainLooper()));

    public vnd0(@NonNull Context context) {
        this.f184868b = context;
        this.f184869c = new r1z0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f184870d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Task m201982e(Bundle bundle) throws Exception {
        return m201986m(bundle) ? toi0.m192068f(null) : toi0.m192068f(bundle);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m201983g(vnd0 vnd0Var, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new n5t0());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        vnd0Var.f184873g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        vnd0Var.f184872f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f184866k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        vnd0Var.m201994l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (vnd0Var.f184867a) {
                        for (int i = 0; i < vnd0Var.f184867a.size(); i++) {
                            try {
                                vnd0Var.m201994l((String) vnd0Var.f184867a.m168582i(i), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                vnd0Var.m201994l(str, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static synchronized String m201984j() {
        int i;
        i = f184863h;
        f184863h = i + 1;
        return Integer.toString(i);
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m201985k(Context context, Intent intent) {
        try {
            if (f184864i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f184864i = PendingIntent.getBroadcast(context, 0, intent2, k9r0.f124571a);
            }
            intent.putExtra("app", f184864i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m201986m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<CloudMessage> m201987a() {
        return this.f184869c.m179458a() >= 241100000 ? f0z0.m123536b(this.f184868b).m123539d(5, Bundle.EMPTY).mo15422g(f184865j, new s26() { // from class: l.ecr0
            @Override // p153l.s26
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.mo15427l()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : toi0.m192067e(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Task<Void> m201988b(@NonNull CloudMessage cloudMessage) {
        if (this.f184869c.m179458a() < 233700000) {
            return toi0.m192067e(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage.getMessageId());
        Integer numM12503H = cloudMessage.m12503H();
        if (numM12503H != null) {
            bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numM12503H.intValue());
        }
        return f0z0.m123536b(this.f184868b).m123538c(3, bundle);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Task<Bundle> m201989c(@NonNull final Bundle bundle) {
        if (this.f184869c.m179458a() < 12000000) {
            return this.f184869c.m179459b() != 0 ? m201993i(bundle).mo15424i(f184865j, new s26() { // from class: l.k6z0
                @Override // p153l.s26
                public final Object then(Task task) {
                    return this.f124226a.m201991f(bundle, task);
                }
            }) : toi0.m192067e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return f0z0.m123536b(this.f184868b).m123539d(1, bundle).mo15422g(f184865j, new s26() { // from class: l.uar0
            @Override // p153l.s26
            public final Object then(Task task) throws IOException {
                if (task.mo15431p()) {
                    return (Bundle) task.mo15427l();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(task.mo15426k()));
                }
                throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, task.mo15426k());
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Task<Void> m201990d(boolean z) {
        if (this.f184869c.m179458a() < 241100000) {
            return toi0.m192067e(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        return f0z0.m123536b(this.f184868b).m123538c(4, bundle);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Task m201991f(Bundle bundle, Task task) throws Exception {
        return (task.mo15431p() && m201986m((Bundle) task.mo15427l())) ? m201993i(bundle).mo15432q(f184865j, new zdg0() { // from class: l.h3z0
            @Override // p153l.zdg0
            public final Task then(Object obj) {
                return vnd0.m201982e((Bundle) obj);
            }
        }) : task;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m201992h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f184867a) {
            this.f184867a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    @AnyThread
    /* JADX INFO: renamed from: i */
    public final Task m201993i(Bundle bundle) {
        int iM179459b;
        Context context;
        final String strM201984j = m201984j();
        final sni0 sni0Var = new sni0();
        synchronized (this.f184867a) {
            this.f184867a.put(strM201984j, sni0Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f184869c.m179459b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m201985k(this.f184868b, intent);
        intent.putExtra("kid", "|ID|" + strM201984j + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f184871e);
        if (this.f184872f == null && this.f184873g == null) {
            iM179459b = this.f184869c.m179459b();
            context = this.f184868b;
            if (iM179459b == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f184872f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f184873g.m12505b(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                iM179459b = this.f184869c.m179459b();
                context = this.f184868b;
                if (iM179459b == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f184870d.schedule(new Runnable() { // from class: l.odr0
            @Override // java.lang.Runnable
            public final void run() {
                sni0Var.m186942d(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        sni0Var.m186939a().mo15417b(f184865j, new OnCompleteListener() { // from class: l.afr0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f71045a.m201992h(strM201984j, scheduledFutureSchedule, task);
            }
        });
        return sni0Var.m186939a();
    }

    /* JADX INFO: renamed from: l */
    public final void m201994l(String str, @Nullable Bundle bundle) {
        synchronized (this.f184867a) {
            try {
                sni0 sni0Var = (sni0) this.f184867a.remove(str);
                if (sni0Var == null) {
                    return;
                }
                sni0Var.m186941c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package p149l;

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
public class sfd0 {

    /* JADX INFO: renamed from: h */
    public static int f164275h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f164276i;

    /* JADX INFO: renamed from: j */
    public static final Executor f164277j = new Executor() { // from class: l.tvy0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k */
    public static final Pattern f164278k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f164280b;

    /* JADX INFO: renamed from: c */
    public final lsy0 f164281c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f164282d;

    /* JADX INFO: renamed from: f */
    public Messenger f164284f;

    /* JADX INFO: renamed from: g */
    public zzd f164285g;

    /* JADX INFO: renamed from: a */
    public final hgf0 f164279a = new hgf0();

    /* JADX INFO: renamed from: e */
    public final Messenger f164283e = new Messenger(new f7r0(this, Looper.getMainLooper()));

    public sfd0(@NonNull Context context) {
        this.f164280b = context;
        this.f164281c = new lsy0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f164282d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Task m183910e(Bundle bundle) throws Exception {
        return m183914m(bundle) ? tfi0.m188734f(null) : tfi0.m188734f(bundle);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m183911g(sfd0 sfd0Var, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new hws0());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        sfd0Var.f164285g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        sfd0Var.f164284f = (Messenger) parcelableExtra;
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
                    Matcher matcher = f164278k.matcher(stringExtra);
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
                        sfd0Var.m183922l(strGroup, extras);
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
                    synchronized (sfd0Var.f164279a) {
                        for (int i = 0; i < sfd0Var.f164279a.size(); i++) {
                            try {
                                sfd0Var.m183922l((String) sfd0Var.f164279a.m130823i(i), intent2.getExtras());
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
                sfd0Var.m183922l(str, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static synchronized String m183912j() {
        int i;
        i = f164275h;
        f164275h = i + 1;
        return Integer.toString(i);
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m183913k(Context context, Intent intent) {
        try {
            if (f164276i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f164276i = PendingIntent.getBroadcast(context, 0, intent2, e0r0.f88668a);
            }
            intent.putExtra("app", f164276i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m183914m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<CloudMessage> m183915a() {
        return this.f164281c.m151654a() >= 241100000 ? zqy0.m219907b(this.f164280b).m219910d(5, Bundle.EMPTY).mo15368g(f164277j, new n16() { // from class: l.y2r0
            @Override // p149l.n16
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.mo15373l()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : tfi0.m188733e(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Task<Void> m183916b(@NonNull CloudMessage cloudMessage) {
        if (this.f164281c.m151654a() < 233700000) {
            return tfi0.m188733e(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage.getMessageId());
        Integer numM12449H = cloudMessage.m12449H();
        if (numM12449H != null) {
            bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numM12449H.intValue());
        }
        return zqy0.m219907b(this.f164280b).m219909c(3, bundle);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Task<Bundle> m183917c(@NonNull final Bundle bundle) {
        if (this.f164281c.m151654a() < 12000000) {
            return this.f164281c.m151655b() != 0 ? m183921i(bundle).mo15370i(f164277j, new n16() { // from class: l.exy0
                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.f93707a.m183919f(bundle, task);
                }
            }) : tfi0.m188733e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zqy0.m219907b(this.f164280b).m219910d(1, bundle).mo15368g(f164277j, new n16() { // from class: l.o1r0
            @Override // p149l.n16
            public final Object then(Task task) throws IOException {
                if (task.mo15377p()) {
                    return (Bundle) task.mo15373l();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(task.mo15372k()));
                }
                throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, task.mo15372k());
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Task<Void> m183918d(boolean z) {
        if (this.f164281c.m151654a() < 241100000) {
            return tfi0.m188733e(new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        return zqy0.m219907b(this.f164280b).m219909c(4, bundle);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Task m183919f(Bundle bundle, Task task) throws Exception {
        return (task.mo15377p() && m183914m((Bundle) task.mo15373l())) ? m183921i(bundle).mo15378q(f164277j, new r5g0() { // from class: l.buy0
            @Override // p149l.r5g0
            public final Task then(Object obj) {
                return sfd0.m183910e((Bundle) obj);
            }
        }) : task;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m183920h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f164279a) {
            this.f164279a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    @AnyThread
    /* JADX INFO: renamed from: i */
    public final Task m183921i(Bundle bundle) {
        int iM151655b;
        Context context;
        final String strM183912j = m183912j();
        final sei0 sei0Var = new sei0();
        synchronized (this.f164279a) {
            this.f164279a.put(strM183912j, sei0Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f164281c.m151655b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m183913k(this.f164280b, intent);
        intent.putExtra("kid", "|ID|" + strM183912j + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f164283e);
        if (this.f164284f == null && this.f164285g == null) {
            iM151655b = this.f164281c.m151655b();
            context = this.f164280b;
            if (iM151655b == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f164284f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f164285g.m12451b(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                iM151655b = this.f164281c.m151655b();
                context = this.f164280b;
                if (iM151655b == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f164282d.schedule(new Runnable() { // from class: l.i4r0
            @Override // java.lang.Runnable
            public final void run() {
                sei0Var.m183660d(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        sei0Var.m183657a().mo15363b(f164277j, new OnCompleteListener() { // from class: l.u5r0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f174749a.m183920h(strM183912j, scheduledFutureSchedule, task);
            }
        });
        return sei0Var.m183657a();
    }

    /* JADX INFO: renamed from: l */
    public final void m183922l(String str, @Nullable Bundle bundle) {
        synchronized (this.f164279a) {
            try {
                sei0 sei0Var = (sei0) this.f164279a.remove(str);
                if (sei0Var == null) {
                    return;
                }
                sei0Var.m183659c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import androidx.room.C0669f;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.room.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\"\u0010%\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010H\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b*\u0010F\u001a\u0004\b;\u0010GR\u0017\u0010I\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b2\u0010F\u001a\u0004\b.\u0010G¨\u0006J"}, m87232d2 = {"Landroidx/room/f;", "", "Landroid/content/Context;", "context", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/content/Intent;", "serviceIntent", "Landroidx/room/e;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroidx/room/e;Ljava/util/concurrent/Executor;)V", "", "m", "()V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/e;", "e", "()Landroidx/room/e;", "c", "Ljava/util/concurrent/Executor;", Constants.INAPP_DATA_TAG, "()Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "", "I", "()I", "setClientId", "(I)V", "clientId", "Landroidx/room/e$c;", "f", "Landroidx/room/e$c;", "()Landroidx/room/e$c;", "k", "(Landroidx/room/e$c;)V", "observer", "Landroidx/room/d;", "g", "Landroidx/room/d;", "h", "()Landroidx/room/d;", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroidx/room/d;)V", NotificationCompat.CATEGORY_SERVICE, "Landroidx/room/c;", "Landroidx/room/c;", "getCallback", "()Landroidx/room/c;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C0669f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0668e invalidationTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Context appContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int clientId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public C0668e.c observer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC0667d service;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0666c callback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean stopped;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Runnable setUpRunnable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Runnable removeObserverRunnable;

    /* JADX INFO: renamed from: androidx.room.f$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m87232d2 = {"androidx/room/f$a", "Landroidx/room/e$c;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class a extends C0668e.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C0668e.c
        /* JADX INFO: renamed from: b */
        public boolean mo3971b() {
            return true;
        }

        @Override // androidx.room.C0668e.c
        /* JADX INFO: renamed from: c */
        public void mo3906c(@NotNull Set<String> tables) {
            tables.getClass();
            if (C0669f.this.getStopped().get()) {
                return;
            }
            try {
                InterfaceC0667d service = C0669f.this.getService();
                if (service != null) {
                    service.mo3908h6(C0669f.this.getClientId(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.f$b */
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"androidx/room/f$b", "Landroidx/room/c$a;", "", "", "tables", "", "J0", "([Ljava/lang/String;)V", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class b extends InterfaceC0666c.a {
        public b() {
        }

        /* JADX INFO: renamed from: P2 */
        public static void m3989P2(C0669f c0669f, String[] strArr) {
            c0669f.getClass();
            strArr.getClass();
            c0669f.getInvalidationTracker().m3952k((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // androidx.room.InterfaceC0666c
        /* JADX INFO: renamed from: J0 */
        public void mo3939J0(@NotNull final String[] tables) {
            tables.getClass();
            Executor executor = C0669f.this.getExecutor();
            final C0669f c0669f = C0669f.this;
            executor.execute(new Runnable() { // from class: l.ck10
                @Override // java.lang.Runnable
                public final void run() {
                    C0669f.b.m3989P2(c0669f, tables);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.room.f$c */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"androidx/room/f$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            name.getClass();
            service.getClass();
            C0669f.this.m3987l(InterfaceC0667d.a.m3941O(service));
            C0669f.this.getExecutor().execute(C0669f.this.getSetUpRunnable());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            name.getClass();
            C0669f.this.getExecutor().execute(C0669f.this.getRemoveObserverRunnable());
            C0669f.this.m3987l(null);
        }
    }

    public C0669f(@NotNull Context context, @NotNull String str, @NotNull Intent intent, @NotNull C0668e c0668e, @NotNull Executor executor) {
        context.getClass();
        str.getClass();
        intent.getClass();
        c0668e.getClass();
        executor.getClass();
        this.name = str;
        this.invalidationTracker = c0668e;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new b();
        this.stopped = new AtomicBoolean(false);
        c cVar = new c();
        this.serviceConnection = cVar;
        this.setUpRunnable = new Runnable() { // from class: l.ak10
            @Override // java.lang.Runnable
            public final void run() {
                C0669f.m3977b(this.f70232a);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: l.bk10
            @Override // java.lang.Runnable
            public final void run() {
                C0669f.m3976a(this.f75960a);
            }
        };
        m3986k(new a((String[]) c0668e.m3950i().keySet().toArray(new String[0])));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* JADX INFO: renamed from: a */
    public static void m3976a(C0669f c0669f) {
        c0669f.getClass();
        c0669f.invalidationTracker.m3955n(c0669f.m3981f());
    }

    /* JADX INFO: renamed from: b */
    public static void m3977b(C0669f c0669f) {
        c0669f.getClass();
        try {
            InterfaceC0667d interfaceC0667d = c0669f.service;
            if (interfaceC0667d != null) {
                c0669f.clientId = interfaceC0667d.mo3907S6(c0669f.callback, c0669f.name);
                c0669f.invalidationTracker.m3944c(c0669f.m3981f());
            }
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getClientId() {
        return this.clientId;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C0668e getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C0668e.c m3981f() {
        C0668e.c cVar = this.observer;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.m87502r("observer");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC0667d getService() {
        return this.service;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    /* JADX INFO: renamed from: k */
    public final void m3986k(@NotNull C0668e.c cVar) {
        cVar.getClass();
        this.observer = cVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m3987l(@Nullable InterfaceC0667d interfaceC0667d) {
        this.service = interfaceC0667d;
    }

    /* JADX INFO: renamed from: m */
    public final void m3988m() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.m3955n(m3981f());
            try {
                InterfaceC0667d interfaceC0667d = this.service;
                if (interfaceC0667d != null) {
                    interfaceC0667d.mo3909k8(this.callback, this.clientId);
                }
            } catch (RemoteException unused) {
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}

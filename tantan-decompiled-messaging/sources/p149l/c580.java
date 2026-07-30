package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.data.Shows;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0001\u0015B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH$¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0004¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010\u0016J\u0019\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b)\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00100R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010;¨\u0006<"}, m87232d2 = {"Ll/c580;", "Landroid/content/ServiceConnection;", "Landroid/content/Context;", "context", "", "requestMessage", "replyMessage", "protocolVersion", "", "applicationId", "nonce", "<init>", "(Landroid/content/Context;IIILjava/lang/String;Ljava/lang/String;)V", "Ll/c580$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "g", "(Ll/c580$b;)V", "", "h", "()Z", "b", "()V", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "Landroid/os/Bundle;", "data", "e", "(Landroid/os/Bundle;)V", "Landroid/os/Message;", "message", Constants.INAPP_DATA_TAG, "(Landroid/os/Message;)V", "f", LovePlanetStage.result, "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Ll/c580$b;", "Z", "running", "Landroid/os/Messenger;", "Landroid/os/Messenger;", Shows.sender, "I", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "j", "getNonce", "()Ljava/lang/String;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public abstract class c580 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC16072b listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean running;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Messenger sender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int requestMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int replyMessage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String applicationId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int protocolVersion;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final String nonce;

    /* JADX INFO: renamed from: l.c580$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/c580$a", "Landroid/os/Handler;", "Landroid/os/Message;", "message", "", "handleMessage", "(Landroid/os/Message;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class HandlerC16071a extends Handler {
        public HandlerC16071a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                if (lsb.m151554d(this)) {
                    return;
                }
                try {
                    message.getClass();
                    c580.this.m105283d(message);
                } catch (Throwable th) {
                    lsb.m151552b(th, this);
                }
            } catch (Throwable th2) {
                lsb.m151552b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.c580$b */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/c580$b;", "", "Landroid/os/Bundle;", LovePlanetStage.result, "", "a", "(Landroid/os/Bundle;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public interface InterfaceC16072b {
        /* JADX INFO: renamed from: a */
        void mo105288a(@Nullable Bundle result);
    }

    public c580(@NotNull Context context, int i, int i2, int i3, @NotNull String str, @Nullable String str2) {
        context.getClass();
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext != null ? applicationContext : context;
        this.requestMessage = i;
        this.replyMessage = i2;
        this.applicationId = str;
        this.protocolVersion = i3;
        this.nonce = str2;
        this.handler = new HandlerC16071a();
    }

    /* JADX INFO: renamed from: a */
    public final void m105280a(Bundle result) {
        if (this.running) {
            this.running = false;
            InterfaceC16072b interfaceC16072b = this.listener;
            if (interfaceC16072b == null) {
                return;
            }
            interfaceC16072b.mo105288a(result);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m105281b() {
        this.running = false;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: d */
    public final void m105283d(@NotNull Message message) {
        message.getClass();
        if (message.what == this.replyMessage) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m105280a(null);
            } else {
                m105280a(data);
            }
            try {
                this.context.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo105284e(@NotNull Bundle data);

    /* JADX INFO: renamed from: f */
    public final void m105285f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.applicationId);
        String str = this.nonce;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        mo105284e(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.requestMessage);
        messageObtain.arg1 = this.protocolVersion;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.handler);
        try {
            Messenger messenger = this.sender;
            if (messenger == null) {
                return;
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            m105280a(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m105286g(@Nullable InterfaceC16072b listener) {
        this.listener = listener;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m105287h() {
        synchronized (this) {
            boolean z = false;
            if (this.running) {
                return false;
            }
            p620 p620Var = p620.INSTANCE;
            if (p620.m167591t(this.protocolVersion) == -1) {
                return false;
            }
            Intent intentM167585l = p620.m167585l(getContext());
            if (intentM167585l != null) {
                z = true;
                this.running = true;
                getContext().bindService(intentM167585l, this, 1);
            }
            return z;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        name.getClass();
        service.getClass();
        this.sender = new Messenger(service);
        m105285f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName name) {
        name.getClass();
        this.sender = null;
        try {
            this.context.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m105280a(null);
    }
}

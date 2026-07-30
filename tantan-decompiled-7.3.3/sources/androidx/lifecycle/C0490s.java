package androidx.lifecycle;

import android.os.Handler;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ker;

/* JADX INFO: renamed from: androidx.lifecycle.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Landroidx/lifecycle/s;", "", "Ll/ker;", "provider", "<init>", "(Ll/ker;)V", "", "c", "()V", "b", "e", Constants.INAPP_DATA_TAG, "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "f", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/k;", "a", "Landroidx/lifecycle/k;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/s$a;", "Landroidx/lifecycle/s$a;", "lastDispatchRunnable", "Landroidx/lifecycle/Lifecycle;", "()Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "lifecycle-service_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class C0490s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0482k registry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public a lastDispatchRunnable;

    /* JADX INFO: renamed from: androidx.lifecycle.s$a */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Landroidx/lifecycle/s$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/k;", "registry", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Landroidx/lifecycle/k;Landroidx/lifecycle/Lifecycle$Event;)V", "", "run", "()V", "a", "Landroidx/lifecycle/k;", "b", "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "", "c", "Z", "wasExecuted", "lifecycle-service_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C0482k registry;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Lifecycle.Event event;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean wasExecuted;

        public a(@NotNull C0482k c0482k, @NotNull Lifecycle.Event event) {
            c0482k.getClass();
            event.getClass();
            this.registry = c0482k;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.m3029i(this.event);
            this.wasExecuted = true;
        }
    }

    public C0490s(@NotNull ker kerVar) {
        kerVar.getClass();
        this.registry = new C0482k(kerVar);
        this.handler = new Handler();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public Lifecycle m3068a() {
        return this.registry;
    }

    /* JADX INFO: renamed from: b */
    public void m3069b() {
        m3073f(Lifecycle.Event.ON_START);
    }

    /* JADX INFO: renamed from: c */
    public void m3070c() {
        m3073f(Lifecycle.Event.ON_CREATE);
    }

    /* JADX INFO: renamed from: d */
    public void m3071d() {
        m3073f(Lifecycle.Event.ON_STOP);
        m3073f(Lifecycle.Event.ON_DESTROY);
    }

    /* JADX INFO: renamed from: e */
    public void m3072e() {
        m3073f(Lifecycle.Event.ON_START);
    }

    /* JADX INFO: renamed from: f */
    public final void m3073f(Lifecycle.Event event) {
        a aVar = this.lastDispatchRunnable;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.registry, event);
        this.lastDispatchRunnable = aVar2;
        this.handler.postAtFrontOfQueue(aVar2);
    }
}

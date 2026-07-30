package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Ll/ker;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "startId", "onStart", "(Landroid/content/Intent;I)V", "flags", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroidx/lifecycle/s;", "dispatcher", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "lifecycle-service_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class LifecycleService extends Service implements ker {

    @NotNull
    private final C0490s dispatcher = new C0490s(this);

    @Override // p153l.ker
    @NotNull
    public Lifecycle getLifecycle() {
        return this.dispatcher.m3068a();
    }

    @Override // android.app.Service
    @CallSuper
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        intent.getClass();
        this.dispatcher.m3069b();
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        this.dispatcher.m3070c();
        super.onCreate();
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.dispatcher.m3071d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @Deprecated
    @CallSuper
    public void onStart(@Nullable Intent intent, int startId) {
        this.dispatcher.m3072e();
        super.onStart(intent, startId);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}

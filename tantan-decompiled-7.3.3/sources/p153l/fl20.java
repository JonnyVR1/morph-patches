package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@Metadata(m88120d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/fl20;", "Ll/j06;", "Ll/el20;", "Landroid/content/Context;", "context", "Ll/zni0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zni0;)V", "j", "()Ll/el20;", "", "g", "()V", "h", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "l/fl20$a", "Ll/fl20$a;", "networkCallback", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class fl20 extends j06<el20> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C17004a networkCallback;

    /* JADX INFO: renamed from: l.fl20$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/fl20$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C17004a extends ConnectivityManager.NetworkCallback {
        public C17004a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            network.getClass();
            capabilities.getClass();
            qzv.m178829e().mo178832a(gl20.f104793a, "Network capabilities changed: " + capabilities);
            fl20 fl20Var = fl20.this;
            fl20Var.m142910f(Build.VERSION.SDK_INT >= 28 ? gl20.m130614d(capabilities) : gl20.m130613c(fl20Var.connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            network.getClass();
            qzv.m178829e().mo178832a(gl20.f104793a, "Network connection lost");
            fl20 fl20Var = fl20.this;
            fl20Var.m142910f(gl20.m130613c(fl20Var.connectivityManager));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl20(@NotNull Context context, @NotNull zni0 zni0Var) {
        super(context, zni0Var);
        context.getClass();
        zni0Var.getClass();
        Object systemService = getAppContext().getSystemService("connectivity");
        systemService.getClass();
        this.connectivityManager = (ConnectivityManager) systemService;
        this.networkCallback = new C17004a();
    }

    @Override // p153l.j06
    /* JADX INFO: renamed from: g */
    public void mo4591g() {
        try {
            qzv.m178829e().mo178832a(gl20.f104793a, "Registering network callback");
            oj20.m167840a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            qzv.m178829e().mo178835d(gl20.f104793a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            qzv.m178829e().mo178835d(gl20.f104793a, "Received exception while registering network callback", e2);
        }
    }

    @Override // p153l.j06
    /* JADX INFO: renamed from: h */
    public void mo4592h() {
        try {
            qzv.m178829e().mo178832a(gl20.f104793a, "Unregistering network callback");
            mj20.m158567c(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            qzv.m178829e().mo178835d(gl20.f104793a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            qzv.m178829e().mo178835d(gl20.f104793a, "Received exception while unregistering network callback", e2);
        }
    }

    @Override // p153l.j06
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public el20 mo100316d() {
        return gl20.m130613c(this.connectivityManager);
    }
}

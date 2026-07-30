package p149l;

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
@Metadata(m87231d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/vc20;", "Ll/ez5;", "Ll/uc20;", "Landroid/content/Context;", "context", "Ll/zei0;", "taskExecutor", "<init>", "(Landroid/content/Context;Ll/zei0;)V", "j", "()Ll/uc20;", "", "g", "()V", "h", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "l/vc20$a", "Ll/vc20$a;", "networkCallback", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class vc20 extends ez5<uc20> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C20612a networkCallback;

    /* JADX INFO: renamed from: l.vc20$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/vc20$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C20612a extends ConnectivityManager.NetworkCallback {
        public C20612a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            network.getClass();
            capabilities.getClass();
            txv.m190976e().mo190979a(wc20.f185638a, "Network capabilities changed: " + capabilities);
            vc20 vc20Var = vc20.this;
            vc20Var.m118845f(Build.VERSION.SDK_INT >= 28 ? wc20.m202600d(capabilities) : wc20.m202599c(vc20Var.connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            network.getClass();
            txv.m190976e().mo190979a(wc20.f185638a, "Network connection lost");
            vc20 vc20Var = vc20.this;
            vc20Var.m118845f(wc20.m202599c(vc20Var.connectivityManager));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc20(@NotNull Context context, @NotNull zei0 zei0Var) {
        super(context, zei0Var);
        context.getClass();
        zei0Var.getClass();
        Object systemService = getAppContext().getSystemService("connectivity");
        systemService.getClass();
        this.connectivityManager = (ConnectivityManager) systemService;
        this.networkCallback = new C20612a();
    }

    @Override // p149l.ez5
    /* JADX INFO: renamed from: g */
    public void mo4589g() {
        try {
            txv.m190976e().mo190979a(wc20.f185638a, "Registering network callback");
            fb20.m120343a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            txv.m190976e().mo190982d(wc20.f185638a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            txv.m190976e().mo190982d(wc20.f185638a, "Received exception while registering network callback", e2);
        }
    }

    @Override // p149l.ez5
    /* JADX INFO: renamed from: h */
    public void mo4590h() {
        try {
            txv.m190976e().mo190979a(wc20.f185638a, "Unregistering network callback");
            db20.m110638c(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            txv.m190976e().mo190982d(wc20.f185638a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            txv.m190976e().mo190982d(wc20.f185638a, "Received exception while unregistering network callback", e2);
        }
    }

    @Override // p149l.ez5
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public uc20 mo118843d() {
        return wc20.m202599c(this.connectivityManager);
    }
}

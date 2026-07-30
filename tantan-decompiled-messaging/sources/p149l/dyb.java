package p149l;

import android.content.ComponentName;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/dyb;", "Ll/jyb;", "<init>", "()V", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/gyb;", "newClient", "", "a", "(Landroid/content/ComponentName;Ll/gyb;)V", "componentName", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "Companion", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class dyb extends jyb {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static gyb f88361b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static kyb f88362c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ReentrantLock f88363d = new ReentrantLock();

    @Override // p149l.jyb
    /* JADX INFO: renamed from: a */
    public void mo114048a(@NotNull ComponentName name, @NotNull gyb newClient) {
        name.getClass();
        newClient.getClass();
        newClient.m128692f(0L);
        f88361b = newClient;
        INSTANCE.m114052d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        componentName.getClass();
    }

    /* JADX INFO: renamed from: l.dyb$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/dyb$a;", "", "<init>", "()V", "Landroid/net/Uri;", "url", "", "c", "(Landroid/net/Uri;)V", "Ll/kyb;", "b", "()Ll/kyb;", Constants.INAPP_DATA_TAG, "Ll/gyb;", "client", "Ll/gyb;", "Ljava/util/concurrent/locks/ReentrantLock;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/ReentrantLock;", "session", "Ll/kyb;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final kyb m114050b() {
            dyb.f88363d.lock();
            kyb kybVar = dyb.f88362c;
            dyb.f88362c = null;
            dyb.f88363d.unlock();
            return kybVar;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m114051c(@NotNull Uri url) {
            url.getClass();
            m114052d();
            dyb.f88363d.lock();
            kyb kybVar = dyb.f88362c;
            if (kybVar != null) {
                kybVar.m147846f(url, null, null);
            }
            dyb.f88363d.unlock();
        }

        /* JADX INFO: renamed from: d */
        public final void m114052d() {
            gyb gybVar;
            dyb.f88363d.lock();
            if (dyb.f88362c == null && (gybVar = dyb.f88361b) != null) {
                dyb.f88362c = gybVar.m128690d(null);
            }
            dyb.f88363d.unlock();
        }

        public Companion() {
        }
    }
}

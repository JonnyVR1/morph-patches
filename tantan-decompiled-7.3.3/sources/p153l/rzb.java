package p153l;

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
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/rzb;", "Ll/xzb;", "<init>", "()V", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/uzb;", "newClient", "", "a", "(Landroid/content/ComponentName;Ll/uzb;)V", "componentName", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class rzb extends xzb {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static uzb f165507b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static yzb f165508c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ReentrantLock f165509d = new ReentrantLock();

    @Override // p153l.xzb
    /* JADX INFO: renamed from: a */
    public void mo159617a(@NotNull ComponentName name, @NotNull uzb newClient) {
        name.getClass();
        newClient.getClass();
        newClient.m198724f(0L);
        f165507b = newClient;
        INSTANCE.m183727d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        componentName.getClass();
    }

    /* JADX INFO: renamed from: l.rzb$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/rzb$a;", "", "<init>", "()V", "Landroid/net/Uri;", "url", "", "c", "(Landroid/net/Uri;)V", "Ll/yzb;", "b", "()Ll/yzb;", Constants.INAPP_DATA_TAG, "Ll/uzb;", "client", "Ll/uzb;", "Ljava/util/concurrent/locks/ReentrantLock;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/ReentrantLock;", "session", "Ll/yzb;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: b */
        public final yzb m183725b() {
            rzb.f165509d.lock();
            yzb yzbVar = rzb.f165508c;
            rzb.f165508c = null;
            rzb.f165509d.unlock();
            return yzbVar;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m183726c(@NotNull Uri url) {
            url.getClass();
            m183727d();
            rzb.f165509d.lock();
            yzb yzbVar = rzb.f165508c;
            if (yzbVar != null) {
                yzbVar.m218017f(url, null, null);
            }
            rzb.f165509d.unlock();
        }

        /* JADX INFO: renamed from: d */
        public final void m183727d() {
            uzb uzbVar;
            rzb.f165509d.lock();
            if (rzb.f165508c == null && (uzbVar = rzb.f165507b) != null) {
                rzb.f165508c = uzbVar.m198722d(null);
            }
            rzb.f165509d.unlock();
        }

        public Companion() {
        }
    }
}

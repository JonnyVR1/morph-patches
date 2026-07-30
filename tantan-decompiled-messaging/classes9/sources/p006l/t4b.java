package p006l;

import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.sab0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\b"}, d2 = {"Ll/t4b;", "Lcom/p1/mobile/putong/api/ABManager$d;", "<init>", "()V", "", "a", "b", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t4b implements ABManager.InterfaceC0104d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m24453c(@NotNull PurchaseType purchaseType) {
        return INSTANCE.m24456a(purchaseType);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m24454d() {
        return INSTANCE.m24457b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m24455e(@NotNull PurchaseType purchaseType) {
        return INSTANCE.m24458c(purchaseType);
    }

    /* JADX INFO: renamed from: l.t4b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/t4b$a;", "", "<init>", "()V", "", "b", "()Z", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Z", "a", "", "OMS_KEY", "Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m24456a(@NotNull PurchaseType purchaseType) {
            purchaseType.getClass();
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m24457b() {
            return RemoteConfig.x().s("autofail_confirm2_switch");
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m24458c(@NotNull PurchaseType purchaseType) {
            purchaseType.getClass();
            if (m24457b()) {
                return sab0.w(purchaseType) || sab0.q(purchaseType);
            }
            return false;
        }

        public Companion() {
        }
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public void mo1299a() {
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public void mo1300b() {
    }
}

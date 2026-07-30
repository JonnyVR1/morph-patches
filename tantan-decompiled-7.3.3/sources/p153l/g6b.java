package p153l;

import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\b"}, m88121d2 = {"Ll/g6b;", "Lcom/p1/mobile/putong/api/ABManager$d;", "<init>", "()V", "", "a", "b", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g6b implements ABManager.InterfaceC4829d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m129213c(@NotNull PurchaseType purchaseType) {
        return INSTANCE.m129216a(purchaseType);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m129214d() {
        return INSTANCE.m129217b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m129215e(@NotNull PurchaseType purchaseType) {
        return INSTANCE.m129218c(purchaseType);
    }

    /* JADX INFO: renamed from: l.g6b$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/g6b$a;", "", "<init>", "()V", "", "b", "()Z", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Z", "a", "", "OMS_KEY", "Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m129216a(@NotNull PurchaseType purchaseType) {
            purchaseType.getClass();
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m129217b() {
            return RemoteConfig.m80481x().m80513s("autofail_confirm2_switch");
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m129218c(@NotNull PurchaseType purchaseType) {
            purchaseType.getClass();
            if (m129217b()) {
                return wib0.m206579w(purchaseType) || wib0.m206573q(purchaseType);
            }
            return false;
        }

        public Companion() {
        }
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}

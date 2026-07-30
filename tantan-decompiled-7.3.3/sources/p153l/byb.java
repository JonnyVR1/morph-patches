package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/byb;", "", "Ll/tk20;", "networkRepo", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/uzd;", "deviceInfo", "<init>", "(Ll/tk20;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/uzd;)V", "", "isViewedEvent", "c", "(Z)Z", "a", "Ll/tk20;", "b", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/uzd;", "Ll/yxb;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "()Ll/yxb;", "ctApi", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class byb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final tk20 networkRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final uzd deviceInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy ctApi;

    public byb(@NotNull tk20 tk20Var, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull uzd uzdVar) {
        tk20Var.getClass();
        cleverTapInstanceConfig.getClass();
        uzdVar.getClass();
        this.networkRepo = tk20Var;
        this.config = cleverTapInstanceConfig;
        this.deviceInfo = uzdVar;
        this.ctApi = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ayb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return byb.m106992a(this.f73960a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static yxb m106992a(byb bybVar) {
        bybVar.getClass();
        return zxb.INSTANCE.m221980a(bybVar.networkRepo, bybVar.config, bybVar.deviceInfo);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: b */
    public final yxb m106993b() {
        return (yxb) this.ctApi.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m106994c(boolean isViewedEvent) {
        return m106993b().m217700k(isViewedEvent);
    }
}

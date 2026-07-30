package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/nwb;", "", "Ll/jc20;", "networkRepo", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/hyd;", "deviceInfo", "<init>", "(Ll/jc20;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/hyd;)V", "", "isViewedEvent", "c", "(Z)Z", "a", "Ll/jc20;", "b", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/hyd;", "Ll/kwb;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "()Ll/kwb;", "ctApi", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class nwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final jc20 networkRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final hyd deviceInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy ctApi;

    public nwb(@NotNull jc20 jc20Var, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull hyd hydVar) {
        jc20Var.getClass();
        cleverTapInstanceConfig.getClass();
        hydVar.getClass();
        this.networkRepo = jc20Var;
        this.config = cleverTapInstanceConfig;
        this.deviceInfo = hydVar;
        this.ctApi = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.mwb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nwb.m161865a(this.f136037a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static kwb m161865a(nwb nwbVar) {
        nwbVar.getClass();
        return lwb.INSTANCE.m151967a(nwbVar.networkRepo, nwbVar.config, nwbVar.deviceInfo);
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: b */
    public final kwb m161866b() {
        return (kwb) this.ctApi.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m161867c(boolean isViewedEvent) {
        return m161866b().m147534k(isViewedEvent);
    }
}

package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.bz5;
import p149l.eri;
import p149l.gz5;
import p149l.haq0;
import p149l.jri;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "Ll/bz5;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Ll/gz5;", "constraints", "Ll/eri;", "Landroidx/work/impl/constraints/a;", "b", "(Ll/gz5;)Ll/eri;", "Ll/haq0;", "workSpec", "", "c", "(Ll/haq0;)Z", "a", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class NetworkRequestConstraintController implements bz5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long timeoutMs;

    public NetworkRequestConstraintController(@NotNull ConnectivityManager connectivityManager, long j) {
        connectivityManager.getClass();
        this.connManager = connectivityManager;
        this.timeoutMs = j;
    }

    @Override // p149l.bz5
    /* JADX INFO: renamed from: a */
    public boolean mo4572a(@NotNull haq0 workSpec) {
        workSpec.getClass();
        if (!mo4574c(workSpec)) {
            return false;
        }
        qkq0.m175383a("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // p149l.bz5
    @NotNull
    /* JADX INFO: renamed from: b */
    public eri<AbstractC0787a> mo4573b(@NotNull gz5 constraints) {
        constraints.getClass();
        return jri.m142946e(new NetworkRequestConstraintController$track$1(constraints, this, null));
    }

    @Override // p149l.bz5
    /* JADX INFO: renamed from: c */
    public boolean mo4574c(@NotNull haq0 workSpec) {
        workSpec.getClass();
        return workSpec.constraints.m128823d() != null;
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i & 2) != 0 ? 1000L : j);
    }
}

package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p153l.aui;
import p153l.fui;
import p153l.g06;
import p153l.l06;
import p153l.mjq0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "Ll/g06;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Ll/l06;", "constraints", "Ll/aui;", "Landroidx/work/impl/constraints/a;", "b", "(Ll/l06;)Ll/aui;", "Ll/mjq0;", "workSpec", "", "c", "(Ll/mjq0;)Z", "a", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class NetworkRequestConstraintController implements g06 {

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

    @Override // p153l.g06
    /* JADX INFO: renamed from: a */
    public boolean mo4574a(@NotNull mjq0 workSpec) {
        workSpec.getClass();
        if (!mo4576c(workSpec)) {
            return false;
        }
        wtq0.m207906a("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // p153l.g06
    @NotNull
    /* JADX INFO: renamed from: b */
    public aui<AbstractC0789a> mo4575b(@NotNull l06 constraints) {
        constraints.getClass();
        return fui.m127481e(new NetworkRequestConstraintController$track$1(constraints, this, null));
    }

    @Override // p153l.g06
    /* JADX INFO: renamed from: c */
    public boolean mo4576c(@NotNull mjq0 workSpec) {
        workSpec.getClass();
        return workSpec.constraints.m152310d() != null;
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i & 2) != 0 ? 1000L : j);
    }
}

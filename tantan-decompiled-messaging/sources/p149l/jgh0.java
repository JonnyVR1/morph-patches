package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/jgh0;", "Ll/wuf0;", "delegate", "<init>", "(Ll/wuf0;)V", "Ll/k9q0;", "id", "Ll/vuf0;", "a", "(Ll/k9q0;)Ll/vuf0;", "e", "", "workSpecId", "", Action.remove, "(Ljava/lang/String;)Ljava/util/List;", "", Constants.INAPP_DATA_TAG, "(Ll/k9q0;)Z", "Ll/wuf0;", "", "b", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class jgh0 implements wuf0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final wuf0 delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    public jgh0(@NotNull wuf0 wuf0Var) {
        wuf0Var.getClass();
        this.delegate = wuf0Var;
        this.lock = new Object();
    }

    @Override // p149l.wuf0
    @NotNull
    /* JADX INFO: renamed from: a */
    public vuf0 mo141292a(@NotNull k9q0 id) {
        vuf0 vuf0VarMo141292a;
        id.getClass();
        synchronized (this.lock) {
            vuf0VarMo141292a = this.delegate.mo141292a(id);
        }
        return vuf0VarMo141292a;
    }

    @Override // p149l.wuf0
    /* JADX INFO: renamed from: d */
    public boolean mo141293d(@NotNull k9q0 id) {
        boolean zMo141293d;
        id.getClass();
        synchronized (this.lock) {
            zMo141293d = this.delegate.mo141293d(id);
        }
        return zMo141293d;
    }

    @Override // p149l.wuf0
    @Nullable
    /* JADX INFO: renamed from: e */
    public vuf0 mo141294e(@NotNull k9q0 id) {
        vuf0 vuf0VarMo141294e;
        id.getClass();
        synchronized (this.lock) {
            vuf0VarMo141294e = this.delegate.mo141294e(id);
        }
        return vuf0VarMo141294e;
    }

    @Override // p149l.wuf0
    @NotNull
    public List<vuf0> remove(@NotNull String workSpecId) {
        List<vuf0> listRemove;
        workSpecId.getClass();
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}

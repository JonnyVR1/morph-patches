package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/qoh0;", "Ll/f3g0;", "delegate", "<init>", "(Ll/f3g0;)V", "Ll/piq0;", "id", "Ll/e3g0;", "a", "(Ll/piq0;)Ll/e3g0;", "e", "", "workSpecId", "", Action.remove, "(Ljava/lang/String;)Ljava/util/List;", "", Constants.INAPP_DATA_TAG, "(Ll/piq0;)Z", "Ll/f3g0;", "", "b", "Ljava/lang/Object;", JoinPoint.SYNCHRONIZATION_LOCK, "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class qoh0 implements f3g0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final f3g0 delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    public qoh0(@NotNull f3g0 f3g0Var) {
        f3g0Var.getClass();
        this.delegate = f3g0Var;
        this.lock = new Object();
    }

    @Override // p153l.f3g0
    @NotNull
    /* JADX INFO: renamed from: a */
    public e3g0 mo123733a(@NotNull piq0 id) {
        e3g0 e3g0VarMo123733a;
        id.getClass();
        synchronized (this.lock) {
            e3g0VarMo123733a = this.delegate.mo123733a(id);
        }
        return e3g0VarMo123733a;
    }

    @Override // p153l.f3g0
    /* JADX INFO: renamed from: d */
    public boolean mo123735d(@NotNull piq0 id) {
        boolean zMo123735d;
        id.getClass();
        synchronized (this.lock) {
            zMo123735d = this.delegate.mo123735d(id);
        }
        return zMo123735d;
    }

    @Override // p153l.f3g0
    @Nullable
    /* JADX INFO: renamed from: e */
    public e3g0 mo123736e(@NotNull piq0 id) {
        e3g0 e3g0VarMo123736e;
        id.getClass();
        synchronized (this.lock) {
            e3g0VarMo123736e = this.delegate.mo123736e(id);
        }
        return e3g0VarMo123736e;
    }

    @Override // p153l.f3g0
    @NotNull
    public List<e3g0> remove(@NotNull String workSpecId) {
        List<e3g0> listRemove;
        workSpecId.getClass();
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}

package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.z8 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0007R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u000fR$\u0010-\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,¨\u0006/"}, m87232d2 = {"Ll/z8;", "", "Ljava/util/Observable;", "<init>", "()V", "Ll/mxc0;", "a", "()Ll/mxc0;", "", "hasChanged", "()Z", "Ll/g3c;", "data", "", "e", "(Ll/g3c;)V", "Ljava/lang/Exception;", "b", "(Ljava/lang/Exception;)Ll/g3c;", "h", "Ll/q9q0;", "Ll/q9q0;", "c", "()Ll/q9q0;", "f", "(Ll/q9q0;)V", "manager", "", "I", "getRunAttemptCount", "()I", "setRunAttemptCount", "(I)V", "runAttemptCount", "Ll/g3c;", "getInputData", "()Ll/g3c;", "setInputData", "inputData", "Ll/lvl;", Constants.INAPP_DATA_TAG, "Ll/lvl;", "()Ll/lvl;", "g", "(Ll/lvl;)V", "workCallback", "Companion", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class AbstractC21646z8 extends Observable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public q9q0 manager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int runAttemptCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public g3c inputData = new g3c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public lvl workCallback;

    @NotNull
    /* JADX INFO: renamed from: a */
    public mxc0 m217543a() {
        mxc0 mxc0VarMo152062h = mo152062h();
        int i = this.runAttemptCount + 1;
        this.runAttemptCount = i;
        if (i > 10) {
            return mxc0.INSTANCE.m156872a(new RuntimeException("Out max try times", mxc0VarMo152062h.getOutputData().getException()));
        }
        return mxc0VarMo152062h.m156871c() ? m217543a() : mxc0VarMo152062h;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final g3c m217544b(@Nullable Exception e) {
        return new g3c.C16987a().m124244b(e).getData();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final q9q0 m217545c() {
        q9q0 q9q0Var = this.manager;
        if (q9q0Var != null) {
            return q9q0Var;
        }
        Intrinsics.m87502r("manager");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final lvl getWorkCallback() {
        return this.workCallback;
    }

    /* JADX INFO: renamed from: e */
    public final void m217547e(@NotNull g3c data) {
        data.getClass();
        m217545c().getMonitor().mo99534a(data);
    }

    /* JADX INFO: renamed from: f */
    public final void m217548f(@NotNull q9q0 q9q0Var) {
        q9q0Var.getClass();
        this.manager = q9q0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m217549g(@Nullable lvl lvlVar) {
        this.workCallback = lvlVar;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract mxc0 mo152062h();

    @Override // java.util.Observable
    public boolean hasChanged() {
        return true;
    }
}

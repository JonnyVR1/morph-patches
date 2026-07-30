package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.u8 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0007R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u000fR$\u0010-\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,¨\u0006/"}, m88121d2 = {"Ll/u8;", "", "Ljava/util/Observable;", "<init>", "()V", "Ll/p5d0;", "a", "()Ll/p5d0;", "", "hasChanged", "()Z", "Ll/p4c;", "data", "", "e", "(Ll/p4c;)V", "Ljava/lang/Exception;", "b", "(Ljava/lang/Exception;)Ll/p4c;", "h", "Ll/viq0;", "Ll/viq0;", "c", "()Ll/viq0;", "f", "(Ll/viq0;)V", "manager", "", "I", "getRunAttemptCount", "()I", "setRunAttemptCount", "(I)V", "runAttemptCount", "Ll/p4c;", "getInputData", "()Ll/p4c;", "setInputData", "inputData", "Ll/dyl;", Constants.INAPP_DATA_TAG, "Ll/dyl;", "()Ll/dyl;", "g", "(Ll/dyl;)V", "workCallback", "Companion", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class AbstractC20518u8 extends Observable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public viq0 manager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int runAttemptCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public p4c inputData = new p4c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public dyl workCallback;

    @NotNull
    /* JADX INFO: renamed from: a */
    public p5d0 m194896a() {
        p5d0 p5d0VarMo194586h = mo194586h();
        int i = this.runAttemptCount + 1;
        this.runAttemptCount = i;
        if (i > 10) {
            return p5d0.INSTANCE.m170621a(new RuntimeException("Out max try times", p5d0VarMo194586h.getOutputData().getException()));
        }
        return p5d0VarMo194586h.m170620c() ? m194896a() : p5d0VarMo194586h;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final p4c m194897b(@Nullable Exception e) {
        return new p4c.C19295a().m170560b(e).getData();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final viq0 m194898c() {
        viq0 viq0Var = this.manager;
        if (viq0Var != null) {
            return viq0Var;
        }
        Intrinsics.m88391r("manager");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final dyl getWorkCallback() {
        return this.workCallback;
    }

    /* JADX INFO: renamed from: e */
    public final void m194900e(@NotNull p4c data) {
        data.getClass();
        m194898c().getMonitor().mo132974a(data);
    }

    /* JADX INFO: renamed from: f */
    public final void m194901f(@NotNull viq0 viq0Var) {
        viq0Var.getClass();
        this.manager = viq0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m194902g(@Nullable dyl dylVar) {
        this.workCallback = dylVar;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract p5d0 mo194586h();

    @Override // java.util.Observable
    public boolean hasChanged() {
        return true;
    }
}

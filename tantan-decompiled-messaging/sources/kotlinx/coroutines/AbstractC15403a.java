package kotlinx.coroutines;

import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.mpb;
import p149l.o8c;
import p149l.onq;
import p149l.pn5;
import p149l.ppb;
import p149l.sn5;

/* JADX INFO: renamed from: kotlinx.coroutines.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JL\u0010+\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012'\u0010*\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0002\b)¢\u0006\u0004\b+\u0010,R\u001d\u00103\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00108\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m87232d2 = {"Lkotlinx/coroutines/a;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/o;", "Lkotlin/coroutines/Continuation;", "Ll/ppb;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "initParentJob", Active.TYPE, "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "value", "", "f1", "(Ljava/lang/Object;)V", "", "cause", "handled", "e1", "(Ljava/lang/Throwable;Z)V", "", "d0", "()Ljava/lang/String;", "", "state", "M0", "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "d1", "exception", "v0", "(Ljava/lang/Throwable;)V", "F0", "R", "Lkotlinx/coroutines/CoroutineStart;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "g1", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "c", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "k", "()Z", "isActive", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public abstract class AbstractC15403a<T> extends JobSupport implements InterfaceC15486o, Continuation<T>, ppb {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    public AbstractC15403a(@NotNull CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m93704w0((InterfaceC15486o) coroutineContext.get(InterfaceC15486o.INSTANCE));
        }
        this.context = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public String mo93643F0() {
        String strM93604b = CoroutineContextKt.m93604b(this.context);
        if (strM93604b == null) {
            return super.mo93643F0();
        }
        return "\"" + strM93604b + "\":" + super.mo93643F0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: M0 */
    public final void mo93654M0(@Nullable Object state) {
        if (!(state instanceof pn5)) {
            mo93733f1(state);
        } else {
            pn5 pn5Var = (pn5) state;
            mo93732e1(pn5Var.cause, pn5Var.m170400a());
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public String mo93683d0() {
        return o8c.m163111a(this) + " was cancelled";
    }

    /* JADX INFO: renamed from: d1 */
    public void mo93731d1(@Nullable Object state) {
        mo93668V(state);
    }

    /* JADX INFO: renamed from: e1 */
    public void mo93732e1(@NotNull Throwable cause, boolean handled) {
    }

    /* JADX INFO: renamed from: f1 */
    public void mo93733f1(T value) {
    }

    /* JADX INFO: renamed from: g1 */
    public final <R> void m93734g1(@NotNull CoroutineStart start, R receiver, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> block) {
        start.invoke(block, receiver, this);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // p149l.ppb
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC15486o
    /* JADX INFO: renamed from: k */
    public boolean mo93690k() {
        return super.mo93690k();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object result) {
        Object objM93640D0 = m93640D0(sn5.m185034d(result, null, 1, null));
        if (objM93640D0 == onq.f144810b) {
            return;
        }
        mo93731d1(objM93640D0);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: v0 */
    public final void mo93703v0(@NotNull Throwable exception) {
        mpb.m155795a(this.context, exception);
    }
}

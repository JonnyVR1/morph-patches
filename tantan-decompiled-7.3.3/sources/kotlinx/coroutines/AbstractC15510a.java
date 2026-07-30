package kotlinx.coroutines;

import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.arb;
import p153l.drb;
import p153l.npq;
import p153l.p7f;
import p153l.to5;
import p153l.u9c;
import p153l.wo5;

/* JADX INFO: renamed from: kotlinx.coroutines.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JL\u0010+\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012'\u0010*\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0002\b)¢\u0006\u0004\b+\u0010,R\u001d\u00103\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00108\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m88121d2 = {"Lkotlinx/coroutines/a;", p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/o;", "Lkotlin/coroutines/Continuation;", "Ll/drb;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "initParentJob", Active.TYPE, "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "value", "", "f1", "(Ljava/lang/Object;)V", "", "cause", "handled", "e1", "(Ljava/lang/Throwable;Z)V", "", "d0", "()Ljava/lang/String;", "", "state", "M0", "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "d1", "exception", "v0", "(Ljava/lang/Throwable;)V", "F0", "R", "Lkotlinx/coroutines/CoroutineStart;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "g1", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "c", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "k", "()Z", "isActive", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public abstract class AbstractC15510a<T> extends JobSupport implements InterfaceC15593o, Continuation<T>, drb {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    public AbstractC15510a(@NotNull CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m94595w0((InterfaceC15593o) coroutineContext.get(InterfaceC15593o.INSTANCE));
        }
        this.context = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public String mo94534F0() {
        String strM94495b = CoroutineContextKt.m94495b(this.context);
        if (strM94495b == null) {
            return super.mo94534F0();
        }
        return "\"" + strM94495b + "\":" + super.mo94534F0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: M0 */
    public final void mo94545M0(@Nullable Object state) {
        if (!(state instanceof to5)) {
            mo94625f1(state);
        } else {
            to5 to5Var = (to5) state;
            mo94624e1(to5Var.cause, to5Var.m192009a());
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public String mo94574d0() {
        return u9c.m195086a(this) + " was cancelled";
    }

    /* JADX INFO: renamed from: d1 */
    public void mo94623d1(@Nullable Object state) {
        mo94559V(state);
    }

    /* JADX INFO: renamed from: e1 */
    public void mo94624e1(@NotNull Throwable cause, boolean handled) {
    }

    /* JADX INFO: renamed from: f1 */
    public void mo94625f1(T value) {
    }

    /* JADX INFO: renamed from: g1 */
    public final <R> void m94626g1(@NotNull CoroutineStart start, R receiver, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> block) {
        start.invoke(block, receiver, this);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // p153l.drb
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC15593o
    /* JADX INFO: renamed from: k */
    public boolean mo94581k() {
        return super.mo94581k();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object result) {
        Object objM94531D0 = m94531D0(wo5.m207263d(result, null, 1, null));
        if (objM94531D0 == npq.f143117b) {
            return;
        }
        mo94623d1(objM94531D0);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: v0 */
    public final void mo94594v0(@NotNull Throwable exception) {
        arb.m99658a(this.context, exception);
    }
}

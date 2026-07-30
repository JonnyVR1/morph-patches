package kotlinx.coroutines;

import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bu40;
import p153l.f45;
import p153l.h45;
import p153l.p7f;
import p153l.z5e;

/* JADX INFO: renamed from: kotlinx.coroutines.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0017\u001a\u00020\u00162'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0004\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b+\u0010\u0007R\u001a\u00100\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0004\u001a\u0004\b.\u0010\u0007R\u001a\u00101\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0004\u001a\u0004\b1\u0010\u0007R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0002038VX\u0097\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0004\u001a\u0004\b4\u00105¨\u00068"}, m88121d2 = {"Lkotlinx/coroutines/p;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/o;", "<init>", "()V", "", "start", "()Z", "", p7f.LATITUDE_SOUTH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "M", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Ll/z5e;", "u", "(Lkotlin/jvm/functions/Function1;)Ll/z5e;", "onCancelling", "invokeImmediately", "J", "(ZZLkotlin/jvm/functions/Function1;)Ll/z5e;", "n", "(Ljava/util/concurrent/CancellationException;)V", "Ll/h45;", "child", "Ll/f45;", "Q", "(Ll/h45;)Ll/f45;", "", "toString", "()Ljava/lang/String;", "getParent", "()Lkotlinx/coroutines/o;", "getParent$annotations", "parent", "k", "isActive$annotations", "isActive", "m", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lkotlin/sequences/Sequence;", "H", "()Lkotlin/sequences/Sequence;", "getChildren$annotations", "children", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class C15594p extends AbstractCoroutineContextElement implements InterfaceC15593o {

    @NotNull
    public static final C15594p INSTANCE = new C15594p();

    public C15594p() {
        super(InterfaceC15593o.INSTANCE);
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @NotNull
    /* JADX INFO: renamed from: H */
    public Sequence<InterfaceC15593o> mo94536H() {
        return SequencesKt__SequencesKt.m94160i();
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: J */
    public z5e mo94540J(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return bu40.INSTANCE;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: M */
    public CancellationException mo94544M() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: Q */
    public f45 mo94550Q(@NotNull h45 child) {
        return bu40.INSTANCE;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Deprecated
    @Nullable
    /* JADX INFO: renamed from: S */
    public Object mo94554S(@NotNull Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Nullable
    public InterfaceC15593o getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    /* JADX INFO: renamed from: k */
    public boolean mo94581k() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    /* JADX INFO: renamed from: m */
    public boolean mo94584m() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Deprecated
    /* JADX INFO: renamed from: n */
    public void mo94586n(@Nullable CancellationException cause) {
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Deprecated
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC15593o
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: u */
    public z5e mo94592u(@NotNull Function1<? super Throwable, Unit> handler) {
        return bu40.INSTANCE;
    }
}

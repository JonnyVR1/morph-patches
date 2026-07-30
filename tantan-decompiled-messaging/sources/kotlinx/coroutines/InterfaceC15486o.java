package kotlinx.coroutines;

import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e35;
import p149l.g35;
import p149l.j6f;
import p149l.l4e;
import p149l.qq3;

/* JADX INFO: renamed from: kotlinx.coroutines.o */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 /2\u00020\u0001:\u00010J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001b\u001a\u00020\u001a2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJL\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H'¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\u00008&X§\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\bR\u0014\u0010)\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\bR\u0014\u0010*\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m87232d2 = {"Lkotlinx/coroutines/o;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "M", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "", "n", "(Ljava/util/concurrent/CancellationException;)V", "Ll/g35;", "child", "Ll/e35;", "Q", "(Ll/g35;)Ll/e35;", j6f.LATITUDE_SOUTH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlinx/coroutines/CompletionHandler;", "handler", "Ll/l4e;", "u", "(Lkotlin/jvm/functions/Function1;)Ll/l4e;", "onCancelling", "invokeImmediately", "J", "(ZZLkotlin/jvm/functions/Function1;)Ll/l4e;", "getParent", "()Lkotlinx/coroutines/o;", "getParent$annotations", "()V", "parent", "k", "isActive", "m", "isCompleted", "isCancelled", "Lkotlin/sequences/Sequence;", "H", "()Lkotlin/sequences/Sequence;", "children", "e0", "b", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface InterfaceC15486o extends CoroutineContext.Element {

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f66922a;

    /* JADX INFO: renamed from: kotlinx.coroutines.o$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m94245a(InterfaceC15486o interfaceC15486o, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC15486o.mo93695n(cancellationException);
        }

        /* JADX INFO: renamed from: b */
        public static <R> R m94246b(@NotNull InterfaceC15486o interfaceC15486o, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.m87362a(interfaceC15486o, r, function2);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static <E extends CoroutineContext.Element> E m94247c(@NotNull InterfaceC15486o interfaceC15486o, @NotNull CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.m87363b(interfaceC15486o, key);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static CoroutineContext m94248d(@NotNull InterfaceC15486o interfaceC15486o, @NotNull CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.m87364c(interfaceC15486o, key);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public static CoroutineContext m94249e(@NotNull InterfaceC15486o interfaceC15486o, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.m87365d(interfaceC15486o, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.o$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lkotlinx/coroutines/o$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/o;", "<init>", "()V", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class Companion implements CoroutineContext.Key<InterfaceC15486o> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66922a = new Companion();
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    Sequence<InterfaceC15486o> mo93645H();

    @NotNull
    /* JADX INFO: renamed from: J */
    l4e mo93649J(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler);

    @NotNull
    /* JADX INFO: renamed from: M */
    CancellationException mo93653M();

    @NotNull
    /* JADX INFO: renamed from: Q */
    e35 mo93659Q(@NotNull g35 child);

    @Nullable
    /* JADX INFO: renamed from: S */
    Object mo93663S(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    InterfaceC15486o getParent();

    boolean isCancelled();

    /* JADX INFO: renamed from: k */
    boolean mo93690k();

    /* JADX INFO: renamed from: m */
    boolean mo93693m();

    /* JADX INFO: renamed from: n */
    void mo93695n(@Nullable CancellationException cause);

    boolean start();

    @NotNull
    /* JADX INFO: renamed from: u */
    l4e mo93701u(@NotNull Function1<? super Throwable, Unit> handler);
}

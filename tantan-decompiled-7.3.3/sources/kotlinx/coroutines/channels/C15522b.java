package kotlinx.coroutines.channels;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gle0;
import p153l.ifd0;
import p153l.l6f;
import p153l.uke0;
import p153l.wtq0;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0001\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\r\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m88121d2 = {"Lkotlinx/coroutines/channels/b;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a1", "Lkotlinx/coroutines/channels/a;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/Object;)Ljava/lang/Object;", "Ll/gle0;", "select", "", "U0", "(Ll/gle0;Ljava/lang/Object;)V", "e1", "()Z", "isSendOp", "u1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "t1", "m", "I", "n", "Lkotlinx/coroutines/channels/BufferOverflow;", "t0", "isConflatedDropOldest", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class C15522b<E> extends BufferedChannel<E> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final BufferOverflow onBufferOverflow;

    public C15522b(int i, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            ifd0.m139726a("This implementation does not support suspension for senders, use ", Reflection.m88396b(BufferedChannel.class).mo88360s(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        uke0.m196486a("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ <E> Object m94896r1(C15522b<E> c15522b, E e, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionM95107d;
        Object objM94899u1 = c15522b.m94899u1(e, true);
        if (!(objM94899u1 instanceof C15521a.a)) {
            return Unit.INSTANCE;
        }
        C15521a.m94886e(objM94899u1);
        Function1<E, Unit> function1 = c15522b.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionM95107d = OnUndeliveredElementKt.m95107d(function1, e, null, 2, null)) == null) {
            throw c15522b.m94769f0();
        }
        l6f.m153058a(undeliveredElementExceptionM95107d, c15522b.m94769f0());
        throw undeliveredElementExceptionM95107d;
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ <E> Object m94897s1(C15522b<E> c15522b, E e, Continuation<? super Boolean> continuation) {
        Object objM94899u1 = c15522b.m94899u1(e, true);
        if (objM94899u1 instanceof C15521a.c) {
            return Boxing.m88259a(false);
        }
        return Boxing.m88259a(true);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, p153l.sme0
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo94679E(E e, @NotNull Continuation<? super Unit> continuation) {
        return m94896r1(this, e, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: U0 */
    public void mo94681U0(@NotNull gle0<?> select, @Nullable Object element) {
        Object objMo94683l = mo94683l(element);
        if (!(objMo94683l instanceof C15521a.c)) {
            select.mo95203d(Unit.INSTANCE);
        } else if (!(objMo94683l instanceof C15521a.a)) {
            wtq0.m207906a("unreachable");
        } else {
            C15521a.m94886e(objMo94683l);
            select.mo95203d(BufferedChannelKt.m94842z());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    @Nullable
    /* JADX INFO: renamed from: a1 */
    public Object mo94762a1(E e, @NotNull Continuation<? super Boolean> continuation) {
        return m94897s1(this, e, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: e1 */
    public boolean mo94768e1() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, p153l.sme0
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo94683l(E element) {
        return m94899u1(element, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: t0 */
    public boolean mo94796t0() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX INFO: renamed from: t1 */
    public final Object m94898t1(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionM95107d;
        Object objMo94683l = super.mo94683l(element);
        if (C15521a.m94890i(objMo94683l) || C15521a.m94889h(objMo94683l)) {
            return objMo94683l;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (undeliveredElementExceptionM95107d = OnUndeliveredElementKt.m95107d(function1, element, null, 2, null)) == null) {
            return C15521a.INSTANCE.m94895c(Unit.INSTANCE);
        }
        throw undeliveredElementExceptionM95107d;
    }

    /* JADX INFO: renamed from: u1 */
    public final Object m94899u1(E element, boolean isSendOp) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m94898t1(element, isSendOp) : m94772h1(element);
    }

    public /* synthetic */ C15522b(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : function1);
    }
}

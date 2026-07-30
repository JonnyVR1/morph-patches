package kotlinx.coroutines.channels;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p149l.bde0;
import p149l.f7d0;
import p149l.h5f;
import p149l.pce0;
import p149l.qkq0;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0001\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\r\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m87232d2 = {"Lkotlinx/coroutines/channels/b;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a1", "Lkotlinx/coroutines/channels/a;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/Object;)Ljava/lang/Object;", "Ll/bde0;", "select", "", "U0", "(Ll/bde0;Ljava/lang/Object;)V", "e1", "()Z", "isSendOp", "u1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "t1", "m", "I", "n", "Lkotlinx/coroutines/channels/BufferOverflow;", "t0", "isConflatedDropOldest", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public class C15415b<E> extends BufferedChannel<E> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final BufferOverflow onBufferOverflow;

    public C15415b(int i, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        super(i, function1);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            f7d0.m119786a("This implementation does not support suspension for senders, use ", Reflection.m87507b(BufferedChannel.class).mo87471s(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        pce0.m168340a("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ <E> Object m94004r1(C15415b<E> c15415b, E e, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionM94214d;
        Object objM94007u1 = c15415b.m94007u1(e, true);
        if (!(objM94007u1 instanceof C15414a.a)) {
            return Unit.INSTANCE;
        }
        C15414a.m93994e(objM94007u1);
        Function1<E, Unit> function1 = c15415b.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionM94214d = OnUndeliveredElementKt.m94214d(function1, e, null, 2, null)) == null) {
            throw c15415b.m93877f0();
        }
        h5f.m129395a(undeliveredElementExceptionM94214d, c15415b.m93877f0());
        throw undeliveredElementExceptionM94214d;
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ <E> Object m94005s1(C15415b<E> c15415b, E e, Continuation<? super Boolean> continuation) {
        Object objM94007u1 = c15415b.m94007u1(e, true);
        if (objM94007u1 instanceof C15414a.c) {
            return Boxing.m87370a(false);
        }
        return Boxing.m87370a(true);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, p149l.nee0
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo93787E(E e, @NotNull Continuation<? super Unit> continuation) {
        return m94004r1(this, e, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: U0 */
    public void mo93789U0(@NotNull bde0<?> select, @Nullable Object element) {
        Object objMo93791l = mo93791l(element);
        if (!(objMo93791l instanceof C15414a.c)) {
            select.mo94310d(Unit.INSTANCE);
        } else if (!(objMo93791l instanceof C15414a.a)) {
            qkq0.m175383a("unreachable");
        } else {
            C15414a.m93994e(objMo93791l);
            select.mo94310d(BufferedChannelKt.m93950z());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    @Nullable
    /* JADX INFO: renamed from: a1 */
    public Object mo93870a1(E e, @NotNull Continuation<? super Boolean> continuation) {
        return m94005s1(this, e, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: e1 */
    public boolean mo93876e1() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, p149l.nee0
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo93791l(E element) {
        return m94007u1(element, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: t0 */
    public boolean mo93904t0() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX INFO: renamed from: t1 */
    public final Object m94006t1(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionM94214d;
        Object objMo93791l = super.mo93791l(element);
        if (C15414a.m93998i(objMo93791l) || C15414a.m93997h(objMo93791l)) {
            return objMo93791l;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (undeliveredElementExceptionM94214d = OnUndeliveredElementKt.m94214d(function1, element, null, 2, null)) == null) {
            return C15414a.INSTANCE.m94003c(Unit.INSTANCE);
        }
        throw undeliveredElementExceptionM94214d;
    }

    /* JADX INFO: renamed from: u1 */
    public final Object m94007u1(E element, boolean isSendOp) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m94006t1(element, isSendOp) : m93880h1(element);
    }

    public /* synthetic */ C15415b(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : function1);
    }
}

package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0012J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J!\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0001\u0010\u0010R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016038\u0002X\u0082\u0004¨\u00065"}, m88121d2 = {"Ll/ts4;", "E", "Ll/rke0;", "", "id", "prev", "Lkotlinx/coroutines/channels/BufferedChannel;", "channel", "", "pointers", "<init>", "(JLl/ts4;Lkotlinx/coroutines/channels/BufferedChannel;I)V", FirebaseAnalytics.Param.INDEX, "element", "", "G", "(ILjava/lang/Object;)V", "A", "(I)Ljava/lang/Object;", "D", "w", "(I)V", "", "B", "value", "F", "from", "to", "", ResourceDirection.f39656v, "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", BaseSei.f14624X, "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", BLiveStormDanmakuGiftResourceType.f45294s, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "receiver", c4s.C_ZONE, "(IZ)V", "e", "Lkotlinx/coroutines/channels/BufferedChannel;", "_channel", BaseSei.f14625Y, "()Lkotlinx/coroutines/channels/BufferedChannel;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ts4<E> extends rke0<ts4<E>> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final BufferedChannel<E> _channel;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f175961f;

    public ts4(long j, @Nullable ts4<E> ts4Var, @Nullable BufferedChannel<E> bufferedChannel, int i) {
        super(j, ts4Var, i);
        this._channel = bufferedChannel;
        this.f175961f = new AtomicReferenceArray(BufferedChannelKt.f67403b * 2);
    }

    /* JADX INFO: renamed from: A */
    public final E m192556A(int index) {
        return (E) getF175961f().get(index * 2);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m192557B(int index) {
        return getF175961f().get((index * 2) + 1);
    }

    /* JADX INFO: renamed from: C */
    public final void m192558C(int index, boolean receiver) {
        if (receiver) {
            m192566y().m94792q1((this.id * ((long) BufferedChannelKt.f67403b)) + ((long) index));
        }
        m181785t();
    }

    /* JADX INFO: renamed from: D */
    public final E m192559D(int index) {
        E eM192556A = m192556A(index);
        m192564w(index);
        return eM192556A;
    }

    /* JADX INFO: renamed from: E */
    public final void m192560E(int index, Object value) {
        getF175961f().set(index * 2, value);
    }

    /* JADX INFO: renamed from: F */
    public final void m192561F(int index, @Nullable Object value) {
        getF175961f().set((index * 2) + 1, value);
    }

    /* JADX INFO: renamed from: G */
    public final void m192562G(int index, E element) {
        m192560E(index, element);
    }

    @Override // p153l.rke0
    /* JADX INFO: renamed from: r */
    public int mo172932r() {
        return BufferedChannelKt.f67403b;
    }

    @Override // p153l.rke0
    /* JADX INFO: renamed from: s */
    public void mo172933s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        Function1<E, Unit> function1;
        Function1<E, Unit> function2;
        int i = BufferedChannelKt.f67403b;
        boolean z = index >= i;
        if (z) {
            index -= i;
        }
        E eM192556A = m192556A(index);
        while (true) {
            Object objM192557B = m192557B(index);
            if ((objM192557B instanceof sop0) || (objM192557B instanceof top0)) {
                if (m192563v(index, objM192557B, z ? BufferedChannelKt.f67411j : BufferedChannelKt.f67412k)) {
                    m192564w(index);
                    m192558C(index, !z);
                    if (!z || (function1 = m192566y().onUndeliveredElement) == null) {
                        return;
                    }
                    OnUndeliveredElementKt.m95105b(function1, eM192556A, context);
                    return;
                }
            } else {
                if (objM192557B == BufferedChannelKt.f67411j || objM192557B == BufferedChannelKt.f67412k) {
                    break;
                }
                if (objM192557B != BufferedChannelKt.f67408g && objM192557B != BufferedChannelKt.f67407f) {
                    if (objM192557B == BufferedChannelKt.f67410i || objM192557B == BufferedChannelKt.f67405d || objM192557B == BufferedChannelKt.m94842z()) {
                        return;
                    }
                    mpq.m159379a("unexpected state: ", objM192557B);
                    return;
                }
            }
        }
        m192564w(index);
        if (!z || (function2 = m192566y().onUndeliveredElement) == null) {
            return;
        }
        OnUndeliveredElementKt.m95105b(function2, eM192556A, context);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m192563v(int index, @Nullable Object from, @Nullable Object to) {
        return ss4.m187688a(getF175961f(), (index * 2) + 1, from, to);
    }

    /* JADX INFO: renamed from: w */
    public final void m192564w(int index) {
        m192560E(index, null);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m192565x(int index, @Nullable Object update) {
        return getF175961f().getAndSet((index * 2) + 1, update);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final BufferedChannel<E> m192566y() {
        BufferedChannel<E> bufferedChannel = this._channel;
        bufferedChannel.getClass();
        return bufferedChannel;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF175961f() {
        return this.f175961f;
    }
}

package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0012J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J!\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0001\u0010\u0010R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016038\u0002X\u0082\u0004¨\u00065"}, m87232d2 = {"Ll/ur4;", "E", "Ll/mce0;", "", "id", "prev", "Lkotlinx/coroutines/channels/BufferedChannel;", "channel", "", "pointers", "<init>", "(JLl/ur4;Lkotlinx/coroutines/channels/BufferedChannel;I)V", FirebaseAnalytics.Param.INDEX, "element", "", "G", "(ILjava/lang/Object;)V", "A", "(I)Ljava/lang/Object;", "D", "w", "(I)V", "", "B", "value", "F", "from", "to", "", ResourceDirection.f38808v, "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", BaseSei.f13930X, "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", BLiveStormDanmakuGiftResourceType.f44446s, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "receiver", b2s.C_ZONE, "(IZ)V", "e", "Lkotlinx/coroutines/channels/BufferedChannel;", "_channel", BaseSei.f13931Y, "()Lkotlinx/coroutines/channels/BufferedChannel;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ur4<E> extends mce0<ur4<E>> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final BufferedChannel<E> _channel;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f177806f;

    public ur4(long j, @Nullable ur4<E> ur4Var, @Nullable BufferedChannel<E> bufferedChannel, int i) {
        super(j, ur4Var, i);
        this._channel = bufferedChannel;
        this.f177806f = new AtomicReferenceArray(BufferedChannelKt.f66729b * 2);
    }

    /* JADX INFO: renamed from: A */
    public final E m195037A(int index) {
        return (E) getF177806f().get(index * 2);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m195038B(int index) {
        return getF177806f().get((index * 2) + 1);
    }

    /* JADX INFO: renamed from: C */
    public final void m195039C(int index, boolean receiver) {
        if (receiver) {
            m195047y().m93900q1((this.id * ((long) BufferedChannelKt.f66729b)) + ((long) index));
        }
        m153993t();
    }

    /* JADX INFO: renamed from: D */
    public final E m195040D(int index) {
        E eM195037A = m195037A(index);
        m195045w(index);
        return eM195037A;
    }

    /* JADX INFO: renamed from: E */
    public final void m195041E(int index, Object value) {
        getF177806f().set(index * 2, value);
    }

    /* JADX INFO: renamed from: F */
    public final void m195042F(int index, @Nullable Object value) {
        getF177806f().set((index * 2) + 1, value);
    }

    /* JADX INFO: renamed from: G */
    public final void m195043G(int index, E element) {
        m195041E(index, element);
    }

    @Override // p149l.mce0
    /* JADX INFO: renamed from: r */
    public int mo145769r() {
        return BufferedChannelKt.f66729b;
    }

    @Override // p149l.mce0
    /* JADX INFO: renamed from: s */
    public void mo145770s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        Function1<E, Unit> function1;
        Function1<E, Unit> function2;
        int i = BufferedChannelKt.f66729b;
        boolean z = index >= i;
        if (z) {
            index -= i;
        }
        E eM195037A = m195037A(index);
        while (true) {
            Object objM195038B = m195038B(index);
            if ((objM195038B instanceof ofp0) || (objM195038B instanceof pfp0)) {
                if (m195044v(index, objM195038B, z ? BufferedChannelKt.f66737j : BufferedChannelKt.f66738k)) {
                    m195045w(index);
                    m195039C(index, !z);
                    if (!z || (function1 = m195047y().onUndeliveredElement) == null) {
                        return;
                    }
                    OnUndeliveredElementKt.m94212b(function1, eM195037A, context);
                    return;
                }
            } else {
                if (objM195038B == BufferedChannelKt.f66737j || objM195038B == BufferedChannelKt.f66738k) {
                    break;
                }
                if (objM195038B != BufferedChannelKt.f66734g && objM195038B != BufferedChannelKt.f66733f) {
                    if (objM195038B == BufferedChannelKt.f66736i || objM195038B == BufferedChannelKt.f66731d || objM195038B == BufferedChannelKt.m93950z()) {
                        return;
                    }
                    nnq.m160357a("unexpected state: ", objM195038B);
                    return;
                }
            }
        }
        m195045w(index);
        if (!z || (function2 = m195047y().onUndeliveredElement) == null) {
            return;
        }
        OnUndeliveredElementKt.m94212b(function2, eM195037A, context);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m195044v(int index, @Nullable Object from, @Nullable Object to) {
        return tr4.m190366a(getF177806f(), (index * 2) + 1, from, to);
    }

    /* JADX INFO: renamed from: w */
    public final void m195045w(int index) {
        m195041E(index, null);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m195046x(int index, @Nullable Object update) {
        return getF177806f().getAndSet((index * 2) + 1, update);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final BufferedChannel<E> m195047y() {
        BufferedChannel<E> bufferedChannel = this._channel;
        bufferedChannel.getClass();
        return bufferedChannel;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF177806f() {
        return this.f177806f;
    }
}

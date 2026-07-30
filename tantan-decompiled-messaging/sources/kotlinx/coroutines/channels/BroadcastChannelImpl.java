package kotlinx.coroutines.channels;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineStart;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.af3;
import p149l.bde0;
import p149l.bf3;
import p149l.jh3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002<=J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\tJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R<\u00104\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f00j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u00105R\u0017\u0010;\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m87232d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Ll/af3;", "Lkotlinx/coroutines/channels/ReceiveChannel;", Constants.INAPP_DATA_TAG, "()Lkotlinx/coroutines/channels/ReceiveChannel;", "element", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/Object;)Ljava/lang/Object;", "Ll/bde0;", "select", "", "U0", "(Ll/bde0;Ljava/lang/Object;)V", "", "cause", "", "D", "(Ljava/lang/Throwable;)Z", "J", "", "toString", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "w1", "(Lkotlinx/coroutines/channels/ReceiveChannel;)V", "", "m", "I", "u1", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "n", "Ljava/util/concurrent/locks/ReentrantLock;", JoinPoint.SYNCHRONIZATION_LOCK, "", "o", "Ljava/util/List;", "subscribers", "p", "Ljava/lang/Object;", "lastConflatedElement", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "q", "Ljava/util/HashMap;", "onSendInternalResult", "()Z", "isClosedForSend", "v1", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "a", "b", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements af3<E> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public List<? extends BufferedChannel<E>> subscribers;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Object lastConflatedElement;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final HashMap<bde0<?>, Object> onSendInternalResult;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$a */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$a;", "Lkotlinx/coroutines/channels/BufferedChannel;", "<init>", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "", "cause", "", "r1", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class C15408a extends BufferedChannel<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public C15408a() {
            super(BroadcastChannelImpl.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
        public boolean mo93788J(@Nullable Throwable cause) {
            ReentrantLock reentrantLock = BroadcastChannelImpl.this.lock;
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            reentrantLock.lock();
            try {
                broadcastChannelImpl.m93795w1(this);
                return super.mo93788J(cause);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$b */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$b;", "Lkotlinx/coroutines/channels/b;", "<init>", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "", "cause", "", "v1", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public final class C15409b extends C15415b<E> {
        public C15409b() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
        public boolean mo93788J(@Nullable Throwable cause) {
            BroadcastChannelImpl.this.m93795w1(this);
            return super.mo93788J(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel, p149l.nee0
    /* JADX INFO: renamed from: D */
    public boolean mo93786D(@Nullable Throwable cause) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).mo93786D(cause);
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj).m93885k0()) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
            return super.mo93786D(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0080 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.channels.BufferedChannel, p149l.nee0
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: E */
    public java.lang.Object mo93787E(E r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r2 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r2
            kotlin.ResultKt.m87239b(r8)
            r5 = r0
            r0 = r7
            r7 = r2
        L35:
            r2 = r5
            goto L84
        L37:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r6)
            r6 = 0
            return r6
        L3e:
            kotlin.ResultKt.m87239b(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.lock
            r8.lock()
            boolean r2 = r6.mo93792s()     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L9e
            int r2 = r6.capacity     // Catch: java.lang.Throwable -> L54
            r4 = -1
            if (r2 != r4) goto L56
            r6.lastConflatedElement = r7     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r6 = move-exception
            goto La3
        L56:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r2 = r6.subscribers     // Catch: java.lang.Throwable -> L54
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L65:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r6.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r2 = r2.mo93870a1(r8, r0)
            if (r2 != r1) goto L80
            return r1
        L80:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L35
        L84:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L98
            boolean r8 = r7.mo93792s()
            if (r8 != 0) goto L93
            goto L98
        L93:
            java.lang.Throwable r6 = r7.m93877f0()
            throw r6
        L98:
            r8 = r0
            r0 = r2
            goto L65
        L9b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L9e:
            java.lang.Throwable r6 = r6.m93877f0()     // Catch: java.lang.Throwable -> L54
            throw r6     // Catch: java.lang.Throwable -> L54
        La3:
            r8.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.mo93787E(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: J */
    public boolean mo93788J(@Nullable Throwable cause) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).mo93788J(cause);
            }
            this.lastConflatedElement = bf3.f75271a;
            return super.mo93788J(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* JADX INFO: renamed from: U0 */
    public void mo93789U0(@NotNull bde0<?> select, @Nullable Object element) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object objRemove = this.onSendInternalResult.remove(select);
            if (objRemove != null) {
                select.mo94310d(objRemove);
                reentrantLock.unlock();
            } else {
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                jh3.m141367d(C15424f.m94055a(select.getContext()), null, CoroutineStart.UNDISPATCHED, new BroadcastChannelImpl$registerSelectForSend$2(this, element, select, null), 1, null);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p149l.af3
    @NotNull
    /* JADX INFO: renamed from: d */
    public ReceiveChannel<E> mo93790d() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            C15408a c15409b = this.capacity == -1 ? new C15409b() : new C15408a();
            if (mo93792s() && this.lastConflatedElement == bf3.f75271a) {
                ((BufferedChannel) c15409b).mo93786D(m93868Y());
                return c15409b;
            }
            if (this.lastConflatedElement != bf3.f75271a) {
                ((BufferedChannel) c15409b).mo93791l(m93794v1());
            }
            this.subscribers = CollectionsKt.plus((Collection<? extends ReceiveChannel<E>>) this.subscribers, c15409b);
            return c15409b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, p149l.nee0
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo93791l(E element) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (mo93792s()) {
                Object objMo93791l = super.mo93791l(element);
                reentrantLock.unlock();
                return objMo93791l;
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).mo93876e1()) {
                        Object objM94002b = C15414a.INSTANCE.m94002b();
                        reentrantLock.unlock();
                        return objM94002b;
                    }
                }
            }
            if (this.capacity == -1) {
                this.lastConflatedElement = element;
            }
            Iterator<T> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).mo93791l(element);
            }
            Object objM94003c = C15414a.INSTANCE.m94003c(Unit.INSTANCE);
            reentrantLock.unlock();
            return objM94003c;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, p149l.nee0
    /* JADX INFO: renamed from: s */
    public boolean mo93792s() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.mo93792s();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.lastConflatedElement != bf3.f75271a) {
            str = "CONFLATED_ELEMENT=" + this.lastConflatedElement + "; ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(CollectionsKt.joinToString$default(this.subscribers, com.meituan.robust.Constants.PACKNAME_END, "<", ">", 0, null, null, 56, null));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u1, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* JADX INFO: renamed from: v1 */
    public final E m93794v1() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (mo93792s()) {
                Throwable thM93868Y = m93868Y();
                if (thM93868Y == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw thM93868Y;
            }
            if (this.lastConflatedElement == bf3.f75271a) {
                throw new IllegalStateException("No value");
            }
            E e = (E) this.lastConflatedElement;
            reentrantLock.unlock();
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w1 */
    public final void m93795w1(ReceiveChannel<? extends E> s) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj) != s) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}

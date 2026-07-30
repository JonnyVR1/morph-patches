package kotlinx.coroutines.internal;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20511u7;
import p153l.czc0;
import p153l.fx50;
import p153l.l31;
import p153l.u9c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00060\u0000j\u0002`\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0015\u0010(\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0015\u0010*\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0011\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000+8\u0002X\u0082\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¨\u00060"}, m88121d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Ll/czc0;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/czc0;", "Lkotlinx/coroutines/internal/Node;", "current", "g", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "", "h", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Ll/fx50;", "op", "f", "(Ll/fx50;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", "", "e", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "condAdd", "", Constants.KEY_T, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;)I", "q", "()Z", "r", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "toString", "()Ljava/lang/String;", "p", "isRemoved", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/Object;", "j", "nextNode", BLiveStormDanmakuGiftResourceType.f45292l, "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "a", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67574a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67575b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67576c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$a */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, m88121d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Ll/l31;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "affected", "", "failure", "", "f", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Ljava/lang/Object;)V", "b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "c", "oldNext", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @PublishedApi
    public static abstract class AbstractC15586a extends l31<LockFreeLinkedListNode> {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode newNode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public LockFreeLinkedListNode oldNext;

        public AbstractC15586a(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.newNode = lockFreeLinkedListNode;
        }

        @Override // p153l.l31
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo95102b(@NotNull LockFreeLinkedListNode affected, @Nullable Object failure) {
            boolean z = failure == null;
            LockFreeLinkedListNode lockFreeLinkedListNode = z ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null && C20511u7.m194801a(LockFreeLinkedListNode.m95087m(), affected, this, lockFreeLinkedListNode) && z) {
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                lockFreeLinkedListNode3.getClass();
                lockFreeLinkedListNode2.m95093h(lockFreeLinkedListNode3);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m95087m() {
        return f67574a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95090e(@NotNull LockFreeLinkedListNode node) {
        f67575b.set(node, this);
        f67574a.set(node, this);
        while (m95094i() == this) {
            if (C20511u7.m194801a(f67574a, this, this, node)) {
                node.m95093h(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final LockFreeLinkedListNode m95091f(fx50 op) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object obj;
        loop0: while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) f67575b.get(this);
            lockFreeLinkedListNode = lockFreeLinkedListNode2;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    obj = f67574a.get(lockFreeLinkedListNode);
                    if (obj == this) {
                        if (lockFreeLinkedListNode2 != lockFreeLinkedListNode && !C20511u7.m194801a(f67575b, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
                            break;
                        }
                        break;
                    }
                    if (mo95097p()) {
                        return null;
                    }
                    if (obj == op) {
                        break loop0;
                    }
                    if (obj instanceof fx50) {
                        ((fx50) obj).mo127929a(lockFreeLinkedListNode);
                        break;
                    }
                    if (!(obj instanceof czc0)) {
                        obj.getClass();
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode;
                        lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode = (LockFreeLinkedListNode) f67575b.get(lockFreeLinkedListNode);
                    }
                }
                if (!C20511u7.m194801a(f67574a, lockFreeLinkedListNode3, lockFreeLinkedListNode, ((czc0) obj).ref)) {
                    break;
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode3;
            }
        }
        return lockFreeLinkedListNode;
    }

    /* JADX INFO: renamed from: g */
    public final LockFreeLinkedListNode m95092g(LockFreeLinkedListNode current) {
        while (current.mo95097p()) {
            current = (LockFreeLinkedListNode) f67575b.get(current);
        }
        return current;
    }

    /* JADX INFO: renamed from: h */
    public final void m95093h(LockFreeLinkedListNode next) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67575b;
        do {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(next);
            if (m95094i() != next) {
                return;
            }
        } while (!C20511u7.m194801a(f67575b, next, lockFreeLinkedListNode, this));
        if (mo95097p()) {
            next.m95091f(null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Object m95094i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67574a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof fx50)) {
                return obj;
            }
            ((fx50) obj).mo127929a(this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final LockFreeLinkedListNode m95095j() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objM95094i = m95094i();
        czc0 czc0Var = objM95094i instanceof czc0 ? (czc0) objM95094i : null;
        if (czc0Var != null && (lockFreeLinkedListNode = czc0Var.ref) != null) {
            return lockFreeLinkedListNode;
        }
        objM95094i.getClass();
        return (LockFreeLinkedListNode) objM95094i;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LockFreeLinkedListNode m95096l() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM95091f = m95091f(null);
        return lockFreeLinkedListNodeM95091f == null ? m95092g((LockFreeLinkedListNode) f67575b.get(this)) : lockFreeLinkedListNodeM95091f;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo95097p() {
        return m95094i() instanceof czc0;
    }

    /* JADX INFO: renamed from: q */
    public boolean m95098q() {
        return m95099r() == null;
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: r */
    public final LockFreeLinkedListNode m95099r() {
        Object objM95094i;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objM95094i = m95094i();
            if (objM95094i instanceof czc0) {
                return ((czc0) objM95094i).ref;
            }
            if (objM95094i == this) {
                return (LockFreeLinkedListNode) objM95094i;
            }
            objM95094i.getClass();
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objM95094i;
        } while (!C20511u7.m194801a(f67574a, this, objM95094i, lockFreeLinkedListNode.m95100s()));
        lockFreeLinkedListNode.m95091f(null);
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final czc0 m95100s() {
        czc0 czc0Var = (czc0) f67576c.get(this);
        if (czc0Var != null) {
            return czc0Var;
        }
        czc0 czc0Var2 = new czc0(this);
        f67576c.set(this, czc0Var2);
        return czc0Var2;
    }

    @PublishedApi
    /* JADX INFO: renamed from: t */
    public final int m95101t(@NotNull LockFreeLinkedListNode node, @NotNull LockFreeLinkedListNode next, @NotNull AbstractC15586a condAdd) {
        f67575b.set(node, this);
        f67574a.set(node, next);
        condAdd.oldNext = next;
        if (C20511u7.m194801a(f67574a, this, next, condAdd)) {
            return condAdd.mo127929a(this) == null ? 1 : 2;
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            @Nullable
            public Object get() {
                return u9c.m195086a(this.receiver);
            }
        } + '@' + u9c.m195087b(this);
    }
}

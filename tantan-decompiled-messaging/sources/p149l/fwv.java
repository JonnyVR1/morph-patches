package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\f B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R%\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00130)8\u0002X\u0082\u0004R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010-8\u0002X\u0082\u0004¨\u00060"}, m87232d2 = {"Ll/fwv;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", Constants.INAPP_DATA_TAG, "()Z", "element", "a", "(Ljava/lang/Object;)I", "m", "()Ljava/lang/Object;", BLiveStormDanmakuGiftResourceType.f44444l, "()Ll/fwv;", FirebaseAnalytics.Param.INDEX, "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Ll/fwv;", "oldHead", "newHead", "n", "(II)Ll/fwv;", "", "k", "()J", "state", "c", "(J)Ll/fwv;", "b", "I", "Z", "mask", "j", "isEmpty", "g", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "Companion", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fwv<E> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f99687e = AtomicReferenceFieldUpdater.newUpdater(fwv.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f99688f = AtomicLongFieldUpdater.newUpdater(fwv.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final yfh0 f99689g = new yfh0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean singleConsumer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int mask;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f99693d;

    /* JADX INFO: renamed from: l.fwv$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Ll/fwv$b;", "", "", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "a", "I", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C16953b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public final int index;

        public C16953b(int i) {
            this.index = i;
        }
    }

    public fwv(int i, boolean z) {
        this.capacity = i;
        this.singleConsumer = z;
        int i2 = i - 1;
        this.mask = i2;
        this.f99693d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            qkq0.m175383a("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        qkq0.m175383a("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m123561a(@NotNull E element) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f99688f;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return INSTANCE.m123573a(j);
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.mask;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.singleConsumer || this.getF99693d().get(i2 & i3) == null) {
                fwv<E> fwvVar = this;
                if (f99688f.compareAndSet(fwvVar, j, INSTANCE.m123575c(j, (i2 + 1) & 1073741823))) {
                    fwvVar.getF99693d().set(i2 & i3, element);
                    fwv<E> fwvVarM123565e = fwvVar;
                    while ((f99688f.get(fwvVarM123565e) & 1152921504606846976L) != 0 && (fwvVarM123565e = fwvVarM123565e.m123570l().m123565e(i2, element)) != null) {
                    }
                    return 0;
                }
                this = fwvVar;
            } else {
                int i4 = this.capacity;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final fwv<E> m123562b(long state) {
        fwv<E> fwvVar = new fwv<>(this.capacity * 2, this.singleConsumer);
        int i = (int) (1073741823 & state);
        int i2 = (int) ((1152921503533105152L & state) >> 30);
        while (true) {
            int i3 = this.mask;
            if ((i & i3) == (i3 & i2)) {
                f99688f.set(fwvVar, INSTANCE.m123576d(state, 1152921504606846976L));
                return fwvVar;
            }
            Object c16953b = getF99693d().get(this.mask & i);
            if (c16953b == null) {
                c16953b = new C16953b(i);
            }
            fwvVar.getF99693d().set(fwvVar.mask & i, c16953b);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final fwv<E> m123563c(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99687e;
        while (true) {
            fwv<E> fwvVar = (fwv) atomicReferenceFieldUpdater.get(this);
            if (fwvVar != null) {
                return fwvVar;
            }
            C21643z7.m217426a(f99687e, this, null, m123562b(state));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m123564d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f99688f;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            fwv<E> fwvVar = this;
            if (atomicLongFieldUpdater.compareAndSet(fwvVar, j, 2305843009213693952L | j)) {
                return true;
            }
            this = fwvVar;
        }
    }

    /* JADX INFO: renamed from: e */
    public final fwv<E> m123565e(int index, E element) {
        Object obj = getF99693d().get(this.mask & index);
        if (!(obj instanceof C16953b) || ((C16953b) obj).index != index) {
            return null;
        }
        getF99693d().set(index & this.mask, element);
        return this;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF99693d() {
        return this.f99693d;
    }

    /* JADX INFO: renamed from: g */
    public final int m123567g() {
        long j = f99688f.get(this);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m123568j() {
        long j = f99688f.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: k */
    public final long m123569k() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f99688f;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            long j2 = 1152921504606846976L | j;
            fwv<E> fwvVar = this;
            if (atomicLongFieldUpdater.compareAndSet(fwvVar, j, j2)) {
                return j2;
            }
            this = fwvVar;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final fwv<E> m123570l() {
        return m123563c(m123569k());
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m123571m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f99688f;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return f99689g;
            }
            int i = (int) (1073741823 & j);
            int i2 = this.mask;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i2 & i)) {
                return null;
            }
            Object obj = this.getF99693d().get(this.mask & i);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof C16953b) {
                    return null;
                }
                int i3 = (i + 1) & 1073741823;
                fwv<E> fwvVar = this;
                if (f99688f.compareAndSet(fwvVar, j, INSTANCE.m123574b(j, i3))) {
                    fwvVar.getF99693d().set(fwvVar.mask & i, null);
                    return obj;
                }
                if (fwvVar.singleConsumer) {
                    fwv<E> fwvVarM123572n = fwvVar;
                    do {
                        fwvVarM123572n = fwvVarM123572n.m123572n(i, i3);
                    } while (fwvVarM123572n != null);
                    return obj;
                }
                this = fwvVar;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final fwv<E> m123572n(int oldHead, int newHead) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f99688f;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (1073741823 & j);
            if ((1152921504606846976L & j) != 0) {
                return this.m123570l();
            }
            fwv<E> fwvVar = this;
            if (f99688f.compareAndSet(fwvVar, j, INSTANCE.m123574b(j, newHead))) {
                fwvVar.getF99693d().set(fwvVar.mask & i, null);
                return null;
            }
            this = fwvVar;
        }
    }

    /* JADX INFO: renamed from: l.fwv$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006$"}, m87232d2 = {"Ll/fwv$a;", "", "<init>", "()V", "", "other", Constants.INAPP_DATA_TAG, "(JJ)J", "", "newHead", "b", "(JI)J", "newTail", "c", "a", "(J)I", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Ll/yfh0;", "REMOVE_FROZEN", "Ll/yfh0;", "TAIL_MASK", "TAIL_SHIFT", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m123573a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: b */
        public final long m123574b(long j, int i) {
            return m123576d(j, 1073741823L) | ((long) i);
        }

        /* JADX INFO: renamed from: c */
        public final long m123575c(long j, int i) {
            return m123576d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* JADX INFO: renamed from: d */
        public final long m123576d(long j, long j2) {
            return j & (~j2);
        }

        public Companion() {
        }
    }
}

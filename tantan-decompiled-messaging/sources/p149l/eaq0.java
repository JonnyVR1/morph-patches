package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.p046p1.mobile.putong.core.data.Condition;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0003\u0018\u001a\u001dB\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u000f2\n\u0010\u0016\u001a\u00060\u0012R\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006'"}, m87232d2 = {"Ll/eaq0;", "", "", "maxConcurrent", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(ILjava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "callback", "", "addToFront", "Ll/eaq0$b;", "e", "(Ljava/lang/Runnable;Z)Ll/eaq0$b;", "", RXScreenCaptureService.KEY_INDEX, "()V", "Ll/eaq0$c;", "finished", "h", "(Ll/eaq0$c;)V", "node", "g", "a", "I", "b", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "workLock", Constants.INAPP_DATA_TAG, "Ll/eaq0$c;", "pendingJobs", "runningJobs", "f", "runningCount", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class eaq0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxConcurrent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock workLock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C16565c pendingJobs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C16565c runningJobs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int runningCount;

    /* JADX INFO: renamed from: l.eaq0$b */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Ll/eaq0$b;", "", "", "cancel", "()Z", "", "a", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC16564b {
        /* JADX INFO: renamed from: a */
        void mo115430a();

        boolean cancel();
    }

    /* JADX INFO: renamed from: l.eaq0$c */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00060\u0000R\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0000R\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0018\u00010\u0000R\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0000R\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R0\u0010\u001a\u001a\b\u0018\u00010\u0000R\u00020\f2\f\u0010\u0016\u001a\b\u0018\u00010\u0000R\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0018\u00010\u0000R\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\"\u0010 \u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/eaq0$c;", "Ll/eaq0$b;", "Ljava/lang/Runnable;", "callback", "<init>", "(Ll/eaq0;Ljava/lang/Runnable;)V", "", "cancel", "()Z", "", "a", "()V", "Ll/eaq0;", "list", "addToFront", "b", "(Ll/eaq0$c;Z)Ll/eaq0$c;", "e", "(Ll/eaq0$c;)Ll/eaq0$c;", "Ljava/lang/Runnable;", "c", "()Ljava/lang/Runnable;", "<set-?>", "Ll/eaq0$c;", "getNext", "()Ll/eaq0$c;", "next", "prev", Constants.INAPP_DATA_TAG, "Z", "f", "(Z)V", "isRunning", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public final class C16565c implements InterfaceC16564b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Runnable callback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public C16565c next;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public C16565c prev;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean isRunning;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ eaq0 f90238e;

        public C16565c(@NotNull eaq0 eaq0Var, Runnable runnable) {
            runnable.getClass();
            this.f90238e = eaq0Var;
            this.callback = runnable;
        }

        @Override // p149l.eaq0.InterfaceC16564b
        /* JADX INFO: renamed from: a */
        public void mo115430a() {
            ReentrantLock reentrantLock = this.f90238e.workLock;
            eaq0 eaq0Var = this.f90238e;
            reentrantLock.lock();
            try {
                if (!getIsRunning()) {
                    eaq0Var.pendingJobs = m115434e(eaq0Var.pendingJobs);
                    eaq0Var.pendingJobs = m115431b(eaq0Var.pendingJobs, true);
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C16565c m115431b(@Nullable C16565c list, boolean addToFront) {
            Companion companion = eaq0.INSTANCE;
            companion.m115429b(this.next == null);
            companion.m115429b(this.prev == null);
            if (list == null) {
                this.prev = this;
                this.next = this;
                list = this;
            } else {
                this.next = list;
                C16565c c16565c = list.prev;
                this.prev = c16565c;
                if (c16565c != null) {
                    c16565c.next = this;
                }
                C16565c c16565c2 = this.next;
                if (c16565c2 != null) {
                    c16565c2.prev = c16565c != null ? c16565c.next : null;
                }
            }
            return addToFront ? this : list;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Runnable getCallback() {
            return this.callback;
        }

        @Override // p149l.eaq0.InterfaceC16564b
        public boolean cancel() {
            ReentrantLock reentrantLock = this.f90238e.workLock;
            eaq0 eaq0Var = this.f90238e;
            reentrantLock.lock();
            try {
                if (getIsRunning()) {
                    Unit unit = Unit.INSTANCE;
                    return false;
                }
                eaq0Var.pendingJobs = m115434e(eaq0Var.pendingJobs);
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getIsRunning() {
            return this.isRunning;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final C16565c m115434e(@Nullable C16565c list) {
            Companion companion = eaq0.INSTANCE;
            companion.m115429b(this.next != null);
            companion.m115429b(this.prev != null);
            if (list == this && (list = this.next) == this) {
                list = null;
            }
            C16565c c16565c = this.next;
            if (c16565c != null) {
                c16565c.prev = this.prev;
            }
            C16565c c16565c2 = this.prev;
            if (c16565c2 != null) {
                c16565c2.next = c16565c;
            }
            this.prev = null;
            this.next = null;
            return list;
        }

        /* JADX INFO: renamed from: f */
        public void m115435f(boolean z) {
            this.isRunning = z;
        }
    }

    @JvmOverloads
    public eaq0(int i, @NotNull Executor executor) {
        executor.getClass();
        this.maxConcurrent = i;
        this.executor = executor;
        this.workLock = new ReentrantLock();
    }

    /* JADX INFO: renamed from: a */
    public static void m115419a(C16565c c16565c, eaq0 eaq0Var) {
        c16565c.getClass();
        eaq0Var.getClass();
        try {
            c16565c.getCallback().run();
        } finally {
            eaq0Var.m115426h(c16565c);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC16564b m115423f(eaq0 eaq0Var, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return eaq0Var.m115424e(runnable, z);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC16564b m115424e(@NotNull Runnable callback, boolean addToFront) {
        callback.getClass();
        C16565c c16565c = new C16565c(this, callback);
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            this.pendingJobs = c16565c.m115431b(this.pendingJobs, addToFront);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            m115427i();
            return c16565c;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m115425g(final C16565c node) {
        this.executor.execute(new Runnable() { // from class: l.daq0
            @Override // java.lang.Runnable
            public final void run() {
                eaq0.m115419a(node, this);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m115426h(C16565c finished) {
        C16565c c16565c;
        this.workLock.lock();
        if (finished != null) {
            this.runningJobs = finished.m115434e(this.runningJobs);
            this.runningCount--;
        }
        if (this.runningCount < this.maxConcurrent) {
            c16565c = this.pendingJobs;
            if (c16565c != null) {
                this.pendingJobs = c16565c.m115434e(c16565c);
                this.runningJobs = c16565c.m115431b(this.runningJobs, false);
                this.runningCount++;
                c16565c.m115435f(true);
            }
        } else {
            c16565c = null;
        }
        this.workLock.unlock();
        if (c16565c != null) {
            m115425g(c16565c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m115427i() {
        m115426h(null);
    }

    /* JADX INFO: renamed from: l.eaq0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/eaq0$a;", "", "<init>", "()V", "", Condition.TYPE, "", "b", "(Z)V", "", "DEFAULT_MAX_CONCURRENT", "I", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final void m115429b(boolean condition) {
            if (!condition) {
                throw new FacebookException("Validation failed");
            }
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public eaq0() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ eaq0(int i, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i, (i2 & 2) != 0 ? C1577c.m8056u() : executor);
    }
}

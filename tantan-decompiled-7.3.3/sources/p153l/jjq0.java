package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.p051p1.mobile.putong.core.data.Condition;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0003\u0018\u001a\u001dB\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u000f2\n\u0010\u0016\u001a\u00060\u0012R\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006'"}, m88121d2 = {"Ll/jjq0;", "", "", "maxConcurrent", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(ILjava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "callback", "", "addToFront", "Ll/jjq0$b;", "e", "(Ljava/lang/Runnable;Z)Ll/jjq0$b;", "", RXScreenCaptureService.KEY_INDEX, "()V", "Ll/jjq0$c;", "finished", "h", "(Ll/jjq0$c;)V", "node", "g", "a", "I", "b", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "workLock", Constants.INAPP_DATA_TAG, "Ll/jjq0$c;", "pendingJobs", "runningJobs", "f", "runningCount", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class jjq0 {

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
    public C17964c pendingJobs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C17964c runningJobs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int runningCount;

    /* JADX INFO: renamed from: l.jjq0$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ll/jjq0$b;", "", "", "cancel", "()Z", "", "a", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC17963b {
        /* JADX INFO: renamed from: a */
        void mo145106a();

        boolean cancel();
    }

    /* JADX INFO: renamed from: l.jjq0$c */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00060\u0000R\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0000R\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0018\u00010\u0000R\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0000R\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R0\u0010\u001a\u001a\b\u0018\u00010\u0000R\u00020\f2\f\u0010\u0016\u001a\b\u0018\u00010\u0000R\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0018\u00010\u0000R\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\"\u0010 \u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/jjq0$c;", "Ll/jjq0$b;", "Ljava/lang/Runnable;", "callback", "<init>", "(Ll/jjq0;Ljava/lang/Runnable;)V", "", "cancel", "()Z", "", "a", "()V", "Ll/jjq0;", "list", "addToFront", "b", "(Ll/jjq0$c;Z)Ll/jjq0$c;", "e", "(Ll/jjq0$c;)Ll/jjq0$c;", "Ljava/lang/Runnable;", "c", "()Ljava/lang/Runnable;", "<set-?>", "Ll/jjq0$c;", "getNext", "()Ll/jjq0$c;", "next", "prev", Constants.INAPP_DATA_TAG, "Z", "f", "(Z)V", "isRunning", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public final class C17964c implements InterfaceC17963b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Runnable callback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public C17964c next;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public C17964c prev;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean isRunning;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ jjq0 f121226e;

        public C17964c(@NotNull jjq0 jjq0Var, Runnable runnable) {
            runnable.getClass();
            this.f121226e = jjq0Var;
            this.callback = runnable;
        }

        @Override // p153l.jjq0.InterfaceC17963b
        /* JADX INFO: renamed from: a */
        public void mo145106a() {
            ReentrantLock reentrantLock = this.f121226e.workLock;
            jjq0 jjq0Var = this.f121226e;
            reentrantLock.lock();
            try {
                if (!getIsRunning()) {
                    jjq0Var.pendingJobs = m145110e(jjq0Var.pendingJobs);
                    jjq0Var.pendingJobs = m145107b(jjq0Var.pendingJobs, true);
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C17964c m145107b(@Nullable C17964c list, boolean addToFront) {
            Companion companion = jjq0.INSTANCE;
            companion.m145105b(this.next == null);
            companion.m145105b(this.prev == null);
            if (list == null) {
                this.prev = this;
                this.next = this;
                list = this;
            } else {
                this.next = list;
                C17964c c17964c = list.prev;
                this.prev = c17964c;
                if (c17964c != null) {
                    c17964c.next = this;
                }
                C17964c c17964c2 = this.next;
                if (c17964c2 != null) {
                    c17964c2.prev = c17964c != null ? c17964c.next : null;
                }
            }
            return addToFront ? this : list;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Runnable getCallback() {
            return this.callback;
        }

        @Override // p153l.jjq0.InterfaceC17963b
        public boolean cancel() {
            ReentrantLock reentrantLock = this.f121226e.workLock;
            jjq0 jjq0Var = this.f121226e;
            reentrantLock.lock();
            try {
                if (getIsRunning()) {
                    Unit unit = Unit.INSTANCE;
                    return false;
                }
                jjq0Var.pendingJobs = m145110e(jjq0Var.pendingJobs);
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
        public final C17964c m145110e(@Nullable C17964c list) {
            Companion companion = jjq0.INSTANCE;
            companion.m145105b(this.next != null);
            companion.m145105b(this.prev != null);
            if (list == this && (list = this.next) == this) {
                list = null;
            }
            C17964c c17964c = this.next;
            if (c17964c != null) {
                c17964c.prev = this.prev;
            }
            C17964c c17964c2 = this.prev;
            if (c17964c2 != null) {
                c17964c2.next = c17964c;
            }
            this.prev = null;
            this.next = null;
            return list;
        }

        /* JADX INFO: renamed from: f */
        public void m145111f(boolean z) {
            this.isRunning = z;
        }
    }

    @JvmOverloads
    public jjq0(int i, @NotNull Executor executor) {
        executor.getClass();
        this.maxConcurrent = i;
        this.executor = executor;
        this.workLock = new ReentrantLock();
    }

    /* JADX INFO: renamed from: a */
    public static void m145095a(C17964c c17964c, jjq0 jjq0Var) {
        c17964c.getClass();
        jjq0Var.getClass();
        try {
            c17964c.getCallback().run();
        } finally {
            jjq0Var.m145102h(c17964c);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC17963b m145099f(jjq0 jjq0Var, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return jjq0Var.m145100e(runnable, z);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC17963b m145100e(@NotNull Runnable callback, boolean addToFront) {
        callback.getClass();
        C17964c c17964c = new C17964c(this, callback);
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            this.pendingJobs = c17964c.m145107b(this.pendingJobs, addToFront);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            m145103i();
            return c17964c;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m145101g(final C17964c node) {
        this.executor.execute(new Runnable() { // from class: l.ijq0
            @Override // java.lang.Runnable
            public final void run() {
                jjq0.m145095a(node, this);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m145102h(C17964c finished) {
        C17964c c17964c;
        this.workLock.lock();
        if (finished != null) {
            this.runningJobs = finished.m145110e(this.runningJobs);
            this.runningCount--;
        }
        if (this.runningCount < this.maxConcurrent) {
            c17964c = this.pendingJobs;
            if (c17964c != null) {
                this.pendingJobs = c17964c.m145110e(c17964c);
                this.runningJobs = c17964c.m145107b(this.runningJobs, false);
                this.runningCount++;
                c17964c.m145111f(true);
            }
        } else {
            c17964c = null;
        }
        this.workLock.unlock();
        if (c17964c != null) {
            m145101g(c17964c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m145103i() {
        m145102h(null);
    }

    /* JADX INFO: renamed from: l.jjq0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/jjq0$a;", "", "<init>", "()V", "", Condition.TYPE, "", "b", "(Z)V", "", "DEFAULT_MAX_CONCURRENT", "I", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final void m145105b(boolean condition) {
            if (!condition) {
                throw new FacebookException("Validation failed");
            }
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public jjq0() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ jjq0(int i, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i, (i2 & 2) != 0 ? C1600c.m8110u() : executor);
    }
}

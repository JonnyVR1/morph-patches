package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.InterfaceC15513b;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\u000fB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0010"}, m88121d2 = {"Ll/wp1;", p7f.GPS_DIRECTION_TRUE, "", "", "Ll/utd;", "deferreds", "<init>", "([Ll/utd;)V", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "[Ll/utd;", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class wp1<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f190232b = AtomicIntegerFieldUpdater.newUpdater(wp1.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final utd<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: l.wp1$a */
    @Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\u001e8\u0002X\u0082\u0004¨\u0006 "}, m88121d2 = {"Ll/wp1$a;", "Ll/hpq;", "Ll/ag4;", "", "continuation", "<init>", "(Ll/wp1;Ll/ag4;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Ll/ag4;", "Ll/z5e;", "f", "Ll/z5e;", BaseSei.f14624X, "()Ll/z5e;", "A", "(Ll/z5e;)V", "handle", "Ll/wp1$b;", "Ll/wp1;", "value", "w", "()Ll/wp1$b;", BaseSei.f14626Z, "(Ll/wp1$b;)V", "disposer", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class C21161a extends hpq {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f190234h = AtomicReferenceFieldUpdater.newUpdater(C21161a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final ag4<List<? extends T>> continuation;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public z5e handle;

        /* JADX WARN: Multi-variable type inference failed */
        public C21161a(ag4<? super List<? extends T>> ag4Var) {
            this.continuation = ag4Var;
        }

        /* JADX INFO: renamed from: A */
        public final void m207402A(@NotNull z5e z5eVar) {
            this.handle = z5eVar;
        }

        @Override // kotlinx.coroutines.InterfaceC15592n
        /* JADX INFO: renamed from: a */
        public void mo94601a(@Nullable Throwable cause) {
            if (cause != null) {
                Object objMo94673y = this.continuation.mo94673y(cause);
                if (objMo94673y != null) {
                    this.continuation.mo94671w(objMo94673y);
                    wp1<T>.C21162b c21162bM207403w = m207403w();
                    if (c21162bM207403w != null) {
                        c21162bM207403w.m207406b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (wp1.m207399d().decrementAndGet(wp1.this) == 0) {
                ag4<List<? extends T>> ag4Var = this.continuation;
                utd[] utdVarArr = wp1.this.deferreds;
                ArrayList arrayList = new ArrayList(utdVarArr.length);
                for (utd utdVar : utdVarArr) {
                    arrayList.add(utdVar.mo164040q());
                }
                ag4Var.resumeWith(Result.m225066constructorimpl(arrayList));
            }
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        public final wp1<T>.C21162b m207403w() {
            return (C21162b) f190234h.get(this);
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public final z5e m207404x() {
            z5e z5eVar = this.handle;
            if (z5eVar != null) {
                return z5eVar;
            }
            Intrinsics.m88391r("handle");
            return null;
        }

        /* JADX INFO: renamed from: z */
        public final void m207405z(@Nullable wp1<T>.C21162b c21162b) {
            f190234h.set(this, c21162b);
        }
    }

    /* JADX INFO: renamed from: l.wp1$b */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/wp1$b;", "Lkotlinx/coroutines/b;", "", "Ll/wp1$a;", "Ll/wp1;", "nodes", "<init>", "(Ll/wp1;[Ll/wp1$a;)V", "", "b", "()V", "", "cause", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[Ll/wp1$a;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class C21162b implements InterfaceC15513b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final wp1<T>.C21161a[] nodes;

        public C21162b(wp1<T>.C21161a[] c21161aArr) {
            this.nodes = c21161aArr;
        }

        @Override // kotlinx.coroutines.InterfaceC15513b
        /* JADX INFO: renamed from: a */
        public void mo94629a(@Nullable Throwable cause) {
            m207406b();
        }

        /* JADX INFO: renamed from: b */
        public final void m207406b() {
            for (wp1<T>.C21161a c21161a : this.nodes) {
                c21161a.m207404x().dispose();
            }
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wp1(@NotNull utd<? extends T>[] utdVarArr) {
        this.deferreds = utdVarArr;
        this.notCompletedCount$volatile = utdVarArr.length;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m207399d() {
        return f190232b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m207400c(@NotNull Continuation<? super List<? extends T>> continuation) {
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        int length = this.deferreds.length;
        C21161a[] c21161aArr = new C21161a[length];
        for (int i = 0; i < length; i++) {
            utd utdVar = this.deferreds[i];
            utdVar.start();
            C21161a c21161a = new C21161a(c15514c);
            c21161a.m207402A(JobKt__JobKt.m94518m(utdVar, false, false, c21161a, 3, null));
            Unit unit = Unit.INSTANCE;
            c21161aArr[i] = c21161a;
        }
        wp1<T>.C21162b c21162b = new C21162b(c21161aArr);
        for (int i2 = 0; i2 < length; i2++) {
            c21161aArr[i2].m207405z(c21162b);
        }
        if (c15514c.mo94662m()) {
            c21162b.m207406b();
        } else {
            cg4.m109665c(c15514c, c21162b);
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v;
    }
}

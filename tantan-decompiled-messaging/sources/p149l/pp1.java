package p149l;

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
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.InterfaceC15406b;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\u000fB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0010"}, m87232d2 = {"Ll/pp1;", j6f.GPS_DIRECTION_TRUE, "", "", "Ll/gsd;", "deferreds", "<init>", "([Ll/gsd;)V", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "[Ll/gsd;", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class pp1<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f150587b = AtomicIntegerFieldUpdater.newUpdater(pp1.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gsd<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: l.pp1$a */
    @Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\u001e8\u0002X\u0082\u0004¨\u0006 "}, m87232d2 = {"Ll/pp1$a;", "Ll/inq;", "Ll/bf4;", "", "continuation", "<init>", "(Ll/pp1;Ll/bf4;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Ll/bf4;", "Ll/l4e;", "f", "Ll/l4e;", BaseSei.f13930X, "()Ll/l4e;", "A", "(Ll/l4e;)V", "handle", "Ll/pp1$b;", "Ll/pp1;", "value", "w", "()Ll/pp1$b;", BaseSei.f13932Z, "(Ll/pp1$b;)V", "disposer", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class C19305a extends inq {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f150589h = AtomicReferenceFieldUpdater.newUpdater(C19305a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final bf4<List<? extends T>> continuation;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public l4e handle;

        /* JADX WARN: Multi-variable type inference failed */
        public C19305a(bf4<? super List<? extends T>> bf4Var) {
            this.continuation = bf4Var;
        }

        /* JADX INFO: renamed from: A */
        public final void m170658A(@NotNull l4e l4eVar) {
            this.handle = l4eVar;
        }

        @Override // kotlinx.coroutines.InterfaceC15485n
        /* JADX INFO: renamed from: a */
        public void mo93710a(@Nullable Throwable cause) {
            if (cause != null) {
                Object objMo93781y = this.continuation.mo93781y(cause);
                if (objMo93781y != null) {
                    this.continuation.mo93779w(objMo93781y);
                    pp1<T>.C19306b c19306bM170659w = m170659w();
                    if (c19306bM170659w != null) {
                        c19306bM170659w.m170662b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (pp1.m170655d().decrementAndGet(pp1.this) == 0) {
                bf4<List<? extends T>> bf4Var = this.continuation;
                gsd[] gsdVarArr = pp1.this.deferreds;
                ArrayList arrayList = new ArrayList(gsdVarArr.length);
                for (gsd gsdVar : gsdVarArr) {
                    arrayList.add(gsdVar.mo127792q());
                }
                bf4Var.resumeWith(Result.m223820constructorimpl(arrayList));
            }
        }

        @Nullable
        /* JADX INFO: renamed from: w */
        public final pp1<T>.C19306b m170659w() {
            return (C19306b) f150589h.get(this);
        }

        @NotNull
        /* JADX INFO: renamed from: x */
        public final l4e m170660x() {
            l4e l4eVar = this.handle;
            if (l4eVar != null) {
                return l4eVar;
            }
            Intrinsics.m87502r("handle");
            return null;
        }

        /* JADX INFO: renamed from: z */
        public final void m170661z(@Nullable pp1<T>.C19306b c19306b) {
            f150589h.set(this, c19306b);
        }
    }

    /* JADX INFO: renamed from: l.pp1$b */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/pp1$b;", "Lkotlinx/coroutines/b;", "", "Ll/pp1$a;", "Ll/pp1;", "nodes", "<init>", "(Ll/pp1;[Ll/pp1$a;)V", "", "b", "()V", "", "cause", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[Ll/pp1$a;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class C19306b implements InterfaceC15406b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final pp1<T>.C19305a[] nodes;

        public C19306b(pp1<T>.C19305a[] c19305aArr) {
            this.nodes = c19305aArr;
        }

        @Override // kotlinx.coroutines.InterfaceC15406b
        /* JADX INFO: renamed from: a */
        public void mo93737a(@Nullable Throwable cause) {
            m170662b();
        }

        /* JADX INFO: renamed from: b */
        public final void m170662b() {
            for (pp1<T>.C19305a c19305a : this.nodes) {
                c19305a.m170660x().dispose();
            }
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pp1(@NotNull gsd<? extends T>[] gsdVarArr) {
        this.deferreds = gsdVarArr;
        this.notCompletedCount$volatile = gsdVarArr.length;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m170655d() {
        return f150587b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m170656c(@NotNull Continuation<? super List<? extends T>> continuation) {
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        int length = this.deferreds.length;
        C19305a[] c19305aArr = new C19305a[length];
        for (int i = 0; i < length; i++) {
            gsd gsdVar = this.deferreds[i];
            gsdVar.start();
            C19305a c19305a = new C19305a(c15407c);
            c19305a.m170658A(JobKt__JobKt.m93627m(gsdVar, false, false, c19305a, 3, null));
            Unit unit = Unit.INSTANCE;
            c19305aArr[i] = c19305a;
        }
        pp1<T>.C19306b c19306b = new C19306b(c19305aArr);
        for (int i2 = 0; i2 < length; i2++) {
            c19305aArr[i2].m170661z(c19306b);
        }
        if (c15407c.mo93770m()) {
            c19306b.m170662b();
        } else {
            df4.m111431c(c15407c, c19306b);
        }
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v;
    }
}

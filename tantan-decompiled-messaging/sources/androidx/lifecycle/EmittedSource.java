package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import p149l.d4e;
import p149l.izx;
import p149l.jh3;
import p149l.l4e;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Landroidx/lifecycle/EmittedSource;", "Ll/l4e;", "Landroidx/lifecycle/LiveData;", "source", "Ll/izx;", "mediator", "<init>", "(Landroidx/lifecycle/LiveData;Ll/izx;)V", "", "dispose", "()V", "c", "a", "Landroidx/lifecycle/LiveData;", "b", "Ll/izx;", "", "Z", "disposed", "lifecycle-livedata_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class EmittedSource implements l4e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LiveData<?> source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final izx<?> mediator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean disposed;

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.EmittedSource$dispose$1", m87374f = "CoroutineLiveData.kt", m87375l = {}, m87376m = "invokeSuspend")
    public static final class C04491 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        int label;

        public C04491(Continuation<? super C04491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmittedSource.this.new C04491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04491) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uwp.m196133e();
            if (this.label != 0) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            EmittedSource.this.m2960c();
            return Unit.INSTANCE;
        }
    }

    public EmittedSource(@NotNull LiveData<?> liveData, @NotNull izx<?> izxVar) {
        liveData.getClass();
        izxVar.getClass();
        this.source = liveData;
        this.mediator = izxVar;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m2960c() {
        if (this.disposed) {
            return;
        }
        this.mediator.m139077q(this.source);
        this.disposed = true;
    }

    @Override // p149l.l4e
    public void dispose() {
        jh3.m141367d(C15424f.m94055a(d4e.m109982c().getImmediate()), null, null, new C04491(null), 3, null);
    }
}

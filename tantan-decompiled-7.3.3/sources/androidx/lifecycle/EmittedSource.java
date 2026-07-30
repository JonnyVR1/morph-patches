package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import p153l.drb;
import p153l.f8y;
import p153l.r5e;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;
import p153l.z5e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Landroidx/lifecycle/EmittedSource;", "Ll/z5e;", "Landroidx/lifecycle/LiveData;", "source", "Ll/f8y;", "mediator", "<init>", "(Landroidx/lifecycle/LiveData;Ll/f8y;)V", "", "dispose", "()V", "c", "a", "Landroidx/lifecycle/LiveData;", "b", "Ll/f8y;", "", "Z", "disposed", "lifecycle-livedata_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class EmittedSource implements z5e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LiveData<?> source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f8y<?> mediator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean disposed;

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.EmittedSource$dispose$1", m88263f = "CoroutineLiveData.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C04501 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        int label;

        public C04501(Continuation<? super C04501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmittedSource.this.new C04501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04501) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            EmittedSource.this.m2961c();
            return Unit.INSTANCE;
        }
    }

    public EmittedSource(@NotNull LiveData<?> liveData, @NotNull f8y<?> f8yVar) {
        liveData.getClass();
        f8yVar.getClass();
        this.source = liveData;
        this.mediator = f8yVar;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m2961c() {
        if (this.disposed) {
            return;
        }
        this.mediator.m124574q(this.source);
        this.disposed = true;
    }

    @Override // p153l.z5e
    public void dispose() {
        xh3.m210980d(C15531f.m94947a(r5e.m179862c().getImmediate()), null, null, new C04501(null), 3, null);
    }
}

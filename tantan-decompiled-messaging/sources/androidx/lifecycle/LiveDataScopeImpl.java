package androidx.lifecycle;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.core.data.Target;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p149l.f6s;
import p149l.hh3;
import p149l.j6f;
import p149l.npb;
import p149l.ppb;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\r\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", j6f.GPS_DIRECTION_TRUE, "Ll/f6s;", "Ll/npb;", Target.TYPE, "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Ll/npb;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ll/npb;", "()Ll/npb;", "setTarget$lifecycle_livedata_release", "(Ll/npb;)V", "lifecycle-livedata_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class LiveDataScopeImpl<T> implements f6s<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m87374f = "CoroutineLiveData.kt", m87375l = {EACTags.FCP_TEMPLATE}, m87376m = "invokeSuspend")
    public static final class C04642 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04642(LiveDataScopeImpl<T> liveDataScopeImpl, T t, Continuation<? super C04642> continuation) {
            super(2, continuation);
            this.this$0 = liveDataScopeImpl;
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04642(this.this$0, this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04642) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                this.this$0.m2990a();
                this.label = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m87239b(obj);
            this.this$0.m2990a();
            throw null;
        }
    }

    public LiveDataScopeImpl(@NotNull npb<T> npbVar, @NotNull CoroutineContext coroutineContext) {
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final npb<T> m2990a() {
        return null;
    }

    @Override // p149l.f6s
    @SuppressLint({"NullSafeMutableLiveData"})
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        Object objM130938g = hh3.m130938g(this.coroutineContext, new C04642(this, t, null), continuation);
        return objM130938g == uwp.m196133e() ? objM130938g : Unit.INSTANCE;
    }
}

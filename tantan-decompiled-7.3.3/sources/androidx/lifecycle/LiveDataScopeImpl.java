package androidx.lifecycle;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.core.data.Target;
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
import p153l.brb;
import p153l.drb;
import p153l.g8s;
import p153l.p7f;
import p153l.uyp;
import p153l.vh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\r\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", p7f.GPS_DIRECTION_TRUE, "Ll/g8s;", "Ll/brb;", Target.TYPE, "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Ll/brb;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ll/brb;", "()Ll/brb;", "setTarget$lifecycle_livedata_release", "(Ll/brb;)V", "lifecycle-livedata_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class LiveDataScopeImpl<T> implements g8s<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m88263f = "CoroutineLiveData.kt", m88264l = {EACTags.FCP_TEMPLATE}, m88265m = "invokeSuspend")
    public static final class C04652 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04652(LiveDataScopeImpl<T> liveDataScopeImpl, T t, Continuation<? super C04652> continuation) {
            super(2, continuation);
            this.this$0 = liveDataScopeImpl;
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04652(this.this$0, this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04652) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                this.this$0.m2991a();
                this.label = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m88128b(obj);
            this.this$0.m2991a();
            throw null;
        }
    }

    public LiveDataScopeImpl(@NotNull brb<T> brbVar, @NotNull CoroutineContext coroutineContext) {
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final brb<T> m2991a() {
        return null;
    }

    @Override // p153l.g8s
    @SuppressLint({"NullSafeMutableLiveData"})
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        Object objM201255g = vh3.m201255g(this.coroutineContext, new C04652(this, t, null), continuation);
        return objM201255g == uyp.m198688e() ? objM201255g : Unit.INSTANCE;
    }
}

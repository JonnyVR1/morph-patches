package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import p153l.ag4;
import p153l.ker;

/* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "Ll/ker;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/ker;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-runtime_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C0471xfdb59cc4 implements LifecycleEventObserver {
    final /* synthetic */ Function0<Object> $block;
    final /* synthetic */ ag4<Object> $co;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    public C0471xfdb59cc4(Lifecycle.State state, Lifecycle lifecycle, ag4<Object> ag4Var, Function0<Object> function0) {
        this.$state = state;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$co = ag4Var;
        this.$block = function0;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(ker source, Lifecycle.Event event) {
        Object objM225066constructorimpl;
        source.getClass();
        event.getClass();
        if (event != Lifecycle.Event.INSTANCE.m2974d(this.$state)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.$this_suspendWithStateAtLeastUnchecked.mo2970d(this);
                ag4<Object> ag4Var = this.$co;
                Result.Companion companion = Result.INSTANCE;
                ag4Var.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(new LifecycleDestroyedException())));
                return;
            }
            return;
        }
        this.$this_suspendWithStateAtLeastUnchecked.mo2970d(this);
        ag4<Object> ag4Var2 = this.$co;
        Function0<Object> function0 = this.$block;
        try {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        ag4Var2.resumeWith(objM225066constructorimpl);
    }
}

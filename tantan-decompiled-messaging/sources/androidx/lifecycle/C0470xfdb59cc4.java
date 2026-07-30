package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import p149l.bf4;
import p149l.jcr;

/* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "Ll/jcr;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Ll/jcr;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-runtime_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C0470xfdb59cc4 implements LifecycleEventObserver {
    final /* synthetic */ Function0<Object> $block;
    final /* synthetic */ bf4<Object> $co;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    public C0470xfdb59cc4(Lifecycle.State state, Lifecycle lifecycle, bf4<Object> bf4Var, Function0<Object> function0) {
        this.$state = state;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$co = bf4Var;
        this.$block = function0;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(jcr source, Lifecycle.Event event) {
        Object objM223820constructorimpl;
        source.getClass();
        event.getClass();
        if (event != Lifecycle.Event.INSTANCE.m2973d(this.$state)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.$this_suspendWithStateAtLeastUnchecked.mo2969d(this);
                bf4<Object> bf4Var = this.$co;
                Result.Companion companion = Result.INSTANCE;
                bf4Var.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(new LifecycleDestroyedException())));
                return;
            }
            return;
        }
        this.$this_suspendWithStateAtLeastUnchecked.mo2969d(this);
        bf4<Object> bf4Var2 = this.$co;
        Function0<Object> function0 = this.$block;
        try {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        bf4Var2.resumeWith(objM223820constructorimpl);
    }
}

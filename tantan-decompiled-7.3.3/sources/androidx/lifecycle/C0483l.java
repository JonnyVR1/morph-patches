package androidx.lifecycle;

import com.p051p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ker;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ll/ker;", Owner.TYPE, "Landroidx/lifecycle/Lifecycle$State;", "current", "next", "", "a", "(Ll/ker;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)V", "lifecycle-runtime_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C0483l {
    /* JADX INFO: renamed from: a */
    public static final void m3039a(@Nullable ker kerVar, @NotNull Lifecycle.State state, @NotNull Lifecycle.State state2) {
        state.getClass();
        state2.getClass();
        if (state == Lifecycle.State.INITIALIZED && state2 == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state2 + "' in component " + kerVar).toString());
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state != state3 || state == state2) {
            return;
        }
        throw new IllegalStateException(("State is '" + state3 + "' and cannot be moved to `" + state2 + "` in component " + kerVar).toString());
    }
}

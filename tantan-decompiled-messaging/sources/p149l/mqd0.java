package p149l;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.savedstate.C0677a;
import androidx.savedstate.Recreator;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m87232d2 = {"Ll/mqd0;", "", "Ll/oqd0;", "impl", "<init>", "(Ll/oqd0;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "", "c", "(Landroid/os/Bundle;)V", "outBundle", Constants.INAPP_DATA_TAG, "a", "Ll/oqd0;", "Landroidx/savedstate/a;", "b", "Landroidx/savedstate/a;", "()Landroidx/savedstate/a;", "savedStateRegistry", "Companion", "savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class mqd0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final oqd0 impl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0677a savedStateRegistry;

    public mqd0(oqd0 oqd0Var) {
        this.impl = oqd0Var;
        this.savedStateRegistry = new C0677a(oqd0Var);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final mqd0 m155882a(@NotNull pqd0 pqd0Var) {
        return INSTANCE.m155887b(pqd0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0677a getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m155884c(@Nullable Bundle savedState) {
        this.impl.m165416g(savedState);
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public final void m155885d(@NotNull Bundle outBundle) {
        outBundle.getClass();
        this.impl.m165417h(outBundle);
    }

    /* JADX INFO: renamed from: l.mqd0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/mqd0$a;", "", "<init>", "()V", "Ll/pqd0;", Owner.TYPE, "Ll/mqd0;", "b", "(Ll/pqd0;)Ll/mqd0;", "savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m155886a(pqd0 pqd0Var) {
            pqd0Var.getLifecycle().mo2966a(new Recreator(pqd0Var));
            return Unit.INSTANCE;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final mqd0 m155887b(@NotNull final pqd0 owner) {
            owner.getClass();
            return new mqd0(new oqd0(owner, new Function0() { // from class: l.lqd0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return mqd0.Companion.m155886a(owner);
                }
            }), null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ mqd0(oqd0 oqd0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(oqd0Var);
    }
}

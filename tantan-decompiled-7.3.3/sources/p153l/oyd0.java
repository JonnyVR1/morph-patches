package p153l;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.savedstate.C0679a;
import androidx.savedstate.Recreator;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"Ll/oyd0;", "", "Ll/qyd0;", "impl", "<init>", "(Ll/qyd0;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "", "c", "(Landroid/os/Bundle;)V", "outBundle", Constants.INAPP_DATA_TAG, "a", "Ll/qyd0;", "Landroidx/savedstate/a;", "b", "Landroidx/savedstate/a;", "()Landroidx/savedstate/a;", "savedStateRegistry", "Companion", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class oyd0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final qyd0 impl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0679a savedStateRegistry;

    public oyd0(qyd0 qyd0Var) {
        this.impl = qyd0Var;
        this.savedStateRegistry = new C0679a(qyd0Var);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final oyd0 m169844a(@NotNull ryd0 ryd0Var) {
        return INSTANCE.m169849b(ryd0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0679a getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m169846c(@Nullable Bundle savedState) {
        this.impl.m178637g(savedState);
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public final void m169847d(@NotNull Bundle outBundle) {
        outBundle.getClass();
        this.impl.m178638h(outBundle);
    }

    /* JADX INFO: renamed from: l.oyd0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/oyd0$a;", "", "<init>", "()V", "Ll/ryd0;", Owner.TYPE, "Ll/oyd0;", "b", "(Ll/ryd0;)Ll/oyd0;", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Unit m169848a(ryd0 ryd0Var) {
            ryd0Var.getLifecycle().mo2967a(new Recreator(ryd0Var));
            return Unit.INSTANCE;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final oyd0 m169849b(@NotNull final ryd0 owner) {
            owner.getClass();
            return new oyd0(new qyd0(owner, new Function0() { // from class: l.nyd0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return oyd0.Companion.m169848a(owner);
                }
            }), null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ oyd0(qyd0 qyd0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(qyd0Var);
    }
}

package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.qyd0;
import p153l.ryd0;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.savedstate.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0011\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Landroidx/savedstate/a;", "", "Ll/qyd0;", "impl", "<init>", "(Ll/qyd0;)V", "", Constants.KEY_KEY, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/a$b;", "provider", "", "c", "(Ljava/lang/String;Landroidx/savedstate/a$b;)V", "b", "(Ljava/lang/String;)Landroidx/savedstate/a$b;", "Ljava/lang/Class;", "Landroidx/savedstate/a$a;", "clazz", Constants.INAPP_DATA_TAG, "(Ljava/lang/Class;)V", "Ll/qyd0;", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C0679a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final qyd0 impl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Recreator.C0678b recreatorProvider;

    /* JADX INFO: renamed from: androidx.savedstate.a$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m88121d2 = {"Landroidx/savedstate/a$a;", "", "Ll/ryd0;", Owner.TYPE, "", "a", "(Ll/ryd0;)V", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2966a(@NotNull ryd0 owner);
    }

    /* JADX INFO: renamed from: androidx.savedstate.a$b */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m88121d2 = {"Landroidx/savedstate/a$b;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        Bundle mo2469a();
    }

    public C0679a(@NotNull qyd0 qyd0Var) {
        qyd0Var.getClass();
        this.impl = qyd0Var;
    }

    @MainThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Bundle m4023a(@NotNull String key) {
        key.getClass();
        return this.impl.m178633c(key);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final b m4024b(@NotNull String key) {
        key.getClass();
        return this.impl.m178634d(key);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m4025c(@NotNull String key, @NotNull b provider) {
        key.getClass();
        provider.getClass();
        this.impl.m178639i(key, provider);
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public final void m4026d(@NotNull Class<? extends a> clazz) {
        clazz.getClass();
        if (!this.impl.getIsAllowingSavingState()) {
            wtq0.m207906a("Can not perform this action after onSaveInstanceState");
            return;
        }
        Recreator.C0678b c0678b = this.recreatorProvider;
        if (c0678b == null) {
            c0678b = new Recreator.C0678b(this);
        }
        this.recreatorProvider = c0678b;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.C0678b c0678b2 = this.recreatorProvider;
            if (c0678b2 != null) {
                c0678b2.m4022b(clazz.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}

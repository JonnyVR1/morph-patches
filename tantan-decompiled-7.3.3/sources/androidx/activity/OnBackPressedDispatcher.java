package androidx.activity;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayDeque;
import java.util.Iterator;
import p153l.jl50;
import p153l.ker;
import p153l.zf4;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Runnable f73a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<jl50> f74b;

    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, zf4 {

        @Nullable
        private zf4 mCurrentCancellable;
        private final Lifecycle mLifecycle;
        private final jl50 mOnBackPressedCallback;

        public LifecycleOnBackPressedCancellable(@NonNull Lifecycle lifecycle, jl50 jl50Var) {
            this.mLifecycle = lifecycle;
            this.mOnBackPressedCallback = jl50Var;
            lifecycle.mo2967a(this);
        }

        @Override // p153l.zf4
        public void cancel() {
            this.mLifecycle.mo2970d(this);
            this.mOnBackPressedCallback.removeCancellable(this);
            zf4 zf4Var = this.mCurrentCancellable;
            if (zf4Var != null) {
                zf4Var.cancel();
                this.mCurrentCancellable = null;
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.mCurrentCancellable = OnBackPressedDispatcher.this.m198c(this.mOnBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                zf4 zf4Var = this.mCurrentCancellable;
                if (zf4Var != null) {
                    zf4Var.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0047a implements zf4 {

        /* JADX INFO: renamed from: a */
        public final jl50 f75a;

        public C0047a(jl50 jl50Var) {
            this.f75a = jl50Var;
        }

        @Override // p153l.zf4
        public void cancel() {
            OnBackPressedDispatcher.this.f74b.remove(this.f75a);
            this.f75a.removeCancellable(this);
        }
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.f74b = new ArrayDeque<>();
        this.f73a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    @MainThread
    /* JADX INFO: renamed from: a */
    public void m196a(@NonNull ker kerVar, @NonNull jl50 jl50Var) {
        Lifecycle lifecycle = kerVar.getLifecycle();
        if (lifecycle.mo2968b() == Lifecycle.State.DESTROYED) {
            return;
        }
        jl50Var.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, jl50Var));
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public void m197b(@NonNull jl50 jl50Var) {
        m198c(jl50Var);
    }

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: c */
    public zf4 m198c(@NonNull jl50 jl50Var) {
        this.f74b.add(jl50Var);
        C0047a c0047a = new C0047a(jl50Var);
        jl50Var.addCancellable(c0047a);
        return c0047a;
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m199d() {
        Iterator<jl50> itDescendingIterator = this.f74b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            jl50 next = itDescendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.f73a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }
}

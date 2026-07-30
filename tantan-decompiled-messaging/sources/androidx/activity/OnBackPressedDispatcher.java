package androidx.activity;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayDeque;
import java.util.Iterator;
import p149l.af4;
import p149l.cd50;
import p149l.jcr;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Runnable f73a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<cd50> f74b;

    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, af4 {

        @Nullable
        private af4 mCurrentCancellable;
        private final Lifecycle mLifecycle;
        private final cd50 mOnBackPressedCallback;

        public LifecycleOnBackPressedCancellable(@NonNull Lifecycle lifecycle, cd50 cd50Var) {
            this.mLifecycle = lifecycle;
            this.mOnBackPressedCallback = cd50Var;
            lifecycle.mo2966a(this);
        }

        @Override // p149l.af4
        public void cancel() {
            this.mLifecycle.mo2969d(this);
            this.mOnBackPressedCallback.removeCancellable(this);
            af4 af4Var = this.mCurrentCancellable;
            if (af4Var != null) {
                af4Var.cancel();
                this.mCurrentCancellable = null;
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.mCurrentCancellable = OnBackPressedDispatcher.this.m197c(this.mOnBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                af4 af4Var = this.mCurrentCancellable;
                if (af4Var != null) {
                    af4Var.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0046a implements af4 {

        /* JADX INFO: renamed from: a */
        public final cd50 f75a;

        public C0046a(cd50 cd50Var) {
            this.f75a = cd50Var;
        }

        @Override // p149l.af4
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
    public void m195a(@NonNull jcr jcrVar, @NonNull cd50 cd50Var) {
        Lifecycle lifecycle = jcrVar.getLifecycle();
        if (lifecycle.mo2967b() == Lifecycle.State.DESTROYED) {
            return;
        }
        cd50Var.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, cd50Var));
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public void m196b(@NonNull cd50 cd50Var) {
        m197c(cd50Var);
    }

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: c */
    public af4 m197c(@NonNull cd50 cd50Var) {
        this.f74b.add(cd50Var);
        C0046a c0046a = new C0046a(cd50Var);
        cd50Var.addCancellable(c0046a);
        return c0046a;
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m198d() {
        Iterator<cd50> itDescendingIterator = this.f74b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            cd50 next = itDescendingIterator.next();
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

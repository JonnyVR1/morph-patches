package p153l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class otf0 {

    /* JADX INFO: renamed from: a */
    public final C19209c f148953a;

    /* JADX INFO: renamed from: l.otf0$a */
    @RequiresApi(20)
    public static class C19207a extends C19209c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final View f148954a;

        public C19207a(@Nullable View view) {
            this.f148954a = view;
        }

        @Override // p153l.otf0.C19209c
        /* JADX INFO: renamed from: a */
        public void mo169093a() {
            View view = this.f148954a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f148954a.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.otf0$c */
    public static class C19209c {
        /* JADX INFO: renamed from: a */
        public void mo169093a() {
            throw null;
        }
    }

    public otf0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f148953a = new C19208b(view);
        } else {
            this.f148953a = new C19207a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m169092a() {
        this.f148953a.mo169093a();
    }

    /* JADX INFO: renamed from: l.otf0$b */
    @RequiresApi(30)
    public static class C19208b extends C19207a {

        /* JADX INFO: renamed from: b */
        @Nullable
        public View f148955b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public WindowInsetsController f148956c;

        public C19208b(@Nullable WindowInsetsController windowInsetsController) {
            super(null);
            this.f148956c = windowInsetsController;
        }

        @Override // p153l.otf0.C19207a, p153l.otf0.C19209c
        /* JADX INFO: renamed from: a */
        public void mo169093a() {
            View view;
            WindowInsetsController windowInsetsController = this.f148956c;
            if (windowInsetsController == null) {
                View view2 = this.f148955b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo169093a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: l.utf0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f148955b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f148955b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        public C19208b(@NonNull View view) {
            super(view);
            this.f148955b = view;
        }
    }

    @RequiresApi(30)
    @Deprecated
    public otf0(@NonNull WindowInsetsController windowInsetsController) {
        this.f148953a = new C19208b(windowInsetsController);
    }
}

package p149l;

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
public final class flf0 {

    /* JADX INFO: renamed from: a */
    public final C16874c f98156a;

    /* JADX INFO: renamed from: l.flf0$a */
    @RequiresApi(20)
    public static class C16872a extends C16874c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final View f98157a;

        public C16872a(@Nullable View view) {
            this.f98157a = view;
        }

        @Override // p149l.flf0.C16874c
        /* JADX INFO: renamed from: a */
        public void mo121974a() {
            View view = this.f98157a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f98157a.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.flf0$c */
    public static class C16874c {
        /* JADX INFO: renamed from: a */
        public void mo121974a() {
            throw null;
        }
    }

    public flf0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f98156a = new C16873b(view);
        } else {
            this.f98156a = new C16872a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m121973a() {
        this.f98156a.mo121974a();
    }

    /* JADX INFO: renamed from: l.flf0$b */
    @RequiresApi(30)
    public static class C16873b extends C16872a {

        /* JADX INFO: renamed from: b */
        @Nullable
        public View f98158b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public WindowInsetsController f98159c;

        public C16873b(@Nullable WindowInsetsController windowInsetsController) {
            super(null);
            this.f98159c = windowInsetsController;
        }

        @Override // p149l.flf0.C16872a, p149l.flf0.C16874c
        /* JADX INFO: renamed from: a */
        public void mo121974a() {
            View view;
            WindowInsetsController windowInsetsController = this.f98159c;
            if (windowInsetsController == null) {
                View view2 = this.f98158b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo121974a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: l.llf0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f98158b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f98158b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        public C16873b(@NonNull View view) {
            super(view);
            this.f98158b = view;
        }
    }

    @RequiresApi(30)
    @Deprecated
    public flf0(@NonNull WindowInsetsController windowInsetsController) {
        this.f98156a = new C16873b(windowInsetsController);
    }
}

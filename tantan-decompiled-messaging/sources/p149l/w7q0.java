package p149l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes.dex */
public final class w7q0 {

    /* JADX INFO: renamed from: a */
    public final C20827e f185084a;

    /* JADX INFO: renamed from: l.w7q0$a */
    @RequiresApi(20)
    public static class C20823a extends C20827e {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final Window f185085a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final flf0 f185086b;

        public C20823a(@NonNull Window window, @NonNull flf0 flf0Var) {
            this.f185085a = window;
            this.f185086b = flf0Var;
        }

        @Override // p149l.w7q0.C20827e
        /* JADX INFO: renamed from: a */
        public void mo202062a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m202063c(i2);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m202063c(int i) {
            if (i == 1) {
                m202064d(4);
            } else if (i == 2) {
                m202064d(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f185086b.m121973a();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m202064d(int i) {
            View decorView = this.f185085a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: e */
        public void m202065e(int i) {
            this.f185085a.addFlags(i);
        }

        /* JADX INFO: renamed from: f */
        public void m202066f(int i) {
            View decorView = this.f185085a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: g */
        public void m202067g(int i) {
            this.f185085a.clearFlags(i);
        }
    }

    /* JADX INFO: renamed from: l.w7q0$b */
    @RequiresApi(23)
    public static class C20824b extends C20823a {
        public C20824b(@NonNull Window window, @NonNull flf0 flf0Var) {
            super(window, flf0Var);
        }

        @Override // p149l.w7q0.C20827e
        /* JADX INFO: renamed from: b */
        public void mo202068b(boolean z) {
            if (!z) {
                m202066f(8192);
                return;
            }
            m202067g(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            m202065e(Integer.MIN_VALUE);
            m202064d(8192);
        }
    }

    /* JADX INFO: renamed from: l.w7q0$c */
    @RequiresApi(26)
    public static class C20825c extends C20824b {
        public C20825c(@NonNull Window window, @NonNull flf0 flf0Var) {
            super(window, flf0Var);
        }
    }

    /* JADX INFO: renamed from: l.w7q0$e */
    public static class C20827e {
        /* JADX INFO: renamed from: a */
        public void mo202062a(int i) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo202068b(boolean z) {
            throw null;
        }
    }

    public w7q0(@NonNull Window window, @NonNull View view) {
        flf0 flf0Var = new flf0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f185084a = new C20826d(window, this, flf0Var);
        } else if (i >= 26) {
            this.f185084a = new C20825c(window, flf0Var);
        } else {
            this.f185084a = new C20824b(window, flf0Var);
        }
    }

    @NonNull
    @RequiresApi(30)
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static w7q0 m202059c(@NonNull WindowInsetsController windowInsetsController) {
        return new w7q0(windowInsetsController);
    }

    /* JADX INFO: renamed from: a */
    public void m202060a(int i) {
        this.f185084a.mo202062a(i);
    }

    /* JADX INFO: renamed from: b */
    public void m202061b(boolean z) {
        this.f185084a.mo202068b(z);
    }

    /* JADX INFO: renamed from: l.w7q0$d */
    @RequiresApi(30)
    public static class C20826d extends C20827e {

        /* JADX INFO: renamed from: a */
        public final w7q0 f185087a;

        /* JADX INFO: renamed from: b */
        public final WindowInsetsController f185088b;

        /* JADX INFO: renamed from: c */
        public final flf0 f185089c;

        /* JADX INFO: renamed from: d */
        public final hgf0<Object, WindowInsetsController.OnControllableInsetsChangedListener> f185090d;

        /* JADX INFO: renamed from: e */
        public Window f185091e;

        public C20826d(@NonNull WindowInsetsController windowInsetsController, @NonNull w7q0 w7q0Var, @NonNull flf0 flf0Var) {
            this.f185090d = new hgf0<>();
            this.f185088b = windowInsetsController;
            this.f185087a = w7q0Var;
            this.f185089c = flf0Var;
        }

        @Override // p149l.w7q0.C20827e
        /* JADX INFO: renamed from: a */
        public void mo202062a(int i) {
            if ((i & 8) != 0) {
                this.f185089c.m121973a();
            }
            this.f185088b.hide(i & (-9));
        }

        @Override // p149l.w7q0.C20827e
        /* JADX INFO: renamed from: b */
        public void mo202068b(boolean z) {
            Window window = this.f185091e;
            if (z) {
                if (window != null) {
                    m202069c(8192);
                }
                this.f185088b.setSystemBarsAppearance(8, 8);
            } else {
                if (window != null) {
                    m202070d(8192);
                }
                this.f185088b.setSystemBarsAppearance(0, 8);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m202069c(int i) {
            View decorView = this.f185091e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: d */
        public void m202070d(int i) {
            View decorView = this.f185091e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public C20826d(@NonNull Window window, @NonNull w7q0 w7q0Var, @NonNull flf0 flf0Var) {
            this(window.getInsetsController(), w7q0Var, flf0Var);
            this.f185091e = window;
        }
    }

    @RequiresApi(30)
    @Deprecated
    public w7q0(@NonNull WindowInsetsController windowInsetsController) {
        this.f185084a = new C20826d(windowInsetsController, this, new flf0(windowInsetsController));
    }
}

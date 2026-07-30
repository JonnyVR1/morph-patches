package p153l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes.dex */
public final class bhq0 {

    /* JADX INFO: renamed from: a */
    public final C16015e f76803a;

    /* JADX INFO: renamed from: l.bhq0$a */
    @RequiresApi(20)
    public static class C16011a extends C16015e {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final Window f76804a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final otf0 f76805b;

        public C16011a(@NonNull Window window, @NonNull otf0 otf0Var) {
            this.f76804a = window;
            this.f76805b = otf0Var;
        }

        @Override // p153l.bhq0.C16015e
        /* JADX INFO: renamed from: a */
        public void mo104357a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m104358c(i2);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m104358c(int i) {
            if (i == 1) {
                m104359d(4);
            } else if (i == 2) {
                m104359d(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f76805b.m169092a();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m104359d(int i) {
            View decorView = this.f76804a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: e */
        public void m104360e(int i) {
            this.f76804a.addFlags(i);
        }

        /* JADX INFO: renamed from: f */
        public void m104361f(int i) {
            View decorView = this.f76804a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: g */
        public void m104362g(int i) {
            this.f76804a.clearFlags(i);
        }
    }

    /* JADX INFO: renamed from: l.bhq0$b */
    @RequiresApi(23)
    public static class C16012b extends C16011a {
        public C16012b(@NonNull Window window, @NonNull otf0 otf0Var) {
            super(window, otf0Var);
        }

        @Override // p153l.bhq0.C16015e
        /* JADX INFO: renamed from: b */
        public void mo104363b(boolean z) {
            if (!z) {
                m104361f(8192);
                return;
            }
            m104362g(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            m104360e(Integer.MIN_VALUE);
            m104359d(8192);
        }
    }

    /* JADX INFO: renamed from: l.bhq0$c */
    @RequiresApi(26)
    public static class C16013c extends C16012b {
        public C16013c(@NonNull Window window, @NonNull otf0 otf0Var) {
            super(window, otf0Var);
        }
    }

    /* JADX INFO: renamed from: l.bhq0$e */
    public static class C16015e {
        /* JADX INFO: renamed from: a */
        public void mo104357a(int i) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo104363b(boolean z) {
            throw null;
        }
    }

    public bhq0(@NonNull Window window, @NonNull View view) {
        otf0 otf0Var = new otf0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f76803a = new C16014d(window, this, otf0Var);
        } else if (i >= 26) {
            this.f76803a = new C16013c(window, otf0Var);
        } else {
            this.f76803a = new C16012b(window, otf0Var);
        }
    }

    @NonNull
    @RequiresApi(30)
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static bhq0 m104354c(@NonNull WindowInsetsController windowInsetsController) {
        return new bhq0(windowInsetsController);
    }

    /* JADX INFO: renamed from: a */
    public void m104355a(int i) {
        this.f76803a.mo104357a(i);
    }

    /* JADX INFO: renamed from: b */
    public void m104356b(boolean z) {
        this.f76803a.mo104363b(z);
    }

    /* JADX INFO: renamed from: l.bhq0$d */
    @RequiresApi(30)
    public static class C16014d extends C16015e {

        /* JADX INFO: renamed from: a */
        public final bhq0 f76806a;

        /* JADX INFO: renamed from: b */
        public final WindowInsetsController f76807b;

        /* JADX INFO: renamed from: c */
        public final otf0 f76808c;

        /* JADX INFO: renamed from: d */
        public final oof0<Object, WindowInsetsController.OnControllableInsetsChangedListener> f76809d;

        /* JADX INFO: renamed from: e */
        public Window f76810e;

        public C16014d(@NonNull WindowInsetsController windowInsetsController, @NonNull bhq0 bhq0Var, @NonNull otf0 otf0Var) {
            this.f76809d = new oof0<>();
            this.f76807b = windowInsetsController;
            this.f76806a = bhq0Var;
            this.f76808c = otf0Var;
        }

        @Override // p153l.bhq0.C16015e
        /* JADX INFO: renamed from: a */
        public void mo104357a(int i) {
            if ((i & 8) != 0) {
                this.f76808c.m169092a();
            }
            this.f76807b.hide(i & (-9));
        }

        @Override // p153l.bhq0.C16015e
        /* JADX INFO: renamed from: b */
        public void mo104363b(boolean z) {
            Window window = this.f76810e;
            if (z) {
                if (window != null) {
                    m104364c(8192);
                }
                this.f76807b.setSystemBarsAppearance(8, 8);
            } else {
                if (window != null) {
                    m104365d(8192);
                }
                this.f76807b.setSystemBarsAppearance(0, 8);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m104364c(int i) {
            View decorView = this.f76810e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: d */
        public void m104365d(int i) {
            View decorView = this.f76810e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public C16014d(@NonNull Window window, @NonNull bhq0 bhq0Var, @NonNull otf0 otf0Var) {
            this(window.getInsetsController(), bhq0Var, otf0Var);
            this.f76810e = window;
        }
    }

    @RequiresApi(30)
    @Deprecated
    public bhq0(@NonNull WindowInsetsController windowInsetsController) {
        this.f76803a = new C16014d(windowInsetsController, this, new otf0(windowInsetsController));
    }
}

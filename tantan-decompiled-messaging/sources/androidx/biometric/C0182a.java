package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.biometric.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C0182a {

    /* JADX INFO: renamed from: k */
    @Nullable
    public static C0182a f918k;

    /* JADX INFO: renamed from: a */
    public int f919a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BiometricFragment f920b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public FingerprintDialogFragment f921c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public FingerprintHelperFragment f922d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Executor f923e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public DialogInterface.OnClickListener f924f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BiometricPrompt.AbstractC0172b f925g;

    /* JADX INFO: renamed from: h */
    public boolean f926h;

    /* JADX INFO: renamed from: i */
    public int f927i = 0;

    /* JADX INFO: renamed from: j */
    public int f928j = 0;

    @NonNull
    /* JADX INFO: renamed from: e */
    public static C0182a m784e() {
        if (f918k == null) {
            f918k = new C0182a();
        }
        return f918k;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static C0182a m785f() {
        return f918k;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public BiometricPrompt.AbstractC0172b m786a() {
        return this.f925g;
    }

    /* JADX INFO: renamed from: b */
    public int m787b() {
        return this.f919a;
    }

    /* JADX INFO: renamed from: c */
    public int m788c() {
        return this.f927i;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Executor m789d() {
        return this.f923e;
    }

    /* JADX INFO: renamed from: g */
    public void m790g() {
        if (this.f928j == 0) {
            this.f928j = 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m791h() {
        return this.f926h;
    }

    /* JADX INFO: renamed from: i */
    public void m792i() {
        int i = this.f928j;
        if (i == 2) {
            return;
        }
        if (i == 1) {
            m800q();
            return;
        }
        this.f919a = 0;
        this.f920b = null;
        this.f921c = null;
        this.f922d = null;
        this.f923e = null;
        this.f924f = null;
        this.f925g = null;
        this.f927i = 0;
        this.f926h = false;
        f918k = null;
    }

    /* JADX INFO: renamed from: j */
    public void m793j(@Nullable BiometricFragment biometricFragment) {
        this.f920b = biometricFragment;
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: k */
    public void m794k(@NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener, @NonNull BiometricPrompt.AbstractC0172b abstractC0172b) {
        this.f923e = executor;
        this.f924f = onClickListener;
        this.f925g = abstractC0172b;
        BiometricFragment biometricFragment = this.f920b;
        if (biometricFragment != null && Build.VERSION.SDK_INT >= 28) {
            biometricFragment.m692g4(executor, onClickListener, abstractC0172b);
            return;
        }
        FingerprintDialogFragment fingerprintDialogFragment = this.f921c;
        if (fingerprintDialogFragment == null || this.f922d == null) {
            return;
        }
        fingerprintDialogFragment.m755r4(onClickListener);
        this.f922d.m772h4(executor, abstractC0172b);
        this.f922d.m774j4(this.f921c.m747g4());
    }

    /* JADX INFO: renamed from: l */
    public void m795l(int i) {
        this.f919a = i;
    }

    /* JADX INFO: renamed from: m */
    public void m796m(boolean z) {
        this.f926h = z;
    }

    /* JADX INFO: renamed from: n */
    public void m797n(int i) {
        this.f927i = i;
    }

    /* JADX INFO: renamed from: o */
    public void m798o(@Nullable FingerprintDialogFragment fingerprintDialogFragment, @Nullable FingerprintHelperFragment fingerprintHelperFragment) {
        this.f921c = fingerprintDialogFragment;
        this.f922d = fingerprintHelperFragment;
    }

    /* JADX INFO: renamed from: p */
    public void m799p() {
        this.f928j = 2;
    }

    /* JADX INFO: renamed from: q */
    public void m800q() {
        this.f928j = 0;
    }
}

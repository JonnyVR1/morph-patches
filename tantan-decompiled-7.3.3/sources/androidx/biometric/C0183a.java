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
public class C0183a {

    /* JADX INFO: renamed from: k */
    @Nullable
    public static C0183a f918k;

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
    public BiometricPrompt.AbstractC0173b f925g;

    /* JADX INFO: renamed from: h */
    public boolean f926h;

    /* JADX INFO: renamed from: i */
    public int f927i = 0;

    /* JADX INFO: renamed from: j */
    public int f928j = 0;

    @NonNull
    /* JADX INFO: renamed from: e */
    public static C0183a m785e() {
        if (f918k == null) {
            f918k = new C0183a();
        }
        return f918k;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static C0183a m786f() {
        return f918k;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public BiometricPrompt.AbstractC0173b m787a() {
        return this.f925g;
    }

    /* JADX INFO: renamed from: b */
    public int m788b() {
        return this.f919a;
    }

    /* JADX INFO: renamed from: c */
    public int m789c() {
        return this.f927i;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Executor m790d() {
        return this.f923e;
    }

    /* JADX INFO: renamed from: g */
    public void m791g() {
        if (this.f928j == 0) {
            this.f928j = 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m792h() {
        return this.f926h;
    }

    /* JADX INFO: renamed from: i */
    public void m793i() {
        int i = this.f928j;
        if (i == 2) {
            return;
        }
        if (i == 1) {
            m801q();
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
    public void m794j(@Nullable BiometricFragment biometricFragment) {
        this.f920b = biometricFragment;
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: k */
    public void m795k(@NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener, @NonNull BiometricPrompt.AbstractC0173b abstractC0173b) {
        this.f923e = executor;
        this.f924f = onClickListener;
        this.f925g = abstractC0173b;
        BiometricFragment biometricFragment = this.f920b;
        if (biometricFragment != null && Build.VERSION.SDK_INT >= 28) {
            biometricFragment.m693g4(executor, onClickListener, abstractC0173b);
            return;
        }
        FingerprintDialogFragment fingerprintDialogFragment = this.f921c;
        if (fingerprintDialogFragment == null || this.f922d == null) {
            return;
        }
        fingerprintDialogFragment.m756r4(onClickListener);
        this.f922d.m773h4(executor, abstractC0173b);
        this.f922d.m775j4(this.f921c.m748g4());
    }

    /* JADX INFO: renamed from: l */
    public void m796l(int i) {
        this.f919a = i;
    }

    /* JADX INFO: renamed from: m */
    public void m797m(boolean z) {
        this.f926h = z;
    }

    /* JADX INFO: renamed from: n */
    public void m798n(int i) {
        this.f927i = i;
    }

    /* JADX INFO: renamed from: o */
    public void m799o(@Nullable FingerprintDialogFragment fingerprintDialogFragment, @Nullable FingerprintHelperFragment fingerprintHelperFragment) {
        this.f921c = fingerprintDialogFragment;
        this.f922d = fingerprintHelperFragment;
    }

    /* JADX INFO: renamed from: p */
    public void m800p() {
        this.f928j = 2;
    }

    /* JADX INFO: renamed from: q */
    public void m801q() {
        this.f928j = 0;
    }
}

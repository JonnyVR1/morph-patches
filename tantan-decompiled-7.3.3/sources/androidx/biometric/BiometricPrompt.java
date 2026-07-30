package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC0485n;
import androidx.lifecycle.Lifecycle;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p153l.aok0;
import p153l.jer;
import p153l.n03;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SyntheticAccessor"})
public class BiometricPrompt {

    /* JADX INFO: renamed from: a */
    public FragmentActivity f851a;

    /* JADX INFO: renamed from: b */
    public Fragment f852b;

    /* JADX INFO: renamed from: c */
    public final Executor f853c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0173b f854d;

    /* JADX INFO: renamed from: e */
    public FingerprintDialogFragment f855e;

    /* JADX INFO: renamed from: f */
    public FingerprintHelperFragment f856f;

    /* JADX INFO: renamed from: g */
    public BiometricFragment f857g;

    /* JADX INFO: renamed from: h */
    public boolean f858h;

    /* JADX INFO: renamed from: i */
    public boolean f859i;

    /* JADX INFO: renamed from: j */
    public final DialogInterface.OnClickListener f860j = new DialogInterfaceOnClickListenerC0172a();

    /* JADX INFO: renamed from: k */
    public final jer f861k;

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$a */
    public class DialogInterfaceOnClickListenerC0172a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BiometricPrompt.m713u() && BiometricPrompt.this.f857g != null) {
                    CharSequence charSequenceM690c4 = BiometricPrompt.this.f857g.m690c4();
                    BiometricPrompt.this.f854d.m724a(13, charSequenceM690c4 != null ? charSequenceM690c4 : "");
                    BiometricPrompt.this.f857g.m689b4();
                } else {
                    if (BiometricPrompt.this.f855e == null || BiometricPrompt.this.f856f == null) {
                        Log.e("BiometricPromptCompat", "Negative button callback not run. Fragment was null.");
                        return;
                    }
                    CharSequence charSequenceM749i4 = BiometricPrompt.this.f855e.m749i4();
                    BiometricPrompt.this.f854d.m724a(13, charSequenceM749i4 != null ? charSequenceM749i4 : "");
                    BiometricPrompt.this.f856f.m769b4(2);
                }
            }
        }

        public DialogInterfaceOnClickListenerC0172a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BiometricPrompt.this.f853c.execute(new a());
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$b */
    public static abstract class AbstractC0173b {
        /* JADX INFO: renamed from: a */
        public void m724a(int i, @NonNull CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: b */
        public void m725b() {
        }

        /* JADX INFO: renamed from: c */
        public void m726c(@NonNull C0174c c0174c) {
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$c */
    public static class C0174c {

        /* JADX INFO: renamed from: a */
        public final C0175d f864a;

        public C0174c(C0175d c0175d) {
            this.f864a = c0175d;
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$e */
    public static class C0176e {

        /* JADX INFO: renamed from: a */
        public Bundle f868a;

        public C0176e(Bundle bundle) {
            this.f868a = bundle;
        }

        /* JADX INFO: renamed from: a */
        public Bundle m730a() {
            return this.f868a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m731b() {
            return this.f868a.getBoolean("allow_device_credential");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: c */
        public boolean m732c() {
            return this.f868a.getBoolean("handling_device_credential_result");
        }
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull Executor executor, @NonNull AbstractC0173b abstractC0173b) {
        jer jerVar = new jer() { // from class: androidx.biometric.BiometricPrompt.2
            @InterfaceC0485n(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                if (BiometricPrompt.this.m722y()) {
                    return;
                }
                if (BiometricPrompt.m713u() && BiometricPrompt.this.f857g != null) {
                    boolean zM691d4 = BiometricPrompt.this.f857g.m691d4();
                    BiometricPrompt biometricPrompt = BiometricPrompt.this;
                    if (zM691d4) {
                        boolean z = biometricPrompt.f858h;
                        BiometricPrompt biometricPrompt2 = BiometricPrompt.this;
                        if (z) {
                            biometricPrompt2.f857g.m688a4();
                        } else {
                            biometricPrompt2.f858h = true;
                        }
                    } else {
                        biometricPrompt.f857g.m688a4();
                    }
                } else if (BiometricPrompt.this.f855e != null && BiometricPrompt.this.f856f != null) {
                    BiometricPrompt.m714v(BiometricPrompt.this.f855e, BiometricPrompt.this.f856f);
                }
                BiometricPrompt.this.m717C();
            }

            @InterfaceC0485n(Lifecycle.Event.ON_RESUME)
            public void onResume() {
                BiometricPrompt.this.f857g = BiometricPrompt.m713u() ? (BiometricFragment) BiometricPrompt.this.m721x().m2558i0("BiometricFragment") : null;
                if (!BiometricPrompt.m713u() || BiometricPrompt.this.f857g == null) {
                    BiometricPrompt biometricPrompt = BiometricPrompt.this;
                    biometricPrompt.f855e = (FingerprintDialogFragment) biometricPrompt.m721x().m2558i0("FingerprintDialogFragment");
                    BiometricPrompt biometricPrompt2 = BiometricPrompt.this;
                    biometricPrompt2.f856f = (FingerprintHelperFragment) biometricPrompt2.m721x().m2558i0("FingerprintHelperFragment");
                    if (BiometricPrompt.this.f855e != null) {
                        BiometricPrompt.this.f855e.m756r4(BiometricPrompt.this.f860j);
                    }
                    if (BiometricPrompt.this.f856f != null) {
                        BiometricPrompt.this.f856f.m773h4(BiometricPrompt.this.f853c, BiometricPrompt.this.f854d);
                        if (BiometricPrompt.this.f855e != null) {
                            BiometricPrompt.this.f856f.m775j4(BiometricPrompt.this.f855e.m748g4());
                        }
                    }
                } else {
                    BiometricPrompt.this.f857g.m693g4(BiometricPrompt.this.f853c, BiometricPrompt.this.f860j, BiometricPrompt.this.f854d);
                }
                BiometricPrompt.this.m715A();
                BiometricPrompt.this.m716B(false);
            }
        };
        this.f861k = jerVar;
        if (fragmentActivity == null) {
            wg3.m206174a("FragmentActivity must not be null");
            throw null;
        }
        if (executor == null) {
            wg3.m206174a("Executor must not be null");
            throw null;
        }
        if (abstractC0173b == null) {
            wg3.m206174a("AuthenticationCallback must not be null");
            throw null;
        }
        this.f851a = fragmentActivity;
        this.f854d = abstractC0173b;
        this.f853c = executor;
        fragmentActivity.getLifecycle().mo2967a(jerVar);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m713u() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: v */
    public static void m714v(@NonNull FingerprintDialogFragment fingerprintDialogFragment, @NonNull FingerprintHelperFragment fingerprintHelperFragment) {
        fingerprintDialogFragment.m746e4();
        fingerprintHelperFragment.m769b4(0);
    }

    /* JADX INFO: renamed from: A */
    public final void m715A() {
        C0183a c0183aM786f;
        if (this.f859i || (c0183aM786f = C0183a.m786f()) == null) {
            return;
        }
        int iM789c = c0183aM786f.m789c();
        if (iM789c == 1) {
            this.f854d.m726c(new C0174c(null));
            c0183aM786f.m801q();
            c0183aM786f.m793i();
        } else {
            if (iM789c != 2) {
                return;
            }
            this.f854d.m724a(10, m720w() != null ? m720w().getString(R$string.f917j) : "");
            c0183aM786f.m801q();
            c0183aM786f.m793i();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m716B(boolean z) {
        FingerprintHelperFragment fingerprintHelperFragment;
        BiometricFragment biometricFragment;
        if (Build.VERSION.SDK_INT >= 29) {
            return;
        }
        C0183a c0183aM785e = C0183a.m785e();
        if (!this.f859i) {
            FragmentActivity fragmentActivityM720w = m720w();
            if (fragmentActivityM720w != null) {
                try {
                    c0183aM785e.m796l(fragmentActivityM720w.getPackageManager().getActivityInfo(fragmentActivityM720w.getComponentName(), 0).getThemeResource());
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("BiometricPromptCompat", "Failed to register client theme to bridge", e);
                }
            }
        } else if (!m713u() || (biometricFragment = this.f857g) == null) {
            FingerprintDialogFragment fingerprintDialogFragment = this.f855e;
            if (fingerprintDialogFragment != null && (fingerprintHelperFragment = this.f856f) != null) {
                c0183aM785e.m799o(fingerprintDialogFragment, fingerprintHelperFragment);
            }
        } else {
            c0183aM785e.m794j(biometricFragment);
        }
        c0183aM785e.m795k(this.f853c, this.f860j, this.f854d);
        if (z) {
            c0183aM785e.m800p();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m717C() {
        C0183a c0183aM786f = C0183a.m786f();
        if (c0183aM786f != null) {
            c0183aM786f.m793i();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m718s(@NonNull C0176e c0176e) {
        if (c0176e != null) {
            m719t(c0176e, null);
        } else {
            wg3.m206174a("PromptInfo can not be null");
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m719t(@NonNull C0176e c0176e, @Nullable C0175d c0175d) {
        this.f859i = c0176e.m732c();
        FragmentActivity fragmentActivityM720w = m720w();
        if (c0176e.m731b() && Build.VERSION.SDK_INT <= 28) {
            if (!this.f859i) {
                m723z(c0176e);
                return;
            }
            if (fragmentActivityM720w == null) {
                Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Activity was null.");
                return;
            }
            C0183a c0183aM786f = C0183a.m786f();
            if (c0183aM786f == null) {
                Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Bridge was null.");
                return;
            } else if (!c0183aM786f.m792h() && n03.m160951b(fragmentActivityM720w).m160952a() != 0) {
                aok0.m99090e("BiometricPromptCompat", fragmentActivityM720w, c0176e.m730a(), null);
                return;
            }
        }
        FragmentManager fragmentManagerM721x = m721x();
        if (fragmentManagerM721x.m2508L0()) {
            return;
        }
        Bundle bundleM730a = c0176e.m730a();
        this.f858h = false;
        if ((fragmentActivityM720w == null || c0175d == null || !aok0.m99093h(fragmentActivityM720w, Build.MANUFACTURER, Build.MODEL)) && m713u()) {
            BiometricFragment biometricFragment = (BiometricFragment) fragmentManagerM721x.m2558i0("BiometricFragment");
            if (biometricFragment != null) {
                this.f857g = biometricFragment;
            } else {
                this.f857g = BiometricFragment.m685e4();
            }
            this.f857g.m693g4(this.f853c, this.f860j, this.f854d);
            this.f857g.m694h4(c0175d);
            this.f857g.m692f4(bundleM730a);
            if (biometricFragment == null) {
                fragmentManagerM721x.m2568m().m2807e(this.f857g, "BiometricFragment").mo2709j();
            } else if (this.f857g.isDetached()) {
                fragmentManagerM721x.m2568m().m2810h(this.f857g).mo2709j();
            }
        } else {
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) fragmentManagerM721x.m2558i0("FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                this.f855e = fingerprintDialogFragment;
            } else {
                this.f855e = FingerprintDialogFragment.m744p4();
            }
            this.f855e.m756r4(this.f860j);
            this.f855e.m755q4(bundleM730a);
            if (fragmentActivityM720w != null && !aok0.m99092g(fragmentActivityM720w, Build.MODEL)) {
                FingerprintDialogFragment fingerprintDialogFragment2 = this.f855e;
                if (fingerprintDialogFragment == null) {
                    fingerprintDialogFragment2.show(fragmentManagerM721x, "FingerprintDialogFragment");
                } else if (fingerprintDialogFragment2.isDetached()) {
                    fragmentManagerM721x.m2568m().m2810h(this.f855e).mo2709j();
                }
            }
            FingerprintHelperFragment fingerprintHelperFragment = (FingerprintHelperFragment) fragmentManagerM721x.m2558i0("FingerprintHelperFragment");
            if (fingerprintHelperFragment != null) {
                this.f856f = fingerprintHelperFragment;
            } else {
                this.f856f = FingerprintHelperFragment.m766f4();
            }
            this.f856f.m773h4(this.f853c, this.f854d);
            Handler handlerM748g4 = this.f855e.m748g4();
            this.f856f.m775j4(handlerM748g4);
            this.f856f.m774i4(c0175d);
            handlerM748g4.sendMessageDelayed(handlerM748g4.obtainMessage(6), 500L);
            if (fingerprintHelperFragment == null) {
                fragmentManagerM721x.m2568m().m2807e(this.f856f, "FingerprintHelperFragment").mo2709j();
            } else if (this.f856f.isDetached()) {
                fragmentManagerM721x.m2568m().m2810h(this.f856f).mo2709j();
            }
        }
        fragmentManagerM721x.m2546e0();
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final FragmentActivity m720w() {
        FragmentActivity fragmentActivity = this.f851a;
        return fragmentActivity != null ? fragmentActivity : this.f852b.getActivity();
    }

    /* JADX INFO: renamed from: x */
    public final FragmentManager m721x() {
        FragmentActivity fragmentActivity = this.f851a;
        return fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : this.f852b.getChildFragmentManager();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m722y() {
        return m720w() != null && m720w().isChangingConfigurations();
    }

    /* JADX INFO: renamed from: z */
    public final void m723z(C0176e c0176e) {
        FragmentActivity fragmentActivityM720w = m720w();
        if (fragmentActivityM720w == null || fragmentActivityM720w.isFinishing()) {
            return;
        }
        m716B(true);
        Bundle bundleM730a = c0176e.m730a();
        bundleM730a.putBoolean("handling_device_credential_result", true);
        Intent intent = new Intent(fragmentActivityM720w, (Class<?>) DeviceCredentialHandlerActivity.class);
        intent.putExtra("prompt_info_bundle", bundleM730a);
        fragmentActivityM720w.startActivity(intent);
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$d */
    public static class C0175d {

        /* JADX INFO: renamed from: a */
        public final Signature f865a;

        /* JADX INFO: renamed from: b */
        public final Cipher f866b;

        /* JADX INFO: renamed from: c */
        public final Mac f867c;

        public C0175d(@NonNull Signature signature) {
            this.f865a = signature;
            this.f866b = null;
            this.f867c = null;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public Cipher m727a() {
            return this.f866b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public Mac m728b() {
            return this.f867c;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public Signature m729c() {
            return this.f865a;
        }

        public C0175d(@NonNull Cipher cipher) {
            this.f866b = cipher;
            this.f865a = null;
            this.f867c = null;
        }

        public C0175d(@NonNull Mac mac) {
            this.f867c = mac;
            this.f866b = null;
            this.f865a = null;
        }
    }
}

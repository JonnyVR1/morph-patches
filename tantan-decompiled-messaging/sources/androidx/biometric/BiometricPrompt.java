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
import androidx.lifecycle.InterfaceC0484n;
import androidx.lifecycle.Lifecycle;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p149l.icr;
import p149l.ig3;
import p149l.uek0;
import p149l.yz2;

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
    public final AbstractC0172b f854d;

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
    public final DialogInterface.OnClickListener f860j = new DialogInterfaceOnClickListenerC0171a();

    /* JADX INFO: renamed from: k */
    public final icr f861k;

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$a */
    public class DialogInterfaceOnClickListenerC0171a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BiometricPrompt.m712u() && BiometricPrompt.this.f857g != null) {
                    CharSequence charSequenceM689c4 = BiometricPrompt.this.f857g.m689c4();
                    BiometricPrompt.this.f854d.m723a(13, charSequenceM689c4 != null ? charSequenceM689c4 : "");
                    BiometricPrompt.this.f857g.m688b4();
                } else {
                    if (BiometricPrompt.this.f855e == null || BiometricPrompt.this.f856f == null) {
                        Log.e("BiometricPromptCompat", "Negative button callback not run. Fragment was null.");
                        return;
                    }
                    CharSequence charSequenceM748i4 = BiometricPrompt.this.f855e.m748i4();
                    BiometricPrompt.this.f854d.m723a(13, charSequenceM748i4 != null ? charSequenceM748i4 : "");
                    BiometricPrompt.this.f856f.m768b4(2);
                }
            }
        }

        public DialogInterfaceOnClickListenerC0171a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BiometricPrompt.this.f853c.execute(new a());
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$b */
    public static abstract class AbstractC0172b {
        /* JADX INFO: renamed from: a */
        public void m723a(int i, @NonNull CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: b */
        public void m724b() {
        }

        /* JADX INFO: renamed from: c */
        public void m725c(@NonNull C0173c c0173c) {
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$c */
    public static class C0173c {

        /* JADX INFO: renamed from: a */
        public final C0174d f864a;

        public C0173c(C0174d c0174d) {
            this.f864a = c0174d;
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$e */
    public static class C0175e {

        /* JADX INFO: renamed from: a */
        public Bundle f868a;

        public C0175e(Bundle bundle) {
            this.f868a = bundle;
        }

        /* JADX INFO: renamed from: a */
        public Bundle m729a() {
            return this.f868a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m730b() {
            return this.f868a.getBoolean("allow_device_credential");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: c */
        public boolean m731c() {
            return this.f868a.getBoolean("handling_device_credential_result");
        }
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull Executor executor, @NonNull AbstractC0172b abstractC0172b) {
        icr icrVar = new icr() { // from class: androidx.biometric.BiometricPrompt.2
            @InterfaceC0484n(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                if (BiometricPrompt.this.m721y()) {
                    return;
                }
                if (BiometricPrompt.m712u() && BiometricPrompt.this.f857g != null) {
                    boolean zM690d4 = BiometricPrompt.this.f857g.m690d4();
                    BiometricPrompt biometricPrompt = BiometricPrompt.this;
                    if (zM690d4) {
                        boolean z = biometricPrompt.f858h;
                        BiometricPrompt biometricPrompt2 = BiometricPrompt.this;
                        if (z) {
                            biometricPrompt2.f857g.m687a4();
                        } else {
                            biometricPrompt2.f858h = true;
                        }
                    } else {
                        biometricPrompt.f857g.m687a4();
                    }
                } else if (BiometricPrompt.this.f855e != null && BiometricPrompt.this.f856f != null) {
                    BiometricPrompt.m713v(BiometricPrompt.this.f855e, BiometricPrompt.this.f856f);
                }
                BiometricPrompt.this.m716C();
            }

            @InterfaceC0484n(Lifecycle.Event.ON_RESUME)
            public void onResume() {
                BiometricPrompt.this.f857g = BiometricPrompt.m712u() ? (BiometricFragment) BiometricPrompt.this.m720x().m2557i0("BiometricFragment") : null;
                if (!BiometricPrompt.m712u() || BiometricPrompt.this.f857g == null) {
                    BiometricPrompt biometricPrompt = BiometricPrompt.this;
                    biometricPrompt.f855e = (FingerprintDialogFragment) biometricPrompt.m720x().m2557i0("FingerprintDialogFragment");
                    BiometricPrompt biometricPrompt2 = BiometricPrompt.this;
                    biometricPrompt2.f856f = (FingerprintHelperFragment) biometricPrompt2.m720x().m2557i0("FingerprintHelperFragment");
                    if (BiometricPrompt.this.f855e != null) {
                        BiometricPrompt.this.f855e.m755r4(BiometricPrompt.this.f860j);
                    }
                    if (BiometricPrompt.this.f856f != null) {
                        BiometricPrompt.this.f856f.m772h4(BiometricPrompt.this.f853c, BiometricPrompt.this.f854d);
                        if (BiometricPrompt.this.f855e != null) {
                            BiometricPrompt.this.f856f.m774j4(BiometricPrompt.this.f855e.m747g4());
                        }
                    }
                } else {
                    BiometricPrompt.this.f857g.m692g4(BiometricPrompt.this.f853c, BiometricPrompt.this.f860j, BiometricPrompt.this.f854d);
                }
                BiometricPrompt.this.m714A();
                BiometricPrompt.this.m715B(false);
            }
        };
        this.f861k = icrVar;
        if (fragmentActivity == null) {
            ig3.m135964a("FragmentActivity must not be null");
            throw null;
        }
        if (executor == null) {
            ig3.m135964a("Executor must not be null");
            throw null;
        }
        if (abstractC0172b == null) {
            ig3.m135964a("AuthenticationCallback must not be null");
            throw null;
        }
        this.f851a = fragmentActivity;
        this.f854d = abstractC0172b;
        this.f853c = executor;
        fragmentActivity.getLifecycle().mo2966a(icrVar);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m712u() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: v */
    public static void m713v(@NonNull FingerprintDialogFragment fingerprintDialogFragment, @NonNull FingerprintHelperFragment fingerprintHelperFragment) {
        fingerprintDialogFragment.m745e4();
        fingerprintHelperFragment.m768b4(0);
    }

    /* JADX INFO: renamed from: A */
    public final void m714A() {
        C0182a c0182aM785f;
        if (this.f859i || (c0182aM785f = C0182a.m785f()) == null) {
            return;
        }
        int iM788c = c0182aM785f.m788c();
        if (iM788c == 1) {
            this.f854d.m725c(new C0173c(null));
            c0182aM785f.m800q();
            c0182aM785f.m792i();
        } else {
            if (iM788c != 2) {
                return;
            }
            this.f854d.m723a(10, m719w() != null ? m719w().getString(R$string.f917j) : "");
            c0182aM785f.m800q();
            c0182aM785f.m792i();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m715B(boolean z) {
        FingerprintHelperFragment fingerprintHelperFragment;
        BiometricFragment biometricFragment;
        if (Build.VERSION.SDK_INT >= 29) {
            return;
        }
        C0182a c0182aM784e = C0182a.m784e();
        if (!this.f859i) {
            FragmentActivity fragmentActivityM719w = m719w();
            if (fragmentActivityM719w != null) {
                try {
                    c0182aM784e.m795l(fragmentActivityM719w.getPackageManager().getActivityInfo(fragmentActivityM719w.getComponentName(), 0).getThemeResource());
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("BiometricPromptCompat", "Failed to register client theme to bridge", e);
                }
            }
        } else if (!m712u() || (biometricFragment = this.f857g) == null) {
            FingerprintDialogFragment fingerprintDialogFragment = this.f855e;
            if (fingerprintDialogFragment != null && (fingerprintHelperFragment = this.f856f) != null) {
                c0182aM784e.m798o(fingerprintDialogFragment, fingerprintHelperFragment);
            }
        } else {
            c0182aM784e.m793j(biometricFragment);
        }
        c0182aM784e.m794k(this.f853c, this.f860j, this.f854d);
        if (z) {
            c0182aM784e.m799p();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m716C() {
        C0182a c0182aM785f = C0182a.m785f();
        if (c0182aM785f != null) {
            c0182aM785f.m792i();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m717s(@NonNull C0175e c0175e) {
        if (c0175e != null) {
            m718t(c0175e, null);
        } else {
            ig3.m135964a("PromptInfo can not be null");
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m718t(@NonNull C0175e c0175e, @Nullable C0174d c0174d) {
        this.f859i = c0175e.m731c();
        FragmentActivity fragmentActivityM719w = m719w();
        if (c0175e.m730b() && Build.VERSION.SDK_INT <= 28) {
            if (!this.f859i) {
                m722z(c0175e);
                return;
            }
            if (fragmentActivityM719w == null) {
                Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Activity was null.");
                return;
            }
            C0182a c0182aM785f = C0182a.m785f();
            if (c0182aM785f == null) {
                Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Bridge was null.");
                return;
            } else if (!c0182aM785f.m791h() && yz2.m216588b(fragmentActivityM719w).m216589a() != 0) {
                uek0.m193261e("BiometricPromptCompat", fragmentActivityM719w, c0175e.m729a(), null);
                return;
            }
        }
        FragmentManager fragmentManagerM720x = m720x();
        if (fragmentManagerM720x.m2507L0()) {
            return;
        }
        Bundle bundleM729a = c0175e.m729a();
        this.f858h = false;
        if ((fragmentActivityM719w == null || c0174d == null || !uek0.m193264h(fragmentActivityM719w, Build.MANUFACTURER, Build.MODEL)) && m712u()) {
            BiometricFragment biometricFragment = (BiometricFragment) fragmentManagerM720x.m2557i0("BiometricFragment");
            if (biometricFragment != null) {
                this.f857g = biometricFragment;
            } else {
                this.f857g = BiometricFragment.m684e4();
            }
            this.f857g.m692g4(this.f853c, this.f860j, this.f854d);
            this.f857g.m693h4(c0174d);
            this.f857g.m691f4(bundleM729a);
            if (biometricFragment == null) {
                fragmentManagerM720x.m2567m().m2806e(this.f857g, "BiometricFragment").mo2708j();
            } else if (this.f857g.isDetached()) {
                fragmentManagerM720x.m2567m().m2809h(this.f857g).mo2708j();
            }
        } else {
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) fragmentManagerM720x.m2557i0("FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                this.f855e = fingerprintDialogFragment;
            } else {
                this.f855e = FingerprintDialogFragment.m743p4();
            }
            this.f855e.m755r4(this.f860j);
            this.f855e.m754q4(bundleM729a);
            if (fragmentActivityM719w != null && !uek0.m193263g(fragmentActivityM719w, Build.MODEL)) {
                FingerprintDialogFragment fingerprintDialogFragment2 = this.f855e;
                if (fingerprintDialogFragment == null) {
                    fingerprintDialogFragment2.show(fragmentManagerM720x, "FingerprintDialogFragment");
                } else if (fingerprintDialogFragment2.isDetached()) {
                    fragmentManagerM720x.m2567m().m2809h(this.f855e).mo2708j();
                }
            }
            FingerprintHelperFragment fingerprintHelperFragment = (FingerprintHelperFragment) fragmentManagerM720x.m2557i0("FingerprintHelperFragment");
            if (fingerprintHelperFragment != null) {
                this.f856f = fingerprintHelperFragment;
            } else {
                this.f856f = FingerprintHelperFragment.m765f4();
            }
            this.f856f.m772h4(this.f853c, this.f854d);
            Handler handlerM747g4 = this.f855e.m747g4();
            this.f856f.m774j4(handlerM747g4);
            this.f856f.m773i4(c0174d);
            handlerM747g4.sendMessageDelayed(handlerM747g4.obtainMessage(6), 500L);
            if (fingerprintHelperFragment == null) {
                fragmentManagerM720x.m2567m().m2806e(this.f856f, "FingerprintHelperFragment").mo2708j();
            } else if (this.f856f.isDetached()) {
                fragmentManagerM720x.m2567m().m2809h(this.f856f).mo2708j();
            }
        }
        fragmentManagerM720x.m2545e0();
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final FragmentActivity m719w() {
        FragmentActivity fragmentActivity = this.f851a;
        return fragmentActivity != null ? fragmentActivity : this.f852b.getActivity();
    }

    /* JADX INFO: renamed from: x */
    public final FragmentManager m720x() {
        FragmentActivity fragmentActivity = this.f851a;
        return fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : this.f852b.getChildFragmentManager();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m721y() {
        return m719w() != null && m719w().isChangingConfigurations();
    }

    /* JADX INFO: renamed from: z */
    public final void m722z(C0175e c0175e) {
        FragmentActivity fragmentActivityM719w = m719w();
        if (fragmentActivityM719w == null || fragmentActivityM719w.isFinishing()) {
            return;
        }
        m715B(true);
        Bundle bundleM729a = c0175e.m729a();
        bundleM729a.putBoolean("handling_device_credential_result", true);
        Intent intent = new Intent(fragmentActivityM719w, (Class<?>) DeviceCredentialHandlerActivity.class);
        intent.putExtra("prompt_info_bundle", bundleM729a);
        fragmentActivityM719w.startActivity(intent);
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricPrompt$d */
    public static class C0174d {

        /* JADX INFO: renamed from: a */
        public final Signature f865a;

        /* JADX INFO: renamed from: b */
        public final Cipher f866b;

        /* JADX INFO: renamed from: c */
        public final Mac f867c;

        public C0174d(@NonNull Signature signature) {
            this.f865a = signature;
            this.f866b = null;
            this.f867c = null;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public Cipher m726a() {
            return this.f866b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public Mac m727b() {
            return this.f867c;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public Signature m728c() {
            return this.f865a;
        }

        public C0174d(@NonNull Cipher cipher) {
            this.f866b = cipher;
            this.f865a = null;
            this.f867c = null;
        }

        public C0174d(@NonNull Mac mac) {
            this.f867c = mac;
            this.f866b = null;
            this.f865a = null;
        }
    }
}

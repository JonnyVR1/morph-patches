package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.concurrent.Executor;
import p149l.gz2;
import p149l.hz2;
import p149l.iz2;
import p149l.jz2;
import p149l.kz2;
import p149l.uek0;
import p149l.wz2;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@SuppressLint({"SyntheticAccessor"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class BiometricFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    public Bundle f824A;

    /* JADX INFO: renamed from: B */
    @VisibleForTesting
    public Executor f825B;

    /* JADX INFO: renamed from: C */
    @VisibleForTesting
    public DialogInterface.OnClickListener f826C;

    /* JADX INFO: renamed from: D */
    @VisibleForTesting
    public BiometricPrompt.AbstractC0172b f827D;

    /* JADX INFO: renamed from: E */
    public BiometricPrompt.C0174d f828E;

    /* JADX INFO: renamed from: F */
    public CharSequence f829F;

    /* JADX INFO: renamed from: G */
    public boolean f830G;

    /* JADX INFO: renamed from: H */
    public android.hardware.biometrics.BiometricPrompt f831H;

    /* JADX INFO: renamed from: I */
    public CancellationSignal f832I;

    /* JADX INFO: renamed from: J */
    public boolean f833J;

    /* JADX INFO: renamed from: K */
    public final Handler f834K = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: L */
    public final Executor f835L = new ExecutorC0165a();

    /* JADX INFO: renamed from: M */
    @VisibleForTesting
    public final BiometricPrompt$AuthenticationCallback f836M = new C0166b();

    /* JADX INFO: renamed from: N */
    public final DialogInterface.OnClickListener f837N = new DialogInterfaceOnClickListenerC0167c();

    /* JADX INFO: renamed from: O */
    public final DialogInterface.OnClickListener f838O = new DialogInterfaceOnClickListenerC0168d();

    /* JADX INFO: renamed from: z */
    public Context f839z;

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$a */
    public class ExecutorC0165a implements Executor {
        public ExecutorC0165a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            BiometricFragment.this.f834K.post(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$b */
    public class C0166b extends BiometricPrompt$AuthenticationCallback {

        /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CharSequence f842a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f843b;

            public a(CharSequence charSequence, int i) {
                this.f842a = charSequence;
                this.f843b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                CharSequence charSequence = this.f842a;
                if (charSequence == null) {
                    charSequence = BiometricFragment.this.f839z.getString(R$string.f909b) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f843b;
                }
                BiometricFragment.this.f827D.m723a(uek0.m193259c(this.f843b) ? 8 : this.f843b, charSequence);
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BiometricPrompt.C0173c f845a;

            public b(BiometricPrompt.C0173c c0173c) {
                this.f845a = c0173c;
            }

            @Override // java.lang.Runnable
            public void run() {
                BiometricFragment.this.f827D.m725c(this.f845a);
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$b$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BiometricFragment.this.f827D.m724b();
            }
        }

        public C0166b() {
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            if (uek0.m193257a()) {
                return;
            }
            BiometricFragment.this.f825B.execute(new a(charSequence, i));
            BiometricFragment.this.m688b4();
        }

        public void onAuthenticationFailed() {
            BiometricFragment.this.f825B.execute(new c());
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
            BiometricFragment.this.f825B.execute(new b(authenticationResult != null ? new BiometricPrompt.C0173c(BiometricFragment.m685i4(authenticationResult.getCryptoObject())) : new BiometricPrompt.C0173c(null)));
            BiometricFragment.this.m688b4();
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$c */
    public class DialogInterfaceOnClickListenerC0167c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0167c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BiometricFragment.this.f826C.onClick(dialogInterface, i);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$d */
    public class DialogInterfaceOnClickListenerC0168d implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0168d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                uek0.m193261e("BiometricFragment", BiometricFragment.this.getActivity(), BiometricFragment.this.f824A, null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$e */
    public class RunnableC0169e implements Runnable {
        public RunnableC0169e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f833J = true;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static BiometricFragment m684e4() {
        return new BiometricFragment();
    }

    /* JADX INFO: renamed from: i4 */
    public static BiometricPrompt.C0174d m685i4(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new BiometricPrompt.C0174d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new BiometricPrompt.C0174d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new BiometricPrompt.C0174d(cryptoObject.getMac());
        }
        return null;
    }

    /* JADX INFO: renamed from: j4 */
    public static android.hardware.biometrics.BiometricPrompt.CryptoObject m686j4(BiometricPrompt.C0174d c0174d) {
        if (c0174d == null) {
            return null;
        }
        if (c0174d.m726a() != null) {
            iz2.m139024a();
            return wz2.m206242a(c0174d.m726a());
        }
        if (c0174d.m728c() != null) {
            iz2.m139024a();
            return gz2.m128790a(c0174d.m728c());
        }
        if (c0174d.m727b() == null) {
            return null;
        }
        iz2.m139024a();
        return hz2.m133632a(c0174d.m727b());
    }

    /* JADX INFO: renamed from: a4 */
    public void m687a4() {
        if (Build.VERSION.SDK_INT < 29 || !m690d4() || this.f833J) {
            CancellationSignal cancellationSignal = this.f832I;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            m688b4();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m688b4() {
        this.f830G = false;
        FragmentActivity activity = getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().m2567m().mo2711m(this).mo2708j();
        }
        uek0.m193262f(activity);
    }

    @Nullable
    /* JADX INFO: renamed from: c4 */
    public CharSequence m689c4() {
        return this.f829F;
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m690d4() {
        Bundle bundle = this.f824A;
        return bundle != null && bundle.getBoolean("allow_device_credential", false);
    }

    /* JADX INFO: renamed from: f4 */
    public void m691f4(@Nullable Bundle bundle) {
        this.f824A = bundle;
    }

    /* JADX INFO: renamed from: g4 */
    public void m692g4(Executor executor, DialogInterface.OnClickListener onClickListener, BiometricPrompt.AbstractC0172b abstractC0172b) {
        this.f825B = executor;
        this.f826C = onClickListener;
        this.f827D = abstractC0172b;
    }

    /* JADX INFO: renamed from: h4 */
    public void m693h4(BiometricPrompt.C0174d c0174d) {
        this.f828E = c0174d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.f839z = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle bundle2;
        if (!this.f830G && (bundle2 = this.f824A) != null) {
            this.f829F = bundle2.getCharSequence("negative_text");
            kz2.m147927a();
            android.hardware.biometrics.BiometricPrompt.Builder builderM143886a = jz2.m143886a(getContext());
            builderM143886a.setTitle(this.f824A.getCharSequence("title")).setSubtitle(this.f824A.getCharSequence("subtitle")).setDescription(this.f824A.getCharSequence("description"));
            boolean z = this.f824A.getBoolean("allow_device_credential");
            if (z && Build.VERSION.SDK_INT <= 28) {
                String string = getString(R$string.f908a);
                this.f829F = string;
                builderM143886a.setNegativeButton(string, this.f825B, this.f838O);
            } else if (!TextUtils.isEmpty(this.f829F)) {
                builderM143886a.setNegativeButton(this.f829F, this.f825B, this.f837N);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builderM143886a.setConfirmationRequired(this.f824A.getBoolean("require_confirmation", true));
                builderM143886a.setDeviceCredentialAllowed(z);
            }
            if (z) {
                this.f833J = false;
                this.f834K.postDelayed(new RunnableC0169e(), 250L);
            }
            this.f831H = builderM143886a.build();
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f832I = cancellationSignal;
            BiometricPrompt.C0174d c0174d = this.f828E;
            android.hardware.biometrics.BiometricPrompt biometricPrompt = this.f831H;
            if (c0174d == null) {
                biometricPrompt.authenticate(cancellationSignal, this.f835L, this.f836M);
            } else {
                biometricPrompt.authenticate(m686j4(c0174d), this.f832I, this.f835L, this.f836M);
            }
        }
        this.f830G = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}

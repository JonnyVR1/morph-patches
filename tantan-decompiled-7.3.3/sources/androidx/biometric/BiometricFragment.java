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
import p153l.aok0;
import p153l.l03;
import p153l.vz2;
import p153l.wz2;
import p153l.xz2;
import p153l.yz2;
import p153l.zz2;

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
    public BiometricPrompt.AbstractC0173b f827D;

    /* JADX INFO: renamed from: E */
    public BiometricPrompt.C0175d f828E;

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
    public final Executor f835L = new ExecutorC0166a();

    /* JADX INFO: renamed from: M */
    @VisibleForTesting
    public final BiometricPrompt$AuthenticationCallback f836M = new C0167b();

    /* JADX INFO: renamed from: N */
    public final DialogInterface.OnClickListener f837N = new DialogInterfaceOnClickListenerC0168c();

    /* JADX INFO: renamed from: O */
    public final DialogInterface.OnClickListener f838O = new DialogInterfaceOnClickListenerC0169d();

    /* JADX INFO: renamed from: z */
    public Context f839z;

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$a */
    public class ExecutorC0166a implements Executor {
        public ExecutorC0166a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            BiometricFragment.this.f834K.post(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$b */
    public class C0167b extends BiometricPrompt$AuthenticationCallback {

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
                BiometricFragment.this.f827D.m724a(aok0.m99088c(this.f843b) ? 8 : this.f843b, charSequence);
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BiometricPrompt.C0174c f845a;

            public b(BiometricPrompt.C0174c c0174c) {
                this.f845a = c0174c;
            }

            @Override // java.lang.Runnable
            public void run() {
                BiometricFragment.this.f827D.m726c(this.f845a);
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$b$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BiometricFragment.this.f827D.m725b();
            }
        }

        public C0167b() {
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            if (aok0.m99086a()) {
                return;
            }
            BiometricFragment.this.f825B.execute(new a(charSequence, i));
            BiometricFragment.this.m689b4();
        }

        public void onAuthenticationFailed() {
            BiometricFragment.this.f825B.execute(new c());
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult authenticationResult) {
            BiometricFragment.this.f825B.execute(new b(authenticationResult != null ? new BiometricPrompt.C0174c(BiometricFragment.m686i4(authenticationResult.getCryptoObject())) : new BiometricPrompt.C0174c(null)));
            BiometricFragment.this.m689b4();
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$c */
    public class DialogInterfaceOnClickListenerC0168c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0168c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BiometricFragment.this.f826C.onClick(dialogInterface, i);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$d */
    public class DialogInterfaceOnClickListenerC0169d implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0169d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                aok0.m99090e("BiometricFragment", BiometricFragment.this.getActivity(), BiometricFragment.this.f824A, null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$e */
    public class RunnableC0170e implements Runnable {
        public RunnableC0170e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f833J = true;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static BiometricFragment m685e4() {
        return new BiometricFragment();
    }

    /* JADX INFO: renamed from: i4 */
    public static BiometricPrompt.C0175d m686i4(android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new BiometricPrompt.C0175d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new BiometricPrompt.C0175d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new BiometricPrompt.C0175d(cryptoObject.getMac());
        }
        return null;
    }

    /* JADX INFO: renamed from: j4 */
    public static android.hardware.biometrics.BiometricPrompt.CryptoObject m687j4(BiometricPrompt.C0175d c0175d) {
        if (c0175d == null) {
            return null;
        }
        if (c0175d.m727a() != null) {
            xz2.m213704a();
            return l03.m152253a(c0175d.m727a());
        }
        if (c0175d.m729c() != null) {
            xz2.m213704a();
            return vz2.m204044a(c0175d.m729c());
        }
        if (c0175d.m728b() == null) {
            return null;
        }
        xz2.m213704a();
        return wz2.m208632a(c0175d.m728b());
    }

    /* JADX INFO: renamed from: a4 */
    public void m688a4() {
        if (Build.VERSION.SDK_INT < 29 || !m691d4() || this.f833J) {
            CancellationSignal cancellationSignal = this.f832I;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            m689b4();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m689b4() {
        this.f830G = false;
        FragmentActivity activity = getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().m2568m().mo2712m(this).mo2709j();
        }
        aok0.m99091f(activity);
    }

    @Nullable
    /* JADX INFO: renamed from: c4 */
    public CharSequence m690c4() {
        return this.f829F;
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m691d4() {
        Bundle bundle = this.f824A;
        return bundle != null && bundle.getBoolean("allow_device_credential", false);
    }

    /* JADX INFO: renamed from: f4 */
    public void m692f4(@Nullable Bundle bundle) {
        this.f824A = bundle;
    }

    /* JADX INFO: renamed from: g4 */
    public void m693g4(Executor executor, DialogInterface.OnClickListener onClickListener, BiometricPrompt.AbstractC0173b abstractC0173b) {
        this.f825B = executor;
        this.f826C = onClickListener;
        this.f827D = abstractC0173b;
    }

    /* JADX INFO: renamed from: h4 */
    public void m694h4(BiometricPrompt.C0175d c0175d) {
        this.f828E = c0175d;
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
            zz2.m222231a();
            android.hardware.biometrics.BiometricPrompt.Builder builderM218008a = yz2.m218008a(getContext());
            builderM218008a.setTitle(this.f824A.getCharSequence("title")).setSubtitle(this.f824A.getCharSequence("subtitle")).setDescription(this.f824A.getCharSequence("description"));
            boolean z = this.f824A.getBoolean("allow_device_credential");
            if (z && Build.VERSION.SDK_INT <= 28) {
                String string = getString(R$string.f908a);
                this.f829F = string;
                builderM218008a.setNegativeButton(string, this.f825B, this.f838O);
            } else if (!TextUtils.isEmpty(this.f829F)) {
                builderM218008a.setNegativeButton(this.f829F, this.f825B, this.f837N);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builderM218008a.setConfirmationRequired(this.f824A.getBoolean("require_confirmation", true));
                builderM218008a.setDeviceCredentialAllowed(z);
            }
            if (z) {
                this.f833J = false;
                this.f834K.postDelayed(new RunnableC0170e(), 250L);
            }
            this.f831H = builderM218008a.build();
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f832I = cancellationSignal;
            BiometricPrompt.C0175d c0175d = this.f828E;
            android.hardware.biometrics.BiometricPrompt biometricPrompt = this.f831H;
            if (c0175d == null) {
                biometricPrompt.authenticate(cancellationSignal, this.f835L, this.f836M);
            } else {
                biometricPrompt.authenticate(m687j4(c0175d), this.f832I, this.f835L, this.f836M);
            }
        }
        this.f830G = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}

package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import p153l.aok0;
import p153l.fg4;
import p153l.loi;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SyntheticAccessor"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FingerprintHelperFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    @VisibleForTesting
    public Executor f887A;

    /* JADX INFO: renamed from: B */
    @VisibleForTesting
    public BiometricPrompt.AbstractC0173b f888B;

    /* JADX INFO: renamed from: C */
    public Handler f889C;

    /* JADX INFO: renamed from: D */
    public boolean f890D;

    /* JADX INFO: renamed from: E */
    public BiometricPrompt.C0175d f891E;

    /* JADX INFO: renamed from: F */
    public Context f892F;

    /* JADX INFO: renamed from: G */
    public int f893G;

    /* JADX INFO: renamed from: H */
    public fg4 f894H;

    /* JADX INFO: renamed from: I */
    @VisibleForTesting
    public final loi.AbstractC18425c f895I = new C0181a();

    /* JADX INFO: renamed from: z */
    public C0182b f896z;

    /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a */
    public class C0181a extends loi.AbstractC18425c {

        /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f898a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CharSequence f899b;

            public a(int i, CharSequence charSequence) {
                this.f898a = i;
                this.f899b = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                FingerprintHelperFragment.this.f888B.m724a(this.f898a, this.f899b);
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f901a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CharSequence f902b;

            public b(int i, CharSequence charSequence) {
                this.f901a = i;
                this.f902b = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0181a.this.m781f(this.f901a, this.f902b);
                FingerprintHelperFragment.this.m765c4();
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BiometricPrompt.C0174c f904a;

            public c(BiometricPrompt.C0174c c0174c) {
                this.f904a = c0174c;
            }

            @Override // java.lang.Runnable
            public void run() {
                FingerprintHelperFragment.this.f888B.m726c(this.f904a);
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FingerprintHelperFragment.this.f888B.m725b();
            }
        }

        public C0181a() {
        }

        @Override // p153l.loi.AbstractC18425c
        /* JADX INFO: renamed from: a */
        public void mo777a(int i, CharSequence charSequence) {
            if (i == 5) {
                if (FingerprintHelperFragment.this.f893G == 0) {
                    m781f(i, charSequence);
                }
                FingerprintHelperFragment.this.m765c4();
            } else {
                if (i == 7 || i == 9) {
                    m781f(i, charSequence);
                    FingerprintHelperFragment.this.m765c4();
                    return;
                }
                if (charSequence == null) {
                    Log.e("FingerprintHelperFrag", "Got null string for error message: " + i);
                    charSequence = FingerprintHelperFragment.this.f892F.getResources().getString(R$string.f909b);
                }
                if (aok0.m99088c(i)) {
                    i = 8;
                }
                FingerprintHelperFragment.this.f896z.m783b(2, i, 0, charSequence);
                FingerprintHelperFragment.this.f889C.postDelayed(new b(i, charSequence), FingerprintDialogFragment.m742h4(FingerprintHelperFragment.this.getContext()));
            }
        }

        @Override // p153l.loi.AbstractC18425c
        /* JADX INFO: renamed from: b */
        public void mo778b() {
            FingerprintHelperFragment.this.f896z.m784c(1, FingerprintHelperFragment.this.f892F.getResources().getString(R$string.f916i));
            FingerprintHelperFragment.this.f887A.execute(new d());
        }

        @Override // p153l.loi.AbstractC18425c
        /* JADX INFO: renamed from: c */
        public void mo779c(int i, CharSequence charSequence) {
            FingerprintHelperFragment.this.f896z.m784c(1, charSequence);
        }

        @Override // p153l.loi.AbstractC18425c
        /* JADX INFO: renamed from: d */
        public void mo780d(loi.C18426d c18426d) {
            FingerprintHelperFragment.this.f896z.m782a(5);
            FingerprintHelperFragment.this.f887A.execute(new c(c18426d != null ? new BiometricPrompt.C0174c(FingerprintHelperFragment.m767k4(c18426d.m155075a())) : new BiometricPrompt.C0174c(null)));
            FingerprintHelperFragment.this.m765c4();
        }

        /* JADX INFO: renamed from: f */
        public final void m781f(int i, CharSequence charSequence) {
            FingerprintHelperFragment.this.f896z.m782a(3);
            if (aok0.m99086a()) {
                return;
            }
            FingerprintHelperFragment.this.f887A.execute(new a(i, charSequence));
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$b */
    @VisibleForTesting
    public static class C0182b {

        /* JADX INFO: renamed from: a */
        public final Handler f907a;

        @VisibleForTesting
        public C0182b(Handler handler) {
            this.f907a = handler;
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: a */
        public void m782a(int i) {
            this.f907a.obtainMessage(i).sendToTarget();
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: b */
        public void m783b(int i, int i2, int i3, Object obj) {
            this.f907a.obtainMessage(i, i2, i3, obj).sendToTarget();
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: c */
        public void m784c(int i, Object obj) {
            this.f907a.obtainMessage(i, obj).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m765c4() {
        this.f890D = false;
        FragmentActivity activity = getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().m2568m().mo2712m(this).mo2709j();
        }
        if (aok0.m99086a()) {
            return;
        }
        aok0.m99091f(activity);
    }

    /* JADX INFO: renamed from: f4 */
    public static FingerprintHelperFragment m766f4() {
        return new FingerprintHelperFragment();
    }

    /* JADX INFO: renamed from: k4 */
    public static BiometricPrompt.C0175d m767k4(loi.C18427e c18427e) {
        if (c18427e == null) {
            return null;
        }
        if (c18427e.m155076a() != null) {
            return new BiometricPrompt.C0175d(c18427e.m155076a());
        }
        if (c18427e.m155078c() != null) {
            return new BiometricPrompt.C0175d(c18427e.m155078c());
        }
        if (c18427e.m155077b() != null) {
            return new BiometricPrompt.C0175d(c18427e.m155077b());
        }
        return null;
    }

    /* JADX INFO: renamed from: l4 */
    public static loi.C18427e m768l4(BiometricPrompt.C0175d c0175d) {
        if (c0175d == null) {
            return null;
        }
        if (c0175d.m727a() != null) {
            return new loi.C18427e(c0175d.m727a());
        }
        if (c0175d.m729c() != null) {
            return new loi.C18427e(c0175d.m729c());
        }
        if (c0175d.m728b() != null) {
            return new loi.C18427e(c0175d.m728b());
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public void m769b4(int i) {
        this.f893G = i;
        if (i == 1) {
            m772g4(10);
        }
        fg4 fg4Var = this.f894H;
        if (fg4Var != null) {
            fg4Var.m125475a();
        }
        m765c4();
    }

    /* JADX INFO: renamed from: d4 */
    public final String m770d4(Context context, int i) {
        if (i == 1) {
            return context.getString(R$string.f911d);
        }
        switch (i) {
            case 10:
                return context.getString(R$string.f915h);
            case 11:
                return context.getString(R$string.f914g);
            case 12:
                return context.getString(R$string.f912e);
            default:
                Log.e("FingerprintHelperFrag", "Unknown error code: " + i);
                return context.getString(R$string.f909b);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m771e4(loi loiVar) {
        if (!loiVar.m155067f()) {
            m772g4(12);
            return true;
        }
        if (loiVar.m155066e()) {
            return false;
        }
        m772g4(11);
        return true;
    }

    /* JADX INFO: renamed from: g4 */
    public final void m772g4(int i) {
        if (aok0.m99086a()) {
            return;
        }
        this.f888B.m724a(i, m770d4(this.f892F, i));
    }

    /* JADX INFO: renamed from: h4 */
    public void m773h4(Executor executor, BiometricPrompt.AbstractC0173b abstractC0173b) {
        this.f887A = executor;
        this.f888B = abstractC0173b;
    }

    /* JADX INFO: renamed from: i4 */
    public void m774i4(BiometricPrompt.C0175d c0175d) {
        this.f891E = c0175d;
    }

    /* JADX INFO: renamed from: j4 */
    public void m775j4(Handler handler) {
        this.f889C = handler;
        this.f896z = new C0182b(handler);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f892F = getContext();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (!this.f890D) {
            this.f894H = new fg4();
            this.f893G = 0;
            loi loiVarM155059c = loi.m155059c(this.f892F);
            if (m771e4(loiVarM155059c)) {
                this.f896z.m782a(3);
                m765c4();
            } else {
                loiVarM155059c.m155065b(m768l4(this.f891E), 0, this.f894H, this.f895I, null);
                this.f890D = true;
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}

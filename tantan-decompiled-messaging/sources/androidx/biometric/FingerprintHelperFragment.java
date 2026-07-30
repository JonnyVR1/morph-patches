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
import p149l.gf4;
import p149l.pli;
import p149l.uek0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SyntheticAccessor"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FingerprintHelperFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    @VisibleForTesting
    public Executor f887A;

    /* JADX INFO: renamed from: B */
    @VisibleForTesting
    public BiometricPrompt.AbstractC0172b f888B;

    /* JADX INFO: renamed from: C */
    public Handler f889C;

    /* JADX INFO: renamed from: D */
    public boolean f890D;

    /* JADX INFO: renamed from: E */
    public BiometricPrompt.C0174d f891E;

    /* JADX INFO: renamed from: F */
    public Context f892F;

    /* JADX INFO: renamed from: G */
    public int f893G;

    /* JADX INFO: renamed from: H */
    public gf4 f894H;

    /* JADX INFO: renamed from: I */
    @VisibleForTesting
    public final pli.AbstractC19272c f895I = new C0180a();

    /* JADX INFO: renamed from: z */
    public C0181b f896z;

    /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a */
    public class C0180a extends pli.AbstractC19272c {

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
                FingerprintHelperFragment.this.f888B.m723a(this.f898a, this.f899b);
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
                C0180a.this.m780f(this.f901a, this.f902b);
                FingerprintHelperFragment.this.m764c4();
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BiometricPrompt.C0173c f904a;

            public c(BiometricPrompt.C0173c c0173c) {
                this.f904a = c0173c;
            }

            @Override // java.lang.Runnable
            public void run() {
                FingerprintHelperFragment.this.f888B.m725c(this.f904a);
            }
        }

        /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$a$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FingerprintHelperFragment.this.f888B.m724b();
            }
        }

        public C0180a() {
        }

        @Override // p149l.pli.AbstractC19272c
        /* JADX INFO: renamed from: a */
        public void mo776a(int i, CharSequence charSequence) {
            if (i == 5) {
                if (FingerprintHelperFragment.this.f893G == 0) {
                    m780f(i, charSequence);
                }
                FingerprintHelperFragment.this.m764c4();
            } else {
                if (i == 7 || i == 9) {
                    m780f(i, charSequence);
                    FingerprintHelperFragment.this.m764c4();
                    return;
                }
                if (charSequence == null) {
                    Log.e("FingerprintHelperFrag", "Got null string for error message: " + i);
                    charSequence = FingerprintHelperFragment.this.f892F.getResources().getString(R$string.f909b);
                }
                if (uek0.m193259c(i)) {
                    i = 8;
                }
                FingerprintHelperFragment.this.f896z.m782b(2, i, 0, charSequence);
                FingerprintHelperFragment.this.f889C.postDelayed(new b(i, charSequence), FingerprintDialogFragment.m741h4(FingerprintHelperFragment.this.getContext()));
            }
        }

        @Override // p149l.pli.AbstractC19272c
        /* JADX INFO: renamed from: b */
        public void mo777b() {
            FingerprintHelperFragment.this.f896z.m783c(1, FingerprintHelperFragment.this.f892F.getResources().getString(R$string.f916i));
            FingerprintHelperFragment.this.f887A.execute(new d());
        }

        @Override // p149l.pli.AbstractC19272c
        /* JADX INFO: renamed from: c */
        public void mo778c(int i, CharSequence charSequence) {
            FingerprintHelperFragment.this.f896z.m783c(1, charSequence);
        }

        @Override // p149l.pli.AbstractC19272c
        /* JADX INFO: renamed from: d */
        public void mo779d(pli.C19273d c19273d) {
            FingerprintHelperFragment.this.f896z.m781a(5);
            FingerprintHelperFragment.this.f887A.execute(new c(c19273d != null ? new BiometricPrompt.C0173c(FingerprintHelperFragment.m766k4(c19273d.m170216a())) : new BiometricPrompt.C0173c(null)));
            FingerprintHelperFragment.this.m764c4();
        }

        /* JADX INFO: renamed from: f */
        public final void m780f(int i, CharSequence charSequence) {
            FingerprintHelperFragment.this.f896z.m781a(3);
            if (uek0.m193257a()) {
                return;
            }
            FingerprintHelperFragment.this.f887A.execute(new a(i, charSequence));
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.FingerprintHelperFragment$b */
    @VisibleForTesting
    public static class C0181b {

        /* JADX INFO: renamed from: a */
        public final Handler f907a;

        @VisibleForTesting
        public C0181b(Handler handler) {
            this.f907a = handler;
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: a */
        public void m781a(int i) {
            this.f907a.obtainMessage(i).sendToTarget();
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: b */
        public void m782b(int i, int i2, int i3, Object obj) {
            this.f907a.obtainMessage(i, i2, i3, obj).sendToTarget();
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: c */
        public void m783c(int i, Object obj) {
            this.f907a.obtainMessage(i, obj).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public void m764c4() {
        this.f890D = false;
        FragmentActivity activity = getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().m2567m().mo2711m(this).mo2708j();
        }
        if (uek0.m193257a()) {
            return;
        }
        uek0.m193262f(activity);
    }

    /* JADX INFO: renamed from: f4 */
    public static FingerprintHelperFragment m765f4() {
        return new FingerprintHelperFragment();
    }

    /* JADX INFO: renamed from: k4 */
    public static BiometricPrompt.C0174d m766k4(pli.C19274e c19274e) {
        if (c19274e == null) {
            return null;
        }
        if (c19274e.m170217a() != null) {
            return new BiometricPrompt.C0174d(c19274e.m170217a());
        }
        if (c19274e.m170219c() != null) {
            return new BiometricPrompt.C0174d(c19274e.m170219c());
        }
        if (c19274e.m170218b() != null) {
            return new BiometricPrompt.C0174d(c19274e.m170218b());
        }
        return null;
    }

    /* JADX INFO: renamed from: l4 */
    public static pli.C19274e m767l4(BiometricPrompt.C0174d c0174d) {
        if (c0174d == null) {
            return null;
        }
        if (c0174d.m726a() != null) {
            return new pli.C19274e(c0174d.m726a());
        }
        if (c0174d.m728c() != null) {
            return new pli.C19274e(c0174d.m728c());
        }
        if (c0174d.m727b() != null) {
            return new pli.C19274e(c0174d.m727b());
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public void m768b4(int i) {
        this.f893G = i;
        if (i == 1) {
            m771g4(10);
        }
        gf4 gf4Var = this.f894H;
        if (gf4Var != null) {
            gf4Var.m125873a();
        }
        m764c4();
    }

    /* JADX INFO: renamed from: d4 */
    public final String m769d4(Context context, int i) {
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
    public final boolean m770e4(pli pliVar) {
        if (!pliVar.m170208f()) {
            m771g4(12);
            return true;
        }
        if (pliVar.m170207e()) {
            return false;
        }
        m771g4(11);
        return true;
    }

    /* JADX INFO: renamed from: g4 */
    public final void m771g4(int i) {
        if (uek0.m193257a()) {
            return;
        }
        this.f888B.m723a(i, m769d4(this.f892F, i));
    }

    /* JADX INFO: renamed from: h4 */
    public void m772h4(Executor executor, BiometricPrompt.AbstractC0172b abstractC0172b) {
        this.f887A = executor;
        this.f888B = abstractC0172b;
    }

    /* JADX INFO: renamed from: i4 */
    public void m773i4(BiometricPrompt.C0174d c0174d) {
        this.f891E = c0174d;
    }

    /* JADX INFO: renamed from: j4 */
    public void m774j4(Handler handler) {
        this.f889C = handler;
        this.f896z = new C0181b(handler);
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
            this.f894H = new gf4();
            this.f893G = 0;
            pli pliVarM170200c = pli.m170200c(this.f892F);
            if (m770e4(pliVarM170200c)) {
                this.f896z.m781a(3);
                m764c4();
            } else {
                pliVarM170200c.m170206b(m767l4(this.f891E), 0, this.f894H, this.f895I, null);
                this.f890D = true;
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}

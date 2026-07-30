package p149l;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class pli {

    /* JADX INFO: renamed from: a */
    public final Context f150138a;

    /* JADX INFO: renamed from: l.pli$a */
    public class C19270a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC19272c f150139a;

        public C19270a(AbstractC19272c abstractC19272c) {
            this.f150139a = abstractC19272c;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f150139a.mo776a(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f150139a.mo777b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f150139a.mo778c(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f150139a.mo779d(new C19273d(pli.m170202g(C19271b.m170210b(authenticationResult))));
        }
    }

    /* JADX INFO: renamed from: l.pli$b */
    @RequiresApi(23)
    public static class C19271b {
        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m170209a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static FingerprintManager.CryptoObject m170210b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static FingerprintManager m170211c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static boolean m170212d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static boolean m170213e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static C19274e m170214f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C19274e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C19274e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C19274e(cryptoObject.getMac());
            }
            return null;
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static FingerprintManager.CryptoObject m170215g(C19274e c19274e) {
            if (c19274e == null) {
                return null;
            }
            if (c19274e.m170217a() != null) {
                return new FingerprintManager.CryptoObject(c19274e.m170217a());
            }
            if (c19274e.m170219c() != null) {
                return new FingerprintManager.CryptoObject(c19274e.m170219c());
            }
            if (c19274e.m170218b() != null) {
                return new FingerprintManager.CryptoObject(c19274e.m170218b());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.pli$d */
    public static final class C19273d {

        /* JADX INFO: renamed from: a */
        public final C19274e f150140a;

        public C19273d(@NonNull C19274e c19274e) {
            this.f150140a = c19274e;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C19274e m170216a() {
            return this.f150140a;
        }
    }

    public pli(Context context) {
        this.f150138a = context;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static pli m170200c(@NonNull Context context) {
        return new pli(context);
    }

    @Nullable
    @RequiresApi(23)
    /* JADX INFO: renamed from: d */
    public static FingerprintManager m170201d(@NonNull Context context) {
        return C19271b.m170211c(context);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: g */
    public static C19274e m170202g(FingerprintManager.CryptoObject cryptoObject) {
        return C19271b.m170214f(cryptoObject);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: h */
    public static FingerprintManager.AuthenticationCallback m170203h(AbstractC19272c abstractC19272c) {
        return new C19270a(abstractC19272c);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: i */
    public static FingerprintManager.CryptoObject m170204i(C19274e c19274e) {
        return C19271b.m170215g(c19274e);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: a */
    public void m170205a(@Nullable C19274e c19274e, int i, @Nullable CancellationSignal cancellationSignal, @NonNull AbstractC19272c abstractC19272c, @Nullable Handler handler) {
        FingerprintManager fingerprintManagerM170201d = m170201d(this.f150138a);
        if (fingerprintManagerM170201d != null) {
            C19271b.m170209a(fingerprintManagerM170201d, m170204i(c19274e), cancellationSignal, i, m170203h(abstractC19272c), handler);
        }
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: b */
    public void m170206b(@Nullable C19274e c19274e, int i, @Nullable gf4 gf4Var, @NonNull AbstractC19272c abstractC19272c, @Nullable Handler handler) {
        m170205a(c19274e, i, gf4Var != null ? (CancellationSignal) gf4Var.m125874b() : null, abstractC19272c, handler);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: e */
    public boolean m170207e() {
        FingerprintManager fingerprintManagerM170201d = m170201d(this.f150138a);
        return fingerprintManagerM170201d != null && C19271b.m170212d(fingerprintManagerM170201d);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: f */
    public boolean m170208f() {
        FingerprintManager fingerprintManagerM170201d = m170201d(this.f150138a);
        return fingerprintManagerM170201d != null && C19271b.m170213e(fingerprintManagerM170201d);
    }

    /* JADX INFO: renamed from: l.pli$e */
    public static class C19274e {

        /* JADX INFO: renamed from: a */
        public final Signature f150141a;

        /* JADX INFO: renamed from: b */
        public final Cipher f150142b;

        /* JADX INFO: renamed from: c */
        public final Mac f150143c;

        public C19274e(@NonNull Signature signature) {
            this.f150141a = signature;
            this.f150142b = null;
            this.f150143c = null;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public Cipher m170217a() {
            return this.f150142b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public Mac m170218b() {
            return this.f150143c;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public Signature m170219c() {
            return this.f150141a;
        }

        public C19274e(@NonNull Cipher cipher) {
            this.f150142b = cipher;
            this.f150141a = null;
            this.f150143c = null;
        }

        public C19274e(@NonNull Mac mac) {
            this.f150143c = mac;
            this.f150142b = null;
            this.f150141a = null;
        }
    }

    /* JADX INFO: renamed from: l.pli$c */
    public static abstract class AbstractC19272c {
        /* JADX INFO: renamed from: b */
        public void mo777b() {
        }

        /* JADX INFO: renamed from: d */
        public void mo779d(@NonNull C19273d c19273d) {
        }

        /* JADX INFO: renamed from: a */
        public void mo776a(int i, @NonNull CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: c */
        public void mo778c(int i, @NonNull CharSequence charSequence) {
        }
    }
}

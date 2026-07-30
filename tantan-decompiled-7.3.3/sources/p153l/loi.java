package p153l;

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
public class loi {

    /* JADX INFO: renamed from: a */
    public final Context f132902a;

    /* JADX INFO: renamed from: l.loi$a */
    public class C18423a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC18425c f132903a;

        public C18423a(AbstractC18425c abstractC18425c) {
            this.f132903a = abstractC18425c;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f132903a.mo777a(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f132903a.mo778b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f132903a.mo779c(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f132903a.mo780d(new C18426d(loi.m155061g(C18424b.m155069b(authenticationResult))));
        }
    }

    /* JADX INFO: renamed from: l.loi$b */
    @RequiresApi(23)
    public static class C18424b {
        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m155068a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static FingerprintManager.CryptoObject m155069b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static FingerprintManager m155070c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static boolean m155071d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static boolean m155072e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static C18427e m155073f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C18427e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C18427e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C18427e(cryptoObject.getMac());
            }
            return null;
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static FingerprintManager.CryptoObject m155074g(C18427e c18427e) {
            if (c18427e == null) {
                return null;
            }
            if (c18427e.m155076a() != null) {
                return new FingerprintManager.CryptoObject(c18427e.m155076a());
            }
            if (c18427e.m155078c() != null) {
                return new FingerprintManager.CryptoObject(c18427e.m155078c());
            }
            if (c18427e.m155077b() != null) {
                return new FingerprintManager.CryptoObject(c18427e.m155077b());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: l.loi$d */
    public static final class C18426d {

        /* JADX INFO: renamed from: a */
        public final C18427e f132904a;

        public C18426d(@NonNull C18427e c18427e) {
            this.f132904a = c18427e;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C18427e m155075a() {
            return this.f132904a;
        }
    }

    public loi(Context context) {
        this.f132902a = context;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static loi m155059c(@NonNull Context context) {
        return new loi(context);
    }

    @Nullable
    @RequiresApi(23)
    /* JADX INFO: renamed from: d */
    public static FingerprintManager m155060d(@NonNull Context context) {
        return C18424b.m155070c(context);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: g */
    public static C18427e m155061g(FingerprintManager.CryptoObject cryptoObject) {
        return C18424b.m155073f(cryptoObject);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: h */
    public static FingerprintManager.AuthenticationCallback m155062h(AbstractC18425c abstractC18425c) {
        return new C18423a(abstractC18425c);
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: i */
    public static FingerprintManager.CryptoObject m155063i(C18427e c18427e) {
        return C18424b.m155074g(c18427e);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: a */
    public void m155064a(@Nullable C18427e c18427e, int i, @Nullable CancellationSignal cancellationSignal, @NonNull AbstractC18425c abstractC18425c, @Nullable Handler handler) {
        FingerprintManager fingerprintManagerM155060d = m155060d(this.f132902a);
        if (fingerprintManagerM155060d != null) {
            C18424b.m155068a(fingerprintManagerM155060d, m155063i(c18427e), cancellationSignal, i, m155062h(abstractC18425c), handler);
        }
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: b */
    public void m155065b(@Nullable C18427e c18427e, int i, @Nullable fg4 fg4Var, @NonNull AbstractC18425c abstractC18425c, @Nullable Handler handler) {
        m155064a(c18427e, i, fg4Var != null ? (CancellationSignal) fg4Var.m125476b() : null, abstractC18425c, handler);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: e */
    public boolean m155066e() {
        FingerprintManager fingerprintManagerM155060d = m155060d(this.f132902a);
        return fingerprintManagerM155060d != null && C18424b.m155071d(fingerprintManagerM155060d);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: f */
    public boolean m155067f() {
        FingerprintManager fingerprintManagerM155060d = m155060d(this.f132902a);
        return fingerprintManagerM155060d != null && C18424b.m155072e(fingerprintManagerM155060d);
    }

    /* JADX INFO: renamed from: l.loi$e */
    public static class C18427e {

        /* JADX INFO: renamed from: a */
        public final Signature f132905a;

        /* JADX INFO: renamed from: b */
        public final Cipher f132906b;

        /* JADX INFO: renamed from: c */
        public final Mac f132907c;

        public C18427e(@NonNull Signature signature) {
            this.f132905a = signature;
            this.f132906b = null;
            this.f132907c = null;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public Cipher m155076a() {
            return this.f132906b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public Mac m155077b() {
            return this.f132907c;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public Signature m155078c() {
            return this.f132905a;
        }

        public C18427e(@NonNull Cipher cipher) {
            this.f132906b = cipher;
            this.f132905a = null;
            this.f132907c = null;
        }

        public C18427e(@NonNull Mac mac) {
            this.f132907c = mac;
            this.f132906b = null;
            this.f132905a = null;
        }
    }

    /* JADX INFO: renamed from: l.loi$c */
    public static abstract class AbstractC18425c {
        /* JADX INFO: renamed from: b */
        public void mo778b() {
        }

        /* JADX INFO: renamed from: d */
        public void mo780d(@NonNull C18426d c18426d) {
        }

        /* JADX INFO: renamed from: a */
        public void mo777a(int i, @NonNull CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: c */
        public void mo779c(int i, @NonNull CharSequence charSequence) {
        }
    }
}

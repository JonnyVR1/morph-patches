package p149l;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes7.dex */
public class vbr {

    /* JADX INFO: renamed from: a */
    public final ia80 f180866a;

    /* JADX INFO: renamed from: b */
    public final ubr f180867b;

    /* JADX INFO: renamed from: c */
    public final int f180868c;

    /* JADX INFO: renamed from: d */
    public final String f180869d;

    /* JADX INFO: renamed from: e */
    public final String f180870e;

    /* JADX INFO: renamed from: f */
    public final qyd f180871f;

    public vbr(ia80 ia80Var, qyd qydVar, ubr ubrVar, int i, String str, String str2) {
        this.f180866a = ia80Var;
        this.f180871f = qydVar;
        this.f180867b = ubrVar;
        this.f180868c = i;
        this.f180869d = str;
        this.f180870e = str2;
    }

    /* JADX INFO: renamed from: a */
    public ubr m197727a() {
        return this.f180867b;
    }

    /* JADX INFO: renamed from: b */
    public int m197728b() {
        return this.f180868c;
    }

    /* JADX INFO: renamed from: c */
    public String m197729c() {
        return this.f180869d;
    }

    /* JADX INFO: renamed from: d */
    public final void m197730d(int i) {
        this.f180867b.mo81519c(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m197731e() {
        this.f180867b.mo81518b(561);
    }

    /* JADX INFO: renamed from: f */
    public final void m197732f(int i, hxc0 hxc0Var) {
        this.f180866a.mo135137a(i, hxc0Var);
        boolean zMo135138b = this.f180866a.mo135138b();
        ubr ubrVar = this.f180867b;
        if (zMo135138b) {
            ubrVar.mo81517a(i);
        } else {
            ubrVar.mo81518b(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m197733g(PublicKey publicKey, int i, String str, String str2) {
        hxc0 hxc0Var;
        String str3;
        if (str == null) {
            m197731e();
            return;
        }
        if (i == 0 || i == 1 || i == 2) {
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (!signature.verify(ge2.m125600a(str2))) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    m197731e();
                    return;
                }
                try {
                    hxc0 hxc0VarM133320a = hxc0.m133320a(str);
                    if (hxc0VarM133320a.f109844a != i) {
                        Log.e("LicenseValidator", "Response codes don't match.");
                        m197731e();
                        return;
                    }
                    if (hxc0VarM133320a.f109845b != this.f180868c) {
                        Log.e("LicenseValidator", "Nonce doesn't match.");
                        m197731e();
                        return;
                    }
                    if (!hxc0VarM133320a.f109846c.equals(this.f180869d)) {
                        Log.e("LicenseValidator", "Package name doesn't match.");
                        m197731e();
                        return;
                    } else {
                        if (!hxc0VarM133320a.f109847d.equals(this.f180870e)) {
                            Log.e("LicenseValidator", "Version codes don't match.");
                            m197731e();
                            return;
                        }
                        String str4 = hxc0VarM133320a.f109848e;
                        if (TextUtils.isEmpty(str4)) {
                            Log.e("LicenseValidator", "User identifier is empty.");
                            m197731e();
                            return;
                        } else {
                            hxc0Var = hxc0VarM133320a;
                            str3 = str4;
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    Log.e("LicenseValidator", "Could not parse response.");
                    m197731e();
                    return;
                }
            } catch (Base64DecoderException unused2) {
                Log.e("LicenseValidator", "Could not Base64-decode signature.");
                m197731e();
                return;
            } catch (InvalidKeyException unused3) {
                m197730d(5);
                return;
            } catch (NoSuchAlgorithmException e) {
                aag0.m95543a(e);
                return;
            } catch (SignatureException e2) {
                aag0.m95543a(e2);
                return;
            }
        } else {
            str3 = null;
            hxc0Var = null;
        }
        if (i != 0) {
            if (i == 1) {
                m197732f(561, hxc0Var);
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    m197730d(3);
                    return;
                }
                if (i == 4) {
                    m197732f(291, hxc0Var);
                    return;
                }
                if (i == 5) {
                    m197732f(291, hxc0Var);
                    return;
                }
                switch (i) {
                    case 257:
                        m197732f(291, hxc0Var);
                        break;
                    case 258:
                        m197730d(1);
                        break;
                    case 259:
                        m197730d(2);
                        break;
                    default:
                        Log.e("LicenseValidator", "Unknown response code for license check.");
                        m197731e();
                        break;
                }
                return;
            }
        }
        m197732f(this.f180871f.mo176516a(str3), hxc0Var);
    }
}

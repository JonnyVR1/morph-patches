package p153l;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes7.dex */
public class xdr {

    /* JADX INFO: renamed from: a */
    public final oi80 f193621a;

    /* JADX INFO: renamed from: b */
    public final wdr f193622b;

    /* JADX INFO: renamed from: c */
    public final int f193623c;

    /* JADX INFO: renamed from: d */
    public final String f193624d;

    /* JADX INFO: renamed from: e */
    public final String f193625e;

    /* JADX INFO: renamed from: f */
    public final d0e f193626f;

    public xdr(oi80 oi80Var, d0e d0eVar, wdr wdrVar, int i, String str, String str2) {
        this.f193621a = oi80Var;
        this.f193626f = d0eVar;
        this.f193622b = wdrVar;
        this.f193623c = i;
        this.f193624d = str;
        this.f193625e = str2;
    }

    /* JADX INFO: renamed from: a */
    public wdr m210472a() {
        return this.f193622b;
    }

    /* JADX INFO: renamed from: b */
    public int m210473b() {
        return this.f193623c;
    }

    /* JADX INFO: renamed from: c */
    public String m210474c() {
        return this.f193624d;
    }

    /* JADX INFO: renamed from: d */
    public final void m210475d(int i) {
        this.f193622b.mo82702c(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m210476e() {
        this.f193622b.mo82701b(561);
    }

    /* JADX INFO: renamed from: f */
    public final void m210477f(int i, l5d0 l5d0Var) {
        this.f193621a.mo161039a(i, l5d0Var);
        boolean zMo161040b = this.f193621a.mo161040b();
        wdr wdrVar = this.f193622b;
        if (zMo161040b) {
            wdrVar.mo82700a(i);
        } else {
            wdrVar.mo82701b(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m210478g(PublicKey publicKey, int i, String str, String str2) {
        l5d0 l5d0Var;
        String str3;
        if (str == null) {
            m210476e();
            return;
        }
        if (i == 0 || i == 1 || i == 2) {
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (!signature.verify(ne2.m162807a(str2))) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    m210476e();
                    return;
                }
                try {
                    l5d0 l5d0VarM152931a = l5d0.m152931a(str);
                    if (l5d0VarM152931a.f130096a != i) {
                        Log.e("LicenseValidator", "Response codes don't match.");
                        m210476e();
                        return;
                    }
                    if (l5d0VarM152931a.f130097b != this.f193623c) {
                        Log.e("LicenseValidator", "Nonce doesn't match.");
                        m210476e();
                        return;
                    }
                    if (!l5d0VarM152931a.f130098c.equals(this.f193624d)) {
                        Log.e("LicenseValidator", "Package name doesn't match.");
                        m210476e();
                        return;
                    } else {
                        if (!l5d0VarM152931a.f130099d.equals(this.f193625e)) {
                            Log.e("LicenseValidator", "Version codes don't match.");
                            m210476e();
                            return;
                        }
                        String str4 = l5d0VarM152931a.f130100e;
                        if (TextUtils.isEmpty(str4)) {
                            Log.e("LicenseValidator", "User identifier is empty.");
                            m210476e();
                            return;
                        } else {
                            l5d0Var = l5d0VarM152931a;
                            str3 = str4;
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    Log.e("LicenseValidator", "Could not parse response.");
                    m210476e();
                    return;
                }
            } catch (Base64DecoderException unused2) {
                Log.e("LicenseValidator", "Could not Base64-decode signature.");
                m210476e();
                return;
            } catch (InvalidKeyException unused3) {
                m210475d(5);
                return;
            } catch (NoSuchAlgorithmException e) {
                iig0.m140070a(e);
                return;
            } catch (SignatureException e2) {
                iig0.m140070a(e2);
                return;
            }
        } else {
            str3 = null;
            l5d0Var = null;
        }
        if (i != 0) {
            if (i == 1) {
                m210477f(561, l5d0Var);
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    m210475d(3);
                    return;
                }
                if (i == 4) {
                    m210477f(291, l5d0Var);
                    return;
                }
                if (i == 5) {
                    m210477f(291, l5d0Var);
                    return;
                }
                switch (i) {
                    case 257:
                        m210477f(291, l5d0Var);
                        break;
                    case 258:
                        m210475d(1);
                        break;
                    case 259:
                        m210475d(2);
                        break;
                    default:
                        Log.e("LicenseValidator", "Unknown response code for license check.");
                        m210476e();
                        break;
                }
                return;
            }
        }
        m210477f(this.f193626f.mo113388a(str3), l5d0Var);
    }
}

package org.eclipse.jetty.util.security;

import java.io.Serializable;
import java.security.MessageDigest;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Credential implements Serializable {
    private static final Logger LOG = Log.getLogger((Class<?>) Credential.class);
    private static final long serialVersionUID = -7760551052768181572L;

    public static class Crypt extends Credential {
        public static final String __TYPE = "CRYPT:";
        private static final long serialVersionUID = -2027792997664744210L;
        private final String _cooked;

        public Crypt(String str) {
            this._cooked = str.startsWith(__TYPE) ? str.substring(6) : str;
        }

        public static String crypt(String str, String str2) {
            return __TYPE + UnixCrypt.crypt(str2, str);
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            if (!(obj instanceof String) && !(obj instanceof Password)) {
                Credential.LOG.warn("Can't check " + obj.getClass() + " against CRYPT", new Object[0]);
            }
            String string = obj.toString();
            String str = this._cooked;
            return str.equals(UnixCrypt.crypt(string, str));
        }
    }

    public static class MD5 extends Credential {
        public static final String __TYPE = "MD5:";
        private static MessageDigest __md = null;
        public static final Object __md5Lock = new Object();
        private static final long serialVersionUID = 5533846540822684240L;
        private final byte[] _digest;

        public MD5(String str) {
            this._digest = TypeUtil.parseBytes(str.startsWith(__TYPE) ? str.substring(4) : str, 16);
        }

        public static String digest(String str) {
            byte[] bArrDigest;
            try {
                synchronized (__md5Lock) {
                    if (__md == null) {
                        try {
                            __md = MessageDigest.getInstance("MD5");
                        } catch (Exception e) {
                            Credential.LOG.warn(e);
                            return null;
                        }
                    }
                    __md.reset();
                    __md.update(str.getBytes("ISO-8859-1"));
                    bArrDigest = __md.digest();
                }
                return __TYPE + TypeUtil.toString(bArrDigest, 16);
            } catch (Exception e2) {
                Credential.LOG.warn(e2);
                return null;
            }
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            byte[] bArrDigest;
            try {
                if (obj instanceof char[]) {
                    obj = new String((char[]) obj);
                }
                if (!(obj instanceof Password) && !(obj instanceof String)) {
                    if (!(obj instanceof MD5)) {
                        if (obj instanceof Credential) {
                            return ((Credential) obj).check(this);
                        }
                        Credential.LOG.warn("Can't check " + obj.getClass() + " against MD5", new Object[0]);
                        return false;
                    }
                    MD5 md5 = (MD5) obj;
                    if (this._digest.length != md5._digest.length) {
                        return false;
                    }
                    int i = 0;
                    while (true) {
                        byte[] bArr = this._digest;
                        if (i >= bArr.length) {
                            return true;
                        }
                        if (bArr[i] != md5._digest[i]) {
                            return false;
                        }
                        i++;
                    }
                }
                synchronized (__md5Lock) {
                    try {
                        if (__md == null) {
                            __md = MessageDigest.getInstance("MD5");
                        }
                        __md.reset();
                        __md.update(obj.toString().getBytes("ISO-8859-1"));
                        bArrDigest = __md.digest();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bArrDigest != null && bArrDigest.length == this._digest.length) {
                    for (int i2 = 0; i2 < bArrDigest.length; i2++) {
                        if (bArrDigest[i2] != this._digest[i2]) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Exception e) {
                Credential.LOG.warn(e);
                return false;
            }
        }

        public byte[] getDigest() {
            return this._digest;
        }
    }

    public static Credential getCredential(String str) {
        if (str.startsWith(Crypt.__TYPE)) {
            return new Crypt(str);
        }
        return str.startsWith(MD5.__TYPE) ? new MD5(str) : new Password(str);
    }

    public abstract boolean check(Object obj);
}

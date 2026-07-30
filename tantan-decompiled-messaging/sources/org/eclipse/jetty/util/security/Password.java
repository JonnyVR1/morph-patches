package org.eclipse.jetty.util.security;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class Password extends Credential {
    private static final Logger LOG = Log.getLogger((Class<?>) Password.class);
    public static final String __OBFUSCATE = "OBF:";
    private static final long serialVersionUID = 5062906681431569445L;
    private String _pw;

    public Password(String str) {
        this._pw = str;
        while (true) {
            String str2 = this._pw;
            if (str2 == null || !str2.startsWith(__OBFUSCATE)) {
                return;
            } else {
                this._pw = deobfuscate(this._pw);
            }
        }
    }

    public static String deobfuscate(String str) {
        if (str.startsWith(__OBFUSCATE)) {
            str = str.substring(4);
        }
        byte[] bArr = new byte[str.length() / 2];
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 4;
            int i4 = Integer.parseInt(str.substring(i, i3), 36);
            bArr[i2] = (byte) ((((i4 / 256) + (i4 % 256)) - 254) / 2);
            i = i3;
            i2++;
        }
        return new String(bArr, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d A[PHI: r4
      0x000d: PHI (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v1 java.lang.String) binds: [B:23:0x0060, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    public static Password getPassword(String str, String str2, String str3) {
        String property = System.getProperty(str, str2);
        if (property == null || property.length() == 0) {
            try {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((str3 == null || str3.length() <= 0) ? "" : " [dft]");
                sb.append(" : ");
                printStream.print(sb.toString());
                System.out.flush();
                byte[] bArr = new byte[512];
                int i = System.in.read(bArr);
                if (i > 0) {
                    property = new String(bArr, 0, i).trim();
                }
            } catch (IOException e) {
                LOG.warn(Log.EXCEPTION, e);
            }
            if (property != null && property.length() != 0) {
                str3 = property;
            }
        } else {
            str3 = property;
        }
        return new Password(str3);
    }

    public static void main(String[] strArr) {
        if (strArr.length != 1 && strArr.length != 2) {
            System.err.println("Usage - java org.eclipse.jetty.security.Password [<user>] <password>");
            System.err.println("If the password is ?, the user will be prompted for the password");
            System.exit(1);
        }
        String str = strArr[strArr.length == 1 ? (char) 0 : (char) 1];
        Password password = new Password(str);
        System.err.println(password.toString());
        System.err.println(obfuscate(password.toString()));
        System.err.println(Credential.MD5.digest(str));
        if (strArr.length == 2) {
            System.err.println(Credential.Crypt.crypt(strArr[0], password.toString()));
        }
    }

    public static String obfuscate(String str) {
        StringBuilder sb = new StringBuilder(__OBFUSCATE);
        byte[] bytes = str.getBytes();
        int i = 0;
        while (i < bytes.length) {
            byte b = bytes[i];
            i++;
            byte b2 = bytes[str.length() - i];
            int i2 = b + 127;
            String string = Integer.toString(((i2 + b2) * 256) + (i2 - b2), 36);
            int length = string.length();
            if (length == 1) {
                sb.append("000");
                sb.append(string);
            } else if (length == 2) {
                sb.append("00");
                sb.append(string);
            } else if (length != 3) {
                sb.append(string);
            } else {
                sb.append('0');
                sb.append(string);
            }
        }
        return sb.toString();
    }

    @Override // org.eclipse.jetty.util.security.Credential
    public boolean check(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Password) {
            return obj.equals(this._pw);
        }
        if (obj instanceof String) {
            return obj.equals(this._pw);
        }
        if (obj instanceof char[]) {
            return Arrays.equals(this._pw.toCharArray(), (char[]) obj);
        }
        if (obj instanceof Credential) {
            return ((Credential) obj).check(this._pw);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Password) {
            Object obj2 = ((Password) obj)._pw;
            String str = this._pw;
            return obj2 == str || (str != null && str.equals(obj2));
        }
        if (obj instanceof String) {
            return obj.equals(this._pw);
        }
        return false;
    }

    public int hashCode() {
        String str = this._pw;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public String toStarString() {
        return "*****************************************************".substring(0, this._pw.length());
    }

    public String toString() {
        return this._pw;
    }
}

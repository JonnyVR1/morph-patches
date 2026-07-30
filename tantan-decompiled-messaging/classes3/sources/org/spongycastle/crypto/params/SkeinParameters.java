package org.spongycastle.crypto.params;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import l.ig3;
import l.rkq0;
import org.eclipse.jetty.util.StringUtil;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.util.Integers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SkeinParameters implements CipherParameters {
    public static final int PARAM_TYPE_CONFIG = 4;
    public static final int PARAM_TYPE_KEY = 0;
    public static final int PARAM_TYPE_KEY_IDENTIFIER = 16;
    public static final int PARAM_TYPE_MESSAGE = 48;
    public static final int PARAM_TYPE_NONCE = 20;
    public static final int PARAM_TYPE_OUTPUT = 63;
    public static final int PARAM_TYPE_PERSONALISATION = 8;
    public static final int PARAM_TYPE_PUBLIC_KEY = 12;
    private Hashtable parameters;

    public SkeinParameters() {
        this(new Hashtable());
    }

    public byte[] getKey() {
        return (byte[]) this.parameters.get(Integers.valueOf(0));
    }

    public byte[] getKeyIdentifier() {
        return (byte[]) this.parameters.get(Integers.valueOf(16));
    }

    public byte[] getNonce() {
        return (byte[]) this.parameters.get(Integers.valueOf(20));
    }

    public Hashtable getParameters() {
        return this.parameters;
    }

    public byte[] getPersonalisation() {
        return (byte[]) this.parameters.get(Integers.valueOf(8));
    }

    public byte[] getPublicKey() {
        return (byte[]) this.parameters.get(Integers.valueOf(12));
    }

    private SkeinParameters(Hashtable hashtable) {
        this.parameters = hashtable;
    }

    public static class Builder {
        private Hashtable parameters = new Hashtable();

        public Builder(SkeinParameters skeinParameters) {
            Enumeration enumerationKeys = skeinParameters.parameters.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                this.parameters.put(num, skeinParameters.parameters.get(num));
            }
        }

        public SkeinParameters build() {
            return new SkeinParameters(this.parameters);
        }

        public Builder set(int i, byte[] bArr) {
            if (bArr == null) {
                ig3.a("Parameter value must not be null.");
                return null;
            }
            if (i != 0 && (i <= 4 || i >= 63 || i == 48)) {
                ig3.a("Parameter types must be in the range 0,5..47,49..62.");
                return null;
            }
            if (i != 4) {
                this.parameters.put(Integers.valueOf(i), bArr);
                return this;
            }
            ig3.a("Parameter type 4 is reserved for internal use.");
            return null;
        }

        public Builder setKey(byte[] bArr) {
            return set(0, bArr);
        }

        public Builder setKeyIdentifier(byte[] bArr) {
            return set(16, bArr);
        }

        public Builder setNonce(byte[] bArr) {
            return set(20, bArr);
        }

        public Builder setPersonalisation(Date date, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StringUtil.__UTF8);
                outputStreamWriter.write(new SimpleDateFormat("YYYYMMDD").format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                rkq0.a("Byte I/O failed: ", e);
                return null;
            }
        }

        public Builder setPublicKey(byte[] bArr) {
            return set(12, bArr);
        }

        public Builder(Hashtable hashtable) {
            Enumeration enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                this.parameters.put(num, hashtable.get(num));
            }
        }

        public Builder() {
        }

        public Builder setPersonalisation(byte[] bArr) {
            return set(8, bArr);
        }

        public Builder setPersonalisation(Date date, Locale locale, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StringUtil.__UTF8);
                outputStreamWriter.write(new SimpleDateFormat("YYYYMMDD", locale).format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                rkq0.a("Byte I/O failed: ", e);
                return null;
            }
        }
    }
}

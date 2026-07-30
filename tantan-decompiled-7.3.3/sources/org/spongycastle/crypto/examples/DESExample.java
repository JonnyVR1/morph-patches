package org.spongycastle.crypto.examples;

import com.clevertap.android.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.generators.DESedeKeyGenerator;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class DESExample {
    private PaddedBufferedBlockCipher cipher;
    private boolean encrypt;

    /* JADX INFO: renamed from: in */
    private BufferedInputStream f207521in;
    private byte[] key;
    private BufferedOutputStream out;

    public DESExample(String str, String str2, String str3, boolean z) {
        SecureRandom secureRandom;
        SecureRandom secureRandom2 = null;
        this.cipher = null;
        this.f207521in = null;
        this.out = null;
        this.key = null;
        this.encrypt = z;
        try {
            this.f207521in = new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            System.err.println("Input file not found [" + str + Constants.AES_SUFFIX);
            System.exit(1);
        }
        try {
            this.out = new BufferedOutputStream(new FileOutputStream(str2));
        } catch (IOException unused2) {
            System.err.println("Output file not created [" + str2 + Constants.AES_SUFFIX);
            System.exit(1);
        }
        if (!z) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str3));
                int iAvailable = bufferedInputStream.available();
                byte[] bArr = new byte[iAvailable];
                bufferedInputStream.read(bArr, 0, iAvailable);
                this.key = Hex.decode(bArr);
                return;
            } catch (IOException unused3) {
                System.err.println("Decryption key file not found, or not valid [" + str3 + Constants.AES_SUFFIX);
                System.exit(1);
                return;
            }
        }
        try {
            secureRandom = new SecureRandom();
            try {
                secureRandom.setSeed("www.bouncycastle.org".getBytes());
            } catch (Exception unused4) {
                secureRandom2 = secureRandom;
                try {
                    System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
                    System.exit(1);
                    secureRandom = secureRandom2;
                } catch (IOException unused5) {
                    System.err.println("Could not decryption create key file [" + str3 + Constants.AES_SUFFIX);
                    System.exit(1);
                    return;
                }
            }
        } catch (Exception unused6) {
        }
        KeyGenerationParameters keyGenerationParameters = new KeyGenerationParameters(secureRandom, 192);
        DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
        dESedeKeyGenerator.init(keyGenerationParameters);
        this.key = dESedeKeyGenerator.generateKey();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
        byte[] bArrEncode = Hex.encode(this.key);
        bufferedOutputStream.write(bArrEncode, 0, bArrEncode.length);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public static void main(String[] strArr) {
        String str;
        boolean z = true;
        if (strArr.length < 2) {
            new DESExample();
            System.err.println("Usage: java " + DESExample.class.getName() + " infile outfile [keyfile]");
            System.exit(1);
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        if (strArr.length > 2) {
            str = strArr[2];
            z = false;
        } else {
            str = "deskey.dat";
        }
        new DESExample(str2, str3, str, z).process();
    }

    private void performDecrypt(byte[] bArr) {
        this.cipher.init(false, new KeyParameter(bArr));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f207521in));
        byte[] bArr2 = null;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                byte[] bArrDecode = Hex.decode(line);
                byte[] bArr3 = new byte[this.cipher.getOutputSize(bArrDecode.length)];
                int iProcessBytes = this.cipher.processBytes(bArrDecode, 0, bArrDecode.length, bArr3, 0);
                if (iProcessBytes > 0) {
                    this.out.write(bArr3, 0, iProcessBytes);
                }
                bArr2 = bArr3;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        int iDoFinal = this.cipher.doFinal(bArr2, 0);
        if (iDoFinal > 0) {
            this.out.write(bArr2, 0, iDoFinal);
        }
    }

    private void performEncrypt(byte[] bArr) {
        PaddedBufferedBlockCipher paddedBufferedBlockCipher;
        this.cipher.init(true, new KeyParameter(bArr));
        byte[] bArr2 = new byte[47];
        byte[] bArr3 = new byte[this.cipher.getOutputSize(47)];
        while (true) {
            try {
                int i = this.f207521in.read(bArr2, 0, 47);
                paddedBufferedBlockCipher = this.cipher;
                if (i <= 0) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                int iProcessBytes = paddedBufferedBlockCipher.processBytes(bArr2, 0, i, bArr3, 0);
                if (iProcessBytes > 0) {
                    byte[] bArrEncode = Hex.encode(bArr3, 0, iProcessBytes);
                    this.out.write(bArrEncode, 0, bArrEncode.length);
                    this.out.write(10);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        int iDoFinal = paddedBufferedBlockCipher.doFinal(bArr3, 0);
        if (iDoFinal > 0) {
            byte[] bArrEncode2 = Hex.encode(bArr3, 0, iDoFinal);
            this.out.write(bArrEncode2, 0, bArrEncode2.length);
            this.out.write(10);
        }
    }

    private void process() {
        this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()));
        boolean z = this.encrypt;
        byte[] bArr = this.key;
        if (z) {
            performEncrypt(bArr);
        } else {
            performDecrypt(bArr);
        }
        try {
            this.f207521in.close();
            this.out.flush();
            this.out.close();
        } catch (IOException unused) {
        }
    }

    public DESExample() {
        this.encrypt = true;
        this.cipher = null;
        this.f207521in = null;
        this.out = null;
        this.key = null;
    }
}

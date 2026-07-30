package org.spongycastle.crypto.generators;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.gms.common.api.Api;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.eclipse.jetty.http.HttpStatus;
import org.java_websocket.WebSocket;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.spongycastle.crypto.params.NaccacheSternKeyParameters;
import org.spongycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* JADX INFO: loaded from: classes3.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 149, 151, 157, 163, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 181, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 193, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNONNULL, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, HttpStatus.TEMPORARY_REDIRECT_307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, WebSocket.DEFAULT_WSS_PORT, 449, 457, 461, 463, 467, 479, 487, 491, 499, HttpStatus.SERVICE_UNAVAILABLE_503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger = new BigInteger(i, i2, secureRandom);
        while (bigInteger.bitLength() != i) {
            bigInteger = new BigInteger(i, i2, secureRandom);
        }
        return bigInteger;
    }

    private static int getInt(SecureRandom secureRandom, int i) {
        int iNextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((((long) i) * ((long) (secureRandom.nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i2 = iNextInt % i;
        } while ((iNextInt - i2) + (i - 1) < 0);
        return i2;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        vector3.removeElementAt(0);
        while (vector3.size() != 0) {
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
            vector3.removeElementAt(0);
        }
        return vector2;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigIntegerAdd2;
        boolean z;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        long j;
        BigInteger bigIntegerMod;
        BigInteger bigInteger5;
        int i;
        BigInteger bigInteger6;
        int i2;
        SecureRandom secureRandom;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply = ONE;
        BigInteger bigIntegerMultiply2 = bigIntegerMultiply;
        for (int i3 = 0; i3 < vectorPermuteList.size() / 2; i3++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(i3));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply = bigIntegerMultiply.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2.multiply(bigIntegerMultiply);
        int iBitLength = (((strength - bigIntegerMultiply3.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply2).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply).shiftLeft(1);
        long j2 = 0;
        while (true) {
            j2++;
            int i4 = 24;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    bigIntegerGeneratePrime2 = generatePrime(i4, certainty, random);
                    if (!bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2)) {
                        BigInteger bigIntegerMultiply4 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                        bigInteger = bigIntegerShiftLeft2;
                        bigInteger2 = ONE;
                        bigIntegerAdd2 = bigIntegerMultiply4.add(bigInteger2);
                        if (bigIntegerAdd2.isProbablePrime(certainty)) {
                            break;
                        }
                        bigIntegerShiftLeft2 = bigInteger;
                        i4 = 24;
                    }
                }
                z = zIsDebug;
                if (!bigIntegerMultiply3.gcd(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2)).equals(bigInteger2)) {
                    continue;
                } else {
                    if (bigIntegerAdd.multiply(bigIntegerAdd2).bitLength() >= strength) {
                        break;
                    }
                    if (z) {
                        System.out.println("key size too small. Should be " + strength + " but is actually " + bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                    }
                }
            } else {
                bigInteger = bigIntegerShiftLeft2;
                z = zIsDebug;
            }
            bigIntegerShiftLeft2 = bigInteger;
            zIsDebug = z;
        }
        if (z) {
            System.out.println("needed " + j2 + " tries to generate p and q.");
        }
        BigInteger bigIntegerMultiply5 = bigIntegerAdd.multiply(bigIntegerAdd2);
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger2).multiply(bigIntegerAdd2.subtract(bigInteger2));
        if (z) {
            System.out.println("generating g");
        }
        long j3 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger3 = bigIntegerAdd;
            bigInteger4 = bigIntegerAdd2;
            j = j3;
            int i5 = 0;
            while (i5 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i5));
                while (true) {
                    j++;
                    i = i5;
                    bigInteger6 = new BigInteger(strength, certainty, random);
                    i2 = strength;
                    secureRandom = random;
                    if (bigInteger6.modPow(bigIntegerDivide, bigIntegerMultiply5).equals(ONE)) {
                        i5 = i;
                        strength = i2;
                        random = secureRandom;
                    }
                }
                vector.addElement(bigInteger6);
                i5 = i + 1;
                strength = i2;
                random = secureRandom;
            }
            int i6 = strength;
            SecureRandom secureRandom2 = random;
            bigIntegerMod = ONE;
            for (int i7 = 0; i7 < vectorPermuteList.size(); i7++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i7)).modPow(bigIntegerMultiply3.divide((BigInteger) vectorPermuteList.elementAt(i7)), bigIntegerMultiply5)).mod(bigIntegerMultiply5);
            }
            int i8 = 0;
            while (true) {
                if (i8 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply5);
                    BigInteger bigInteger7 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger7)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply5).equals(bigInteger7)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply5).equals(bigInteger7)) {
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime3), bigIntegerMultiply5).equals(bigInteger7)) {
                                    bigInteger5 = bigIntegerGeneratePrime4;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger5), bigIntegerMultiply5).equals(bigInteger7)) {
                                        break;
                                    }
                                    if (!z) {
                                        break;
                                    }
                                    System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    break;
                                }
                                if (z) {
                                    System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                }
                            } else if (z) {
                                System.out.println("g has order phi(n)/q'\n g: " + bigIntegerMod);
                            }
                        } else if (z) {
                            System.out.println("g has order phi(n)/p'\n g: " + bigIntegerMod);
                        }
                    } else if (z) {
                        System.out.println("g has order phi(n)/4\n g:" + bigIntegerMod);
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i8)), bigIntegerMultiply5).equals(ONE)) {
                    i8++;
                } else if (z) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i8) + "\n g: " + bigIntegerMod);
                }
                bigInteger5 = bigIntegerGeneratePrime4;
                break;
            }
            bigIntegerGeneratePrime4 = bigInteger5;
            j3 = j;
            bigIntegerAdd2 = bigInteger4;
            bigIntegerAdd = bigInteger3;
            strength = i6;
            random = secureRandom2;
        }
        if (z) {
            System.out.println("needed " + j + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply3 + " (" + bigIntegerMultiply3.bitLength() + " bits)");
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("a:.......... ");
            sb.append(bigIntegerGeneratePrime3);
            printStream.println(sb.toString());
            System.out.println("b:.......... " + bigInteger5);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigInteger3);
            System.out.println("q:.......... " + bigInteger4);
            System.out.println("n:.......... " + bigIntegerMultiply5);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}

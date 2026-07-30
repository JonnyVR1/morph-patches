package net.jpountz.lz4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;
import org.eclipse.jetty.http.HttpTokens;
import p149l.shg0;
import p149l.y9g0;

/* JADX INFO: loaded from: classes2.dex */
public final class LZ4Factory {
    private static LZ4Factory JAVA_SAFE_INSTANCE;
    private static LZ4Factory JAVA_UNSAFE_INSTANCE;
    private static LZ4Factory NATIVE_INSTANCE;
    private final LZ4Compressor fastCompressor;
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4Compressor highCompressor;
    private final LZ4Compressor[] highCompressors;
    private final String impl;
    private final LZ4SafeDecompressor safeDecompressor;

    private LZ4Factory(String str) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LZ4Compressor[] lZ4CompressorArr = new LZ4Compressor[18];
        this.highCompressors = lZ4CompressorArr;
        this.impl = str;
        this.fastCompressor = (LZ4Compressor) classInstance("net.jpountz.lz4.LZ4" + str + "Compressor");
        LZ4Compressor lZ4Compressor = (LZ4Compressor) classInstance("net.jpountz.lz4.LZ4HC" + str + "Compressor");
        this.highCompressor = lZ4Compressor;
        this.fastDecompressor = (LZ4FastDecompressor) classInstance("net.jpountz.lz4.LZ4" + str + "FastDecompressor");
        this.safeDecompressor = (LZ4SafeDecompressor) classInstance("net.jpountz.lz4.LZ4" + str + "SafeDecompressor");
        Constructor<?> declaredConstructor = lZ4Compressor.getClass().getDeclaredConstructor(Integer.TYPE);
        lZ4CompressorArr[9] = lZ4Compressor;
        for (int i = 1; i <= 17; i++) {
            if (i != 9) {
                this.highCompressors[i] = (LZ4Compressor) declaredConstructor.newInstance(Integer.valueOf(i));
            }
        }
        byte[] bArr = {97, 98, 99, 100, HttpTokens.SPACE, HttpTokens.SPACE, HttpTokens.SPACE, HttpTokens.SPACE, HttpTokens.SPACE, HttpTokens.SPACE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
        for (LZ4Compressor lZ4Compressor2 : Arrays.asList(this.fastCompressor, this.highCompressor)) {
            int iMaxCompressedLength = lZ4Compressor2.maxCompressedLength(20);
            byte[] bArr2 = new byte[iMaxCompressedLength];
            int iCompress = lZ4Compressor2.compress(bArr, 0, 20, bArr2, 0, iMaxCompressedLength);
            byte[] bArr3 = new byte[20];
            this.fastDecompressor.decompress(bArr2, 0, bArr3, 0, 20);
            if (!Arrays.equals(bArr, bArr3)) {
                shg0.m184191a();
                throw null;
            }
            Arrays.fill(bArr3, (byte) 0);
            if (this.safeDecompressor.decompress(bArr2, 0, iCompress, bArr3, 0) != 20 || !Arrays.equals(bArr, bArr3)) {
                shg0.m184191a();
                throw null;
            }
        }
    }

    private static <T> T classInstance(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static LZ4Factory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    private static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    public static void main(String[] strArr) {
        System.out.println("Fastest instance is " + fastestInstance());
        System.out.println("Fastest Java instance is " + fastestJavaInstance());
    }

    public static synchronized LZ4Factory nativeInstance() {
        try {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
        } catch (Throwable th) {
            throw th;
        }
        return NATIVE_INSTANCE;
    }

    public static synchronized LZ4Factory safeInstance() {
        try {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
        } catch (Throwable th) {
            throw th;
        }
        return JAVA_SAFE_INSTANCE;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        try {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
        } catch (Throwable th) {
            throw th;
        }
        return JAVA_UNSAFE_INSTANCE;
    }

    public LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public LZ4Compressor highCompressor(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.highCompressors[i];
    }

    public LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    public String toString() {
        return LZ4Factory.class.getSimpleName() + ":" + this.impl;
    }

    public LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public LZ4Compressor highCompressor() {
        return this.highCompressor;
    }
}

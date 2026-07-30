package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p149l.AbstractC18156l7;
import p149l.AbstractC21642z6;
import p149l.kwk;
import p149l.sf80;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
final class MessageDigestHashFunction extends AbstractC18156l7 implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        private SerializedForm(String str, int i, String str2) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.MessageDigestHashFunction$b */
    public static final class C2998b extends AbstractC21642z6 {

        /* JADX INFO: renamed from: b */
        public final MessageDigest f11227b;

        /* JADX INFO: renamed from: c */
        public final int f11228c;

        /* JADX INFO: renamed from: d */
        public boolean f11229d;

        public C2998b(MessageDigest messageDigest, int i) {
            this.f11227b = messageDigest;
            this.f11228c = i;
        }

        @Override // p149l.kwk
        public HashCode hash() {
            m16340p();
            this.f11229d = true;
            int i = this.f11228c;
            int digestLength = this.f11227b.getDigestLength();
            MessageDigest messageDigest = this.f11227b;
            return i == digestLength ? HashCode.fromBytesNoCopy(messageDigest.digest()) : HashCode.fromBytesNoCopy(Arrays.copyOf(messageDigest.digest(), this.f11228c));
        }

        @Override // p149l.AbstractC21642z6
        /* JADX INFO: renamed from: l */
        public void mo16330l(byte b) {
            m16340p();
            this.f11227b.update(b);
        }

        @Override // p149l.AbstractC21642z6
        /* JADX INFO: renamed from: m */
        public void mo16339m(ByteBuffer byteBuffer) {
            m16340p();
            this.f11227b.update(byteBuffer);
        }

        @Override // p149l.AbstractC21642z6
        /* JADX INFO: renamed from: o */
        public void mo16331o(byte[] bArr, int i, int i2) {
            m16340p();
            this.f11227b.update(bArr, i, i2);
        }

        /* JADX INFO: renamed from: p */
        public final void m16340p() {
            sf80.m183901w(!this.f11229d, "Cannot re-use a Hasher after calling hash() on it");
        }
    }

    public MessageDigestHashFunction(String str, int i, String str2) {
        this.toString = (String) sf80.m183894p(str2);
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        sf80.m183885g(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.bytes = i;
        this.supportsClone = supportsClone(messageDigest);
    }

    private static MessageDigest getMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    private static boolean supportsClone(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public int bits() {
        return this.bytes * 8;
    }

    @Override // p149l.cwk
    public kwk newHasher() {
        if (this.supportsClone) {
            try {
                return new C2998b((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C2998b(getMessageDigest(this.prototype.getAlgorithm()), this.bytes);
    }

    public String toString() {
        return this.toString;
    }

    public Object writeReplace() {
        return new SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString);
    }

    public MessageDigestHashFunction(String str, String str2) {
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        this.bytes = messageDigest.getDigestLength();
        this.toString = (String) sf80.m183894p(str2);
        this.supportsClone = supportsClone(messageDigest);
    }
}

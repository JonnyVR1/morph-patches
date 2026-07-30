package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p153l.AbstractC17172g7;
import p153l.AbstractC21030w6;
import p153l.azk;
import p153l.gig0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class MessageDigestHashFunction extends AbstractC17172g7 implements Serializable {
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
    public static final class C3021b extends AbstractC21030w6 {

        /* JADX INFO: renamed from: b */
        public final MessageDigest f11264b;

        /* JADX INFO: renamed from: c */
        public final int f11265c;

        /* JADX INFO: renamed from: d */
        public boolean f11266d;

        public C3021b(MessageDigest messageDigest, int i) {
            this.f11264b = messageDigest;
            this.f11265c = i;
        }

        @Override // p153l.azk
        /* JADX INFO: renamed from: e */
        public HashCode mo16384e() {
            m16395q();
            this.f11266d = true;
            int i = this.f11265c;
            int digestLength = this.f11264b.getDigestLength();
            MessageDigest messageDigest = this.f11264b;
            return i == digestLength ? HashCode.fromBytesNoCopy(messageDigest.digest()) : HashCode.fromBytesNoCopy(Arrays.copyOf(messageDigest.digest(), this.f11265c));
        }

        @Override // p153l.AbstractC21030w6
        /* JADX INFO: renamed from: m */
        public void mo16385m(byte b) {
            m16395q();
            this.f11264b.update(b);
        }

        @Override // p153l.AbstractC21030w6
        /* JADX INFO: renamed from: n */
        public void mo16394n(ByteBuffer byteBuffer) {
            m16395q();
            this.f11264b.update(byteBuffer);
        }

        @Override // p153l.AbstractC21030w6
        /* JADX INFO: renamed from: p */
        public void mo16386p(byte[] bArr, int i, int i2) {
            m16395q();
            this.f11264b.update(bArr, i, i2);
        }

        /* JADX INFO: renamed from: q */
        public final void m16395q() {
            xn80.m212118w(!this.f11266d, "Cannot re-use a Hasher after calling hash() on it");
        }
    }

    public MessageDigestHashFunction(String str, int i, String str2) {
        this.toString = (String) xn80.m212111p(str2);
        MessageDigest messageDigest = getMessageDigest(str);
        this.prototype = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        xn80.m212102g(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.bytes = i;
        this.supportsClone = supportsClone(messageDigest);
    }

    private static MessageDigest getMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            gig0.m130323a(e);
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

    @Override // p153l.syk
    public azk newHasher() {
        if (this.supportsClone) {
            try {
                return new C3021b((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C3021b(getMessageDigest(this.prototype.getAlgorithm()), this.bytes);
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
        this.toString = (String) xn80.m212111p(str2);
        this.supportsClone = supportsClone(messageDigest);
    }
}

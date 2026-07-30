package com.google.common.hash;

import java.io.Serializable;
import java.util.zip.Checksum;
import p149l.AbstractC18156l7;
import p149l.AbstractC21642z6;
import p149l.kwk;
import p149l.sf80;
import p149l.zkm;

/* JADX INFO: loaded from: classes7.dex */
final class ChecksumHashFunction extends AbstractC18156l7 implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final zkm<? extends Checksum> checksumSupplier;
    private final String toString;

    /* JADX INFO: renamed from: com.google.common.hash.ChecksumHashFunction$b */
    public final class C2987b extends AbstractC21642z6 {

        /* JADX INFO: renamed from: b */
        public final Checksum f11223b;

        public C2987b(Checksum checksum) {
            this.f11223b = (Checksum) sf80.m183894p(checksum);
        }

        @Override // p149l.kwk
        public HashCode hash() {
            long value = this.f11223b.getValue();
            return ChecksumHashFunction.this.bits == 32 ? HashCode.fromInt((int) value) : HashCode.fromLong(value);
        }

        @Override // p149l.AbstractC21642z6
        /* JADX INFO: renamed from: l */
        public void mo16330l(byte b) {
            this.f11223b.update(b);
        }

        @Override // p149l.AbstractC21642z6
        /* JADX INFO: renamed from: o */
        public void mo16331o(byte[] bArr, int i, int i2) {
            this.f11223b.update(bArr, i, i2);
        }
    }

    public ChecksumHashFunction(zkm<? extends Checksum> zkmVar, int i, String str) {
        this.checksumSupplier = (zkm) sf80.m183894p(zkmVar);
        sf80.m183884f(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.bits = i;
        this.toString = (String) sf80.m183894p(str);
    }

    public int bits() {
        return this.bits;
    }

    @Override // p149l.cwk
    public kwk newHasher() {
        return new C2987b(this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }
}

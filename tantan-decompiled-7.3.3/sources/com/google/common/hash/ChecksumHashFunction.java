package com.google.common.hash;

import java.io.Serializable;
import java.util.zip.Checksum;
import p153l.AbstractC17172g7;
import p153l.AbstractC21030w6;
import p153l.azk;
import p153l.bnm;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class ChecksumHashFunction extends AbstractC17172g7 implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final bnm<? extends Checksum> checksumSupplier;
    private final String toString;

    /* JADX INFO: renamed from: com.google.common.hash.ChecksumHashFunction$b */
    public final class C3010b extends AbstractC21030w6 {

        /* JADX INFO: renamed from: b */
        public final Checksum f11260b;

        public C3010b(Checksum checksum) {
            this.f11260b = (Checksum) xn80.m212111p(checksum);
        }

        @Override // p153l.azk
        /* JADX INFO: renamed from: e */
        public HashCode mo16384e() {
            long value = this.f11260b.getValue();
            return ChecksumHashFunction.this.bits == 32 ? HashCode.fromInt((int) value) : HashCode.fromLong(value);
        }

        @Override // p153l.AbstractC21030w6
        /* JADX INFO: renamed from: m */
        public void mo16385m(byte b) {
            this.f11260b.update(b);
        }

        @Override // p153l.AbstractC21030w6
        /* JADX INFO: renamed from: p */
        public void mo16386p(byte[] bArr, int i, int i2) {
            this.f11260b.update(bArr, i, i2);
        }
    }

    public ChecksumHashFunction(bnm<? extends Checksum> bnmVar, int i, String str) {
        this.checksumSupplier = (bnm) xn80.m212111p(bnmVar);
        xn80.m212101f(i == 32 || i == 64, "bits (%s) must be either 32 or 64", i);
        this.bits = i;
        this.toString = (String) xn80.m212111p(str);
    }

    public int bits() {
        return this.bits;
    }

    @Override // p153l.syk
    public azk newHasher() {
        return new C3010b(this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }
}

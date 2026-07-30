package com.google.common.hash;

import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import p153l.bnm;
import p153l.syk;

/* JADX INFO: loaded from: classes7.dex */
public final class Hashing {

    /* JADX INFO: renamed from: a */
    public static final int f11262a = (int) System.currentTimeMillis();

    public enum ChecksumType implements bnm<Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.hash.Hashing.ChecksumType, p153l.b7h0
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.hash.Hashing.ChecksumType, p153l.b7h0
            public Checksum get() {
                return new Adler32();
            }
        };

        public final syk hashFunction;

        ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }

        @Override // p153l.b7h0
        public abstract /* synthetic */ Object get();
    }

    /* JADX INFO: renamed from: a */
    public static syk m16388a() {
        return Murmur3_128HashFunction.MURMUR3_128;
    }
}

package org.apache.commons.sudcompress.archivers.zip;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Arrays;
import java.util.zip.ZipException;
import p149l.i11;

/* JADX INFO: loaded from: classes2.dex */
public class X0017_StrongEncryptionHeader extends PKWareExtraHeader {
    private PKWareExtraHeader.EncryptionAlgorithm algId;
    private int bitlen;
    private byte[] erdData;
    private int flags;
    private int format;
    private PKWareExtraHeader.HashAlgorithm hashAlg;
    private int hashSize;
    private byte[] ivData;
    private byte[] keyBlob;
    private long rcount;
    private byte[] recipientKeyHash;
    private byte[] vCRC32;
    private byte[] vData;

    public X0017_StrongEncryptionHeader() {
        super(new ZipShort(23));
    }

    private void assertDynamicLengthFits(String str, int i, int i2, int i3) throws ZipException {
        if (i2 + i <= i3) {
            return;
        }
        throw new ZipException("Invalid X0017_StrongEncryptionHeader: " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + " doesn't fit into " + i3 + " bytes of data at position " + i2);
    }

    public PKWareExtraHeader.EncryptionAlgorithm getEncryptionAlgorithm() {
        return this.algId;
    }

    public PKWareExtraHeader.HashAlgorithm getHashAlgorithm() {
        return this.hashAlg;
    }

    public long getRecordCount() {
        return this.rcount;
    }

    public void parseCentralDirectoryFormat(byte[] bArr, int i, int i2) throws ZipException {
        assertMinimalLength(12, i2);
        this.format = ZipShort.getValue(bArr, i);
        this.algId = PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
        this.bitlen = ZipShort.getValue(bArr, i + 4);
        this.flags = ZipShort.getValue(bArr, i + 6);
        long value = ZipLong.getValue(bArr, i + 8);
        this.rcount = value;
        if (value > 0) {
            assertMinimalLength(16, i2);
            this.hashAlg = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 12));
            this.hashSize = ZipShort.getValue(bArr, i + 14);
            for (long j = 0; j < this.rcount; j++) {
                for (int i3 = 0; i3 < this.hashSize; i3++) {
                }
            }
        }
    }

    public void parseFileFormat(byte[] bArr, int i, int i2) throws ZipException {
        assertMinimalLength(4, i2);
        int value = ZipShort.getValue(bArr, i);
        assertDynamicLengthFits("ivSize", value, 4, i2);
        this.ivData = Arrays.copyOfRange(bArr, i + 4, value);
        int i3 = value + 16;
        assertMinimalLength(i3, i2);
        int i4 = i + value;
        this.format = ZipShort.getValue(bArr, i4 + 6);
        this.algId = PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i4 + 8));
        this.bitlen = ZipShort.getValue(bArr, i4 + 10);
        this.flags = ZipShort.getValue(bArr, i4 + 12);
        int value2 = ZipShort.getValue(bArr, i4 + 14);
        assertDynamicLengthFits("erdSize", value2, i3, i2);
        int i5 = i4 + 16;
        this.erdData = Arrays.copyOfRange(bArr, i5, value2);
        int i6 = value + 20 + value2;
        assertMinimalLength(i6, i2);
        long value3 = ZipLong.getValue(bArr, i5 + value2);
        this.rcount = value3;
        if (value3 == 0) {
            assertMinimalLength(i6 + 2, i2);
            int value4 = ZipShort.getValue(bArr, i4 + 20 + value2);
            assertDynamicLengthFits("vSize", value4, value + 22 + value2, i2);
            if (value4 < 4) {
                i11.m133949a("Invalid X0017_StrongEncryptionHeader: vSize ", value4, " is too small to hold CRC");
                return;
            }
            int i7 = i4 + 22 + value2;
            this.vData = Arrays.copyOfRange(bArr, i7, value4 - 4);
            this.vCRC32 = Arrays.copyOfRange(bArr, (i7 + value4) - 4, 4);
            return;
        }
        assertMinimalLength(i6 + 6, i2);
        this.hashAlg = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i4 + 20 + value2));
        int i8 = i4 + 22 + value2;
        this.hashSize = ZipShort.getValue(bArr, i8);
        int i9 = i4 + 24 + value2;
        int value5 = ZipShort.getValue(bArr, i9);
        int i10 = this.hashSize;
        this.recipientKeyHash = new byte[i10];
        if (value5 < i10) {
            throw new ZipException("Invalid X0017_StrongEncryptionHeader: resize " + value5 + " is too small to hold hashSize" + this.hashSize);
        }
        this.keyBlob = new byte[value5 - i10];
        assertDynamicLengthFits("resize", value5, value + 24 + value2, i2);
        System.arraycopy(bArr, i9, this.recipientKeyHash, 0, this.hashSize);
        int i11 = this.hashSize;
        System.arraycopy(bArr, i9 + i11, this.keyBlob, 0, value5 - i11);
        assertMinimalLength(value + 26 + value2 + value5 + 2, i2);
        int value6 = ZipShort.getValue(bArr, i4 + 26 + value2 + value5);
        if (value6 < 4) {
            i11.m133949a("Invalid X0017_StrongEncryptionHeader: vSize ", value6, " is too small to hold CRC");
            return;
        }
        assertDynamicLengthFits("vSize", value6, value + 22 + value2 + value5, i2);
        int i12 = value6 - 4;
        byte[] bArr2 = new byte[i12];
        this.vData = bArr2;
        this.vCRC32 = new byte[4];
        int i13 = i8 + value5;
        System.arraycopy(bArr, i13, bArr2, 0, i12);
        System.arraycopy(bArr, (i13 + value6) - 4, this.vCRC32, 0, 4);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.PKWareExtraHeader, org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        super.parseFromCentralDirectoryData(bArr, i, i2);
        parseCentralDirectoryFormat(bArr, i, i2);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.PKWareExtraHeader, org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        super.parseFromLocalFileData(bArr, i, i2);
        parseFileFormat(bArr, i, i2);
    }
}

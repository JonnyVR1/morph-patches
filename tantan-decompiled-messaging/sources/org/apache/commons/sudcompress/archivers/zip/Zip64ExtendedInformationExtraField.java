package org.apache.commons.sudcompress.archivers.zip;

import java.util.zip.ZipException;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class Zip64ExtendedInformationExtraField implements ZipExtraField {
    private static final String LFH_MUST_HAVE_BOTH_SIZES_MSG = "Zip64 extended information must contain both size values in the local file header.";
    private ZipEightByteInteger compressedSize;
    private ZipLong diskStart;
    private byte[] rawCentralDirectoryData;
    private ZipEightByteInteger relativeHeaderOffset;
    private ZipEightByteInteger size;
    static final ZipShort HEADER_ID = new ZipShort(1);
    private static final byte[] EMPTY = new byte[0];

    public Zip64ExtendedInformationExtraField(ZipEightByteInteger zipEightByteInteger, ZipEightByteInteger zipEightByteInteger2, ZipEightByteInteger zipEightByteInteger3, ZipLong zipLong) {
        this.size = zipEightByteInteger;
        this.compressedSize = zipEightByteInteger2;
        this.relativeHeaderOffset = zipEightByteInteger3;
        this.diskStart = zipLong;
    }

    private int addSizes(byte[] bArr) {
        int i;
        ZipEightByteInteger zipEightByteInteger = this.size;
        if (zipEightByteInteger != null) {
            System.arraycopy(zipEightByteInteger.getBytes(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        ZipEightByteInteger zipEightByteInteger2 = this.compressedSize;
        if (zipEightByteInteger2 == null) {
            return i;
        }
        System.arraycopy(zipEightByteInteger2.getBytes(), 0, bArr, i, 8);
        return i + 8;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        byte[] bArr = new byte[getCentralDirectoryLength().getValue()];
        int iAddSizes = addSizes(bArr);
        ZipEightByteInteger zipEightByteInteger = this.relativeHeaderOffset;
        if (zipEightByteInteger != null) {
            System.arraycopy(zipEightByteInteger.getBytes(), 0, bArr, iAddSizes, 8);
            iAddSizes += 8;
        }
        ZipLong zipLong = this.diskStart;
        if (zipLong != null) {
            System.arraycopy(zipLong.getBytes(), 0, bArr, iAddSizes, 4);
        }
        return bArr;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return new ZipShort((this.size != null ? 8 : 0) + (this.compressedSize != null ? 8 : 0) + (this.relativeHeaderOffset == null ? 0 : 8) + (this.diskStart != null ? 4 : 0));
    }

    public ZipEightByteInteger getCompressedSize() {
        return this.compressedSize;
    }

    public ZipLong getDiskStartNumber() {
        return this.diskStart;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        ZipEightByteInteger zipEightByteInteger = this.size;
        if (zipEightByteInteger == null && this.compressedSize == null) {
            return EMPTY;
        }
        if (zipEightByteInteger == null || this.compressedSize == null) {
            ig3.m135964a(LFH_MUST_HAVE_BOTH_SIZES_MSG);
            return null;
        }
        byte[] bArr = new byte[16];
        addSizes(bArr);
        return bArr;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(this.size != null ? 16 : 0);
    }

    public ZipEightByteInteger getRelativeHeaderOffset() {
        return this.relativeHeaderOffset;
    }

    public ZipEightByteInteger getSize() {
        return this.size;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArr2 = new byte[i2];
        this.rawCentralDirectoryData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (i2 >= 28) {
            parseFromLocalFileData(bArr, i, i2);
            return;
        }
        if (i2 == 24) {
            this.size = new ZipEightByteInteger(bArr, i);
            this.compressedSize = new ZipEightByteInteger(bArr, i + 8);
            this.relativeHeaderOffset = new ZipEightByteInteger(bArr, i + 16);
        } else if (i2 % 8 == 4) {
            this.diskStart = new ZipLong(bArr, (i + i2) - 4);
        }
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 == 0) {
            return;
        }
        if (i2 < 16) {
            throw new ZipException(LFH_MUST_HAVE_BOTH_SIZES_MSG);
        }
        this.size = new ZipEightByteInteger(bArr, i);
        this.compressedSize = new ZipEightByteInteger(bArr, i + 8);
        int i3 = i + 16;
        int i4 = i2 - 16;
        if (i4 >= 8) {
            this.relativeHeaderOffset = new ZipEightByteInteger(bArr, i3);
            i3 = i + 24;
            i4 = i2 - 24;
        }
        if (i4 >= 4) {
            this.diskStart = new ZipLong(bArr, i3);
        }
    }

    public void reparseCentralDirectoryData(boolean z, boolean z2, boolean z3, boolean z4) throws ZipException {
        byte[] bArr = this.rawCentralDirectoryData;
        if (bArr != null) {
            int i = 0;
            int i2 = (z ? 8 : 0) + (z2 ? 8 : 0) + (z3 ? 8 : 0) + (z4 ? 4 : 0);
            if (bArr.length < i2) {
                throw new ZipException("Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length " + i2 + " but is " + this.rawCentralDirectoryData.length);
            }
            if (z) {
                this.size = new ZipEightByteInteger(this.rawCentralDirectoryData, 0);
                i = 8;
            }
            if (z2) {
                this.compressedSize = new ZipEightByteInteger(this.rawCentralDirectoryData, i);
                i += 8;
            }
            if (z3) {
                this.relativeHeaderOffset = new ZipEightByteInteger(this.rawCentralDirectoryData, i);
                i += 8;
            }
            if (z4) {
                this.diskStart = new ZipLong(this.rawCentralDirectoryData, i);
            }
        }
    }

    public void setCompressedSize(ZipEightByteInteger zipEightByteInteger) {
        this.compressedSize = zipEightByteInteger;
    }

    public void setDiskStartNumber(ZipLong zipLong) {
        this.diskStart = zipLong;
    }

    public void setRelativeHeaderOffset(ZipEightByteInteger zipEightByteInteger) {
        this.relativeHeaderOffset = zipEightByteInteger;
    }

    public void setSize(ZipEightByteInteger zipEightByteInteger) {
        this.size = zipEightByteInteger;
    }

    public Zip64ExtendedInformationExtraField(ZipEightByteInteger zipEightByteInteger, ZipEightByteInteger zipEightByteInteger2) {
        this(zipEightByteInteger, zipEightByteInteger2, null, null);
    }

    public Zip64ExtendedInformationExtraField() {
    }
}

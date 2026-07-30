package org.apache.commons.sudcompress.archivers.zip;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class UnrecognizedExtraField implements ZipExtraField {
    private byte[] centralData;
    private ZipShort headerId;
    private byte[] localData;

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        byte[] bArr = this.centralData;
        return bArr != null ? ZipUtil.copy(bArr) : getLocalFileDataData();
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return this.centralData != null ? new ZipShort(this.centralData.length) : getLocalFileDataLength();
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return this.headerId;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        return ZipUtil.copy(this.localData);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        byte[] bArr = this.localData;
        return new ZipShort(bArr != null ? bArr.length : 0);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        setCentralDirectoryData(bArrCopyOfRange);
        if (this.localData == null) {
            setLocalFileDataData(bArrCopyOfRange);
        }
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        setLocalFileDataData(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public void setCentralDirectoryData(byte[] bArr) {
        this.centralData = ZipUtil.copy(bArr);
    }

    public void setHeaderId(ZipShort zipShort) {
        this.headerId = zipShort;
    }

    public void setLocalFileDataData(byte[] bArr) {
        this.localData = ZipUtil.copy(bArr);
    }
}

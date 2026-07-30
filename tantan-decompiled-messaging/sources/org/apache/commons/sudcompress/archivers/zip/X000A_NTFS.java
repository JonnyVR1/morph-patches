package org.apache.commons.sudcompress.archivers.zip;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class X000A_NTFS implements ZipExtraField {
    private static final long EPOCH_OFFSET = -116444736000000000L;
    private ZipEightByteInteger accessTime;
    private ZipEightByteInteger createTime;
    private ZipEightByteInteger modifyTime;
    private static final ZipShort HEADER_ID = new ZipShort(10);
    private static final ZipShort TIME_ATTR_TAG = new ZipShort(1);
    private static final ZipShort TIME_ATTR_SIZE = new ZipShort(24);

    public X000A_NTFS() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.modifyTime = zipEightByteInteger;
        this.accessTime = zipEightByteInteger;
        this.createTime = zipEightByteInteger;
    }

    private static ZipEightByteInteger dateToZip(Date date) {
        if (date == null) {
            return null;
        }
        return new ZipEightByteInteger((date.getTime() * 10000) - EPOCH_OFFSET);
    }

    private void readTimeAttr(byte[] bArr, int i, int i2) {
        if (i2 >= 26) {
            if (TIME_ATTR_SIZE.equals(new ZipShort(bArr, i))) {
                this.modifyTime = new ZipEightByteInteger(bArr, i + 2);
                this.accessTime = new ZipEightByteInteger(bArr, i + 10);
                this.createTime = new ZipEightByteInteger(bArr, i + 18);
            }
        }
    }

    private void reset() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.modifyTime = zipEightByteInteger;
        this.accessTime = zipEightByteInteger;
        this.createTime = zipEightByteInteger;
    }

    private static Date zipToDate(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null || ZipEightByteInteger.ZERO.equals(zipEightByteInteger)) {
            return null;
        }
        return new Date((zipEightByteInteger.getLongValue() + EPOCH_OFFSET) / 10000);
    }

    public boolean equals(Object obj) {
        ZipEightByteInteger zipEightByteInteger;
        ZipEightByteInteger zipEightByteInteger2;
        if (!(obj instanceof X000A_NTFS)) {
            return false;
        }
        X000A_NTFS x000a_ntfs = (X000A_NTFS) obj;
        ZipEightByteInteger zipEightByteInteger3 = this.modifyTime;
        ZipEightByteInteger zipEightByteInteger4 = x000a_ntfs.modifyTime;
        if ((zipEightByteInteger3 == zipEightByteInteger4 || (zipEightByteInteger3 != null && zipEightByteInteger3.equals(zipEightByteInteger4))) && ((zipEightByteInteger = this.accessTime) == (zipEightByteInteger2 = x000a_ntfs.accessTime) || (zipEightByteInteger != null && zipEightByteInteger.equals(zipEightByteInteger2)))) {
            ZipEightByteInteger zipEightByteInteger5 = this.createTime;
            ZipEightByteInteger zipEightByteInteger6 = x000a_ntfs.createTime;
            if (zipEightByteInteger5 == zipEightByteInteger6) {
                return true;
            }
            if (zipEightByteInteger5 != null && zipEightByteInteger5.equals(zipEightByteInteger6)) {
                return true;
            }
        }
        return false;
    }

    public Date getAccessJavaTime() {
        return zipToDate(this.accessTime);
    }

    public ZipEightByteInteger getAccessTime() {
        return this.accessTime;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    public Date getCreateJavaTime() {
        return zipToDate(this.createTime);
    }

    public ZipEightByteInteger getCreateTime() {
        return this.createTime;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        System.arraycopy(TIME_ATTR_TAG.getBytes(), 0, bArr, 4, 2);
        System.arraycopy(TIME_ATTR_SIZE.getBytes(), 0, bArr, 6, 2);
        System.arraycopy(this.modifyTime.getBytes(), 0, bArr, 8, 8);
        System.arraycopy(this.accessTime.getBytes(), 0, bArr, 16, 8);
        System.arraycopy(this.createTime.getBytes(), 0, bArr, 24, 8);
        return bArr;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(32);
    }

    public Date getModifyJavaTime() {
        return zipToDate(this.modifyTime);
    }

    public ZipEightByteInteger getModifyTime() {
        return this.modifyTime;
    }

    public int hashCode() {
        ZipEightByteInteger zipEightByteInteger = this.modifyTime;
        int iHashCode = zipEightByteInteger != null ? (-123) ^ zipEightByteInteger.hashCode() : -123;
        ZipEightByteInteger zipEightByteInteger2 = this.accessTime;
        if (zipEightByteInteger2 != null) {
            iHashCode ^= Integer.rotateLeft(zipEightByteInteger2.hashCode(), 11);
        }
        ZipEightByteInteger zipEightByteInteger3 = this.createTime;
        return zipEightByteInteger3 != null ? Integer.rotateLeft(zipEightByteInteger3.hashCode(), 22) ^ iHashCode : iHashCode;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        reset();
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        int value = i + 4;
        while (value + 4 <= i3) {
            ZipShort zipShort = new ZipShort(bArr, value);
            int i4 = value + 2;
            if (zipShort.equals(TIME_ATTR_TAG)) {
                readTimeAttr(bArr, i4, i3 - i4);
                return;
            }
            value = i4 + new ZipShort(bArr, i4).getValue() + 2;
        }
    }

    public void setAccessJavaTime(Date date) {
        setAccessTime(dateToZip(date));
    }

    public void setAccessTime(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null) {
            zipEightByteInteger = ZipEightByteInteger.ZERO;
        }
        this.accessTime = zipEightByteInteger;
    }

    public void setCreateJavaTime(Date date) {
        setCreateTime(dateToZip(date));
    }

    public void setCreateTime(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null) {
            zipEightByteInteger = ZipEightByteInteger.ZERO;
        }
        this.createTime = zipEightByteInteger;
    }

    public void setModifyJavaTime(Date date) {
        setModifyTime(dateToZip(date));
    }

    public void setModifyTime(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null) {
            zipEightByteInteger = ZipEightByteInteger.ZERO;
        }
        this.modifyTime = zipEightByteInteger;
    }

    public String toString() {
        return "0x000A Zip Extra Field: Modify:[" + getModifyJavaTime() + "]  Access:[" + getAccessJavaTime() + "]  Create:[" + getCreateJavaTime() + "] ";
    }
}

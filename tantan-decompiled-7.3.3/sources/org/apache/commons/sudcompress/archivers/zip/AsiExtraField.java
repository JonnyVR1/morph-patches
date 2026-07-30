package org.apache.commons.sudcompress.archivers.zip;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
import p153l.iig0;
import p153l.p11;

/* JADX INFO: loaded from: classes2.dex */
public class AsiExtraField implements ZipExtraField, UnixStat, Cloneable {
    private static final ZipShort HEADER_ID = new ZipShort(30062);
    private static final int WORD = 4;
    private int mode = 0;
    private int uid = 0;
    private int gid = 0;
    private String link = "";
    private boolean dirFlag = false;
    private CRC32 crc = new CRC32();

    public Object clone() {
        try {
            AsiExtraField asiExtraField = (AsiExtraField) super.clone();
            asiExtraField.crc = new CRC32();
            return asiExtraField;
        } catch (CloneNotSupportedException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    public int getGroupId() {
        return this.gid;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    public String getLinkedFile() {
        return this.link;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        int value = getLocalFileDataLength().getValue();
        int i = value - 4;
        byte[] bArr = new byte[i];
        System.arraycopy(ZipShort.getBytes(getMode()), 0, bArr, 0, 2);
        byte[] bytes = getLinkedFile().getBytes();
        System.arraycopy(ZipLong.getBytes(bytes.length), 0, bArr, 2, 4);
        System.arraycopy(ZipShort.getBytes(getUserId()), 0, bArr, 6, 2);
        System.arraycopy(ZipShort.getBytes(getGroupId()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.crc.reset();
        this.crc.update(bArr);
        long value2 = this.crc.getValue();
        byte[] bArr2 = new byte[value];
        System.arraycopy(ZipLong.getBytes(value2), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, i);
        return bArr2;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(getLinkedFile().getBytes().length + 14);
    }

    public int getMode(int i) {
        int i2;
        if (isLink()) {
            i2 = UnixStat.LINK_FLAG;
        } else {
            i2 = isDirectory() ? 16384 : 32768;
        }
        return i2 | (i & UnixStat.PERM_MASK);
    }

    public int getUserId() {
        return this.uid;
    }

    public boolean isDirectory() {
        return this.dirFlag && !isLink();
    }

    public boolean isLink() {
        return getLinkedFile().length() != 0;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        long value = ZipLong.getValue(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.crc.reset();
        this.crc.update(bArr2);
        long value2 = this.crc.getValue();
        if (value != value2) {
            throw new ZipException("Bad CRC checksum, expected " + Long.toHexString(value) + " instead of " + Long.toHexString(value2));
        }
        int value3 = ZipShort.getValue(bArr2, 0);
        int value4 = (int) ZipLong.getValue(bArr2, 2);
        byte[] bArr3 = new byte[value4];
        this.uid = ZipShort.getValue(bArr2, 6);
        this.gid = ZipShort.getValue(bArr2, 8);
        if (value4 == 0) {
            this.link = "";
        } else if (value4 > i2 - 14) {
            p11.m170187a("Bad symbolic link name length ", value4, " in ASI extra field");
            return;
        } else {
            System.arraycopy(bArr2, 10, bArr3, 0, value4);
            this.link = new String(bArr3);
        }
        setDirectory((value3 & 16384) != 0);
        setMode(value3);
    }

    public void setDirectory(boolean z) {
        this.dirFlag = z;
        this.mode = getMode(this.mode);
    }

    public void setGroupId(int i) {
        this.gid = i;
    }

    public void setLinkedFile(String str) {
        this.link = str;
        this.mode = getMode(this.mode);
    }

    public void setMode(int i) {
        this.mode = getMode(i);
    }

    public void setUserId(int i) {
        this.uid = i;
    }

    public int getMode() {
        return this.mode;
    }
}

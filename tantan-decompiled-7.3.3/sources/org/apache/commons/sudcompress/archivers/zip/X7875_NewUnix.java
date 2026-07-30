package org.apache.commons.sudcompress.archivers.zip;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;
import p153l.p11;

/* JADX INFO: loaded from: classes2.dex */
public class X7875_NewUnix implements ZipExtraField, Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private BigInteger gid;
    private BigInteger uid;
    private int version = 1;
    private static final ZipShort HEADER_ID = new ZipShort(30837);
    private static final ZipShort ZERO = new ZipShort(0);
    private static final BigInteger ONE_THOUSAND = BigInteger.valueOf(1000);

    public X7875_NewUnix() {
        reset();
    }

    private void reset() {
        BigInteger bigInteger = ONE_THOUSAND;
        this.uid = bigInteger;
        this.gid = bigInteger;
    }

    public static byte[] trimLeadingZeroesForceMinLength(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && bArr[i2] == 0; i2++) {
            i++;
        }
        int iMax = Math.max(1, bArr.length - i);
        byte[] bArr2 = new byte[iMax];
        int length2 = iMax - (bArr.length - i);
        System.arraycopy(bArr, i, bArr2, length2, iMax - length2);
        return bArr2;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj instanceof X7875_NewUnix) {
            X7875_NewUnix x7875_NewUnix = (X7875_NewUnix) obj;
            if (this.version == x7875_NewUnix.version && this.uid.equals(x7875_NewUnix.uid) && this.gid.equals(x7875_NewUnix.gid)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return new byte[0];
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return ZERO;
    }

    public long getGID() {
        return ZipUtil.bigToLong(this.gid);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        byte[] byteArray = this.uid.toByteArray();
        byte[] byteArray2 = this.gid.toByteArray();
        byte[] bArrTrimLeadingZeroesForceMinLength = trimLeadingZeroesForceMinLength(byteArray);
        int length = bArrTrimLeadingZeroesForceMinLength != null ? bArrTrimLeadingZeroesForceMinLength.length : 0;
        byte[] bArrTrimLeadingZeroesForceMinLength2 = trimLeadingZeroesForceMinLength(byteArray2);
        int length2 = bArrTrimLeadingZeroesForceMinLength2 != null ? bArrTrimLeadingZeroesForceMinLength2.length : 0;
        int i = length + 3;
        byte[] bArr = new byte[i + length2];
        if (bArrTrimLeadingZeroesForceMinLength != null) {
            ZipUtil.reverse(bArrTrimLeadingZeroesForceMinLength);
        }
        if (bArrTrimLeadingZeroesForceMinLength2 != null) {
            ZipUtil.reverse(bArrTrimLeadingZeroesForceMinLength2);
        }
        bArr[0] = ZipUtil.unsignedIntToSignedByte(this.version);
        bArr[1] = ZipUtil.unsignedIntToSignedByte(length);
        if (bArrTrimLeadingZeroesForceMinLength != null) {
            System.arraycopy(bArrTrimLeadingZeroesForceMinLength, 0, bArr, 2, length);
        }
        bArr[2 + length] = ZipUtil.unsignedIntToSignedByte(length2);
        if (bArrTrimLeadingZeroesForceMinLength2 != null) {
            System.arraycopy(bArrTrimLeadingZeroesForceMinLength2, 0, bArr, i, length2);
        }
        return bArr;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        byte[] bArrTrimLeadingZeroesForceMinLength = trimLeadingZeroesForceMinLength(this.uid.toByteArray());
        int length = bArrTrimLeadingZeroesForceMinLength == null ? 0 : bArrTrimLeadingZeroesForceMinLength.length;
        byte[] bArrTrimLeadingZeroesForceMinLength2 = trimLeadingZeroesForceMinLength(this.gid.toByteArray());
        return new ZipShort(length + 3 + (bArrTrimLeadingZeroesForceMinLength2 != null ? bArrTrimLeadingZeroesForceMinLength2.length : 0));
    }

    public long getUID() {
        return ZipUtil.bigToLong(this.uid);
    }

    public int hashCode() {
        return this.gid.hashCode() ^ ((this.version * (-1234567)) ^ Integer.rotateLeft(this.uid.hashCode(), 16));
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        if (i2 < 3) {
            p11.m170187a("X7875_NewUnix length is too short, only ", i2, " bytes");
            return;
        }
        int i3 = i + 1;
        this.version = ZipUtil.signedByteToUnsignedInt(bArr[i]);
        int i4 = i + 2;
        int iSignedByteToUnsignedInt = ZipUtil.signedByteToUnsignedInt(bArr[i3]);
        int i5 = iSignedByteToUnsignedInt + 3;
        if (i5 > i2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + iSignedByteToUnsignedInt + " doesn't fit into " + i2 + " bytes");
        }
        int i6 = iSignedByteToUnsignedInt + i4;
        this.uid = new BigInteger(1, ZipUtil.reverse(Arrays.copyOfRange(bArr, i4, i6)));
        int i7 = i6 + 1;
        int iSignedByteToUnsignedInt2 = ZipUtil.signedByteToUnsignedInt(bArr[i6]);
        if (i5 + iSignedByteToUnsignedInt2 <= i2) {
            this.gid = new BigInteger(1, ZipUtil.reverse(Arrays.copyOfRange(bArr, i7, iSignedByteToUnsignedInt2 + i7)));
            return;
        }
        throw new ZipException("X7875_NewUnix invalid: gidSize " + iSignedByteToUnsignedInt2 + " doesn't fit into " + i2 + " bytes");
    }

    public void setGID(long j) {
        this.gid = ZipUtil.longToBig(j);
    }

    public void setUID(long j) {
        this.uid = ZipUtil.longToBig(j);
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.uid + " GID=" + this.gid;
    }
}

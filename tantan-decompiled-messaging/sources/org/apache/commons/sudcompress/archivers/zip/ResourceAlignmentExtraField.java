package org.apache.commons.sudcompress.archivers.zip;

import java.util.zip.ZipException;
import p149l.ig3;
import p149l.vdg0;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceAlignmentExtraField implements ZipExtraField {
    private static final int ALLOW_METHOD_MESSAGE_CHANGE_FLAG = 32768;
    public static final int BASE_SIZE = 2;

    /* JADX INFO: renamed from: ID */
    public static final ZipShort f205864ID = new ZipShort(41246);
    private short alignment;
    private boolean allowMethodChange;
    private int padding;

    public ResourceAlignmentExtraField(int i, boolean z, int i2) {
        this.padding = 0;
        if (i < 0 || i > 32767) {
            ig3.m135964a(vdg0.m197997a(i, "Alignment must be between 0 and 0x7fff, was: "));
            throw null;
        }
        if (i2 < 0) {
            ig3.m135964a(vdg0.m197997a(i2, "Padding must not be negative, was: "));
            throw null;
        }
        this.alignment = (short) i;
        this.allowMethodChange = z;
        this.padding = i2;
    }

    public boolean allowMethodChange() {
        return this.allowMethodChange;
    }

    public short getAlignment() {
        return this.alignment;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return ZipShort.getBytes((this.allowMethodChange ? Short.MIN_VALUE : (short) 0) | this.alignment);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return new ZipShort(2);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return f205864ID;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        byte[] bArr = new byte[this.padding + 2];
        ZipShort.putShort((this.allowMethodChange ? Short.MIN_VALUE : (short) 0) | this.alignment, bArr, 0);
        return bArr;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(this.padding + 2);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 2) {
            throw new ZipException(vdg0.m197997a(i2, "Too short content for ResourceAlignmentExtraField (0xa11e): "));
        }
        int value = ZipShort.getValue(bArr, i);
        this.alignment = (short) (value & 32767);
        this.allowMethodChange = (value & 32768) != 0;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromCentralDirectoryData(bArr, i, i2);
        this.padding = i2 - 2;
    }

    public ResourceAlignmentExtraField(int i) {
        this(i, false);
    }

    public ResourceAlignmentExtraField(int i, boolean z) {
        this(i, z, 0);
    }

    public ResourceAlignmentExtraField() {
        this.padding = 0;
    }
}

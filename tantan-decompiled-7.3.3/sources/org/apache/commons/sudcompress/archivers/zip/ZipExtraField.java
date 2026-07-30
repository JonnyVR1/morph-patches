package org.apache.commons.sudcompress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public interface ZipExtraField {
    public static final int EXTRAFIELD_HEADER_SIZE = 4;

    byte[] getCentralDirectoryData();

    ZipShort getCentralDirectoryLength();

    ZipShort getHeaderId();

    byte[] getLocalFileDataData();

    ZipShort getLocalFileDataLength();

    void parseFromCentralDirectoryData(byte[] bArr, int i, int i2);

    void parseFromLocalFileData(byte[] bArr, int i, int i2);
}

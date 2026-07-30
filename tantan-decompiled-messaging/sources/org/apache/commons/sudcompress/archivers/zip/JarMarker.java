package org.apache.commons.sudcompress.archivers.zip;

import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes2.dex */
public final class JarMarker implements ZipExtraField {

    /* JADX INFO: renamed from: ID */
    private static final ZipShort f205862ID = new ZipShort(51966);
    private static final ZipShort NULL = new ZipShort(0);
    private static final byte[] NO_BYTES = new byte[0];
    private static final JarMarker DEFAULT = new JarMarker();

    public static JarMarker getInstance() {
        return DEFAULT;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return NO_BYTES;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return NULL;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return f205862ID;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        return NO_BYTES;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return NULL;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}

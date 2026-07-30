package org.apache.commons.sudcompress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class UnicodePathExtraField extends AbstractUnicodeExtraField {
    public static final ZipShort UPATH_ID = new ZipShort(28789);

    public UnicodePathExtraField() {
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return UPATH_ID;
    }

    public UnicodePathExtraField(String str, byte[] bArr, int i, int i2) {
        super(str, bArr, i, i2);
    }

    public UnicodePathExtraField(String str, byte[] bArr) {
        super(str, bArr);
    }
}

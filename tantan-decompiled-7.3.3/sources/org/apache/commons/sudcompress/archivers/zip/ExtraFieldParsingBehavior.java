package org.apache.commons.sudcompress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public interface ExtraFieldParsingBehavior extends UnparseableExtraFieldBehavior {
    ZipExtraField createExtraField(ZipShort zipShort);

    ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z);
}

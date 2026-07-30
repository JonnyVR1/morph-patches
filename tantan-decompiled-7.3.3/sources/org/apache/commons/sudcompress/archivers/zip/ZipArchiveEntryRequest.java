package org.apache.commons.sudcompress.archivers.zip;

import java.io.InputStream;
import p153l.brg0;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveEntryRequest {
    private final int method;
    private final brg0 payloadSupplier;
    private final ZipArchiveEntry zipArchiveEntry;

    private ZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, brg0 brg0Var) {
        this.zipArchiveEntry = zipArchiveEntry;
        this.method = zipArchiveEntry.getMethod();
    }

    public static ZipArchiveEntryRequest createZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, brg0 brg0Var) {
        return new ZipArchiveEntryRequest(zipArchiveEntry, brg0Var);
    }

    public int getMethod() {
        return this.method;
    }

    public InputStream getPayloadStream() {
        throw null;
    }

    public ZipArchiveEntry getZipArchiveEntry() {
        return this.zipArchiveEntry;
    }
}

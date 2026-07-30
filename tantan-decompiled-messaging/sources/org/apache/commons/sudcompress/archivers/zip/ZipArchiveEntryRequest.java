package org.apache.commons.sudcompress.archivers.zip;

import java.io.InputStream;
import p149l.tig0;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveEntryRequest {
    private final int method;
    private final tig0 payloadSupplier;
    private final ZipArchiveEntry zipArchiveEntry;

    private ZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, tig0 tig0Var) {
        this.zipArchiveEntry = zipArchiveEntry;
        this.method = zipArchiveEntry.getMethod();
    }

    public static ZipArchiveEntryRequest createZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, tig0 tig0Var) {
        return new ZipArchiveEntryRequest(zipArchiveEntry, tig0Var);
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

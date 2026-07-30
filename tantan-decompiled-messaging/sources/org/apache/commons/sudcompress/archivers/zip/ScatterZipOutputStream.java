package org.apache.commons.sudcompress.archivers.zip;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.ibg0;
import p149l.kfg0;
import p149l.mfg0;

/* JADX INFO: loaded from: classes2.dex */
public class ScatterZipOutputStream implements Closeable {
    private final kfg0 backingStore;
    private final StreamCompressor streamCompressor;
    private final Queue<CompressedEntry> items = new ConcurrentLinkedQueue();
    private AtomicBoolean isClosed = new AtomicBoolean();
    private ZipEntryWriter zipEntryWriter = null;

    public static class CompressedEntry {
        final long compressedSize;
        final long crc;
        final long size;
        final ZipArchiveEntryRequest zipArchiveEntryRequest;

        public CompressedEntry(ZipArchiveEntryRequest zipArchiveEntryRequest, long j, long j2, long j3) {
            this.zipArchiveEntryRequest = zipArchiveEntryRequest;
            this.crc = j;
            this.compressedSize = j2;
            this.size = j3;
        }

        public ZipArchiveEntry transferToArchiveEntry() {
            ZipArchiveEntry zipArchiveEntry = this.zipArchiveEntryRequest.getZipArchiveEntry();
            zipArchiveEntry.setCompressedSize(this.compressedSize);
            zipArchiveEntry.setSize(this.size);
            zipArchiveEntry.setCrc(this.crc);
            zipArchiveEntry.setMethod(this.zipArchiveEntryRequest.getMethod());
            return zipArchiveEntry;
        }
    }

    public static class ZipEntryWriter implements Closeable {
        private final Iterator<CompressedEntry> itemsIterator;
        private final InputStream itemsIteratorData;

        public ZipEntryWriter(ScatterZipOutputStream scatterZipOutputStream) throws IOException {
            ibg0 ibg0Var = (ibg0) scatterZipOutputStream.backingStore;
            if (!ibg0Var.f112366c) {
                ibg0Var.f112365b.close();
                ibg0Var.f112366c = true;
            }
            this.itemsIterator = scatterZipOutputStream.items.iterator();
            this.itemsIteratorData = ((ibg0) scatterZipOutputStream.backingStore).m135254k();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.itemsIteratorData;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public void writeNextZipEntry(ZipArchiveOutputStream zipArchiveOutputStream) throws IOException {
            CompressedEntry next = this.itemsIterator.next();
            zipArchiveOutputStream.addRawArchiveEntry(next.transferToArchiveEntry(), new mfg0(this.itemsIteratorData, next.compressedSize));
        }
    }

    public ScatterZipOutputStream(kfg0 kfg0Var, StreamCompressor streamCompressor) {
        this.backingStore = kfg0Var;
        this.streamCompressor = streamCompressor;
    }

    public static ScatterZipOutputStream fileBased(File file, int i) {
        ibg0 ibg0Var = new ibg0(file);
        return new ScatterZipOutputStream(ibg0Var, StreamCompressor.create(i, ibg0Var));
    }

    public void addArchiveEntry(ZipArchiveEntryRequest zipArchiveEntryRequest) throws IOException {
        InputStream payloadStream = zipArchiveEntryRequest.getPayloadStream();
        try {
            this.streamCompressor.deflate(payloadStream, zipArchiveEntryRequest.getMethod());
            if (payloadStream != null) {
                payloadStream.close();
            }
            this.items.add(new CompressedEntry(zipArchiveEntryRequest, this.streamCompressor.getCrc32(), this.streamCompressor.getBytesWrittenForLastEntry(), this.streamCompressor.getBytesRead()));
        } catch (Throwable th) {
            if (payloadStream == null) {
                throw th;
            }
            try {
                payloadStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed.compareAndSet(false, true)) {
            try {
                ZipEntryWriter zipEntryWriter = this.zipEntryWriter;
                if (zipEntryWriter != null) {
                    zipEntryWriter.close();
                }
                this.backingStore.close();
            } finally {
                this.streamCompressor.close();
            }
        }
    }

    public void writeTo(ZipArchiveOutputStream zipArchiveOutputStream) throws IOException {
        ibg0 ibg0Var = (ibg0) this.backingStore;
        if (!ibg0Var.f112366c) {
            ibg0Var.f112365b.close();
            ibg0Var.f112366c = true;
        }
        InputStream inputStreamM135254k = ((ibg0) this.backingStore).m135254k();
        try {
            for (CompressedEntry compressedEntry : this.items) {
                try {
                    zipArchiveOutputStream.addRawArchiveEntry(compressedEntry.transferToArchiveEntry(), new mfg0(inputStreamM135254k, compressedEntry.compressedSize));
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (inputStreamM135254k != null) {
                inputStreamM135254k.close();
            }
        } catch (Throwable th2) {
            if (inputStreamM135254k != null) {
                try {
                    inputStreamM135254k.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public ZipEntryWriter zipEntryWriter() {
        if (this.zipEntryWriter == null) {
            this.zipEntryWriter = new ZipEntryWriter(this);
        }
        return this.zipEntryWriter;
    }

    public static ScatterZipOutputStream fileBased(File file) {
        return fileBased(file, -1);
    }
}

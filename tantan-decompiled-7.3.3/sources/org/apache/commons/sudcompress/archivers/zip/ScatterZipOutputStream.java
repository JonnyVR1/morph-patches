package org.apache.commons.sudcompress.archivers.zip;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.qjg0;
import p153l.sng0;
import p153l.ung0;

/* JADX INFO: loaded from: classes2.dex */
public class ScatterZipOutputStream implements Closeable {
    private final sng0 backingStore;
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
            qjg0 qjg0Var = (qjg0) scatterZipOutputStream.backingStore;
            if (!qjg0Var.f157970c) {
                qjg0Var.f157969b.close();
                qjg0Var.f157970c = true;
            }
            this.itemsIterator = scatterZipOutputStream.items.iterator();
            this.itemsIteratorData = ((qjg0) scatterZipOutputStream.backingStore).m176832k();
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
            zipArchiveOutputStream.addRawArchiveEntry(next.transferToArchiveEntry(), new ung0(this.itemsIteratorData, next.compressedSize));
        }
    }

    public ScatterZipOutputStream(sng0 sng0Var, StreamCompressor streamCompressor) {
        this.backingStore = sng0Var;
        this.streamCompressor = streamCompressor;
    }

    public static ScatterZipOutputStream fileBased(File file, int i) {
        qjg0 qjg0Var = new qjg0(file);
        return new ScatterZipOutputStream(qjg0Var, StreamCompressor.create(i, qjg0Var));
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
        qjg0 qjg0Var = (qjg0) this.backingStore;
        if (!qjg0Var.f157970c) {
            qjg0Var.f157969b.close();
            qjg0Var.f157970c = true;
        }
        InputStream inputStreamM176832k = ((qjg0) this.backingStore).m176832k();
        try {
            for (CompressedEntry compressedEntry : this.items) {
                try {
                    zipArchiveOutputStream.addRawArchiveEntry(compressedEntry.transferToArchiveEntry(), new ung0(inputStreamM176832k, compressedEntry.compressedSize));
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (inputStreamM176832k != null) {
                inputStreamM176832k.close();
            }
        } catch (Throwable th2) {
            if (inputStreamM176832k != null) {
                try {
                    inputStreamM176832k.close();
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

package org.apache.commons.sudcompress.archivers.zip;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.aag0;
import p149l.ibg0;
import p149l.kfg0;
import p149l.nlg0;
import p149l.qhg0;
import p149l.tig0;

/* JADX INFO: loaded from: classes2.dex */
public class ParallelScatterZipCreator {
    private final nlg0 backingStoreSupplier;
    private long compressionDoneAt;

    /* JADX INFO: renamed from: es */
    private final ExecutorService f205863es;
    private final Deque<Future<? extends ScatterZipOutputStream>> futures;
    private long scatterDoneAt;
    private final long startedAt;
    private final Deque<ScatterZipOutputStream> streams;
    private final ThreadLocal<ScatterZipOutputStream> tlScatterStreams;

    public static class DefaultBackingStoreSupplier implements nlg0 {
        final AtomicInteger storeNum;

        private DefaultBackingStoreSupplier() {
            this.storeNum = new AtomicInteger(0);
        }

        @Override // p149l.nlg0
        public kfg0 get() {
            return new ibg0(File.createTempFile("parallelscatter", "n" + this.storeNum.incrementAndGet()));
        }
    }

    public ParallelScatterZipCreator(ExecutorService executorService, nlg0 nlg0Var) {
        this.streams = new ConcurrentLinkedDeque();
        this.futures = new ConcurrentLinkedDeque();
        this.startedAt = System.currentTimeMillis();
        this.compressionDoneAt = 0L;
        this.tlScatterStreams = new ThreadLocal<ScatterZipOutputStream>() { // from class: org.apache.commons.sudcompress.archivers.zip.ParallelScatterZipCreator.1
            @Override // java.lang.ThreadLocal
            public ScatterZipOutputStream initialValue() {
                try {
                    ParallelScatterZipCreator parallelScatterZipCreator = ParallelScatterZipCreator.this;
                    ScatterZipOutputStream scatterZipOutputStreamCreateDeferred = parallelScatterZipCreator.createDeferred(parallelScatterZipCreator.backingStoreSupplier);
                    ParallelScatterZipCreator.this.streams.add(scatterZipOutputStreamCreateDeferred);
                    return scatterZipOutputStreamCreateDeferred;
                } catch (IOException e) {
                    aag0.m95543a(e);
                    return null;
                }
            }
        };
        this.backingStoreSupplier = nlg0Var;
        this.f205863es = executorService;
    }

    private void closeAll() {
        Iterator<ScatterZipOutputStream> it = this.streams.iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ScatterZipOutputStream createDeferred(nlg0 nlg0Var) {
        kfg0 kfg0Var = nlg0Var.get();
        return new ScatterZipOutputStream(kfg0Var, StreamCompressor.create(-1, kfg0Var));
    }

    public void addArchiveEntry(ZipArchiveEntry zipArchiveEntry, tig0 tig0Var) {
        submitStreamAwareCallable(createCallable(zipArchiveEntry, tig0Var));
    }

    public final Callable<ScatterZipOutputStream> createCallable(ZipArchiveEntry zipArchiveEntry, tig0 tig0Var) {
        if (zipArchiveEntry.getMethod() != -1) {
            final ZipArchiveEntryRequest zipArchiveEntryRequestCreateZipArchiveEntryRequest = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry, tig0Var);
            return new Callable<ScatterZipOutputStream>() { // from class: org.apache.commons.sudcompress.archivers.zip.ParallelScatterZipCreator.3
                @Override // java.util.concurrent.Callable
                public ScatterZipOutputStream call() throws IOException {
                    ScatterZipOutputStream scatterZipOutputStream = (ScatterZipOutputStream) ParallelScatterZipCreator.this.tlScatterStreams.get();
                    scatterZipOutputStream.addArchiveEntry(zipArchiveEntryRequestCreateZipArchiveEntryRequest);
                    return scatterZipOutputStream;
                }
            };
        }
        qhg0.m174539a("Method must be set on zipArchiveEntry: ", zipArchiveEntry);
        return null;
    }

    public ScatterStatistics getStatisticsMessage() {
        long j = this.compressionDoneAt;
        return new ScatterStatistics(j - this.startedAt, this.scatterDoneAt - j);
    }

    public final void submit(final Callable<? extends Object> callable) {
        submitStreamAwareCallable(new Callable<ScatterZipOutputStream>() { // from class: org.apache.commons.sudcompress.archivers.zip.ParallelScatterZipCreator.2
            @Override // java.util.concurrent.Callable
            public ScatterZipOutputStream call() throws Exception {
                callable.call();
                return (ScatterZipOutputStream) ParallelScatterZipCreator.this.tlScatterStreams.get();
            }
        });
    }

    public final void submitStreamAwareCallable(Callable<? extends ScatterZipOutputStream> callable) {
        this.futures.add(this.f205863es.submit(callable));
    }

    public void writeTo(ZipArchiveOutputStream zipArchiveOutputStream) {
        try {
            try {
                Iterator<Future<? extends ScatterZipOutputStream>> it = this.futures.iterator();
                while (it.hasNext()) {
                    it.next().get();
                }
                this.f205863es.shutdown();
                this.f205863es.awaitTermination(Constants.ONE_MIN_IN_MILLIS, TimeUnit.SECONDS);
                this.compressionDoneAt = System.currentTimeMillis();
                Iterator<Future<? extends ScatterZipOutputStream>> it2 = this.futures.iterator();
                while (it2.hasNext()) {
                    it2.next().get().zipEntryWriter().writeNextZipEntry(zipArchiveOutputStream);
                }
                Iterator<ScatterZipOutputStream> it3 = this.streams.iterator();
                while (it3.hasNext()) {
                    it3.next().close();
                }
                this.scatterDoneAt = System.currentTimeMillis();
                closeAll();
            } catch (Throwable th) {
                this.f205863es.shutdown();
                throw th;
            }
        } catch (Throwable th2) {
            closeAll();
            throw th2;
        }
    }

    public void addArchiveEntry(ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier) {
        submitStreamAwareCallable(createCallable(zipArchiveEntryRequestSupplier));
    }

    public final Callable<ScatterZipOutputStream> createCallable(final ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier) {
        return new Callable<ScatterZipOutputStream>() { // from class: org.apache.commons.sudcompress.archivers.zip.ParallelScatterZipCreator.4
            @Override // java.util.concurrent.Callable
            public ScatterZipOutputStream call() throws IOException {
                ScatterZipOutputStream scatterZipOutputStream = (ScatterZipOutputStream) ParallelScatterZipCreator.this.tlScatterStreams.get();
                scatterZipOutputStream.addArchiveEntry(zipArchiveEntryRequestSupplier.get());
                return scatterZipOutputStream;
            }
        };
    }

    public ParallelScatterZipCreator(ExecutorService executorService) {
        this(executorService, new DefaultBackingStoreSupplier());
    }

    public ParallelScatterZipCreator() {
        this(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()));
    }
}

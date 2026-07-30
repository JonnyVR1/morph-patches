package com.cosmos.photon.push.image;

import android.content.res.AssetFileDescriptor;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p153l.dpq0;
import p153l.v1d0;
import p153l.wg3;
import p153l.wtq0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements Closeable {
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final File directory;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private Writer journalWriter;
    private long maxSize;
    private int redundantOpCount;
    private final int valueCount;
    static final String STRING_KEY_PATTERN = "[a-z0-9_-]{1,120}";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile(STRING_KEY_PATTERN);
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.cosmos.photon.push.image.DiskLruCache.2
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };
    private long size = 0;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long nextSequenceNumber = 0;
    final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> cleanupCallable = new Callable<Void>() { // from class: com.cosmos.photon.push.image.DiskLruCache.1
        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (DiskLruCache.this) {
                try {
                    if (DiskLruCache.this.journalWriter == null) {
                        return null;
                    }
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public final class Entry {
        private Editor currentEditor;
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length != DiskLruCache.this.valueCount) {
                throw invalidLengths(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.lengths[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw invalidLengths(strArr);
                }
            }
        }

        public File getCleanFile(int i) {
            return new File(DiskLruCache.this.directory, this.key + "." + i);
        }

        public File getDirtyFile(int i) {
            return new File(DiskLruCache.this.directory, this.key + "." + i + ".tmp");
        }

        public String getLengths() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class Snapshot implements Closeable {
        private final InputStream[] ins;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        private Snapshot(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.ins) {
                Util.closeQuietly(inputStream);
            }
        }

        public Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public InputStream getInputStream(int i) {
            return this.ins[i];
        }

        public long getLength(int i) {
            return this.lengths[i];
        }

        public String getString(int i) throws IOException {
            return DiskLruCache.inputStreamToString(getInputStream(i));
        }
    }

    private DiskLruCache(File file, int i, int i2, long j) {
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = i2;
        this.maxSize = j;
    }

    private void checkNotClosed() {
        if (this.journalWriter != null) {
            return;
        }
        wtq0.m207906a("cache is closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void completeEdit(Editor editor, boolean z) throws IOException {
        Entry entry = editor.entry;
        if (entry.currentEditor != editor) {
            throw new IllegalStateException();
        }
        if (z && !entry.readable) {
            for (int i = 0; i < this.valueCount; i++) {
                if (!editor.written[i]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!entry.getDirtyFile(i).exists()) {
                    editor.abort();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.valueCount; i2++) {
            File dirtyFile = entry.getDirtyFile(i2);
            if (!z) {
                deleteIfExists(dirtyFile);
            } else if (dirtyFile.exists()) {
                File cleanFile = entry.getCleanFile(i2);
                dirtyFile.renameTo(cleanFile);
                long j = entry.lengths[i2];
                long length = cleanFile.length();
                entry.lengths[i2] = length;
                this.size = (this.size - j) + length;
            }
        }
        this.redundantOpCount++;
        entry.currentEditor = null;
        if (entry.readable || z) {
            entry.readable = true;
            this.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
            if (z) {
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry.sequenceNumber = j2;
            }
        } else {
            this.lruEntries.remove(entry.key);
            this.journalWriter.write("REMOVE " + entry.key + '\n');
        }
        this.journalWriter.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
    }

    private static void deleteIfExists(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Editor edit(String str, long j) throws IOException {
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j != -1 && (entry == null || entry.sequenceNumber != j)) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(str);
            this.lruEntries.put(str, entry);
        } else if (entry.currentEditor != null) {
            return null;
        }
        Editor editor = new Editor(entry);
        entry.currentEditor = editor;
        this.journalWriter.write("DIRTY " + str + '\n');
        this.journalWriter.flush();
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inputStreamToString(InputStream inputStream) throws IOException {
        return Util.readFully(new InputStreamReader(inputStream, Util.UTF_8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    public static DiskLruCache open(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            wg3.m206174a("maxSize <= 0");
            return null;
        }
        if (i2 <= 0) {
            wg3.m206174a("valueCount <= 0");
            return null;
        }
        File file2 = new File(file, JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                renameTo(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
        if (diskLruCache.journalFile.exists()) {
            try {
                diskLruCache.readJournal();
                diskLruCache.processJournal();
                return diskLruCache;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                diskLruCache.delete();
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
        diskLruCache2.rebuildJournal();
        return diskLruCache2;
    }

    private void processJournal() throws IOException {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i));
                    deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void readJournal() throws IOException {
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.US_ASCII);
        try {
            String line = strictLineReader.readLine();
            String line2 = strictLineReader.readLine();
            String line3 = strictLineReader.readLine();
            String line4 = strictLineReader.readLine();
            String line5 = strictLineReader.readLine();
            if (!MAGIC.equals(line) || !"1".equals(line2) || !Integer.toString(this.appVersion).equals(line3) || !Integer.toString(this.valueCount).equals(line4) || !"".equals(line5)) {
                throw new IOException("unexpected journal header: [" + line + ", " + line2 + ", " + line4 + ", " + line5 + Constants.AES_SUFFIX);
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
                    }
                    Util.closeQuietly(strictLineReader);
                    return;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(strictLineReader);
            throw th;
        }
    }

    private void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            zpg0.m220844a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith(REMOVE)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(CLEAN)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            entry.readable = true;
            entry.currentEditor = null;
            entry.setLengths(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(DIRTY)) {
            entry.currentEditor = new Editor(entry);
        } else {
            if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(READ)) {
                return;
            }
            zpg0.m220844a("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void rebuildJournal() throws IOException {
        try {
            Writer writer = this.journalWriter;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), Util.US_ASCII));
            try {
                bufferedWriter.write(MAGIC);
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write("1");
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.appVersion));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(Integer.toString(this.valueCount));
                bufferedWriter.write(SignParameters.NEW_LINE);
                bufferedWriter.write(SignParameters.NEW_LINE);
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.currentEditor != null) {
                        bufferedWriter.write("DIRTY " + entry.key + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.journalFile.exists()) {
                    renameTo(this.journalFile, this.journalFileBackup, true);
                }
                renameTo(this.journalFileTmp, this.journalFile, false);
                this.journalFileBackup.delete();
                this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void renameTo(File file, File file2, boolean z) throws IOException {
        if (z) {
            deleteIfExists(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            remove(this.lruEntries.entrySet().iterator().next().getKey());
        }
    }

    private void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matcher(str).matches()) {
            return;
        }
        v1d0.m199002a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\"");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.journalWriter == null) {
                return;
            }
            for (Entry entry : new ArrayList(this.lruEntries.values())) {
                if (entry.currentEditor != null) {
                    entry.currentEditor.abort();
                }
            }
            trimToSize();
            this.journalWriter.close();
            this.journalWriter = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void delete() throws IOException {
        close();
        Util.deleteContents(this.directory);
    }

    public synchronized void flush() throws IOException {
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Snapshot get(String str) throws Throwable {
        Closeable fileInputStream;
        Throwable th;
        AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        try {
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return null;
            }
            if (!entry.readable) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.valueCount];
            for (int i = 0; i < this.valueCount; i++) {
                try {
                    try {
                        try {
                            fileInputStream = new FileInputStream(entry.getCleanFile(i));
                            inputStreamArr[i] = fileInputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = this;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i2 = 0; i2 < this.valueCount && (autoCloseInputStream = inputStreamArr[i2]) != 0; i2++) {
                            Util.closeQuietly(autoCloseInputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("READ " + str + '\n'));
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return new Snapshot(str, entry.sequenceNumber, inputStreamArr, entry.lengths);
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = this;
        }
        th = th;
        throw th;
    }

    public File getDirectory() {
        return this.directory;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized boolean isClosed() {
        return this.journalWriter == null;
    }

    public synchronized boolean remove(String str) throws IOException {
        try {
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry != null && entry.currentEditor == null) {
                for (int i = 0; i < this.valueCount; i++) {
                    File cleanFile = entry.getCleanFile(i);
                    if (cleanFile.exists() && !cleanFile.delete()) {
                        throw new IOException("failed to delete " + cleanFile);
                    }
                    this.size -= entry.lengths[i];
                    entry.lengths[i] = 0;
                }
                this.redundantOpCount++;
                this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
                this.lruEntries.remove(str);
                if (journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setMaxSize(long j) {
        this.maxSize = j;
        this.executorService.submit(this.cleanupCallable);
    }

    public synchronized long size() {
        return this.size;
    }

    public final class Editor {
        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        private final boolean[] written;

        private Editor(Entry entry) {
            this.entry = entry;
            this.written = entry.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }

        public void abort() throws IOException {
            DiskLruCache.this.completeEdit(this, false);
        }

        public void abortUnlessCommitted() {
            if (this.committed) {
                return;
            }
            try {
                abort();
            } catch (IOException unused) {
            }
        }

        public void commit() throws IOException {
            boolean z = this.hasErrors;
            DiskLruCache diskLruCache = DiskLruCache.this;
            if (z) {
                diskLruCache.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                diskLruCache.completeEdit(this, true);
            }
            this.committed = true;
        }

        public String getString(int i) throws IOException {
            InputStream inputStreamNewInputStream = newInputStream(i);
            if (inputStreamNewInputStream != null) {
                return DiskLruCache.inputStreamToString(inputStreamNewInputStream);
            }
            return null;
        }

        public InputStream newInputStream(int i) throws IOException {
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (!this.entry.readable) {
                    return null;
                }
                try {
                    return new FileInputStream(this.entry.getCleanFile(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public OutputStream newOutputStream(int i) throws IOException {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            if (i < 0 || i >= DiskLruCache.this.valueCount) {
                dpq0.m117417a("Expected index ", i, " to be greater than 0 and less than the maximum value count of ", DiskLruCache.this.valueCount);
                return null;
            }
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    File dirtyFile = this.entry.getDirtyFile(i);
                    try {
                        fileOutputStream = new FileOutputStream(dirtyFile);
                    } catch (FileNotFoundException unused) {
                        DiskLruCache.this.directory.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(dirtyFile);
                        } catch (FileNotFoundException unused2) {
                            return DiskLruCache.NULL_OUTPUT_STREAM;
                        }
                    }
                    faultHidingOutputStream = new FaultHidingOutputStream(fileOutputStream);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return faultHidingOutputStream;
        }

        public void set(int i, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i), Util.UTF_8);
                try {
                    outputStreamWriter2.write(str);
                    Util.closeQuietly(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    Util.closeQuietly(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public class FaultHidingOutputStream extends FilterOutputStream {
            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }
        }
    }

    public Editor edit(String str) throws IOException {
        return edit(str, -1L);
    }
}

package org.apache.commons.sudcompress.archivers.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p149l.ccw0;
import p149l.ig3;
import p149l.rhg0;
import p149l.vdg0;

/* JADX INFO: loaded from: classes2.dex */
class ZipSplitOutputStream extends OutputStream {
    private static final long ZIP_SEGMENT_MAX_SIZE = 4294967295L;
    private static final long ZIP_SEGMENT_MIN_SIZE = 65536;
    private OutputStream outputStream;
    private final long splitSize;
    private File zipFile;
    private int currentSplitSegmentIndex = 0;
    private long currentSplitSegmentBytesWritten = 0;
    private boolean finished = false;
    private final byte[] singleByte = new byte[1];

    public ZipSplitOutputStream(File file, long j) throws IOException {
        if (j < 65536 || j > ZIP_SEGMENT_MAX_SIZE) {
            ig3.m135964a("zip split segment size should between 64K and 4,294,967,295");
            throw null;
        }
        this.zipFile = file;
        this.splitSize = j;
        this.outputStream = new FileOutputStream(file);
        writeZipSplitSignature();
    }

    private File createNewSplitSegmentFile(Integer num) throws IOException {
        String name;
        int iIntValue = num == null ? this.currentSplitSegmentIndex + 2 : num.intValue();
        String name2 = this.zipFile.getName();
        if (name2 == null) {
            name = null;
        } else {
            name = new File(name2).getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                name = name.substring(0, iLastIndexOf);
            }
        }
        String strM197997a = iIntValue <= 9 ? vdg0.m197997a(iIntValue, ".z0") : vdg0.m197997a(iIntValue, ".z");
        File file = new File(this.zipFile.getParent(), name + strM197997a);
        if (!file.exists()) {
            return file;
        }
        throw new IOException("split zip segment " + name + strM197997a + " already exists");
    }

    private void finish() throws IOException {
        String name;
        if (this.finished) {
            rhg0.m179353a("This archive has already been finished");
            return;
        }
        String name2 = this.zipFile.getName();
        if (name2 == null) {
            name = null;
        } else {
            name = new File(name2).getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                name = name.substring(0, iLastIndexOf);
            }
        }
        File file = new File(this.zipFile.getParentFile(), name + ".zip");
        this.outputStream.close();
        if (this.zipFile.renameTo(file)) {
            this.finished = true;
        } else {
            ccw0.m106203a("Failed to rename ", this.zipFile, " to ", file);
        }
    }

    private OutputStream openNewSplitSegment() throws IOException {
        if (this.currentSplitSegmentIndex == 0) {
            this.outputStream.close();
            File fileCreateNewSplitSegmentFile = createNewSplitSegmentFile(1);
            if (!this.zipFile.renameTo(fileCreateNewSplitSegmentFile)) {
                ccw0.m106203a("Failed to rename ", this.zipFile, " to ", fileCreateNewSplitSegmentFile);
                return null;
            }
        }
        File fileCreateNewSplitSegmentFile2 = createNewSplitSegmentFile(null);
        this.outputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateNewSplitSegmentFile2);
        this.outputStream = fileOutputStream;
        this.currentSplitSegmentBytesWritten = 0L;
        this.zipFile = fileCreateNewSplitSegmentFile2;
        this.currentSplitSegmentIndex++;
        return fileOutputStream;
    }

    private void writeZipSplitSignature() throws IOException {
        OutputStream outputStream = this.outputStream;
        byte[] bArr = ZipArchiveOutputStream.DD_SIG;
        outputStream.write(bArr);
        this.currentSplitSegmentBytesWritten += (long) bArr.length;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.finished) {
            return;
        }
        finish();
    }

    public long getCurrentSplitSegmentBytesWritten() {
        return this.currentSplitSegmentBytesWritten;
    }

    public int getCurrentSplitSegmentIndex() {
        return this.currentSplitSegmentIndex;
    }

    public void prepareToWriteUnsplittableContent(long j) throws IOException {
        long j2 = this.splitSize;
        if (j > j2) {
            ig3.m135964a("The unsplittable content size is bigger than the split segment size");
        } else if (j2 - this.currentSplitSegmentBytesWritten < j) {
            openNewSplitSegment();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return;
        }
        long j = this.currentSplitSegmentBytesWritten;
        long j2 = this.splitSize;
        if (j >= j2) {
            openNewSplitSegment();
            write(bArr, i, i2);
            return;
        }
        long j3 = i2;
        if (j + j3 <= j2) {
            this.outputStream.write(bArr, i, i2);
            this.currentSplitSegmentBytesWritten += j3;
        } else {
            int i3 = ((int) j2) - ((int) j);
            write(bArr, i, i3);
            openNewSplitSegment();
            write(bArr, i + i3, i2 - i3);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.singleByte;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }
}

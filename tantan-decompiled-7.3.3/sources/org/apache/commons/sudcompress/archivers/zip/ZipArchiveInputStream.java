package org.apache.commons.sudcompress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.sudcompress.archivers.ArchiveEntry;
import org.apache.commons.sudcompress.archivers.ArchiveInputStream;
import org.eclipse.jetty.http.HttpTokens;
import org.eclipse.jetty.util.StringUtil;
import p153l.fig0;
import p153l.ijg0;
import p153l.sjg0;
import p153l.tqg0;
import p153l.vg3;
import p153l.xeg0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveInputStream extends ArchiveInputStream {
    private static final int CFH_LEN = 46;
    private static final int LFH_LEN = 30;
    private static final long TWO_EXP_32 = 4294967296L;
    private static final String USE_ZIPFILE_INSTEAD_OF_STREAM_DISCLAIMER = " while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile";
    private boolean allowStoredEntriesWithDataDescriptor;
    private final ByteBuffer buf;
    private boolean closed;
    private CurrentEntry current;
    final String encoding;
    private int entriesRead;
    private boolean hitCentralDirectory;

    /* JADX INFO: renamed from: in */
    private final InputStream f206797in;
    private final Inflater inf;
    private ByteArrayInputStream lastStoredEntry;
    private final byte[] lfhBuf;
    private final byte[] shortBuf;
    private final byte[] skipBuf;
    private final boolean skipSplitSig;
    private final byte[] twoDwordBuf;
    private long uncompressedCount;
    private final boolean useUnicodeExtraFields;
    private final byte[] wordBuf;
    private final ZipEncoding zipEncoding;
    private static final byte[] LFH = ZipLong.LFH_SIG.getBytes();
    private static final byte[] CFH = ZipLong.CFH_SIG.getBytes();

    /* JADX INFO: renamed from: DD */
    private static final byte[] f206796DD = ZipLong.DD_SIG.getBytes();
    private static final byte[] APK_SIGNING_BLOCK_MAGIC = {65, 80, 75, HttpTokens.SPACE, 83, 105, 103, HttpTokens.SPACE, 66, 108, 111, 99, 107, HttpTokens.SPACE, 52, 50};
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: org.apache.commons.sudcompress.archivers.zip.ZipArchiveInputStream$1 */
    public static /* synthetic */ class C219871 {

        /* JADX INFO: renamed from: $SwitchMap$org$apache$commons$sudcompress$archivers$zip$ZipMethod */
        static final /* synthetic */ int[] f206798x101d57ac;

        static {
            int[] iArr = new int[ZipMethod.values().length];
            f206798x101d57ac = iArr;
            try {
                iArr[ZipMethod.UNSHRINKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f206798x101d57ac[ZipMethod.IMPLODING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f206798x101d57ac[ZipMethod.BZIP2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f206798x101d57ac[ZipMethod.ENHANCED_DEFLATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class CurrentEntry {
        private long bytesRead;
        private long bytesReadFromStream;
        private final CRC32 crc;
        private final ZipArchiveEntry entry;
        private boolean hasDataDescriptor;

        /* JADX INFO: renamed from: in */
        private InputStream f206800in;
        private boolean usesZip64;

        private CurrentEntry() {
            this.entry = new ZipArchiveEntry();
            this.crc = new CRC32();
        }
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z, boolean z2, boolean z3) {
        this.inf = new Inflater(true);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(512);
        this.buf = byteBufferAllocate;
        this.current = null;
        this.closed = false;
        this.hitCentralDirectory = false;
        this.lastStoredEntry = null;
        this.allowStoredEntriesWithDataDescriptor = false;
        this.uncompressedCount = 0L;
        this.lfhBuf = new byte[30];
        this.skipBuf = new byte[1024];
        this.shortBuf = new byte[2];
        this.wordBuf = new byte[4];
        this.twoDwordBuf = new byte[16];
        this.entriesRead = 0;
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.useUnicodeExtraFields = z;
        this.f206797in = new PushbackInputStream(inputStream, byteBufferAllocate.capacity());
        this.allowStoredEntriesWithDataDescriptor = z2;
        this.skipSplitSig = z3;
        byteBufferAllocate.limit(0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    private boolean bufferContainsSignature(ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z = false;
        int i5 = 0;
        while (!z) {
            int i6 = i + i2;
            if (i5 >= i6 - 4) {
                break;
            }
            byte b = this.buf.array()[i5];
            byte[] bArr = LFH;
            if (b == bArr[0] && this.buf.array()[i5 + 1] == bArr[1]) {
                if (i5 >= i3 && this.buf.array()[i5 + 2] == bArr[2] && this.buf.array()[i5 + 3] == bArr[3]) {
                    i4 = i5 - i3;
                    z = true;
                } else {
                    byte b2 = this.buf.array()[i5];
                    byte[] bArr2 = CFH;
                    if (b2 == bArr2[2] && this.buf.array()[i5 + 3] == bArr2[3]) {
                        i4 = i5 - i3;
                    } else {
                        byte b3 = this.buf.array()[i5 + 2];
                        byte[] bArr3 = f206796DD;
                        if (b3 == bArr3[2] && this.buf.array()[i5 + 3] == bArr3[3]) {
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    z = true;
                }
                if (z) {
                    pushback(this.buf.array(), i4, i6 - i4);
                    byteArrayOutputStream.write(this.buf.array(), 0, i4);
                    readDataDescriptor();
                }
            }
            i5++;
        }
        return z;
    }

    private int cacheBytesRead(ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = (i4 - i3) - 3;
        if (i5 <= 0) {
            return i4;
        }
        byteArrayOutputStream.write(this.buf.array(), 0, i5);
        int i6 = i3 + 3;
        System.arraycopy(this.buf.array(), i5, this.buf.array(), 0, i6);
        return i6;
    }

    private static boolean checksig(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private void closeEntry() throws IOException {
        if (this.closed) {
            zpg0.m220844a("The stream is closed");
            return;
        }
        if (this.current == null) {
            return;
        }
        if (currentEntryHasOutstandingBytes()) {
            drainCurrentEntryData();
        } else {
            skip(Long.MAX_VALUE);
            int bytesInflated = (int) (this.current.bytesReadFromStream - (this.current.entry.getMethod() == 8 ? getBytesInflated() : this.current.bytesRead));
            if (bytesInflated > 0) {
                pushback(this.buf.array(), this.buf.limit() - bytesInflated, bytesInflated);
                this.current.bytesReadFromStream -= (long) bytesInflated;
            }
            if (currentEntryHasOutstandingBytes()) {
                drainCurrentEntryData();
            }
        }
        if (this.lastStoredEntry == null && this.current.hasDataDescriptor) {
            readDataDescriptor();
        }
        this.inf.reset();
        this.buf.clear().flip();
        this.current = null;
        this.lastStoredEntry = null;
    }

    private boolean currentEntryHasOutstandingBytes() {
        CurrentEntry currentEntry = this.current;
        return currentEntry.bytesReadFromStream <= currentEntry.entry.getCompressedSize() && !this.current.hasDataDescriptor;
    }

    private void drainCurrentEntryData() throws EOFException {
        long compressedSize = this.current.entry.getCompressedSize() - this.current.bytesReadFromStream;
        while (compressedSize > 0) {
            long j = this.f206797in.read(this.buf.array(), 0, (int) Math.min(this.buf.capacity(), compressedSize));
            if (j < 0) {
                throw new EOFException("Truncated ZIP entry: " + sjg0.m186097a(this.current.entry.getName()));
            }
            count(j);
            compressedSize -= j;
        }
    }

    private int fill() throws IOException {
        if (this.closed) {
            zpg0.m220844a("The stream is closed");
            return 0;
        }
        int i = this.f206797in.read(this.buf.array());
        if (i > 0) {
            this.buf.limit(i);
            count(this.buf.limit());
            this.inf.setInput(this.buf.array(), 0, this.buf.limit());
        }
        return i;
    }

    private void findEocdRecord() throws IOException {
        int oneByte = -1;
        while (true) {
            boolean zIsFirstByteOfEocdSig = false;
            while (true) {
                if (!zIsFirstByteOfEocdSig) {
                    oneByte = readOneByte();
                    if (oneByte <= -1) {
                        return;
                    }
                }
                if (!isFirstByteOfEocdSig(oneByte)) {
                    break;
                }
                oneByte = readOneByte();
                byte[] bArr = ZipArchiveOutputStream.EOCD_SIG;
                if (oneByte == bArr[1]) {
                    oneByte = readOneByte();
                    if (oneByte == bArr[2]) {
                        oneByte = readOneByte();
                        if (oneByte == -1 || oneByte == bArr[3]) {
                            return;
                        } else {
                            zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                        }
                    } else if (oneByte == -1) {
                        return;
                    } else {
                        zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                    }
                } else if (oneByte == -1) {
                    return;
                } else {
                    zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                }
            }
        }
    }

    private long getBytesInflated() {
        long bytesRead = this.inf.getBytesRead();
        if (this.current.bytesReadFromStream >= 4294967296L) {
            while (true) {
                long j = bytesRead + 4294967296L;
                if (j > this.current.bytesReadFromStream) {
                    break;
                }
                bytesRead = j;
            }
        }
        return bytesRead;
    }

    private boolean isApkSigningBlock(byte[] bArr) throws IOException {
        BigInteger value = ZipEightByteInteger.getValue(bArr);
        long length = 8 - bArr.length;
        byte[] bArr2 = APK_SIGNING_BLOCK_MAGIC;
        BigInteger bigIntegerAdd = value.add(BigInteger.valueOf(length - ((long) bArr2.length)));
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2];
        try {
            if (bigIntegerAdd.signum() < 0) {
                int length3 = bArr.length + bigIntegerAdd.intValue();
                if (length3 < 8) {
                    return false;
                }
                int iAbs = Math.abs(bigIntegerAdd.intValue());
                System.arraycopy(bArr, length3, bArr3, 0, Math.min(iAbs, length2));
                if (iAbs < length2) {
                    readFully(bArr3, iAbs);
                }
            } else {
                while (true) {
                    BigInteger bigInteger = LONG_MAX;
                    if (bigIntegerAdd.compareTo(bigInteger) <= 0) {
                        break;
                    }
                    realSkip(Long.MAX_VALUE);
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger.negate());
                }
                realSkip(bigIntegerAdd.longValue());
                readFully(bArr3);
            }
            return Arrays.equals(bArr3, APK_SIGNING_BLOCK_MAGIC);
        } catch (EOFException unused) {
            return false;
        }
    }

    private boolean isFirstByteOfEocdSig(int i) {
        return i == ZipArchiveOutputStream.EOCD_SIG[0];
    }

    public static boolean matches(byte[] bArr, int i) {
        byte[] bArr2 = ZipArchiveOutputStream.LFH_SIG;
        if (i < bArr2.length) {
            return false;
        }
        return checksig(bArr, bArr2) || checksig(bArr, ZipArchiveOutputStream.EOCD_SIG) || checksig(bArr, ZipArchiveOutputStream.DD_SIG) || checksig(bArr, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
    }

    private void processZip64Extra(ZipLong zipLong, ZipLong zipLong2) {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = (Zip64ExtendedInformationExtraField) this.current.entry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        CurrentEntry currentEntry = this.current;
        currentEntry.usesZip64 = zip64ExtendedInformationExtraField != null;
        if (currentEntry.hasDataDescriptor) {
            return;
        }
        if (zip64ExtendedInformationExtraField != null) {
            ZipLong zipLong3 = ZipLong.ZIP64_MAGIC;
            if (zipLong3.equals(zipLong2) || zipLong3.equals(zipLong)) {
                this.current.entry.setCompressedSize(zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
                this.current.entry.setSize(zip64ExtendedInformationExtraField.getSize().getLongValue());
                return;
            }
        }
        if (zipLong2 == null || zipLong == null) {
            return;
        }
        this.current.entry.setCompressedSize(zipLong2.getValue());
        this.current.entry.setSize(zipLong.getValue());
    }

    private void pushback(byte[] bArr, int i, int i2) throws IOException {
        ((PushbackInputStream) this.f206797in).unread(bArr, i, i2);
        pushedBackBytes(i2);
    }

    private void readDataDescriptor() throws IOException {
        readFully(this.wordBuf);
        ZipLong zipLong = new ZipLong(this.wordBuf);
        if (ZipLong.DD_SIG.equals(zipLong)) {
            readFully(this.wordBuf);
            zipLong = new ZipLong(this.wordBuf);
        }
        this.current.entry.setCrc(zipLong.getValue());
        readFully(this.twoDwordBuf);
        ZipLong zipLong2 = new ZipLong(this.twoDwordBuf, 8);
        if (!zipLong2.equals(ZipLong.CFH_SIG) && !zipLong2.equals(ZipLong.LFH_SIG)) {
            this.current.entry.setCompressedSize(ZipEightByteInteger.getLongValue(this.twoDwordBuf));
            this.current.entry.setSize(ZipEightByteInteger.getLongValue(this.twoDwordBuf, 8));
        } else {
            pushback(this.twoDwordBuf, 8, 8);
            this.current.entry.setCompressedSize(ZipLong.getValue(this.twoDwordBuf));
            this.current.entry.setSize(ZipLong.getValue(this.twoDwordBuf, 4));
        }
    }

    private int readDeflated(byte[] bArr, int i, int i2) throws IOException {
        int fromInflater = readFromInflater(bArr, i, i2);
        if (fromInflater <= 0) {
            if (this.inf.finished()) {
                return -1;
            }
            if (this.inf.needsDictionary()) {
                throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
            }
            if (fromInflater == -1) {
                zpg0.m220844a("Truncated ZIP file");
                return 0;
            }
        }
        return fromInflater;
    }

    private void readFirstLocalFileHeader(byte[] bArr) throws IOException {
        readFully(bArr);
        ZipLong zipLong = new ZipLong(bArr);
        if (!this.skipSplitSig && zipLong.equals(ZipLong.DD_SIG)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.SPLITTING);
        }
        if (zipLong.equals(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER) || zipLong.equals(ZipLong.DD_SIG)) {
            byte[] bArr2 = new byte[4];
            readFully(bArr2);
            System.arraycopy(bArr, 4, bArr, 0, 26);
            System.arraycopy(bArr2, 0, bArr, 26, 4);
        }
    }

    private int readFromInflater(byte[] bArr, int i, int i2) throws IOException {
        int iInflate = 0;
        do {
            if (this.inf.needsInput()) {
                int iFill = fill();
                if (iFill <= 0) {
                    if (iFill == -1) {
                        return -1;
                    }
                    return iInflate;
                }
                this.current.bytesReadFromStream += (long) this.buf.limit();
            }
            try {
                iInflate = this.inf.inflate(bArr, i, i2);
                if (iInflate != 0) {
                    break;
                }
            } catch (DataFormatException e) {
                throw ((IOException) new ZipException(e.getMessage()).initCause(e));
            }
        } while (this.inf.needsInput());
        return iInflate;
    }

    private void readFully(byte[] bArr, int i) throws IOException {
        int length = bArr.length - i;
        int iM210676a = xeg0.m210676a(this.f206797in, bArr, i, length);
        count(iM210676a);
        if (iM210676a >= length) {
            return;
        }
        vg3.m201207a();
    }

    private int readOneByte() throws IOException {
        int i = this.f206797in.read();
        if (i != -1) {
            count(1);
        }
        return i;
    }

    private int readStored(byte[] bArr, int i, int i2) throws IOException {
        CurrentEntry currentEntry = this.current;
        if (currentEntry.hasDataDescriptor) {
            if (this.lastStoredEntry == null) {
                readStoredEntry();
            }
            return this.lastStoredEntry.read(bArr, i, i2);
        }
        long size = currentEntry.entry.getSize();
        if (this.current.bytesRead >= size) {
            return -1;
        }
        if (this.buf.position() >= this.buf.limit()) {
            this.buf.position(0);
            int i3 = this.f206797in.read(this.buf.array());
            ByteBuffer byteBuffer = this.buf;
            if (i3 == -1) {
                byteBuffer.limit(0);
                zpg0.m220844a("Truncated ZIP file");
                return 0;
            }
            byteBuffer.limit(i3);
            count(i3);
            this.current.bytesReadFromStream += (long) i3;
        }
        int iMin = Math.min(this.buf.remaining(), i2);
        long j = size - this.current.bytesRead;
        if (j < iMin) {
            iMin = (int) j;
        }
        this.buf.get(bArr, i, iMin);
        this.current.bytesRead += (long) iMin;
        return iMin;
    }

    private void readStoredEntry() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zBufferContainsSignature = false;
        int i = this.current.usesZip64 ? 20 : 12;
        int iCacheBytesRead = 0;
        while (!zBufferContainsSignature) {
            int i2 = this.f206797in.read(this.buf.array(), iCacheBytesRead, 512 - iCacheBytesRead);
            if (i2 <= 0) {
                zpg0.m220844a("Truncated ZIP file");
                return;
            }
            int i3 = i2 + iCacheBytesRead;
            if (i3 < 4) {
                iCacheBytesRead = i3;
            } else {
                zBufferContainsSignature = bufferContainsSignature(byteArrayOutputStream, iCacheBytesRead, i2, i);
                if (!zBufferContainsSignature) {
                    iCacheBytesRead = cacheBytesRead(byteArrayOutputStream, iCacheBytesRead, i2, i);
                }
            }
        }
        if (this.current.entry.getCompressedSize() != this.current.entry.getSize()) {
            throw new ZipException("compressed and uncompressed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length != this.current.entry.getSize()) {
            throw new ZipException("actual and claimed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        this.lastStoredEntry = new ByteArrayInputStream(byteArray);
    }

    private void realSkip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            fig0.m125680a();
            return;
        }
        while (j2 < j) {
            long length = j - j2;
            InputStream inputStream = this.f206797in;
            byte[] bArr = this.skipBuf;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = inputStream.read(bArr, 0, (int) length);
            if (i == -1) {
                return;
            }
            count(i);
            j2 += (long) i;
        }
    }

    private void skipRemainderOfArchive() throws IOException {
        realSkip((((long) this.entriesRead) * 46) - 30);
        findEocdRecord();
        realSkip(16L);
        readFully(this.shortBuf);
        realSkip(ZipShort.getValue(this.shortBuf));
    }

    private boolean supportsCompressedSizeFor(ZipArchiveEntry zipArchiveEntry) {
        if (zipArchiveEntry.getCompressedSize() != -1 || zipArchiveEntry.getMethod() == 8 || zipArchiveEntry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()) {
            return true;
        }
        return zipArchiveEntry.getGeneralPurposeBit().usesDataDescriptor() && this.allowStoredEntriesWithDataDescriptor && zipArchiveEntry.getMethod() == 0;
    }

    private boolean supportsDataDescriptorFor(ZipArchiveEntry zipArchiveEntry) {
        if (zipArchiveEntry.getGeneralPurposeBit().usesDataDescriptor()) {
            return (this.allowStoredEntriesWithDataDescriptor && zipArchiveEntry.getMethod() == 0) || zipArchiveEntry.getMethod() == 8 || zipArchiveEntry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode();
        }
        return true;
    }

    @Override // org.apache.commons.sudcompress.archivers.ArchiveInputStream
    public boolean canReadEntryData(ArchiveEntry archiveEntry) {
        if (archiveEntry instanceof ZipArchiveEntry) {
            ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
            if (ZipUtil.canHandleEntryData(zipArchiveEntry) && supportsDataDescriptorFor(zipArchiveEntry) && supportsCompressedSizeFor(zipArchiveEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        try {
            this.f206797in.close();
        } finally {
            this.inf.end();
        }
    }

    public long getCompressedCount() {
        int method = this.current.entry.getMethod();
        CurrentEntry currentEntry = this.current;
        if (method == 0) {
            return currentEntry.bytesRead;
        }
        if (currentEntry.entry.getMethod() == 8) {
            return getBytesInflated();
        }
        int method2 = this.current.entry.getMethod();
        int code = ZipMethod.UNSHRINKING.getCode();
        CurrentEntry currentEntry2 = this.current;
        if (method2 == code) {
            return ((UnshrinkingInputStream) currentEntry2.f206800in).getCompressedCount();
        }
        int method3 = currentEntry2.entry.getMethod();
        int code2 = ZipMethod.IMPLODING.getCode();
        CurrentEntry currentEntry3 = this.current;
        if (method3 == code2) {
            return ((ExplodingInputStream) currentEntry3.f206800in).getCompressedCount();
        }
        int method4 = currentEntry3.entry.getMethod();
        int code3 = ZipMethod.ENHANCED_DEFLATED.getCode();
        CurrentEntry currentEntry4 = this.current;
        if (method4 == code3) {
            return ((ijg0) currentEntry4.f206800in).f115220c;
        }
        if (currentEntry4.entry.getMethod() == ZipMethod.BZIP2.getCode()) {
            return ((tqg0) this.current.f206800in).f175717g.getBytesRead();
        }
        return -1L;
    }

    @Override // org.apache.commons.sudcompress.archivers.ArchiveInputStream
    public ArchiveEntry getNextEntry() {
        return getNextZipEntry();
    }

    public ZipArchiveEntry getNextZipEntry() throws IOException {
        boolean z;
        ZipLong zipLong;
        ZipLong zipLong2;
        this.uncompressedCount = 0L;
        if (!this.closed && !this.hitCentralDirectory) {
            if (this.current != null) {
                closeEntry();
                z = false;
            } else {
                z = true;
            }
            long bytesRead = getBytesRead();
            byte[] bArr = this.lfhBuf;
            try {
                if (z) {
                    readFirstLocalFileHeader(bArr);
                } else {
                    readFully(bArr);
                }
                ZipLong zipLong3 = new ZipLong(this.lfhBuf);
                if (!zipLong3.equals(ZipLong.LFH_SIG)) {
                    if (!zipLong3.equals(ZipLong.CFH_SIG) && !zipLong3.equals(ZipLong.AED_SIG) && !isApkSigningBlock(this.lfhBuf)) {
                        throw new ZipException(String.format("Unexpected record signature: 0X%X", Long.valueOf(zipLong3.getValue())));
                    }
                    this.hitCentralDirectory = true;
                    skipRemainderOfArchive();
                    return null;
                }
                this.current = new CurrentEntry();
                this.current.entry.setPlatform((ZipShort.getValue(this.lfhBuf, 4) >> 8) & 15);
                GeneralPurposeBit generalPurposeBit = GeneralPurposeBit.parse(this.lfhBuf, 6);
                boolean zUsesUTF8ForNames = generalPurposeBit.usesUTF8ForNames();
                ZipEncoding zipEncoding = zUsesUTF8ForNames ? ZipEncodingHelper.UTF8_ZIP_ENCODING : this.zipEncoding;
                this.current.hasDataDescriptor = generalPurposeBit.usesDataDescriptor();
                this.current.entry.setGeneralPurposeBit(generalPurposeBit);
                this.current.entry.setMethod(ZipShort.getValue(this.lfhBuf, 8));
                this.current.entry.setTime(ZipUtil.dosToJavaTime(ZipLong.getValue(this.lfhBuf, 10)));
                CurrentEntry currentEntry = this.current;
                if (currentEntry.hasDataDescriptor) {
                    zipLong = null;
                    zipLong2 = null;
                } else {
                    currentEntry.entry.setCrc(ZipLong.getValue(this.lfhBuf, 14));
                    zipLong = new ZipLong(this.lfhBuf, 18);
                    zipLong2 = new ZipLong(this.lfhBuf, 22);
                }
                int value = ZipShort.getValue(this.lfhBuf, 26);
                int value2 = ZipShort.getValue(this.lfhBuf, 28);
                byte[] bArr2 = new byte[value];
                readFully(bArr2);
                this.current.entry.setName(zipEncoding.decode(bArr2), bArr2);
                if (zUsesUTF8ForNames) {
                    this.current.entry.setNameSource(ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG);
                }
                byte[] bArr3 = new byte[value2];
                readFully(bArr3);
                this.current.entry.setExtra(bArr3);
                if (!zUsesUTF8ForNames && this.useUnicodeExtraFields) {
                    ZipUtil.setNameAndCommentFromExtraFields(this.current.entry, bArr2, null);
                }
                processZip64Extra(zipLong2, zipLong);
                this.current.entry.setLocalHeaderOffset(bytesRead);
                this.current.entry.setDataOffset(getBytesRead());
                this.current.entry.setStreamContiguous(true);
                ZipMethod methodByCode = ZipMethod.getMethodByCode(this.current.entry.getMethod());
                if (this.current.entry.getCompressedSize() != -1) {
                    if (ZipUtil.canHandleEntryData(this.current.entry) && methodByCode != ZipMethod.STORED && methodByCode != ZipMethod.DEFLATED) {
                        BoundedInputStream boundedInputStream = new BoundedInputStream(this.f206797in, this.current.entry.getCompressedSize());
                        int i = C219871.f206798x101d57ac[methodByCode.ordinal()];
                        if (i == 1) {
                            this.current.f206800in = new UnshrinkingInputStream(boundedInputStream);
                        } else if (i == 2) {
                            CurrentEntry currentEntry2 = this.current;
                            currentEntry2.f206800in = new ExplodingInputStream(currentEntry2.entry.getGeneralPurposeBit().getSlidingDictionarySize(), this.current.entry.getGeneralPurposeBit().getNumberOfShannonFanoTrees(), boundedInputStream);
                        } else if (i == 3) {
                            this.current.f206800in = new tqg0(boundedInputStream);
                        } else if (i == 4) {
                            this.current.f206800in = new ijg0(boundedInputStream);
                        }
                    }
                } else if (methodByCode == ZipMethod.ENHANCED_DEFLATED) {
                    this.current.f206800in = new ijg0(this.f206797in);
                }
                this.entriesRead++;
                return this.current.entry;
            } catch (EOFException unused) {
            }
        }
        return null;
    }

    public long getUncompressedCount() {
        return this.uncompressedCount;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int deflated;
        if (i2 == 0) {
            return 0;
        }
        if (this.closed) {
            zpg0.m220844a("The stream is closed");
            return 0;
        }
        CurrentEntry currentEntry = this.current;
        if (currentEntry == null) {
            return -1;
        }
        if (i > bArr.length || i2 < 0 || i < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        if (!supportsDataDescriptorFor(this.current.entry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, this.current.entry);
        }
        if (!supportsCompressedSizeFor(this.current.entry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE, this.current.entry);
        }
        if (this.current.entry.getMethod() == 0) {
            deflated = readStored(bArr, i, i2);
        } else if (this.current.entry.getMethod() == 8) {
            deflated = readDeflated(bArr, i, i2);
        } else {
            if (this.current.entry.getMethod() != ZipMethod.UNSHRINKING.getCode() && this.current.entry.getMethod() != ZipMethod.IMPLODING.getCode() && this.current.entry.getMethod() != ZipMethod.ENHANCED_DEFLATED.getCode() && this.current.entry.getMethod() != ZipMethod.BZIP2.getCode()) {
                throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(this.current.entry.getMethod()), this.current.entry);
            }
            deflated = this.current.f206800in.read(bArr, i, i2);
        }
        if (deflated >= 0) {
            this.current.crc.update(bArr, i, deflated);
            this.uncompressedCount += (long) deflated;
        }
        return deflated;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            fig0.m125680a();
            return 0L;
        }
        while (j2 < j) {
            long length = j - j2;
            byte[] bArr = this.skipBuf;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = read(bArr, 0, (int) length);
            if (i == -1) {
                break;
            }
            j2 += (long) i;
        }
        return j2;
    }

    private void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0);
    }

    public class BoundedInputStream extends InputStream {

        /* JADX INFO: renamed from: in */
        private final InputStream f206799in;
        private final long max;
        private long pos = 0;

        public BoundedInputStream(InputStream inputStream, long j) {
            this.max = j;
            this.f206799in = inputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            long j = this.max;
            if (j < 0 || this.pos < j) {
                return this.f206799in.available();
            }
            return 0;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int i3 = this.f206799in.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.pos) : i2));
            if (i3 == -1) {
                return -1;
            }
            long j2 = i3;
            this.pos += j2;
            ZipArchiveInputStream.this.count(i3);
            ZipArchiveInputStream.this.current.bytesReadFromStream += j2;
            return i3;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            long j2 = this.max;
            if (j2 >= 0) {
                j = Math.min(j, j2 - this.pos);
            }
            long jM210677b = xeg0.m210677b(this.f206799in, j);
            this.pos += jM210677b;
            return jM210677b;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int i = this.f206799in.read();
            this.pos++;
            ZipArchiveInputStream.this.count(1);
            ZipArchiveInputStream.this.current.bytesReadFromStream++;
            return i;
        }
    }

    public ZipArchiveInputStream(InputStream inputStream, String str) {
        this(inputStream, str, true);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z) {
        this(inputStream, str, z, false);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z, boolean z2) {
        this(inputStream, str, z, z2, false);
    }

    public ZipArchiveInputStream(InputStream inputStream) {
        this(inputStream, StringUtil.__UTF8Alt);
    }
}

package org.apache.commons.sudcompress.archivers.zip;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.eclipse.jetty.util.StringUtil;
import p153l.ezg0;
import p153l.ijg0;
import p153l.tqg0;
import p153l.vg3;
import p153l.xeg0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class ZipFile implements Closeable {
    static final int BYTE_SHIFT = 8;
    private static final int CFD_DISK_OFFSET = 6;
    private static final int CFD_LOCATOR_OFFSET = 16;
    private static final int CFD_LOCATOR_RELATIVE_OFFSET = 8;
    private static final int CFH_LEN = 42;
    private static final int HASH_SIZE = 509;
    private static final long LFH_OFFSET_FOR_FILENAME_LENGTH = 26;
    private static final int MAX_EOCD_SIZE = 65557;
    static final int MIN_EOCD_SIZE = 22;
    static final int NIBLET_MASK = 15;
    private static final int POS_0 = 0;
    private static final int POS_1 = 1;
    private static final int POS_2 = 2;
    private static final int POS_3 = 3;
    private static final int ZIP64_EOCDL_LENGTH = 20;
    private static final int ZIP64_EOCDL_LOCATOR_OFFSET = 8;
    private static final int ZIP64_EOCD_CFD_DISK_OFFSET = 20;
    private static final int ZIP64_EOCD_CFD_LOCATOR_OFFSET = 48;
    private static final int ZIP64_EOCD_CFD_LOCATOR_RELATIVE_OFFSET = 24;
    private final SeekableByteChannel archive;
    private final String archiveName;
    private final ByteBuffer cfhBbuf;
    private final byte[] cfhBuf;
    private volatile boolean closed;
    private final ByteBuffer dwordBbuf;
    private final byte[] dwordBuf;
    private final String encoding;
    private final List<ZipArchiveEntry> entries;
    private final boolean isSplitZipArchive;
    private final Map<String, LinkedList<ZipArchiveEntry>> nameMap;
    private final Comparator<ZipArchiveEntry> offsetComparator;
    private final ByteBuffer shortBbuf;
    private final byte[] shortBuf;
    private final boolean useUnicodeExtraFields;
    private final ByteBuffer wordBbuf;
    private final byte[] wordBuf;
    private final ZipEncoding zipEncoding;
    private static final byte[] ONE_ZERO_BYTE = new byte[1];
    private static final long CFH_SIG = ZipLong.getValue(ZipArchiveOutputStream.CFH_SIG);

    /* JADX INFO: renamed from: org.apache.commons.sudcompress.archivers.zip.ZipFile$3 */
    public static /* synthetic */ class C219903 {

        /* JADX INFO: renamed from: $SwitchMap$org$apache$commons$sudcompress$archivers$zip$ZipMethod */
        static final /* synthetic */ int[] f206801x101d57ac;

        static {
            int[] iArr = new int[ZipMethod.values().length];
            f206801x101d57ac = iArr;
            try {
                iArr[ZipMethod.STORED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f206801x101d57ac[ZipMethod.UNSHRINKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f206801x101d57ac[ZipMethod.IMPLODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f206801x101d57ac[ZipMethod.DEFLATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f206801x101d57ac[ZipMethod.BZIP2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f206801x101d57ac[ZipMethod.ENHANCED_DEFLATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f206801x101d57ac[ZipMethod.AES_ENCRYPTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f206801x101d57ac[ZipMethod.EXPANDING_LEVEL_1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f206801x101d57ac[ZipMethod.EXPANDING_LEVEL_2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f206801x101d57ac[ZipMethod.EXPANDING_LEVEL_3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f206801x101d57ac[ZipMethod.EXPANDING_LEVEL_4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f206801x101d57ac[ZipMethod.JPEG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f206801x101d57ac[ZipMethod.LZMA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f206801x101d57ac[ZipMethod.PKWARE_IMPLODING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f206801x101d57ac[ZipMethod.PPMD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f206801x101d57ac[ZipMethod.TOKENIZATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f206801x101d57ac[ZipMethod.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f206801x101d57ac[ZipMethod.WAVPACK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f206801x101d57ac[ZipMethod.XZ.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public class BoundedFileChannelInputStream extends BoundedInputStream {
        private final FileChannel archive;

        public BoundedFileChannelInputStream(long j, long j2) {
            super(j, j2);
            this.archive = (FileChannel) ZipFile.this.archive;
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.ZipFile.BoundedInputStream
        public int read(long j, ByteBuffer byteBuffer) throws IOException {
            int i = this.archive.read(byteBuffer, j);
            byteBuffer.flip();
            return i;
        }
    }

    public static class Entry extends ZipArchiveEntry {
        @Override // org.apache.commons.sudcompress.archivers.zip.ZipArchiveEntry
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                Entry entry = (Entry) obj;
                if (getLocalHeaderOffset() == entry.getLocalHeaderOffset() && super.getDataOffset() == entry.getDataOffset() && super.getDiskNumberStart() == entry.getDiskNumberStart()) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.ZipArchiveEntry, java.util.zip.ZipEntry
        public int hashCode() {
            return (super.hashCode() * 3) + ((int) getLocalHeaderOffset()) + ((int) (getLocalHeaderOffset() >> 32));
        }
    }

    public static final class NameAndComment {
        private final byte[] comment;
        private final byte[] name;

        private NameAndComment(byte[] bArr, byte[] bArr2) {
            this.name = bArr;
            this.comment = bArr2;
        }
    }

    public static class StoredStatisticsStream extends ezg0 {
        public StoredStatisticsStream(InputStream inputStream) {
            super(inputStream);
        }

        public long getCompressedCount() {
            return super.getBytesRead();
        }

        public long getUncompressedCount() {
            return getCompressedCount();
        }
    }

    private ZipFile(SeekableByteChannel seekableByteChannel, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.entries = new LinkedList();
        this.nameMap = new HashMap(HASH_SIZE);
        this.closed = true;
        byte[] bArr = new byte[8];
        this.dwordBuf = bArr;
        byte[] bArr2 = new byte[4];
        this.wordBuf = bArr2;
        byte[] bArr3 = new byte[42];
        this.cfhBuf = bArr3;
        byte[] bArr4 = new byte[2];
        this.shortBuf = bArr4;
        this.dwordBbuf = ByteBuffer.wrap(bArr);
        this.wordBbuf = ByteBuffer.wrap(bArr2);
        this.cfhBbuf = ByteBuffer.wrap(bArr3);
        this.shortBbuf = ByteBuffer.wrap(bArr4);
        this.offsetComparator = new Comparator<ZipArchiveEntry>() { // from class: org.apache.commons.sudcompress.archivers.zip.ZipFile.2
            @Override // java.util.Comparator
            public int compare(ZipArchiveEntry zipArchiveEntry, ZipArchiveEntry zipArchiveEntry2) {
                if (zipArchiveEntry == zipArchiveEntry2) {
                    return 0;
                }
                Entry entry = zipArchiveEntry instanceof Entry ? (Entry) zipArchiveEntry : null;
                Entry entry2 = zipArchiveEntry2 instanceof Entry ? (Entry) zipArchiveEntry2 : null;
                if (entry == null) {
                    return 1;
                }
                if (entry2 == null) {
                    return -1;
                }
                long diskNumberStart = entry.getDiskNumberStart() - entry2.getDiskNumberStart();
                if (diskNumberStart != 0) {
                    return diskNumberStart < 0 ? -1 : 1;
                }
                long localHeaderOffset = entry.getLocalHeaderOffset() - entry2.getLocalHeaderOffset();
                if (localHeaderOffset == 0) {
                    return 0;
                }
                return localHeaderOffset < 0 ? -1 : 1;
            }
        };
        this.isSplitZipArchive = seekableByteChannel instanceof ZipSplitReadOnlySeekableByteChannel;
        this.archiveName = str;
        this.encoding = str2;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str2);
        this.useUnicodeExtraFields = z;
        this.archive = seekableByteChannel;
        try {
            Map<ZipArchiveEntry, NameAndComment> mapPopulateFromCentralDirectory = populateFromCentralDirectory();
            if (!z3) {
                resolveLocalFileHeaderData(mapPopulateFromCentralDirectory);
            }
            fillNameMap();
            this.closed = false;
        } catch (Throwable th) {
            this.closed = true;
            if (z2) {
                xeg0.m210678c(this.archive);
            }
            throw th;
        }
    }

    public static void closeQuietly(ZipFile zipFile) {
        xeg0.m210678c(zipFile);
    }

    private BoundedInputStream createBoundedInputStream(long j, long j2) {
        return this.archive instanceof FileChannel ? new BoundedFileChannelInputStream(j, j2) : new BoundedInputStream(j, j2);
    }

    private void fillNameMap() {
        for (ZipArchiveEntry zipArchiveEntry : this.entries) {
            String name = zipArchiveEntry.getName();
            LinkedList<ZipArchiveEntry> linkedList = this.nameMap.get(name);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.nameMap.put(name, linkedList);
            }
            linkedList.addLast(zipArchiveEntry);
        }
    }

    private long getDataOffset(ZipArchiveEntry zipArchiveEntry) throws IOException {
        long dataOffset = zipArchiveEntry.getDataOffset();
        if (dataOffset != -1) {
            return dataOffset;
        }
        setDataOffset(zipArchiveEntry);
        return zipArchiveEntry.getDataOffset();
    }

    private Map<ZipArchiveEntry, NameAndComment> populateFromCentralDirectory() throws IOException {
        HashMap map = new HashMap();
        positionAtCentralDirectory();
        this.wordBbuf.rewind();
        xeg0.m210679d(this.archive, this.wordBbuf);
        long value = ZipLong.getValue(this.wordBuf);
        if (value != CFH_SIG && startsWithLocalFileHeader()) {
            zpg0.m220844a("Central directory is empty, can't expand corrupt archive.");
            return null;
        }
        while (value == CFH_SIG) {
            readCentralDirectoryEntry(map);
            this.wordBbuf.rewind();
            xeg0.m210679d(this.archive, this.wordBbuf);
            value = ZipLong.getValue(this.wordBuf);
        }
        return map;
    }

    private void positionAtCentralDirectory() throws IOException {
        positionAtEndOfCentralDirectoryRecord();
        boolean zEquals = false;
        boolean z = this.archive.position() > 20;
        if (z) {
            SeekableByteChannel seekableByteChannel = this.archive;
            seekableByteChannel.position(seekableByteChannel.position() - 20);
            this.wordBbuf.rewind();
            xeg0.m210679d(this.archive, this.wordBbuf);
            zEquals = Arrays.equals(ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG, this.wordBuf);
        }
        if (zEquals) {
            positionAtCentralDirectory64();
            return;
        }
        if (z) {
            skipBytes(16);
        }
        positionAtCentralDirectory32();
    }

    private void positionAtCentralDirectory32() throws IOException {
        if (!this.isSplitZipArchive) {
            skipBytes(16);
            this.wordBbuf.rewind();
            xeg0.m210679d(this.archive, this.wordBbuf);
            this.archive.position(ZipLong.getValue(this.wordBuf));
            return;
        }
        skipBytes(6);
        this.shortBbuf.rewind();
        xeg0.m210679d(this.archive, this.shortBbuf);
        int value = ZipShort.getValue(this.shortBuf);
        skipBytes(8);
        this.wordBbuf.rewind();
        xeg0.m210679d(this.archive, this.wordBbuf);
        ((ZipSplitReadOnlySeekableByteChannel) this.archive).position(value, ZipLong.getValue(this.wordBuf));
    }

    private void positionAtCentralDirectory64() throws IOException {
        if (this.isSplitZipArchive) {
            this.wordBbuf.rewind();
            xeg0.m210679d(this.archive, this.wordBbuf);
            long value = ZipLong.getValue(this.wordBuf);
            this.dwordBbuf.rewind();
            xeg0.m210679d(this.archive, this.dwordBbuf);
            ((ZipSplitReadOnlySeekableByteChannel) this.archive).position(value, ZipEightByteInteger.getLongValue(this.dwordBuf));
        } else {
            skipBytes(4);
            this.dwordBbuf.rewind();
            xeg0.m210679d(this.archive, this.dwordBbuf);
            this.archive.position(ZipEightByteInteger.getLongValue(this.dwordBuf));
        }
        this.wordBbuf.rewind();
        xeg0.m210679d(this.archive, this.wordBbuf);
        if (!Arrays.equals(this.wordBuf, ZipArchiveOutputStream.ZIP64_EOCD_SIG)) {
            throw new ZipException("Archive's ZIP64 end of central directory locator is corrupt.");
        }
        if (!this.isSplitZipArchive) {
            skipBytes(44);
            this.dwordBbuf.rewind();
            xeg0.m210679d(this.archive, this.dwordBbuf);
            this.archive.position(ZipEightByteInteger.getLongValue(this.dwordBuf));
            return;
        }
        skipBytes(16);
        this.wordBbuf.rewind();
        xeg0.m210679d(this.archive, this.wordBbuf);
        long value2 = ZipLong.getValue(this.wordBuf);
        skipBytes(24);
        this.dwordBbuf.rewind();
        xeg0.m210679d(this.archive, this.dwordBbuf);
        ((ZipSplitReadOnlySeekableByteChannel) this.archive).position(value2, ZipEightByteInteger.getLongValue(this.dwordBuf));
    }

    private void positionAtEndOfCentralDirectoryRecord() throws ZipException {
        if (!tryToLocateSignature(22L, 65557L, ZipArchiveOutputStream.EOCD_SIG)) {
            throw new ZipException("Archive is not a ZIP archive");
        }
    }

    private void readCentralDirectoryEntry(Map<ZipArchiveEntry, NameAndComment> map) throws IOException {
        this.cfhBbuf.rewind();
        xeg0.m210679d(this.archive, this.cfhBbuf);
        Entry entry = new Entry();
        int value = ZipShort.getValue(this.cfhBuf, 0);
        entry.setVersionMadeBy(value);
        entry.setPlatform((value >> 8) & 15);
        entry.setVersionRequired(ZipShort.getValue(this.cfhBuf, 2));
        GeneralPurposeBit generalPurposeBit = GeneralPurposeBit.parse(this.cfhBuf, 4);
        boolean zUsesUTF8ForNames = generalPurposeBit.usesUTF8ForNames();
        ZipEncoding zipEncoding = zUsesUTF8ForNames ? ZipEncodingHelper.UTF8_ZIP_ENCODING : this.zipEncoding;
        if (zUsesUTF8ForNames) {
            entry.setNameSource(ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG);
        }
        entry.setGeneralPurposeBit(generalPurposeBit);
        entry.setRawFlag(ZipShort.getValue(this.cfhBuf, 4));
        entry.setMethod(ZipShort.getValue(this.cfhBuf, 6));
        entry.setTime(ZipUtil.dosToJavaTime(ZipLong.getValue(this.cfhBuf, 8)));
        entry.setCrc(ZipLong.getValue(this.cfhBuf, 12));
        entry.setCompressedSize(ZipLong.getValue(this.cfhBuf, 16));
        entry.setSize(ZipLong.getValue(this.cfhBuf, 20));
        int value2 = ZipShort.getValue(this.cfhBuf, 24);
        int value3 = ZipShort.getValue(this.cfhBuf, 26);
        int value4 = ZipShort.getValue(this.cfhBuf, 28);
        entry.setDiskNumberStart(ZipShort.getValue(this.cfhBuf, 30));
        entry.setInternalAttributes(ZipShort.getValue(this.cfhBuf, 32));
        entry.setExternalAttributes(ZipLong.getValue(this.cfhBuf, 34));
        byte[] bArr = new byte[value2];
        xeg0.m210679d(this.archive, ByteBuffer.wrap(bArr));
        entry.setName(zipEncoding.decode(bArr), bArr);
        entry.setLocalHeaderOffset(ZipLong.getValue(this.cfhBuf, 38));
        this.entries.add(entry);
        byte[] bArr2 = new byte[value3];
        xeg0.m210679d(this.archive, ByteBuffer.wrap(bArr2));
        entry.setCentralDirectoryExtra(bArr2);
        setSizesAndOffsetFromZip64Extra(entry);
        byte[] bArr3 = new byte[value4];
        xeg0.m210679d(this.archive, ByteBuffer.wrap(bArr3));
        entry.setComment(zipEncoding.decode(bArr3));
        if (!zUsesUTF8ForNames && this.useUnicodeExtraFields) {
            map.put(entry, new NameAndComment(bArr, bArr3));
        }
        entry.setStreamContiguous(true);
    }

    private void resolveLocalFileHeaderData(Map<ZipArchiveEntry, NameAndComment> map) throws IOException {
        Iterator<ZipArchiveEntry> it = this.entries.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int[] dataOffset = setDataOffset(entry);
            int i = dataOffset[0];
            int i2 = dataOffset[1];
            skipBytes(i);
            byte[] bArr = new byte[i2];
            xeg0.m210679d(this.archive, ByteBuffer.wrap(bArr));
            entry.setExtra(bArr);
            if (map.containsKey(entry)) {
                NameAndComment nameAndComment = map.get(entry);
                ZipUtil.setNameAndCommentFromExtraFields(entry, nameAndComment.name, nameAndComment.comment);
            }
        }
    }

    private int[] setDataOffset(ZipArchiveEntry zipArchiveEntry) throws IOException {
        long localHeaderOffset = zipArchiveEntry.getLocalHeaderOffset();
        boolean z = this.isSplitZipArchive;
        SeekableByteChannel seekableByteChannel = this.archive;
        if (z) {
            ((ZipSplitReadOnlySeekableByteChannel) seekableByteChannel).position(zipArchiveEntry.getDiskNumberStart(), localHeaderOffset + LFH_OFFSET_FOR_FILENAME_LENGTH);
            localHeaderOffset = this.archive.position() - LFH_OFFSET_FOR_FILENAME_LENGTH;
        } else {
            seekableByteChannel.position(LFH_OFFSET_FOR_FILENAME_LENGTH + localHeaderOffset);
        }
        this.wordBbuf.rewind();
        xeg0.m210679d(this.archive, this.wordBbuf);
        this.wordBbuf.flip();
        this.wordBbuf.get(this.shortBuf);
        int value = ZipShort.getValue(this.shortBuf);
        this.wordBbuf.get(this.shortBuf);
        int value2 = ZipShort.getValue(this.shortBuf);
        zipArchiveEntry.setDataOffset(localHeaderOffset + 30 + ((long) value) + ((long) value2));
        return new int[]{value, value2};
    }

    private void setSizesAndOffsetFromZip64Extra(ZipArchiveEntry zipArchiveEntry) throws ZipException {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = (Zip64ExtendedInformationExtraField) zipArchiveEntry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        if (zip64ExtendedInformationExtraField != null) {
            boolean z = zipArchiveEntry.getSize() == 4294967295L;
            boolean z2 = zipArchiveEntry.getCompressedSize() == 4294967295L;
            boolean z3 = zipArchiveEntry.getLocalHeaderOffset() == 4294967295L;
            boolean z4 = zipArchiveEntry.getDiskNumberStart() == 65535;
            zip64ExtendedInformationExtraField.reparseCentralDirectoryData(z, z2, z3, z4);
            if (z) {
                zipArchiveEntry.setSize(zip64ExtendedInformationExtraField.getSize().getLongValue());
            } else if (z2) {
                zip64ExtendedInformationExtraField.setSize(new ZipEightByteInteger(zipArchiveEntry.getSize()));
            }
            if (z2) {
                zipArchiveEntry.setCompressedSize(zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
            } else if (z) {
                zip64ExtendedInformationExtraField.setCompressedSize(new ZipEightByteInteger(zipArchiveEntry.getCompressedSize()));
            }
            if (z3) {
                zipArchiveEntry.setLocalHeaderOffset(zip64ExtendedInformationExtraField.getRelativeHeaderOffset().getLongValue());
            }
            if (z4) {
                zipArchiveEntry.setDiskNumberStart(zip64ExtendedInformationExtraField.getDiskStartNumber().getValue());
            }
        }
    }

    private void skipBytes(int i) throws IOException {
        long jPosition = this.archive.position() + ((long) i);
        if (jPosition <= this.archive.size()) {
            this.archive.position(jPosition);
        } else {
            vg3.m201207a();
        }
    }

    private boolean startsWithLocalFileHeader() throws IOException {
        this.archive.position(0L);
        this.wordBbuf.rewind();
        xeg0.m210679d(this.archive, this.wordBbuf);
        return Arrays.equals(this.wordBuf, ZipArchiveOutputStream.LFH_SIG);
    }

    private boolean tryToLocateSignature(long j, long j2, byte[] bArr) throws IOException {
        long size = this.archive.size() - j;
        long jMax = Math.max(0L, this.archive.size() - j2);
        boolean z = false;
        if (size >= 0) {
            while (size >= jMax) {
                this.archive.position(size);
                try {
                    this.wordBbuf.rewind();
                    xeg0.m210679d(this.archive, this.wordBbuf);
                    this.wordBbuf.flip();
                    if (this.wordBbuf.get() == bArr[0] && this.wordBbuf.get() == bArr[1] && this.wordBbuf.get() == bArr[2] && this.wordBbuf.get() == bArr[3]) {
                        z = true;
                        break;
                    }
                    size--;
                } catch (EOFException unused) {
                }
            }
        }
        if (z) {
            this.archive.position(size);
        }
        return z;
    }

    public boolean canReadEntryData(ZipArchiveEntry zipArchiveEntry) {
        return ZipUtil.canHandleEntryData(zipArchiveEntry);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.archive.close();
    }

    public void copyRawEntries(ZipArchiveOutputStream zipArchiveOutputStream, ZipArchiveEntryPredicate zipArchiveEntryPredicate) throws IOException {
        Enumeration<ZipArchiveEntry> entriesInPhysicalOrder = getEntriesInPhysicalOrder();
        while (entriesInPhysicalOrder.hasMoreElements()) {
            ZipArchiveEntry zipArchiveEntryNextElement = entriesInPhysicalOrder.nextElement();
            if (zipArchiveEntryPredicate.test(zipArchiveEntryNextElement)) {
                zipArchiveOutputStream.addRawArchiveEntry(zipArchiveEntryNextElement, getRawInputStream(zipArchiveEntryNextElement));
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            if (!this.closed) {
                System.err.println("Cleaning up unclosed ZipFile for archive " + this.archiveName);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public String getEncoding() {
        return this.encoding;
    }

    public Iterable<ZipArchiveEntry> getEntries(String str) {
        LinkedList<ZipArchiveEntry> linkedList = this.nameMap.get(str);
        return linkedList != null ? linkedList : Collections.EMPTY_LIST;
    }

    public Iterable<ZipArchiveEntry> getEntriesInPhysicalOrder(String str) {
        ZipArchiveEntry[] zipArchiveEntryArr = new ZipArchiveEntry[0];
        if (this.nameMap.containsKey(str)) {
            zipArchiveEntryArr = (ZipArchiveEntry[]) this.nameMap.get(str).toArray(zipArchiveEntryArr);
            Arrays.sort(zipArchiveEntryArr, this.offsetComparator);
        }
        return Arrays.asList(zipArchiveEntryArr);
    }

    public ZipArchiveEntry getEntry(String str) {
        LinkedList<ZipArchiveEntry> linkedList = this.nameMap.get(str);
        if (linkedList != null) {
            return linkedList.getFirst();
        }
        return null;
    }

    public InputStream getInputStream(ZipArchiveEntry zipArchiveEntry) throws UnsupportedZipFeatureException {
        if (!(zipArchiveEntry instanceof Entry)) {
            return null;
        }
        ZipUtil.checkRequestedFeatures(zipArchiveEntry);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(createBoundedInputStream(getDataOffset(zipArchiveEntry), zipArchiveEntry.getCompressedSize()));
        switch (C219903.f206801x101d57ac[ZipMethod.getMethodByCode(zipArchiveEntry.getMethod()).ordinal()]) {
            case 1:
                return new StoredStatisticsStream(bufferedInputStream);
            case 2:
                return new UnshrinkingInputStream(bufferedInputStream);
            case 3:
                return new ExplodingInputStream(zipArchiveEntry.getGeneralPurposeBit().getSlidingDictionarySize(), zipArchiveEntry.getGeneralPurposeBit().getNumberOfShannonFanoTrees(), bufferedInputStream);
            case 4:
                final Inflater inflater = new Inflater(true);
                return new InflaterInputStreamWithStatistics(new SequenceInputStream(bufferedInputStream, new ByteArrayInputStream(ONE_ZERO_BYTE)), inflater) { // from class: org.apache.commons.sudcompress.archivers.zip.ZipFile.1
                    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        try {
                            super.close();
                        } finally {
                            inflater.end();
                        }
                    }
                };
            case 5:
                return new tqg0(bufferedInputStream);
            case 6:
                return new ijg0(bufferedInputStream);
            default:
                throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(zipArchiveEntry.getMethod()), zipArchiveEntry);
        }
    }

    public InputStream getRawInputStream(ZipArchiveEntry zipArchiveEntry) {
        if (!(zipArchiveEntry instanceof Entry)) {
            return null;
        }
        long dataOffset = zipArchiveEntry.getDataOffset();
        if (dataOffset == -1) {
            return null;
        }
        return createBoundedInputStream(dataOffset, zipArchiveEntry.getCompressedSize());
    }

    public String getUnixSymlink(ZipArchiveEntry zipArchiveEntry) throws IOException {
        if (zipArchiveEntry == null || !zipArchiveEntry.isUnixSymlink()) {
            return null;
        }
        InputStream inputStream = getInputStream(zipArchiveEntry);
        try {
            ZipEncoding zipEncoding = this.zipEncoding;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8024];
            while (true) {
                int i = inputStream.read(bArr);
                if (-1 == i) {
                    String strDecode = zipEncoding.decode(byteArrayOutputStream.toByteArray());
                    inputStream.close();
                    return strDecode;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Enumeration<ZipArchiveEntry> getEntries() {
        return Collections.enumeration(this.entries);
    }

    public Enumeration<ZipArchiveEntry> getEntriesInPhysicalOrder() {
        List<ZipArchiveEntry> list = this.entries;
        ZipArchiveEntry[] zipArchiveEntryArr = (ZipArchiveEntry[]) list.toArray(new ZipArchiveEntry[list.size()]);
        Arrays.sort(zipArchiveEntryArr, this.offsetComparator);
        return Collections.enumeration(Arrays.asList(zipArchiveEntryArr));
    }

    public class BoundedInputStream extends InputStream {
        private final long end;
        private long loc;
        private ByteBuffer singleByteBuffer;

        public BoundedInputStream(long j, long j2) {
            long j3 = j + j2;
            this.end = j3;
            if (j3 >= j) {
                this.loc = j;
                return;
            }
            throw new IllegalArgumentException("Invalid length of stream at offset=" + j + ", length=" + j2);
        }

        @Override // java.io.InputStream
        public synchronized int read() {
            try {
                if (this.loc >= this.end) {
                    return -1;
                }
                ByteBuffer byteBuffer = this.singleByteBuffer;
                if (byteBuffer == null) {
                    this.singleByteBuffer = ByteBuffer.allocate(1);
                } else {
                    byteBuffer.rewind();
                }
                int i = read(this.loc, this.singleByteBuffer);
                if (i < 0) {
                    return i;
                }
                this.loc++;
                return this.singleByteBuffer.get() & 255;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.InputStream
        public synchronized int read(byte[] bArr, int i, int i2) {
            if (i2 <= 0) {
                return 0;
            }
            long j = i2;
            long j2 = this.end;
            long j3 = this.loc;
            long j4 = j2 - j3;
            if (j > j4) {
                if (j3 >= j2) {
                    return -1;
                }
                i2 = (int) j4;
            }
            int i3 = read(this.loc, ByteBuffer.wrap(bArr, i, i2));
            if (i3 <= 0) {
                return i3;
            }
            this.loc += (long) i3;
            return i3;
        }

        public int read(long j, ByteBuffer byteBuffer) {
            int i;
            synchronized (ZipFile.this.archive) {
                ZipFile.this.archive.position(j);
                i = ZipFile.this.archive.read(byteBuffer);
            }
            byteBuffer.flip();
            return i;
        }
    }

    public ZipFile(String str) {
        this(new File(str), StringUtil.__UTF8Alt);
    }

    public ZipFile(String str, String str2) {
        this(new File(str), str2, true);
    }

    public ZipFile(File file, String str) {
        this(file, str, true);
    }

    public ZipFile(File file, String str, boolean z) {
        this(file, str, z, false);
    }

    public ZipFile(File file, String str, boolean z, boolean z2) {
        this(Files.newByteChannel(file.toPath(), EnumSet.of(StandardOpenOption.READ), new FileAttribute[0]), file.getAbsolutePath(), str, z, true, z2);
    }

    public ZipFile(SeekableByteChannel seekableByteChannel) {
        this(seekableByteChannel, "unknown archive", StringUtil.__UTF8Alt, true);
    }

    public ZipFile(SeekableByteChannel seekableByteChannel, String str) {
        this(seekableByteChannel, "unknown archive", str, true);
    }

    public ZipFile(SeekableByteChannel seekableByteChannel, String str, String str2, boolean z) {
        this(seekableByteChannel, str, str2, z, false, false);
    }

    public ZipFile(SeekableByteChannel seekableByteChannel, String str, String str2, boolean z, boolean z2) {
        this(seekableByteChannel, str, str2, z, false, z2);
    }

    public ZipFile(File file) {
        this(file, StringUtil.__UTF8Alt);
    }
}

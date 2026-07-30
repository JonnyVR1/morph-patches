package org.apache.commons.sudcompress.archivers.zip;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.sudcompress.archivers.ArchiveEntry;
import org.apache.commons.sudcompress.archivers.Suddo;
import p153l.dmg0;
import p153l.p7f;
import p153l.wg3;
import p153l.wtq0;
import p153l.xeg0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveOutputStream extends Suddo {
    static final int BUFFER_SIZE = 512;
    private static final int CFH_COMMENT_LENGTH_OFFSET = 32;
    private static final int CFH_COMPRESSED_SIZE_OFFSET = 20;
    private static final int CFH_CRC_OFFSET = 16;
    private static final int CFH_DISK_NUMBER_OFFSET = 34;
    private static final int CFH_EXTERNAL_ATTRIBUTES_OFFSET = 38;
    private static final int CFH_EXTRA_LENGTH_OFFSET = 30;
    private static final int CFH_FILENAME_LENGTH_OFFSET = 28;
    private static final int CFH_FILENAME_OFFSET = 46;
    private static final int CFH_GPB_OFFSET = 8;
    private static final int CFH_INTERNAL_ATTRIBUTES_OFFSET = 36;
    private static final int CFH_LFH_OFFSET = 42;
    private static final int CFH_METHOD_OFFSET = 10;
    private static final int CFH_ORIGINAL_SIZE_OFFSET = 24;
    private static final int CFH_SIG_OFFSET = 0;
    private static final int CFH_TIME_OFFSET = 12;
    private static final int CFH_VERSION_MADE_BY_OFFSET = 4;
    private static final int CFH_VERSION_NEEDED_OFFSET = 6;
    public static final int DEFAULT_COMPRESSION = -1;
    static final String DEFAULT_ENCODING = "UTF8";
    public static final int DEFLATED = 8;

    @Deprecated
    public static final int EFS_FLAG = 2048;
    private static final int LFH_COMPRESSED_SIZE_OFFSET = 18;
    private static final int LFH_CRC_OFFSET = 14;
    private static final int LFH_EXTRA_LENGTH_OFFSET = 28;
    private static final int LFH_FILENAME_LENGTH_OFFSET = 26;
    private static final int LFH_FILENAME_OFFSET = 30;
    private static final int LFH_GPB_OFFSET = 6;
    private static final int LFH_METHOD_OFFSET = 8;
    private static final int LFH_ORIGINAL_SIZE_OFFSET = 22;
    private static final int LFH_SIG_OFFSET = 0;
    private static final int LFH_TIME_OFFSET = 10;
    private static final int LFH_VERSION_NEEDED_OFFSET = 4;
    public static final int STORED = 0;
    private final Calendar calendarInstance;
    private long cdDiskNumberStart;
    private long cdLength;
    private long cdOffset;
    private final SeekableByteChannel channel;
    private String comment;
    private final byte[] copyBuffer;
    private UnicodeExtraFieldPolicy createUnicodeExtraFields;
    protected final Deflater def;
    private String encoding;
    private final List<ZipArchiveEntry> entries;
    private CurrentEntry entry;
    private long eocdLength;
    private boolean fallbackToUTF8;
    protected boolean finished;
    private boolean hasCompressionLevelChanged;
    private boolean hasUsedZip64;
    private final boolean isSplitZip;
    private int level;
    private final Map<ZipArchiveEntry, EntryMetaData> metaData;
    private int method;
    private final Map<Integer, Integer> numberOfCDInDiskData;
    private final OutputStream out;
    private final StreamCompressor streamCompressor;
    private boolean useUTF8Flag;
    private Zip64Mode zip64Mode;
    private ZipEncoding zipEncoding;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] ZERO = {0, 0};
    private static final byte[] LZERO = {0, 0, 0, 0};
    private static final byte[] ONE = ZipLong.getBytes(1);
    static final byte[] LFH_SIG = ZipLong.LFH_SIG.getBytes();
    static final byte[] DD_SIG = ZipLong.DD_SIG.getBytes();
    static final byte[] CFH_SIG = ZipLong.CFH_SIG.getBytes();
    static final byte[] EOCD_SIG = ZipLong.getBytes(101010256);
    static final byte[] ZIP64_EOCD_SIG = ZipLong.getBytes(101075792);
    static final byte[] ZIP64_EOCD_LOC_SIG = ZipLong.getBytes(117853008);

    public static final class CurrentEntry {
        private long bytesRead;
        private boolean causedUseOfZip64;
        private long dataStart;
        private final ZipArchiveEntry entry;
        private boolean hasWritten;
        private long localDataStart;

        private CurrentEntry(ZipArchiveEntry zipArchiveEntry) {
            this.localDataStart = 0L;
            this.dataStart = 0L;
            this.bytesRead = 0L;
            this.causedUseOfZip64 = false;
            this.entry = zipArchiveEntry;
        }
    }

    public static final class EntryMetaData {
        private final long offset;
        private final boolean usesDataDescriptor;

        private EntryMetaData(long j, boolean z) {
            this.offset = j;
            this.usesDataDescriptor = z;
        }
    }

    public static final class UnicodeExtraFieldPolicy {
        public static final UnicodeExtraFieldPolicy ALWAYS = new UnicodeExtraFieldPolicy("always");
        public static final UnicodeExtraFieldPolicy NEVER = new UnicodeExtraFieldPolicy("never");
        public static final UnicodeExtraFieldPolicy NOT_ENCODEABLE = new UnicodeExtraFieldPolicy("not encodeable");
        private final String name;

        private UnicodeExtraFieldPolicy(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public ZipArchiveOutputStream(File file) {
        SeekableByteChannel seekableByteChannelNewByteChannel;
        StreamCompressor streamCompressorCreate;
        this.finished = false;
        this.comment = "";
        this.level = -1;
        this.hasCompressionLevelChanged = false;
        this.method = 8;
        this.entries = new LinkedList();
        this.cdOffset = 0L;
        this.cdLength = 0L;
        this.cdDiskNumberStart = 0L;
        this.eocdLength = 0L;
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.fallbackToUTF8 = false;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.hasUsedZip64 = false;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        FileOutputStream fileOutputStream = null;
        try {
            seekableByteChannelNewByteChannel = Files.newByteChannel(file.toPath(), EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.TRUNCATE_EXISTING), new FileAttribute[0]);
            try {
                streamCompressorCreate = StreamCompressor.create(seekableByteChannelNewByteChannel, deflater);
            } catch (IOException unused) {
                xeg0.m210678c(seekableByteChannelNewByteChannel);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                streamCompressorCreate = StreamCompressor.create(fileOutputStream2, this.def);
                seekableByteChannelNewByteChannel = null;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException unused2) {
            seekableByteChannelNewByteChannel = null;
        }
        this.out = fileOutputStream;
        this.channel = seekableByteChannelNewByteChannel;
        this.streamCompressor = streamCompressorCreate;
        this.isSplitZip = false;
    }

    private void addUnicodeExtraFields(ZipArchiveEntry zipArchiveEntry, boolean z, ByteBuffer byteBuffer) {
        UnicodeExtraFieldPolicy unicodeExtraFieldPolicy = this.createUnicodeExtraFields;
        UnicodeExtraFieldPolicy unicodeExtraFieldPolicy2 = UnicodeExtraFieldPolicy.ALWAYS;
        if (unicodeExtraFieldPolicy == unicodeExtraFieldPolicy2 || !z) {
            zipArchiveEntry.addExtraField(new UnicodePathExtraField(zipArchiveEntry.getName(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position()));
        }
        String comment = zipArchiveEntry.getComment();
        if (comment == null || "".equals(comment)) {
            return;
        }
        boolean zCanEncode = this.zipEncoding.canEncode(comment);
        if (this.createUnicodeExtraFields == unicodeExtraFieldPolicy2 || !zCanEncode) {
            ByteBuffer byteBufferEncode = getEntryEncoding(zipArchiveEntry).encode(comment);
            zipArchiveEntry.addExtraField(new UnicodeCommentExtraField(comment, byteBufferEncode.array(), byteBufferEncode.arrayOffset(), byteBufferEncode.limit() - byteBufferEncode.position()));
        }
    }

    private boolean checkIfNeedsZip64(Zip64Mode zip64Mode) throws Zip64RequiredException {
        boolean zIsZip64Required = isZip64Required(this.entry.entry, zip64Mode);
        if (zIsZip64Required && zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
        return zIsZip64Required;
    }

    private void closeCopiedEntry(boolean z) throws IOException {
        preClose();
        CurrentEntry currentEntry = this.entry;
        currentEntry.bytesRead = currentEntry.entry.getSize();
        closeEntry(checkIfNeedsZip64(getEffectiveZip64Mode(this.entry.entry)), z);
    }

    private void closeEntry(boolean z, boolean z2) throws IOException {
        if (!z2 && this.channel != null) {
            rewriteSizesAndCrc(z);
        }
        if (!z2) {
            writeDataDescriptor(this.entry.entry);
        }
        this.entry = null;
    }

    private void copyFromZipInputStream(InputStream inputStream) throws IOException {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            wtq0.m207906a("No current entry");
            return;
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        this.entry.hasWritten = true;
        while (true) {
            int i = inputStream.read(this.copyBuffer);
            if (i < 0) {
                return;
            }
            this.streamCompressor.writeCounted(this.copyBuffer, 0, i);
            count(i);
        }
    }

    private byte[] createCentralFileHeader(ZipArchiveEntry zipArchiveEntry, ByteBuffer byteBuffer, EntryMetaData entryMetaData, boolean z) {
        if (this.isSplitZip) {
            int currentSplitSegmentIndex = ((ZipSplitOutputStream) this.out).getCurrentSplitSegmentIndex();
            Integer num = this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex));
            Map<Integer, Integer> map = this.numberOfCDInDiskData;
            if (num == null) {
                map.put(Integer.valueOf(currentSplitSegmentIndex), 1);
            } else {
                this.numberOfCDInDiskData.put(Integer.valueOf(currentSplitSegmentIndex), Integer.valueOf(map.get(Integer.valueOf(currentSplitSegmentIndex)).intValue() + 1));
            }
        }
        byte[] centralDirectoryExtra = zipArchiveEntry.getCentralDirectoryExtra();
        String comment = zipArchiveEntry.getComment();
        if (comment == null) {
            comment = "";
        }
        ByteBuffer byteBufferEncode = getEntryEncoding(zipArchiveEntry).encode(comment);
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int iLimit2 = byteBufferEncode.limit() - byteBufferEncode.position();
        int i = iLimit + 46;
        byte[] bArr = new byte[centralDirectoryExtra.length + i + iLimit2];
        System.arraycopy(CFH_SIG, 0, bArr, 0, 4);
        ZipShort.putShort((zipArchiveEntry.getPlatform() << 8) | (!this.hasUsedZip64 ? 20 : 45), bArr, 4);
        int method = zipArchiveEntry.getMethod();
        boolean zCanEncode = this.zipEncoding.canEncode(zipArchiveEntry.getName());
        ZipShort.putShort(versionNeededToExtract(method, z, entryMetaData.usesDataDescriptor), bArr, 6);
        getGeneralPurposeBits(!zCanEncode && this.fallbackToUTF8, entryMetaData.usesDataDescriptor).encode(bArr, 8);
        ZipShort.putShort(method, bArr, 10);
        ZipUtil.toDosTime(this.calendarInstance, zipArchiveEntry.getTime(), bArr, 12);
        ZipLong.putLong(zipArchiveEntry.getCrc(), bArr, 16);
        if (zipArchiveEntry.getCompressedSize() >= 4294967295L || zipArchiveEntry.getSize() >= 4294967295L || this.zip64Mode == Zip64Mode.Always) {
            ZipLong zipLong = ZipLong.ZIP64_MAGIC;
            zipLong.putLong(bArr, 20);
            zipLong.putLong(bArr, 24);
        } else {
            ZipLong.putLong(zipArchiveEntry.getCompressedSize(), bArr, 20);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 24);
        }
        ZipShort.putShort(iLimit, bArr, 28);
        ZipShort.putShort(centralDirectoryExtra.length, bArr, 30);
        ZipShort.putShort(iLimit2, bArr, 32);
        if (!this.isSplitZip) {
            System.arraycopy(ZERO, 0, bArr, 34, 2);
        } else if (zipArchiveEntry.getDiskNumberStart() >= 65535 || this.zip64Mode == Zip64Mode.Always) {
            ZipShort.putShort(p7f.COLOR_SPACE_UNCALIBRATED, bArr, 34);
        } else {
            ZipShort.putShort((int) zipArchiveEntry.getDiskNumberStart(), bArr, 34);
        }
        ZipShort.putShort(zipArchiveEntry.getInternalAttributes(), bArr, 36);
        ZipLong.putLong(zipArchiveEntry.getExternalAttributes(), bArr, 38);
        long j = entryMetaData.offset;
        if (j >= 4294967295L || this.zip64Mode == Zip64Mode.Always) {
            ZipLong.putLong(4294967295L, bArr, 42);
        } else {
            ZipLong.putLong(Math.min(j, 4294967295L), bArr, 42);
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 46, iLimit);
        System.arraycopy(centralDirectoryExtra, 0, bArr, i, centralDirectoryExtra.length);
        System.arraycopy(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), bArr, i + centralDirectoryExtra.length, iLimit2);
        return bArr;
    }

    private byte[] createLocalFileHeader(ZipArchiveEntry zipArchiveEntry, ByteBuffer byteBuffer, boolean z, boolean z2, long j) {
        ZipShort zipShort = ResourceAlignmentExtraField.f206793ID;
        ResourceAlignmentExtraField resourceAlignmentExtraField = (ResourceAlignmentExtraField) zipArchiveEntry.getExtraField(zipShort);
        if (resourceAlignmentExtraField != null) {
            zipArchiveEntry.removeExtraField(zipShort);
        }
        int alignment = zipArchiveEntry.getAlignment();
        if (alignment <= 0 && resourceAlignmentExtraField != null) {
            alignment = resourceAlignmentExtraField.getAlignment();
        }
        if (alignment > 1 || (resourceAlignmentExtraField != null && !resourceAlignmentExtraField.allowMethodChange())) {
            zipArchiveEntry.addExtraField(new ResourceAlignmentExtraField(alignment, resourceAlignmentExtraField != null && resourceAlignmentExtraField.allowMethodChange(), (int) ((((-j) - ((long) (((byteBuffer.limit() + 30) - byteBuffer.position()) + zipArchiveEntry.getLocalFileDataExtra().length))) - 6) & ((long) (alignment - 1)))));
        }
        byte[] localFileDataExtra = zipArchiveEntry.getLocalFileDataExtra();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int i = iLimit + 30;
        byte[] bArr = new byte[localFileDataExtra.length + i];
        System.arraycopy(LFH_SIG, 0, bArr, 0, 4);
        int method = zipArchiveEntry.getMethod();
        boolean zUsesDataDescriptor = usesDataDescriptor(method, z2);
        ZipShort.putShort(versionNeededToExtract(method, hasZip64Extra(zipArchiveEntry), zUsesDataDescriptor), bArr, 4);
        getGeneralPurposeBits(!z && this.fallbackToUTF8, zUsesDataDescriptor).encode(bArr, 6);
        ZipShort.putShort(method, bArr, 8);
        ZipUtil.toDosTime(this.calendarInstance, zipArchiveEntry.getTime(), bArr, 10);
        if (z2) {
            ZipLong.putLong(zipArchiveEntry.getCrc(), bArr, 14);
        } else if (method == 8 || this.channel != null) {
            System.arraycopy(LZERO, 0, bArr, 14, 4);
        } else {
            ZipLong.putLong(zipArchiveEntry.getCrc(), bArr, 14);
        }
        if (hasZip64Extra(this.entry.entry)) {
            ZipLong zipLong = ZipLong.ZIP64_MAGIC;
            zipLong.putLong(bArr, 18);
            zipLong.putLong(bArr, 22);
        } else if (z2) {
            ZipLong.putLong(zipArchiveEntry.getCompressedSize(), bArr, 18);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 22);
        } else if (method == 8 || this.channel != null) {
            byte[] bArr2 = LZERO;
            System.arraycopy(bArr2, 0, bArr, 18, 4);
            System.arraycopy(bArr2, 0, bArr, 22, 4);
        } else {
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 18);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 22);
        }
        ZipShort.putShort(iLimit, bArr, 26);
        ZipShort.putShort(localFileDataExtra.length, bArr, 28);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 30, iLimit);
        System.arraycopy(localFileDataExtra, 0, bArr, i, localFileDataExtra.length);
        return bArr;
    }

    private void flushDeflater() {
        if (this.entry.entry.getMethod() == 8) {
            this.streamCompressor.flushDeflater();
        }
    }

    private Zip64Mode getEffectiveZip64Mode(ZipArchiveEntry zipArchiveEntry) {
        return (this.zip64Mode == Zip64Mode.AsNeeded && this.channel == null && zipArchiveEntry.getMethod() == 8 && zipArchiveEntry.getSize() == -1) ? Zip64Mode.Never : this.zip64Mode;
    }

    private ZipEncoding getEntryEncoding(ZipArchiveEntry zipArchiveEntry) {
        return (this.zipEncoding.canEncode(zipArchiveEntry.getName()) || !this.fallbackToUTF8) ? this.zipEncoding : ZipEncodingHelper.UTF8_ZIP_ENCODING;
    }

    private GeneralPurposeBit getGeneralPurposeBits(boolean z, boolean z2) {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        generalPurposeBit.useUTF8ForNames(this.useUTF8Flag || z);
        if (z2) {
            generalPurposeBit.useDataDescriptor(true);
        }
        return generalPurposeBit;
    }

    private ByteBuffer getName(ZipArchiveEntry zipArchiveEntry) {
        return getEntryEncoding(zipArchiveEntry).encode(zipArchiveEntry.getName());
    }

    private Zip64ExtendedInformationExtraField getZip64Extra(ZipArchiveEntry zipArchiveEntry) {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry != null) {
            currentEntry.causedUseOfZip64 = !this.hasUsedZip64;
        }
        this.hasUsedZip64 = true;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = (Zip64ExtendedInformationExtraField) zipArchiveEntry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        if (zip64ExtendedInformationExtraField == null) {
            zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        }
        zipArchiveEntry.addAsFirstExtraField(zip64ExtendedInformationExtraField);
        return zip64ExtendedInformationExtraField;
    }

    private boolean handleSizesAndCrc(long j, long j2, Zip64Mode zip64Mode) throws ZipException {
        if (this.entry.entry.getMethod() == 8) {
            CurrentEntry currentEntry = this.entry;
            currentEntry.entry.setSize(currentEntry.bytesRead);
            this.entry.entry.setCompressedSize(j);
            this.entry.entry.setCrc(j2);
        } else {
            SeekableByteChannel seekableByteChannel = this.channel;
            CurrentEntry currentEntry2 = this.entry;
            if (seekableByteChannel != null) {
                currentEntry2.entry.setSize(j);
                this.entry.entry.setCompressedSize(j);
                this.entry.entry.setCrc(j2);
            } else {
                if (currentEntry2.entry.getCrc() != j2) {
                    throw new ZipException("Bad CRC checksum for entry " + this.entry.entry.getName() + ": " + Long.toHexString(this.entry.entry.getCrc()) + " instead of " + Long.toHexString(j2));
                }
                if (this.entry.entry.getSize() != j) {
                    throw new ZipException("Bad size for entry " + this.entry.entry.getName() + ": " + this.entry.entry.getSize() + " instead of " + j);
                }
            }
        }
        return checkIfNeedsZip64(zip64Mode);
    }

    private void handleZip64Extra(ZipArchiveEntry zipArchiveEntry, long j, boolean z) {
        if (z) {
            Zip64ExtendedInformationExtraField zip64Extra = getZip64Extra(zipArchiveEntry);
            if (zipArchiveEntry.getCompressedSize() >= 4294967295L || zipArchiveEntry.getSize() >= 4294967295L || this.zip64Mode == Zip64Mode.Always) {
                zip64Extra.setCompressedSize(new ZipEightByteInteger(zipArchiveEntry.getCompressedSize()));
                zip64Extra.setSize(new ZipEightByteInteger(zipArchiveEntry.getSize()));
            } else {
                zip64Extra.setCompressedSize(null);
                zip64Extra.setSize(null);
            }
            if (j >= 4294967295L || this.zip64Mode == Zip64Mode.Always) {
                zip64Extra.setRelativeHeaderOffset(new ZipEightByteInteger(j));
            }
            if (zipArchiveEntry.getDiskNumberStart() >= 65535 || this.zip64Mode == Zip64Mode.Always) {
                zip64Extra.setDiskStartNumber(new ZipLong(zipArchiveEntry.getDiskNumberStart()));
            }
            zipArchiveEntry.setExtra();
        }
    }

    private boolean hasZip64Extra(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID) != null;
    }

    private boolean isTooLageForZip32(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getSize() >= 4294967295L || zipArchiveEntry.getCompressedSize() >= 4294967295L;
    }

    private boolean isZip64Required(ZipArchiveEntry zipArchiveEntry, Zip64Mode zip64Mode) {
        return zip64Mode == Zip64Mode.Always || isTooLageForZip32(zipArchiveEntry);
    }

    private void preClose() throws IOException {
        if (this.finished) {
            zpg0.m220844a("Stream has already been finished");
            return;
        }
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            zpg0.m220844a("No current entry to close");
        } else {
            if (currentEntry.hasWritten) {
                return;
            }
            write(EMPTY, 0, 0);
        }
    }

    private void putArchiveEntry(ArchiveEntry archiveEntry, boolean z) throws IOException {
        ZipEightByteInteger zipEightByteInteger;
        ZipEightByteInteger zipEightByteInteger2;
        if (this.finished) {
            zpg0.m220844a("Stream has already been finished");
            return;
        }
        if (this.entry != null) {
            closeArchiveEntry();
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
        CurrentEntry currentEntry = new CurrentEntry(zipArchiveEntry);
        this.entry = currentEntry;
        this.entries.add(currentEntry.entry);
        setDefaults(this.entry.entry);
        Zip64Mode effectiveZip64Mode = getEffectiveZip64Mode(this.entry.entry);
        validateSizeInformation(effectiveZip64Mode);
        if (shouldAddZip64Extra(this.entry.entry, effectiveZip64Mode)) {
            Zip64ExtendedInformationExtraField zip64Extra = getZip64Extra(this.entry.entry);
            if (z) {
                zipEightByteInteger = new ZipEightByteInteger(this.entry.entry.getSize());
                zipEightByteInteger2 = new ZipEightByteInteger(this.entry.entry.getCompressedSize());
            } else {
                zipEightByteInteger = (this.entry.entry.getMethod() != 0 || this.entry.entry.getSize() == -1) ? ZipEightByteInteger.ZERO : new ZipEightByteInteger(this.entry.entry.getSize());
                zipEightByteInteger2 = zipEightByteInteger;
            }
            zip64Extra.setSize(zipEightByteInteger);
            zip64Extra.setCompressedSize(zipEightByteInteger2);
            this.entry.entry.setExtra();
        }
        if (this.entry.entry.getMethod() == 8 && this.hasCompressionLevelChanged) {
            this.def.setLevel(this.level);
            this.hasCompressionLevelChanged = false;
        }
        writeLocalFileHeader(zipArchiveEntry, z);
    }

    private void rewriteSizesAndCrc(boolean z) throws IOException {
        long jPosition = this.channel.position();
        this.channel.position(this.entry.localDataStart);
        writeOut(ZipLong.getBytes(this.entry.entry.getCrc()));
        if (hasZip64Extra(this.entry.entry) && z) {
            ZipLong zipLong = ZipLong.ZIP64_MAGIC;
            writeOut(zipLong.getBytes());
            writeOut(zipLong.getBytes());
        } else {
            writeOut(ZipLong.getBytes(this.entry.entry.getCompressedSize()));
            writeOut(ZipLong.getBytes(this.entry.entry.getSize()));
        }
        if (hasZip64Extra(this.entry.entry)) {
            ByteBuffer name = getName(this.entry.entry);
            this.channel.position(this.entry.localDataStart + 16 + ((long) (name.limit() - name.position())) + 4);
            writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getSize()));
            writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getCompressedSize()));
            if (!z) {
                this.channel.position(this.entry.localDataStart - 10);
                writeOut(ZipShort.getBytes(versionNeededToExtract(this.entry.entry.getMethod(), false, false)));
                this.entry.entry.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
                this.entry.entry.setExtra();
                if (this.entry.causedUseOfZip64) {
                    this.hasUsedZip64 = false;
                }
            }
        }
        this.channel.position(jPosition);
    }

    private void setDefaults(ZipArchiveEntry zipArchiveEntry) {
        if (zipArchiveEntry.getMethod() == -1) {
            zipArchiveEntry.setMethod(this.method);
        }
        if (zipArchiveEntry.getTime() == -1) {
            zipArchiveEntry.setTime(System.currentTimeMillis());
        }
    }

    private boolean shouldAddZip64Extra(ZipArchiveEntry zipArchiveEntry, Zip64Mode zip64Mode) {
        if (zip64Mode == Zip64Mode.Always || zipArchiveEntry.getSize() >= 4294967295L || zipArchiveEntry.getCompressedSize() >= 4294967295L) {
            return true;
        }
        return (zipArchiveEntry.getSize() != -1 || this.channel == null || zip64Mode == Zip64Mode.Never) ? false : true;
    }

    private boolean shouldUseZip64EOCD() {
        int currentSplitSegmentIndex = this.isSplitZip ? ((ZipSplitOutputStream) this.out).getCurrentSplitSegmentIndex() : 0;
        return currentSplitSegmentIndex >= 65535 || this.cdDiskNumberStart >= 65535 || (this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)) == null ? 0 : this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)).intValue()) >= 65535 || this.entries.size() >= 65535 || this.cdLength >= 4294967295L || this.cdOffset >= 4294967295L;
    }

    private boolean usesDataDescriptor(int i, boolean z) {
        return !z && i == 8 && this.channel == null;
    }

    private void validateIfZip64IsNeededInEOCD() throws Zip64RequiredException {
        if (this.zip64Mode != Zip64Mode.Never) {
            return;
        }
        int currentSplitSegmentIndex = this.isSplitZip ? ((ZipSplitOutputStream) this.out).getCurrentSplitSegmentIndex() : 0;
        if (currentSplitSegmentIndex >= 65535) {
            throw new Zip64RequiredException("Number of the disk of End Of Central Directory exceeds the limmit of 65535.");
        }
        if (this.cdDiskNumberStart >= 65535) {
            throw new Zip64RequiredException("Number of the disk with the start of Central Directory exceeds the limmit of 65535.");
        }
        if ((this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)) != null ? this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)).intValue() : 0) >= 65535) {
            throw new Zip64RequiredException("Number of entries on this disk exceeds the limmit of 65535.");
        }
        if (this.entries.size() >= 65535) {
            throw new Zip64RequiredException("Archive contains more than 65535 entries.");
        }
        if (this.cdLength >= 4294967295L) {
            throw new Zip64RequiredException("The size of the entire central directory exceeds the limit of 4GByte.");
        }
        if (this.cdOffset >= 4294967295L) {
            throw new Zip64RequiredException("Archive's size exceeds the limit of 4GByte.");
        }
    }

    private void validateSizeInformation(Zip64Mode zip64Mode) throws ZipException {
        if (this.entry.entry.getMethod() == 0 && this.channel == null) {
            if (this.entry.entry.getSize() == -1) {
                throw new ZipException("Uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.entry.entry.getCrc() == -1) {
                throw new ZipException("CRC checksum is required for STORED method when not writing to a file");
            }
            ZipArchiveEntry zipArchiveEntry = this.entry.entry;
            zipArchiveEntry.setCompressedSize(zipArchiveEntry.getSize());
        }
        if ((this.entry.entry.getSize() >= 4294967295L || this.entry.entry.getCompressedSize() >= 4294967295L) && zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
    }

    private int versionNeededToExtract(int i, boolean z, boolean z2) {
        if (z) {
            return 45;
        }
        if (z2) {
            return 20;
        }
        return versionNeededToExtractMethod(i);
    }

    private int versionNeededToExtractMethod(int i) {
        return i == 8 ? 20 : 10;
    }

    private void writeCentralDirectoryInChunks() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator<ZipArchiveEntry> it = this.entries.iterator();
        while (true) {
            int i = 0;
            do {
                if (!it.hasNext()) {
                    writeCounted(byteArrayOutputStream.toByteArray());
                    return;
                } else {
                    byteArrayOutputStream.write(createCentralFileHeader(it.next()));
                    i++;
                }
            } while (i <= 1000);
            writeCounted(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }

    private void writeCounted(byte[] bArr) {
        this.streamCompressor.writeCounted(bArr);
    }

    private void writeLocalFileHeader(ZipArchiveEntry zipArchiveEntry, boolean z) {
        boolean zCanEncode = this.zipEncoding.canEncode(zipArchiveEntry.getName());
        ByteBuffer name = getName(zipArchiveEntry);
        if (this.createUnicodeExtraFields != UnicodeExtraFieldPolicy.NEVER) {
            addUnicodeExtraFields(zipArchiveEntry, zCanEncode, name);
        }
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
        if (this.isSplitZip) {
            ZipSplitOutputStream zipSplitOutputStream = (ZipSplitOutputStream) this.out;
            zipArchiveEntry.setDiskNumberStart(zipSplitOutputStream.getCurrentSplitSegmentIndex());
            totalBytesWritten = zipSplitOutputStream.getCurrentSplitSegmentBytesWritten();
        }
        long j = totalBytesWritten;
        byte[] bArrCreateLocalFileHeader = createLocalFileHeader(zipArchiveEntry, name, zCanEncode, z, j);
        this.metaData.put(zipArchiveEntry, new EntryMetaData(j, usesDataDescriptor(zipArchiveEntry.getMethod(), z)));
        this.entry.localDataStart = j + 14;
        writeCounted(bArrCreateLocalFileHeader);
        this.entry.dataStart = this.streamCompressor.getTotalBytesWritten();
    }

    public void addRawArchiveEntry(ZipArchiveEntry zipArchiveEntry, InputStream inputStream) throws IOException {
        ZipArchiveEntry zipArchiveEntry2 = new ZipArchiveEntry(zipArchiveEntry);
        if (hasZip64Extra(zipArchiveEntry2)) {
            zipArchiveEntry2.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        }
        boolean z = (zipArchiveEntry2.getCrc() == -1 || zipArchiveEntry2.getSize() == -1 || zipArchiveEntry2.getCompressedSize() == -1) ? false : true;
        putArchiveEntry(zipArchiveEntry2, z);
        copyFromZipInputStream(inputStream);
        closeCopiedEntry(z);
    }

    public boolean canWriteEntryData(ArchiveEntry archiveEntry) {
        if (archiveEntry instanceof ZipArchiveEntry) {
            ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
            if (zipArchiveEntry.getMethod() != ZipMethod.IMPLODING.getCode() && zipArchiveEntry.getMethod() != ZipMethod.UNSHRINKING.getCode() && ZipUtil.canHandleEntryData(zipArchiveEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.finished) {
                finish();
            }
        } finally {
            destroy();
        }
    }

    public void closeArchiveEntry() throws IOException {
        preClose();
        flushDeflater();
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten() - this.entry.dataStart;
        long crc32 = this.streamCompressor.getCrc32();
        this.entry.bytesRead = this.streamCompressor.getBytesRead();
        closeEntry(handleSizesAndCrc(totalBytesWritten, crc32, getEffectiveZip64Mode(this.entry.entry)), false);
        this.streamCompressor.reset();
    }

    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (!this.finished) {
            return new ZipArchiveEntry(file, str);
        }
        zpg0.m220844a("Stream has already been finished");
        return null;
    }

    public final void deflate() {
        this.streamCompressor.deflate();
    }

    public void destroy() throws IOException {
        try {
            SeekableByteChannel seekableByteChannel = this.channel;
            if (seekableByteChannel != null) {
                seekableByteChannel.close();
            }
        } finally {
            OutputStream outputStream = this.out;
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public void finish() throws IOException {
        if (this.finished) {
            zpg0.m220844a("This archive has already been finished");
            return;
        }
        if (this.entry != null) {
            zpg0.m220844a("This archive contains unclosed entries.");
            return;
        }
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
        this.cdOffset = totalBytesWritten;
        if (this.isSplitZip) {
            ZipSplitOutputStream zipSplitOutputStream = (ZipSplitOutputStream) this.out;
            this.cdOffset = zipSplitOutputStream.getCurrentSplitSegmentBytesWritten();
            this.cdDiskNumberStart = zipSplitOutputStream.getCurrentSplitSegmentIndex();
        }
        writeCentralDirectoryInChunks();
        this.cdLength = this.streamCompressor.getTotalBytesWritten() - totalBytesWritten;
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(this.comment);
        this.eocdLength = (((long) byteBufferEncode.limit()) - ((long) byteBufferEncode.position())) + 22;
        writeZip64CentralDirectory();
        writeCentralDirectoryEnd();
        this.metaData.clear();
        this.entries.clear();
        this.streamCompressor.close();
        if (this.isSplitZip) {
            this.out.close();
        }
        this.finished = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public String getEncoding() {
        return this.encoding;
    }

    public boolean isSeekable() {
        return this.channel != null;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCreateUnicodeExtraFields(UnicodeExtraFieldPolicy unicodeExtraFieldPolicy) {
        this.createUnicodeExtraFields = unicodeExtraFieldPolicy;
    }

    public void setEncoding(String str) {
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        if (!this.useUTF8Flag || ZipEncodingHelper.isUTF8(str)) {
            return;
        }
        this.useUTF8Flag = false;
    }

    public void setFallbackToUTF8(boolean z) {
        this.fallbackToUTF8 = z;
    }

    public void setLevel(int i) {
        if (i < -1 || i > 9) {
            wg3.m206174a(dmg0.m116959a(i, "Invalid compression level: "));
        } else {
            if (this.level == i) {
                return;
            }
            this.hasCompressionLevelChanged = true;
            this.level = i;
        }
    }

    public void setMethod(int i) {
        this.method = i;
    }

    public void setUseLanguageEncodingFlag(boolean z) {
        this.useUTF8Flag = z && ZipEncodingHelper.isUTF8(this.encoding);
    }

    public void setUseZip64(Zip64Mode zip64Mode) {
        this.zip64Mode = zip64Mode;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws UnsupportedZipFeatureException {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            wtq0.m207906a("No current entry");
        } else {
            ZipUtil.checkRequestedFeatures(currentEntry.entry);
            count(this.streamCompressor.write(bArr, i, i2, this.entry.entry.getMethod()));
        }
    }

    public void writeCentralDirectoryEnd() throws IOException {
        if (!this.hasUsedZip64 && this.isSplitZip) {
            ((ZipSplitOutputStream) this.out).prepareToWriteUnsplittableContent(this.eocdLength);
        }
        validateIfZip64IsNeededInEOCD();
        writeCounted(EOCD_SIG);
        int iIntValue = 0;
        int currentSplitSegmentIndex = this.isSplitZip ? ((ZipSplitOutputStream) this.out).getCurrentSplitSegmentIndex() : 0;
        writeCounted(ZipShort.getBytes(currentSplitSegmentIndex));
        writeCounted(ZipShort.getBytes((int) this.cdDiskNumberStart));
        int size = this.entries.size();
        if (!this.isSplitZip) {
            iIntValue = size;
        } else if (this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)) != null) {
            iIntValue = this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)).intValue();
        }
        writeCounted(ZipShort.getBytes(Math.min(iIntValue, p7f.COLOR_SPACE_UNCALIBRATED)));
        writeCounted(ZipShort.getBytes(Math.min(size, p7f.COLOR_SPACE_UNCALIBRATED)));
        writeCounted(ZipLong.getBytes(Math.min(this.cdLength, 4294967295L)));
        writeCounted(ZipLong.getBytes(Math.min(this.cdOffset, 4294967295L)));
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(this.comment);
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        writeCounted(ZipShort.getBytes(iLimit));
        this.streamCompressor.writeCounted(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), iLimit);
    }

    public void writeCentralFileHeader(ZipArchiveEntry zipArchiveEntry) {
        writeCounted(createCentralFileHeader(zipArchiveEntry));
    }

    public void writeDataDescriptor(ZipArchiveEntry zipArchiveEntry) {
        if (usesDataDescriptor(zipArchiveEntry.getMethod(), false)) {
            writeCounted(DD_SIG);
            writeCounted(ZipLong.getBytes(zipArchiveEntry.getCrc()));
            if (hasZip64Extra(zipArchiveEntry)) {
                writeCounted(ZipEightByteInteger.getBytes(zipArchiveEntry.getCompressedSize()));
                writeCounted(ZipEightByteInteger.getBytes(zipArchiveEntry.getSize()));
            } else {
                writeCounted(ZipLong.getBytes(zipArchiveEntry.getCompressedSize()));
                writeCounted(ZipLong.getBytes(zipArchiveEntry.getSize()));
            }
        }
    }

    public final void writeOut(byte[] bArr) {
        this.streamCompressor.writeOut(bArr, 0, bArr.length);
    }

    public void writeZip64CentralDirectory() throws IOException {
        long currentSplitSegmentIndex;
        if (this.zip64Mode == Zip64Mode.Never) {
            return;
        }
        if (!this.hasUsedZip64 && shouldUseZip64EOCD()) {
            this.hasUsedZip64 = true;
        }
        if (this.hasUsedZip64) {
            long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
            if (this.isSplitZip) {
                ZipSplitOutputStream zipSplitOutputStream = (ZipSplitOutputStream) this.out;
                totalBytesWritten = zipSplitOutputStream.getCurrentSplitSegmentBytesWritten();
                currentSplitSegmentIndex = zipSplitOutputStream.getCurrentSplitSegmentIndex();
            } else {
                currentSplitSegmentIndex = 0;
            }
            writeOut(ZIP64_EOCD_SIG);
            writeOut(ZipEightByteInteger.getBytes(44L));
            writeOut(ZipShort.getBytes(45));
            writeOut(ZipShort.getBytes(45));
            int size = 0;
            int currentSplitSegmentIndex2 = this.isSplitZip ? ((ZipSplitOutputStream) this.out).getCurrentSplitSegmentIndex() : 0;
            writeOut(ZipLong.getBytes(currentSplitSegmentIndex2));
            writeOut(ZipLong.getBytes(this.cdDiskNumberStart));
            if (!this.isSplitZip) {
                size = this.entries.size();
            } else if (this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex2)) != null) {
                size = this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex2)).intValue();
            }
            writeOut(ZipEightByteInteger.getBytes(size));
            writeOut(ZipEightByteInteger.getBytes(this.entries.size()));
            writeOut(ZipEightByteInteger.getBytes(this.cdLength));
            writeOut(ZipEightByteInteger.getBytes(this.cdOffset));
            if (this.isSplitZip) {
                ((ZipSplitOutputStream) this.out).prepareToWriteUnsplittableContent(this.eocdLength + 20);
            }
            writeOut(ZIP64_EOCD_LOC_SIG);
            writeOut(ZipLong.getBytes(currentSplitSegmentIndex));
            writeOut(ZipEightByteInteger.getBytes(totalBytesWritten));
            if (this.isSplitZip) {
                writeOut(ZipLong.getBytes(((ZipSplitOutputStream) this.out).getCurrentSplitSegmentIndex() + 1));
            } else {
                writeOut(ONE);
            }
        }
    }

    public final void writeOut(byte[] bArr, int i, int i2) {
        this.streamCompressor.writeOut(bArr, i, i2);
    }

    public void writeLocalFileHeader(ZipArchiveEntry zipArchiveEntry) {
        writeLocalFileHeader(zipArchiveEntry, false);
    }

    public ZipArchiveOutputStream(OutputStream outputStream) {
        this.finished = false;
        this.comment = "";
        this.level = -1;
        this.hasCompressionLevelChanged = false;
        this.method = 8;
        this.entries = new LinkedList();
        this.cdOffset = 0L;
        this.cdLength = 0L;
        this.cdDiskNumberStart = 0L;
        this.eocdLength = 0L;
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.fallbackToUTF8 = false;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.hasUsedZip64 = false;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        this.out = outputStream;
        this.channel = null;
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        this.streamCompressor = StreamCompressor.create(outputStream, deflater);
        this.isSplitZip = false;
    }

    public ZipArchiveOutputStream(File file, long j) {
        this.finished = false;
        this.comment = "";
        this.level = -1;
        this.hasCompressionLevelChanged = false;
        this.method = 8;
        this.entries = new LinkedList();
        this.cdOffset = 0L;
        this.cdLength = 0L;
        this.cdDiskNumberStart = 0L;
        this.eocdLength = 0L;
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.fallbackToUTF8 = false;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.hasUsedZip64 = false;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        ZipSplitOutputStream zipSplitOutputStream = new ZipSplitOutputStream(file, j);
        this.out = zipSplitOutputStream;
        this.streamCompressor = StreamCompressor.create(zipSplitOutputStream, deflater);
        this.channel = null;
        this.isSplitZip = true;
    }

    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        putArchiveEntry(archiveEntry, false);
    }

    public ZipArchiveOutputStream(SeekableByteChannel seekableByteChannel) {
        this.finished = false;
        this.comment = "";
        this.level = -1;
        this.hasCompressionLevelChanged = false;
        this.method = 8;
        this.entries = new LinkedList();
        this.cdOffset = 0L;
        this.cdLength = 0L;
        this.cdDiskNumberStart = 0L;
        this.eocdLength = 0L;
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.fallbackToUTF8 = false;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.hasUsedZip64 = false;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        this.channel = seekableByteChannel;
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        this.streamCompressor = StreamCompressor.create(seekableByteChannel, deflater);
        this.out = null;
        this.isSplitZip = false;
    }

    private byte[] createCentralFileHeader(ZipArchiveEntry zipArchiveEntry) throws Zip64RequiredException {
        EntryMetaData entryMetaData = this.metaData.get(zipArchiveEntry);
        boolean z = hasZip64Extra(zipArchiveEntry) || zipArchiveEntry.getCompressedSize() >= 4294967295L || zipArchiveEntry.getSize() >= 4294967295L || entryMetaData.offset >= 4294967295L || zipArchiveEntry.getDiskNumberStart() >= 65535 || this.zip64Mode == Zip64Mode.Always;
        if (!z || this.zip64Mode != Zip64Mode.Never) {
            handleZip64Extra(zipArchiveEntry, entryMetaData.offset, z);
            return createCentralFileHeader(zipArchiveEntry, getName(zipArchiveEntry), entryMetaData, z);
        }
        throw new Zip64RequiredException("Archive's size exceeds the limit of 4GByte.");
    }
}

package org.apache.commons.sudcompress.archivers.zip;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.sudcompress.archivers.ArchiveEntry;
import p149l.ig3;
import p149l.lmr;
import p149l.pkq0;
import p149l.vdg0;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveEntry extends ZipEntry implements ArchiveEntry {
    public static final int CRC_UNKNOWN = -1;
    public static final int PLATFORM_FAT = 0;
    public static final int PLATFORM_UNIX = 3;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_SHIFT = 16;
    private int alignment;
    private CommentSource commentSource;
    private long dataOffset;
    private long diskNumberStart;
    private long externalAttributes;
    private ZipExtraField[] extraFields;
    private GeneralPurposeBit gpb;
    private int internalAttributes;
    private boolean isStreamContiguous;
    private long localHeaderOffset;
    private int method;
    private String name;
    private NameSource nameSource;
    private int platform;
    private int rawFlag;
    private byte[] rawName;
    private long size;
    private UnparseableExtraFieldData unparseableExtra;
    private int versionMadeBy;
    private int versionRequired;
    private static final byte[] EMPTY = new byte[0];
    private static final ZipExtraField[] noExtraFields = new ZipExtraField[0];

    public enum CommentSource {
        COMMENT,
        UNICODE_EXTRA_FIELD
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class ExtraFieldParsingMode implements ExtraFieldParsingBehavior {
        private static final /* synthetic */ ExtraFieldParsingMode[] $VALUES;
        public static final ExtraFieldParsingMode BEST_EFFORT;
        public static final ExtraFieldParsingMode DRACONIC;
        public static final ExtraFieldParsingMode ONLY_PARSEABLE_LENIENT;
        public static final ExtraFieldParsingMode ONLY_PARSEABLE_STRICT;
        public static final ExtraFieldParsingMode STRICT_FOR_KNOW_EXTRA_FIELDS;
        private final ExtraFieldUtils.UnparseableExtraField onUnparseableData;

        /* JADX INFO: renamed from: org.apache.commons.sudcompress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$1 */
        public final enum C218641 extends ExtraFieldParsingMode {
            private C218641(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField) {
                super(str, i, unparseableExtraField);
            }

            @Override // org.apache.commons.sudcompress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode, org.apache.commons.sudcompress.archivers.zip.ExtraFieldParsingBehavior
            public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
                return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(zipExtraField, bArr, i, i2, z);
            }
        }

        /* JADX INFO: renamed from: org.apache.commons.sudcompress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$2 */
        public final enum C218652 extends ExtraFieldParsingMode {
            private C218652(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField) {
                super(str, i, unparseableExtraField);
            }

            @Override // org.apache.commons.sudcompress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode, org.apache.commons.sudcompress.archivers.zip.ExtraFieldParsingBehavior
            public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
                return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(zipExtraField, bArr, i, i2, z);
            }
        }

        private static /* synthetic */ ExtraFieldParsingMode[] $values() {
            return new ExtraFieldParsingMode[]{BEST_EFFORT, STRICT_FOR_KNOW_EXTRA_FIELDS, ONLY_PARSEABLE_LENIENT, ONLY_PARSEABLE_STRICT, DRACONIC};
        }

        static {
            ExtraFieldUtils.UnparseableExtraField unparseableExtraField = ExtraFieldUtils.UnparseableExtraField.READ;
            BEST_EFFORT = new C218641("BEST_EFFORT", 0, unparseableExtraField);
            STRICT_FOR_KNOW_EXTRA_FIELDS = new ExtraFieldParsingMode("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, unparseableExtraField);
            ExtraFieldUtils.UnparseableExtraField unparseableExtraField2 = ExtraFieldUtils.UnparseableExtraField.SKIP;
            ONLY_PARSEABLE_LENIENT = new C218652("ONLY_PARSEABLE_LENIENT", 2, unparseableExtraField2);
            ONLY_PARSEABLE_STRICT = new ExtraFieldParsingMode("ONLY_PARSEABLE_STRICT", 3, unparseableExtraField2);
            DRACONIC = new ExtraFieldParsingMode("DRACONIC", 4, ExtraFieldUtils.UnparseableExtraField.THROW);
            $VALUES = $values();
        }

        private ExtraFieldParsingMode(String str, int i, ExtraFieldUtils.UnparseableExtraField unparseableExtraField) {
            super(str, i);
            this.onUnparseableData = unparseableExtraField;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ZipExtraField fillAndMakeUnrecognizedOnError(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
            try {
                return ExtraFieldUtils.fillExtraField(zipExtraField, bArr, i, i2, z);
            } catch (ZipException unused) {
                UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
                unrecognizedExtraField.setHeaderId(zipExtraField.getHeaderId());
                if (z) {
                    unrecognizedExtraField.setLocalFileDataData(Arrays.copyOfRange(bArr, i, i2 + i));
                } else {
                    unrecognizedExtraField.setCentralDirectoryData(Arrays.copyOfRange(bArr, i, i2 + i));
                }
                return unrecognizedExtraField;
            }
        }

        public static ExtraFieldParsingMode valueOf(String str) {
            return (ExtraFieldParsingMode) Enum.valueOf(ExtraFieldParsingMode.class, str);
        }

        public static ExtraFieldParsingMode[] values() {
            return (ExtraFieldParsingMode[]) $VALUES.clone();
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.ExtraFieldParsingBehavior
        public ZipExtraField createExtraField(ZipShort zipShort) {
            return ExtraFieldUtils.createExtraField(zipShort);
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.ExtraFieldParsingBehavior
        public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) {
            return ExtraFieldUtils.fillExtraField(zipExtraField, bArr, i, i2, z);
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.UnparseableExtraFieldBehavior
        public ZipExtraField onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) {
            return this.onUnparseableData.onUnparseableExtraField(bArr, i, i2, z, i3);
        }
    }

    public enum NameSource {
        NAME,
        NAME_WITH_EFS_FLAG,
        UNICODE_EXTRA_FIELD
    }

    public ZipArchiveEntry(ZipEntry zipEntry) {
        super(zipEntry);
        this.method = -1;
        this.size = -1L;
        this.internalAttributes = 0;
        this.platform = 0;
        this.externalAttributes = 0L;
        this.alignment = 0;
        this.unparseableExtra = null;
        this.name = null;
        this.rawName = null;
        this.gpb = new GeneralPurposeBit();
        this.localHeaderOffset = -1L;
        this.dataOffset = -1L;
        this.isStreamContiguous = false;
        this.nameSource = NameSource.NAME;
        this.commentSource = CommentSource.COMMENT;
        setName(zipEntry.getName());
        byte[] extra = zipEntry.getExtra();
        if (extra != null) {
            setExtraFields(ExtraFieldUtils.parse(extra, true, (ExtraFieldParsingBehavior) ExtraFieldParsingMode.BEST_EFFORT));
        } else {
            setExtra();
        }
        setMethod(zipEntry.getMethod());
        this.size = zipEntry.getSize();
    }

    private ZipExtraField[] copyOf(ZipExtraField[] zipExtraFieldArr, int i) {
        ZipExtraField[] zipExtraFieldArr2 = new ZipExtraField[i];
        System.arraycopy(zipExtraFieldArr, 0, zipExtraFieldArr2, 0, Math.min(zipExtraFieldArr.length, i));
        return zipExtraFieldArr2;
    }

    private ZipExtraField findMatching(ZipShort zipShort, List<ZipExtraField> list) {
        for (ZipExtraField zipExtraField : list) {
            if (zipShort.equals(zipExtraField.getHeaderId())) {
                return zipExtraField;
            }
        }
        return null;
    }

    private ZipExtraField findUnparseable(List<ZipExtraField> list) {
        for (ZipExtraField zipExtraField : list) {
            if (zipExtraField instanceof UnparseableExtraFieldData) {
                return zipExtraField;
            }
        }
        return null;
    }

    private ZipExtraField[] getAllExtraFields() {
        ZipExtraField[] allExtraFieldsNoCopy = getAllExtraFieldsNoCopy();
        return allExtraFieldsNoCopy == this.extraFields ? copyOf(allExtraFieldsNoCopy, allExtraFieldsNoCopy.length) : allExtraFieldsNoCopy;
    }

    private ZipExtraField[] getAllExtraFieldsNoCopy() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        if (zipExtraFieldArr == null) {
            return getUnparseableOnly();
        }
        return this.unparseableExtra != null ? getMergedFields() : zipExtraFieldArr;
    }

    private ZipExtraField[] getMergedFields() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        ZipExtraField[] zipExtraFieldArrCopyOf = copyOf(zipExtraFieldArr, zipExtraFieldArr.length + 1);
        zipExtraFieldArrCopyOf[this.extraFields.length] = this.unparseableExtra;
        return zipExtraFieldArrCopyOf;
    }

    private ZipExtraField[] getParseableExtraFields() {
        ZipExtraField[] parseableExtraFieldsNoCopy = getParseableExtraFieldsNoCopy();
        return parseableExtraFieldsNoCopy == this.extraFields ? copyOf(parseableExtraFieldsNoCopy, parseableExtraFieldsNoCopy.length) : parseableExtraFieldsNoCopy;
    }

    private ZipExtraField[] getParseableExtraFieldsNoCopy() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        return zipExtraFieldArr == null ? noExtraFields : zipExtraFieldArr;
    }

    private ZipExtraField[] getUnparseableOnly() {
        UnparseableExtraFieldData unparseableExtraFieldData = this.unparseableExtra;
        return unparseableExtraFieldData == null ? noExtraFields : new ZipExtraField[]{unparseableExtraFieldData};
    }

    private void mergeExtraFields(ZipExtraField[] zipExtraFieldArr, boolean z) {
        if (this.extraFields == null) {
            setExtraFields(zipExtraFieldArr);
            return;
        }
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            ZipExtraField extraField = zipExtraField instanceof UnparseableExtraFieldData ? this.unparseableExtra : getExtraField(zipExtraField.getHeaderId());
            if (extraField == null) {
                addExtraField(zipExtraField);
            } else {
                byte[] localFileDataData = z ? zipExtraField.getLocalFileDataData() : zipExtraField.getCentralDirectoryData();
                if (z) {
                    try {
                        extraField.parseFromLocalFileData(localFileDataData, 0, localFileDataData.length);
                    } catch (ZipException unused) {
                        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
                        unrecognizedExtraField.setHeaderId(extraField.getHeaderId());
                        if (z) {
                            unrecognizedExtraField.setLocalFileDataData(localFileDataData);
                            unrecognizedExtraField.setCentralDirectoryData(extraField.getCentralDirectoryData());
                        } else {
                            unrecognizedExtraField.setLocalFileDataData(extraField.getLocalFileDataData());
                            unrecognizedExtraField.setCentralDirectoryData(localFileDataData);
                        }
                        removeExtraField(extraField.getHeaderId());
                        addExtraField(unrecognizedExtraField);
                    }
                } else {
                    extraField.parseFromCentralDirectoryData(localFileDataData, 0, localFileDataData.length);
                }
            }
        }
        setExtra();
    }

    public void addAsFirstExtraField(ZipExtraField zipExtraField) {
        if (zipExtraField instanceof UnparseableExtraFieldData) {
            this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
        } else {
            if (getExtraField(zipExtraField.getHeaderId()) != null) {
                removeExtraField(zipExtraField.getHeaderId());
            }
            ZipExtraField[] zipExtraFieldArr = this.extraFields;
            int length = zipExtraFieldArr != null ? zipExtraFieldArr.length + 1 : 1;
            ZipExtraField[] zipExtraFieldArr2 = new ZipExtraField[length];
            this.extraFields = zipExtraFieldArr2;
            zipExtraFieldArr2[0] = zipExtraField;
            if (zipExtraFieldArr != null) {
                System.arraycopy(zipExtraFieldArr, 0, zipExtraFieldArr2, 1, length - 1);
            }
        }
        setExtra();
    }

    public void addExtraField(ZipExtraField zipExtraField) {
        if (zipExtraField instanceof UnparseableExtraFieldData) {
            this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
        } else if (this.extraFields == null) {
            this.extraFields = new ZipExtraField[]{zipExtraField};
        } else {
            if (getExtraField(zipExtraField.getHeaderId()) != null) {
                removeExtraField(zipExtraField.getHeaderId());
            }
            ZipExtraField[] zipExtraFieldArr = this.extraFields;
            ZipExtraField[] zipExtraFieldArrCopyOf = copyOf(zipExtraFieldArr, zipExtraFieldArr.length + 1);
            zipExtraFieldArrCopyOf[zipExtraFieldArrCopyOf.length - 1] = zipExtraField;
            this.extraFields = zipExtraFieldArrCopyOf;
        }
        setExtra();
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) super.clone();
        zipArchiveEntry.setInternalAttributes(getInternalAttributes());
        zipArchiveEntry.setExternalAttributes(getExternalAttributes());
        zipArchiveEntry.setExtraFields(getAllExtraFieldsNoCopy());
        return zipArchiveEntry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) obj;
            String name = getName();
            String name2 = zipArchiveEntry.getName();
            if (name == null) {
                if (name2 != null) {
                    return false;
                }
            } else if (!name.equals(name2)) {
                return false;
            }
            String comment = getComment();
            String comment2 = zipArchiveEntry.getComment();
            if (comment == null) {
                comment = "";
            }
            if (comment2 == null) {
                comment2 = "";
            }
            if (getTime() == zipArchiveEntry.getTime() && comment.equals(comment2) && getInternalAttributes() == zipArchiveEntry.getInternalAttributes() && getPlatform() == zipArchiveEntry.getPlatform() && getExternalAttributes() == zipArchiveEntry.getExternalAttributes() && getMethod() == zipArchiveEntry.getMethod() && getSize() == zipArchiveEntry.getSize() && getCrc() == zipArchiveEntry.getCrc() && getCompressedSize() == zipArchiveEntry.getCompressedSize() && Arrays.equals(getCentralDirectoryExtra(), zipArchiveEntry.getCentralDirectoryExtra()) && Arrays.equals(getLocalFileDataExtra(), zipArchiveEntry.getLocalFileDataExtra()) && this.localHeaderOffset == zipArchiveEntry.localHeaderOffset && this.dataOffset == zipArchiveEntry.dataOffset && this.gpb.equals(zipArchiveEntry.gpb)) {
                return true;
            }
        }
        return false;
    }

    public int getAlignment() {
        return this.alignment;
    }

    public byte[] getCentralDirectoryExtra() {
        return ExtraFieldUtils.mergeCentralDirectoryData(getAllExtraFieldsNoCopy());
    }

    public CommentSource getCommentSource() {
        return this.commentSource;
    }

    public long getDataOffset() {
        return this.dataOffset;
    }

    public long getDiskNumberStart() {
        return this.diskNumberStart;
    }

    public long getExternalAttributes() {
        return this.externalAttributes;
    }

    public ZipExtraField getExtraField(ZipShort zipShort) {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        if (zipExtraFieldArr == null) {
            return null;
        }
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            if (zipShort.equals(zipExtraField.getHeaderId())) {
                return zipExtraField;
            }
        }
        return null;
    }

    public ZipExtraField[] getExtraFields(ExtraFieldParsingBehavior extraFieldParsingBehavior) {
        if (extraFieldParsingBehavior == ExtraFieldParsingMode.BEST_EFFORT) {
            return getExtraFields(true);
        }
        if (extraFieldParsingBehavior == ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT) {
            return getExtraFields(false);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(ExtraFieldUtils.parse(getExtra(), true, extraFieldParsingBehavior)));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(ExtraFieldUtils.parse(getCentralDirectoryExtra(), false, extraFieldParsingBehavior)));
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ZipExtraField zipExtraField = (ZipExtraField) obj;
            ZipExtraField zipExtraFieldFindUnparseable = zipExtraField instanceof UnparseableExtraFieldData ? findUnparseable(arrayList2) : findMatching(zipExtraField.getHeaderId(), arrayList2);
            if (zipExtraFieldFindUnparseable != null) {
                byte[] centralDirectoryData = zipExtraFieldFindUnparseable.getCentralDirectoryData();
                if (centralDirectoryData != null && centralDirectoryData.length > 0) {
                    zipExtraField.parseFromCentralDirectoryData(centralDirectoryData, 0, centralDirectoryData.length);
                }
                arrayList2.remove(zipExtraFieldFindUnparseable);
            }
            arrayList3.add(zipExtraField);
        }
        arrayList3.addAll(arrayList2);
        return (ZipExtraField[]) arrayList3.toArray(noExtraFields);
    }

    public GeneralPurposeBit getGeneralPurposeBit() {
        return this.gpb;
    }

    public int getInternalAttributes() {
        return this.internalAttributes;
    }

    @Override // org.apache.commons.sudcompress.archivers.ArchiveEntry
    public Date getLastModifiedDate() {
        return new Date(getTime());
    }

    public byte[] getLocalFileDataExtra() {
        byte[] extra = getExtra();
        return extra != null ? extra : EMPTY;
    }

    public long getLocalHeaderOffset() {
        return this.localHeaderOffset;
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
        return this.method;
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.sudcompress.archivers.ArchiveEntry
    public String getName() {
        String str = this.name;
        return str == null ? super.getName() : str;
    }

    public NameSource getNameSource() {
        return this.nameSource;
    }

    public int getPlatform() {
        return this.platform;
    }

    public int getRawFlag() {
        return this.rawFlag;
    }

    public byte[] getRawName() {
        byte[] bArr = this.rawName;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.sudcompress.archivers.ArchiveEntry
    public long getSize() {
        return this.size;
    }

    public int getUnixMode() {
        if (this.platform != 3) {
            return 0;
        }
        return (int) ((getExternalAttributes() >> 16) & 65535);
    }

    public UnparseableExtraFieldData getUnparseableExtraFieldData() {
        return this.unparseableExtra;
    }

    public int getVersionMadeBy() {
        return this.versionMadeBy;
    }

    public int getVersionRequired() {
        return this.versionRequired;
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
        String name = getName();
        if (name == null) {
            name = "";
        }
        return name.hashCode();
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.sudcompress.archivers.ArchiveEntry
    public boolean isDirectory() {
        String name = getName();
        return name != null && name.endsWith("/");
    }

    public boolean isStreamContiguous() {
        return this.isStreamContiguous;
    }

    public boolean isUnixSymlink() {
        return (getUnixMode() & UnixStat.FILE_TYPE_FLAG) == 40960;
    }

    public void removeExtraField(ZipShort zipShort) {
        if (this.extraFields == null) {
            lmr.m150601a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ZipExtraField zipExtraField : this.extraFields) {
            if (!zipShort.equals(zipExtraField.getHeaderId())) {
                arrayList.add(zipExtraField);
            }
        }
        if (this.extraFields.length == arrayList.size()) {
            lmr.m150601a();
        } else {
            this.extraFields = (ZipExtraField[]) arrayList.toArray(noExtraFields);
            setExtra();
        }
    }

    public void removeUnparseableExtraFieldData() {
        if (this.unparseableExtra == null) {
            lmr.m150601a();
        } else {
            this.unparseableExtra = null;
            setExtra();
        }
    }

    public void setAlignment(int i) {
        if (((i - 1) & i) != 0 || i > 65535) {
            ig3.m135964a(vdg0.m197997a(i, "Invalid value for alignment, must be power of two and no bigger than 65535 but is "));
        } else {
            this.alignment = i;
        }
    }

    public void setCentralDirectoryExtra(byte[] bArr) {
        try {
            mergeExtraFields(ExtraFieldUtils.parse(bArr, false, (ExtraFieldParsingBehavior) ExtraFieldParsingMode.BEST_EFFORT), false);
        } catch (ZipException e) {
            pkq0.m170054a(e.getMessage(), e);
        }
    }

    public void setCommentSource(CommentSource commentSource) {
        this.commentSource = commentSource;
    }

    public void setDataOffset(long j) {
        this.dataOffset = j;
    }

    public void setDiskNumberStart(long j) {
        this.diskNumberStart = j;
    }

    public void setExternalAttributes(long j) {
        this.externalAttributes = j;
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) {
        try {
            mergeExtraFields(ExtraFieldUtils.parse(bArr, true, (ExtraFieldParsingBehavior) ExtraFieldParsingMode.BEST_EFFORT), true);
        } catch (ZipException e) {
            throw new RuntimeException("Error parsing extra fields for entry: " + getName() + " - " + e.getMessage(), e);
        }
    }

    public void setExtraFields(ZipExtraField[] zipExtraFieldArr) {
        this.unparseableExtra = null;
        ArrayList arrayList = new ArrayList();
        if (zipExtraFieldArr != null) {
            for (ZipExtraField zipExtraField : zipExtraFieldArr) {
                if (zipExtraField instanceof UnparseableExtraFieldData) {
                    this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
                } else {
                    arrayList.add(zipExtraField);
                }
            }
        }
        this.extraFields = (ZipExtraField[]) arrayList.toArray(noExtraFields);
        setExtra();
    }

    public void setGeneralPurposeBit(GeneralPurposeBit generalPurposeBit) {
        this.gpb = generalPurposeBit;
    }

    public void setInternalAttributes(int i) {
        this.internalAttributes = i;
    }

    public void setLocalHeaderOffset(long j) {
        this.localHeaderOffset = j;
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int i) {
        if (i >= 0) {
            this.method = i;
        } else {
            ig3.m135964a(vdg0.m197997a(i, "ZIP compression method can not be negative: "));
        }
    }

    public void setName(String str) {
        if (str != null && getPlatform() == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.name = str;
    }

    public void setNameSource(NameSource nameSource) {
        this.nameSource = nameSource;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setRawFlag(int i) {
        this.rawFlag = i;
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long j) {
        if (j >= 0) {
            this.size = j;
        } else {
            ig3.m135964a("Invalid entry size");
        }
    }

    public void setStreamContiguous(boolean z) {
        this.isStreamContiguous = z;
    }

    public void setUnixMode(int i) {
        setExternalAttributes(((i & 128) == 0 ? 1 : 0) | (i << 16) | (isDirectory() ? 16 : 0));
        this.platform = 3;
    }

    public void setVersionMadeBy(int i) {
        this.versionMadeBy = i;
    }

    public void setVersionRequired(int i) {
        this.versionRequired = i;
    }

    public void setName(String str, byte[] bArr) {
        setName(str);
        this.rawName = bArr;
    }

    public void setExtra() {
        super.setExtra(ExtraFieldUtils.mergeLocalFileDataData(getAllExtraFieldsNoCopy()));
    }

    public ZipArchiveEntry(String str) {
        super(str);
        this.method = -1;
        this.size = -1L;
        this.internalAttributes = 0;
        this.platform = 0;
        this.externalAttributes = 0L;
        this.alignment = 0;
        this.unparseableExtra = null;
        this.name = null;
        this.rawName = null;
        this.gpb = new GeneralPurposeBit();
        this.localHeaderOffset = -1L;
        this.dataOffset = -1L;
        this.isStreamContiguous = false;
        this.nameSource = NameSource.NAME;
        this.commentSource = CommentSource.COMMENT;
        setName(str);
    }

    public ZipArchiveEntry(ZipArchiveEntry zipArchiveEntry) {
        this((ZipEntry) zipArchiveEntry);
        setInternalAttributes(zipArchiveEntry.getInternalAttributes());
        setExternalAttributes(zipArchiveEntry.getExternalAttributes());
        setExtraFields(getAllExtraFieldsNoCopy());
        setPlatform(zipArchiveEntry.getPlatform());
        GeneralPurposeBit generalPurposeBit = zipArchiveEntry.getGeneralPurposeBit();
        setGeneralPurposeBit(generalPurposeBit == null ? null : (GeneralPurposeBit) generalPurposeBit.clone());
    }

    public ZipArchiveEntry() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ZipArchiveEntry(File file, String str) {
        if (file.isDirectory() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        this(str);
        if (file.isFile()) {
            setSize(file.length());
        }
        setTime(file.lastModified());
    }

    public ZipExtraField[] getExtraFields(boolean z) {
        if (z) {
            return getAllExtraFields();
        }
        return getParseableExtraFields();
    }

    public ZipExtraField[] getExtraFields() {
        return getParseableExtraFields();
    }
}

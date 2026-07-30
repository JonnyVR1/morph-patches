package org.apache.commons.sudcompress.archivers.zip;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes2.dex */
public class ExtraFieldUtils {
    private static final int WORD = 4;
    private static final Map<ZipShort, Class<?>> implementations = new ConcurrentHashMap();

    public static final class UnparseableExtraField implements UnparseableExtraFieldBehavior {
        public static final int READ_KEY = 2;
        public static final int SKIP_KEY = 1;
        public static final int THROW_KEY = 0;
        private final int key;
        public static final UnparseableExtraField THROW = new UnparseableExtraField(0);
        public static final UnparseableExtraField SKIP = new UnparseableExtraField(1);
        public static final UnparseableExtraField READ = new UnparseableExtraField(2);

        private UnparseableExtraField(int i) {
            this.key = i;
        }

        public int getKey() {
            return this.key;
        }

        @Override // org.apache.commons.sudcompress.archivers.zip.UnparseableExtraFieldBehavior
        public ZipExtraField onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            int i4 = this.key;
            if (i4 == 0) {
                StringBuilder sb = new StringBuilder("Bad extra field starting at ");
                sb.append(i);
                sb.append(".  Block length of ");
                sb.append(i3);
                sb.append(" bytes exceeds remaining data of ");
                sb.append(i2 - 4);
                sb.append(" bytes.");
                throw new ZipException(sb.toString());
            }
            if (i4 == 1) {
                return null;
            }
            if (i4 != 2) {
                throw new ZipException("Unknown UnparseableExtraField key: " + this.key);
            }
            UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
            if (z) {
                unparseableExtraFieldData.parseFromLocalFileData(bArr, i, i2);
                return unparseableExtraFieldData;
            }
            unparseableExtraFieldData.parseFromCentralDirectoryData(bArr, i, i2);
            return unparseableExtraFieldData;
        }
    }

    static {
        register(AsiExtraField.class);
        register(X5455_ExtendedTimestamp.class);
        register(X7875_NewUnix.class);
        register(JarMarker.class);
        register(UnicodePathExtraField.class);
        register(UnicodeCommentExtraField.class);
        register(Zip64ExtendedInformationExtraField.class);
        register(X000A_NTFS.class);
        register(X0014_X509Certificates.class);
        register(X0015_CertificateIdForFile.class);
        register(X0016_CertificateIdForCentralDirectory.class);
        register(X0017_StrongEncryptionHeader.class);
        register(X0019_EncryptionRecipientCertificateList.class);
        register(ResourceAlignmentExtraField.class);
    }

    public static ZipExtraField createExtraField(ZipShort zipShort) {
        ZipExtraField zipExtraFieldCreateExtraFieldNoDefault = createExtraFieldNoDefault(zipShort);
        if (zipExtraFieldCreateExtraFieldNoDefault != null) {
            return zipExtraFieldCreateExtraFieldNoDefault;
        }
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        unrecognizedExtraField.setHeaderId(zipShort);
        return unrecognizedExtraField;
    }

    public static ZipExtraField createExtraFieldNoDefault(ZipShort zipShort) {
        Class<?> cls = implementations.get(zipShort);
        if (cls != null) {
            return (ZipExtraField) cls.newInstance();
        }
        return null;
    }

    public static ZipExtraField fillExtraField(ZipExtraField zipExtraField, byte[] bArr, int i, int i2, boolean z) throws ZipException {
        try {
            if (z) {
                zipExtraField.parseFromLocalFileData(bArr, i, i2);
                return zipExtraField;
            }
            zipExtraField.parseFromCentralDirectoryData(bArr, i, i2);
            return zipExtraField;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ((ZipException) new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(zipExtraField.getHeaderId().getValue())).initCause(e));
        }
    }

    public static byte[] mergeCentralDirectoryData(ZipExtraField[] zipExtraFieldArr) {
        byte[] centralDirectoryData;
        boolean z = zipExtraFieldArr.length > 0 && (zipExtraFieldArr[zipExtraFieldArr.length - 1] instanceof UnparseableExtraFieldData);
        int length = z ? zipExtraFieldArr.length - 1 : zipExtraFieldArr.length;
        int value = length * 4;
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            value += zipExtraField.getCentralDirectoryLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i = 0; i < length; i++) {
            System.arraycopy(zipExtraFieldArr[i].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(zipExtraFieldArr[i].getCentralDirectoryLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] centralDirectoryData2 = zipExtraFieldArr[i].getCentralDirectoryData();
            if (centralDirectoryData2 != null) {
                System.arraycopy(centralDirectoryData2, 0, bArr, length2, centralDirectoryData2.length);
                length2 += centralDirectoryData2.length;
            }
        }
        if (z && (centralDirectoryData = zipExtraFieldArr[zipExtraFieldArr.length - 1].getCentralDirectoryData()) != null) {
            System.arraycopy(centralDirectoryData, 0, bArr, length2, centralDirectoryData.length);
        }
        return bArr;
    }

    public static byte[] mergeLocalFileDataData(ZipExtraField[] zipExtraFieldArr) {
        byte[] localFileDataData;
        boolean z = zipExtraFieldArr.length > 0 && (zipExtraFieldArr[zipExtraFieldArr.length - 1] instanceof UnparseableExtraFieldData);
        int length = z ? zipExtraFieldArr.length - 1 : zipExtraFieldArr.length;
        int value = length * 4;
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            value += zipExtraField.getLocalFileDataLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i = 0; i < length; i++) {
            System.arraycopy(zipExtraFieldArr[i].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(zipExtraFieldArr[i].getLocalFileDataLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] localFileDataData2 = zipExtraFieldArr[i].getLocalFileDataData();
            if (localFileDataData2 != null) {
                System.arraycopy(localFileDataData2, 0, bArr, length2, localFileDataData2.length);
                length2 += localFileDataData2.length;
            }
        }
        if (z && (localFileDataData = zipExtraFieldArr[zipExtraFieldArr.length - 1].getLocalFileDataData()) != null) {
            System.arraycopy(localFileDataData, 0, bArr, length2, localFileDataData.length);
        }
        return bArr;
    }

    public static ZipExtraField[] parse(byte[] bArr, boolean z, ExtraFieldParsingBehavior extraFieldParsingBehavior) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= bArr.length - 4) {
            ZipShort zipShort = new ZipShort(bArr, i);
            int value = new ZipShort(bArr, i + 2).getValue();
            int i2 = i + 4;
            if (i2 + value > bArr.length) {
                ZipExtraField zipExtraFieldOnUnparseableExtraField = extraFieldParsingBehavior.onUnparseableExtraField(bArr, i, bArr.length - i, z, value);
                if (zipExtraFieldOnUnparseableExtraField == null) {
                    break;
                }
                arrayList.add(zipExtraFieldOnUnparseableExtraField);
                break;
            }
            byte[] bArr2 = bArr;
            boolean z2 = z;
            ExtraFieldParsingBehavior extraFieldParsingBehavior2 = extraFieldParsingBehavior;
            try {
                ZipExtraField zipExtraFieldCreateExtraField = extraFieldParsingBehavior2.createExtraField(zipShort);
                Objects.requireNonNull(zipExtraFieldCreateExtraField, "createExtraField must not return null");
                ZipExtraField zipExtraFieldFill = extraFieldParsingBehavior2.fill(zipExtraFieldCreateExtraField, bArr2, i2, value, z2);
                Objects.requireNonNull(zipExtraFieldFill, "fill must not return null");
                arrayList.add(zipExtraFieldFill);
                i += value + 4;
                extraFieldParsingBehavior = extraFieldParsingBehavior2;
                bArr = bArr2;
                z = z2;
            } catch (IllegalAccessException | InstantiationException e) {
                throw ((ZipException) new ZipException(e.getMessage()).initCause(e));
            }
        }
        return (ZipExtraField[]) arrayList.toArray(new ZipExtraField[arrayList.size()]);
    }

    public static void register(Class<?> cls) {
        try {
            implementations.put(((ZipExtraField) cls.newInstance()).getHeaderId(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            throw new RuntimeException(cls + " is not a concrete class");
        }
    }

    public static ZipExtraField[] parse(byte[] bArr, boolean z) {
        return parse(bArr, z, UnparseableExtraField.THROW);
    }

    public static ZipExtraField[] parse(byte[] bArr, boolean z, final UnparseableExtraField unparseableExtraField) {
        return parse(bArr, z, new ExtraFieldParsingBehavior() { // from class: org.apache.commons.sudcompress.archivers.zip.ExtraFieldUtils.1
            @Override // org.apache.commons.sudcompress.archivers.zip.ExtraFieldParsingBehavior
            public ZipExtraField createExtraField(ZipShort zipShort) {
                return ExtraFieldUtils.createExtraField(zipShort);
            }

            @Override // org.apache.commons.sudcompress.archivers.zip.ExtraFieldParsingBehavior
            public ZipExtraField fill(ZipExtraField zipExtraField, byte[] bArr2, int i, int i2, boolean z2) {
                return ExtraFieldUtils.fillExtraField(zipExtraField, bArr2, i, i2, z2);
            }

            @Override // org.apache.commons.sudcompress.archivers.zip.UnparseableExtraFieldBehavior
            public ZipExtraField onUnparseableExtraField(byte[] bArr2, int i, int i2, boolean z2, int i3) {
                return unparseableExtraField.onUnparseableExtraField(bArr2, i, i2, z2, i3);
            }
        });
    }

    public static ZipExtraField[] parse(byte[] bArr) {
        return parse(bArr, true, UnparseableExtraField.THROW);
    }
}

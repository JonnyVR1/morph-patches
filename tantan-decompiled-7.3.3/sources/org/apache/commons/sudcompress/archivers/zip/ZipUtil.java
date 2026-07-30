package org.apache.commons.sudcompress.archivers.zip;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import p153l.i2r0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZipUtil {
    private static final byte[] DOS_TIME_MIN = ZipLong.getBytes(8448);

    public static long adjustToLong(int i) {
        long j = i;
        return i < 0 ? j + 4294967296L : j;
    }

    public static long bigToLong(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new NumberFormatException("The BigInteger cannot fit inside a 64 bit java long: [" + bigInteger + Constants.AES_SUFFIX);
    }

    public static boolean canHandleEntryData(ZipArchiveEntry zipArchiveEntry) {
        return supportsEncryptionOf(zipArchiveEntry) && supportsMethodOf(zipArchiveEntry);
    }

    public static void checkRequestedFeatures(ZipArchiveEntry zipArchiveEntry) throws UnsupportedZipFeatureException {
        if (!supportsEncryptionOf(zipArchiveEntry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.ENCRYPTION, zipArchiveEntry);
        }
        if (supportsMethodOf(zipArchiveEntry)) {
            return;
        }
        ZipMethod methodByCode = ZipMethod.getMethodByCode(zipArchiveEntry.getMethod());
        if (methodByCode != null) {
            throw new UnsupportedZipFeatureException(methodByCode, zipArchiveEntry);
        }
        throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.METHOD, zipArchiveEntry);
    }

    public static byte[] copy(byte[] bArr) {
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public static long dosToJavaTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
        calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
        calendar.set(5, ((int) (j >> 16)) & 31);
        calendar.set(11, ((int) (j >> 11)) & 31);
        calendar.set(12, ((int) (j >> 5)) & 63);
        calendar.set(13, ((int) (j << 1)) & 62);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    public static Date fromDosTime(ZipLong zipLong) {
        return new Date(dosToJavaTime(zipLong.getValue()));
    }

    private static String getUnicodeStringIfOriginalMatches(AbstractUnicodeExtraField abstractUnicodeExtraField, byte[] bArr) {
        if (abstractUnicodeExtraField != null) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            if (crc32.getValue() == abstractUnicodeExtraField.getNameCRC32()) {
                try {
                    return ZipEncodingHelper.UTF8_ZIP_ENCODING.decode(abstractUnicodeExtraField.getUnicodeName());
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    public static BigInteger longToBig(long j) {
        if (j >= -2147483648L) {
            if (j < 0 && j >= -2147483648L) {
                j = adjustToLong((int) j);
            }
            return BigInteger.valueOf(j);
        }
        throw new IllegalArgumentException("Negative longs < -2^31 not permitted: [" + j + Constants.AES_SUFFIX);
    }

    public static byte[] reverse(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            int i2 = length - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    public static void setNameAndCommentFromExtraFields(ZipArchiveEntry zipArchiveEntry, byte[] bArr, byte[] bArr2) {
        ZipExtraField extraField = zipArchiveEntry.getExtraField(UnicodePathExtraField.UPATH_ID);
        String unicodeStringIfOriginalMatches = getUnicodeStringIfOriginalMatches(extraField instanceof UnicodePathExtraField ? (UnicodePathExtraField) extraField : null, bArr);
        if (unicodeStringIfOriginalMatches != null) {
            zipArchiveEntry.setName(unicodeStringIfOriginalMatches);
            zipArchiveEntry.setNameSource(ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD);
        }
        if (bArr2 == null || bArr2.length <= 0) {
            return;
        }
        ZipExtraField extraField2 = zipArchiveEntry.getExtraField(UnicodeCommentExtraField.UCOM_ID);
        String unicodeStringIfOriginalMatches2 = getUnicodeStringIfOriginalMatches(extraField2 instanceof UnicodeCommentExtraField ? (UnicodeCommentExtraField) extraField2 : null, bArr2);
        if (unicodeStringIfOriginalMatches2 != null) {
            zipArchiveEntry.setComment(unicodeStringIfOriginalMatches2);
            zipArchiveEntry.setCommentSource(ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD);
        }
    }

    public static int signedByteToUnsignedInt(byte b) {
        return b >= 0 ? b : b + 256;
    }

    private static boolean supportsEncryptionOf(ZipArchiveEntry zipArchiveEntry) {
        return !zipArchiveEntry.getGeneralPurposeBit().usesEncryption();
    }

    private static boolean supportsMethodOf(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getMethod() == 0 || zipArchiveEntry.getMethod() == ZipMethod.UNSHRINKING.getCode() || zipArchiveEntry.getMethod() == ZipMethod.IMPLODING.getCode() || zipArchiveEntry.getMethod() == 8 || zipArchiveEntry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode() || zipArchiveEntry.getMethod() == ZipMethod.BZIP2.getCode();
    }

    public static void toDosTime(Calendar calendar, long j, byte[] bArr, int i) {
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(1);
        if (i2 < 1980) {
            copy(DOS_TIME_MIN, bArr, i);
        } else {
            ZipLong.putLong((calendar.get(13) >> 1) | ((i2 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5), bArr, i);
        }
    }

    public static byte unsignedIntToSignedByte(int i) {
        if (i <= 255 && i >= 0) {
            return i < 128 ? (byte) i : (byte) (i - 256);
        }
        i2r0.m138234a("Can only convert non-negative integers between [0,255] to byte: [", i, Constants.AES_SUFFIX);
        return (byte) 0;
    }

    public static void copy(byte[] bArr, byte[] bArr2, int i) {
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        }
    }

    public static byte[] toDosTime(long j) {
        byte[] bArr = new byte[4];
        toDosTime(j, bArr, 0);
        return bArr;
    }

    public static void toDosTime(long j, byte[] bArr, int i) {
        toDosTime(Calendar.getInstance(), j, bArr, i);
    }

    public static ZipLong toDosTime(Date date) {
        return new ZipLong(toDosTime(date.getTime()));
    }
}

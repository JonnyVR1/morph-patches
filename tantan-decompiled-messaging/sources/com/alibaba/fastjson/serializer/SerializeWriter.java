package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.RyuDouble;
import com.alibaba.fastjson.util.RyuFloat;
import com.clevertap.android.sdk.Constants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;
import p149l.k250;
import p149l.piq;
import p149l.qq3;
import p149l.zkl;

/* JADX INFO: loaded from: classes.dex */
public final class SerializeWriter extends Writer {
    private static int BUFFER_THRESHOLD;
    private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
    private static final ThreadLocal<byte[]> bytesBufLocal = new ThreadLocal<>();
    static final int nonDirectFeatures;
    protected boolean beanToArray;
    protected boolean browserSecure;
    protected char[] buf;
    protected int count;
    protected boolean disableCircularReferenceDetect;
    protected int features;
    protected char keySeperator;
    protected int maxBufSize;
    protected boolean notWriteDefaultValue;
    protected boolean quoteFieldNames;
    protected long sepcialBits;
    protected boolean sortField;
    protected boolean useSingleQuotes;
    protected boolean writeDirect;
    protected boolean writeEnumUsingName;
    protected boolean writeEnumUsingToString;
    protected boolean writeNonStringValueAsString;
    private final Writer writer;

    static {
        int i;
        BUFFER_THRESHOLD = 131072;
        try {
            String stringProperty = IOUtils.getStringProperty("fastjson.serializer_buffer_threshold");
            if (stringProperty != null && stringProperty.length() > 0 && (i = Integer.parseInt(stringProperty)) >= 64 && i <= 65536) {
                BUFFER_THRESHOLD = i * 1024;
            }
        } catch (Throwable unused) {
        }
        nonDirectFeatures = SerializerFeature.UseSingleQuotes.mask | SerializerFeature.BrowserCompatible.mask | SerializerFeature.PrettyFormat.mask | SerializerFeature.WriteEnumUsingToString.mask | SerializerFeature.WriteNonStringValueAsString.mask | SerializerFeature.WriteSlashAsSpecial.mask | SerializerFeature.IgnoreErrorGetter.mask | SerializerFeature.WriteClassName.mask | SerializerFeature.NotWriteDefaultValue.mask;
    }

    public SerializeWriter(Writer writer, int i, SerializerFeature... serializerFeatureArr) {
        this.maxBufSize = -1;
        this.writer = writer;
        ThreadLocal<char[]> threadLocal = bufLocal;
        char[] cArr = threadLocal.get();
        this.buf = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        } else {
            this.buf = new char[2048];
        }
        for (SerializerFeature serializerFeature : serializerFeatureArr) {
            i |= serializerFeature.getMask();
        }
        this.features = i;
        computeFeatures();
    }

    private int encodeToUTF8(OutputStream outputStream) throws IOException {
        int i = (int) (((double) this.count) * 3.0d);
        ThreadLocal<byte[]> threadLocal = bytesBufLocal;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[8192];
            threadLocal.set(bArr);
        }
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        int iEncodeUTF8 = IOUtils.encodeUTF8(this.buf, 0, this.count, bArr);
        outputStream.write(bArr, 0, iEncodeUTF8);
        return iEncodeUTF8;
    }

    private byte[] encodeToUTF8Bytes() {
        int i = (int) (((double) this.count) * 3.0d);
        ThreadLocal<byte[]> threadLocal = bytesBufLocal;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[8192];
            threadLocal.set(bArr);
        }
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        int iEncodeUTF8 = IOUtils.encodeUTF8(this.buf, 0, this.count, bArr);
        byte[] bArr2 = new byte[iEncodeUTF8];
        System.arraycopy(bArr, 0, bArr2, 0, iEncodeUTF8);
        return bArr2;
    }

    private void writeEnumFieldValue(char c, String str, String str2) {
        if (this.useSingleQuotes) {
            writeFieldValue(c, str, str2);
        } else {
            writeFieldValueStringWithDoubleQuote(c, str, str2);
        }
    }

    private void writeKeyWithSingleQuoteIfHasSpecial(String str) {
        int i;
        byte[] bArr = IOUtils.specicalFlags_singleQuotes;
        int length = str.length();
        int i2 = 1;
        int i3 = this.count + length + 1;
        if (i3 > this.buf.length) {
            if (this.writer != null) {
                if (length == 0) {
                    write(39);
                    write(39);
                    write(58);
                    return;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    char cCharAt = str.charAt(i4);
                    if (cCharAt < bArr.length && bArr[cCharAt] != 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i2 != 0) {
                    write(39);
                }
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 >= bArr.length || bArr[cCharAt2] == 0) {
                        write(cCharAt2);
                    } else {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt2]);
                    }
                }
                if (i2 != 0) {
                    write(39);
                }
                write(58);
                return;
            }
            expandCapacity(i3);
        }
        int i6 = this.count;
        if (length == 0) {
            if (i6 + 3 > this.buf.length) {
                expandCapacity(i6 + 3);
            }
            char[] cArr = this.buf;
            int i7 = this.count;
            int i8 = i7 + 1;
            this.count = i8;
            cArr[i7] = '\'';
            int i9 = i7 + 2;
            this.count = i9;
            cArr[i8] = '\'';
            this.count = i7 + 3;
            cArr[i9] = ':';
            return;
        }
        int i10 = i6 + length;
        str.getChars(0, length, this.buf, i6);
        this.count = i3;
        int i11 = i6;
        int i12 = 0;
        while (true) {
            char[] cArr2 = this.buf;
            if (i11 >= i10) {
                cArr2[i3 - 1] = ':';
                return;
            }
            char c = cArr2[i11];
            if (c >= bArr.length || bArr[c] == 0) {
                i = i2;
            } else if (i12 == 0) {
                i3 += 3;
                if (i3 > cArr2.length) {
                    expandCapacity(i3);
                }
                this.count = i3;
                char[] cArr3 = this.buf;
                int i13 = i11 + 1;
                System.arraycopy(cArr3, i13, cArr3, i11 + 3, (i10 - i11) - i2);
                char[] cArr4 = this.buf;
                System.arraycopy(cArr4, 0, cArr4, i2, i11);
                char[] cArr5 = this.buf;
                cArr5[i6] = '\'';
                cArr5[i13] = '\\';
                i11 += 2;
                cArr5[i11] = IOUtils.replaceChars[c];
                i10 += 2;
                cArr5[this.count - 2] = '\'';
                i12 = i2;
                i = i12;
            } else {
                i3++;
                if (i3 > cArr2.length) {
                    expandCapacity(i3);
                }
                this.count = i3;
                char[] cArr6 = this.buf;
                int i14 = i11 + 1;
                i = i2;
                System.arraycopy(cArr6, i14, cArr6, i11 + 2, i10 - i11);
                char[] cArr7 = this.buf;
                cArr7[i11] = '\\';
                cArr7[i14] = IOUtils.replaceChars[c];
                i10++;
                i11 = i14;
            }
            i11++;
            i2 = i;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i, i2).toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.writer != null && this.count > 0) {
            flush();
        }
        char[] cArr = this.buf;
        if (cArr.length <= BUFFER_THRESHOLD) {
            bufLocal.set(cArr);
        }
        this.buf = null;
    }

    public void computeFeatures() {
        long j;
        int i = this.features;
        boolean z = (SerializerFeature.QuoteFieldNames.mask & i) != 0;
        this.quoteFieldNames = z;
        boolean z2 = (SerializerFeature.UseSingleQuotes.mask & i) != 0;
        this.useSingleQuotes = z2;
        this.sortField = (SerializerFeature.SortField.mask & i) != 0;
        this.disableCircularReferenceDetect = (SerializerFeature.DisableCircularReferenceDetect.mask & i) != 0;
        boolean z3 = (SerializerFeature.BeanToArray.mask & i) != 0;
        this.beanToArray = z3;
        this.writeNonStringValueAsString = (SerializerFeature.WriteNonStringValueAsString.mask & i) != 0;
        this.notWriteDefaultValue = (SerializerFeature.NotWriteDefaultValue.mask & i) != 0;
        boolean z4 = (SerializerFeature.WriteEnumUsingName.mask & i) != 0;
        this.writeEnumUsingName = z4;
        this.writeEnumUsingToString = (SerializerFeature.WriteEnumUsingToString.mask & i) != 0;
        this.writeDirect = z && (nonDirectFeatures & i) == 0 && (z3 || z4);
        this.keySeperator = z2 ? '\'' : '\"';
        boolean z5 = (SerializerFeature.BrowserSecure.mask & i) != 0;
        this.browserSecure = z5;
        if (z5) {
            j = 5764610843043954687L;
        } else {
            j = (i & SerializerFeature.WriteSlashAsSpecial.mask) != 0 ? 140758963191807L : 21474836479L;
        }
        this.sepcialBits = j;
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
        int i = this.features;
        if (z) {
            int mask = serializerFeature.getMask() | i;
            this.features = mask;
            SerializerFeature serializerFeature2 = SerializerFeature.WriteEnumUsingToString;
            if (serializerFeature == serializerFeature2) {
                this.features = (~SerializerFeature.WriteEnumUsingName.getMask()) & mask;
            } else if (serializerFeature == SerializerFeature.WriteEnumUsingName) {
                this.features = (~serializerFeature2.getMask()) & mask;
            }
        } else {
            this.features = (~serializerFeature.getMask()) & i;
        }
        computeFeatures();
    }

    public void expandCapacity(int i) {
        ThreadLocal<char[]> threadLocal;
        char[] cArr;
        int i2 = this.maxBufSize;
        if (i2 != -1 && i >= i2) {
            throw new JSONException("serialize exceeded MAX_OUTPUT_LENGTH=" + this.maxBufSize + ", minimumCapacity=" + i);
        }
        char[] cArr2 = this.buf;
        int length = cArr2.length + (cArr2.length >> 1) + 1;
        if (length >= i) {
            i = length;
        }
        char[] cArr3 = new char[i];
        System.arraycopy(cArr2, 0, cArr3, 0, this.count);
        if (this.buf.length < BUFFER_THRESHOLD && ((cArr = (threadLocal = bufLocal).get()) == null || cArr.length < this.buf.length)) {
            threadLocal.set(this.buf);
        }
        this.buf = cArr3;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        Writer writer = this.writer;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.buf, 0, this.count);
            this.writer.flush();
            this.count = 0;
        } catch (IOException e) {
            piq.m169752a(e.getMessage(), e);
        }
    }

    public int getBufferLength() {
        return this.buf.length;
    }

    public int getMaxBufSize() {
        return this.maxBufSize;
    }

    public boolean isEnabled(SerializerFeature serializerFeature) {
        return (this.features & serializerFeature.mask) != 0;
    }

    public boolean isNotWriteDefaultValue() {
        return this.notWriteDefaultValue;
    }

    public boolean isSortField() {
        return this.sortField;
    }

    public void setMaxBufSize(int i) {
        if (i >= this.buf.length) {
            this.maxBufSize = i;
            return;
        }
        throw new JSONException("must > " + this.buf.length);
    }

    public int size() {
        return this.count;
    }

    public byte[] toBytes(Charset charset) {
        if (this.writer == null) {
            return charset == IOUtils.UTF8 ? encodeToUTF8Bytes() : new String(this.buf, 0, this.count).getBytes(charset);
        }
        qq3.m175877a("writer not null");
        return null;
    }

    public char[] toCharArray() {
        if (this.writer != null) {
            qq3.m175877a("writer not null");
            return null;
        }
        int i = this.count;
        char[] cArr = new char[i];
        System.arraycopy(this.buf, 0, cArr, 0, i);
        return cArr;
    }

    public char[] toCharArrayForSpringWebSocket() {
        if (this.writer != null) {
            qq3.m175877a("writer not null");
            return null;
        }
        int i = this.count;
        char[] cArr = new char[i - 2];
        System.arraycopy(this.buf, 1, cArr, 0, i - 2);
        return cArr;
    }

    public String toString() {
        return new String(this.buf, 0, this.count);
    }

    public void write(List<String> list) {
        boolean z;
        int i;
        if (list.isEmpty()) {
            write(WeJson.EMPTY_ARR);
            return;
        }
        int i2 = this.count;
        int size = list.size();
        int i3 = i2;
        int i4 = 0;
        while (i4 < size) {
            String str = list.get(i4);
            if (str == null) {
                z = true;
            } else {
                int length = str.length();
                z = false;
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = str.charAt(i5);
                    z = cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\\';
                    if (z) {
                        break;
                    }
                }
            }
            if (z) {
                this.count = i2;
                write(91);
                for (int i6 = 0; i6 < list.size(); i6++) {
                    String str2 = list.get(i6);
                    if (i6 != 0) {
                        write(44);
                    }
                    if (str2 == null) {
                        write("null");
                    } else {
                        writeStringWithDoubleQuote(str2, (char) 0);
                    }
                }
                write(93);
                return;
            }
            int length2 = str.length() + i3;
            int i7 = length2 + 3;
            if (i4 == list.size() - 1) {
                i7 = length2 + 4;
            }
            if (i7 > this.buf.length) {
                this.count = i3;
                expandCapacity(i7);
            }
            char[] cArr = this.buf;
            if (i4 == 0) {
                i = i3 + 1;
                cArr[i3] = '[';
            } else {
                i = i3 + 1;
                cArr[i3] = ',';
            }
            int i8 = i + 1;
            this.buf[i] = '\"';
            str.getChars(0, str.length(), this.buf, i8);
            int length3 = i8 + str.length();
            this.buf[length3] = '\"';
            i4++;
            i3 = length3 + 1;
        }
        this.buf[i3] = ']';
        this.count = i3 + 1;
    }

    public void writeByteArray(byte[] bArr) {
        if (isEnabled(SerializerFeature.WriteClassName.mask)) {
            writeHex(bArr);
            return;
        }
        int length = bArr.length;
        boolean z = this.useSingleQuotes;
        char c = z ? '\'' : '\"';
        if (length == 0) {
            write(z ? "''" : "\"\"");
            return;
        }
        char[] cArr = IOUtils.f3878CA;
        int i = (length / 3) * 3;
        int i2 = length - 1;
        int i3 = this.count;
        int i4 = (((i2 / 3) + 1) << 2) + i3;
        int i5 = i4 + 2;
        if (i5 > this.buf.length) {
            if (this.writer != null) {
                write(c);
                int i6 = 0;
                while (i6 < i) {
                    int i7 = i6 + 2;
                    int i8 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16);
                    i6 += 3;
                    int i9 = i8 | (bArr[i7] & 255);
                    write(cArr[(i9 >>> 18) & 63]);
                    write(cArr[(i9 >>> 12) & 63]);
                    write(cArr[(i9 >>> 6) & 63]);
                    write(cArr[i9 & 63]);
                }
                int i10 = length - i;
                if (i10 > 0) {
                    int i11 = ((bArr[i] & 255) << 10) | (i10 == 2 ? (bArr[i2] & 255) << 2 : 0);
                    write(cArr[i11 >> 12]);
                    write(cArr[(i11 >>> 6) & 63]);
                    write(i10 == 2 ? cArr[i11 & 63] : '=');
                    write(61);
                }
                write(c);
                return;
            }
            expandCapacity(i5);
        }
        this.count = i5;
        int i12 = i3 + 1;
        this.buf[i3] = c;
        int i13 = 0;
        while (i13 < i) {
            int i14 = i13 + 2;
            int i15 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16);
            i13 += 3;
            int i16 = i15 | (bArr[i14] & 255);
            char[] cArr2 = this.buf;
            cArr2[i12] = cArr[(i16 >>> 18) & 63];
            cArr2[i12 + 1] = cArr[(i16 >>> 12) & 63];
            int i17 = i12 + 3;
            cArr2[i12 + 2] = cArr[(i16 >>> 6) & 63];
            i12 += 4;
            cArr2[i17] = cArr[i16 & 63];
        }
        int i18 = length - i;
        if (i18 > 0) {
            int i19 = ((bArr[i] & 255) << 10) | (i18 == 2 ? (bArr[i2] & 255) << 2 : 0);
            char[] cArr3 = this.buf;
            cArr3[i4 - 3] = cArr[i19 >> 12];
            cArr3[i4 - 2] = cArr[(i19 >>> 6) & 63];
            cArr3[i4 - 1] = i18 == 2 ? cArr[i19 & 63] : '=';
            cArr3[i4] = '=';
        }
        this.buf[i4 + 1] = c;
    }

    public void writeDouble(double d, boolean z) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            writeNull();
            return;
        }
        int i = this.count + 24;
        if (i > this.buf.length) {
            if (this.writer != null) {
                String string = RyuDouble.toString(d);
                write(string, 0, string.length());
                if (z && isEnabled(SerializerFeature.WriteClassName)) {
                    write(68);
                    return;
                }
                return;
            }
            expandCapacity(i);
        }
        this.count += RyuDouble.toString(d, this.buf, this.count);
        if (z && isEnabled(SerializerFeature.WriteClassName)) {
            write(68);
        }
    }

    public void writeEnum(Enum<?> r2) {
        String string;
        if (r2 == null) {
            writeNull();
            return;
        }
        if (!this.writeEnumUsingName || this.writeEnumUsingToString) {
            string = this.writeEnumUsingToString ? r2.toString() : null;
        } else {
            string = r2.name();
        }
        if (string == null) {
            writeInt(r2.ordinal());
            return;
        }
        int i = isEnabled(SerializerFeature.UseSingleQuotes) ? 39 : 34;
        write(i);
        write(string);
        write(i);
    }

    public void writeFieldName(String str, boolean z) {
        if (str == null) {
            write("null:");
            return;
        }
        boolean z2 = this.useSingleQuotes;
        boolean z3 = this.quoteFieldNames;
        if (z2) {
            if (!z3) {
                writeKeyWithSingleQuoteIfHasSpecial(str);
                return;
            } else {
                writeStringWithSingleQuote(str);
                write(58);
                return;
            }
        }
        if (z3) {
            writeStringWithDoubleQuote(str, ':');
            return;
        }
        int i = 0;
        boolean z4 = true;
        boolean z5 = str.length() == 0;
        while (true) {
            if (i >= str.length()) {
                z4 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt < '@' && (this.sepcialBits & (1 << cCharAt)) != 0) || cCharAt == '\\') {
                break;
            } else {
                i++;
            }
        }
        if (z4) {
            writeStringWithDoubleQuote(str, ':');
        } else {
            write(str);
            write(58);
        }
    }

    public void writeFieldNameDirect(String str) {
        int length = str.length();
        int i = this.count + length;
        int i2 = i + 3;
        if (i2 > this.buf.length) {
            expandCapacity(i2);
        }
        int i3 = this.count;
        char[] cArr = this.buf;
        cArr[i3] = '\"';
        str.getChars(0, length, cArr, i3 + 1);
        this.count = i2;
        char[] cArr2 = this.buf;
        cArr2[i + 1] = '\"';
        cArr2[i + 2] = ':';
    }

    public void writeFieldValue(char c, String str, long j) {
        if (j == Long.MIN_VALUE || !this.quoteFieldNames || isEnabled(SerializerFeature.BrowserCompatible.mask)) {
            write(c);
            writeFieldName(str);
            writeLong(j);
            return;
        }
        int iStringSize = j < 0 ? IOUtils.stringSize(-j) + 1 : IOUtils.stringSize(j);
        int length = str.length();
        int i = this.count + length + 4 + iStringSize;
        if (i > this.buf.length) {
            if (this.writer != null) {
                write(c);
                writeFieldName(str);
                writeLong(j);
                return;
            }
            expandCapacity(i);
        }
        int i2 = this.count;
        this.count = i;
        char[] cArr = this.buf;
        cArr[i2] = c;
        int i3 = i2 + length;
        cArr[i2 + 1] = this.keySeperator;
        str.getChars(0, length, cArr, i2 + 2);
        char[] cArr2 = this.buf;
        cArr2[i3 + 2] = this.keySeperator;
        cArr2[i3 + 3] = ':';
        IOUtils.getChars(j, this.count, cArr2);
    }

    public void writeFieldValueStringWithDoubleQuote(char c, String str, String str2) {
        int length = str.length();
        int i = this.count;
        int length2 = str2.length();
        int i2 = i + length + length2 + 6;
        if (i2 > this.buf.length) {
            if (this.writer != null) {
                write(c);
                writeStringWithDoubleQuote(str, ':');
                writeStringWithDoubleQuote(str2, (char) 0);
                return;
            }
            expandCapacity(i2);
        }
        char[] cArr = this.buf;
        int i3 = this.count;
        cArr[i3] = c;
        int i4 = i3 + 2;
        int i5 = i4 + length;
        cArr[i3 + 1] = '\"';
        str.getChars(0, length, cArr, i4);
        this.count = i2;
        char[] cArr2 = this.buf;
        cArr2[i5] = '\"';
        cArr2[i5 + 1] = ':';
        cArr2[i5 + 2] = '\"';
        str2.getChars(0, length2, cArr2, i5 + 3);
        this.buf[this.count - 1] = '\"';
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    public void writeFieldValueStringWithDoubleQuoteCheck(char c, String str, String str2) {
        int length;
        int i;
        char c2;
        char c3;
        int i2;
        int length2 = str.length();
        int i3 = this.count;
        if (str2 == null) {
            i = i3 + length2 + 8;
            length = 4;
        } else {
            length = str2.length();
            i = i3 + length2 + length + 6;
        }
        int i4 = 0;
        if (i > this.buf.length) {
            if (this.writer != null) {
                write(c);
                writeStringWithDoubleQuote(str, ':');
                writeStringWithDoubleQuote(str2, (char) 0);
                return;
            }
            expandCapacity(i);
        }
        char[] cArr = this.buf;
        int i5 = this.count;
        cArr[i5] = c;
        int i6 = i5 + 2;
        int i7 = i6 + length2;
        char c4 = '\"';
        cArr[i5 + 1] = '\"';
        str.getChars(0, length2, cArr, i6);
        this.count = i;
        char[] cArr2 = this.buf;
        cArr2[i7] = '\"';
        int i8 = i7 + 2;
        cArr2[i7 + 1] = ':';
        char c5 = 'u';
        if (str2 == null) {
            cArr2[i8] = 'n';
            cArr2[i7 + 3] = 'u';
            cArr2[i7 + 4] = Constants.INAPP_POSITION_LEFT;
            cArr2[i7 + 5] = Constants.INAPP_POSITION_LEFT;
            return;
        }
        int i9 = i7 + 3;
        cArr2[i8] = '\"';
        int i10 = i9 + length;
        str2.getChars(0, length, cArr2, i9);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        char c6 = 0;
        int i14 = i9;
        while (true) {
            c2 = c5;
            c3 = c4;
            if (i14 >= i10) {
                break;
            }
            char c7 = this.buf[i14];
            if (c7 >= ']') {
                if (c7 < 127 || !(c7 == 8232 || c7 == 8233 || c7 < 160)) {
                    i2 = i11;
                } else {
                    if (i12 == i11) {
                        i12 = i14;
                    }
                    i4++;
                    i += 4;
                    i2 = i11;
                    i13 = i14;
                    c6 = c7;
                }
            } else if ((c7 >= '@' || (this.sepcialBits & (1 << c7)) == 0) && c7 != '\\') {
                i2 = -1;
            } else {
                i4++;
                if (c7 == '(' || c7 == ')' || c7 == '<' || c7 == '>') {
                    i += 4;
                } else {
                    byte[] bArr = IOUtils.specicalFlags_doubleQuotes;
                    if (c7 < bArr.length && bArr[c7] == 4) {
                        i += 4;
                    }
                }
                i2 = -1;
                if (i12 == -1) {
                    i12 = i14;
                    i13 = i12;
                } else {
                    i13 = i14;
                }
                c6 = c7;
            }
            i14++;
            c5 = c2;
            i11 = i2;
            c4 = c3;
        }
        if (i4 > 0) {
            int i15 = i + i4;
            if (i15 > this.buf.length) {
                expandCapacity(i15);
            }
            this.count = i15;
            if (i4 == 1) {
                if (c6 == 8232) {
                    int i16 = i13 + 1;
                    char[] cArr3 = this.buf;
                    System.arraycopy(cArr3, i16, cArr3, i13 + 6, (i10 - i13) - 1);
                    char[] cArr4 = this.buf;
                    cArr4[i13] = '\\';
                    cArr4[i16] = c2;
                    cArr4[i13 + 2] = '2';
                    cArr4[i13 + 3] = '0';
                    cArr4[i13 + 4] = '2';
                    cArr4[i13 + 5] = '8';
                } else if (c6 == 8233) {
                    int i17 = i13 + 1;
                    char[] cArr5 = this.buf;
                    System.arraycopy(cArr5, i17, cArr5, i13 + 6, (i10 - i13) - 1);
                    char[] cArr6 = this.buf;
                    cArr6[i13] = '\\';
                    cArr6[i17] = c2;
                    cArr6[i13 + 2] = '2';
                    cArr6[i13 + 3] = '0';
                    cArr6[i13 + 4] = '2';
                    cArr6[i13 + 5] = '9';
                } else if (c6 == '(' || c6 == ')' || c6 == '<' || c6 == '>') {
                    int i18 = i13 + 1;
                    char[] cArr7 = this.buf;
                    System.arraycopy(cArr7, i18, cArr7, i13 + 6, (i10 - i13) - 1);
                    char[] cArr8 = this.buf;
                    cArr8[i13] = '\\';
                    cArr8[i18] = c2;
                    char[] cArr9 = IOUtils.DIGITS;
                    cArr8[i13 + 2] = cArr9[(c6 >>> '\f') & 15];
                    cArr8[i13 + 3] = cArr9[(c6 >>> '\b') & 15];
                    cArr8[i13 + 4] = cArr9[(c6 >>> 4) & 15];
                    cArr8[i13 + 5] = cArr9[c6 & 15];
                } else {
                    byte[] bArr2 = IOUtils.specicalFlags_doubleQuotes;
                    if (c6 >= bArr2.length || bArr2[c6] != 4) {
                        int i19 = i13 + 1;
                        char[] cArr10 = this.buf;
                        System.arraycopy(cArr10, i19, cArr10, i13 + 2, (i10 - i13) - 1);
                        char[] cArr11 = this.buf;
                        cArr11[i13] = '\\';
                        cArr11[i19] = IOUtils.replaceChars[c6];
                    } else {
                        int i20 = i13 + 1;
                        char[] cArr12 = this.buf;
                        System.arraycopy(cArr12, i20, cArr12, i13 + 6, (i10 - i13) - 1);
                        char[] cArr13 = this.buf;
                        cArr13[i13] = '\\';
                        cArr13[i20] = c2;
                        char[] cArr14 = IOUtils.DIGITS;
                        cArr13[i13 + 2] = cArr14[(c6 >>> '\f') & 15];
                        cArr13[i13 + 3] = cArr14[(c6 >>> '\b') & 15];
                        cArr13[i13 + 4] = cArr14[(c6 >>> 4) & 15];
                        cArr13[i13 + 5] = cArr14[c6 & 15];
                    }
                }
            } else if (i4 > 1) {
                for (int i21 = i12 - i9; i21 < str2.length(); i21++) {
                    char cCharAt = str2.charAt(i21);
                    if (this.browserSecure) {
                        if (cCharAt != '(' && cCharAt != ')') {
                            if (cCharAt == '<' || cCharAt == '>') {
                            }
                        }
                        char[] cArr15 = this.buf;
                        cArr15[i12] = '\\';
                        cArr15[i12 + 1] = c2;
                        char[] cArr16 = IOUtils.DIGITS;
                        cArr15[i12 + 2] = cArr16[(cCharAt >>> '\f') & 15];
                        cArr15[i12 + 3] = cArr16[(cCharAt >>> '\b') & 15];
                        int i22 = i12 + 5;
                        cArr15[i12 + 4] = cArr16[(cCharAt >>> 4) & 15];
                        i12 += 6;
                        cArr15[i22] = cArr16[cCharAt & 15];
                    }
                    byte[] bArr3 = IOUtils.specicalFlags_doubleQuotes;
                    if ((cCharAt < bArr3.length && bArr3[cCharAt] != 0) || (cCharAt == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        char[] cArr17 = this.buf;
                        int i23 = i12 + 1;
                        cArr17[i12] = '\\';
                        if (bArr3[cCharAt] == 4) {
                            cArr17[i23] = c2;
                            char[] cArr18 = IOUtils.DIGITS;
                            cArr17[i12 + 2] = cArr18[(cCharAt >>> '\f') & 15];
                            cArr17[i12 + 3] = cArr18[(cCharAt >>> '\b') & 15];
                            int i24 = i12 + 5;
                            cArr17[i12 + 4] = cArr18[(cCharAt >>> 4) & 15];
                            i12 += 6;
                            cArr17[i24] = cArr18[cCharAt & 15];
                        } else {
                            i12 += 2;
                            cArr17[i23] = IOUtils.replaceChars[cCharAt];
                        }
                    } else if (cCharAt == 8232 || cCharAt == 8233) {
                        char[] cArr19 = this.buf;
                        cArr19[i12] = '\\';
                        cArr19[i12 + 1] = c2;
                        char[] cArr20 = IOUtils.DIGITS;
                        cArr19[i12 + 2] = cArr20[(cCharAt >>> '\f') & 15];
                        cArr19[i12 + 3] = cArr20[(cCharAt >>> '\b') & 15];
                        int i25 = i12 + 5;
                        cArr19[i12 + 4] = cArr20[(cCharAt >>> 4) & 15];
                        i12 += 6;
                        cArr19[i25] = cArr20[cCharAt & 15];
                    } else {
                        this.buf[i12] = cCharAt;
                        i12++;
                    }
                }
            }
        }
        this.buf[this.count - 1] = c3;
    }

    public void writeFloat(float f, boolean z) {
        if (f != f || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            writeNull();
            return;
        }
        int i = this.count + 15;
        if (i > this.buf.length) {
            if (this.writer != null) {
                String string = RyuFloat.toString(f);
                write(string, 0, string.length());
                if (z && isEnabled(SerializerFeature.WriteClassName)) {
                    write(70);
                    return;
                }
                return;
            }
            expandCapacity(i);
        }
        this.count += RyuFloat.toString(f, this.buf, this.count);
        if (z && isEnabled(SerializerFeature.WriteClassName)) {
            write(70);
        }
    }

    public void writeHex(byte[] bArr) {
        int i = 2;
        int length = this.count + (bArr.length * 2) + 3;
        int i2 = 0;
        if (length > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[(bArr.length * 2) + 3];
                cArr[0] = 'x';
                cArr[1] = '\'';
                while (i2 < bArr.length) {
                    byte b = bArr[i2];
                    int i3 = (b & 255) >> 4;
                    int i4 = b & 15;
                    int i5 = i + 1;
                    cArr[i] = (char) (i3 + (i3 < 10 ? 48 : 55));
                    i += 2;
                    cArr[i5] = (char) (i4 + (i4 < 10 ? 48 : 55));
                    i2++;
                }
                cArr[i] = '\'';
                try {
                    this.writer.write(cArr);
                    return;
                } catch (IOException e) {
                    piq.m169752a("writeBytes error.", e);
                    return;
                }
            }
            expandCapacity(length);
        }
        char[] cArr2 = this.buf;
        int i6 = this.count;
        int i7 = i6 + 1;
        this.count = i7;
        cArr2[i6] = 'x';
        this.count = i6 + 2;
        cArr2[i7] = '\'';
        while (i2 < bArr.length) {
            byte b2 = bArr[i2];
            int i8 = (b2 & 255) >> 4;
            int i9 = b2 & 15;
            char[] cArr3 = this.buf;
            int i10 = this.count;
            int i11 = i10 + 1;
            this.count = i11;
            cArr3[i10] = (char) (i8 + (i8 < 10 ? 48 : 55));
            this.count = i10 + 2;
            cArr3[i11] = (char) (i9 + (i9 < 10 ? 48 : 55));
            i2++;
        }
        char[] cArr4 = this.buf;
        int i12 = this.count;
        this.count = i12 + 1;
        cArr4[i12] = '\'';
    }

    public void writeInt(int i) {
        if (i == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int iStringSize = i < 0 ? IOUtils.stringSize(-i) + 1 : IOUtils.stringSize(i);
        int i2 = this.count + iStringSize;
        if (i2 > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[iStringSize];
                IOUtils.getChars(i, iStringSize, cArr);
                write(cArr, 0, iStringSize);
                return;
            }
            expandCapacity(i2);
        }
        IOUtils.getChars(i, i2, this.buf);
        this.count = i2;
    }

    public void writeLong(long j) {
        boolean z = isEnabled(SerializerFeature.BrowserCompatible) && !isEnabled(SerializerFeature.WriteClassName) && (j > 9007199254740991L || j < -9007199254740991L);
        if (j == Long.MIN_VALUE) {
            if (z) {
                write("\"-9223372036854775808\"");
                return;
            } else {
                write("-9223372036854775808");
                return;
            }
        }
        int iStringSize = j < 0 ? IOUtils.stringSize(-j) + 1 : IOUtils.stringSize(j);
        int i = this.count + iStringSize;
        if (z) {
            i += 2;
        }
        if (i > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[iStringSize];
                IOUtils.getChars(j, iStringSize, cArr);
                if (!z) {
                    write(cArr, 0, iStringSize);
                    return;
                }
                write(34);
                write(cArr, 0, iStringSize);
                write(34);
                return;
            }
            expandCapacity(i);
        }
        char[] cArr2 = this.buf;
        if (z) {
            cArr2[this.count] = '\"';
            int i2 = i - 1;
            IOUtils.getChars(j, i2, cArr2);
            this.buf[i2] = '\"';
        } else {
            IOUtils.getChars(j, i, cArr2);
        }
        this.count = i;
    }

    public void writeLongAndChar(long j, char c) throws IOException {
        writeLong(j);
        write(c);
    }

    public void writeNull(int i, int i2) {
        if ((i & i2) == 0 && (this.features & i2) == 0) {
            writeNull();
            return;
        }
        if (i2 == SerializerFeature.WriteNullListAsEmpty.mask) {
            write(WeJson.EMPTY_ARR);
            return;
        }
        if (i2 == SerializerFeature.WriteNullStringAsEmpty.mask) {
            writeString("");
            return;
        }
        if (i2 == SerializerFeature.WriteNullBooleanAsFalse.mask) {
            write("false");
        } else if (i2 == SerializerFeature.WriteNullNumberAsZero.mask) {
            write(48);
        } else {
            writeNull();
        }
    }

    public void writeString(char[] cArr) {
        if (this.useSingleQuotes) {
            writeStringWithSingleQuote(cArr);
        } else {
            writeStringWithDoubleQuote(new String(cArr), (char) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0307  */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    public void writeStringWithDoubleQuote(String str, char c) {
        int i;
        int i2;
        char[] cArr;
        if (str == null) {
            writeNull();
            if (c != 0) {
                write(c);
                return;
            }
            return;
        }
        int length = str.length();
        int i3 = this.count + length;
        int i4 = i3 + 2;
        if (c != 0) {
            i4 = i3 + 3;
        }
        if (i4 <= this.buf.length) {
            i = 1;
        } else {
            if (this.writer != null) {
                write(34);
                for (int i5 = 0; i5 < str.length(); i5++) {
                    char cCharAt = str.charAt(i5);
                    if (isEnabled(SerializerFeature.BrowserSecure) && (cCharAt == '(' || cCharAt == ')' || cCharAt == '<' || cCharAt == '>')) {
                        write(92);
                        write(117);
                        char[] cArr2 = IOUtils.DIGITS;
                        write(cArr2[(cCharAt >>> '\f') & 15]);
                        write(cArr2[(cCharAt >>> '\b') & 15]);
                        write(cArr2[(cCharAt >>> 4) & 15]);
                        write(cArr2[cCharAt & 15]);
                    } else if (!isEnabled(SerializerFeature.BrowserCompatible)) {
                        byte[] bArr = IOUtils.specicalFlags_doubleQuotes;
                        if ((cCharAt >= bArr.length || bArr[cCharAt] == 0) && !(cCharAt == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                            write(cCharAt);
                        } else {
                            write(92);
                            if (bArr[cCharAt] == 4) {
                                write(117);
                                char[] cArr3 = IOUtils.DIGITS;
                                write(cArr3[(cCharAt >>> '\f') & 15]);
                                write(cArr3[(cCharAt >>> '\b') & 15]);
                                write(cArr3[(cCharAt >>> 4) & 15]);
                                write(cArr3[cCharAt & 15]);
                            } else {
                                write(IOUtils.replaceChars[cCharAt]);
                            }
                        }
                    } else if (cCharAt == '\b' || cCharAt == '\f' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\"' || cCharAt == '/' || cCharAt == '\\') {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt]);
                    } else if (cCharAt < ' ') {
                        write(92);
                        write(117);
                        write(48);
                        write(48);
                        char[] cArr4 = IOUtils.ASCII_CHARS;
                        int i6 = cCharAt * 2;
                        write(cArr4[i6]);
                        write(cArr4[i6 + 1]);
                    } else if (cCharAt >= 127) {
                        write(92);
                        write(117);
                        char[] cArr5 = IOUtils.DIGITS;
                        write(cArr5[(cCharAt >>> '\f') & 15]);
                        write(cArr5[(cCharAt >>> '\b') & 15]);
                        write(cArr5[(cCharAt >>> 4) & 15]);
                        write(cArr5[cCharAt & 15]);
                    } else {
                        write(cCharAt);
                    }
                }
                write(34);
                if (c != 0) {
                    write(c);
                    return;
                }
                return;
            }
            i = 1;
            expandCapacity(i4);
        }
        int i7 = this.count;
        int i8 = i7 + 1;
        int i9 = i8 + length;
        char[] cArr6 = this.buf;
        cArr6[i7] = '\"';
        char c2 = 0;
        str.getChars(0, length, cArr6, i8);
        this.count = i4;
        int i10 = -1;
        if (isEnabled(SerializerFeature.BrowserCompatible)) {
            int i11 = i8;
            while (true) {
                cArr = this.buf;
                if (i11 >= i9) {
                    break;
                }
                char c3 = cArr[i11];
                if (c3 == '\"' || c3 == '/' || c3 == '\\' || c3 == '\b' || c3 == '\f' || c3 == '\n' || c3 == '\r' || c3 == '\t') {
                    i4++;
                } else {
                    if (c3 < ' ' || c3 >= 127) {
                        i4 += 5;
                    }
                    i11++;
                }
                i10 = i11;
                i11++;
            }
            if (i4 > cArr.length) {
                expandCapacity(i4);
            }
            this.count = i4;
            while (i10 >= i8) {
                char[] cArr7 = this.buf;
                char c4 = cArr7[i10];
                if (c4 != '\b' && c4 != '\f' && c4 != '\n' && c4 != '\r') {
                    if (c4 != '\t') {
                        if (c4 == '\"' || c4 == '/' || c4 == '\\') {
                            int i12 = i10 + 1;
                            System.arraycopy(cArr7, i12, cArr7, i10 + 2, (i9 - i10) - 1);
                            char[] cArr8 = this.buf;
                            cArr8[i10] = '\\';
                            cArr8[i12] = c4;
                        } else {
                            if (c4 < ' ') {
                                int i13 = i10 + 1;
                                System.arraycopy(cArr7, i13, cArr7, i10 + 6, (i9 - i10) - 1);
                                char[] cArr9 = this.buf;
                                cArr9[i10] = '\\';
                                cArr9[i13] = 'u';
                                cArr9[i10 + 2] = '0';
                                cArr9[i10 + 3] = '0';
                                char[] cArr10 = IOUtils.ASCII_CHARS;
                                int i14 = c4 * 2;
                                cArr9[i10 + 4] = cArr10[i14];
                                cArr9[i10 + 5] = cArr10[i14 + 1];
                            } else if (c4 >= 127) {
                                int i15 = i10 + 1;
                                System.arraycopy(cArr7, i15, cArr7, i10 + 6, (i9 - i10) - 1);
                                char[] cArr11 = this.buf;
                                cArr11[i10] = '\\';
                                cArr11[i15] = 'u';
                                char[] cArr12 = IOUtils.DIGITS;
                                cArr11[i10 + 2] = cArr12[(c4 >>> '\f') & 15];
                                cArr11[i10 + 3] = cArr12[(c4 >>> '\b') & 15];
                                cArr11[i10 + 4] = cArr12[(c4 >>> 4) & 15];
                                cArr11[i10 + 5] = cArr12[c4 & 15];
                            }
                            i9 += 5;
                        }
                        i10--;
                    }
                    i9++;
                    i10--;
                }
                int i16 = i10 + 1;
                System.arraycopy(cArr7, i16, cArr7, i10 + 2, (i9 - i10) - 1);
                char[] cArr13 = this.buf;
                cArr13[i10] = '\\';
                cArr13[i16] = IOUtils.replaceChars[c4];
                i9++;
                i10--;
            }
            char[] cArr14 = this.buf;
            if (c == 0) {
                cArr14[this.count - 1] = '\"';
                return;
            }
            int i17 = this.count;
            cArr14[i17 - 2] = '\"';
            cArr14[i17 - 1] = c;
            return;
        }
        int i18 = 0;
        int i19 = -1;
        int i20 = -1;
        for (int i21 = i8; i21 < i9; i21++) {
            char c5 = this.buf[i21];
            if (c5 < ']') {
                i2 = i18;
                if ((c5 >= '@' || (this.sepcialBits & (1 << c5)) == 0) && c5 != '\\') {
                    i18 = i2;
                } else {
                    i18 = i2 + 1;
                    if (c5 == '(' || c5 == ')' || c5 == '<' || c5 == '>') {
                        i4 += 4;
                    } else {
                        byte[] bArr2 = IOUtils.specicalFlags_doubleQuotes;
                        if (c5 < bArr2.length && bArr2[c5] == 4) {
                            i4 += 4;
                        }
                    }
                    if (i19 == -1) {
                        i19 = i21;
                        i20 = i19;
                    } else {
                        i20 = i21;
                    }
                    c2 = c5;
                }
            } else if (c5 < 127 || !(c5 == 8232 || c5 == 8233 || c5 < 160)) {
                i2 = i18;
                i18 = i2;
            } else {
                if (i19 == -1) {
                    i19 = i21;
                }
                i18++;
                i4 += 4;
                i20 = i21;
                c2 = c5;
            }
        }
        int i22 = i18;
        if (i22 > 0) {
            int i23 = i4 + i22;
            if (i23 > this.buf.length) {
                expandCapacity(i23);
            }
            this.count = i23;
            int i24 = i;
            if (i22 == i24) {
                if (c2 == 8232) {
                    int i25 = i20 + 1;
                    int i26 = (i9 - i20) - i24;
                    char[] cArr15 = this.buf;
                    System.arraycopy(cArr15, i25, cArr15, i20 + 6, i26);
                    char[] cArr16 = this.buf;
                    cArr16[i20] = '\\';
                    cArr16[i25] = 'u';
                    cArr16[i20 + 2] = '2';
                    cArr16[i20 + 3] = '0';
                    cArr16[i20 + 4] = '2';
                    cArr16[i20 + 5] = '8';
                } else if (c2 == 8233) {
                    int i27 = i20 + 1;
                    char[] cArr17 = this.buf;
                    System.arraycopy(cArr17, i27, cArr17, i20 + 6, (i9 - i20) - 1);
                    char[] cArr18 = this.buf;
                    cArr18[i20] = '\\';
                    cArr18[i27] = 'u';
                    cArr18[i20 + 2] = '2';
                    cArr18[i20 + 3] = '0';
                    cArr18[i20 + 4] = '2';
                    cArr18[i20 + 5] = '9';
                } else if (c2 == '(' || c2 == ')' || c2 == '<' || c2 == '>') {
                    int i28 = i20 + 1;
                    char[] cArr19 = this.buf;
                    System.arraycopy(cArr19, i28, cArr19, i20 + 6, (i9 - i20) - 1);
                    char[] cArr20 = this.buf;
                    cArr20[i20] = '\\';
                    cArr20[i28] = 'u';
                    char[] cArr21 = IOUtils.DIGITS;
                    cArr20[i20 + 2] = cArr21[(c2 >>> '\f') & 15];
                    cArr20[i20 + 3] = cArr21[(c2 >>> '\b') & 15];
                    cArr20[i20 + 4] = cArr21[(c2 >>> 4) & 15];
                    cArr20[i20 + 5] = cArr21[c2 & 15];
                } else {
                    byte[] bArr3 = IOUtils.specicalFlags_doubleQuotes;
                    if (c2 >= bArr3.length || bArr3[c2] != 4) {
                        int i29 = i20 + 1;
                        char[] cArr22 = this.buf;
                        System.arraycopy(cArr22, i29, cArr22, i20 + 2, (i9 - i20) - 1);
                        char[] cArr23 = this.buf;
                        cArr23[i20] = '\\';
                        cArr23[i29] = IOUtils.replaceChars[c2];
                    } else {
                        int i30 = i20 + 1;
                        char[] cArr24 = this.buf;
                        System.arraycopy(cArr24, i30, cArr24, i20 + 6, (i9 - i20) - 1);
                        char[] cArr25 = this.buf;
                        cArr25[i20] = '\\';
                        cArr25[i30] = 'u';
                        char[] cArr26 = IOUtils.DIGITS;
                        cArr25[i20 + 2] = cArr26[(c2 >>> '\f') & 15];
                        cArr25[i20 + 3] = cArr26[(c2 >>> '\b') & 15];
                        cArr25[i20 + 4] = cArr26[(c2 >>> 4) & 15];
                        cArr25[i20 + 5] = cArr26[c2 & 15];
                    }
                }
            } else if (i22 > i24) {
                for (int i31 = i19 - i8; i31 < str.length(); i31++) {
                    char cCharAt2 = str.charAt(i31);
                    if (this.browserSecure) {
                        if (cCharAt2 != '(' && cCharAt2 != ')') {
                            if (cCharAt2 == '<' || cCharAt2 == '>') {
                            }
                        }
                        char[] cArr27 = this.buf;
                        cArr27[i19] = '\\';
                        cArr27[i19 + 1] = 'u';
                        char[] cArr28 = IOUtils.DIGITS;
                        cArr27[i19 + 2] = cArr28[(cCharAt2 >>> '\f') & 15];
                        cArr27[i19 + 3] = cArr28[(cCharAt2 >>> '\b') & 15];
                        int i32 = i19 + 5;
                        cArr27[i19 + 4] = cArr28[(cCharAt2 >>> 4) & 15];
                        i19 += 6;
                        cArr27[i32] = cArr28[cCharAt2 & 15];
                    }
                    byte[] bArr4 = IOUtils.specicalFlags_doubleQuotes;
                    if ((cCharAt2 < bArr4.length && bArr4[cCharAt2] != 0) || (cCharAt2 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        char[] cArr29 = this.buf;
                        int i33 = i19 + 1;
                        cArr29[i19] = '\\';
                        if (bArr4[cCharAt2] == 4) {
                            cArr29[i33] = 'u';
                            char[] cArr30 = IOUtils.DIGITS;
                            cArr29[i19 + 2] = cArr30[(cCharAt2 >>> '\f') & 15];
                            cArr29[i19 + 3] = cArr30[(cCharAt2 >>> '\b') & 15];
                            int i34 = i19 + 5;
                            cArr29[i19 + 4] = cArr30[(cCharAt2 >>> 4) & 15];
                            i19 += 6;
                            cArr29[i34] = cArr30[cCharAt2 & 15];
                        } else {
                            i19 += 2;
                            cArr29[i33] = IOUtils.replaceChars[cCharAt2];
                        }
                    } else if (cCharAt2 == 8232 || cCharAt2 == 8233) {
                        char[] cArr31 = this.buf;
                        cArr31[i19] = '\\';
                        cArr31[i19 + 1] = 'u';
                        char[] cArr32 = IOUtils.DIGITS;
                        cArr31[i19 + 2] = cArr32[(cCharAt2 >>> '\f') & 15];
                        cArr31[i19 + 3] = cArr32[(cCharAt2 >>> '\b') & 15];
                        int i35 = i19 + 5;
                        cArr31[i19 + 4] = cArr32[(cCharAt2 >>> 4) & 15];
                        i19 += 6;
                        cArr31[i35] = cArr32[cCharAt2 & 15];
                    } else {
                        this.buf[i19] = cCharAt2;
                        i19++;
                    }
                }
            }
        }
        char[] cArr33 = this.buf;
        if (c == 0) {
            cArr33[this.count - 1] = '\"';
            return;
        }
        int i36 = this.count;
        cArr33[i36 - 2] = '\"';
        cArr33[i36 - 1] = c;
    }

    public void writeStringWithSingleQuote(String str) {
        char[] cArr;
        int i = this.count;
        int i2 = 0;
        if (str == null) {
            int i3 = i + 4;
            if (i3 > this.buf.length) {
                expandCapacity(i3);
            }
            "null".getChars(0, 4, this.buf, this.count);
            this.count = i3;
            return;
        }
        int length = str.length();
        int i4 = i + length + 2;
        if (i4 > this.buf.length) {
            if (this.writer != null) {
                write(39);
                while (i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt <= '\r' || cCharAt == '\\' || cCharAt == '\'' || (cCharAt == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt]);
                    } else {
                        write(cCharAt);
                    }
                    i2++;
                }
                write(39);
                return;
            }
            expandCapacity(i4);
        }
        int i5 = this.count;
        int i6 = i5 + 1;
        int i7 = i6 + length;
        char[] cArr2 = this.buf;
        cArr2[i5] = '\'';
        str.getChars(0, length, cArr2, i6);
        this.count = i4;
        int i8 = -1;
        char c = 0;
        int i9 = i6;
        while (true) {
            cArr = this.buf;
            if (i9 >= i7) {
                break;
            }
            char c2 = cArr[i9];
            if (c2 <= '\r' || c2 == '\\' || c2 == '\'' || (c2 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                i2++;
                i8 = i9;
                c = c2;
            }
            i9++;
        }
        int i10 = i4 + i2;
        if (i10 > cArr.length) {
            expandCapacity(i10);
        }
        this.count = i10;
        if (i2 == 1) {
            char[] cArr3 = this.buf;
            int i11 = i8 + 1;
            System.arraycopy(cArr3, i11, cArr3, i8 + 2, (i7 - i8) - 1);
            char[] cArr4 = this.buf;
            cArr4[i8] = '\\';
            cArr4[i11] = IOUtils.replaceChars[c];
        } else if (i2 > 1) {
            char[] cArr5 = this.buf;
            int i12 = i8 + 1;
            System.arraycopy(cArr5, i12, cArr5, i8 + 2, (i7 - i8) - 1);
            char[] cArr6 = this.buf;
            cArr6[i8] = '\\';
            cArr6[i12] = IOUtils.replaceChars[c];
            int i13 = i7 + 1;
            for (int i14 = i8 - 1; i14 >= i6; i14--) {
                char c3 = this.buf[i14];
                if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                    char[] cArr7 = this.buf;
                    int i15 = i14 + 1;
                    System.arraycopy(cArr7, i15, cArr7, i14 + 2, (i13 - i14) - 1);
                    char[] cArr8 = this.buf;
                    cArr8[i14] = '\\';
                    cArr8[i15] = IOUtils.replaceChars[c3];
                    i13++;
                }
            }
        }
        this.buf[this.count - 1] = '\'';
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.writer == null) {
            writer.write(this.buf, 0, this.count);
        } else {
            qq3.m175877a("writer not null");
        }
    }

    public int writeToEx(OutputStream outputStream, Charset charset) throws IOException {
        if (this.writer != null) {
            qq3.m175877a("writer not null");
            return 0;
        }
        if (charset == IOUtils.UTF8) {
            return encodeToUTF8(outputStream);
        }
        byte[] bytes = new String(this.buf, 0, this.count).getBytes(charset);
        outputStream.write(bytes);
        return bytes.length;
    }

    public boolean isEnabled(int i) {
        return (this.features & i) != 0;
    }

    public void writeString(String str) {
        if (this.useSingleQuotes) {
            writeStringWithSingleQuote(str);
        } else {
            writeStringWithDoubleQuote(str, (char) 0);
        }
    }

    public void writeTo(OutputStream outputStream, String str) throws IOException {
        writeTo(outputStream, Charset.forName(str));
    }

    public void writeTo(OutputStream outputStream, Charset charset) throws IOException {
        writeToEx(outputStream, charset);
    }

    public void writeString(String str, char c) {
        if (this.useSingleQuotes) {
            writeStringWithSingleQuote(str);
            write(c);
        } else {
            writeStringWithDoubleQuote(str, c);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence) {
        String string = charSequence == null ? "null" : charSequence.toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(char c) {
        write(c);
        return this;
    }

    public byte[] toBytes(String str) {
        Charset charsetForName;
        if (str != null && !"UTF-8".equals(str)) {
            charsetForName = Charset.forName(str);
        } else {
            charsetForName = IOUtils.UTF8;
        }
        return toBytes(charsetForName);
    }

    public SerializeWriter(Writer writer) {
        this(writer, JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.EMPTY);
    }

    public SerializeWriter(SerializerFeature... serializerFeatureArr) {
        this((Writer) null, serializerFeatureArr);
    }

    public SerializeWriter(Writer writer, SerializerFeature... serializerFeatureArr) {
        this(writer, 0, serializerFeatureArr);
    }

    public SerializeWriter() {
        this((Writer) null);
    }

    public SerializeWriter(int i) {
        this((Writer) null, i);
    }

    public SerializeWriter(Writer writer, int i) {
        this.maxBufSize = -1;
        this.writer = writer;
        if (i > 0) {
            this.buf = new char[i];
            computeFeatures();
        } else {
            k250.m144273a("Negative initial size: ", i);
            throw null;
        }
    }

    public void writeNull(SerializerFeature serializerFeature) {
        writeNull(0, serializerFeature.mask);
    }

    public void writeNull() {
        write("null");
    }

    public void writeFieldName(String str) {
        writeFieldName(str, false);
    }

    public void writeFieldValue(char c, String str, boolean z) {
        if (!this.quoteFieldNames) {
            write(c);
            writeFieldName(str);
            write(z);
            return;
        }
        int i = z ? 4 : 5;
        int length = str.length();
        int i2 = this.count + length + 4 + i;
        if (i2 > this.buf.length) {
            if (this.writer != null) {
                write(c);
                writeString(str);
                write(58);
                write(z);
                return;
            }
            expandCapacity(i2);
        }
        int i3 = this.count;
        this.count = i2;
        char[] cArr = this.buf;
        cArr[i3] = c;
        int i4 = i3 + length;
        cArr[i3 + 1] = this.keySeperator;
        str.getChars(0, length, cArr, i3 + 2);
        this.buf[i4 + 2] = this.keySeperator;
        if (z) {
            System.arraycopy(":true".toCharArray(), 0, this.buf, i4 + 3, 5);
        } else {
            System.arraycopy(":false".toCharArray(), 0, this.buf, i4 + 3, 6);
        }
    }

    public void writeFieldValue(char c, String str, int i) {
        if (i != Integer.MIN_VALUE && this.quoteFieldNames) {
            int iStringSize = i < 0 ? IOUtils.stringSize(-i) + 1 : IOUtils.stringSize(i);
            int length = str.length();
            int i2 = this.count + length + 4 + iStringSize;
            if (i2 > this.buf.length) {
                if (this.writer != null) {
                    write(c);
                    writeFieldName(str);
                    writeInt(i);
                    return;
                }
                expandCapacity(i2);
            }
            int i3 = this.count;
            this.count = i2;
            char[] cArr = this.buf;
            cArr[i3] = c;
            int i4 = i3 + length;
            cArr[i3 + 1] = this.keySeperator;
            str.getChars(0, length, cArr, i3 + 2);
            char[] cArr2 = this.buf;
            cArr2[i4 + 2] = this.keySeperator;
            cArr2[i4 + 3] = ':';
            IOUtils.getChars(i, this.count, cArr2);
            return;
        }
        write(c);
        writeFieldName(str);
        writeInt(i);
    }

    public void writeFieldValue(char c, String str, char c2) {
        write(c);
        writeFieldName(str);
        if (c2 == 0) {
            writeString("\u0000");
        } else {
            writeString(Character.toString(c2));
        }
    }

    public void writeFieldValue(char c, String str, float f) {
        write(c);
        writeFieldName(str);
        writeFloat(f, false);
    }

    public void writeFieldValue(char c, String str, double d) {
        write(c);
        writeFieldName(str);
        writeDouble(d, false);
    }

    public void writeFieldValue(char c, String str, String str2) {
        if (this.quoteFieldNames) {
            if (this.useSingleQuotes) {
                write(c);
                writeFieldName(str);
                if (str2 == null) {
                    writeNull();
                    return;
                } else {
                    writeString(str2);
                    return;
                }
            }
            if (isEnabled(SerializerFeature.BrowserCompatible)) {
                write(c);
                writeStringWithDoubleQuote(str, ':');
                writeStringWithDoubleQuote(str2, (char) 0);
                return;
            }
            writeFieldValueStringWithDoubleQuoteCheck(c, str, str2);
            return;
        }
        write(c);
        writeFieldName(str);
        if (str2 == null) {
            writeNull();
        } else {
            writeString(str2);
        }
    }

    public void writeFieldValue(char c, String str, Enum<?> r4) {
        if (r4 == null) {
            write(c);
            writeFieldName(str);
            writeNull();
        } else if (this.writeEnumUsingName && !this.writeEnumUsingToString) {
            writeEnumFieldValue(c, str, r4.name());
        } else if (this.writeEnumUsingToString) {
            writeEnumFieldValue(c, str, r4.toString());
        } else {
            writeFieldValue(c, str, r4.ordinal());
        }
    }

    public void writeFieldValue(char c, String str, BigDecimal bigDecimal) {
        String string;
        write(c);
        writeFieldName(str);
        if (bigDecimal == null) {
            writeNull();
            return;
        }
        int iScale = bigDecimal.scale();
        if (isEnabled(SerializerFeature.WriteBigDecimalAsPlain) && iScale >= -100 && iScale < 100) {
            string = bigDecimal.toPlainString();
        } else {
            string = bigDecimal.toString();
        }
        write(string);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            zkl.m219192a();
            return;
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.count + i2;
        if (i4 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i4);
            } else {
                do {
                    char[] cArr2 = this.buf;
                    int length = cArr2.length;
                    int i5 = this.count;
                    int i6 = length - i5;
                    System.arraycopy(cArr, i, cArr2, i5, i6);
                    this.count = this.buf.length;
                    flush();
                    i2 -= i6;
                    i += i6;
                } while (i2 > this.buf.length);
                i4 = i2;
            }
        }
        System.arraycopy(cArr, i, this.buf, this.count, i2);
        this.count = i4;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        int i3;
        int i4 = this.count + i2;
        if (i4 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i4);
            } else {
                while (true) {
                    char[] cArr = this.buf;
                    int length = cArr.length;
                    int i5 = this.count;
                    int i6 = length - i5;
                    i3 = i + i6;
                    str.getChars(i, i3, cArr, i5);
                    this.count = this.buf.length;
                    flush();
                    i2 -= i6;
                    if (i2 <= this.buf.length) {
                        break;
                    } else {
                        i = i3;
                    }
                }
                i4 = i2;
                i = i3;
            }
        }
        str.getChars(i, i2 + i, this.buf, this.count);
        this.count = i4;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str == null) {
            writeNull();
        } else {
            write(str, 0, str.length());
        }
    }

    @Override // java.io.Writer
    public void write(int i) {
        int i2 = 1;
        int i3 = this.count + 1;
        if (i3 <= this.buf.length) {
            i2 = i3;
        } else if (this.writer == null) {
            expandCapacity(i3);
            i2 = i3;
        } else {
            flush();
        }
        this.buf[this.count] = (char) i;
        this.count = i2;
    }

    public void write(boolean z) {
        if (z) {
            write("true");
        } else {
            write("false");
        }
    }

    public void writeStringWithSingleQuote(char[] cArr) {
        char[] cArr2;
        int i = this.count;
        int i2 = 0;
        if (cArr == null) {
            int i3 = i + 4;
            if (i3 > this.buf.length) {
                expandCapacity(i3);
            }
            "null".getChars(0, 4, this.buf, this.count);
            this.count = i3;
            return;
        }
        int length = cArr.length;
        int i4 = i + length + 2;
        if (i4 > this.buf.length) {
            if (this.writer != null) {
                write(39);
                while (i2 < cArr.length) {
                    char c = cArr[i2];
                    if (c > '\r' && c != '\\' && c != '\'' && (c != '/' || !isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        write(c);
                    } else {
                        write(92);
                        write(IOUtils.replaceChars[c]);
                    }
                    i2++;
                }
                write(39);
                return;
            }
            expandCapacity(i4);
        }
        int i5 = this.count;
        int i6 = i5 + 1;
        int i7 = length + i6;
        char[] cArr3 = this.buf;
        cArr3[i5] = '\'';
        System.arraycopy(cArr, 0, cArr3, i6, cArr.length);
        this.count = i4;
        int i8 = -1;
        char c2 = 0;
        int i9 = i6;
        while (true) {
            cArr2 = this.buf;
            if (i9 >= i7) {
                break;
            }
            char c3 = cArr2[i9];
            if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                i2++;
                i8 = i9;
                c2 = c3;
            }
            i9++;
        }
        int i10 = i4 + i2;
        if (i10 > cArr2.length) {
            expandCapacity(i10);
        }
        this.count = i10;
        if (i2 == 1) {
            char[] cArr4 = this.buf;
            int i11 = i8 + 1;
            System.arraycopy(cArr4, i11, cArr4, i8 + 2, (i7 - i8) - 1);
            char[] cArr5 = this.buf;
            cArr5[i8] = '\\';
            cArr5[i11] = IOUtils.replaceChars[c2];
        } else if (i2 > 1) {
            char[] cArr6 = this.buf;
            int i12 = i8 + 1;
            System.arraycopy(cArr6, i12, cArr6, i8 + 2, (i7 - i8) - 1);
            char[] cArr7 = this.buf;
            cArr7[i8] = '\\';
            cArr7[i12] = IOUtils.replaceChars[c2];
            int i13 = i7 + 1;
            for (int i14 = i8 - 1; i14 >= i6; i14--) {
                char c4 = this.buf[i14];
                if (c4 <= '\r' || c4 == '\\' || c4 == '\'' || (c4 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                    char[] cArr8 = this.buf;
                    int i15 = i14 + 1;
                    System.arraycopy(cArr8, i15, cArr8, i14 + 2, (i13 - i14) - 1);
                    char[] cArr9 = this.buf;
                    cArr9[i14] = '\\';
                    cArr9[i15] = IOUtils.replaceChars[c4];
                    i13++;
                }
            }
        }
        this.buf[this.count - 1] = '\'';
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0303  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    public void writeStringWithDoubleQuote(char[] cArr, char c) {
        int i;
        int i2;
        char[] cArr2;
        if (cArr == null) {
            writeNull();
            if (c != 0) {
                write(c);
                return;
            }
            return;
        }
        int length = cArr.length;
        int i3 = this.count + length;
        int i4 = i3 + 2;
        if (c != 0) {
            i4 = i3 + 3;
        }
        char c2 = '\b';
        if (i4 <= this.buf.length) {
            i = 1;
        } else {
            if (this.writer != null) {
                write(34);
                for (char c3 : cArr) {
                    if (isEnabled(SerializerFeature.BrowserSecure) && (c3 == '(' || c3 == ')' || c3 == '<' || c3 == '>')) {
                        write(92);
                        write(117);
                        char[] cArr3 = IOUtils.DIGITS;
                        write(cArr3[(c3 >>> '\f') & 15]);
                        write(cArr3[(c3 >>> '\b') & 15]);
                        write(cArr3[(c3 >>> 4) & 15]);
                        write(cArr3[c3 & 15]);
                    } else if (!isEnabled(SerializerFeature.BrowserCompatible)) {
                        byte[] bArr = IOUtils.specicalFlags_doubleQuotes;
                        if ((c3 < bArr.length && bArr[c3] != 0) || (c3 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                            write(92);
                            if (bArr[c3] == 4) {
                                write(117);
                                char[] cArr4 = IOUtils.DIGITS;
                                write(cArr4[(c3 >>> '\f') & 15]);
                                write(cArr4[(c3 >>> '\b') & 15]);
                                write(cArr4[(c3 >>> 4) & 15]);
                                write(cArr4[c3 & 15]);
                            } else {
                                write(IOUtils.replaceChars[c3]);
                            }
                        } else {
                            write(c3);
                        }
                    } else if (c3 == '\b' || c3 == '\f' || c3 == '\n' || c3 == '\r' || c3 == '\t' || c3 == '\"' || c3 == '/' || c3 == '\\') {
                        write(92);
                        write(IOUtils.replaceChars[c3]);
                    } else if (c3 < ' ') {
                        write(92);
                        write(117);
                        write(48);
                        write(48);
                        char[] cArr5 = IOUtils.ASCII_CHARS;
                        int i5 = c3 * 2;
                        write(cArr5[i5]);
                        write(cArr5[i5 + 1]);
                    } else if (c3 >= 127) {
                        write(92);
                        write(117);
                        char[] cArr6 = IOUtils.DIGITS;
                        write(cArr6[(c3 >>> '\f') & 15]);
                        write(cArr6[(c3 >>> '\b') & 15]);
                        write(cArr6[(c3 >>> 4) & 15]);
                        write(cArr6[c3 & 15]);
                    } else {
                        write(c3);
                    }
                }
                write(34);
                if (c != 0) {
                    write(c);
                    return;
                }
                return;
            }
            i = 1;
            expandCapacity(i4);
        }
        int i6 = this.count;
        int i7 = i6 + 1;
        int i8 = length + i7;
        char[] cArr7 = this.buf;
        cArr7[i6] = '\"';
        char c4 = 0;
        System.arraycopy(cArr, 0, cArr7, i7, cArr.length);
        this.count = i4;
        int i9 = -1;
        if (isEnabled(SerializerFeature.BrowserCompatible)) {
            int i10 = i7;
            while (true) {
                cArr2 = this.buf;
                if (i10 >= i8) {
                    break;
                }
                char c5 = cArr2[i10];
                if (c5 == '\"' || c5 == '/' || c5 == '\\' || c5 == '\b' || c5 == '\f' || c5 == '\n' || c5 == '\r' || c5 == '\t') {
                    i4++;
                } else {
                    if (c5 < ' ' || c5 >= 127) {
                        i4 += 5;
                    }
                    i10++;
                }
                i9 = i10;
                i10++;
            }
            if (i4 > cArr2.length) {
                expandCapacity(i4);
            }
            this.count = i4;
            while (i9 >= i7) {
                char[] cArr8 = this.buf;
                char c6 = cArr8[i9];
                if (c6 != c2 && c6 != '\f' && c6 != '\n') {
                    if (c6 != '\r' && c6 != '\t') {
                        if (c6 == '\"' || c6 == '/' || c6 == '\\') {
                            int i11 = i9 + 1;
                            System.arraycopy(cArr8, i11, cArr8, i9 + 2, (i8 - i9) - 1);
                            char[] cArr9 = this.buf;
                            cArr9[i9] = '\\';
                            cArr9[i11] = c6;
                        } else {
                            if (c6 < ' ') {
                                int i12 = i9 + 1;
                                System.arraycopy(cArr8, i12, cArr8, i9 + 6, (i8 - i9) - 1);
                                char[] cArr10 = this.buf;
                                cArr10[i9] = '\\';
                                cArr10[i12] = 'u';
                                cArr10[i9 + 2] = '0';
                                cArr10[i9 + 3] = '0';
                                char[] cArr11 = IOUtils.ASCII_CHARS;
                                int i13 = c6 * 2;
                                cArr10[i9 + 4] = cArr11[i13];
                                cArr10[i9 + 5] = cArr11[i13 + 1];
                            } else if (c6 >= 127) {
                                int i14 = i9 + 1;
                                System.arraycopy(cArr8, i14, cArr8, i9 + 6, (i8 - i9) - 1);
                                char[] cArr12 = this.buf;
                                cArr12[i9] = '\\';
                                cArr12[i14] = 'u';
                                char[] cArr13 = IOUtils.DIGITS;
                                cArr12[i9 + 2] = cArr13[(c6 >>> '\f') & 15];
                                cArr12[i9 + 3] = cArr13[(c6 >>> '\b') & 15];
                                cArr12[i9 + 4] = cArr13[(c6 >>> 4) & 15];
                                cArr12[i9 + 5] = cArr13[c6 & 15];
                            }
                            i8 += 5;
                        }
                        i9--;
                        c2 = '\b';
                    }
                    i8++;
                    i9--;
                    c2 = '\b';
                }
                int i15 = i9 + 1;
                System.arraycopy(cArr8, i15, cArr8, i9 + 2, (i8 - i9) - 1);
                char[] cArr14 = this.buf;
                cArr14[i9] = '\\';
                cArr14[i15] = IOUtils.replaceChars[c6];
                i8++;
                i9--;
                c2 = '\b';
            }
            char[] cArr15 = this.buf;
            if (c != 0) {
                int i16 = this.count;
                cArr15[i16 - 2] = '\"';
                cArr15[i16 - 1] = c;
                return;
            }
            cArr15[this.count - 1] = '\"';
            return;
        }
        int i17 = -1;
        int i18 = -1;
        int i19 = 0;
        for (int i20 = i7; i20 < i8; i20++) {
            char c7 = this.buf[i20];
            if (c7 < ']') {
                i2 = i19;
                if ((c7 >= '@' || (this.sepcialBits & (1 << c7)) == 0) && c7 != '\\') {
                    i19 = i2;
                } else {
                    i19 = i2 + 1;
                    if (c7 == '(' || c7 == ')' || c7 == '<' || c7 == '>') {
                        i4 += 4;
                    } else {
                        byte[] bArr2 = IOUtils.specicalFlags_doubleQuotes;
                        if (c7 < bArr2.length && bArr2[c7] == 4) {
                            i4 += 4;
                        }
                    }
                    if (i17 == -1) {
                        i17 = i20;
                        i18 = i17;
                    } else {
                        i18 = i20;
                    }
                    c4 = c7;
                }
            } else if (c7 < 127 || !(c7 == 8232 || c7 == 8233 || c7 < 160)) {
                i2 = i19;
                i19 = i2;
            } else {
                if (i17 == -1) {
                    i17 = i20;
                }
                i19++;
                i4 += 4;
                i18 = i20;
                c4 = c7;
            }
        }
        int i21 = i19;
        if (i21 > 0) {
            int i22 = i4 + i21;
            if (i22 > this.buf.length) {
                expandCapacity(i22);
            }
            this.count = i22;
            int i23 = i;
            if (i21 == i23) {
                if (c4 == 8232) {
                    int i24 = i18 + 1;
                    int i25 = (i8 - i18) - i23;
                    char[] cArr16 = this.buf;
                    System.arraycopy(cArr16, i24, cArr16, i18 + 6, i25);
                    char[] cArr17 = this.buf;
                    cArr17[i18] = '\\';
                    cArr17[i24] = 'u';
                    cArr17[i18 + 2] = '2';
                    cArr17[i18 + 3] = '0';
                    cArr17[i18 + 4] = '2';
                    cArr17[i18 + 5] = '8';
                } else if (c4 == 8233) {
                    int i26 = i18 + 1;
                    char[] cArr18 = this.buf;
                    System.arraycopy(cArr18, i26, cArr18, i18 + 6, (i8 - i18) - 1);
                    char[] cArr19 = this.buf;
                    cArr19[i18] = '\\';
                    cArr19[i26] = 'u';
                    cArr19[i18 + 2] = '2';
                    cArr19[i18 + 3] = '0';
                    cArr19[i18 + 4] = '2';
                    cArr19[i18 + 5] = '9';
                } else if (c4 != '(' && c4 != ')' && c4 != '<' && c4 != '>') {
                    byte[] bArr3 = IOUtils.specicalFlags_doubleQuotes;
                    if (c4 < bArr3.length && bArr3[c4] == 4) {
                        int i27 = i18 + 1;
                        char[] cArr20 = this.buf;
                        System.arraycopy(cArr20, i27, cArr20, i18 + 6, (i8 - i18) - 1);
                        char[] cArr21 = this.buf;
                        cArr21[i18] = '\\';
                        cArr21[i27] = 'u';
                        char[] cArr22 = IOUtils.DIGITS;
                        cArr21[i18 + 2] = cArr22[(c4 >>> '\f') & 15];
                        cArr21[i18 + 3] = cArr22[(c4 >>> '\b') & 15];
                        cArr21[i18 + 4] = cArr22[(c4 >>> 4) & 15];
                        cArr21[i18 + 5] = cArr22[c4 & 15];
                    } else {
                        int i28 = i18 + 1;
                        char[] cArr23 = this.buf;
                        System.arraycopy(cArr23, i28, cArr23, i18 + 2, (i8 - i18) - 1);
                        char[] cArr24 = this.buf;
                        cArr24[i18] = '\\';
                        cArr24[i28] = IOUtils.replaceChars[c4];
                    }
                } else {
                    int i29 = i18 + 1;
                    char[] cArr25 = this.buf;
                    System.arraycopy(cArr25, i29, cArr25, i18 + 6, (i8 - i18) - 1);
                    char[] cArr26 = this.buf;
                    cArr26[i18] = '\\';
                    cArr26[i29] = 'u';
                    char[] cArr27 = IOUtils.DIGITS;
                    cArr26[i18 + 2] = cArr27[(c4 >>> '\f') & 15];
                    cArr26[i18 + 3] = cArr27[(c4 >>> '\b') & 15];
                    cArr26[i18 + 4] = cArr27[(c4 >>> 4) & 15];
                    cArr26[i18 + 5] = cArr27[c4 & 15];
                }
            } else if (i21 > i23) {
                for (int i30 = i17 - i7; i30 < cArr.length; i30++) {
                    char c8 = cArr[i30];
                    if (this.browserSecure) {
                        if (c8 != '(' && c8 != ')') {
                            if (c8 == '<' || c8 == '>') {
                            }
                        }
                        char[] cArr28 = this.buf;
                        cArr28[i17] = '\\';
                        cArr28[i17 + 1] = 'u';
                        char[] cArr29 = IOUtils.DIGITS;
                        cArr28[i17 + 2] = cArr29[(c8 >>> '\f') & 15];
                        cArr28[i17 + 3] = cArr29[(c8 >>> '\b') & 15];
                        int i31 = i17 + 5;
                        cArr28[i17 + 4] = cArr29[(c8 >>> 4) & 15];
                        i17 += 6;
                        cArr28[i31] = cArr29[c8 & 15];
                    }
                    byte[] bArr4 = IOUtils.specicalFlags_doubleQuotes;
                    if ((c8 < bArr4.length && bArr4[c8] != 0) || (c8 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        char[] cArr30 = this.buf;
                        int i32 = i17 + 1;
                        cArr30[i17] = '\\';
                        if (bArr4[c8] == 4) {
                            cArr30[i32] = 'u';
                            char[] cArr31 = IOUtils.DIGITS;
                            cArr30[i17 + 2] = cArr31[(c8 >>> '\f') & 15];
                            cArr30[i17 + 3] = cArr31[(c8 >>> '\b') & 15];
                            int i33 = i17 + 5;
                            cArr30[i17 + 4] = cArr31[(c8 >>> 4) & 15];
                            i17 += 6;
                            cArr30[i33] = cArr31[c8 & 15];
                        } else {
                            i17 += 2;
                            cArr30[i32] = IOUtils.replaceChars[c8];
                        }
                    } else if (c8 != 8232 && c8 != 8233) {
                        this.buf[i17] = c8;
                        i17++;
                    } else {
                        char[] cArr32 = this.buf;
                        cArr32[i17] = '\\';
                        cArr32[i17 + 1] = 'u';
                        char[] cArr33 = IOUtils.DIGITS;
                        cArr32[i17 + 2] = cArr33[(c8 >>> '\f') & 15];
                        cArr32[i17 + 3] = cArr33[(c8 >>> '\b') & 15];
                        int i34 = i17 + 5;
                        cArr32[i17 + 4] = cArr33[(c8 >>> 4) & 15];
                        i17 += 6;
                        cArr32[i34] = cArr33[c8 & 15];
                    }
                }
            }
        }
        char[] cArr34 = this.buf;
        if (c != 0) {
            int i35 = this.count;
            cArr34[i35 - 2] = '\"';
            cArr34[i35 - 1] = c;
            return;
        }
        cArr34[this.count - 1] = '\"';
    }
}

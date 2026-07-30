package com.fasterxml.jackson.core.json;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.p029io.CharTypes;
import com.fasterxml.jackson.core.p029io.CharacterEscapes;
import com.fasterxml.jackson.core.p029io.IOContext;
import com.fasterxml.jackson.core.p029io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.j6f;

/* JADX INFO: loaded from: classes6.dex */
public final class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected static final char[] HEX_CHARS = CharTypes.copyHexChars();
    protected static final int SHORT_WRITE = 32;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, Writer writer) {
        super(iOContext, i, objectCodec);
        this._outputHead = 0;
        this._outputTail = 0;
        this._writer = writer;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = cArrAllocConcatBuffer;
        this._outputEnd = cArrAllocConcatBuffer.length;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i3 = this._outputTail;
            int i4 = i3 + 1;
            this._outputTail = i4;
            cArr[i3] = '\\';
            this._outputTail = i3 + 2;
            cArr[i4] = (char) i;
            return;
        }
        if (i == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        if (this._outputTail + 2 > this._outputEnd) {
            _flushBuffer();
        }
        int i5 = this._outputTail;
        char[] cArr2 = this._outputBuffer;
        cArr2[i5] = '\\';
        int i6 = i5 + 2;
        cArr2[i5 + 1] = 'u';
        if (c > 255) {
            int i7 = c >> '\b';
            int i8 = i5 + 3;
            char[] cArr3 = HEX_CHARS;
            cArr2[i6] = cArr3[(i7 & 255) >> 4];
            i2 = i5 + 4;
            cArr2[i8] = cArr3[i7 & 15];
            c = (char) (c & 255);
        } else {
            int i9 = i5 + 3;
            cArr2[i6] = '0';
            i2 = i5 + 4;
            cArr2[i9] = '0';
        }
        char[] cArr4 = HEX_CHARS;
        cArr2[i2] = cArr4[c >> 4];
        cArr2[i2 + 1] = cArr4[c & 15];
        this._outputTail = i2 + 2;
    }

    private void _prependOrWriteCharacterEscape(char c, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            int i3 = this._outputTail;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this._outputHead = i4;
                char[] cArr = this._outputBuffer;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr_allocateEntityBuffer[1] = (char) i;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return;
        }
        if (i == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            int i5 = this._outputTail;
            if (i5 < length) {
                this._outputHead = i5;
                this._writer.write(value);
                return;
            } else {
                int i6 = i5 - length;
                this._outputHead = i6;
                value.getChars(0, length, this._outputBuffer, i6);
                return;
            }
        }
        int i7 = this._outputTail;
        if (i7 < 6) {
            char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
            if (cArr_allocateEntityBuffer2 == null) {
                cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c <= 255) {
                char[] cArr2 = HEX_CHARS;
                cArr_allocateEntityBuffer2[6] = cArr2[c >> 4];
                cArr_allocateEntityBuffer2[7] = cArr2[c & 15];
                this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
                return;
            }
            int i8 = c >> '\b';
            char[] cArr3 = HEX_CHARS;
            cArr_allocateEntityBuffer2[10] = cArr3[(i8 & 255) >> 4];
            cArr_allocateEntityBuffer2[11] = cArr3[i8 & 15];
            cArr_allocateEntityBuffer2[12] = cArr3[(c & 255) >> 4];
            cArr_allocateEntityBuffer2[13] = cArr3[c & 15];
            this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
            return;
        }
        char[] cArr4 = this._outputBuffer;
        int i9 = i7 - 6;
        this._outputHead = i9;
        cArr4[i9] = '\\';
        cArr4[i7 - 5] = 'u';
        if (c > 255) {
            int i10 = c >> '\b';
            char[] cArr5 = HEX_CHARS;
            cArr4[i7 - 4] = cArr5[(i10 & 255) >> 4];
            i2 = i7 - 3;
            cArr4[i2] = cArr5[i10 & 15];
            c = (char) (c & 255);
        } else {
            cArr4[i7 - 4] = '0';
            i2 = i7 - 3;
            cArr4[i2] = '0';
        }
        char[] cArr6 = HEX_CHARS;
        cArr4[i2 + 1] = cArr6[c >> 4];
        cArr4[i2 + 2] = cArr6[c & 15];
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4;
        int i5 = 0;
        while (i < i2) {
            bArr[i5] = bArr[i];
            i5++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i6 = iMin - i5;
            if (i6 == 0 || (i4 = inputStream.read(bArr, i5, i6)) < 0) {
                return i5;
            }
            i5 += i4;
        } while (i5 < 3);
        return i5;
    }

    private void _writeLongString(String str) throws IOException {
        _flushBuffer();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this._outputEnd;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i2);
            } else {
                int i4 = this._maximumNonEscapedChar;
                if (i4 != 0) {
                    _writeSegmentASCII(i2, i4);
                } else {
                    _writeSegment(i2);
                }
            }
            if (i3 >= length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = Constants.INAPP_POSITION_LEFT;
        cArr[i + 3] = Constants.INAPP_POSITION_LEFT;
        this._outputTail = i + 4;
    }

    private void _writeQuotedInt(int i) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = '\"';
        int iOutputInt = NumberOutput.outputInt(i, cArr, i3);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = '\"';
    }

    private void _writeQuotedLong(long j) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        int i2 = i + 1;
        this._outputTail = i2;
        cArr[i] = '\"';
        int iOutputLong = NumberOutput.outputLong(j, cArr, i2);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputLong + 1;
        cArr2[iOutputLong] = '\"';
    }

    private void _writeQuotedRaw(Object obj) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        writeRaw(obj.toString());
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = '\"';
    }

    private void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        int i2 = i + 1;
        this._outputTail = i2;
        cArr[i] = '\"';
        int iOutputInt = NumberOutput.outputInt(s, cArr, i2);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = '\"';
    }

    private void _writeSegment(int i) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i2 = 0;
        int i_prependOrWriteCharacterEscape = 0;
        while (i2 < i) {
            do {
                cArr = this._outputBuffer;
                c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < i);
            int i3 = i2 - i_prependOrWriteCharacterEscape;
            if (i3 > 0) {
                this._writer.write(cArr, i_prependOrWriteCharacterEscape, i3);
                if (i2 >= i) {
                    return;
                }
            }
            int i4 = i2 + 1;
            i_prependOrWriteCharacterEscape = _prependOrWriteCharacterEscape(this._outputBuffer, i4, i, c, iArr[c]);
            i2 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[PHI: r4
      0x001e: PHI (r4v7 int) = (r4v2 int), (r4v8 int) binds: [B:9:0x001a, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    private void _writeSegmentASCII(int i, int i2) throws IOException {
        char[] cArr;
        char c;
        int[] iArr = this._outputEscapes;
        int iMin = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i_prependOrWriteCharacterEscape = 0;
        int i4 = 0;
        while (i3 < i) {
            do {
                cArr = this._outputBuffer;
                c = cArr[i3];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c > i2) {
                        i4 = -1;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i4;
            int i6 = i3 - i_prependOrWriteCharacterEscape;
            if (i6 > 0) {
                this._writer.write(cArr, i_prependOrWriteCharacterEscape, i6);
                if (i3 >= i) {
                    return;
                }
            }
            int i7 = i3 + 1;
            i_prependOrWriteCharacterEscape = _prependOrWriteCharacterEscape(this._outputBuffer, i7, i, c, i5);
            i3 = i7;
            i4 = i5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[PHI: r6
      0x0032: PHI (r6v8 int) = (r6v2 int), (r6v9 int) binds: [B:15:0x002e, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    private void _writeSegmentCustom(int i) throws IOException {
        char c;
        int[] iArr = this._outputEscapes;
        int i2 = this._maximumNonEscapedChar;
        if (i2 < 1) {
            i2 = j6f.COLOR_SPACE_UNCALIBRATED;
        }
        int iMin = Math.min(iArr.length, i2 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i3 = 0;
        int i_prependOrWriteCharacterEscape = 0;
        int i4 = 0;
        while (i3 < i) {
            do {
                c = this._outputBuffer[i3];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c > i2) {
                        i4 = -1;
                        break;
                    }
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                    this._currentEscape = escapeSequence;
                    if (escapeSequence != null) {
                        i4 = -2;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i4;
            int i6 = i3 - i_prependOrWriteCharacterEscape;
            if (i6 > 0) {
                this._writer.write(this._outputBuffer, i_prependOrWriteCharacterEscape, i6);
                if (i3 >= i) {
                    return;
                }
            }
            int i7 = i3 + 1;
            i_prependOrWriteCharacterEscape = _prependOrWriteCharacterEscape(this._outputBuffer, i7, i, c, i5);
            i3 = i7;
            i4 = i5;
        }
    }

    private void _writeString(char[] cArr, int i, int i2) throws IOException {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i, i2);
            return;
        }
        int i3 = this._maximumNonEscapedChar;
        if (i3 != 0) {
            _writeStringASCII(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i5++;
                }
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this._outputTail + i6 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i6);
                    this._outputTail += i6;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i6);
            }
            if (i5 >= i4) {
                return;
            }
            i = i5 + 1;
            char c2 = cArr[i5];
            _appendCharacterEscape(c2, iArr[c2]);
        }
    }

    private void _writeString2(int i) throws IOException {
        int i2;
        int i3 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this._outputTail < i3) {
            do {
                char[] cArr = this._outputBuffer;
                int i4 = this._outputTail;
                char c = cArr[i4];
                if (c >= length || iArr[c] == 0) {
                    i2 = i4 + 1;
                    this._outputTail = i2;
                } else {
                    int i5 = this._outputHead;
                    int i6 = i4 - i5;
                    if (i6 > 0) {
                        this._writer.write(cArr, i5, i6);
                    }
                    char[] cArr2 = this._outputBuffer;
                    int i7 = this._outputTail;
                    this._outputTail = i7 + 1;
                    char c2 = cArr2[i7];
                    _prependOrWriteCharacterEscape(c2, iArr[c2]);
                }
            } while (i2 < i3);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    private void _writeStringASCII(char[] cArr, int i, int i2, int i3) throws IOException {
        char c;
        int i4 = i2 + i;
        int[] iArr = this._outputEscapes;
        int iMin = Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i;
            do {
                c = cArr[i6];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c > i3) {
                        i5 = -1;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i4);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this._outputTail + i7 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i7);
                    this._outputTail += i7;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i7);
            }
            if (i6 >= i4) {
                return;
            }
            i = i6 + 1;
            _appendCharacterEscape(c, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[PHI: r4
      0x002f: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x002b, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    private void _writeStringCustom(char[] cArr, int i, int i2) throws IOException {
        char c;
        int i3 = i2 + i;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        if (i4 < 1) {
            i4 = j6f.COLOR_SPACE_UNCALIBRATED;
        }
        int iMin = Math.min(iArr.length, i4 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i5 = 0;
        while (i < i3) {
            int i6 = i;
            do {
                c = cArr[i6];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c > i4) {
                        i5 = -1;
                        break;
                    }
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                    this._currentEscape = escapeSequence;
                    if (escapeSequence != null) {
                        i5 = -2;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i3);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this._outputTail + i7 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i7);
                    this._outputTail += i7;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i7);
            }
            if (i6 >= i3) {
                return;
            }
            i = i6 + 1;
            _appendCharacterEscape(c, i5);
        }
    }

    private void writeRawLong(String str) throws IOException {
        int i = this._outputEnd;
        int i2 = this._outputTail;
        int i3 = i - i2;
        str.getChars(0, i3, this._outputBuffer, i2);
        this._outputTail += i3;
        _flushBuffer();
        int length = str.length() - i3;
        while (true) {
            int i4 = this._outputEnd;
            char[] cArr = this._outputBuffer;
            if (length <= i4) {
                str.getChars(i3, i3 + length, cArr, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            } else {
                int i5 = i3 + i4;
                str.getChars(i3, i5, cArr, 0);
                this._outputHead = 0;
                this._outputTail = i4;
                _flushBuffer();
                length -= i4;
                i3 = i5;
            }
        }
    }

    public void _flushBuffer() throws IOException {
        int i = this._outputTail;
        int i2 = this._outputHead;
        int i3 = i - i2;
        if (i3 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i2, i3);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    public void _verifyPrettyValueWrite(String str) throws IOException {
        int iWriteValue = this._writeContext.writeValue();
        if (iWriteValue == 5) {
            _reportError("Can not " + str + ", expecting field name");
        }
        if (iWriteValue == 0) {
            if (this._writeContext.inArray()) {
                this._cfgPrettyPrinter.beforeArrayValues(this);
                return;
            } else {
                if (this._writeContext.inObject()) {
                    this._cfgPrettyPrinter.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (iWriteValue == 1) {
            this._cfgPrettyPrinter.writeArrayValueSeparator(this);
            return;
        }
        if (iWriteValue == 2) {
            this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
        } else if (iWriteValue != 3) {
            _throwInternal();
        } else {
            this._cfgPrettyPrinter.writeRootValueSeparator(this);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _verifyValueWrite(String str) throws IOException {
        char c;
        SerializableString serializableString;
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str);
            return;
        }
        int iWriteValue = this._writeContext.writeValue();
        if (iWriteValue == 5) {
            _reportError("Can not " + str + ", expecting field name");
        }
        if (iWriteValue == 1) {
            c = ',';
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue == 3 && (serializableString = this._rootValueSeparator) != null) {
                    writeRaw(serializableString.getValue());
                    return;
                }
                return;
            }
            c = ':';
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        cArr[i] = c;
        this._outputTail = i + 1;
    }

    public int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator;
        InputStream inputStream2;
        byte[] bArr2;
        int i_readMore;
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = i;
        int i6 = 0;
        int i_readMore2 = 0;
        while (true) {
            if (i5 <= 2) {
                writerBasedJsonGenerator = this;
                inputStream2 = inputStream;
                bArr2 = bArr;
                break;
            }
            writerBasedJsonGenerator = this;
            inputStream2 = inputStream;
            bArr2 = bArr;
            if (i6 > i4) {
                i_readMore2 = writerBasedJsonGenerator._readMore(inputStream2, bArr2, i6, i_readMore2, i5);
                if (i_readMore2 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = i_readMore2 - 3;
                i6 = 0;
            }
            if (writerBasedJsonGenerator._outputTail > i2) {
                writerBasedJsonGenerator._flushBuffer();
            }
            int i7 = i6 + 2;
            int i8 = ((bArr2[i6 + 1] & 255) | (bArr2[i6] << 8)) << 8;
            i6 += 3;
            i5 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr2[i7] & 255), writerBasedJsonGenerator._outputBuffer, writerBasedJsonGenerator._outputTail);
            writerBasedJsonGenerator._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = writerBasedJsonGenerator._outputBuffer;
                int i9 = iEncodeBase64Chunk + 1;
                writerBasedJsonGenerator._outputTail = i9;
                cArr[iEncodeBase64Chunk] = '\\';
                writerBasedJsonGenerator._outputTail = iEncodeBase64Chunk + 2;
                cArr[i9] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            this = writerBasedJsonGenerator;
            inputStream = inputStream2;
            bArr = bArr2;
        }
        if (i5 <= 0 || (i_readMore = writerBasedJsonGenerator._readMore(inputStream2, bArr2, i6, i_readMore2, i5)) <= 0) {
            return i5;
        }
        if (writerBasedJsonGenerator._outputTail > i2) {
            writerBasedJsonGenerator._flushBuffer();
        }
        int i10 = bArr2[0] << Tnaf.POW_2_WIDTH;
        if (1 < i_readMore) {
            i10 |= (bArr2[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        writerBasedJsonGenerator._outputTail = base64Variant.encodeBase64Partial(i10, i3, writerBasedJsonGenerator._outputBuffer, writerBasedJsonGenerator._outputTail);
        return i5 - i3;
    }

    public void _writeFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ',';
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (!isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr2[i2] = '\"';
        int length = cArrAsQuotedChars.length;
        if (i3 + length + 1 < this._outputEnd) {
            System.arraycopy(cArrAsQuotedChars, 0, cArr2, i3, length);
            int i4 = this._outputTail + length;
            char[] cArr3 = this._outputBuffer;
            this._outputTail = i4 + 1;
            cArr3[i4] = '\"';
            return;
        }
        writeRaw(cArrAsQuotedChars, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr4 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr4[i5] = '\"';
    }

    public void _writePPFieldName(SerializableString serializableString, boolean z) throws IOException {
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (z) {
            prettyPrinter.writeObjectEntrySeparator(this);
        } else {
            prettyPrinter.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (!isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = '\"';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonWriteContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    } else {
                        writeEndObject();
                    }
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._writer == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._writer;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        _verifyValueWrite("write binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '\"';
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i < 0) {
                i = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer);
            } else {
                int i_writeBinary = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer, i);
                if (i_writeBinary > 0) {
                    _reportError("Too few bytes available: missing " + i_writeBinary + " bytes (out of " + i + ")");
                }
            }
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            cArr2[i3] = '\"';
            return i;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        int i;
        _verifyValueWrite("write boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i2 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z) {
            cArr[i2] = Constants.INAPP_POSITION_TOP;
            cArr[i2 + 1] = Constants.INAPP_POSITION_RIGHT;
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = Constants.INAPP_POSITION_LEFT;
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this._outputTail = i + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not an ARRAY but " + this._writeContext.getTypeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ']';
        }
        this._writeContext = this._writeContext.getParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not an object but " + this._writeContext.getTypeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '}';
        }
        this._writeContext = this._writeContext.getParent();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(serializableString, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write null value");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) throws IOException {
        if (this._cfgNumbersAsStrings || (isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d) || Double.isInfinite(d)))) {
            writeString(String.valueOf(d));
        } else {
            _verifyValueWrite("write number");
            writeRaw(String.valueOf(d));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i, int i2) throws IOException {
        int i3 = this._outputEnd - this._outputTail;
        if (i3 < i2) {
            _flushBuffer();
            i3 = this._outputEnd - this._outputTail;
        }
        if (i3 < i2) {
            writeRawLong(str.substring(i, i2 + i));
        } else {
            str.getChars(i, i + i2, this._outputBuffer, this._outputTail);
            this._outputTail += i2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(cArrAsQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = '\"';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(str, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i = this._outputEnd - this._outputTail;
        if (i == 0) {
            _flushBuffer();
            i = this._outputEnd - this._outputTail;
        }
        if (i >= length) {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        } else {
            writeRawLong(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i) throws IOException {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 32) {
            if (i2 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i2);
            this._outputTail += i2;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) throws IOException {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger);
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f) throws IOException {
        if (!this._cfgNumbersAsStrings && (!isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || (!Float.isNaN(f) && !Float.isInfinite(f)))) {
            _verifyValueWrite("write number");
            writeRaw(String.valueOf(f));
        } else {
            writeString(String.valueOf(f));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write number");
        if (bigDecimal == null) {
            _writeNull();
            return;
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigDecimal);
        } else if (isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
            writeRaw(bigDecimal.toPlainString());
        } else {
            writeRaw(bigDecimal.toString());
        }
    }

    public void _writePPFieldName(String str, boolean z) throws IOException {
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (z) {
            prettyPrinter.writeObjectEntrySeparator(this);
        } else {
            prettyPrinter.beforeObjectEntries(this);
        }
        if (isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '\"';
            _writeString(str);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr2 = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr2[i2] = '\"';
            return;
        }
        _writeString(str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[SYNTHETIC] */
    private void _writeStringASCII(int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        int iMin = Math.min(iArr.length, i2 + 1);
        while (this._outputTail < i7) {
            do {
                char[] cArr = this._outputBuffer;
                int i8 = this._outputTail;
                char c = cArr[i8];
                if (c < iMin) {
                    i3 = iArr[c];
                    if (i3 != 0) {
                        i4 = this._outputHead;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this._writer.write(cArr, i4, i5);
                        }
                        this._outputTail++;
                        _prependOrWriteCharacterEscape(c, i3);
                    }
                    i6 = i8 + 1;
                    this._outputTail = i6;
                } else {
                    if (c > i2) {
                        i3 = -1;
                        i4 = this._outputHead;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this._writer.write(cArr, i4, i5);
                        }
                        this._outputTail++;
                        _prependOrWriteCharacterEscape(c, i3);
                    }
                    i6 = i8 + 1;
                    this._outputTail = i6;
                }
            } while (i6 < i7);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = '\"';
        _writeString(cArr, i, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr3[i4] = '\"';
    }

    private void _writeString(String str) throws IOException {
        int length = str.length();
        int i = this._outputEnd;
        if (length > i) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
            return;
        }
        int i2 = this._maximumNonEscapedChar;
        if (i2 != 0) {
            _writeStringASCII(length, i2);
        } else {
            _writeString2(length);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write text value");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = '\"';
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[SYNTHETIC] */
    private void _writeStringCustom(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        int i7 = this._maximumNonEscapedChar;
        if (i7 < 1) {
            i7 = j6f.COLOR_SPACE_UNCALIBRATED;
        }
        int iMin = Math.min(iArr.length, i7 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (this._outputTail < i6) {
            do {
                char c = this._outputBuffer[this._outputTail];
                if (c < iMin) {
                    i2 = iArr[c];
                    if (i2 != 0) {
                        int i8 = this._outputTail;
                        i3 = this._outputHead;
                        i4 = i8 - i3;
                        if (i4 > 0) {
                            this._writer.write(this._outputBuffer, i3, i4);
                        }
                        this._outputTail++;
                        _prependOrWriteCharacterEscape(c, i2);
                    }
                    i5 = this._outputTail + 1;
                    this._outputTail = i5;
                } else {
                    if (c > i7) {
                        i2 = -1;
                    } else {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i2 = -2;
                        }
                        i5 = this._outputTail + 1;
                        this._outputTail = i5;
                    }
                    int i9 = this._outputTail;
                    i3 = this._outputHead;
                    i4 = i9 - i3;
                    if (i4 > 0) {
                        this._writer.write(this._outputBuffer, i3, i4);
                    }
                    this._outputTail++;
                    _prependOrWriteCharacterEscape(c, i2);
                }
            } while (i5 < i6);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        _verifyValueWrite("write binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '\"';
        _writeBinary(base64Variant, bArr, i, i2 + i);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = '\"';
    }

    public void _writeFieldName(String str, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ',';
        }
        if (!isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = '\"';
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr3[i3] = '\"';
    }

    public void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int iEncodeBase64Chunk;
        int i3 = i2 - 3;
        int i4 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i5 = maxLineLength >> 2;
            do {
                if (i > i3) {
                    break loop0;
                }
                if (this._outputTail > i4) {
                    _flushBuffer();
                }
                int i6 = i + 2;
                int i7 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this._outputBuffer, this._outputTail);
                this._outputTail = iEncodeBase64Chunk;
                i5--;
            } while (i5 > 0);
            char[] cArr = this._outputBuffer;
            int i8 = iEncodeBase64Chunk + 1;
            this._outputTail = i8;
            cArr[iEncodeBase64Chunk] = '\\';
            this._outputTail = iEncodeBase64Chunk + 2;
            cArr[i8] = 'n';
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i9 = i2 - i;
        if (i9 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i10 = i + 1;
            int i11 = bArr[i] << Tnaf.POW_2_WIDTH;
            if (i9 == 2) {
                i11 |= (bArr[i10] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i11, i9, this._outputBuffer, this._outputTail);
        }
    }

    public int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this._outputEnd - 6;
        int i2 = 2;
        int i3 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = 0;
        int i_readMore = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i3) {
                i_readMore = _readMore(inputStream, bArr, i4, i_readMore, bArr.length);
                if (i_readMore < 3) {
                    break;
                }
                i3 = i_readMore - 3;
                i4 = 0;
            }
            if (this._outputTail > i) {
                _flushBuffer();
            }
            int i6 = i4 + 2;
            int i7 = ((bArr[i4 + 1] & 255) | (bArr[i4] << 8)) << 8;
            i4 += 3;
            i5 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i8 = iEncodeBase64Chunk + 1;
                this._outputTail = i8;
                cArr[iEncodeBase64Chunk] = '\\';
                this._outputTail = iEncodeBase64Chunk + 2;
                cArr[i8] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i_readMore <= 0) {
            return i5;
        }
        if (this._outputTail > i) {
            _flushBuffer();
        }
        int i9 = bArr[0] << Tnaf.POW_2_WIDTH;
        if (1 < i_readMore) {
            i9 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i10 = i5 + i2;
        this._outputTail = base64Variant.encodeBase64Partial(i9, i2, this._outputBuffer, this._outputTail);
        return i10;
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i, int i2, char c, int i3) throws IOException {
        String value;
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            cArr_allocateEntityBuffer[1] = (char) i3;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return i;
        }
        if (i3 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (i >= length && i < i2) {
                int i6 = i - length;
                value.getChars(0, length, cArr, i6);
                return i6;
            }
            this._writer.write(value);
            return i;
        }
        if (i > 5 && i < i2) {
            cArr[i - 6] = '\\';
            int i7 = i - 4;
            cArr[i - 5] = 'u';
            if (c > 255) {
                int i8 = c >> '\b';
                int i9 = i - 3;
                char[] cArr2 = HEX_CHARS;
                cArr[i7] = cArr2[(i8 & 255) >> 4];
                i4 = i - 2;
                cArr[i9] = cArr2[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i - 3;
                cArr[i7] = '0';
                i4 = i - 2;
                cArr[i10] = '0';
            }
            char[] cArr3 = HEX_CHARS;
            cArr[i4] = cArr3[c >> 4];
            cArr[i4 + 1] = cArr3[c & 15];
            return i4 - 4;
        }
        char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
        if (cArr_allocateEntityBuffer2 == null) {
            cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
        }
        this._outputHead = this._outputTail;
        if (c > 255) {
            int i11 = c >> '\b';
            char[] cArr4 = HEX_CHARS;
            cArr_allocateEntityBuffer2[10] = cArr4[(i11 & 255) >> 4];
            cArr_allocateEntityBuffer2[11] = cArr4[i11 & 15];
            cArr_allocateEntityBuffer2[12] = cArr4[(c & 255) >> 4];
            cArr_allocateEntityBuffer2[13] = cArr4[c & 15];
            this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
            return i;
        }
        char[] cArr5 = HEX_CHARS;
        cArr_allocateEntityBuffer2[6] = cArr5[c >> 4];
        cArr_allocateEntityBuffer2[7] = cArr5[c & 15];
        this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
        return i;
    }
}

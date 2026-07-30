package com.alibaba.fastjson.util;

import com.fasterxml.jackson.core.base.GeneratorBase;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import okio.Utf8;
import p153l.wpg0;

/* JADX INFO: loaded from: classes.dex */
public class UTF8Decoder extends CharsetDecoder {
    private static final Charset charset = Charset.forName("UTF-8");

    public UTF8Decoder() {
        super(charset, 1.0f, 1.0f);
    }

    private CoderResult decodeArrayLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        CharBuffer charBuffer2;
        int i2;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iArrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
        char[] cArrArray = charBuffer.array();
        int iArrayOffset3 = charBuffer.arrayOffset() + charBuffer.position();
        int iArrayOffset4 = charBuffer.arrayOffset() + charBuffer.limit();
        int iMin = Math.min(iArrayOffset2 - iArrayOffset, iArrayOffset4 - iArrayOffset3) + iArrayOffset3;
        while (iArrayOffset3 < iMin) {
            byte b = bArrArray[iArrayOffset];
            if (b < 0) {
                break;
            }
            iArrayOffset++;
            cArrArray[iArrayOffset3] = (char) b;
            iArrayOffset3++;
        }
        int i3 = iArrayOffset;
        int i4 = iArrayOffset3;
        while (i3 < iArrayOffset2) {
            byte b2 = bArrArray[i3];
            if (b2 < 0) {
                int i5 = iArrayOffset4;
                byteBuffer2 = byteBuffer;
                i = i5;
                charBuffer2 = charBuffer;
                if ((b2 >> 5) == -2) {
                    if (iArrayOffset2 - i3 < 2 || i4 >= i) {
                        return xflow(byteBuffer2, i3, iArrayOffset2, charBuffer2, i4, 2);
                    }
                    byte b3 = bArrArray[i3 + 1];
                    if (isMalformed2(b2, b3)) {
                        return malformed(byteBuffer2, i3, charBuffer2, i4, 2);
                    }
                    i2 = i4 + 1;
                    cArrArray[i4] = (char) ((b3 ^ (b2 << 6)) ^ Utf8.MASK_2BYTES);
                    i3 += 2;
                } else if ((b2 >> 4) == -2) {
                    if (iArrayOffset2 - i3 < 3 || i4 >= i) {
                        return xflow(byteBuffer2, i3, iArrayOffset2, charBuffer2, i4, 3);
                    }
                    byte b4 = bArrArray[i3 + 1];
                    byte b5 = bArrArray[i3 + 2];
                    if (isMalformed3(b2, b4, b5)) {
                        return malformed(byteBuffer2, i3, charBuffer2, i4, 3);
                    }
                    i2 = i4 + 1;
                    cArrArray[i4] = (char) ((((b4 << 6) ^ (b2 << 12)) ^ b5) ^ 8064);
                    i3 += 3;
                } else {
                    if ((b2 >> 3) != -2) {
                        return malformed(byteBuffer2, i3, charBuffer2, i4, 1);
                    }
                    if (iArrayOffset2 - i3 < 4 || i - i4 < 2) {
                        return xflow(byteBuffer2, i3, iArrayOffset2, charBuffer2, i4, 4);
                    }
                    byte b6 = bArrArray[i3 + 1];
                    byte b7 = bArrArray[i3 + 2];
                    byte b8 = bArrArray[i3 + 3];
                    int i6 = ((b2 & 7) << 18) | ((b6 & Utf8.REPLACEMENT_BYTE) << 12) | ((b7 & Utf8.REPLACEMENT_BYTE) << 6) | (b8 & Utf8.REPLACEMENT_BYTE);
                    if (isMalformed4(b6, b7, b8) || i6 < 65536 || i6 > 1114111) {
                        return malformed(byteBuffer2, i3, charBuffer2, i4, 4);
                    }
                    int i7 = i4 + 1;
                    int i8 = i6 - 65536;
                    cArrArray[i4] = (char) (((i8 >> 10) & 1023) | GeneratorBase.SURR1_FIRST);
                    i4 += 2;
                    cArrArray[i7] = (char) (56320 | (i8 & 1023));
                    i3 += 4;
                }
                i4 = i2;
            } else {
                if (i4 >= iArrayOffset4) {
                    return xflow(byteBuffer, i3, iArrayOffset2, charBuffer, i4, 1);
                }
                int i9 = iArrayOffset4;
                byteBuffer2 = byteBuffer;
                i = i9;
                charBuffer2 = charBuffer;
                cArrArray[i4] = (char) b2;
                i3++;
                i4++;
            }
            ByteBuffer byteBuffer3 = byteBuffer2;
            iArrayOffset4 = i;
            byteBuffer = byteBuffer3;
            charBuffer = charBuffer2;
        }
        return xflow(byteBuffer, i3, iArrayOffset2, charBuffer, i4, 0);
    }

    private static boolean isMalformed2(int i, int i2) {
        return (i & 30) == 0 || (i2 & 192) != 128;
    }

    private static boolean isMalformed3(int i, int i2, int i3) {
        return ((i != -32 || (i2 & 224) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    private static boolean isMalformed4(int i, int i2, int i3) {
        return ((i & 192) == 128 && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    private static boolean isNotContinuation(int i) {
        return (i & 192) != 128;
    }

    private static CoderResult lookupN(ByteBuffer byteBuffer, int i) {
        for (int i2 = 1; i2 < i; i2++) {
            if (isNotContinuation(byteBuffer.get())) {
                return CoderResult.malformedForLength(i2);
            }
        }
        return CoderResult.malformedForLength(i);
    }

    private static CoderResult malformed(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
        byteBuffer.position(i - byteBuffer.arrayOffset());
        CoderResult coderResultMalformedN = malformedN(byteBuffer, i3);
        byteBuffer.position(i);
        charBuffer.position(i2);
        return coderResultMalformedN;
    }

    public static CoderResult malformedN(ByteBuffer byteBuffer, int i) {
        int i2 = 1;
        if (i == 1) {
            byte b = byteBuffer.get();
            if ((b >> 2) == -2) {
                return byteBuffer.remaining() < 4 ? CoderResult.UNDERFLOW : lookupN(byteBuffer, 5);
            }
            if ((b >> 1) == -2) {
                return byteBuffer.remaining() < 5 ? CoderResult.UNDERFLOW : lookupN(byteBuffer, 6);
            }
            return CoderResult.malformedForLength(1);
        }
        if (i == 2) {
            return CoderResult.malformedForLength(1);
        }
        if (i == 3) {
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            if ((b2 != -32 || (b3 & 224) != 128) && !isNotContinuation(b3)) {
                i2 = 2;
            }
            return CoderResult.malformedForLength(i2);
        }
        if (i != 4) {
            wpg0.m207458a();
            return null;
        }
        int i3 = byteBuffer.get() & 255;
        byte b4 = byteBuffer.get();
        int i4 = b4 & 255;
        if (i3 > 244 || ((i3 == 240 && (i4 < 144 || i4 > 191)) || ((i3 == 244 && (b4 & 240) != 128) || isNotContinuation(i4)))) {
            return CoderResult.malformedForLength(1);
        }
        return isNotContinuation(byteBuffer.get()) ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
    }

    private static CoderResult xflow(Buffer buffer, int i, int i2, Buffer buffer2, int i3, int i4) {
        buffer.position(i);
        buffer2.position(i3);
        return (i4 == 0 || i2 - i < i4) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    @Override // java.nio.charset.CharsetDecoder
    public CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        return decodeArrayLoop(byteBuffer, charBuffer);
    }
}

package org.apache.commons.sudcompress.archivers.zip;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import okio.Utf8;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes2.dex */
class NioZipEncoding implements ZipEncoding, CharsetAccessor {
    private final Charset charset;
    private final boolean useReplacement;
    private static final byte[] REPLACEMENT_BYTES = {Utf8.REPLACEMENT_BYTE};
    private static final char REPLACEMENT = '?';
    private static final String REPLACEMENT_STRING = String.valueOf(REPLACEMENT);
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public NioZipEncoding(Charset charset, boolean z) {
        this.charset = charset;
        this.useReplacement = z;
    }

    private static ByteBuffer encodeFully(CharsetEncoder charsetEncoder, CharBuffer charBuffer, ByteBuffer byteBuffer) {
        while (charBuffer.hasRemaining()) {
            if (charsetEncoder.encode(charBuffer, byteBuffer, false).isOverflow()) {
                byteBuffer = ZipEncodingHelper.growBufferBy(byteBuffer, estimateIncrementalEncodingSize(charsetEncoder, charBuffer.remaining()));
            }
        }
        return byteBuffer;
    }

    private static CharBuffer encodeSurrogate(CharBuffer charBuffer, char c) {
        charBuffer.position(0).limit(6);
        charBuffer.put('%');
        charBuffer.put(Matrix.MATRIX_TYPE_RANDOM_UT);
        char[] cArr = HEX_CHARS;
        charBuffer.put(cArr[(c >> '\f') & 15]);
        charBuffer.put(cArr[(c >> '\b') & 15]);
        charBuffer.put(cArr[(c >> 4) & 15]);
        charBuffer.put(cArr[c & 15]);
        charBuffer.flip();
        return charBuffer;
    }

    private static int estimateIncrementalEncodingSize(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil(charsetEncoder.averageBytesPerChar() * i);
    }

    private static int estimateInitialBufferSize(CharsetEncoder charsetEncoder, int i) {
        return (int) Math.ceil((charsetEncoder.averageBytesPerChar() * (i - 1)) + charsetEncoder.maxBytesPerChar());
    }

    private CharsetDecoder newDecoder() {
        boolean z = this.useReplacement;
        Charset charset = this.charset;
        if (z) {
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(REPLACEMENT_STRING);
        }
        CharsetDecoder charsetDecoderNewDecoder2 = charset.newDecoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
        return charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
    }

    private CharsetEncoder newEncoder() {
        boolean z = this.useReplacement;
        Charset charset = this.charset;
        if (z) {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(REPLACEMENT_BYTES);
        }
        CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
        return charsetEncoderNewEncoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipEncoding
    public boolean canEncode(String str) {
        return newEncoder().canEncode(str);
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipEncoding
    public String decode(byte[] bArr) {
        return newDecoder().decode(ByteBuffer.wrap(bArr)).toString();
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.ZipEncoding
    public ByteBuffer encode(String str) {
        CharsetEncoder charsetEncoderNewEncoder = newEncoder();
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(estimateInitialBufferSize(charsetEncoderNewEncoder, charBufferWrap.remaining()));
        CharBuffer charBufferAllocate = null;
        while (charBufferWrap.hasRemaining()) {
            CoderResult coderResultEncode = charsetEncoderNewEncoder.encode(charBufferWrap, byteBufferAllocate, false);
            if (!coderResultEncode.isUnmappable() && !coderResultEncode.isMalformed()) {
                if (!coderResultEncode.isOverflow()) {
                    if (coderResultEncode.isUnderflow() || coderResultEncode.isError()) {
                        break;
                    }
                } else {
                    byteBufferAllocate = ZipEncodingHelper.growBufferBy(byteBufferAllocate, estimateIncrementalEncodingSize(charsetEncoderNewEncoder, charBufferWrap.remaining()));
                }
            } else {
                if (estimateIncrementalEncodingSize(charsetEncoderNewEncoder, coderResultEncode.length() * 6) > byteBufferAllocate.remaining()) {
                    int i = 0;
                    for (int iPosition = charBufferWrap.position(); iPosition < charBufferWrap.limit(); iPosition++) {
                        i += !charsetEncoderNewEncoder.canEncode(charBufferWrap.get(iPosition)) ? 6 : 1;
                    }
                    byteBufferAllocate = ZipEncodingHelper.growBufferBy(byteBufferAllocate, estimateIncrementalEncodingSize(charsetEncoderNewEncoder, i) - byteBufferAllocate.remaining());
                }
                if (charBufferAllocate == null) {
                    charBufferAllocate = CharBuffer.allocate(6);
                }
                for (int i2 = 0; i2 < coderResultEncode.length(); i2++) {
                    byteBufferAllocate = encodeFully(charsetEncoderNewEncoder, encodeSurrogate(charBufferAllocate, charBufferWrap.get()), byteBufferAllocate);
                }
            }
        }
        charsetEncoderNewEncoder.encode(charBufferWrap, byteBufferAllocate, true);
        byteBufferAllocate.limit(byteBufferAllocate.position());
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // org.apache.commons.sudcompress.archivers.zip.CharsetAccessor
    public Charset getCharset() {
        return this.charset;
    }
}

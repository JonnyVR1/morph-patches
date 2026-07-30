package com.fasterxml.jackson.core.util;

import com.tencent.liteav.TXLiteAVCode;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes6.dex */
public class BufferRecycler {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;
    protected final byte[][] _byteBuffers;
    protected final char[][] _charBuffers;
    private static final int[] BYTE_BUFFER_LENGTHS = {TXRecordCommon.AUDIO_SAMPLERATE_8000, TXRecordCommon.AUDIO_SAMPLERATE_8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, 200, 200};

    public BufferRecycler(int i, int i2) {
        this._byteBuffers = new byte[i][];
        this._charBuffers = new char[i2][];
    }

    public byte[] allocByteBuffer(int i, int i2) {
        int iByteBufferLength = byteBufferLength(i);
        if (i2 < iByteBufferLength) {
            i2 = iByteBufferLength;
        }
        byte[][] bArr = this._byteBuffers;
        byte[] bArr2 = bArr[i];
        if (bArr2 == null || bArr2.length < i2) {
            return balloc(i2);
        }
        bArr[i] = null;
        return bArr2;
    }

    public char[] allocCharBuffer(int i, int i2) {
        int iCharBufferLength = charBufferLength(i);
        if (i2 < iCharBufferLength) {
            i2 = iCharBufferLength;
        }
        char[][] cArr = this._charBuffers;
        char[] cArr2 = cArr[i];
        if (cArr2 == null || cArr2.length < i2) {
            return calloc(i2);
        }
        cArr[i] = null;
        return cArr2;
    }

    public byte[] balloc(int i) {
        return new byte[i];
    }

    public int byteBufferLength(int i) {
        return BYTE_BUFFER_LENGTHS[i];
    }

    public char[] calloc(int i) {
        return new char[i];
    }

    public int charBufferLength(int i) {
        return CHAR_BUFFER_LENGTHS[i];
    }

    public final void releaseByteBuffer(int i, byte[] bArr) {
        this._byteBuffers[i] = bArr;
    }

    public void releaseCharBuffer(int i, char[] cArr) {
        this._charBuffers[i] = cArr;
    }

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i) {
        return allocByteBuffer(i, 0);
    }

    public final char[] allocCharBuffer(int i) {
        return allocCharBuffer(i, 0);
    }
}

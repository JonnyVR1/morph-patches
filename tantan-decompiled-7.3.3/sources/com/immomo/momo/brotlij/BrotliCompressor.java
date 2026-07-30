package com.immomo.momo.brotlij;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001(B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m88121d2 = {"Lcom/immomo/momo/brotlij/BrotliCompressor;", "", "Lcom/immomo/momo/brotlij/Brotli$Mode;", "mode", "", "quality", "lgwin", "lgblock", "<init>", "(Lcom/immomo/momo/brotlij/Brotli$Mode;III)V", "", "encoderInstance", "", "inputFilePath", "outputFilePath", "", "nativeCompressFile", "(JLjava/lang/String;Ljava/lang/String;)Z", "nativeCreateBrotliCompressorInstance", "(IIII)J", "", "data", "startPos", "length", "compressedData", "isEof", "nativeCompress", "(J[BII[BZ)I", "", "nativeDestroyBrotliCompressorInstance", "(J)V", "mEncoderInstance", "J", "mDataInBuffer", "[B", "mDataOutBuffer", "Ljava/io/ByteArrayOutputStream;", "mOutputByteArrayOS", "Ljava/io/ByteArrayOutputStream;", "Companion", "a", "brotlij_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class BrotliCompressor {
    private static final int DATA_IN_BUFFER_MAX_SIZE = 32768;
    private static final int DATA_IN_BUFFER_MIN_SIZE = 8192;
    private static final int DATA_OUT_BUFFER_MAX_SIZE = 65536;
    private static final int DATA_OUT_BUFFER_MIN_SIZE = 16384;
    private byte[] mDataInBuffer;
    private byte[] mDataOutBuffer;
    private long mEncoderInstance;
    private ByteArrayOutputStream mOutputByteArrayOS;

    public /* synthetic */ BrotliCompressor(Brotli.Mode mode, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Brotli.INSTANCE.m20015a() : mode, (i4 & 2) != 0 ? 6 : i, (i4 & 4) != 0 ? 22 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    private final native int nativeCompress(long encoderInstance, byte[] data, int startPos, int length, byte[] compressedData, boolean isEof);

    private final native boolean nativeCompressFile(long encoderInstance, String inputFilePath, String outputFilePath);

    private final native long nativeCreateBrotliCompressorInstance(int mode, int quality, int lgwin, int lgblock);

    private final native void nativeDestroyBrotliCompressorInstance(long encoderInstance);

    public BrotliCompressor(@NotNull Brotli.Mode mode, int i, int i2, int i3) {
        mode.getClass();
        this.mEncoderInstance = nativeCreateBrotliCompressorInstance(mode.getMode(), i, i2, i3);
        this.mOutputByteArrayOS = new ByteArrayOutputStream();
    }

    public BrotliCompressor() {
        this(null, 0, 0, 0, 15, null);
    }
}

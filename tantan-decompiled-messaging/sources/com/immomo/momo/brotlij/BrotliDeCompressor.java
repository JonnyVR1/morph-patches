package com.immomo.momo.brotlij;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m87232d2 = {"Lcom/immomo/momo/brotlij/BrotliDeCompressor;", "", "<init>", "()V", "", "decoderInstance", "", "inputFilePath", "outputFilePath", "", "nativeDeCompressFile", "(JLjava/lang/String;Ljava/lang/String;)Z", "nativeCreateBrotliDeCompressorInstance", "()J", "", "data", "", "startPos", "length", "nativeDeCompress", "(J[BII)I", "", "nativeDestroyBrotliDeCompressorInstance", "(J)V", "mDecoderInstance", "J", "mDataInBuffer", "[B", "Ljava/io/ByteArrayOutputStream;", "mOutputByteArrayOS", "Ljava/io/ByteArrayOutputStream;", "Companion", "a", "brotlij_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class BrotliDeCompressor {
    private static final int DATA_IN_BUFFER_SIZE = 16384;
    private byte[] mDataInBuffer;
    private final long mDecoderInstance = nativeCreateBrotliDeCompressorInstance();
    private ByteArrayOutputStream mOutputByteArrayOS = new ByteArrayOutputStream();

    private final native long nativeCreateBrotliDeCompressorInstance();

    private final native int nativeDeCompress(long decoderInstance, byte[] data, int startPos, int length);

    private final native boolean nativeDeCompressFile(long decoderInstance, String inputFilePath, String outputFilePath);

    private final native void nativeDestroyBrotliDeCompressorInstance(long decoderInstance);
}

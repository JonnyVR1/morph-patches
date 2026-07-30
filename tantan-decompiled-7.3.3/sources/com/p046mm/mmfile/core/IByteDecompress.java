package com.p046mm.mmfile.core;

/* JADX INFO: loaded from: classes6.dex */
public interface IByteDecompress {
    void onDecompressError(int i);

    void onMemoryExtension(long j);

    void traverse(byte[] bArr);
}

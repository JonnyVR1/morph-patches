package com.p041mm.mmfile.core;

/* JADX INFO: loaded from: classes7.dex */
public interface IByteDecompress {
    void onDecompressError(int i);

    void onMemoryExtension(long j);

    void traverse(byte[] bArr);
}

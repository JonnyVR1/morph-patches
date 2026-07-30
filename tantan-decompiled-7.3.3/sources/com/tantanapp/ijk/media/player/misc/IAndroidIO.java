package com.tantanapp.ijk.media.player.misc;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public interface IAndroidIO {
    int close() throws IOException;

    int open(String str) throws IOException;

    int read(byte[] bArr, int i) throws IOException;

    long seek(long j, int i) throws IOException;
}

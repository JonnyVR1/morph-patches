package org.apache.commons.sudcompress.archivers.zip;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface ZipEncoding {
    boolean canEncode(String str);

    String decode(byte[] bArr);

    ByteBuffer encode(String str);
}

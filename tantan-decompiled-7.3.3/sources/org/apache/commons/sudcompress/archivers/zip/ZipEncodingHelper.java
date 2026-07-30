package org.apache.commons.sudcompress.archivers.zip;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZipEncodingHelper {
    static final String UTF8 = "UTF8";
    static final ZipEncoding UTF8_ZIP_ENCODING = getZipEncoding("UTF8");

    public static ZipEncoding getZipEncoding(String str) {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (str != null) {
            try {
                charsetDefaultCharset = Charset.forName(str);
            } catch (UnsupportedCharsetException unused) {
            }
        }
        return new NioZipEncoding(charsetDefaultCharset, isUTF8(charsetDefaultCharset.name()));
    }

    public static ByteBuffer growBufferBy(ByteBuffer byteBuffer, int i) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity() + i);
        byteBufferAllocate.put(byteBuffer);
        return byteBufferAllocate;
    }

    public static boolean isUTF8(String str) {
        if (str == null) {
            str = Charset.defaultCharset().name();
        }
        Charset charset = StandardCharsets.UTF_8;
        if (charset.name().equalsIgnoreCase(str)) {
            return true;
        }
        Iterator<String> it = charset.aliases().iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}

package com.sina.weibo.sdk.network.base;

import com.sina.weibo.sdk.network.exception.RequestException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WbResponseBody {
    private InputStream inputStream;
    private long length;

    public WbResponseBody(InputStream inputStream, long j) {
        this.inputStream = inputStream;
        this.length = j;
    }

    public InputStream byteStream() {
        return this.inputStream;
    }

    public long contentLength() {
        return this.length;
    }

    public String string() throws RequestException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = this.inputStream.read(bArr);
                if (i == -1) {
                    this.inputStream.close();
                    byteArrayOutputStream.close();
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            throw new RequestException(e.toString());
        }
    }
}

package org.eclipse.jetty.http;

import java.io.IOException;
import java.io.InputStream;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.ByteArrayBuffer;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;

/* JADX INFO: loaded from: classes3.dex */
public interface HttpContent {
    long getContentLength();

    Buffer getContentType();

    Buffer getDirectBuffer();

    Buffer getIndirectBuffer();

    InputStream getInputStream() throws IOException;

    Buffer getLastModified();

    Resource getResource();

    void release();

    public static class ResourceAsHttpContent implements HttpContent {
        private static final Logger LOG = Log.getLogger((Class<?>) ResourceAsHttpContent.class);
        final int _maxBuffer;
        final Buffer _mimeType;
        final Resource _resource;

        public ResourceAsHttpContent(Resource resource, Buffer buffer) {
            this._resource = resource;
            this._mimeType = buffer;
            this._maxBuffer = -1;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public long getContentLength() {
            return this._resource.length();
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getContentType() {
            return this._mimeType;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getDirectBuffer() {
            return null;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getIndirectBuffer() {
            InputStream inputStream = null;
            try {
                try {
                    if (this._resource.length() > 0 && this._maxBuffer >= this._resource.length()) {
                        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer((int) this._resource.length());
                        inputStream = this._resource.getInputStream();
                        byteArrayBuffer.readFrom(inputStream, (int) this._resource.length());
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                return byteArrayBuffer;
                            } catch (IOException e) {
                                LOG.warn("Couldn't close inputStream. Possible file handle leak", e);
                            }
                        }
                        return byteArrayBuffer;
                    }
                    return null;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        LOG.warn("Couldn't close inputStream. Possible file handle leak", e3);
                    }
                }
                throw th;
            }
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public InputStream getInputStream() throws IOException {
            return this._resource.getInputStream();
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Buffer getLastModified() {
            return null;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public Resource getResource() {
            return this._resource;
        }

        @Override // org.eclipse.jetty.http.HttpContent
        public void release() {
            this._resource.release();
        }

        public ResourceAsHttpContent(Resource resource, Buffer buffer, int i) {
            this._resource = resource;
            this._mimeType = buffer;
            this._maxBuffer = i;
        }
    }
}

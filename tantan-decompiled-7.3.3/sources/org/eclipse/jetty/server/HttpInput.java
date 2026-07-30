package org.eclipse.jetty.server;

import java.io.IOException;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.p127io.Buffer;
import org.eclipse.jetty.p127io.EofException;
import p153l.dse0;

/* JADX INFO: loaded from: classes2.dex */
public class HttpInput extends dse0 {
    protected final AbstractHttpConnection _connection;
    protected final HttpParser _parser;

    public HttpInput(AbstractHttpConnection abstractHttpConnection) {
        this._connection = abstractHttpConnection;
        this._parser = (HttpParser) abstractHttpConnection.getParser();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this._parser.available();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Buffer bufferBlockForContent = this._parser.blockForContent(this._connection.getMaxIdleTime());
        if (bufferBlockForContent != null) {
            return bufferBlockForContent.get(bArr, i, i2);
        }
        if (this._connection.isEarlyEOF()) {
            throw new EofException("early EOF");
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}

package org.eclipse.jetty.server;

import java.io.IOException;
import l.yje0;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.p004io.EofException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HttpInput extends yje0 {
    protected final AbstractHttpConnection _connection;
    protected final HttpParser _parser;

    public HttpInput(AbstractHttpConnection abstractHttpConnection) {
        this._connection = abstractHttpConnection;
        this._parser = (HttpParser) abstractHttpConnection.getParser();
    }

    public int available() throws IOException {
        return this._parser.available();
    }

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

    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}

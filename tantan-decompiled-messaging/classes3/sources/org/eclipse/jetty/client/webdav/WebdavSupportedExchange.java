package org.eclipse.jetty.client.webdav;

import java.io.IOException;
import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.p004io.Buffer;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class WebdavSupportedExchange extends HttpExchange {
    private static final Logger LOG = Log.getLogger((Class<?>) WebdavSupportedExchange.class);
    private boolean _webdavSupported = false;
    private boolean _isComplete = false;

    public boolean isWebdavSupported() {
        return this._webdavSupported;
    }

    @Override // org.eclipse.jetty.client.HttpExchange
    public void onResponseComplete() throws IOException {
        this._isComplete = true;
        super.onResponseComplete();
    }

    @Override // org.eclipse.jetty.client.HttpExchange
    public void onResponseHeader(Buffer buffer, Buffer buffer2) throws IOException {
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("WebdavSupportedExchange:Header:" + buffer.toString() + " / " + buffer2.toString(), new Object[0]);
        }
        if ("DAV".equals(buffer.toString()) && (buffer2.toString().indexOf("1") >= 0 || buffer2.toString().indexOf("2") >= 0)) {
            this._webdavSupported = true;
        }
        super.onResponseHeader(buffer, buffer2);
    }

    public void waitTilCompletion() throws InterruptedException {
        synchronized (this) {
            while (!this._isComplete) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

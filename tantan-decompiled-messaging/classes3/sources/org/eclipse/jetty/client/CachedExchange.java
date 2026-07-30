package org.eclipse.jetty.client;

import java.io.IOException;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.p004io.Buffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CachedExchange extends HttpExchange {
    private final HttpFields _responseFields;
    private volatile int _responseStatus;

    public CachedExchange(boolean z) {
        this._responseFields = z ? new HttpFields() : null;
    }

    public synchronized HttpFields getResponseFields() {
        if (getStatus() < 6) {
            throw new IllegalStateException("Headers not completely received yet");
        }
        return this._responseFields;
    }

    public synchronized int getResponseStatus() {
        if (getStatus() < 5) {
            throw new IllegalStateException("Response not received yet");
        }
        return this._responseStatus;
    }

    @Override // org.eclipse.jetty.client.HttpExchange
    public synchronized void onResponseHeader(Buffer buffer, Buffer buffer2) throws IOException {
        try {
            HttpFields httpFields = this._responseFields;
            if (httpFields != null) {
                httpFields.add(buffer, buffer2.asImmutableBuffer());
            }
            super.onResponseHeader(buffer, buffer2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.eclipse.jetty.client.HttpExchange
    public synchronized void onResponseStatus(Buffer buffer, int i, Buffer buffer2) throws IOException {
        this._responseStatus = i;
        super.onResponseStatus(buffer, i, buffer2);
    }
}

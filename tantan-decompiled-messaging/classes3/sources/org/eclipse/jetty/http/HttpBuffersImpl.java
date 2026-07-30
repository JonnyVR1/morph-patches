package org.eclipse.jetty.http;

import org.eclipse.jetty.p004io.Buffers;
import org.eclipse.jetty.p004io.BuffersFactory;
import org.eclipse.jetty.util.component.AbstractLifeCycle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HttpBuffersImpl extends AbstractLifeCycle implements HttpBuffers {
    private Buffers.Type _requestBufferType;
    private Buffers _requestBuffers;
    private Buffers.Type _requestHeaderType;
    private Buffers.Type _responseBufferType;
    private Buffers _responseBuffers;
    private Buffers.Type _responseHeaderType;
    private int _requestBufferSize = 16384;
    private int _requestHeaderSize = 6144;
    private int _responseBufferSize = 32768;
    private int _responseHeaderSize = 6144;
    private int _maxBuffers = 1024;

    public HttpBuffersImpl() {
        Buffers.Type type = Buffers.Type.BYTE_ARRAY;
        this._requestBufferType = type;
        this._requestHeaderType = type;
        this._responseBufferType = type;
        this._responseHeaderType = type;
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        Buffers.Type type = this._requestHeaderType;
        int i = this._requestHeaderSize;
        Buffers.Type type2 = this._requestBufferType;
        this._requestBuffers = BuffersFactory.newBuffers(type, i, type2, this._requestBufferSize, type2, getMaxBuffers());
        Buffers.Type type3 = this._responseHeaderType;
        int i2 = this._responseHeaderSize;
        Buffers.Type type4 = this._responseBufferType;
        this._responseBuffers = BuffersFactory.newBuffers(type3, i2, type4, this._responseBufferSize, type4, getMaxBuffers());
        super.doStart();
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        this._requestBuffers = null;
        this._responseBuffers = null;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public int getMaxBuffers() {
        return this._maxBuffers;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public int getRequestBufferSize() {
        return this._requestBufferSize;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public Buffers.Type getRequestBufferType() {
        return this._requestBufferType;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public Buffers getRequestBuffers() {
        return this._requestBuffers;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public int getRequestHeaderSize() {
        return this._requestHeaderSize;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public Buffers.Type getRequestHeaderType() {
        return this._requestHeaderType;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public int getResponseBufferSize() {
        return this._responseBufferSize;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public Buffers.Type getResponseBufferType() {
        return this._responseBufferType;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public Buffers getResponseBuffers() {
        return this._responseBuffers;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public int getResponseHeaderSize() {
        return this._responseHeaderSize;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public Buffers.Type getResponseHeaderType() {
        return this._responseHeaderType;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public void setMaxBuffers(int i) {
        this._maxBuffers = i;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public void setRequestBufferSize(int i) {
        this._requestBufferSize = i;
    }

    public void setRequestBufferType(Buffers.Type type) {
        this._requestBufferType = type;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public void setRequestBuffers(Buffers buffers) {
        this._requestBuffers = buffers;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public void setRequestHeaderSize(int i) {
        this._requestHeaderSize = i;
    }

    public void setRequestHeaderType(Buffers.Type type) {
        this._requestHeaderType = type;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public void setResponseBufferSize(int i) {
        this._responseBufferSize = i;
    }

    public void setResponseBufferType(Buffers.Type type) {
        this._responseBufferType = type;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public void setResponseBuffers(Buffers buffers) {
        this._responseBuffers = buffers;
    }

    @Override // org.eclipse.jetty.http.HttpBuffers
    public void setResponseHeaderSize(int i) {
        this._responseHeaderSize = i;
    }

    public void setResponseHeaderType(Buffers.Type type) {
        this._responseHeaderType = type;
    }

    public String toString() {
        return this._requestBuffers + "/" + this._responseBuffers;
    }
}

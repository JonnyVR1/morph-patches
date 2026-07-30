package com.fasterxml.jackson.core.p029io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
public class IOContext {
    protected final BufferRecycler _bufferRecycler;
    protected JsonEncoding _encoding;
    protected final boolean _managedResource;
    protected final Object _sourceRef;
    protected byte[] _readIOBuffer = null;
    protected byte[] _writeEncodingBuffer = null;
    protected byte[] _base64Buffer = null;
    protected char[] _tokenCBuffer = null;
    protected char[] _concatCBuffer = null;
    protected char[] _nameCopyBuffer = null;

    public IOContext(BufferRecycler bufferRecycler, Object obj, boolean z) {
        this._bufferRecycler = bufferRecycler;
        this._sourceRef = obj;
        this._managedResource = z;
    }

    private IllegalArgumentException wrongBuf() {
        return new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    public final void _verifyAlloc(Object obj) {
        if (obj == null) {
            return;
        }
        qkq0.m175383a("Trying to call same allocXxx() method second time");
    }

    public final void _verifyRelease(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length <= bArr2.length) {
            throw wrongBuf();
        }
    }

    public byte[] allocBase64Buffer() {
        _verifyAlloc(this._base64Buffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(3);
        this._base64Buffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public char[] allocConcatBuffer() {
        _verifyAlloc(this._concatCBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(1);
        this._concatCBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public char[] allocNameCopyBuffer(int i) {
        _verifyAlloc(this._nameCopyBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(3, i);
        this._nameCopyBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public byte[] allocReadIOBuffer() {
        _verifyAlloc(this._readIOBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(0);
        this._readIOBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public char[] allocTokenBuffer() {
        _verifyAlloc(this._tokenCBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(0);
        this._tokenCBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public byte[] allocWriteEncodingBuffer() {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(1);
        this._writeEncodingBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public TextBuffer constructTextBuffer() {
        return new TextBuffer(this._bufferRecycler);
    }

    public JsonEncoding getEncoding() {
        return this._encoding;
    }

    public Object getSourceReference() {
        return this._sourceRef;
    }

    public boolean isResourceManaged() {
        return this._managedResource;
    }

    public void releaseBase64Buffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._base64Buffer);
            this._base64Buffer = null;
            this._bufferRecycler.releaseByteBuffer(3, bArr);
        }
    }

    public void releaseConcatBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._concatCBuffer);
            this._concatCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(1, cArr);
        }
    }

    public void releaseNameCopyBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._nameCopyBuffer);
            this._nameCopyBuffer = null;
            this._bufferRecycler.releaseCharBuffer(3, cArr);
        }
    }

    public void releaseReadIOBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._readIOBuffer);
            this._readIOBuffer = null;
            this._bufferRecycler.releaseByteBuffer(0, bArr);
        }
    }

    public void releaseTokenBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._tokenCBuffer);
            this._tokenCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(0, cArr);
        }
    }

    public void releaseWriteEncodingBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._writeEncodingBuffer);
            this._writeEncodingBuffer = null;
            this._bufferRecycler.releaseByteBuffer(1, bArr);
        }
    }

    public void setEncoding(JsonEncoding jsonEncoding) {
        this._encoding = jsonEncoding;
    }

    public final void _verifyRelease(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length <= cArr2.length) {
            throw wrongBuf();
        }
    }

    public byte[] allocReadIOBuffer(int i) {
        _verifyAlloc(this._readIOBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(0, i);
        this._readIOBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public char[] allocTokenBuffer(int i) {
        _verifyAlloc(this._tokenCBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(0, i);
        this._tokenCBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public byte[] allocWriteEncodingBuffer(int i) {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(1, i);
        this._writeEncodingBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }
}

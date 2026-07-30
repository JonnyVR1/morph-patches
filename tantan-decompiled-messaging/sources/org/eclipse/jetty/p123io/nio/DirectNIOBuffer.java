package org.eclipse.jetty.p123io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.eclipse.jetty.p123io.AbstractBuffer;
import org.eclipse.jetty.p123io.Buffer;
import p149l.ctq0;
import p149l.qkq0;
import p149l.x9g0;
import p149l.yfq0;

/* JADX INFO: loaded from: classes3.dex */
public class DirectNIOBuffer extends AbstractBuffer implements NIOBuffer {
    protected final ByteBuffer _buf;
    private ReadableByteChannel _in;
    private InputStream _inStream;
    private WritableByteChannel _out;
    private OutputStream _outStream;

    public DirectNIOBuffer(File file) throws IOException {
        super(1, false);
        this._buf = new FileInputStream(file).getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
        setGetIndex(0);
        setPutIndex((int) file.length());
        this._access = 0;
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public byte[] array() {
        return null;
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public int capacity() {
        return this._buf.capacity();
    }

    @Override // org.eclipse.jetty.p123io.nio.NIOBuffer
    public ByteBuffer getByteBuffer() {
        return this._buf;
    }

    @Override // org.eclipse.jetty.p123io.nio.NIOBuffer
    public boolean isDirect() {
        return true;
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public int peek(int i, byte[] bArr, int i2, int i3) {
        if ((i + i3 > capacity() && (i3 = capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        try {
            this._buf.position(i);
            this._buf.get(bArr, i2, i3);
            return i3;
        } finally {
            this._buf.position(0);
        }
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public int poke(int i, Buffer buffer) {
        if (isReadOnly()) {
            qkq0.m175383a("READONLY");
            return 0;
        }
        byte[] bArrArray = buffer.array();
        if (bArrArray != null) {
            return poke(i, bArrArray, buffer.getIndex(), buffer.length());
        }
        Buffer buffer2 = buffer.buffer();
        if (!(buffer2 instanceof DirectNIOBuffer)) {
            return super.poke(i, buffer);
        }
        ByteBuffer byteBufferDuplicate = ((DirectNIOBuffer) buffer2)._buf;
        ByteBuffer byteBuffer = this._buf;
        if (byteBufferDuplicate == byteBuffer) {
            byteBufferDuplicate = byteBuffer.duplicate();
        }
        try {
            this._buf.position(i);
            int iRemaining = this._buf.remaining();
            int length = buffer.length();
            if (length <= iRemaining) {
                iRemaining = length;
            }
            byteBufferDuplicate.position(buffer.getIndex());
            byteBufferDuplicate.limit(buffer.getIndex() + iRemaining);
            this._buf.put(byteBufferDuplicate);
            return iRemaining;
        } finally {
            this._buf.position(0);
            byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
            byteBufferDuplicate.position(0);
        }
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public int readFrom(InputStream inputStream, int i) throws IOException {
        ReadableByteChannel readableByteChannel = this._in;
        if (readableByteChannel == null || !readableByteChannel.isOpen() || inputStream != this._inStream) {
            this._in = Channels.newChannel(inputStream);
            this._inStream = inputStream;
        }
        if (i < 0 || i > space()) {
            i = space();
        }
        int iPutIndex = putIndex();
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            try {
                try {
                    this._buf.position(iPutIndex);
                    this._buf.limit(iPutIndex + i2);
                    i5 = this._in.read(this._buf);
                    if (i5 < 0) {
                        this._in = null;
                        this._inStream = inputStream;
                        break;
                    }
                    if (i5 > 0) {
                        iPutIndex += i5;
                        i3 += i5;
                        i2 -= i5;
                        setPutIndex(iPutIndex);
                        i4 = 0;
                    } else {
                        int i6 = i4 + 1;
                        if (i4 > 1) {
                            break;
                        }
                        i4 = i6;
                    }
                    if (inputStream.available() <= 0) {
                        break;
                    }
                } catch (IOException e) {
                    this._in = null;
                    this._inStream = inputStream;
                    throw e;
                }
            } catch (Throwable th) {
                ReadableByteChannel readableByteChannel2 = this._in;
                if (readableByteChannel2 != null && !readableByteChannel2.isOpen()) {
                    this._in = null;
                    this._inStream = inputStream;
                }
                this._buf.position(0);
                ByteBuffer byteBuffer = this._buf;
                byteBuffer.limit(byteBuffer.capacity());
                throw th;
            }
        }
        if (i5 >= 0 || i3 != 0) {
            ReadableByteChannel readableByteChannel3 = this._in;
            if (readableByteChannel3 != null && !readableByteChannel3.isOpen()) {
                this._in = null;
                this._inStream = inputStream;
            }
            this._buf.position(0);
            ByteBuffer byteBuffer2 = this._buf;
            byteBuffer2.limit(byteBuffer2.capacity());
            return i3;
        }
        ReadableByteChannel readableByteChannel4 = this._in;
        if (readableByteChannel4 != null && !readableByteChannel4.isOpen()) {
            this._in = null;
            this._inStream = inputStream;
        }
        this._buf.position(0);
        ByteBuffer byteBuffer3 = this._buf;
        byteBuffer3.limit(byteBuffer3.capacity());
        return -1;
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public void writeTo(OutputStream outputStream) throws IOException {
        int iWrite;
        WritableByteChannel writableByteChannel = this._out;
        if (writableByteChannel == null || !writableByteChannel.isOpen() || outputStream != this._outStream) {
            this._out = Channels.newChannel(outputStream);
            this._outStream = outputStream;
        }
        synchronized (this._buf) {
            loop0: while (true) {
                int i = 0;
                while (true) {
                    try {
                        try {
                            try {
                                if (!hasContent() || !this._out.isOpen()) {
                                    break loop0;
                                }
                                this._buf.position(getIndex());
                                this._buf.limit(putIndex());
                                iWrite = this._out.write(this._buf);
                                if (iWrite < 0) {
                                    break loop0;
                                }
                                if (iWrite > 0) {
                                    break;
                                }
                                int i2 = i + 1;
                                if (i > 1) {
                                    break loop0;
                                } else {
                                    i = i2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (IOException e) {
                            this._out = null;
                            this._outStream = null;
                            throw e;
                        }
                    } catch (Throwable th2) {
                        WritableByteChannel writableByteChannel2 = this._out;
                        if (writableByteChannel2 != null && !writableByteChannel2.isOpen()) {
                            this._out = null;
                            this._outStream = null;
                        }
                        this._buf.position(0);
                        ByteBuffer byteBuffer = this._buf;
                        byteBuffer.limit(byteBuffer.capacity());
                        throw th2;
                    }
                }
                skip(iWrite);
            }
            WritableByteChannel writableByteChannel3 = this._out;
            if (writableByteChannel3 != null && !writableByteChannel3.isOpen()) {
                this._out = null;
                this._outStream = null;
            }
            this._buf.position(0);
            ByteBuffer byteBuffer2 = this._buf;
            byteBuffer2.limit(byteBuffer2.capacity());
        }
    }

    public DirectNIOBuffer(ByteBuffer byteBuffer, boolean z) {
        super(z ? 0 : 2, false);
        if (byteBuffer.isDirect()) {
            this._buf = byteBuffer;
            setGetIndex(byteBuffer.position());
            setPutIndex(byteBuffer.limit());
            return;
        }
        x9g0.m207497a();
        throw null;
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public byte peek(int i) {
        return this._buf.get(i);
    }

    public DirectNIOBuffer(int i) {
        super(2, false);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        this._buf = byteBufferAllocateDirect;
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.limit(byteBufferAllocateDirect.capacity());
    }

    @Override // org.eclipse.jetty.p123io.Buffer
    public void poke(int i, byte b) {
        if (isReadOnly()) {
            qkq0.m175383a("READONLY");
            return;
        }
        if (i >= 0) {
            if (i <= capacity()) {
                this._buf.put(i, b);
                return;
            } else {
                yfq0.m214580a("index>capacity(): ", i, ">", capacity());
                return;
            }
        }
        ctq0.m108694a("index<0: ", i, "<0");
    }

    @Override // org.eclipse.jetty.p123io.AbstractBuffer, org.eclipse.jetty.p123io.Buffer
    public int poke(int i, byte[] bArr, int i2, int i3) {
        if (isReadOnly()) {
            qkq0.m175383a("READONLY");
            return 0;
        }
        if (i >= 0) {
            if (i + i3 > capacity() && (i3 = capacity() - i) < 0) {
                yfq0.m214580a("index>capacity(): ", i, ">", capacity());
                return 0;
            }
            try {
                this._buf.position(i);
                int iRemaining = this._buf.remaining();
                if (i3 > iRemaining) {
                    i3 = iRemaining;
                }
                if (i3 > 0) {
                    this._buf.put(bArr, i2, i3);
                }
                return i3;
            } finally {
                this._buf.position(0);
            }
        }
        ctq0.m108694a("index<0: ", i, "<0");
        return 0;
    }
}

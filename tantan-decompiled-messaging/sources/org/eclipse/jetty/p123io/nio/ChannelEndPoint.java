package org.eclipse.jetty.p123io.nio;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import org.eclipse.jetty.p123io.Buffer;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.rhg0;

/* JADX INFO: loaded from: classes3.dex */
public class ChannelEndPoint implements EndPoint {
    private static final Logger LOG = Log.getLogger((Class<?>) ChannelEndPoint.class);
    protected final ByteChannel _channel;
    protected final ByteBuffer[] _gather2;
    private volatile boolean _ishut;
    protected final InetSocketAddress _local;
    protected volatile int _maxIdleTime;
    private volatile boolean _oshut;
    protected final InetSocketAddress _remote;
    protected final Socket _socket;

    public ChannelEndPoint(ByteChannel byteChannel, int i) throws IOException {
        this._gather2 = new ByteBuffer[2];
        this._channel = byteChannel;
        this._maxIdleTime = i;
        Socket socket = byteChannel instanceof SocketChannel ? ((SocketChannel) byteChannel).socket() : null;
        this._socket = socket;
        if (socket == null) {
            this._remote = null;
            this._local = null;
        } else {
            this._local = (InetSocketAddress) socket.getLocalSocketAddress();
            this._remote = (InetSocketAddress) socket.getRemoteSocketAddress();
            socket.setSoTimeout(this._maxIdleTime);
        }
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public boolean blockReadable(long j) throws IOException {
        return true;
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public boolean blockWritable(long j) throws IOException {
        return true;
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public void close() throws IOException {
        LOG.debug("close {}", this);
        this._channel.close();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public int fill(Buffer buffer) throws Throwable {
        if (this._ishut) {
            return -1;
        }
        Buffer buffer2 = buffer.buffer();
        int i = 0;
        if (!(buffer2 instanceof NIOBuffer)) {
            rhg0.m179353a("Not Implemented");
            return 0;
        }
        ByteBuffer byteBuffer = ((NIOBuffer) buffer2).getByteBuffer();
        try {
            synchronized (byteBuffer) {
                try {
                    try {
                        byteBuffer.position(buffer.putIndex());
                        int i2 = this._channel.read(byteBuffer);
                        try {
                            buffer.setPutIndex(byteBuffer.position());
                            byteBuffer.position(0);
                            if (i2 < 0) {
                                try {
                                    if (isOpen()) {
                                        if (!isInputShutdown()) {
                                            shutdownInput();
                                        }
                                        if (isOutputShutdown()) {
                                            this._channel.close();
                                        }
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    i = i2;
                                    LOG.debug("Exception while filling", e);
                                    try {
                                        if (this._channel.isOpen()) {
                                            this._channel.close();
                                        }
                                    } catch (Exception e2) {
                                        LOG.ignore(e2);
                                    }
                                    if (i <= 0) {
                                        return -1;
                                    }
                                    throw e;
                                }
                            }
                            return i2;
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        buffer.setPutIndex(byteBuffer.position());
                        byteBuffer.position(0);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public int flush(Buffer buffer, Buffer buffer2, Buffer buffer3) throws IOException {
        Buffer buffer4 = buffer == null ? null : buffer.buffer();
        Buffer buffer5 = buffer2 != null ? buffer2.buffer() : null;
        if ((this._channel instanceof GatheringByteChannel) && buffer != null && buffer.length() != 0 && (buffer4 instanceof NIOBuffer) && buffer2 != null && buffer2.length() != 0 && (buffer5 instanceof NIOBuffer)) {
            return gatheringFlush(buffer, ((NIOBuffer) buffer4).getByteBuffer(), buffer2, ((NIOBuffer) buffer5).getByteBuffer());
        }
        int iFlush = (buffer == null || buffer.length() <= 0) ? 0 : flush(buffer);
        if ((buffer == null || buffer.length() == 0) && buffer2 != null && buffer2.length() > 0) {
            iFlush += flush(buffer2);
        }
        if (buffer == null || buffer.length() == 0) {
            return ((buffer2 == null || buffer2.length() == 0) && buffer3 != null && buffer3.length() > 0) ? iFlush + flush(buffer3) : iFlush;
        }
        return iFlush;
    }

    public int gatheringFlush(Buffer buffer, ByteBuffer byteBuffer, Buffer buffer2, ByteBuffer byteBuffer2) throws IOException {
        int iWrite;
        synchronized (this) {
            try {
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                byteBufferAsReadOnlyBuffer.position(buffer.getIndex());
                byteBufferAsReadOnlyBuffer.limit(buffer.putIndex());
                ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBuffer2.asReadOnlyBuffer();
                byteBufferAsReadOnlyBuffer2.position(buffer2.getIndex());
                byteBufferAsReadOnlyBuffer2.limit(buffer2.putIndex());
                ByteBuffer[] byteBufferArr = this._gather2;
                byteBufferArr[0] = byteBufferAsReadOnlyBuffer;
                byteBufferArr[1] = byteBufferAsReadOnlyBuffer2;
                iWrite = (int) ((GatheringByteChannel) this._channel).write(byteBufferArr);
                int length = buffer.length();
                if (iWrite > length) {
                    buffer.clear();
                    buffer2.skip(iWrite - length);
                } else if (iWrite > 0) {
                    buffer.skip(iWrite);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iWrite;
    }

    public ByteChannel getChannel() {
        return this._channel;
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public String getLocalAddr() {
        if (this._socket == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this._local;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this._local.getAddress().isAnyLocalAddress()) ? StringUtil.ALL_INTERFACES : this._local.getAddress().getHostAddress();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public String getLocalHost() {
        if (this._socket == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this._local;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this._local.getAddress().isAnyLocalAddress()) ? StringUtil.ALL_INTERFACES : this._local.getAddress().getCanonicalHostName();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public int getLocalPort() {
        if (this._socket == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this._local;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public int getMaxIdleTime() {
        return this._maxIdleTime;
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public String getRemoteAddr() {
        InetSocketAddress inetSocketAddress;
        if (this._socket == null || (inetSocketAddress = this._remote) == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public String getRemoteHost() {
        InetSocketAddress inetSocketAddress;
        if (this._socket == null || (inetSocketAddress = this._remote) == null) {
            return null;
        }
        return inetSocketAddress.getAddress().getCanonicalHostName();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public int getRemotePort() {
        if (this._socket == null) {
            return 0;
        }
        InetSocketAddress inetSocketAddress = this._remote;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public Object getTransport() {
        return this._channel;
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public boolean isBlocking() {
        Closeable closeable = this._channel;
        return !(closeable instanceof SelectableChannel) || ((SelectableChannel) closeable).isBlocking();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public boolean isInputShutdown() {
        if (this._ishut || !this._channel.isOpen()) {
            return true;
        }
        Socket socket = this._socket;
        return socket != null && socket.isInputShutdown();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public boolean isOpen() {
        return this._channel.isOpen();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public boolean isOutputShutdown() {
        if (this._oshut || !this._channel.isOpen()) {
            return true;
        }
        Socket socket = this._socket;
        return socket != null && socket.isOutputShutdown();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public void setMaxIdleTime(int i) throws IOException {
        if (this._socket != null && i != this._maxIdleTime) {
            this._socket.setSoTimeout(i > 0 ? i : 0);
        }
        this._maxIdleTime = i;
    }

    public final void shutdownChannelInput() throws IOException {
        Socket socket;
        LOG.debug("ishut {}", this);
        this._ishut = true;
        if (!this._channel.isOpen() || (socket = this._socket) == null) {
            return;
        }
        try {
            if (!socket.isInputShutdown()) {
                this._socket.shutdownInput();
            }
        } catch (SocketException e) {
            Logger logger = LOG;
            logger.debug(e.toString(), new Object[0]);
            logger.ignore(e);
        } finally {
            if (this._oshut) {
                close();
            }
        }
    }

    public final void shutdownChannelOutput() throws IOException {
        Socket socket;
        LOG.debug("oshut {}", this);
        this._oshut = true;
        if (!this._channel.isOpen() || (socket = this._socket) == null) {
            return;
        }
        try {
            if (!socket.isOutputShutdown()) {
                this._socket.shutdownOutput();
            }
        } catch (SocketException e) {
            Logger logger = LOG;
            logger.debug(e.toString(), new Object[0]);
            logger.ignore(e);
        } finally {
            if (this._ishut) {
                close();
            }
        }
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public void shutdownInput() throws IOException {
        shutdownChannelInput();
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public void shutdownOutput() throws IOException {
        shutdownChannelOutput();
    }

    public ChannelEndPoint(ByteChannel byteChannel) throws IOException {
        this._gather2 = new ByteBuffer[2];
        this._channel = byteChannel;
        Socket socket = byteChannel instanceof SocketChannel ? ((SocketChannel) byteChannel).socket() : null;
        this._socket = socket;
        if (socket != null) {
            this._local = (InetSocketAddress) socket.getLocalSocketAddress();
            this._remote = (InetSocketAddress) socket.getRemoteSocketAddress();
            this._maxIdleTime = socket.getSoTimeout();
        } else {
            this._remote = null;
            this._local = null;
        }
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public int flush(Buffer buffer) throws IOException {
        Buffer buffer2 = buffer.buffer();
        if (buffer2 instanceof NIOBuffer) {
            ByteBuffer byteBufferAsReadOnlyBuffer = ((NIOBuffer) buffer2).getByteBuffer().asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.position(buffer.getIndex());
            byteBufferAsReadOnlyBuffer.limit(buffer.putIndex());
            int iWrite = this._channel.write(byteBufferAsReadOnlyBuffer);
            if (iWrite > 0) {
                buffer.skip(iWrite);
            }
            return iWrite;
        }
        if (buffer2 instanceof RandomAccessFileBuffer) {
            int iWriteTo = ((RandomAccessFileBuffer) buffer2).writeTo(this._channel, buffer.getIndex(), buffer.length());
            if (iWriteTo > 0) {
                buffer.skip(iWriteTo);
            }
            return iWriteTo;
        }
        if (buffer.array() != null) {
            int iWrite2 = this._channel.write(ByteBuffer.wrap(buffer.array(), buffer.getIndex(), buffer.length()));
            if (iWrite2 > 0) {
                buffer.skip(iWrite2);
            }
            return iWrite2;
        }
        rhg0.m179353a("Not Implemented");
        return 0;
    }

    @Override // org.eclipse.jetty.p123io.EndPoint
    public void flush() throws IOException {
    }
}

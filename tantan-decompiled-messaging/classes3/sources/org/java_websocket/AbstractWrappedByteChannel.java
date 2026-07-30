package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AbstractWrappedByteChannel implements WrappedByteChannel {
    private final ByteChannel channel;

    public AbstractWrappedByteChannel(ByteChannel byteChannel) {
        this.channel = byteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isBlocking() {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isBlocking();
        }
        return false;
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isNeedRead() {
        ByteChannel byteChannel = this.channel;
        return (byteChannel instanceof WrappedByteChannel) && ((WrappedByteChannel) byteChannel).isNeedRead();
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isNeedWrite() {
        ByteChannel byteChannel = this.channel;
        return (byteChannel instanceof WrappedByteChannel) && ((WrappedByteChannel) byteChannel).isNeedWrite();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.channel.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.channel.read(byteBuffer);
    }

    @Override // org.java_websocket.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) throws IOException {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).readMore(byteBuffer);
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.channel.write(byteBuffer);
    }

    @Override // org.java_websocket.WrappedByteChannel
    public void writeMore() throws IOException {
        ByteChannel byteChannel = this.channel;
        if (byteChannel instanceof WrappedByteChannel) {
            ((WrappedByteChannel) byteChannel).writeMore();
        }
    }

    public AbstractWrappedByteChannel(WrappedByteChannel wrappedByteChannel) {
        this.channel = wrappedByteChannel;
    }
}

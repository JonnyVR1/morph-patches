package org.java_websocket.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import org.java_websocket.AbstractWrappedByteChannel;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractClientProxyChannel extends AbstractWrappedByteChannel {
    protected final ByteBuffer proxyHandshake;

    @Deprecated
    public AbstractClientProxyChannel(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.proxyHandshake = ByteBuffer.wrap(buildHandShake().getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            aag0.m95543a(e);
            throw null;
        }
    }

    @Deprecated
    public abstract String buildHandShake();

    @Override // org.java_websocket.AbstractWrappedByteChannel, java.nio.channels.WritableByteChannel
    @Deprecated
    public int write(ByteBuffer byteBuffer) throws IOException {
        return !this.proxyHandshake.hasRemaining() ? super.write(byteBuffer) : super.write(this.proxyHandshake);
    }
}

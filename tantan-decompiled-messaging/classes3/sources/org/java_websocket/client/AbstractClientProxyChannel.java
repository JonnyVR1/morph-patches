package org.java_websocket.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import l.aag0;
import org.java_websocket.AbstractWrappedByteChannel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Deprecated
public abstract class AbstractClientProxyChannel extends AbstractWrappedByteChannel {
    protected final ByteBuffer proxyHandshake;

    @Deprecated
    public AbstractClientProxyChannel(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.proxyHandshake = ByteBuffer.wrap(buildHandShake().getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            aag0.a(e);
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

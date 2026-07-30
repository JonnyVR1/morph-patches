package org.eclipse.jetty.server.nio;

import java.io.IOException;
import java.nio.channels.Channel;
import java.nio.channels.ServerSocketChannel;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class InheritedChannelConnector extends SelectChannelConnector {
    private static final Logger LOG = Log.getLogger((Class<?>) InheritedChannelConnector.class);

    @Override // org.eclipse.jetty.server.nio.SelectChannelConnector, org.eclipse.jetty.server.Connector
    public void open() throws IOException {
        synchronized (this) {
            try {
                try {
                    Channel channelInheritedChannel = System.inheritedChannel();
                    if (channelInheritedChannel instanceof ServerSocketChannel) {
                        this._acceptChannel = (ServerSocketChannel) channelInheritedChannel;
                    } else {
                        LOG.warn("Unable to use System.inheritedChannel() [" + channelInheritedChannel + "]. Trying a new ServerSocketChannel at " + getHost() + ":" + getPort(), new Object[0]);
                    }
                    ServerSocketChannel serverSocketChannel = this._acceptChannel;
                    if (serverSocketChannel != null) {
                        serverSocketChannel.configureBlocking(true);
                    }
                } catch (NoSuchMethodError unused) {
                    LOG.warn("Need at least Java 5 to use socket inherited from xinetd/inetd.", new Object[0]);
                }
                if (this._acceptChannel == null) {
                    super.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

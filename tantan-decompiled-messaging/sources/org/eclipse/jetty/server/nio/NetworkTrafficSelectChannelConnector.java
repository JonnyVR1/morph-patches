package org.eclipse.jetty.server.nio;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.jetty.p123io.NetworkTrafficListener;
import org.eclipse.jetty.p123io.nio.NetworkTrafficSelectChannelEndPoint;
import org.eclipse.jetty.p123io.nio.SelectChannelEndPoint;
import org.eclipse.jetty.p123io.nio.SelectorManager;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkTrafficSelectChannelConnector extends SelectChannelConnector {
    private final List<NetworkTrafficListener> listeners = new CopyOnWriteArrayList();

    public void addNetworkTrafficListener(NetworkTrafficListener networkTrafficListener) {
        this.listeners.add(networkTrafficListener);
    }

    @Override // org.eclipse.jetty.server.nio.SelectChannelConnector
    public void endPointClosed(SelectChannelEndPoint selectChannelEndPoint) {
        super.endPointClosed(selectChannelEndPoint);
        ((NetworkTrafficSelectChannelEndPoint) selectChannelEndPoint).notifyClosed();
    }

    @Override // org.eclipse.jetty.server.nio.SelectChannelConnector
    public SelectChannelEndPoint newEndPoint(SocketChannel socketChannel, SelectorManager.SelectSet selectSet, SelectionKey selectionKey) throws IOException {
        NetworkTrafficSelectChannelEndPoint networkTrafficSelectChannelEndPoint = new NetworkTrafficSelectChannelEndPoint(socketChannel, selectSet, selectionKey, this._maxIdleTime, this.listeners);
        networkTrafficSelectChannelEndPoint.setConnection(selectSet.getManager().newConnection(socketChannel, networkTrafficSelectChannelEndPoint, selectionKey.attachment()));
        networkTrafficSelectChannelEndPoint.notifyOpened();
        return networkTrafficSelectChannelEndPoint;
    }

    public void removeNetworkTrafficListener(NetworkTrafficListener networkTrafficListener) {
        this.listeners.remove(networkTrafficListener);
    }
}

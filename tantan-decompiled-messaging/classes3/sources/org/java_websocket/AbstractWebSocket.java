package org.java_websocket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;
import org.java_websocket.framing.CloseFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractWebSocket extends WebSocketAdapter {
    private int connectionLostTimeout = 60;
    private Timer connectionLostTimer;
    private TimerTask connectionLostTimerTask;
    private boolean reuseAddr;
    private boolean tcpNoDelay;

    private void cancelConnectionLostTimer() {
        Timer timer = this.connectionLostTimer;
        if (timer != null) {
            timer.cancel();
            this.connectionLostTimer = null;
        }
        TimerTask timerTask = this.connectionLostTimerTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.connectionLostTimerTask = null;
        }
    }

    private void restartConnectionLostTimer() {
        cancelConnectionLostTimer();
        this.connectionLostTimer = new Timer("WebSocketTimer");
        TimerTask timerTask = new TimerTask() { // from class: org.java_websocket.AbstractWebSocket.1
            private ArrayList<WebSocket> connections = new ArrayList<>();

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.connections.clear();
                this.connections.addAll(AbstractWebSocket.this.getConnections());
                long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (AbstractWebSocket.this.connectionLostTimeout * 1500));
                for (WebSocket webSocket : this.connections) {
                    if (webSocket instanceof WebSocketImpl) {
                        WebSocketImpl webSocketImpl = (WebSocketImpl) webSocket;
                        if (webSocketImpl.getLastPong() < jCurrentTimeMillis) {
                            if (WebSocketImpl.DEBUG) {
                                System.out.println("Closing connection due to no pong received: " + webSocket.toString());
                            }
                            webSocketImpl.closeConnection(CloseFrame.ABNORMAL_CLOSE, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
                        } else if (webSocketImpl.isOpen()) {
                            webSocketImpl.sendPing();
                        } else if (WebSocketImpl.DEBUG) {
                            System.out.println("Trying to ping a non open connection: " + webSocket.toString());
                        }
                    }
                }
                this.connections.clear();
            }
        };
        this.connectionLostTimerTask = timerTask;
        Timer timer = this.connectionLostTimer;
        int i = this.connectionLostTimeout;
        timer.scheduleAtFixedRate(timerTask, i * 1000, i * 1000);
    }

    public int getConnectionLostTimeout() {
        return this.connectionLostTimeout;
    }

    public abstract Collection<WebSocket> getConnections();

    public boolean isReuseAddr() {
        return this.reuseAddr;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public void setConnectionLostTimeout(int i) {
        this.connectionLostTimeout = i;
        if (i <= 0) {
            stopConnectionLostTimer();
        }
        if (this.connectionLostTimer == null && this.connectionLostTimerTask == null) {
            return;
        }
        if (WebSocketImpl.DEBUG) {
            System.out.println("Connection lost timer restarted");
        }
        restartConnectionLostTimer();
    }

    public void setReuseAddr(boolean z) {
        this.reuseAddr = z;
    }

    public void setTcpNoDelay(boolean z) {
        this.tcpNoDelay = z;
    }

    public void startConnectionLostTimer() {
        if (this.connectionLostTimeout <= 0) {
            if (WebSocketImpl.DEBUG) {
                System.out.println("Connection lost timer deactivated");
            }
        } else {
            if (WebSocketImpl.DEBUG) {
                System.out.println("Connection lost timer started");
            }
            restartConnectionLostTimer();
        }
    }

    public void stopConnectionLostTimer() {
        if (this.connectionLostTimer == null && this.connectionLostTimerTask == null) {
            return;
        }
        if (WebSocketImpl.DEBUG) {
            System.out.println("Connection lost timer stopped");
        }
        cancelConnectionLostTimer();
    }
}

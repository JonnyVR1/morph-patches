package org.eclipse.jetty.p123io;

/* JADX INFO: loaded from: classes3.dex */
public interface ConnectedEndPoint extends EndPoint {
    Connection getConnection();

    void setConnection(Connection connection);
}

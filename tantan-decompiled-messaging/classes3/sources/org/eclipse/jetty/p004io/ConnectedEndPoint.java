package org.eclipse.jetty.p004io;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ConnectedEndPoint extends EndPoint {
    Connection getConnection();

    void setConnection(Connection connection);
}

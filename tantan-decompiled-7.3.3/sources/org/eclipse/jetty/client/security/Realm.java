package org.eclipse.jetty.client.security;

/* JADX INFO: loaded from: classes2.dex */
public interface Realm {
    String getCredentials();

    String getId();

    String getPrincipal();
}

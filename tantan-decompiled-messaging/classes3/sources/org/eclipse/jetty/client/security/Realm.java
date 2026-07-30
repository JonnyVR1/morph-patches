package org.eclipse.jetty.client.security;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface Realm {
    String getCredentials();

    String getId();

    String getPrincipal();
}

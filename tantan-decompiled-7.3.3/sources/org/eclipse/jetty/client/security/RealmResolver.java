package org.eclipse.jetty.client.security;

import java.io.IOException;
import org.eclipse.jetty.client.HttpDestination;

/* JADX INFO: loaded from: classes2.dex */
public interface RealmResolver {
    Realm getRealm(String str, HttpDestination httpDestination, String str2) throws IOException;
}

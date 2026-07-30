package org.spongycastle.crypto;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface KeyParser {
    AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException;
}

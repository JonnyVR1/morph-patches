package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class DigestInputBuffer extends ByteArrayOutputStream {
    public void updateDigest(Digest digest) {
        digest.update(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
    }
}

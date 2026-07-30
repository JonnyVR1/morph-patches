package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Shorts;
import p153l.m5j;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
class DeferredHash implements TlsHandshakeHash {
    protected static final int BUFFERING_HASH_LIMIT = 4;
    private DigestInputBuffer buf;
    protected TlsContext context;
    private Hashtable hashes;
    private Short prfHashAlgorithm;

    public DeferredHash() {
        this.buf = new DigestInputBuffer();
        this.hashes = new Hashtable();
        this.prfHashAlgorithm = null;
    }

    public void checkStopBuffering() {
        if (this.buf == null || this.hashes.size() > 4) {
            return;
        }
        Enumeration enumerationElements = this.hashes.elements();
        while (enumerationElements.hasMoreElements()) {
            this.buf.updateDigest((Digest) enumerationElements.nextElement());
        }
        this.buf = null;
    }

    public void checkTrackingHash(Short sh) {
        if (this.hashes.containsKey(sh)) {
            return;
        }
        this.hashes.put(sh, TlsUtils.createHash(sh.shortValue()));
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public Digest forkPRFHash() {
        checkStopBuffering();
        DigestInputBuffer digestInputBuffer = this.buf;
        Short sh = this.prfHashAlgorithm;
        if (digestInputBuffer == null) {
            return TlsUtils.cloneHash(sh.shortValue(), (Digest) this.hashes.get(this.prfHashAlgorithm));
        }
        Digest digestCreateHash = TlsUtils.createHash(sh.shortValue());
        this.buf.updateDigest(digestCreateHash);
        return digestCreateHash;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public byte[] getFinalHash(short s) {
        Digest digest = (Digest) this.hashes.get(Shorts.valueOf(s));
        if (digest == null) {
            m5j.m157106a("HashAlgorithm.", HashAlgorithm.getText(s), " is not being tracked");
            return null;
        }
        Digest digestCloneHash = TlsUtils.cloneHash(s, digest);
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.updateDigest(digestCloneHash);
        }
        byte[] bArr = new byte[digestCloneHash.getDigestSize()];
        digestCloneHash.doFinal(bArr, 0);
        return bArr;
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public void init(TlsContext tlsContext) {
        this.context = tlsContext;
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public TlsHandshakeHash notifyPRFDetermined() {
        int prfAlgorithm = this.context.getSecurityParameters().getPrfAlgorithm();
        if (prfAlgorithm == 0) {
            CombinedHash combinedHash = new CombinedHash();
            combinedHash.init(this.context);
            this.buf.updateDigest(combinedHash);
            return combinedHash.notifyPRFDetermined();
        }
        Short shValueOf = Shorts.valueOf(TlsUtils.getHashAlgorithmForPRFAlgorithm(prfAlgorithm));
        this.prfHashAlgorithm = shValueOf;
        checkTrackingHash(shValueOf);
        return this;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.reset();
            return;
        }
        Enumeration enumerationElements = this.hashes.elements();
        while (enumerationElements.hasMoreElements()) {
            ((Digest) enumerationElements.nextElement()).reset();
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public void sealHashAlgorithms() {
        checkStopBuffering();
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public TlsHandshakeHash stopTracking() {
        Digest digestCloneHash = TlsUtils.cloneHash(this.prfHashAlgorithm.shortValue(), (Digest) this.hashes.get(this.prfHashAlgorithm));
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.updateDigest(digestCloneHash);
        }
        DeferredHash deferredHash = new DeferredHash(this.prfHashAlgorithm, digestCloneHash);
        deferredHash.init(this.context);
        return deferredHash;
    }

    @Override // org.spongycastle.crypto.tls.TlsHandshakeHash
    public void trackHashAlgorithm(short s) {
        if (this.buf != null) {
            checkTrackingHash(Shorts.valueOf(s));
        } else {
            wtq0.m207906a("Too late to track more hash algorithms");
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) throws IOException {
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.write(b);
            return;
        }
        Enumeration enumerationElements = this.hashes.elements();
        while (enumerationElements.hasMoreElements()) {
            ((Digest) enumerationElements.nextElement()).update(b);
        }
    }

    private DeferredHash(Short sh, Digest digest) {
        this.buf = null;
        Hashtable hashtable = new Hashtable();
        this.hashes = hashtable;
        this.prfHashAlgorithm = sh;
        hashtable.put(sh, digest);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) throws IOException {
        DigestInputBuffer digestInputBuffer = this.buf;
        if (digestInputBuffer != null) {
            digestInputBuffer.write(bArr, i, i2);
            return;
        }
        Enumeration enumerationElements = this.hashes.elements();
        while (enumerationElements.hasMoreElements()) {
            ((Digest) enumerationElements.nextElement()).update(bArr, i, i2);
        }
    }
}

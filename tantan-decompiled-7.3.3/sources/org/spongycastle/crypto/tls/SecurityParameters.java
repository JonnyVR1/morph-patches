package org.spongycastle.crypto.tls;

import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SecurityParameters {
    int entity = -1;
    int cipherSuite = -1;
    short compressionAlgorithm = 0;
    int prfAlgorithm = -1;
    int verifyDataLength = -1;
    byte[] masterSecret = null;
    byte[] clientRandom = null;
    byte[] serverRandom = null;
    byte[] sessionHash = null;
    byte[] pskIdentity = null;
    byte[] srpIdentity = null;
    short maxFragmentLength = -1;
    boolean truncatedHMac = false;
    boolean encryptThenMAC = false;
    boolean extendedMasterSecret = false;

    public void clear() {
        byte[] bArr = this.masterSecret;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.masterSecret = null;
        }
    }

    public int getCipherSuite() {
        return this.cipherSuite;
    }

    public byte[] getClientRandom() {
        return this.clientRandom;
    }

    public short getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public int getEntity() {
        return this.entity;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public byte[] getPSKIdentity() {
        return this.pskIdentity;
    }

    public int getPrfAlgorithm() {
        return this.prfAlgorithm;
    }

    public byte[] getPskIdentity() {
        return this.pskIdentity;
    }

    public byte[] getSRPIdentity() {
        return this.srpIdentity;
    }

    public byte[] getServerRandom() {
        return this.serverRandom;
    }

    public byte[] getSessionHash() {
        return this.sessionHash;
    }

    public int getVerifyDataLength() {
        return this.verifyDataLength;
    }
}

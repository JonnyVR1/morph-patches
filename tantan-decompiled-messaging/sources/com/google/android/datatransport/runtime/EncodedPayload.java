package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;
import p149l.jfd0;

/* JADX INFO: loaded from: classes6.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final Encoding encoding;

    public EncodedPayload(@NonNull Encoding encoding, @NonNull byte[] bArr) {
        if (encoding == null) {
            jfd0.m141176a("encoding is null");
            throw null;
        }
        if (bArr == null) {
            jfd0.m141176a("bytes is null");
            throw null;
        }
        this.encoding = encoding;
        this.bytes = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.encoding.equals(encodedPayload.encoding)) {
            return Arrays.equals(this.bytes, encodedPayload.bytes);
        }
        return false;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes) ^ ((this.encoding.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.encoding + ", bytes=[...]}";
    }
}

package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class xq3 implements rvc0<byte[]> {

    /* JADX INFO: renamed from: a */
    private final byte[] f193979a;

    public xq3(byte[] bArr) {
        this.f193979a = (byte[]) qf80.m174276d(bArr);
    }

    @Override // p149l.rvc0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f193979a;
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    @Override // p149l.rvc0
    public int getSize() {
        return this.f193979a.length;
    }

    @Override // p149l.rvc0
    public void recycle() {
    }
}

package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class wr3 implements u3d0<byte[]> {

    /* JADX INFO: renamed from: a */
    private final byte[] f190466a;

    public wr3(byte[] bArr) {
        this.f190466a = (byte[]) vn80.m201944d(bArr);
    }

    @Override // p153l.u3d0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f190466a;
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    @Override // p153l.u3d0
    public int getSize() {
        return this.f190466a.length;
    }

    @Override // p153l.u3d0
    public void recycle() {
    }
}

package p153l;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class gvr0 implements vur0 {

    /* JADX INFO: renamed from: a */
    public final FileChannel f106676a;

    /* JADX INFO: renamed from: b */
    public final long f106677b;

    /* JADX INFO: renamed from: c */
    public final long f106678c;

    public gvr0(FileChannel fileChannel, long j, long j2) {
        this.f106676a = fileChannel;
        this.f106677b = j;
        this.f106678c = j2;
    }

    @Override // p153l.vur0
    /* JADX INFO: renamed from: a */
    public final void mo132579a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f106676a.map(FileChannel.MapMode.READ_ONLY, this.f106677b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // p153l.vur0
    public final long zza() {
        return this.f106678c;
    }
}

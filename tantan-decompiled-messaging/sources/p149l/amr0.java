package p149l;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class amr0 implements plr0 {

    /* JADX INFO: renamed from: a */
    public final FileChannel f70673a;

    /* JADX INFO: renamed from: b */
    public final long f70674b;

    /* JADX INFO: renamed from: c */
    public final long f70675c;

    public amr0(FileChannel fileChannel, long j, long j2) {
        this.f70673a = fileChannel;
        this.f70674b = j;
        this.f70675c = j2;
    }

    @Override // p149l.plr0
    /* JADX INFO: renamed from: a */
    public final void mo97685a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f70673a.map(FileChannel.MapMode.READ_ONLY, this.f70674b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // p149l.plr0
    public final long zza() {
        return this.f70675c;
    }
}

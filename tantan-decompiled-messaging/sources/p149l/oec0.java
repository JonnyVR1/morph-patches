package p149l;

import okio.BufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class oec0 extends gxc0 {

    /* JADX INFO: renamed from: a */
    public final String f143300a;

    /* JADX INFO: renamed from: b */
    public final long f143301b;

    /* JADX INFO: renamed from: c */
    public final BufferedSource f143302c;

    public oec0(String str, long j, BufferedSource bufferedSource) {
        this.f143300a = str;
        this.f143301b = j;
        this.f143302c = bufferedSource;
    }

    @Override // p149l.gxc0
    public long contentLength() {
        return this.f143301b;
    }

    @Override // p149l.gxc0
    public hyx contentType() {
        String str = this.f143300a;
        if (str != null) {
            return hyx.m133628d(str);
        }
        return null;
    }

    @Override // p149l.gxc0
    public BufferedSource source() {
        return this.f143302c;
    }
}

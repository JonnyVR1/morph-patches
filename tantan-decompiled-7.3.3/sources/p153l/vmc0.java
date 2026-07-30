package p153l;

import okio.BufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class vmc0 extends k5d0 {

    /* JADX INFO: renamed from: a */
    public final String f184687a;

    /* JADX INFO: renamed from: b */
    public final long f184688b;

    /* JADX INFO: renamed from: c */
    public final BufferedSource f184689c;

    public vmc0(String str, long j, BufferedSource bufferedSource) {
        this.f184687a = str;
        this.f184688b = j;
        this.f184689c = bufferedSource;
    }

    @Override // p153l.k5d0
    public long contentLength() {
        return this.f184688b;
    }

    @Override // p153l.k5d0
    public e7y contentType() {
        String str = this.f184687a;
        if (str != null) {
            return e7y.m119773d(str);
        }
        return null;
    }

    @Override // p153l.k5d0
    public BufferedSource source() {
        return this.f184689c;
    }
}

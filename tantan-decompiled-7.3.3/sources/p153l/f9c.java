package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class f9c {

    /* JADX INFO: renamed from: b */
    public static final Long f97854b = 86400000L;

    /* JADX INFO: renamed from: a */
    public final byd0 f97855a;

    public f9c(@NonNull String str, long j, boolean z) {
        this.f97855a = new byd0(str + (z ? "" : zrv.f205799a.m207631D0()), Long.valueOf(j), false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m124632a(int i) {
        return pzi0.m174454o() - this.f97855a.get().longValue() >= ((long) i) * f97854b.longValue();
    }

    /* JADX INFO: renamed from: b */
    public void m124633b() {
        this.f97855a.put(Long.valueOf(pzi0.m174454o()));
    }
}

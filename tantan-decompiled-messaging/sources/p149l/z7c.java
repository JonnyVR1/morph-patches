package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class z7c {

    /* JADX INFO: renamed from: b */
    public static final Long f201996b = 86400000L;

    /* JADX INFO: renamed from: a */
    public final zpd0 f201997a;

    public z7c(@NonNull String str, long j, boolean z) {
        this.f201997a = new zpd0(str + (z ? "" : ypv.f199493a.m199309D0()), Long.valueOf(j), false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m217451a(int i) {
        return mqi0.m155944o() - this.f201997a.get().longValue() >= ((long) i) * f201996b.longValue();
    }

    /* JADX INFO: renamed from: b */
    public void m217452b() {
        this.f201997a.put(Long.valueOf(mqi0.m155944o()));
    }
}

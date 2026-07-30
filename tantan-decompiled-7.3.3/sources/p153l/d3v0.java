package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class d3v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f84950a;

    public d3v0(kqx0 kqx0Var) {
        this.f84950a = kqx0Var;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.f84950a.zzb()).getApplicationInfo();
        cqx0.m111999b(applicationInfo);
        return applicationInfo;
    }
}

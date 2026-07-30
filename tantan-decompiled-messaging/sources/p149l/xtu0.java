package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class xtu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f194437a;

    public xtu0(ehx0 ehx0Var) {
        this.f194437a = ehx0Var;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.f194437a.zzb()).getApplicationInfo();
        wgx0.m203089b(applicationInfo);
        return applicationInfo;
    }
}

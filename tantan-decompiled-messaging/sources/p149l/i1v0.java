package p149l;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;

/* JADX INFO: loaded from: classes6.dex */
public final class i1v0 extends l2v0 {

    /* JADX INFO: renamed from: a */
    public Activity f110502a;

    /* JADX INFO: renamed from: b */
    public BinderC2073b f110503b;

    /* JADX INFO: renamed from: c */
    public String f110504c;

    /* JADX INFO: renamed from: d */
    public String f110505d;

    @Override // p149l.l2v0
    /* JADX INFO: renamed from: a */
    public final l2v0 mo134009a(Activity activity) {
        if (activity != null) {
            this.f110502a = activity;
            return this;
        }
        jfd0.m141176a("Null activity");
        return null;
    }

    @Override // p149l.l2v0
    /* JADX INFO: renamed from: b */
    public final l2v0 mo134010b(@Nullable BinderC2073b binderC2073b) {
        this.f110503b = binderC2073b;
        return this;
    }

    @Override // p149l.l2v0
    /* JADX INFO: renamed from: c */
    public final l2v0 mo134011c(@Nullable String str) {
        this.f110504c = str;
        return this;
    }

    @Override // p149l.l2v0
    /* JADX INFO: renamed from: d */
    public final l2v0 mo134012d(@Nullable String str) {
        this.f110505d = str;
        return this;
    }

    @Override // p149l.l2v0
    /* JADX INFO: renamed from: e */
    public final m2v0 mo134013e() {
        Activity activity = this.f110502a;
        if (activity != null) {
            return new k1v0(activity, this.f110503b, this.f110504c, this.f110505d, null);
        }
        qkq0.m175383a("Missing required properties: activity");
        return null;
    }
}

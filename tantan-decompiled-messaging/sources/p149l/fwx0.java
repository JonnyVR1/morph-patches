package p149l;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class fwx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f99696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f99697b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f99698c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f99699d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f99700e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f99701f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f99702g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f99703h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2458g f99704i;

    public fwx0(C2458g c2458g, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f99696a = str;
        this.f99697b = str2;
        this.f99698c = j;
        this.f99699d = bundle;
        this.f99700e = z;
        this.f99701f = z2;
        this.f99702g = z3;
        this.f99703h = str3;
        this.f99704i = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99704i.m15198W(this.f99696a, this.f99697b, this.f99698c, this.f99699d, this.f99700e, this.f99701f, this.f99702g, this.f99703h);
    }
}

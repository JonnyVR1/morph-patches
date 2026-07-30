package p153l;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C2481g;

/* JADX INFO: loaded from: classes6.dex */
public final class l5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f130200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f130201b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f130202c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f130203d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f130204e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f130205f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f130206g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f130207h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2481g f130208i;

    public l5y0(C2481g c2481g, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f130200a = str;
        this.f130201b = str2;
        this.f130202c = j;
        this.f130203d = bundle;
        this.f130204e = z;
        this.f130205f = z2;
        this.f130206g = z3;
        this.f130207h = str3;
        this.f130208i = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f130208i.m15252W(this.f130200a, this.f130201b, this.f130202c, this.f130203d, this.f130204e, this.f130205f, this.f130206g, this.f130207h);
    }
}

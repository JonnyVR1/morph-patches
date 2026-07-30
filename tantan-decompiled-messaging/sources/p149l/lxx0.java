package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class lxx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f130455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f130456b = null;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f130457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f130458d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f130459e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2458g f130460f;

    public lxx0(C2458g c2458g, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f130455a = atomicReference;
        this.f130457c = str2;
        this.f130458d = str3;
        this.f130459e = z;
        this.f130460f = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f130460f.f165891a.m194104E().m100136E(this.f130455a, null, this.f130457c, this.f130458d, this.f130459e);
    }
}

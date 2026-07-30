package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class r6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f161519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f161520b = null;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f161521c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f161522d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f161523e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2481g f161524f;

    public r6y0(C2481g c2481g, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f161519a = atomicReference;
        this.f161521c = str2;
        this.f161522d = str3;
        this.f161523e = z;
        this.f161524f = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f161524f.f202159a.m100284E().m134536E(this.f161519a, null, this.f161521c, this.f161522d, this.f161523e);
    }
}

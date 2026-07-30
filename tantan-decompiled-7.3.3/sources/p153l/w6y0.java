package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class w6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f187661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f187662b = null;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f187663c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f187664d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2481g f187665e;

    public w6y0(C2481g c2481g, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f187661a = atomicReference;
        this.f187663c = str2;
        this.f187664d = str3;
        this.f187665e = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f187665e.f202159a.m100284E().m134535D(this.f187661a, null, this.f187663c, this.f187664d);
    }
}

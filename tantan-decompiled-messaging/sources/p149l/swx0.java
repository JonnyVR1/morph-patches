package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class swx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f166761a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f166762b;

    public swx0(C2458g c2458g, long j) {
        this.f166761a = j;
        this.f166762b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f166762b.m15176G0(this.f166761a);
        this.f166762b.mo15098n().m100133B(new AtomicReference<>());
    }
}

package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class qxx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f156879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f156880b = null;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f156881c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f156882d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2458g f156883e;

    public qxx0(C2458g c2458g, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f156879a = atomicReference;
        this.f156881c = str2;
        this.f156882d = str3;
        this.f156883e = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f156883e.f165891a.m194104E().m100135D(this.f156879a, null, this.f156881c, this.f156882d);
    }
}

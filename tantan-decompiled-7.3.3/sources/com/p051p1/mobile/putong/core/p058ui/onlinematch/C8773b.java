package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.l51;
import p153l.pq2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8773b extends pq2 {

    /* JADX INFO: renamed from: b */
    public a f33523b;

    /* JADX INFO: renamed from: c */
    public Runnable f33524c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo51472a();
    }

    public C8773b(a aVar) {
        super(Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        this.f33524c = new Runnable() { // from class: l.sv50
            @Override // java.lang.Runnable
            public final void run() {
                this.f170808a.m51469b();
            }
        };
        this.f33523b = aVar;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m51469b() {
        this.f33523b.mo51472a();
    }

    /* JADX INFO: renamed from: c */
    public void m51470c() {
        l51.m152890J(this.f33524c);
        l51.m152888H(CoreModule.f18263b, this.f33524c, this.f153617a);
    }

    /* JADX INFO: renamed from: d */
    public void m51471d() {
        l51.m152890J(this.f33524c);
    }

    public C8773b(a aVar, long j) {
        super(j);
        this.f33524c = new Runnable() { // from class: l.sv50
            @Override // java.lang.Runnable
            public final void run() {
                this.f170808a.m51469b();
            }
        };
        this.f33523b = aVar;
    }
}

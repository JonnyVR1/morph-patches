package com.p046p1.mobile.putong.core.p053ui.onlinematch;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.e51;
import p149l.yp2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8610b extends yp2 {

    /* JADX INFO: renamed from: b */
    public a f32675b;

    /* JADX INFO: renamed from: c */
    public Runnable f32676c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo50289a();
    }

    public C8610b(a aVar) {
        super(Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        this.f32676c = new Runnable() { // from class: l.mn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f134740a.m50286b();
            }
        };
        this.f32675b = aVar;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m50286b() {
        this.f32675b.mo50289a();
    }

    /* JADX INFO: renamed from: c */
    public void m50287c() {
        e51.m114745J(this.f32676c);
        e51.m114743H(CoreModule.f17544b, this.f32676c, this.f199384a);
    }

    /* JADX INFO: renamed from: d */
    public void m50288d() {
        e51.m114745J(this.f32676c);
    }

    public C8610b(a aVar, long j) {
        super(j);
        this.f32676c = new Runnable() { // from class: l.mn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f134740a.m50286b();
            }
        };
        this.f32675b = aVar;
    }
}

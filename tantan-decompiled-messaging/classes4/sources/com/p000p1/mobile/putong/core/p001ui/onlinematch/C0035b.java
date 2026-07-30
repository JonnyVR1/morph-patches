package com.p000p1.mobile.putong.core.p001ui.onlinematch;

import com.p1.mobile.putong.core.CoreModule;
import l.e51;
import p002l.yp2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0035b extends yp2 {

    /* JADX INFO: renamed from: b */
    public a f497b;

    /* JADX INFO: renamed from: c */
    public Runnable f498c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo720a();
    }

    public C0035b(a aVar) {
        super(300000L);
        this.f498c = new Runnable() { // from class: l.mn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f15491a.m717b();
            }
        };
        this.f497b = aVar;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m717b() {
        this.f497b.mo720a();
    }

    /* JADX INFO: renamed from: c */
    public void m718c() {
        e51.J(this.f498c);
        e51.H(CoreModule.b, this.f498c, this.f23013a);
    }

    /* JADX INFO: renamed from: d */
    public void m719d() {
        e51.J(this.f498c);
    }

    public C0035b(a aVar, long j) {
        super(j);
        this.f498c = new Runnable() { // from class: l.mn50
            @Override // java.lang.Runnable
            public final void run() {
                this.f15491a.m717b();
            }
        };
        this.f497b = aVar;
    }
}

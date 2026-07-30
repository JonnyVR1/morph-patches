package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call;

import java.util.ArrayList;
import p002l.mee0;
import p002l.nec0;
import p002l.s460;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.call.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0475a extends mee0 {

    /* JADX INFO: renamed from: e */
    public volatile s460 f7258e;

    /* JADX INFO: renamed from: f */
    public long f7259f;

    public AbstractC0475a(Object obj, long j) {
        super(obj);
        this.f7259f = j;
    }

    @Override // p002l.mee0, com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo9128e() throws Exception {
        ArrayList arrayList = new ArrayList(this.f7256b.m17154j());
        arrayList.add(this.f7256b.m17146b());
        arrayList.add(this.f7256b.m17155k());
        new nec0().m18696d(this.f7256b, arrayList, 0, m9129f(), this).mo18693a(m9129f());
    }

    /* JADX INFO: renamed from: h */
    public s460 m9130h() throws Exception {
        s460 s460Var;
        synchronized (this) {
            try {
                try {
                    if (this.f7258e == null) {
                        wait(this.f7259f);
                    }
                    if (this.f7258e == null) {
                        throw new RealCall.TimeoutException("get ack fail");
                    }
                    s460Var = this.f7258e;
                } catch (InterruptedException unused) {
                    throw new RealCall.TimeoutException("get ack time out");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s460Var;
    }

    /* JADX INFO: renamed from: i */
    public void m9131i(s460 s460Var) {
        synchronized (this) {
            this.f7258e = s460Var;
            notifyAll();
        }
    }
}

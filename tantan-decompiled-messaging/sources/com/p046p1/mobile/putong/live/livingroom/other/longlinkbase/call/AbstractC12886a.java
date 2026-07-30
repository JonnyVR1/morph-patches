package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call;

import java.util.ArrayList;
import p149l.mee0;
import p149l.nec0;
import p149l.s460;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.call.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12886a extends mee0 {

    /* JADX INFO: renamed from: e */
    public volatile s460 f51216e;

    /* JADX INFO: renamed from: f */
    public long f51217f;

    public AbstractC12886a(Object obj, long j) {
        super(obj);
        this.f51217f = j;
    }

    @Override // p149l.mee0, com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo75493e() throws Exception {
        ArrayList arrayList = new ArrayList(this.f51214b.m149496j());
        arrayList.add(this.f51214b.m149488b());
        arrayList.add(this.f51214b.m149497k());
        new nec0().m159108d(this.f51214b, arrayList, 0, m75494f(), this).mo159105a(m75494f());
    }

    /* JADX INFO: renamed from: h */
    public s460 m75495h() throws Exception {
        s460 s460Var;
        synchronized (this) {
            try {
                try {
                    if (this.f51216e == null) {
                        wait(this.f51217f);
                    }
                    if (this.f51216e == null) {
                        throw new RealCall.TimeoutException("get ack fail");
                    }
                    s460Var = this.f51216e;
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
    public void m75496i(s460 s460Var) {
        synchronized (this) {
            this.f51216e = s460Var;
            notifyAll();
        }
    }
}

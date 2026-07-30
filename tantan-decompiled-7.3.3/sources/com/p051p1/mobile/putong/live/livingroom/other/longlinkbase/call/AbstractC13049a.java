package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call;

import java.util.ArrayList;
import p153l.rme0;
import p153l.umc0;
import p153l.yc60;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.call.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13049a extends rme0 {

    /* JADX INFO: renamed from: e */
    public volatile yc60 f52064e;

    /* JADX INFO: renamed from: f */
    public long f52065f;

    public AbstractC13049a(Object obj, long j) {
        super(obj);
        this.f52065f = j;
    }

    @Override // p153l.rme0, com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo76676e() throws Exception {
        ArrayList arrayList = new ArrayList(this.f52062b.m186792j());
        arrayList.add(this.f52062b.m186784b());
        arrayList.add(this.f52062b.m186793k());
        new umc0().m196645d(this.f52062b, arrayList, 0, m76677f(), this).mo196642a(m76677f());
    }

    /* JADX INFO: renamed from: h */
    public yc60 m76678h() throws Exception {
        yc60 yc60Var;
        synchronized (this) {
            try {
                try {
                    if (this.f52064e == null) {
                        wait(this.f52065f);
                    }
                    if (this.f52064e == null) {
                        throw new RealCall.TimeoutException("get ack fail");
                    }
                    yc60Var = this.f52064e;
                } catch (InterruptedException unused) {
                    throw new RealCall.TimeoutException("get ack time out");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yc60Var;
    }

    /* JADX INFO: renamed from: i */
    public void m76679i(yc60 yc60Var) {
        synchronized (this) {
            this.f52064e = yc60Var;
            notifyAll();
        }
    }
}

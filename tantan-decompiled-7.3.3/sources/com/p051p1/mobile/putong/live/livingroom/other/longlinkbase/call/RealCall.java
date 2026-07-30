package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call;

import java.io.IOException;
import java.util.ArrayList;
import p153l.qy3;
import p153l.smc0;
import p153l.umc0;
import p153l.yc60;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RealCall implements qy3 {

    /* JADX INFO: renamed from: a */
    public boolean f52061a = false;

    /* JADX INFO: renamed from: b */
    public smc0 f52062b;

    /* JADX INFO: renamed from: c */
    public yc60 f52063c;

    public static class TimeoutException extends IOException {
        public TimeoutException(String str) {
            super(str);
        }
    }

    @Override // p153l.qy3
    /* JADX INFO: renamed from: a */
    public void mo76672a(smc0 smc0Var) {
        this.f52062b = smc0Var;
        smc0Var.m186786d().m188945d(this);
    }

    /* JADX INFO: renamed from: b */
    public void m76673b() {
        this.f52061a = false;
    }

    /* JADX INFO: renamed from: c */
    public smc0 m76674c() {
        return this.f52062b;
    }

    /* JADX INFO: renamed from: d */
    public abstract yc60 mo76675d();

    /* JADX INFO: renamed from: e */
    public void mo76676e() throws Exception {
        new umc0().m196645d(this.f52062b, new ArrayList(this.f52062b.m186792j()), 0, m76677f(), this).mo196642a(m76677f());
    }

    @Override // p153l.qy3
    public void execute() throws Exception {
        synchronized (this) {
            if (this.f52061a) {
                throw new IllegalStateException("Already Executed");
            }
            this.f52061a = true;
        }
        this.f52063c = mo76675d();
        mo76676e();
    }

    /* JADX INFO: renamed from: f */
    public yc60 m76677f() {
        return this.f52063c;
    }
}

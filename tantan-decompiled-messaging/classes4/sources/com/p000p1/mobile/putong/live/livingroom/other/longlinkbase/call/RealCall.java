package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call;

import java.io.IOException;
import java.util.ArrayList;
import p002l.lec0;
import p002l.nec0;
import p002l.rx3;
import p002l.s460;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class RealCall implements rx3 {

    /* JADX INFO: renamed from: a */
    public boolean f7255a = false;

    /* JADX INFO: renamed from: b */
    public lec0 f7256b;

    /* JADX INFO: renamed from: c */
    public s460 f7257c;

    public static class TimeoutException extends IOException {
        public TimeoutException(String str) {
            super(str);
        }
    }

    @Override // p002l.rx3
    /* JADX INFO: renamed from: a */
    public void mo9124a(lec0 lec0Var) {
        this.f7256b = lec0Var;
        lec0Var.m17148d().m23251d(this);
    }

    /* JADX INFO: renamed from: b */
    public void m9125b() {
        this.f7255a = false;
    }

    /* JADX INFO: renamed from: c */
    public lec0 m9126c() {
        return this.f7256b;
    }

    /* JADX INFO: renamed from: d */
    public abstract s460 mo9127d();

    /* JADX INFO: renamed from: e */
    public void mo9128e() throws Exception {
        new nec0().m18696d(this.f7256b, new ArrayList(this.f7256b.m17154j()), 0, m9129f(), this).mo18693a(m9129f());
    }

    @Override // p002l.rx3
    public void execute() throws Exception {
        synchronized (this) {
            if (this.f7255a) {
                throw new IllegalStateException("Already Executed");
            }
            this.f7255a = true;
        }
        this.f7257c = mo9127d();
        mo9128e();
    }

    /* JADX INFO: renamed from: f */
    public s460 m9129f() {
        return this.f7257c;
    }
}

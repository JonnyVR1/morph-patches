package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call;

import java.io.IOException;
import java.util.ArrayList;
import p149l.lec0;
import p149l.nec0;
import p149l.rx3;
import p149l.s460;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RealCall implements rx3 {

    /* JADX INFO: renamed from: a */
    public boolean f51213a = false;

    /* JADX INFO: renamed from: b */
    public lec0 f51214b;

    /* JADX INFO: renamed from: c */
    public s460 f51215c;

    public static class TimeoutException extends IOException {
        public TimeoutException(String str) {
            super(str);
        }
    }

    @Override // p149l.rx3
    /* JADX INFO: renamed from: a */
    public void mo75489a(lec0 lec0Var) {
        this.f51214b = lec0Var;
        lec0Var.m149490d().m191407d(this);
    }

    /* JADX INFO: renamed from: b */
    public void m75490b() {
        this.f51213a = false;
    }

    /* JADX INFO: renamed from: c */
    public lec0 m75491c() {
        return this.f51214b;
    }

    /* JADX INFO: renamed from: d */
    public abstract s460 mo75492d();

    /* JADX INFO: renamed from: e */
    public void mo75493e() throws Exception {
        new nec0().m159108d(this.f51214b, new ArrayList(this.f51214b.m149496j()), 0, m75494f(), this).mo159105a(m75494f());
    }

    @Override // p149l.rx3
    public void execute() throws Exception {
        synchronized (this) {
            if (this.f51213a) {
                throw new IllegalStateException("Already Executed");
            }
            this.f51213a = true;
        }
        this.f51215c = mo75492d();
        mo75493e();
    }

    /* JADX INFO: renamed from: f */
    public s460 m75494f() {
        return this.f51215c;
    }
}

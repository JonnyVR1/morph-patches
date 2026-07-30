package com.tantanapp.beatles.fpsmonitor;

import android.app.Activity;
import android.os.Looper;
import android.view.Choreographer;
import p153l.f610;
import p153l.zy0;

/* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.a */
/* JADX INFO: loaded from: classes11.dex */
public class ChoreographerFrameCallbackC13717a implements Choreographer.FrameCallback, zy0.InterfaceC21927a {

    /* JADX INFO: renamed from: g */
    public static ChoreographerFrameCallbackC13717a f56802g;

    /* JADX INFO: renamed from: a */
    public boolean f56803a;

    /* JADX INFO: renamed from: b */
    public Choreographer f56804b;

    /* JADX INFO: renamed from: d */
    public long f56806d;

    /* JADX INFO: renamed from: e */
    public a f56807e;

    /* JADX INFO: renamed from: c */
    public volatile boolean f56805c = true;

    /* JADX INFO: renamed from: f */
    public boolean f56808f = false;

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo82317a();

        void doFrame(long j);

        void pause();
    }

    /* JADX INFO: renamed from: e */
    public static ChoreographerFrameCallbackC13717a m82339e() {
        if (f56802g == null) {
            f56802g = new ChoreographerFrameCallbackC13717a();
        }
        return f56802g;
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: a */
    public void mo82235a(Activity activity) {
        Choreographer choreographer;
        this.f56808f = false;
        a aVar = this.f56807e;
        if (aVar == null || !aVar.mo82317a() || (choreographer = this.f56804b) == null) {
            return;
        }
        choreographer.removeFrameCallback(this);
        this.f56804b.postFrameCallback(this);
        this.f56806d = 0L;
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: b */
    public void mo82236b(boolean z) {
        if (z) {
            return;
        }
        m82345k();
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: c */
    public void mo82237c(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    /* JADX INFO: renamed from: d */
    public void mo82238d(Activity activity) {
        this.f56808f = true;
        a aVar = this.f56807e;
        if (aVar != null) {
            aVar.pause();
            Choreographer choreographer = this.f56804b;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
                this.f56806d = 0L;
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f56805c || this.f56808f) {
            return;
        }
        long j2 = this.f56806d;
        if (j < j2 || j2 <= 0) {
            this.f56806d = j;
            Choreographer choreographer = this.f56804b;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
                return;
            }
            return;
        }
        a aVar = this.f56807e;
        if (aVar != null) {
            aVar.doFrame(j);
            Choreographer choreographer2 = this.f56804b;
            if (choreographer2 != null) {
                choreographer2.postFrameCallback(this);
            }
            this.f56806d = j;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m82340f() {
        return zy0.m222096c().m222101e();
    }

    /* JADX INFO: renamed from: g */
    public boolean m82341g() {
        if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            f610.m124264b("[FrameBeat][init] FrameBeat must init on main thread", new Object[0]);
            return false;
        }
        if (this.f56803a) {
            f610.m124266d("[FrameBeat][init] FrameBeat is created!", new Object[0]);
        } else {
            try {
                this.f56804b = Choreographer.getInstance();
                zy0.m222096c().m222103h(this);
                this.f56803a = true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m82342h() {
        return this.f56805c;
    }

    /* JADX INFO: renamed from: i */
    public void m82343i(a aVar) {
        this.f56807e = aVar;
    }

    /* JADX INFO: renamed from: j */
    public void m82344j() {
        if (this.f56803a) {
            this.f56805c = false;
            Choreographer choreographer = this.f56804b;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
                this.f56804b.postFrameCallback(this);
                this.f56806d = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m82345k() {
        if (this.f56803a) {
            this.f56805c = true;
            Choreographer choreographer = this.f56804b;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
                this.f56806d = 0L;
            }
        }
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityStarted(Activity activity) {
    }

    @Override // p153l.zy0.InterfaceC21927a
    public void onActivityStopped(Activity activity) {
    }
}

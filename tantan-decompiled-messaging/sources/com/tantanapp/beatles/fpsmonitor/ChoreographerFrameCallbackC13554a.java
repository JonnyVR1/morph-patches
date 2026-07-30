package com.tantanapp.beatles.fpsmonitor;

import android.app.Activity;
import android.os.Looper;
import android.view.Choreographer;
import p149l.sy0;
import p149l.vx00;

/* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.a */
/* JADX INFO: loaded from: classes13.dex */
public class ChoreographerFrameCallbackC13554a implements Choreographer.FrameCallback, sy0.InterfaceC20069a {

    /* JADX INFO: renamed from: g */
    public static ChoreographerFrameCallbackC13554a f55954g;

    /* JADX INFO: renamed from: a */
    public boolean f55955a;

    /* JADX INFO: renamed from: b */
    public Choreographer f55956b;

    /* JADX INFO: renamed from: d */
    public long f55958d;

    /* JADX INFO: renamed from: e */
    public a f55959e;

    /* JADX INFO: renamed from: c */
    public volatile boolean f55957c = true;

    /* JADX INFO: renamed from: f */
    public boolean f55960f = false;

    /* JADX INFO: renamed from: com.tantanapp.beatles.fpsmonitor.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo81134a();

        void doFrame(long j);

        void pause();
    }

    /* JADX INFO: renamed from: e */
    public static ChoreographerFrameCallbackC13554a m81156e() {
        if (f55954g == null) {
            f55954g = new ChoreographerFrameCallbackC13554a();
        }
        return f55954g;
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: a */
    public void mo81052a(Activity activity) {
        Choreographer choreographer;
        this.f55960f = false;
        a aVar = this.f55959e;
        if (aVar == null || !aVar.mo81134a() || (choreographer = this.f55956b) == null) {
            return;
        }
        choreographer.removeFrameCallback(this);
        this.f55956b.postFrameCallback(this);
        this.f55958d = 0L;
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: b */
    public void mo81053b(boolean z) {
        if (z) {
            return;
        }
        m81162k();
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: c */
    public void mo81054c(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    /* JADX INFO: renamed from: d */
    public void mo81055d(Activity activity) {
        this.f55960f = true;
        a aVar = this.f55959e;
        if (aVar != null) {
            aVar.pause();
            Choreographer choreographer = this.f55956b;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
                this.f55958d = 0L;
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f55957c || this.f55960f) {
            return;
        }
        long j2 = this.f55958d;
        if (j < j2 || j2 <= 0) {
            this.f55958d = j;
            Choreographer choreographer = this.f55956b;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
                return;
            }
            return;
        }
        a aVar = this.f55959e;
        if (aVar != null) {
            aVar.doFrame(j);
            Choreographer choreographer2 = this.f55956b;
            if (choreographer2 != null) {
                choreographer2.postFrameCallback(this);
            }
            this.f55958d = j;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m81157f() {
        return sy0.m186556c().m186561e();
    }

    /* JADX INFO: renamed from: g */
    public boolean m81158g() {
        if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            vx00.m200472b("[FrameBeat][init] FrameBeat must init on main thread", new Object[0]);
            return false;
        }
        if (this.f55955a) {
            vx00.m200474d("[FrameBeat][init] FrameBeat is created!", new Object[0]);
        } else {
            try {
                this.f55956b = Choreographer.getInstance();
                sy0.m186556c().m186563h(this);
                this.f55955a = true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m81159h() {
        return this.f55957c;
    }

    /* JADX INFO: renamed from: i */
    public void m81160i(a aVar) {
        this.f55959e = aVar;
    }

    /* JADX INFO: renamed from: j */
    public void m81161j() {
        if (this.f55955a) {
            this.f55957c = false;
            Choreographer choreographer = this.f55956b;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
                this.f55956b.postFrameCallback(this);
                this.f55958d = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m81162k() {
        if (this.f55955a) {
            this.f55957c = true;
            Choreographer choreographer = this.f55956b;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
                this.f55958d = 0L;
            }
        }
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityStarted(Activity activity) {
    }

    @Override // p149l.sy0.InterfaceC20069a
    public void onActivityStopped(Activity activity) {
    }
}

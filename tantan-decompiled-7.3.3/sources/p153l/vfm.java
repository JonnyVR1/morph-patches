package p153l;

import android.content.Context;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes8.dex */
public class vfm extends hn2 implements lvl {

    /* JADX INFO: renamed from: d */
    eh0 f183955d;

    /* JADX INFO: renamed from: e */
    OnPlayerStateCallback f183956e;

    public vfm(uow uowVar, MomoPipeline momoPipeline, Context context, int i, boolean z, brx brxVar) {
        this.f110690a = uowVar;
        this.f110691b = momoPipeline;
        eh0 eh0VarM114073j = d410.m114073j(context, uowVar.f180189x0, momoPipeline.mo20673A0(), i, z, brxVar);
        this.f183955d = eh0VarM114073j;
        this.f110692c = eh0VarM114073j;
        eh0VarM114073j.setFps(uowVar.f180159D0);
        this.f110691b.mo20697f0(this.f183955d);
        this.f110691b.mo20718u0(this.f183955d);
        OnPlayerStateCallback onPlayerStateCallback = this.f183956e;
        if (onPlayerStateCallback != null) {
            this.f183955d.m120836b2(onPlayerStateCallback);
        }
    }

    @Override // p153l.hn2, p153l.pvl
    /* JADX INFO: renamed from: G */
    public void mo109166G() {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            this.f110691b.mo20690Z(eh0Var).m128991j();
            this.f183955d.stop();
            this.f183956e = null;
            this.f183955d = null;
        }
        super.mo109166G();
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: a */
    public z5m mo109167a() {
        return this.f183955d;
    }

    @Override // p153l.lvl
    /* JADX INFO: renamed from: f */
    public void mo155995f(OnPlayerStateCallback onPlayerStateCallback) {
        this.f183956e = onPlayerStateCallback;
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.m120836b2(onPlayerStateCallback);
        }
    }

    @Override // p153l.lvl
    public long getCurrentPosition() {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            return eh0Var.m210809S1();
        }
        return 0L;
    }

    @Override // p153l.lvl
    public long getDuration() {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            return eh0Var.getDuration();
        }
        return 0L;
    }

    @Override // p153l.lvl
    /* JADX INFO: renamed from: n */
    public void mo155996n(int i) {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.m210812X1(i);
        }
    }

    @Override // p153l.lvl
    /* JADX INFO: renamed from: p */
    public void mo155997p(int i, int i2, int i3) {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.mo120832W1(i, i2, i3);
        }
    }

    @Override // p153l.lvl
    public void pause() {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.pause();
        }
    }

    @Override // p153l.lvl
    public void resume() {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.resume();
        }
    }

    @Override // p153l.lvl
    public void seek(long j) {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.seek(j);
        }
    }

    @Override // p153l.lvl
    public void setVolume(float f) {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.mo120833Y1(f);
        }
    }

    @Override // p153l.lvl
    /* JADX INFO: renamed from: t */
    public void mo155998t(boolean z) {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.m210810T1(z);
        }
    }

    @Override // p153l.lvl
    /* JADX INFO: renamed from: y */
    public void mo155999y(InterfaceC4260a interfaceC4260a) {
        eh0 eh0Var = this.f183955d;
        if (eh0Var != null) {
            eh0Var.mo120831V1(interfaceC4260a);
        }
    }
}

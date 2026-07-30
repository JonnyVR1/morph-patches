package p007l;

import android.content.Context;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import l.eix;
import l.i3m;
import l.vlw;
import l.vv00;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class fdm extends an2 implements xsl {

    /* JADX INFO: renamed from: d */
    ih0 f2676d;

    /* JADX INFO: renamed from: e */
    OnPlayerStateCallback f2677e;

    public fdm(vlw vlwVar, MomoPipeline momoPipeline, Context context, int i, boolean z, eix eixVar) {
        this.f1879a = vlwVar;
        this.f1880b = momoPipeline;
        ih0 ih0VarJ = vv00.j(context, vlwVar.x0, momoPipeline.A0(), i, z, eixVar);
        this.f2676d = ih0VarJ;
        this.f1881c = ih0VarJ;
        ih0VarJ.setFps(vlwVar.D0);
        this.f1880b.f0(this.f2676d);
        this.f1880b.u0(this.f2676d);
        OnPlayerStateCallback onPlayerStateCallback = this.f2677e;
        if (onPlayerStateCallback != null) {
            this.f2676d.m9404b2(onPlayerStateCallback);
        }
    }

    @Override // p007l.an2, p007l.btl
    /* JADX INFO: renamed from: G */
    public void mo8566G() {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            this.f1880b.Z(ih0Var).j();
            this.f2676d.stop();
            this.f2677e = null;
            this.f2676d = null;
        }
        super.mo8566G();
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo8684a() {
        return this.f2676d;
    }

    @Override // p007l.xsl
    /* JADX INFO: renamed from: f */
    public void mo9091f(OnPlayerStateCallback onPlayerStateCallback) {
        this.f2677e = onPlayerStateCallback;
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.m9404b2(onPlayerStateCallback);
        }
    }

    @Override // p007l.xsl
    public long getCurrentPosition() {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            return ih0Var.m9307S1();
        }
        return 0L;
    }

    @Override // p007l.xsl
    public long getDuration() {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            return ih0Var.getDuration();
        }
        return 0L;
    }

    @Override // p007l.xsl
    /* JADX INFO: renamed from: n */
    public void mo9092n(int i) {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.m9312X1(i);
        }
    }

    @Override // p007l.xsl
    /* JADX INFO: renamed from: p */
    public void mo9093p(int i, int i2, int i3) {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.mo9311W1(i, i2, i3);
        }
    }

    @Override // p007l.xsl
    public void pause() {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.pause();
        }
    }

    @Override // p007l.xsl
    public void resume() {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.resume();
        }
    }

    @Override // p007l.xsl
    public void seek(long j) {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.seek(j);
        }
    }

    @Override // p007l.xsl
    public void setVolume(float f) {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.mo9313Y1(f);
        }
    }

    @Override // p007l.xsl
    /* JADX INFO: renamed from: t */
    public void mo9094t(boolean z) {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.m9308T1(z);
        }
    }

    @Override // p007l.xsl
    /* JADX INFO: renamed from: y */
    public void mo9095y(InterfaceC0021a interfaceC0021a) {
        ih0 ih0Var = this.f2676d;
        if (ih0Var != null) {
            ih0Var.mo9310V1(interfaceC0021a);
        }
    }
}

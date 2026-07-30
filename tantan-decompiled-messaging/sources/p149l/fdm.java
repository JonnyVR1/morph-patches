package p149l;

import android.content.Context;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes8.dex */
public class fdm extends an2 implements xsl {

    /* JADX INFO: renamed from: d */
    ih0 f97058d;

    /* JADX INFO: renamed from: e */
    OnPlayerStateCallback f97059e;

    public fdm(vlw vlwVar, MomoPipeline momoPipeline, Context context, int i, boolean z, eix eixVar) {
        this.f70698a = vlwVar;
        this.f70699b = momoPipeline;
        ih0 ih0VarM200146j = vv00.m200146j(context, vlwVar.f182045x0, momoPipeline.mo19674A0(), i, z, eixVar);
        this.f97058d = ih0VarM200146j;
        this.f70700c = ih0VarM200146j;
        ih0VarM200146j.setFps(vlwVar.f182015D0);
        this.f70699b.mo19698f0(this.f97058d);
        this.f70699b.mo19719u0(this.f97058d);
        OnPlayerStateCallback onPlayerStateCallback = this.f97059e;
        if (onPlayerStateCallback != null) {
            this.f97058d.m136182b2(onPlayerStateCallback);
        }
    }

    @Override // p149l.an2, p149l.btl
    /* JADX INFO: renamed from: G */
    public void mo97705G() {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            this.f70699b.mo19691Z(ih0Var).m216276j();
            this.f97058d.stop();
            this.f97059e = null;
            this.f97058d = null;
        }
        super.mo97705G();
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo103860a() {
        return this.f97058d;
    }

    @Override // p149l.xsl
    /* JADX INFO: renamed from: f */
    public void mo120999f(OnPlayerStateCallback onPlayerStateCallback) {
        this.f97059e = onPlayerStateCallback;
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.m136182b2(onPlayerStateCallback);
        }
    }

    @Override // p149l.xsl
    public long getCurrentPosition() {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            return ih0Var.m130597S1();
        }
        return 0L;
    }

    @Override // p149l.xsl
    public long getDuration() {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            return ih0Var.getDuration();
        }
        return 0L;
    }

    @Override // p149l.xsl
    /* JADX INFO: renamed from: n */
    public void mo121000n(int i) {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.m130602X1(i);
        }
    }

    @Override // p149l.xsl
    /* JADX INFO: renamed from: p */
    public void mo121001p(int i, int i2, int i3) {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.mo130601W1(i, i2, i3);
        }
    }

    @Override // p149l.xsl
    public void pause() {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.pause();
        }
    }

    @Override // p149l.xsl
    public void resume() {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.resume();
        }
    }

    @Override // p149l.xsl
    public void seek(long j) {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.seek(j);
        }
    }

    @Override // p149l.xsl
    public void setVolume(float f) {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.mo130603Y1(f);
        }
    }

    @Override // p149l.xsl
    /* JADX INFO: renamed from: t */
    public void mo121002t(boolean z) {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.m130598T1(z);
        }
    }

    @Override // p149l.xsl
    /* JADX INFO: renamed from: y */
    public void mo121003y(InterfaceC4109a interfaceC4109a) {
        ih0 ih0Var = this.f97058d;
        if (ih0Var != null) {
            ih0Var.mo130600V1(interfaceC4109a);
        }
    }
}

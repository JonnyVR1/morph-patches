package p007l;

import android.media.projection.MediaProjection;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;
import l.i3m;
import l.u2m;
import l.vlw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class y4e0 extends an2 implements v2m {

    /* JADX INFO: renamed from: d */
    private u2m f5377d;

    /* JADX INFO: renamed from: e */
    boolean f5378e = false;

    public y4e0(vlw vlwVar, MomoPipeline momoPipeline) {
        this.f1879a = vlwVar;
        this.f1880b = momoPipeline;
        u2m u2mVarM11850e = xv00.m11850e();
        this.f5377d = u2mVarM11850e;
        this.f1881c = u2mVarM11850e;
        u2mVarM11850e.setFps(this.f1879a.D0);
        this.f1880b.f0(this.f5377d);
        this.f1880b.u0(this.f5377d);
    }

    @Override // p007l.an2, p007l.btl
    /* JADX INFO: renamed from: G */
    public synchronized void mo8566G() {
        this.f5378e = false;
        u2m u2mVar = this.f5377d;
        if (u2mVar == null) {
            return;
        }
        this.f1880b.Z(u2mVar).j();
        this.f5377d.P1();
        this.f5377d = null;
        super.mo8566G();
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo8684a() {
        return this.f5377d;
    }

    @Override // p007l.v2m
    /* JADX INFO: renamed from: o */
    public synchronized void mo11261o(@NonNull MediaProjection mediaProjection) {
        this.f5377d.U0(this.f1879a, mediaProjection);
        this.f5378e = true;
    }
}

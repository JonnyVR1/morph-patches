package p149l;

import android.media.projection.MediaProjection;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public class y4e0 extends an2 implements v2m {

    /* JADX INFO: renamed from: d */
    private u2m f196274d;

    /* JADX INFO: renamed from: e */
    boolean f196275e = false;

    public y4e0(vlw vlwVar, MomoPipeline momoPipeline) {
        this.f70698a = vlwVar;
        this.f70699b = momoPipeline;
        u2m u2mVarM211242e = xv00.m211242e();
        this.f196274d = u2mVarM211242e;
        this.f70700c = u2mVarM211242e;
        u2mVarM211242e.setFps(this.f70698a.f182015D0);
        this.f70699b.mo19698f0(this.f196274d);
        this.f70699b.mo19719u0(this.f196274d);
    }

    @Override // p149l.an2, p149l.btl
    /* JADX INFO: renamed from: G */
    public synchronized void mo97705G() {
        this.f196275e = false;
        u2m u2mVar = this.f196274d;
        if (u2mVar == null) {
            return;
        }
        this.f70699b.mo19691Z(u2mVar).m216276j();
        this.f196274d.mo100324P1();
        this.f196274d = null;
        super.mo97705G();
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo103860a() {
        return this.f196274d;
    }

    @Override // p149l.v2m
    /* JADX INFO: renamed from: o */
    public synchronized void mo196807o(@NonNull MediaProjection mediaProjection) {
        this.f196274d.mo100325U0(this.f70698a, mediaProjection);
        this.f196275e = true;
    }
}

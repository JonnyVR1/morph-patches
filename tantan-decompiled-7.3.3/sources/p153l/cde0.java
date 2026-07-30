package p153l;

import android.media.projection.MediaProjection;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public class cde0 extends hn2 implements n5m {

    /* JADX INFO: renamed from: d */
    private m5m f81180d;

    /* JADX INFO: renamed from: e */
    boolean f81181e = false;

    public cde0(uow uowVar, MomoPipeline momoPipeline) {
        this.f110690a = uowVar;
        this.f110691b = momoPipeline;
        m5m m5mVarM123870e = f410.m123870e();
        this.f81180d = m5mVarM123870e;
        this.f110692c = m5mVarM123870e;
        m5mVarM123870e.setFps(this.f110690a.f180159D0);
        this.f110691b.mo20697f0(this.f81180d);
        this.f110691b.mo20718u0(this.f81180d);
    }

    @Override // p153l.hn2, p153l.pvl
    /* JADX INFO: renamed from: G */
    public synchronized void mo109166G() {
        this.f81181e = false;
        m5m m5mVar = this.f81180d;
        if (m5mVar == null) {
            return;
        }
        this.f110691b.mo20690Z(m5mVar).m128991j();
        this.f81180d.mo125097P1();
        this.f81180d = null;
        super.mo109166G();
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: a */
    public z5m mo109167a() {
        return this.f81180d;
    }

    @Override // p153l.n5m
    /* JADX INFO: renamed from: o */
    public synchronized void mo109168o(@NonNull MediaProjection mediaProjection) {
        this.f81180d.mo125098U0(this.f110690a, mediaProjection);
        this.f81181e = true;
    }
}

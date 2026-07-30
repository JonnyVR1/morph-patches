package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class rgv {

    /* JADX INFO: renamed from: a */
    public final MotionType f159293a;

    /* JADX INFO: renamed from: b */
    public final z9j<MotionType, w4t, bsm, nxl, qgv> f159294b;

    public rgv(MotionType motionType, z9j<MotionType, w4t, bsm, nxl, qgv> z9jVar) {
        this.f159293a = motionType;
        this.f159294b = z9jVar;
    }

    /* JADX INFO: renamed from: a */
    public qgv m179263a(w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        return this.f159294b.mo100621b(this.f159293a, w4tVar, bsmVar, nxlVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m179264b(MotionType motionType) {
        MotionType motionType2 = this.f159293a;
        return motionType2 != null && motionType2 == motionType;
    }
}

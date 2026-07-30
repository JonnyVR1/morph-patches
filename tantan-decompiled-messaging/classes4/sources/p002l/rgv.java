package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import l.z9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rgv {

    /* JADX INFO: renamed from: a */
    public final MotionType f18514a;

    /* JADX INFO: renamed from: b */
    public final z9j<MotionType, w4t, bsm, nxl, qgv> f18515b;

    public rgv(MotionType motionType, z9j<MotionType, w4t, bsm, nxl, qgv> z9jVar) {
        this.f18514a = motionType;
        this.f18515b = z9jVar;
    }

    /* JADX INFO: renamed from: a */
    public qgv m21936a(w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        return (qgv) this.f18515b.b(this.f18514a, w4tVar, bsmVar, nxlVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m21937b(MotionType motionType) {
        MotionType motionType2 = this.f18514a;
        return motionType2 != null && motionType2 == motionType;
    }
}

package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class siv {

    /* JADX INFO: renamed from: a */
    public final MotionType f168871a;

    /* JADX INFO: renamed from: b */
    public final tcj<MotionType, x6t, dum, g0m, riv> f168872b;

    public siv(MotionType motionType, tcj<MotionType, x6t, dum, g0m, riv> tcjVar) {
        this.f168871a = motionType;
        this.f168872b = tcjVar;
    }

    /* JADX INFO: renamed from: a */
    public riv m186037a(x6t x6tVar, dum dumVar, g0m g0mVar) {
        return this.f168872b.mo112959b(this.f168871a, x6tVar, dumVar, g0mVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m186038b(MotionType motionType) {
        MotionType motionType2 = this.f168871a;
        return motionType2 != null && motionType2 == motionType;
    }
}

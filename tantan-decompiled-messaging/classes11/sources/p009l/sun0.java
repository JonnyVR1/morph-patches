package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;
import java.util.ArrayList;
import l.bsm;
import l.e30;
import l.f30;
import l.ffw;
import l.ho2;
import l.l3m;
import l.pat;
import l.plm0;
import l.vwb;
import l.w9j;
import l.xmm0;
import l.z9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sun0 extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public ArrayList<lwn0> f20473i;

    /* JADX INFO: renamed from: j */
    public kwn0 f20474j;

    /* JADX INFO: renamed from: k */
    public bsm f20475k;

    public sun0(bsm bsmVar) {
        super(bsmVar);
        this.f20473i = new ArrayList<>();
        this.f20475k = bsmVar;
    }

    /* JADX INFO: renamed from: O3 */
    private void m22398O3() {
        boolean z = this.f20475k.d;
        ArrayList<lwn0> arrayList = this.f20473i;
        if (z) {
            arrayList.add(new lwn0(VoiceLiveMotionType.voice_call_normal, new z9j() { // from class: l.pun0
                /* JADX INFO: renamed from: b */
                public final Object m20728b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new plm0((VoiceLiveMotionType) obj, (sun0) obj2, (bsm) obj3, (b8m) obj4);
                }
            }));
        } else {
            arrayList.add(new lwn0(VoiceLiveMotionType.voice_call_normal, new z9j() { // from class: l.qun0
                /* JADX INFO: renamed from: b */
                public final Object m21325b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new xmm0((VoiceLiveMotionType) obj, (sun0) obj2, (bsm) obj3, (b8m) obj4);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static lwn0 m22399P3(ArrayList<lwn0> arrayList, final VoiceLiveMotionType voiceLiveMotionType) {
        return (lwn0) vwb.r(arrayList, new w9j() { // from class: l.run0
            public final Object call(Object obj) {
                return Boolean.valueOf(((lwn0) obj).m18069b(voiceLiveMotionType));
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m22400M3(VoiceLiveMotionType voiceLiveMotionType) {
        kwn0 kwn0Var = this.f20474j;
        return kwn0Var != null && kwn0Var.m17608c() == voiceLiveMotionType;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m22401N3(w1o0 w1o0Var) {
        boolean z = w1o0Var.f21853a;
        VoiceLiveMotionType voiceLiveMotionType = w1o0Var.f21854b;
        if (z) {
            m22402R3(voiceLiveMotionType, w1o0Var.f21856d, w1o0Var.f21855c);
        } else {
            m22403S3(voiceLiveMotionType);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m22402R3(VoiceLiveMotionType voiceLiveMotionType, f30<Integer, VoiceLiveMotionType> f30Var, b8m b8mVar) {
        kwn0 kwn0Var = this.f20474j;
        if (kwn0Var != null) {
            boolean zM17606a = kwn0Var.m17606a(voiceLiveMotionType);
            kwn0 kwn0Var2 = this.f20474j;
            if (!zM17606a) {
                f30Var.call(1, kwn0Var2.m17608c());
                return;
            }
            kwn0Var2.m17607b();
        }
        lwn0 lwn0VarM22399P3 = m22399P3(this.f20473i, voiceLiveMotionType);
        if (lwn0VarM22399P3 == null) {
            f30Var.call(2, VoiceLiveMotionType.NULL);
            return;
        }
        kwn0 kwn0VarM18068a = lwn0VarM22399P3.m18068a(this, this.f20475k, b8mVar);
        if (kwn0VarM18068a == null) {
            f30Var.call(3, VoiceLiveMotionType.NULL);
        } else {
            this.f20474j = kwn0VarM18068a;
            kwn0VarM18068a.m17610e();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m22403S3(VoiceLiveMotionType voiceLiveMotionType) {
        kwn0 kwn0Var = this.f20474j;
        if (kwn0Var != null && kwn0Var.m17608c() == voiceLiveMotionType) {
            this.f20474j.m17611f();
            this.f20474j = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m22404T() {
        super/*l.k4t*/.T();
        duringCreated((c) F2().VoiceMotionEvent.motionSwitch().g()).subscribe(ffw.e(new e30() { // from class: l.nun0
            public final void call(Object obj) {
                this.f17747a.m22401N3((w1o0) obj);
            }
        }, new e30() { // from class: l.oun0
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    public void init() {
        m22398O3();
    }

    /* JADX INFO: renamed from: n */
    public void m22405n() {
        super/*l.h4t*/.n();
        kwn0 kwn0Var = this.f20474j;
        if (kwn0Var == null) {
            return;
        }
        kwn0Var.m17611f();
        this.f20474j = null;
    }
}

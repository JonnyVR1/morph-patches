package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class sun0 extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public ArrayList<lwn0> f166487i;

    /* JADX INFO: renamed from: j */
    public kwn0 f166488j;

    /* JADX INFO: renamed from: k */
    public bsm f166489k;

    public sun0(bsm bsmVar) {
        super(bsmVar);
        this.f166487i = new ArrayList<>();
        this.f166489k = bsmVar;
    }

    /* JADX INFO: renamed from: O3 */
    private void m186020O3() {
        boolean z = this.f166489k.f77098d;
        ArrayList<lwn0> arrayList = this.f166487i;
        if (z) {
            arrayList.add(new lwn0(VoiceLiveMotionType.voice_call_normal, new z9j() { // from class: l.pun0
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new plm0((VoiceLiveMotionType) obj, (sun0) obj2, (bsm) obj3, (b8m) obj4);
                }
            }));
        } else {
            arrayList.add(new lwn0(VoiceLiveMotionType.voice_call_normal, new z9j() { // from class: l.qun0
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new xmm0((VoiceLiveMotionType) obj, (sun0) obj2, (bsm) obj3, (b8m) obj4);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static lwn0 m186021P3(ArrayList<lwn0> arrayList, final VoiceLiveMotionType voiceLiveMotionType) {
        return (lwn0) vwb.m200346r(arrayList, new w9j() { // from class: l.run0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((lwn0) obj).m151981b(voiceLiveMotionType));
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m186022M3(VoiceLiveMotionType voiceLiveMotionType) {
        kwn0 kwn0Var = this.f166488j;
        return kwn0Var != null && kwn0Var.m147602c() == voiceLiveMotionType;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m186023N3(w1o0 w1o0Var) {
        boolean z = w1o0Var.f184030a;
        VoiceLiveMotionType voiceLiveMotionType = w1o0Var.f184031b;
        if (z) {
            m186024R3(voiceLiveMotionType, w1o0Var.f184033d, w1o0Var.f184032c);
        } else {
            m186025S3(voiceLiveMotionType);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m186024R3(VoiceLiveMotionType voiceLiveMotionType, f30<Integer, VoiceLiveMotionType> f30Var, b8m b8mVar) {
        kwn0 kwn0Var = this.f166488j;
        if (kwn0Var != null) {
            boolean zM147600a = kwn0Var.m147600a(voiceLiveMotionType);
            kwn0 kwn0Var2 = this.f166488j;
            if (!zM147600a) {
                f30Var.call(1, kwn0Var2.m147602c());
                return;
            }
            kwn0Var2.m147601b();
        }
        lwn0 lwn0VarM186021P3 = m186021P3(this.f166487i, voiceLiveMotionType);
        if (lwn0VarM186021P3 == null) {
            f30Var.call(2, VoiceLiveMotionType.NULL);
            return;
        }
        kwn0 kwn0VarM151980a = lwn0VarM186021P3.m151980a(this, this.f166489k, b8mVar);
        if (kwn0VarM151980a == null) {
            f30Var.call(3, VoiceLiveMotionType.NULL);
        } else {
            this.f166488j = kwn0VarM151980a;
            kwn0VarM151980a.mo147604e();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m186025S3(VoiceLiveMotionType voiceLiveMotionType) {
        kwn0 kwn0Var = this.f166488j;
        if (kwn0Var != null && kwn0Var.m147602c() == voiceLiveMotionType) {
            this.f166488j.mo147605f();
            this.f166488j = null;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VoiceMotionEvent.motionSwitch().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.nun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140642a.m186023N3((w1o0) obj);
            }
        }, new e30() { // from class: l.oun0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    public void init() {
        m186020O3();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        kwn0 kwn0Var = this.f166488j;
        if (kwn0Var == null) {
            return;
        }
        kwn0Var.mo147605f();
        this.f166488j = null;
    }
}

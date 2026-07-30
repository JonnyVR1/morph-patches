package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class w3o0 extends qct<oo2> implements c6m {

    /* JADX INFO: renamed from: i */
    public ArrayList<p5o0> f187158i;

    /* JADX INFO: renamed from: j */
    public o5o0 f187159j;

    /* JADX INFO: renamed from: k */
    public dum f187160k;

    public w3o0(dum dumVar) {
        super(dumVar);
        this.f187158i = new ArrayList<>();
        this.f187160k = dumVar;
    }

    /* JADX INFO: renamed from: O3 */
    private void m204782O3() {
        boolean z = this.f187160k.f90818d;
        ArrayList<p5o0> arrayList = this.f187158i;
        if (z) {
            arrayList.add(new p5o0(VoiceLiveMotionType.voice_call_normal, new tcj() { // from class: l.t3o0
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new tum0((VoiceLiveMotionType) obj, (w3o0) obj2, (dum) obj3, (ram) obj4);
                }
            }));
        } else {
            arrayList.add(new p5o0(VoiceLiveMotionType.voice_call_normal, new tcj() { // from class: l.u3o0
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new bwm0((VoiceLiveMotionType) obj, (w3o0) obj2, (dum) obj3, (ram) obj4);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static p5o0 m204783P3(ArrayList<p5o0> arrayList, final VoiceLiveMotionType voiceLiveMotionType) {
        return (p5o0) jyb.m147529r(arrayList, new qcj() { // from class: l.v3o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((p5o0) obj).m170677b(voiceLiveMotionType));
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m204784M3(VoiceLiveMotionType voiceLiveMotionType) {
        o5o0 o5o0Var = this.f187159j;
        return o5o0Var != null && o5o0Var.m166166c() == voiceLiveMotionType;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m204785N3(abo0 abo0Var) {
        boolean z = abo0Var.f69638a;
        VoiceLiveMotionType voiceLiveMotionType = abo0Var.f69639b;
        if (z) {
            m204786R3(voiceLiveMotionType, abo0Var.f69641d, abo0Var.f69640c);
        } else {
            m204787S3(voiceLiveMotionType);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m204786R3(VoiceLiveMotionType voiceLiveMotionType, z20<Integer, VoiceLiveMotionType> z20Var, ram ramVar) {
        o5o0 o5o0Var = this.f187159j;
        if (o5o0Var != null) {
            boolean zM166164a = o5o0Var.m166164a(voiceLiveMotionType);
            o5o0 o5o0Var2 = this.f187159j;
            if (!zM166164a) {
                z20Var.call(1, o5o0Var2.m166166c());
                return;
            }
            o5o0Var2.m166165b();
        }
        p5o0 p5o0VarM204783P3 = m204783P3(this.f187158i, voiceLiveMotionType);
        if (p5o0VarM204783P3 == null) {
            z20Var.call(2, VoiceLiveMotionType.NULL);
            return;
        }
        o5o0 o5o0VarM170676a = p5o0VarM204783P3.m170676a(this, this.f187160k, ramVar);
        if (o5o0VarM170676a == null) {
            z20Var.call(3, VoiceLiveMotionType.NULL);
        } else {
            this.f187159j = o5o0VarM170676a;
            o5o0VarM170676a.mo106726e();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m204787S3(VoiceLiveMotionType voiceLiveMotionType) {
        o5o0 o5o0Var = this.f187159j;
        if (o5o0Var != null && o5o0Var.m166166c() == voiceLiveMotionType) {
            this.f187159j.mo106727f();
            this.f187159j = null;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VoiceMotionEvent.motionSwitch().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.r3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161061a.m204785N3((abo0) obj);
            }
        }, new y20() { // from class: l.s3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    public void init() {
        m204782O3();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        o5o0 o5o0Var = this.f187159j;
        if (o5o0Var == null) {
            return;
        }
        o5o0Var.mo106727f();
        this.f187159j = null;
    }
}

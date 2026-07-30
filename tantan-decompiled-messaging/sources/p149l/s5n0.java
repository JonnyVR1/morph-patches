package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;

/* JADX INFO: loaded from: classes5.dex */
public class s5n0 extends p5n0<fhm0> {
    public s5n0(bsm<fhm0> bsmVar, VoiceFansView voiceFansView) {
        super(bsmVar, voiceFansView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m182369h4(iqv iqvVar) {
        reset();
        ((fhm0) m206027E2()).m132078M1(((fhm0) m206027E2()).m149814k(), ((fhm0) m206027E2()).m149818o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m182370i4(Throwable th) {
        reset();
        ((fhm0) m206027E2()).m132078M1(((fhm0) m206027E2()).m149814k(), ((fhm0) m206027E2()).m149818o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.p5n0
    public void init() {
        super.init();
        duringCreated(((fhm0) m206027E2()).mo149823u()).subscribe(ffw.m121194e(new e30() { // from class: l.q5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152815a.m182369h4((iqv) obj);
            }
        }, new e30() { // from class: l.r5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157858a.m182370i4((Throwable) obj);
            }
        }));
    }
}

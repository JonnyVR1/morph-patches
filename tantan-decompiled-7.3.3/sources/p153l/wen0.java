package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;

/* JADX INFO: loaded from: classes5.dex */
public class wen0 extends ten0<jqm0> {
    public wen0(dum<jqm0> dumVar, VoiceFansView voiceFansView) {
        super(dumVar, voiceFansView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m206027h4(jsv jsvVar) {
        reset();
        ((jqm0) m213810E2()).m168466M1(((jqm0) m213810E2()).m202191k(), ((jqm0) m213810E2()).m202194o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m206028i4(Throwable th) {
        reset();
        ((jqm0) m213810E2()).m168466M1(((jqm0) m213810E2()).m202191k(), ((jqm0) m213810E2()).m202194o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ten0
    public void init() {
        super.init();
        duringCreated(((jqm0) m213810E2()).mo183449u()).subscribe(dhw.m115826e(new y20() { // from class: l.uen0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178680a.m206027h4((jsv) obj);
            }
        }, new y20() { // from class: l.ven0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183834a.m206028i4((Throwable) obj);
            }
        }));
    }
}

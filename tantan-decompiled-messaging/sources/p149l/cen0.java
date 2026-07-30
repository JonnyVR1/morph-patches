package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class cen0 extends pat<nnn0> {
    public cen0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m106329O3(r8d0 r8d0Var) {
        ((nnn0) m206027E2()).mo132090S(r8d0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m106330P3(Object obj) {
        m106332S3();
    }

    /* JADX INFO: renamed from: R3 */
    public final C22306c<Object> m106331R3() {
        return C22306c.merge(m129306k3(), lifecycle().filter(new w9j() { // from class: l.ben0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m106332S3() {
        duringCreated(VoiceRoomApiProvider.getLiveInfo(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.zdn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202686a.m106329O3((r8d0) obj);
            }
        }, new e30() { // from class: l.aen0
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("[voiceInfoRefresh]", "change data error " + ((Throwable) obj).getMessage());
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(new v9j() { // from class: l.xdn0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f192425a.m106331R3();
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ydn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197575a.m106330P3(obj);
            }
        }));
    }
}

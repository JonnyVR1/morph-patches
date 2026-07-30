package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import p133rx.C22306c;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class sav extends bwr<vav> {

    /* JADX INFO: renamed from: a */
    public final mss f163455a;

    public sav(mss mssVar, VNavigationBar vNavigationBar) {
        super(mssVar.f135531b);
        this.f163455a = mssVar;
        mo51532C(new vav(vNavigationBar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m183105z2(C4319c c4319c) {
        m183108C2();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m183106A2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        ((vav) this.viewModel).m197656i(liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m183107B2(List list) {
        ((vav) this.viewModel).m197657j(this.f163455a.m156171a(), list);
    }

    /* JADX INFO: renamed from: C2 */
    public void m183108C2() {
        duringCreated(VirtualVoiceRoomApiProvider.getVoiceSquareButtons()).onErrorResumeNext(new w9j() { // from class: l.qav
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.empty();
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.rav
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158562a.m183107B2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public void m183109w2() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.nav
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.oav
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142867a.m183105z2((C4319c) obj);
            }
        }));
        duringCreated(this.f163455a.f135530a.LiveVoiceInternalWidgetEvent.bottomWidget().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.pav
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148012a.m183106A2((LiveVoiceInternalSquareBean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y2 */
    public void m183110y2() {
        ((vav) this.viewModel).m197654e(this.f163455a.m156171a());
    }
}

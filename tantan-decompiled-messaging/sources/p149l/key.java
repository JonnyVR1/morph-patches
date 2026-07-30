package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import p133rx.C22306c;
import p149l.dey;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class key<D extends nnn0, VM extends dey> extends gay<D, VM> {

    /* JADX INFO: renamed from: j */
    public boolean f122878j;

    public key(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        this.f122878j = false;
        mo51532C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m145814f4(BLiveVoiceSettle bLiveVoiceSettle) {
        m125041W3(bLiveVoiceSettle.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m145815h4(List list) {
        ((dey) this.viewModel).f85866a.m78680l0(vwb.m200296J(list));
        ((dey) this.viewModel).m111407e(list);
    }

    /* JADX INFO: renamed from: i4 */
    private void m145816i4() {
        duringCreated(LivingNormalApiProvider.m71365V5(m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.iey
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112934a.m145815h4((List) obj);
            }
        }, new vud0()));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo115766S3() {
        return new vay("已入驻", ((dey) this.viewModel).m111405c(), 1);
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo115767T3() {
        return 1;
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo115769V3() {
        m145816i4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m145817c4(final BLiveVoiceSettle bLiveVoiceSettle) {
        hby.m130357e("p_audio_management_panel", m206027E2().mo97490p(), m206027E2().m132146l0().f56011id, m206027E2().m149814k(), "management_host");
        duringCreated(LivingNormalApiProvider.m71309P3(ypv.f199493a.m199309D0(), bLiveVoiceSettle.userId, m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.jey
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117614a.m145819e4(bLiveVoiceSettle, (BLiveVoiceLivePush) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m145818d4() {
        return this.f122878j;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m145819e4(BLiveVoiceSettle bLiveVoiceSettle, BLiveVoiceLivePush bLiveVoiceLivePush) {
        osi0.m165783g(bLiveVoiceLivePush.message);
        if (bLiveVoiceLivePush.sendPush) {
            bLiveVoiceSettle.isSelected = true;
            ((dey) this.viewModel).m111408f(bLiveVoiceSettle);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m145820g4(Integer num) {
        m145816i4();
    }

    public void init() {
        ((dey) this.viewModel).m111406d(this, new e30() { // from class: l.fey
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97163a.m145814f4((BLiveVoiceSettle) obj);
            }
        }, new e30() { // from class: l.gey
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102311a.m145817c4((BLiveVoiceSettle) obj);
            }
        }, null);
        m207199N3((C22306c) m206028F2().MemberManagerEvent.refreshListData().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.hey
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107418a.m145820g4((Integer) obj);
            }
        }));
        m145816i4();
    }

    /* JADX INFO: renamed from: j4 */
    public void m145821j4(boolean z) {
        this.f122878j = z;
    }
}

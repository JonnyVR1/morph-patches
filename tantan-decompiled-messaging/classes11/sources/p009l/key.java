package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.osi0;
import l.vud0;
import l.vwb;
import p009l.dey;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class key<D extends nnn0, VM extends dey> extends gay<D, VM> {

    /* JADX INFO: renamed from: j */
    public boolean f15622j;

    public key(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        this.f15622j = false;
        C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m17451f4(BLiveVoiceSettle bLiveVoiceSettle) {
        m14852W3(bLiveVoiceSettle.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m17452h4(List list) {
        ((dey) ((bwr) this).viewModel).f11811a.m8896l0(vwb.J(list));
        ((dey) ((bwr) this).viewModel).m13298e(list);
    }

    /* JADX INFO: renamed from: i4 */
    private void m17453i4() {
        duringCreated(LivingNormalApiProvider.V5(E2().o())).subscribe(ffw.e(new e30() { // from class: l.iey
            public final void call(Object obj) {
                this.f14599a.m17452h4((List) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: P3 */
    public void m17454P3() {
        super.P3();
        init();
    }

    @Override // p009l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo13819S3() {
        return new vay("已入驻", ((dey) ((bwr) this).viewModel).m13296c(), 1);
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo13820T3() {
        return 1;
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo13822V3() {
        m17453i4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m17455c4(final BLiveVoiceSettle bLiveVoiceSettle) {
        hby.m15519e("p_audio_management_panel", E2().p(), ((DbObject) E2().l0()).id, E2().k(), "management_host");
        duringCreated(LivingNormalApiProvider.P3(ypv.f23196a.m23619D0(), bLiveVoiceSettle.userId, E2().k())).subscribe(ffw.e(new e30() { // from class: l.jey
            public final void call(Object obj) {
                this.f15089a.m17457e4(bLiveVoiceSettle, (BLiveVoiceLivePush) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m17456d4() {
        return this.f15622j;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m17457e4(BLiveVoiceSettle bLiveVoiceSettle, BLiveVoiceLivePush bLiveVoiceLivePush) {
        osi0.g(bLiveVoiceLivePush.message);
        if (bLiveVoiceLivePush.sendPush) {
            bLiveVoiceSettle.isSelected = true;
            ((dey) ((bwr) this).viewModel).m13299f(bLiveVoiceSettle);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m17458g4(Integer num) {
        m17453i4();
    }

    public void init() {
        ((dey) ((bwr) this).viewModel).m13297d(this, new e30() { // from class: l.fey
            public final void call(Object obj) {
                this.f12983a.m17451f4((BLiveVoiceSettle) obj);
            }
        }, new e30() { // from class: l.gey
            public final void call(Object obj) {
                this.f13498a.m17455c4((BLiveVoiceSettle) obj);
            }
        }, null);
        N3((c) F2().MemberManagerEvent.refreshListData().g()).subscribe(ffw.d(new e30() { // from class: l.hey
            public final void call(Object obj) {
                this.f14032a.m17458g4((Integer) obj);
            }
        }));
        m17453i4();
    }

    /* JADX INFO: renamed from: j4 */
    public void m17459j4(boolean z) {
        this.f15622j = z;
    }
}

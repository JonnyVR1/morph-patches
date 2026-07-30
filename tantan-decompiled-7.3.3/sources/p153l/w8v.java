package p153l;

import android.util.Pair;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveAssert;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class w8v extends cyr<g9v> {

    /* JADX INFO: renamed from: a */
    public final nus f187934a;

    public w8v(nus nusVar, VNavigationBar vNavigationBar, boolean z) {
        super(nusVar.f143738b);
        this.f187934a = nusVar;
        mo52715C(new g9v(vNavigationBar, z));
    }

    /* JADX INFO: renamed from: y2 */
    private C22421c<Pair<BLiveVoiceLiveAssert, List<BLiveVoiceSquareButton>>> m205530y2() {
        C22421c<BLiveVoiceLiveAssert> myGuild = VirtualVoiceRoomApiProvider.getMyGuild(zrv.f205799a.m207631D0());
        Objects.requireNonNull(myGuild);
        return C22421c.zip(myGuild.onErrorResumeNext(new qcj() { // from class: l.s8v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.empty();
            }
        }), VirtualVoiceRoomApiProvider.getVoiceSquareButtons().onErrorResumeNext(new qcj() { // from class: l.t8v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.empty();
            }
        }), new rcj() { // from class: l.u8v
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Pair.create((BLiveVoiceLiveAssert) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: A2 */
    public void m205531A2(BLiveSquareTab bLiveSquareTab) {
        ((g9v) this.viewModel).m129628q(this.f187934a.m164819a(), bLiveSquareTab);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ C22421c m205532B2(C4470c c4470c) {
        return m205530y2();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m205533C2(Pair pair) {
        ((g9v) this.viewModel).m129625A(this.f187934a.m164819a(), (List) pair.second);
        ((g9v) this.viewModel).m129626B((BLiveVoiceLiveAssert) pair.first);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m205534D2(Pair pair) {
        ((g9v) this.viewModel).m129625A(this.f187934a.m164819a(), (List) pair.second);
        ((g9v) this.viewModel).m129626B((BLiveVoiceLiveAssert) pair.first);
    }

    /* JADX INFO: renamed from: E2 */
    public void m205535E2() {
        duringCreated(m205530y2()).subscribe(dhw.m115829h(new y20() { // from class: l.v8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182895a.m205534D2((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public void m205536z2() {
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.p8v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).flatMap(new qcj() { // from class: l.q8v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156165a.m205532B2((C4470c) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.r8v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161768a.m205533C2((Pair) obj);
            }
        }));
    }
}

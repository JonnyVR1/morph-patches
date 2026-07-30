package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class rhg extends C17980kc<ohg> {

    /* JADX INFO: renamed from: k */
    public int f159362k;

    public rhg(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new ohg(bsmVar.f77095a, this));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.C17980kc
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public hcy mo145332S3() {
        return new hcy("粉丝榜", ((ohg) this.viewModel).m164359j(), 1);
    }

    @Override // p149l.C17980kc
    /* JADX INFO: renamed from: T3 */
    public int mo145333T3() {
        return 1;
    }

    @Override // p149l.C17980kc
    /* JADX INFO: renamed from: U3 */
    public void mo145334U3(String str) {
        this.f122279j = str;
        m179352c4(this.f159362k);
    }

    /* JADX INFO: renamed from: X3 */
    public long m179347X3() {
        return this.f159362k == ohg.f143975f ? (mqi0.m155944o() / 1000) - 604800 : mqi0.m155944o() / 1000;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m179348Y3(BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard) {
        ((ohg) this.viewModel).m164363q(bLiveVoiceHourLeaderBoard);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m179349Z3(Throwable th) {
        ((ohg) this.viewModel).m164358i();
    }

    /* JADX INFO: renamed from: a4 */
    public void m179350a4(BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem) {
        if (NullChecker.m81303a(bLiveVoiceHourLeaderBoardItem.user)) {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(702).m206701e(bLiveVoiceHourLeaderBoardItem.user.schema).m206699c());
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m179351b4() {
        m179352c4(this.f159362k);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    public void m179352c4(int i) {
        this.f159362k = i;
        duringCreated(bar.m100924d("contributor", "platform", m179347X3(), MerchandiseTimeUnit.week, "", this.f122279j, m206027E2())).subscribe(ffw.m121194e(new e30() { // from class: l.phg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148929a.m179348Y3((BLiveVoiceHourLeaderBoard) obj);
            }
        }, new e30() { // from class: l.qhg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154466a.m179349Z3((Throwable) obj);
            }
        }));
    }

    public void init() {
        ((ohg) this.viewModel).init();
        int i = ohg.f143974e;
        this.f159362k = i;
        m179352c4(i);
    }
}

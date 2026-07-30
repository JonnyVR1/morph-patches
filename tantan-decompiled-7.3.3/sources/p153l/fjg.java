package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class fjg extends C16943fc<cjg> {

    /* JADX INFO: renamed from: k */
    public int f99325k;

    public fjg(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new cjg(dumVar.f90815a, this));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.C16943fc
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public ely mo124967S3() {
        return new ely("粉丝榜", ((cjg) this.viewModel).m110188j(), 1);
    }

    @Override // p153l.C16943fc
    /* JADX INFO: renamed from: T3 */
    public int mo124968T3() {
        return 1;
    }

    @Override // p153l.C16943fc
    /* JADX INFO: renamed from: U3 */
    public void mo124969U3(String str) {
        this.f98170j = str;
        m125803c4(this.f99325k);
    }

    /* JADX INFO: renamed from: X3 */
    public long m125798X3() {
        return this.f99325k == cjg.f82154f ? (pzi0.m174454o() / 1000) - 604800 : pzi0.m174454o() / 1000;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m125799Y3(BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard) {
        ((cjg) this.viewModel).m110192q(bLiveVoiceHourLeaderBoard);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m125800Z3(Throwable th) {
        ((cjg) this.viewModel).m110187i();
    }

    /* JADX INFO: renamed from: a4 */
    public void m125801a4(BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem) {
        if (NullChecker.m82486a(bLiveVoiceHourLeaderBoardItem.user)) {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(702).m103154e(bLiveVoiceHourLeaderBoardItem.user.schema).m103152c());
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m125802b4() {
        m125803c4(this.f99325k);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.oo2] */
    /* JADX INFO: renamed from: c4 */
    public void m125803c4(int i) {
        this.f99325k = i;
        duringCreated(dcr.m115280d("contributor", "platform", m125798X3(), MerchandiseTimeUnit.week, "", this.f98170j, m213810E2())).subscribe(dhw.m115826e(new y20() { // from class: l.djg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88848a.m125799Y3((BLiveVoiceHourLeaderBoard) obj);
            }
        }, new y20() { // from class: l.ejg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94298a.m125800Z3((Throwable) obj);
            }
        }));
    }

    public void init() {
        ((cjg) this.viewModel).init();
        int i = cjg.f82153e;
        this.f99325k = i;
        m125803c4(i);
    }
}

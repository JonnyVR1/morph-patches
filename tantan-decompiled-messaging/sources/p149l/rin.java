package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p046p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class rin extends cts<IntlGameOperationView> {

    /* JADX INFO: renamed from: f */
    public boolean f159570f;

    /* JADX INFO: renamed from: g */
    public List<BLiveGameOperationConfig> f159571g;

    public rin(mcr mcrVar, mss mssVar, boolean z) {
        super(mcrVar, mssVar);
        this.f159570f = z;
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m179520R2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m179523W2(Boolean bool) {
        if (bool.booleanValue()) {
            m179524U2();
        }
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        duringCreated(s2u.m182077i().distinctUntilChanged()).map(new w9j() { // from class: l.min
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.nin
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139119a.m179523W2((Boolean) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.oin
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144141a.m179526X2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public void m179524U2() {
        duringCreated(iin.m136425b(this.f159570f ? "live" : VoiceLive.TYPE)).subscribe(ffw.m121194e(new e30() { // from class: l.pin
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149582a.m179525V2((List) obj);
            }
        }, new e30() { // from class: l.qin
            @Override // p149l.e30
            public final void call(Object obj) {
                rin.m179520R2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m179525V2(List list) {
        this.f159571g = list;
        ((IntlGameOperationView) this.viewModel).m69951u(list);
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        m151642F2().IntlGameOperationEvent.gameEntranceViewVisibility().mo172463j(Boolean.valueOf(this.f159570f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m179526X2(String str) {
        xdl0.m208344M((View) this.viewModel, !vwb.m200296J(this.f159571g) && x4u.m207029o(str));
    }

    /* JADX INFO: renamed from: Y2 */
    public void m179527Y2(BLiveGameOperationConfig bLiveGameOperationConfig) {
        if (TextUtils.isEmpty(bLiveGameOperationConfig.url)) {
            return;
        }
        l9s.m149057T(getAct(), Uri.parse(bLiveGameOperationConfig.url));
    }
}

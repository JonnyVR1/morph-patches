package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p051p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class rkn extends dvs<IntlGameOperationView> {

    /* JADX INFO: renamed from: f */
    public boolean f163633f;

    /* JADX INFO: renamed from: g */
    public List<BLiveGameOperationConfig> f163634g;

    public rkn(ner nerVar, nus nusVar, boolean z) {
        super(nerVar, nusVar);
        this.f163633f = z;
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m181865R2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m181868W2(Boolean bool) {
        if (bool.booleanValue()) {
            m181869U2();
        }
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        duringCreated(t4u.m189320i().distinctUntilChanged()).map(new qcj() { // from class: l.mkn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nkn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142472a.m181868W2((Boolean) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.okn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147767a.m181871X2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public void m181869U2() {
        duringCreated(ikn.m140413b(this.f163633f ? "live" : VoiceLive.TYPE)).subscribe(dhw.m115826e(new y20() { // from class: l.pkn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152868a.m181870V2((List) obj);
            }
        }, new y20() { // from class: l.qkn
            @Override // p153l.y20
            public final void call(Object obj) {
                rkn.m181865R2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m181870V2(List list) {
        this.f163634g = list;
        ((IntlGameOperationView) this.viewModel).m71134u(list);
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        m160238F2().IntlGameOperationEvent.gameEntranceViewVisibility().mo199273j(Boolean.valueOf(this.f163633f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m181871X2(String str) {
        bnl0.m105524M((View) this.viewModel, !jyb.m147479J(this.f163634g) && y6u.m214511o(str));
    }

    /* JADX INFO: renamed from: Y2 */
    public void m181872Y2(BLiveGameOperationConfig bLiveGameOperationConfig) {
        if (TextUtils.isEmpty(bLiveGameOperationConfig.url)) {
            return;
        }
        mbs.m157834T(getAct(), Uri.parse(bLiveGameOperationConfig.url));
    }
}

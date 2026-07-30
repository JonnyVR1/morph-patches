package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class j0n extends svs {

    /* JADX INFO: renamed from: f */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f115691f;

    /* JADX INFO: renamed from: g */
    public boolean f115692g;

    /* JADX INFO: renamed from: h */
    public boolean f115693h;

    /* JADX INFO: renamed from: i */
    public boolean f115694i;

    public j0n(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f115691f = new zpd0("showActiveGift", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public C22306c<Boolean> m139188W2() {
        if (this.f115694i) {
            return C22306c.just(Boolean.TRUE);
        }
        return (this.f115692g || !this.f115693h || this.f115691f.get().longValue() == mqi0.m155943n()) ? C22306c.just(Boolean.FALSE) : duringCreated(m139189X2()).flatMap(new w9j() { // from class: l.h0n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105227a.m139195b3((LiveSquareActiveGiftBean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public static C22306c<LiveSquareActiveGiftBean> m139189X2() {
        fbn.Companion companion = fbn.INSTANCE;
        return companion.m120382v() ? companion.m120375l() : LiveExternalApi.buildLiveRead(LiveApiBuilder.m67307m(ytr.m216073b("/live/popup?source=activity-rewards")).m107537d(), "getActiveGiftRequest", g7t.m124730c(LiveSquareActiveGiftBean.class, "livePopup"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m139190Y2(Boolean bool) {
        this.f115692g = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m139191Z2(s2u.C19834a c19834a) {
        boolean zEquals = TextUtils.equals("p_live_recommend", c19834a.f162016a);
        this.f115693h = zEquals;
        if (zEquals) {
            m139193d3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ C22306c m139192a3(x40 x40Var) {
        return m139188W2();
    }

    /* JADX INFO: renamed from: d3 */
    private void m139193d3() {
        duringCreated(new v9j() { // from class: l.g0n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f100063a.m139188W2();
            }
        }).subscribe(ffw.m121192c());
    }

    /* JADX INFO: renamed from: e3 */
    private void m139194e3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f115694i = true;
        dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110962Q(s6c0.f162703S).m110961P(false).m110986o0(new DialogInterface.OnShowListener() { // from class: l.i0n
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f110365a.m139196c3(dialogInterface);
            }
        }).m110989r0();
        dd80VarM110989r0.setCanceledOnTouchOutside(false);
        ((IntlLiveSquareActiveGiftDialogView) dd80VarM110989r0.m110906L()).m70347S(act, dd80VarM110989r0, liveSquareActiveGiftBean);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(s2u.m182077i()).subscribe(ffw.m121193d(new e30() { // from class: l.d0n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83198a.m139190Y2((Boolean) obj);
            }
        }));
        duringCreated(s2u.m182078j()).subscribe(ffw.m121193d(new e30() { // from class: l.e0n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88653a.m139191Z2((s2u.C19834a) obj);
            }
        }));
        m151641E2(x40.class, new w9j() { // from class: l.f0n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93990a.m139192a3((x40) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ C22306c m139195b3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || TextUtils.isEmpty(liveSquareActiveGiftBean.getPictureUrl()) || this.f115692g || !this.f115693h || this.f115691f.get().longValue() == mqi0.m155943n() || this.f115694i) {
            return C22306c.just(Boolean.FALSE);
        }
        m139194e3(liveSquareActiveGiftBean);
        return C22306c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m139196c3(DialogInterface dialogInterface) {
        this.f115691f.put(Long.valueOf(mqi0.m155943n()));
    }
}

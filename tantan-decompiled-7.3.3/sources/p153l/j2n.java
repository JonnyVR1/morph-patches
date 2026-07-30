package p153l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareActiveGiftDialogView;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class j2n extends txs {

    /* JADX INFO: renamed from: f */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f118069f;

    /* JADX INFO: renamed from: g */
    public boolean f118070g;

    /* JADX INFO: renamed from: h */
    public boolean f118071h;

    /* JADX INFO: renamed from: i */
    public boolean f118072i;

    public j2n(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f118069f = new byd0("showActiveGift", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public C22421c<Boolean> m143229W2() {
        if (this.f118072i) {
            return C22421c.just(Boolean.TRUE);
        }
        return (this.f118070g || !this.f118071h || this.f118069f.get().longValue() == pzi0.m174453n()) ? C22421c.just(Boolean.FALSE) : duringCreated(m143230X2()).flatMap(new qcj() { // from class: l.h2n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107567a.m143236b3((LiveSquareActiveGiftBean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public static C22421c<LiveSquareActiveGiftBean> m143230X2() {
        fdn.Companion companion = fdn.INSTANCE;
        return companion.m125126v() ? companion.m125119l() : LiveExternalApi.buildLiveRead(LiveApiBuilder.m68490m(zvr.m221802b("/live/popup?source=activity-rewards")).m182301d(), "getActiveGiftRequest", h9t.m134086c(LiveSquareActiveGiftBean.class, "livePopup"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m143231Y2(Boolean bool) {
        this.f118070g = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public /* synthetic */ void m143232Z2(t4u.C20236a c20236a) {
        boolean zEquals = TextUtils.equals("p_live_recommend", c20236a.f172139a);
        this.f118071h = zEquals;
        if (zEquals) {
            m143234d3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ C22421c m143233a3(r40 r40Var) {
        return m143229W2();
    }

    /* JADX INFO: renamed from: d3 */
    private void m143234d3() {
        duringCreated(new pcj() { // from class: l.g2n
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f101860a.m143229W2();
            }
        }).subscribe(dhw.m115824c());
    }

    /* JADX INFO: renamed from: e3 */
    private void m143235e3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f118072i = true;
        jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146022Q(xec0.f193817S).m146021P(false).m146046o0(new DialogInterface.OnShowListener() { // from class: l.i2n
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f112658a.m143237c3(dialogInterface);
            }
        }).m146049r0();
        jl80VarM146049r0.setCanceledOnTouchOutside(false);
        ((IntlLiveSquareActiveGiftDialogView) jl80VarM146049r0.m145966L()).m71530S(act, jl80VarM146049r0, liveSquareActiveGiftBean);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(t4u.m189320i()).subscribe(dhw.m115825d(new y20() { // from class: l.d2n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84800a.m143231Y2((Boolean) obj);
            }
        }));
        duringCreated(t4u.m189321j()).subscribe(dhw.m115825d(new y20() { // from class: l.e2n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91800a.m143232Z2((t4u.C20236a) obj);
            }
        }));
        m160237E2(r40.class, new qcj() { // from class: l.f2n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96891a.m143233a3((r40) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ C22421c m143236b3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || TextUtils.isEmpty(liveSquareActiveGiftBean.getPictureUrl()) || this.f118070g || !this.f118071h || this.f118069f.get().longValue() == pzi0.m174453n() || this.f118072i) {
            return C22421c.just(Boolean.FALSE);
        }
        m143235e3(liveSquareActiveGiftBean);
        return C22421c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m143237c3(DialogInterface dialogInterface) {
        this.f118069f.put(Long.valueOf(pzi0.m174453n()));
    }
}

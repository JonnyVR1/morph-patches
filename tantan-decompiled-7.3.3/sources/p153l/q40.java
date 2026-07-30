package p153l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class q40 extends txs {

    /* JADX INFO: renamed from: f */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f155505f;

    /* JADX INFO: renamed from: g */
    public boolean f155506g;

    /* JADX INFO: renamed from: h */
    public boolean f155507h;

    /* JADX INFO: renamed from: i */
    public boolean f155508i;

    public q40(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
        this.f155505f = new byd0("showActiveGift", 0L);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(t4u.m189320i()).subscribe(dhw.m115825d(new y20() { // from class: l.j40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118229a.m175170Y2((Boolean) obj);
            }
        }));
        duringCreated(t4u.m189321j()).subscribe(dhw.m115825d(new y20() { // from class: l.k40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123804a.m175171Z2((t4u.C20236a) obj);
            }
        }));
        m160237E2(r40.class, new qcj() { // from class: l.l40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129923a.m175172a3((r40) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public final C22421c<Boolean> m175169X2() {
        if (this.f155508i) {
            return C22421c.just(Boolean.TRUE);
        }
        return (this.f155506g || !this.f155507h || this.f155505f.get().longValue() == pzi0.m174453n()) ? C22421c.just(Boolean.FALSE) : duringCreated(LiveSquareApi.getActiveGiftRequest()).flatMap(new qcj() { // from class: l.m40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134724a.m175174c3((LiveSquareActiveGiftBean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m175170Y2(Boolean bool) {
        this.f155506g = bool.booleanValue();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m175171Z2(t4u.C20236a c20236a) {
        boolean zEquals = TextUtils.equals("p_live_recommend", c20236a.f172139a);
        this.f155507h = zEquals;
        if (zEquals) {
            m175176e3();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ C22421c m175172a3(r40 r40Var) {
        return m175169X2();
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m175173b3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (ppi0.m173207l().m173215j() || ppi0.m173207l().m173228x() || this.f155508i) {
            return;
        }
        m175177f3(liveSquareActiveGiftBean);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ C22421c m175174c3(final LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || TextUtils.isEmpty(liveSquareActiveGiftBean.getPictureUrl()) || this.f155506g || !this.f155507h || getAct() == null || this.f155505f.get().longValue() == pzi0.m174453n()) {
            return C22421c.just(Boolean.FALSE);
        }
        l51.m152888H(getAct(), new Runnable() { // from class: l.o40
            @Override // java.lang.Runnable
            public final void run() {
                this.f144875a.m175173b3(liveSquareActiveGiftBean);
            }
        }, 1000L);
        return C22421c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m175175d3(DialogInterface dialogInterface) {
        this.f155505f.put(Long.valueOf(pzi0.m174453n()));
    }

    /* JADX INFO: renamed from: e3 */
    public final void m175176e3() {
        duringCreated(new pcj() { // from class: l.n40
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f140050a.m175169X2();
            }
        }).subscribe(dhw.m115824c());
    }

    /* JADX INFO: renamed from: f3 */
    public final void m175177f3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f155508i = true;
        jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146022Q(xec0.f193788I0).m146021P(false).m146046o0(new DialogInterface.OnShowListener() { // from class: l.p40
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f150483a.m175175d3(dialogInterface);
            }
        }).m146049r0();
        jl80VarM146049r0.setCanceledOnTouchOutside(false);
        ((LiveSquareActiveGiftDialogView) jl80VarM146049r0.m145966L()).m72091S(act, jl80VarM146049r0, liveSquareActiveGiftBean);
    }
}

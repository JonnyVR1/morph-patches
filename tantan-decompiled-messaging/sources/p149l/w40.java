package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSquareActiveGiftDialogView;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class w40 extends svs {

    /* JADX INFO: renamed from: f */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f184464f;

    /* JADX INFO: renamed from: g */
    public boolean f184465g;

    /* JADX INFO: renamed from: h */
    public boolean f184466h;

    /* JADX INFO: renamed from: i */
    public boolean f184467i;

    public w40(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
        this.f184464f = new zpd0("showActiveGift", 0L);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(s2u.m182077i()).subscribe(ffw.m121193d(new e30() { // from class: l.p40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147027a.m201454Y2((Boolean) obj);
            }
        }));
        duringCreated(s2u.m182078j()).subscribe(ffw.m121193d(new e30() { // from class: l.q40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152531a.m201455Z2((s2u.C19834a) obj);
            }
        }));
        m151641E2(x40.class, new w9j() { // from class: l.r40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157626a.m201456a3((x40) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public final C22306c<Boolean> m201453X2() {
        if (this.f184467i) {
            return C22306c.just(Boolean.TRUE);
        }
        return (this.f184465g || !this.f184466h || this.f184464f.get().longValue() == mqi0.m155943n()) ? C22306c.just(Boolean.FALSE) : duringCreated(LiveSquareApi.getActiveGiftRequest()).flatMap(new w9j() { // from class: l.s40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f162208a.m201458c3((LiveSquareActiveGiftBean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m201454Y2(Boolean bool) {
        this.f184465g = bool.booleanValue();
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m201455Z2(s2u.C19834a c19834a) {
        boolean zEquals = TextUtils.equals("p_live_recommend", c19834a.f162016a);
        this.f184466h = zEquals;
        if (zEquals) {
            m201460e3();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ C22306c m201456a3(x40 x40Var) {
        return m201453X2();
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m201457b3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (pgi0.m168730l().m168738j() || pgi0.m168730l().m168751x() || this.f184467i) {
            return;
        }
        m201461f3(liveSquareActiveGiftBean);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ C22306c m201458c3(final LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        if (liveSquareActiveGiftBean == null || TextUtils.isEmpty(liveSquareActiveGiftBean.getPictureUrl()) || this.f184465g || !this.f184466h || getAct() == null || this.f184464f.get().longValue() == mqi0.m155943n()) {
            return C22306c.just(Boolean.FALSE);
        }
        e51.m114743H(getAct(), new Runnable() { // from class: l.u40
            @Override // java.lang.Runnable
            public final void run() {
                this.f173677a.m201457b3(liveSquareActiveGiftBean);
            }
        }, 1000L);
        return C22306c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m201459d3(DialogInterface dialogInterface) {
        this.f184464f.put(Long.valueOf(mqi0.m155943n()));
    }

    /* JADX INFO: renamed from: e3 */
    public final void m201460e3() {
        duringCreated(new v9j() { // from class: l.t40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f167679a.m201453X2();
            }
        }).subscribe(ffw.m121192c());
    }

    /* JADX INFO: renamed from: f3 */
    public final void m201461f3(LiveSquareActiveGiftBean liveSquareActiveGiftBean) {
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f184467i = true;
        dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110962Q(s6c0.f162674I0).m110961P(false).m110986o0(new DialogInterface.OnShowListener() { // from class: l.v40
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f179872a.m201459d3(dialogInterface);
            }
        }).m110989r0();
        dd80VarM110989r0.setCanceledOnTouchOutside(false);
        ((LiveSquareActiveGiftDialogView) dd80VarM110989r0.m110906L()).m70908S(act, dd80VarM110989r0, liveSquareActiveGiftBean);
    }
}

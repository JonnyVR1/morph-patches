package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class osc0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public NewBottomIconModuleInfo f148805i;

    /* JADX INFO: renamed from: j */
    public List<String> f148806j;

    /* JADX INFO: renamed from: k */
    public Map<String, jxd0> f148807k;

    /* JADX INFO: renamed from: l */
    public boolean f148808l;

    /* JADX INFO: renamed from: m */
    public String f148809m;

    public osc0(dum dumVar) {
        super(dumVar);
        this.f148806j = new ArrayList();
        this.f148807k = new HashMap();
        this.f148808l = false;
        this.f148809m = "layered";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m168973Z3(vxj0 vxj0Var) {
        m168983d4().put(Boolean.TRUE);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(bsc0.class, new qcj() { // from class: l.fsc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100602a.m168976V3((bsc0) obj);
            }
        });
        m138860d3(ym3.class, new qcj() { // from class: l.gsc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106267a.m168977W3((ym3) obj);
            }
        });
        m138860d3(fve0.class, new qcj() { // from class: l.hsc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111435a.m168978X3((fve0) obj);
            }
        });
        m138860d3(gve0.class, new qcj() { // from class: l.isc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f116640a.m168979Y3((gve0) obj);
            }
        });
        duringCreated(m213811F2().BottomEvent.onClearSignRedDot().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jsc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122448a.m168973Z3((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.markButtonClicked().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ksc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128554a.m168980a4((BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m168974T3(String str) {
        jxd0 jxd0Var = this.f148807k.get(str);
        if (jxd0Var == null) {
            jxd0Var = new jxd0("button_clicked_" + str + zrv.f205799a.m207631D0(), Boolean.FALSE);
            this.f148807k.put(str, jxd0Var);
        }
        return jxd0Var.get().booleanValue();
    }

    /* JADX INFO: renamed from: U3 */
    public boolean m168975U3(final String str) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) jyb.m147529r(this.f148805i.m73364t(), new qcj() { // from class: l.lsc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveBottomButton) obj).url));
            }
        });
        if (bLiveBottomButton == null) {
            return false;
        }
        return bLiveBottomButton.enableRedDot;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Boolean m168976V3(bsc0 bsc0Var) {
        return Boolean.valueOf(m168975U3(bsc0Var.f78137c));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Boolean m168977W3(ym3 ym3Var) {
        return Boolean.valueOf(m168974T3(ym3Var.f200638c));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m168978X3(fve0 fve0Var) {
        return Boolean.valueOf(this.f148808l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m168979Y3(gve0 gve0Var) {
        return m168983d4().get();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m168980a4(BLiveBottomButton bLiveBottomButton) {
        if (bLiveBottomButton != null) {
            m168982c4(bLiveBottomButton.url);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m168981b4(NewBottomIconModuleInfo newBottomIconModuleInfo, final Integer num) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) jyb.m147529r(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().buttons, new qcj() { // from class: l.nsc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveBottomButton) obj).f45187id == num.intValue());
            }
        });
        if (bLiveBottomButton != null) {
            this.f148806j.add(bLiveBottomButton.url);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m168982c4(String str) {
        jxd0 jxd0Var = this.f148807k.get(str);
        if (jxd0Var == null) {
            jxd0Var = new jxd0("button_clicked_" + str + zrv.f205799a.m207631D0(), Boolean.FALSE);
            this.f148807k.put(str, jxd0Var);
        }
        jxd0Var.put(Boolean.TRUE);
        if (TextUtils.equals(new zit(str).f112154a, "setting") && TextUtils.equals(this.f148809m, "layered")) {
            m213811F2().BottomEvent.setSettingButtonRedDot().mo199273j(Boolean.FALSE);
            this.f148808l = true;
        }
        if (this.f148806j.contains(str) && TextUtils.equals(this.f148809m, "interaction")) {
            m213811F2().BottomEvent.refreshSettingButtonRedDot().m199277p();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final jxd0 m168983d4() {
        return new jxd0("sign_clear" + pzi0.f154857d.format(new Date(pzi0.m174454o())) + zrv.f205799a.m207631D0(), Boolean.FALSE, false);
    }

    /* JADX INFO: renamed from: e4 */
    public void m168984e4(final NewBottomIconModuleInfo newBottomIconModuleInfo) {
        this.f148805i = newBottomIconModuleInfo;
        if (newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String() != null) {
            this.f148809m = newBottomIconModuleInfo.m73358n();
            if (!newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().enableSettingButton || newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().menu == null || jyb.m147479J(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().menu.settingZone)) {
                return;
            }
            jyb.m147537z(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().menu.settingZone, new y20() { // from class: l.msc0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f138470a.m168981b4(newBottomIconModuleInfo, (Integer) obj);
                }
            });
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f148807k.clear();
    }
}

package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.ffw;
import l.gwr;
import l.hpd0;
import l.mqi0;
import l.soj0;
import l.vwb;
import l.w9j;
import l.ygt;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hkc0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public NewBottomIconModuleInfo f12089i;

    /* JADX INFO: renamed from: j */
    public List<String> f12090j;

    /* JADX INFO: renamed from: k */
    public Map<String, hpd0> f12091k;

    /* JADX INFO: renamed from: l */
    public boolean f12092l;

    /* JADX INFO: renamed from: m */
    public String f12093m;

    public hkc0(bsm bsmVar) {
        super(bsmVar);
        this.f12090j = new ArrayList();
        this.f12091k = new HashMap();
        this.f12092l = false;
        this.f12093m = "layered";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m14425Z3(soj0 soj0Var) {
        m14436d4().put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T */
    public void m14426T() {
        super.T();
        m14188d3(ujc0.class, new w9j() { // from class: l.yjc0
            public final Object call(Object obj) {
                return this.f22937a.m14429V3((ujc0) obj);
            }
        });
        m14188d3(yl3.class, new w9j() { // from class: l.zjc0
            public final Object call(Object obj) {
                return this.f23451a.m14430W3((yl3) obj);
            }
        });
        m14188d3(yme0.class, new w9j() { // from class: l.akc0
            public final Object call(Object obj) {
                return this.f7669a.m14431X3((yme0) obj);
            }
        });
        m14188d3(zme0.class, new w9j() { // from class: l.bkc0
            public final Object call(Object obj) {
                return this.f8208a.m14432Y3((zme0) obj);
            }
        });
        duringCreated((c) m25548F2().BottomEvent.onClearSignRedDot().g()).subscribe(ffw.d(new e30() { // from class: l.ckc0
            public final void call(Object obj) {
                this.f8723a.m14425Z3((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.markButtonClicked().g()).subscribe(ffw.d(new e30() { // from class: l.dkc0
            public final void call(Object obj) {
                this.f9312a.m14433a4((BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m14427T3(String str) {
        hpd0 hpd0Var = this.f12091k.get(str);
        if (hpd0Var == null) {
            hpd0Var = new hpd0("button_clicked_" + str + ypv.a.D0(), Boolean.FALSE);
            this.f12091k.put(str, hpd0Var);
        }
        return ((Boolean) hpd0Var.get()).booleanValue();
    }

    /* JADX INFO: renamed from: U3 */
    public boolean m14428U3(final String str) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) vwb.r(this.f12089i.m5654t(), new w9j() { // from class: l.ekc0
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
    public final /* synthetic */ Boolean m14429V3(ujc0 ujc0Var) {
        return Boolean.valueOf(m14428U3(ujc0Var.f20674c));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Boolean m14430W3(yl3 yl3Var) {
        return Boolean.valueOf(m14427T3(yl3Var.f22961c));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m14431X3(yme0 yme0Var) {
        return Boolean.valueOf(this.f12092l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m14432Y3(zme0 zme0Var) {
        return (Boolean) m14436d4().get();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m14433a4(BLiveBottomButton bLiveBottomButton) {
        if (bLiveBottomButton != null) {
            m14435c4(bLiveBottomButton.url);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m14434b4(NewBottomIconModuleInfo newBottomIconModuleInfo, final Integer num) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) vwb.r(newBottomIconModuleInfo.getMenu().buttons, new w9j() { // from class: l.gkc0
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveBottomButton) obj).id == num.intValue());
            }
        });
        if (bLiveBottomButton != null) {
            this.f12090j.add(bLiveBottomButton.url);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m14435c4(String str) {
        hpd0 hpd0Var = this.f12091k.get(str);
        if (hpd0Var == null) {
            hpd0Var = new hpd0("button_clicked_" + str + ypv.a.D0(), Boolean.FALSE);
            this.f12091k.put(str, hpd0Var);
        }
        hpd0Var.put(Boolean.TRUE);
        if (TextUtils.equals(((gwr) new ygt(str)).a, "setting") && TextUtils.equals(this.f12093m, "layered")) {
            m25548F2().BottomEvent.setSettingButtonRedDot().j(Boolean.FALSE);
            this.f12092l = true;
        }
        if (this.f12090j.contains(str) && TextUtils.equals(this.f12093m, "interaction")) {
            m25548F2().BottomEvent.refreshSettingButtonRedDot().p();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final hpd0 m14436d4() {
        return new hpd0("sign_clear" + mqi0.d.format(new Date(mqi0.o())) + ypv.a.D0(), Boolean.FALSE, false);
    }

    /* JADX INFO: renamed from: e4 */
    public void m14437e4(final NewBottomIconModuleInfo newBottomIconModuleInfo) {
        this.f12089i = newBottomIconModuleInfo;
        if (newBottomIconModuleInfo.getMenu() != null) {
            this.f12093m = newBottomIconModuleInfo.m5648n();
            if (!newBottomIconModuleInfo.getMenu().enableSettingButton || newBottomIconModuleInfo.getMenu().menu == null || vwb.J(newBottomIconModuleInfo.getMenu().menu.settingZone)) {
                return;
            }
            vwb.z(newBottomIconModuleInfo.getMenu().menu.settingZone, new e30() { // from class: l.fkc0
                public final void call(Object obj) {
                    this.f10437a.m14434b4(newBottomIconModuleInfo, (Integer) obj);
                }
            });
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f12091k.clear();
    }
}

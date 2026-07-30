package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class hkc0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public NewBottomIconModuleInfo f108170i;

    /* JADX INFO: renamed from: j */
    public List<String> f108171j;

    /* JADX INFO: renamed from: k */
    public Map<String, hpd0> f108172k;

    /* JADX INFO: renamed from: l */
    public boolean f108173l;

    /* JADX INFO: renamed from: m */
    public String f108174m;

    public hkc0(bsm bsmVar) {
        super(bsmVar);
        this.f108171j = new ArrayList();
        this.f108172k = new HashMap();
        this.f108173l = false;
        this.f108174m = "layered";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m131472Z3(soj0 soj0Var) {
        m131482d4().put(Boolean.TRUE);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(ujc0.class, new w9j() { // from class: l.yjc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198623a.m131475V3((ujc0) obj);
            }
        });
        m129301d3(yl3.class, new w9j() { // from class: l.zjc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203396a.m131476W3((yl3) obj);
            }
        });
        m129301d3(yme0.class, new w9j() { // from class: l.akc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70268a.m131477X3((yme0) obj);
            }
        });
        m129301d3(zme0.class, new w9j() { // from class: l.bkc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76010a.m131478Y3((zme0) obj);
            }
        });
        duringCreated(m206028F2().BottomEvent.onClearSignRedDot().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ckc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81323a.m131472Z3((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.markButtonClicked().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.dkc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86643a.m131479a4((BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m131473T3(String str) {
        hpd0 hpd0Var = this.f108172k.get(str);
        if (hpd0Var == null) {
            hpd0Var = new hpd0("button_clicked_" + str + ypv.f199493a.m199309D0(), Boolean.FALSE);
            this.f108172k.put(str, hpd0Var);
        }
        return hpd0Var.get().booleanValue();
    }

    /* JADX INFO: renamed from: U3 */
    public boolean m131474U3(final String str) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) vwb.m200346r(this.f108170i.m72181t(), new w9j() { // from class: l.ekc0
            @Override // p149l.w9j
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
    public final /* synthetic */ Boolean m131475V3(ujc0 ujc0Var) {
        return Boolean.valueOf(m131474U3(ujc0Var.f176755c));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Boolean m131476W3(yl3 yl3Var) {
        return Boolean.valueOf(m131473T3(yl3Var.f198859c));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m131477X3(yme0 yme0Var) {
        return Boolean.valueOf(this.f108173l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ Boolean m131478Y3(zme0 zme0Var) {
        return m131482d4().get();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m131479a4(BLiveBottomButton bLiveBottomButton) {
        if (bLiveBottomButton != null) {
            m131481c4(bLiveBottomButton.url);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m131480b4(NewBottomIconModuleInfo newBottomIconModuleInfo, final Integer num) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) vwb.m200346r(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().buttons, new w9j() { // from class: l.gkc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveBottomButton) obj).f44339id == num.intValue());
            }
        });
        if (bLiveBottomButton != null) {
            this.f108171j.add(bLiveBottomButton.url);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m131481c4(String str) {
        hpd0 hpd0Var = this.f108172k.get(str);
        if (hpd0Var == null) {
            hpd0Var = new hpd0("button_clicked_" + str + ypv.f199493a.m199309D0(), Boolean.FALSE);
            this.f108172k.put(str, hpd0Var);
        }
        hpd0Var.put(Boolean.TRUE);
        if (TextUtils.equals(new ygt(str).f104769a, "setting") && TextUtils.equals(this.f108174m, "layered")) {
            m206028F2().BottomEvent.setSettingButtonRedDot().mo172463j(Boolean.FALSE);
            this.f108173l = true;
        }
        if (this.f108171j.contains(str) && TextUtils.equals(this.f108174m, "interaction")) {
            m206028F2().BottomEvent.refreshSettingButtonRedDot().m172467p();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final hpd0 m131482d4() {
        return new hpd0("sign_clear" + mqi0.f135252d.format(new Date(mqi0.m155944o())) + ypv.f199493a.m199309D0(), Boolean.FALSE, false);
    }

    /* JADX INFO: renamed from: e4 */
    public void m131483e4(final NewBottomIconModuleInfo newBottomIconModuleInfo) {
        this.f108170i = newBottomIconModuleInfo;
        if (newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String() != null) {
            this.f108174m = newBottomIconModuleInfo.m72175n();
            if (!newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().enableSettingButton || newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().menu == null || vwb.m200296J(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().menu.settingZone)) {
                return;
            }
            vwb.m200354z(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().menu.settingZone, new e30() { // from class: l.fkc0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98054a.m131480b4(newBottomIconModuleInfo, (Integer) obj);
                }
            });
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f108172k.clear();
    }
}

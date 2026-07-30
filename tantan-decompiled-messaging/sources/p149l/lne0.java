package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class lne0 extends h4t<nnn0, be3> {

    /* JADX INFO: renamed from: i */
    public List<mim0<?>> f128985i;

    /* JADX INFO: renamed from: j */
    public gb3 f128986j;

    public lne0(bsm<nnn0> bsmVar) {
        super(bsmVar);
        this.f128985i = new ArrayList();
        mo51532C(new be3());
    }

    /* JADX INFO: renamed from: P3 */
    private void m150676P3() {
        ((be3) this.viewModel).m101310e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m150677S3(soj0 soj0Var) {
        m150679W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m150678T3(soj0 soj0Var) {
        m150676P3();
    }

    /* JADX INFO: renamed from: W3 */
    private void m150679W3() {
        m206028F2().BottomEvent.onSettingDialogShow().m172467p();
        ((be3) this.viewModel).m101315l();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m150680R3(Area area) {
        m150682V3(this.f128986j, this.f128985i);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: U3 */
    public void m150681U3() {
        m206028F2().BottomEvent.onSettingDialogDismiss().m172467p();
    }

    /* JADX INFO: renamed from: V3 */
    public void m150682V3(gb3 gb3Var, List<mim0<?>> list) {
        this.f128985i = list;
        this.f128986j = gb3Var;
        ArrayList arrayList = new ArrayList();
        int iMo154722E = 0;
        boolean zMo108806l1 = false;
        for (final mim0<?> mim0Var : list) {
            BLiveSettingButtonCategory bLiveSettingButtonCategory = (BLiveSettingButtonCategory) vwb.m200346r(gb3Var.f101794d, new w9j() { // from class: l.jne0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveSettingButtonCategory) obj).f44435id == mim0Var.f134019m.category);
                }
            });
            if (bLiveSettingButtonCategory == null) {
                return;
            }
            if (!zMo108806l1) {
                zMo108806l1 = mim0Var.mo108806l1();
            }
            iMo154722E += mim0Var.mo154722E();
            tb3<?> tb3VarM154736g4 = mim0Var.m154736g4(arrayList.size(), bLiveSettingButtonCategory);
            if (tb3VarM154736g4 != null) {
                arrayList.add(tb3VarM154736g4);
            }
        }
        ((hdv) ypv.m215673l(fld0.f98150e)).f107304j.put(Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.kne0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tb3) obj).m187792I().isGiftSwitch());
            }
        })));
        ((be3) this.viewModel).m101314k(arrayList);
        if (iMo154722E == 0) {
            iMo154722E = zMo108806l1 ? -1 : 0;
        }
        m206028F2().BottomZoneEvent.setSettingButtonRedPoint().mo172463j(Integer.valueOf(iMo154722E));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().BottomZoneEvent.refreshButton().m172460g()).filter(new w9j() { // from class: l.fne0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Area) obj) == Area.SETTING);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.gne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103596a.m150680R3((Area) obj);
            }
        }));
        duringCreated(m206028F2().BottomZoneEvent.showSettingDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.hne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108613a.m150677S3((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomZoneEvent.hideSettingDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ine0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114011a.m150678T3((soj0) obj);
            }
        }));
    }
}

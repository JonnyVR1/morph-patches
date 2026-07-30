package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class sfn0 extends h4t<nnn0, bfn0> {

    /* JADX INFO: renamed from: i */
    public List<mim0<?>> f164318i;

    /* JADX INFO: renamed from: j */
    public gb3 f164319j;

    /* JADX INFO: renamed from: k */
    public List<Object> f164320k;

    /* JADX INFO: renamed from: l */
    public List<tb3<?>> f164321l;

    /* JADX INFO: renamed from: m */
    public final jkm0 f164322m;

    public sfn0(bsm<nnn0> bsmVar) {
        super(bsmVar);
        this.f164318i = new ArrayList();
        this.f164320k = new ArrayList();
        this.f164321l = new ArrayList();
        mo51532C(new bfn0());
        this.f164322m = (jkm0) m144512z2(new jkm0(bsmVar));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ gb3 m183949J3(BLiveEnvelope bLiveEnvelope) {
        return new gb3(bLiveEnvelope.data.bottomMenu);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Boolean m183950K3(tb3 tb3Var) {
        ub3<?> ub3Var;
        ub3<?> ub3Var2;
        if (!(tb3Var instanceof z7o0) || (ub3Var2 = ((z7o0) tb3Var).f202045l) == null) {
            return (!(tb3Var instanceof z8n0) || (ub3Var = ((z8n0) tb3Var).f202190l) == null) ? Boolean.FALSE : Boolean.valueOf(ub3Var.mo108806l1());
        }
        return Boolean.valueOf(ub3Var2.mo108806l1());
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m183963Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m183964Z3(gb3 gb3Var, List list, final mim0 mim0Var) {
        tb3<?> tb3VarM154736g4;
        BLiveSettingButtonCategory bLiveSettingButtonCategory = (BLiveSettingButtonCategory) vwb.m200346r(gb3Var.f101794d, new w9j() { // from class: l.gfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSettingButtonCategory) obj).f44435id == mim0Var.f134019m.category);
            }
        });
        if (bLiveSettingButtonCategory == null || (tb3VarM154736g4 = mim0Var.m154736g4(list.size(), bLiveSettingButtonCategory)) == null) {
            return;
        }
        list.add(tb3VarM154736g4);
    }

    /* JADX INFO: renamed from: b4 */
    private List<mim0<?>> m183965b4(final gb3 gb3Var, List<Integer> list, final Area area) {
        final ArrayList arrayList = new ArrayList();
        final int[] iArr = {0};
        vwb.m200354z(list, new e30() { // from class: l.ffn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97270a.m183976f4(gb3Var, area, iArr, arrayList, (Integer) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c4 */
    private void m183966c4() {
        ((bfn0) this.viewModel).m101557e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m183967g4(Area area) {
        m183978m4(this.f164319j, this.f164318i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m183968h4(soj0 soj0Var) {
        m183972n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m183969i4(soj0 soj0Var) {
        m183966c4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m183970k4() {
        BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((nnn0) m206027E2()).m160261Y2();
        boolean z = false;
        if (bLiveVoiceCallM160261Y2 != null && alk0.m97309h(bLiveVoiceCallM160261Y2) && !m206032L2()) {
            z = true;
        }
        duringCreated((C22306c) VoiceRoomApiProvider.requestBottomButtons(((nnn0) m206027E2()).m149818o(), m206032L2(), z, ((nnn0) m206027E2()).mo149813j().liveMode, ((nnn0) m206027E2()).m132140j0()).filter(new w9j() { // from class: l.mfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.bottomMenu != null);
            }
        }).map(new w9j() { // from class: l.nfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sfn0.m183949J3((BLiveEnvelope) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.ofn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143727a.m183971l4((gb3) obj);
            }
        }, new e30() { // from class: l.pfn0
            @Override // p149l.e30
            public final void call(Object obj) {
                sfn0.m183963Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public void m183971l4(gb3 gb3Var) {
        if (!gb3Var.f101800j || gb3Var.f101795e == null) {
            return;
        }
        this.f164322m.m141898O3();
        List<mim0<?>> listM183965b4 = m183965b4(gb3Var, gb3Var.f101795e.settingZone, Area.SETTING);
        this.f164322m.m141894K3();
        m183978m4(gb3Var, listM183965b4);
        ((bfn0) this.viewModel).m101559l();
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("voiceRoomGameCenterBubble");
    }

    /* JADX INFO: renamed from: n4 */
    private void m183972n4() {
        m206028F2().BottomEvent.onSettingDialogShow().m172467p();
        m183970k4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: a4 */
    public int m183973a4(List<tb3<?>> list) {
        return (vwb.m200296J(list) || ((tb3) vwb.m200346r(list, new w9j() { // from class: l.hfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sfn0.m183950K3((tb3) obj);
            }
        })) == null) ? 0 : -1;
    }

    /* JADX INFO: renamed from: d4 */
    public final Map<String, List<tb3<?>>> m183974d4(List<tb3<?>> list, w9j<tb3<?>, String> w9jVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (tb3<?> tb3Var : list) {
            String strCall = w9jVar.call(tb3Var);
            List arrayList = (List) linkedHashMap.get(strCall);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strCall, arrayList);
            }
            arrayList.add(tb3Var);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m183975e4(final int i) {
        return vwb.m200346r(this.f164318i, new w9j() { // from class: l.qfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((mim0) obj).m154732Z3() == i);
            }
        }) != null;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m183976f4(gb3 gb3Var, Area area, int[] iArr, List list, final Integer num) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) vwb.m200346r(gb3Var.f101793c, new w9j() { // from class: l.ifn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(num.intValue() == ((BLiveBottomButton) obj).f44339id);
            }
        });
        if (bLiveBottomButton == null) {
            return;
        }
        ge3.m125662a(bLiveBottomButton);
        mim0<?> mim0VarM141895L3 = this.f164322m.m141895L3(bLiveBottomButton, area, gb3Var.f101797g);
        if (mim0VarM141895L3 != null) {
            int i = iArr[0] + 1;
            iArr[0] = i;
            mim0VarM141895L3.f134017k = i;
            list.add(mim0VarM141895L3);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m183977j4() {
        m206028F2().BottomEvent.onSettingDialogDismiss().m172467p();
    }

    /* JADX INFO: renamed from: m4 */
    public void m183978m4(final gb3 gb3Var, List<mim0<?>> list) {
        this.f164318i = list;
        this.f164319j = gb3Var;
        final plk plkVar = new plk();
        vwb.m200354z(list, new e30() { // from class: l.rfn0
            @Override // p149l.e30
            public final void call(Object obj) {
                sfn0.m183964Z3(gb3Var, plkVar, (mim0) obj);
            }
        });
        ((hdv) ypv.m215673l(fld0.f98150e)).f107304j.put(Boolean.valueOf(vwb.m200337m(plkVar, new w9j() { // from class: l.dfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tb3) obj).m187792I().isGiftSwitch());
            }
        })));
        m206028F2().BottomZoneEvent.setSettingButtonRedPoint().mo172463j(Integer.valueOf(m183973a4(plkVar)));
        ((bfn0) this.viewModel).m101558k(m183974d4(plkVar, new w9j() { // from class: l.efn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((tb3) obj).mo109668r1();
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f164320k.clear();
        this.f164321l.clear();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().BottomZoneEvent.refreshButton().m172460g()).filter(new w9j() { // from class: l.cfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Area) obj) == Area.SETTING);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.jfn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117678a.m183967g4((Area) obj);
            }
        }));
        duringCreated(m206028F2().BottomZoneEvent.showSettingDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.kfn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122952a.m183968h4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomZoneEvent.hideSettingDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lfn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127913a.m183969i4((soj0) obj);
            }
        }));
    }
}

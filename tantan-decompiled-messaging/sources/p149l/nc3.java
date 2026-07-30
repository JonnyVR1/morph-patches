package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceIntlCommonMsg;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class nc3 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public final jkm0 f138091i;

    /* JADX INFO: renamed from: j */
    public final xyb0 f138092j;

    /* JADX INFO: renamed from: k */
    public lne0 f138093k;

    /* JADX INFO: renamed from: l */
    public sfn0 f138094l;

    public nc3(bsm bsmVar, VoiceBottomView voiceBottomView) {
        super(bsmVar);
        this.f138091i = (jkm0) m144512z2(new jkm0(bsmVar));
        this.f138092j = (xyb0) m144512z2(new xyb0(bsmVar, voiceBottomView.f52913b));
        if (vdt.m198092b(3)) {
            this.f138093k = (lne0) m144512z2(new lne0(bsmVar));
        } else {
            this.f138094l = (sfn0) m144512z2(new sfn0(bsmVar));
        }
        m144512z2(new cb3(bsmVar, voiceBottomView.f52912a));
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ gb3 m158849K3(BLiveEnvelope bLiveEnvelope) {
        BLiveBottomMenu bLiveBottomMenu = bLiveEnvelope.data.bottomMenu;
        StringBuilder sb = new StringBuilder("voice bottom menu:");
        sb.append(bLiveBottomMenu == null ? "null" : bLiveBottomMenu.toJson());
        gkh0.m126627j("[live]bottom", sb.toString());
        return new gb3(bLiveBottomMenu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ AbstractC16991g4.a m158864c4(hf3.C17295b c17295b) {
        sfn0 sfn0Var;
        AbstractC16991g4.a aVarM211748N3 = this.f138092j.m211748N3(c17295b.f107429d, c17295b.f107428c);
        return (aVarM211748N3 != null || vdt.m198092b(3) || (sfn0Var = this.f138094l) == null || !sfn0Var.m183975e4(c17295b.f107429d)) ? aVarM211748N3 : this.f138092j.m211750P3("settingButton");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    private void m158865m4() {
        boolean zM114323i;
        boolean zMo97490p;
        BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((nnn0) m206027E2()).m160261Y2();
        if (((nnn0) m206027E2()).m160271i3()) {
            zM114323i = e0o0.m114323i(this);
            zMo97490p = e0o0.m114321g(this);
        } else {
            boolean z = false;
            if (bLiveVoiceCallM160261Y2 != null && alk0.m97309h(bLiveVoiceCallM160261Y2) && !m206032L2()) {
                z = true;
            }
            zM114323i = z;
            zMo97490p = ((nnn0) m206027E2()).mo97490p();
        }
        duringCreated((C22306c) VoiceRoomApiProvider.requestBottomButtons(((nnn0) m206027E2()).m149818o(), zMo97490p, zM114323i, ((nnn0) m206027E2()).mo149813j().liveMode, ((nnn0) m206027E2()).m132140j0()).filter(new w9j() { // from class: l.yb3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.bottomMenu != null);
            }
        }).map(new w9j() { // from class: l.zb3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nc3.m158849K3((BLiveEnvelope) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.ac3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68772a.m158869e4((gb3) obj);
            }
        }, new e30() { // from class: l.bc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74899a.m158870f4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(hf3.C17295b.class, new w9j() { // from class: l.mc3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133081a.m158864c4((hf3.C17295b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public final void m158866a4(gb3 gb3Var, List<mim0<?>> list) {
        BLiveBottomButton bLiveBottomButtonNew_ = BLiveBottomButton.new_();
        bLiveBottomButtonNew_.name = gb3Var.f101791a.name;
        bLiveBottomButtonNew_.icon.add("");
        bLiveBottomButtonNew_.icon.add(gb3Var.f101791a.icon);
        bLiveBottomButtonNew_.type = "more";
        bLiveBottomButtonNew_.localType = BLiveButtonType.get("settingButton");
        bLiveBottomButtonNew_.url = "tantanapp://live/room/setting";
        mim0<?> mim0VarM141895L3 = this.f138091i.m141895L3(bLiveBottomButtonNew_, Area.BOTTOM, gb3Var.f101797g);
        if (mim0VarM141895L3 != null) {
            list.add(mim0VarM141895L3);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final List<mim0<?>> m158867b4(final gb3 gb3Var, List<Integer> list, final Area area) {
        final ArrayList arrayList = new ArrayList();
        final int[] iArr = {0};
        vwb.m200354z(list, new e30() { // from class: l.cc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80198a.m158868d4(gb3Var, area, iArr, arrayList, (Integer) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m158868d4(gb3 gb3Var, Area area, int[] iArr, List list, final Integer num) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) vwb.m200346r(gb3Var.f101793c, new w9j() { // from class: l.dc3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(num.intValue() == ((BLiveBottomButton) obj).f44339id);
            }
        });
        if (bLiveBottomButton == null) {
            return;
        }
        ge3.m125662a(bLiveBottomButton);
        mim0<?> mim0VarM141895L3 = this.f138091i.m141895L3(bLiveBottomButton, area, gb3Var.f101797g);
        if (mim0VarM141895L3 != null) {
            int i = iArr[0] + 1;
            iArr[0] = i;
            mim0VarM141895L3.f134017k = i;
            list.add(mim0VarM141895L3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m158870f4(Throwable th) {
        m158869e4(gb3.m125116a(((nnn0) m206027E2()).mo97490p()));
        StringBuilder sb = new StringBuilder("voice bottom refresh error:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.m130790a("[live]bottom", sb.toString());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m158871g4(BLiveVoiceCall bLiveVoiceCall) {
        m158865m4();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m158872h4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        m158865m4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m158873i4(soj0 soj0Var) {
        m158865m4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m158874j4(VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh voiceLiveBottomMenuRefresh) {
        m158865m4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m158875k4(LongLinkBottomMenu.LiveBottomMenuUpdate liveBottomMenuUpdate) {
        m158865m4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m158876l4(C4319c c4319c) {
        m158865m4();
    }

    /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
    public final void m158869e4(gb3 gb3Var) {
        List<mim0<?>> listM158867b4;
        this.f138091i.m141898O3();
        List<mim0<?>> listM158867b5 = m158867b4(gb3Var, gb3Var.f101795e.quickZone, Area.BOTTOM);
        if (gb3Var.f101800j) {
            listM158867b4 = m158867b4(gb3Var, gb3Var.f101795e.settingZone, Area.SETTING);
            m158866a4(gb3Var, listM158867b5);
        } else {
            listM158867b4 = null;
        }
        this.f138091i.m141894K3();
        this.f138092j.m211752S3(listM158867b5);
        if (gb3Var.f101800j) {
            if (vdt.m198092b(3)) {
                this.f138093k.m150682V3(gb3Var, listM158867b4);
            } else {
                this.f138094l.m183978m4(gb3Var, listM158867b4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m158865m4();
        duringCreated(((nnn0) m206027E2()).m160262Z2()).filter(new w9j() { // from class: l.xb3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                return Boolean.valueOf(alk0.m97309h(bLiveVoiceCall) || alk0.m97307f(bLiveVoiceCall));
            }
        }).distinctUntilChanged(new w9j() { // from class: l.ec3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.fc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96763a.m158871g4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().f170434c0).subscribe(ffw.m121193d(new e30() { // from class: l.gc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101983a.m158872h4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        duringCreated(m206028F2().BottomZoneEvent.refreshAllButton().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.hc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107006a.m158873i4((soj0) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189055K0()).subscribe(ffw.m121197h(new e30() { // from class: l.ic3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112426a.m158874j4((VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189149v()).subscribe(ffw.m121197h(new e30() { // from class: l.jc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117259a.m158875k4((LongLinkBottomMenu.LiveBottomMenuUpdate) obj);
            }
        }));
        act().lifecycle().filter(new w9j() { // from class: l.kc3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.lc3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127370a.m158876l4((C4319c) obj);
            }
        }));
    }
}

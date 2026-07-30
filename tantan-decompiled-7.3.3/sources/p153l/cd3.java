package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceIntlCommonMsg;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class cd3 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public final ntm0 f81100i;

    /* JADX INFO: renamed from: j */
    public final b7c0 f81101j;

    /* JADX INFO: renamed from: k */
    public sve0 f81102k;

    /* JADX INFO: renamed from: l */
    public won0 f81103l;

    public cd3(dum dumVar, VoiceBottomView voiceBottomView) {
        super(dumVar);
        this.f81100i = (ntm0) m153103z2(new ntm0(dumVar));
        this.f81101j = (b7c0) m153103z2(new b7c0(dumVar, voiceBottomView.f53761b));
        if (wft.m206159b(3)) {
            this.f81102k = (sve0) m153103z2(new sve0(dumVar));
        } else {
            this.f81103l = (won0) m153103z2(new won0(dumVar));
        }
        m153103z2(new rb3(dumVar, voiceBottomView.f53760a));
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ vb3 m109088K3(BLiveEnvelope bLiveEnvelope) {
        BLiveBottomMenu bLiveBottomMenu = bLiveEnvelope.data.bottomMenu;
        StringBuilder sb = new StringBuilder("voice bottom menu:");
        sb.append(bLiveBottomMenu == null ? "null" : bLiveBottomMenu.toJson());
        nsh0.m164608j("[live]bottom", sb.toString());
        return new vb3(bLiveBottomMenu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ AbstractC17128g4.a m109103c4(vf3.C20826b c20826b) {
        won0 won0Var;
        AbstractC17128g4.a aVarM102828N3 = this.f81101j.m102828N3(c20826b.f183878d, c20826b.f183877c);
        return (aVarM102828N3 != null || wft.m206159b(3) || (won0Var = this.f81103l) == null || !won0Var.m207325e4(c20826b.f183878d)) ? aVarM102828N3 : this.f81101j.m102830P3("settingButton");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    private void m109104m4() {
        boolean zM139138i;
        boolean zMo118373p;
        BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((rwn0) m213810E2()).m183423Y2();
        if (((rwn0) m213810E2()).m183434i3()) {
            zM139138i = i9o0.m139138i(this);
            zMo118373p = i9o0.m139136g(this);
        } else {
            boolean z = false;
            if (bLiveVoiceCallM183423Y2 != null && guk0.m132329h(bLiveVoiceCallM183423Y2) && !m213815L2()) {
                z = true;
            }
            zM139138i = z;
            zMo118373p = ((rwn0) m213810E2()).mo118373p();
        }
        duringCreated((C22421c) VoiceRoomApiProvider.requestBottomButtons(((rwn0) m213810E2()).m202194o(), zMo118373p, zM139138i, ((rwn0) m213810E2()).mo183435j().liveMode, ((rwn0) m213810E2()).m168526j0()).filter(new qcj() { // from class: l.nc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.bottomMenu != null);
            }
        }).map(new qcj() { // from class: l.oc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cd3.m109088K3((BLiveEnvelope) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.pc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151520a.m109108e4((vb3) obj);
            }
        }, new y20() { // from class: l.qc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156542a.m109109f4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(vf3.C20826b.class, new qcj() { // from class: l.bd3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76225a.m109103c4((vf3.C20826b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public final void m109105a4(vb3 vb3Var, List<qrm0<?>> list) {
        BLiveBottomButton bLiveBottomButtonNew_ = BLiveBottomButton.new_();
        bLiveBottomButtonNew_.name = vb3Var.f183193a.name;
        bLiveBottomButtonNew_.icon.add("");
        bLiveBottomButtonNew_.icon.add(vb3Var.f183193a.icon);
        bLiveBottomButtonNew_.type = "more";
        bLiveBottomButtonNew_.localType = BLiveButtonType.get("settingButton");
        bLiveBottomButtonNew_.url = "tantanapp://live/room/setting";
        qrm0<?> qrm0VarM164737L3 = this.f81100i.m164737L3(bLiveBottomButtonNew_, Area.BOTTOM, vb3Var.f183199g);
        if (qrm0VarM164737L3 != null) {
            list.add(qrm0VarM164737L3);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final List<qrm0<?>> m109106b4(final vb3 vb3Var, List<Integer> list, final Area area) {
        final ArrayList arrayList = new ArrayList();
        final int[] iArr = {0};
        jyb.m147537z(list, new y20() { // from class: l.rc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162061a.m109107d4(vb3Var, area, iArr, arrayList, (Integer) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m109107d4(vb3 vb3Var, Area area, int[] iArr, List list, final Integer num) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) jyb.m147529r(vb3Var.f183195c, new qcj() { // from class: l.sc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(num.intValue() == ((BLiveBottomButton) obj).f45187id);
            }
        });
        if (bLiveBottomButton == null) {
            return;
        }
        ve3.m201031a(bLiveBottomButton);
        qrm0<?> qrm0VarM164737L3 = this.f81100i.m164737L3(bLiveBottomButton, area, vb3Var.f183199g);
        if (qrm0VarM164737L3 != null) {
            int i = iArr[0] + 1;
            iArr[0] = i;
            qrm0VarM164737L3.f159146k = i;
            list.add(qrm0VarM164737L3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m109109f4(Throwable th) {
        m109108e4(vb3.m200684a(((rwn0) m213810E2()).mo118373p()));
        StringBuilder sb = new StringBuilder("voice bottom refresh error:");
        sb.append(th == null ? "null" : th.getMessage());
        fhw.m125605a("[live]bottom", sb.toString());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m109110g4(BLiveVoiceCall bLiveVoiceCall) {
        m109104m4();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m109111h4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        m109104m4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m109112i4(vxj0 vxj0Var) {
        m109104m4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m109113j4(VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh voiceLiveBottomMenuRefresh) {
        m109104m4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m109114k4(LongLinkBottomMenu.LiveBottomMenuUpdate liveBottomMenuUpdate) {
        m109104m4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m109115l4(C4470c c4470c) {
        m109104m4();
    }

    /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
    public final void m109108e4(vb3 vb3Var) {
        List<qrm0<?>> listM109106b4;
        this.f81100i.m164740O3();
        List<qrm0<?>> listM109106b5 = m109106b4(vb3Var, vb3Var.f183197e.quickZone, Area.BOTTOM);
        if (vb3Var.f183202j) {
            listM109106b4 = m109106b4(vb3Var, vb3Var.f183197e.settingZone, Area.SETTING);
            m109105a4(vb3Var, listM109106b5);
        } else {
            listM109106b4 = null;
        }
        this.f81100i.m164736K3();
        this.f81101j.m102832S3(listM109106b5);
        if (vb3Var.f183202j) {
            if (wft.m206159b(3)) {
                this.f81102k.m188208V3(vb3Var, listM109106b4);
            } else {
                this.f81103l.m207328m4(vb3Var, listM109106b4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m109104m4();
        duringCreated(((rwn0) m213810E2()).m183424Z2()).filter(new qcj() { // from class: l.mc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                return Boolean.valueOf(guk0.m132329h(bLiveVoiceCall) || guk0.m132327f(bLiveVoiceCall));
            }
        }).distinctUntilChanged(new qcj() { // from class: l.tc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.uc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178402a.m109110g4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().f71701c0).subscribe(dhw.m115825d(new y20() { // from class: l.vc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183317a.m109111h4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        duringCreated(m213811F2().BottomZoneEvent.refreshAllButton().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.wc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188317a.m109112i4((vxj0) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98237K0()).subscribe(dhw.m115829h(new y20() { // from class: l.xc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193255a.m109113j4((VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98331v()).subscribe(dhw.m115829h(new y20() { // from class: l.yc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198388a.m109114k4((LongLinkBottomMenu.LiveBottomMenuUpdate) obj);
            }
        }));
        act().lifecycle().filter(new qcj() { // from class: l.zc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ad3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69783a.m109115l4((C4470c) obj);
            }
        }));
    }
}

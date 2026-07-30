package p149l;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.LiveDialogAct;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.root.VoiceRoomView;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class pho0 extends AbstractC15533a6<fhm0, BLiveVoice, jfo0, VoiceRoomView> {

    /* JADX INFO: renamed from: j */
    public jfo0 f149029j;

    /* JADX INFO: renamed from: k */
    public final RoomFrag f149030k;

    /* JADX INFO: renamed from: l */
    public final l8d0 f149031l;

    /* JADX INFO: renamed from: m */
    public c4g0 f149032m;

    /* JADX INFO: renamed from: n */
    public c4g0 f149033n;

    /* JADX INFO: renamed from: o */
    public String f149034o;

    /* JADX WARN: Multi-variable type inference failed */
    public pho0(jfo0 jfo0Var, l8d0 l8d0Var, VoiceRoomView voiceRoomView) {
        super(jfo0Var);
        this.f149029j = jfo0Var;
        this.f149030k = (RoomFrag) jfo0Var.f77100f;
        this.f149031l = l8d0Var;
        mo51532C(voiceRoomView);
        jfo0Var.m103722a(this, (ViewGroup) this.viewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m169097A4(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((VoiceRoomView) v2).f53482e.m78413c(((fhm0) m206027E2()).mo149817n().bgPicType, ((fhm0) m206027E2()).mo149817n().backgroundUrl);
        } else {
            ((VoiceRoomView) v2).f53482e.m78413c(LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC, str);
        }
    }

    /* JADX INFO: renamed from: D4 */
    private void m169098D4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = act().dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m169101l4(Throwable th) {
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m169103n4() {
    }

    /* JADX INFO: renamed from: s4 */
    private void m169108s4() {
        mkd0.m154992z(this.f149033n);
        this.f149033n = duringCreated(((VoiceRoomView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.lho0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.m121194e(new e30() { // from class: l.mho0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133832a.m169109v4((Integer) obj);
            }
        }, new e30() { // from class: l.nho0
            @Override // p149l.e30
            public final void call(Object obj) {
                pho0.m169101l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m169109v4(Integer num) {
        m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(xdl0.m208412y0() - num.intValue(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m169110w4(iqv iqvVar) {
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129405d("voice_valid_state_module");
        m154640M3();
        h5j0Var.m129402a("voice_valid_state_module", "validStateModule");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m169111x4(BLiveSettings bLiveSettings) {
        ((fhm0) m206027E2()).m132094T0();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: B4, reason: merged with bridge method [inline-methods] */
    public void mo95097b4(boolean z, BLiveVoice bLiveVoice) {
        if (TextUtils.equals(this.f149034o, bLiveVoice.f44323id)) {
            return;
        }
        this.f149034o = bLiveVoice.f44323id;
        m206028F2().PreLoadEvent.preLoad().mo172463j(new ie80(z, bLiveVoice));
    }

    /* JADX INFO: renamed from: E4 */
    public void m169114E4(boolean z, String str) {
        m206028F2().VoiceCloseEvent.showFloatWindow().mo172463j(new z0n0(z, str));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: N3 */
    public void mo95084N3() {
        this.f149034o = null;
        m206028F2().PreLoadEvent.cleanPreLoad().m172467p();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: O3 */
    public boolean mo95085O3() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: R3 */
    public View mo95087R3() {
        return (View) this.viewModel;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: T3 */
    public void mo95089T3(e30<r8d0> e30Var) {
        m206028F2().RoomInfoEvent.initSmallWindowRoomInfo().mo172463j(new s8d0(e30Var, null, false, null, false));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: U3 */
    public boolean mo95090U3(int i) {
        return true;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: V3 */
    public boolean mo95091V3() {
        return ((Boolean) m129297F3(new o6f(3400))).booleanValue();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: W3 */
    public boolean mo95092W3() {
        return this.f149034o != null;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: X3 */
    public boolean mo95093X3(int i) {
        return ((Boolean) m129297F3(new w14(3400, i))).booleanValue();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Y3 */
    public boolean mo95094Y3(boolean z, boolean z2) {
        if (z2 || !ypv.f199493a.m199374u().live.voiceWindowEnable.booleanValue()) {
            return false;
        }
        m169114E4(false, "click_back_button");
        return true;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Z3 */
    public void mo95095Z3() {
        this.f149031l.m148896h1();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: a4 */
    public void mo95096a4() {
        m169114E4(false, "slide");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: e4 */
    public void mo95100e4(JumpRoomData jumpRoomData) {
        ((fhm0) m206027E2()).m121385f4(jumpRoomData);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: f4 */
    public void mo95101f4(cul culVar) {
        m206028F2().PlayerEvent.updatePlayer().mo172463j(culVar);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: g4 */
    public void mo95102g4(boolean z) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((VoiceRoomView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.bsm] */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: i4 */
    public void mo95104i4() {
        ypv.m215676r();
        m144512z2(this.f149031l.m148916x0().m149343I2(m154638K3()));
        fho0.m121418c(this, (jfo0) m154638K3(), (VoiceRoomView) this.viewModel);
        super.mo70198T();
        ((fhm0) m206027E2()).m149825w(this.f67733i);
        ((fhm0) m206027E2()).mo132121c2();
        this.f188513f.setSwipeBackEnable(false);
        ((VoiceRoomView) this.viewModel).m78460k0(true);
        m169108s4();
        duringCreated(((fhm0) m206027E2()).mo149827y()).subscribe(ffw.m121193d(new e30() { // from class: l.hho0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107735a.m169110w4((iqv) obj);
            }
        }));
        duringCreated(ypv.m215672k().m121230k()).subscribe(ffw.m121193d(new e30() { // from class: l.iho0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113320a.m169111x4((BLiveSettings) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.jho0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117965a.m169117y4((iqv) obj);
            }
        }));
        this.f149032m = ((fhm0) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.kho0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123193a.m169118z4((LiveControlMessage) obj);
            }
        }));
        ((fhm0) m206027E2()).m132084P1();
        LiveWatchCounter.m76330h().m76332f(1);
        this.f149034o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    public void init() {
        m144512z2(new n2j(this.f188512e, this.f149031l));
        fho0.m121419d(this, (jfo0) m154638K3(), (VoiceRoomView) this.viewModel);
        ((VoiceRoomView) this.viewModel).m78459j0(this.f149030k.f47738A);
        aqe.m98261i().m98277t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        this.f188512e.f77107m.destroy();
        hu20.m132970p("context_single_room");
        mkd0.m154992z(this.f149032m);
        boolean zMo95091V3 = mo95091V3();
        super.mo69117n();
        if (zMo95091V3) {
            ((fhm0) this.f188512e.f77102h).mo97488c0(true);
        } else {
            ((fhm0) m206027E2()).exit();
        }
    }

    @Override // p149l.k4t
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        super.mo111727s2();
        mkd0.m154992z(this.f149033n);
        ((VoiceRoomView) this.viewModel).destroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ptn.m171365e(new ptn.C19336a());
        if (!((fhm0) m206027E2()).f139747Q) {
            ((fhm0) m206027E2()).f97523g0 = mqi0.m155944o();
        }
        ((VoiceRoomView) this.viewModel).f53482e.m78413c(((fhm0) m206027E2()).mo149817n().bgPicType, ((fhm0) m206027E2()).mo149817n().backgroundUrl);
        duringCreated(m206028F2().VoiceAuctionEvent.refreshVoiceBg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.gho0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102672a.m169097A4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m169115t4() {
        mo140769J3();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void mo95088S3(BLiveVoice bLiveVoice, boolean z, e30<r8d0> e30Var, e30<r8d0> e30Var2, boolean z2) {
        m206028F2().RoomInfoEvent.initRoomInfo().mo172463j(new s8d0(e30Var2, bLiveVoice, z, e30Var, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m169117y4(iqv iqvVar) {
        if (iqvVar.m137804k()) {
            ((fhm0) m206027E2()).mo97489e2(false, ((fhm0) m206027E2()).mo149813j());
            h5j0.INSTANCE.m129402a("enter_voice_room", "startLive");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m169118z4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((fhm0) m206027E2()).mo132074K1(((fhm0) m206027E2()).m149814k());
                break;
            case "system":
                m169098D4(liveControlMessage.content, this.f188513f.getString(R$string.f47646y5), new d30() { // from class: l.oho0
                    @Override // p149l.d30
                    public final void call() {
                        pho0.m169103n4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m205257w(true);
                ((fhm0) m206027E2()).m132055A1(new evj.C16689a(((fhm0) m206027E2()).m149818o(), ((fhm0) m206027E2()).m132146l0().f56011id, "live").m118277f(), null);
                break;
            case "chat_tip_change":
                ((fhm0) m206027E2()).m132076L1();
                break;
            case "boot":
                ((fhm0) m206027E2()).m132132g2(((fhm0) m206027E2()).mo149813j());
                m169115t4();
                act().m66873d2();
                LiveDialogAct.m67178h2(act(), "", liveControlMessage.content, true);
                break;
            case "stop":
            case "force_stop":
                ((fhm0) m206027E2()).mo149812h(u7s.f175055e);
                break;
            case "pause":
                ((fhm0) m206027E2()).mo149812h(pau.f148011b);
                break;
            case "forbidden_multidevice":
                String strM202217t = w8u.m202217t(liveControlMessage.isAnchor ? R$string.f46972T5 : R$string.f46930R5);
                ((fhm0) m206027E2()).m132132g2(((fhm0) m206027E2()).mo149813j());
                m169115t4();
                act().m66873d2();
                LiveDialogAct.m67177g2(act(), "", strM202217t);
                break;
        }
        gkh0.m126628k(liveControlMessage.toString(), "[live][voice]", "[passivity_exit]");
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public void mo95098c4(BLiveVoice bLiveVoice) {
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: m */
    public void mo95105m(boolean z) {
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: P3 */
    public void mo95086P3() {
    }
}

package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.root.VoiceLiveView;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes5.dex */
public class xun0 extends AbstractC19634r4<fcm0, BLiveVoice, qqn0, VoiceLiveView> {

    /* JADX INFO: renamed from: i */
    public final LiveBaseFrag f194533i;

    /* JADX INFO: renamed from: j */
    public final String f194534j;

    /* JADX WARN: Multi-variable type inference failed */
    public xun0(LiveBaseFrag liveBaseFrag, AnchorStartData anchorStartData, fcm0 fcm0Var) {
        super(new qqn0(liveBaseFrag, fcm0Var, new LiveEventBus()));
        VoiceLiveView voiceLiveView = (VoiceLiveView) liveBaseFrag.mo20578H2().inflate(t6c0.f168513s7, (ViewGroup) null, false);
        this.f188512e.m103722a(this, voiceLiveView);
        mo51532C(voiceLiveView);
        this.f194533i = liveBaseFrag;
        String str = anchorStartData.anchorSource;
        this.f194534j = str;
        ((fcm0) m206027E2()).m160238H3(str);
        ((fcm0) m206027E2()).m120452T3(anchorStartData.voiceEntranceType);
        ((fcm0) m206027E2()).m160244L3(anchorStartData.isFromFloatWindow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m211149V3(BLiveSettings bLiveSettings) {
        ((fcm0) m206027E2()).m132094T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m211150W3(iqv iqvVar) {
        m154640M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m211151X3(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((VoiceLiveView) v2).f53427d.m78413c(((fcm0) m206027E2()).mo149817n().bgPicType, ((fcm0) m206027E2()).mo149817n().backgroundUrl);
        } else {
            ((VoiceLiveView) v2).f53427d.m78413c(LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: N3 */
    public View mo177748N3() {
        return (View) this.viewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: O3 */
    public void mo177749O3(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            ((fcm0) m206027E2()).mo132136i((BLiveRoom) intent.getSerializableExtra("room_tag"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: P3 */
    public void mo177750P3() {
        ypv.m215676r();
        ptn.m171363c("voice", new ptn.C19336a());
        ((fcm0) m206027E2()).mo132121c2();
        ((fcm0) m206027E2()).m132084P1();
        ((VoiceLiveView) this.viewModel).m78454k0(this.f194533i);
        mun0.m156426a(this, (qqn0) m154638K3(), (VoiceLiveView) this.viewModel);
        m154639L3();
        duringCreated(ypv.m215672k().m121230k()).subscribe(ffw.m121193d(new e30() { // from class: l.vun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183090a.m211149V3((BLiveSettings) obj);
            }
        }));
        duringCreated(((fcm0) m206027E2()).mo149827y()).subscribe(ffw.m121193d(new e30() { // from class: l.wun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188145a.m211150W3((iqv) obj);
            }
        }));
        ((fcm0) m206027E2()).mo149812h(xat.f191815b);
    }

    /* JADX INFO: renamed from: U3 */
    public void m211152U3() {
        m206028F2().LivePusherEvent.closeLive().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        if (!((fcm0) m206027E2()).m160273k3()) {
            ((fcm0) m206027E2()).m132132g2(((fcm0) m206027E2()).mo149813j());
        }
        super.mo69117n();
        this.f188512e.f77107m.destroy();
        ((fcm0) m206027E2()).mo97488c0(((fcm0) m206027E2()).m160273k3());
        mo111727s2();
        w8n0.m202192f().m202193c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC19634r4
    /* JADX INFO: renamed from: o */
    public boolean mo177751o() {
        if (!((fcm0) m206027E2()).m149820r() && !((fcm0) m206027E2()).m149816m().m137800g()) {
            return false;
        }
        m211152U3();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((fcm0) m206027E2()).mo97489e2(true, ((fcm0) m206027E2()).mo149813j());
        ((VoiceLiveView) this.viewModel).m78455l0(true);
        ((VoiceLiveView) this.viewModel).f53427d.m78413c(((fcm0) m206027E2()).mo149817n().bgPicType, ((fcm0) m206027E2()).mo149817n().backgroundUrl);
        duringCreated(m206028F2().VoiceAuctionEvent.refreshVoiceBg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.uun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178406a.m211151X3((String) obj);
            }
        }));
    }
}

package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;

/* JADX INFO: loaded from: classes5.dex */
public class v2m0 extends i6t<rwn0, VirtualBgView> {
    public v2m0(dum dumVar, VirtualBgView virtualBgView) {
        super(dumVar);
        mo52715C(virtualBgView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m199137P3(BLiveVoice bLiveVoice) {
        if (y6s.m214495c(bLiveVoice.liveMode)) {
            ((VirtualBgView) this.viewModel).m78006k0();
        } else if (y6s.m214496d(bLiveVoice.liveMode) && VirtualVoiceMotionType.ktv.equals(bLiveVoice.template)) {
            ((VirtualBgView) this.viewModel).m78005j0();
        } else {
            m199142U3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m199138R3(String str) {
        if (TextUtils.isEmpty(str)) {
            m199143V3(((rwn0) m213810E2()).mo183440n().bgPicType, ((rwn0) m213810E2()).mo183440n().backgroundUrl, ((rwn0) m213810E2()).mo183435j().liveMode, ((rwn0) m213810E2()).mo183435j().template);
        } else {
            m199143V3(LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC, str, ((rwn0) m213810E2()).mo183435j().liveMode, ((rwn0) m213810E2()).mo183435j().template);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m199139T3(String str) {
        m199142U3();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m199140O3(cfp0 cfp0Var) {
        m199143V3(cfp0Var.f81545a, cfp0Var.f81546b, cfp0Var.f81547c, cfp0Var.f81548d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m199141S3(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        String url = voiceRoomBgPicUpdateMessage.getUrl();
        if (TextUtils.isEmpty(url)) {
            m199142U3();
            return;
        }
        ((rwn0) m213810E2()).mo183440n().backgroundUrl = voiceRoomBgPicUpdateMessage.getUrl();
        ((rwn0) m213810E2()).mo183440n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
        m199143V3(voiceRoomBgPicUpdateMessage.getPicType(), url, ((rwn0) m213810E2()).mo183435j().liveMode, ((rwn0) m213810E2()).mo183435j().template);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().VoiceVirtualLiveEvent.preLoadRoomBg(), new y20() { // from class: l.p2m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150281a.m199140O3((cfp0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final void m199142U3() {
        m199143V3(((rwn0) m213810E2()).mo183440n().bgPicType, ((rwn0) m213810E2()).mo183440n().backgroundUrl, ((rwn0) m213810E2()).mo183435j().liveMode, ((rwn0) m213810E2()).mo183435j().template);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m199143V3(String str, String str2, String str3, String str4) {
        if (y6s.m214496d(str3) && VirtualVoiceMotionType.ktv.equals(str4)) {
            ((VirtualBgView) this.viewModel).m78005j0();
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zM214495c = y6s.m214495c(str3);
        V v2 = this.viewModel;
        if (zM214495c) {
            ((VirtualBgView) v2).m78006k0();
        } else {
            ((VirtualBgView) v2).m78007l0(str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183409O2().m188658d()).subscribe(dhw.m115829h(new y20() { // from class: l.q2m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155355a.m199137P3((BLiveVoice) obj);
            }
        }));
        m138863h3(m213811F2().VoiceVirtualLiveEvent.changeRoomBg(), new y20() { // from class: l.r2m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160951a.m199138R3((String) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).m168545q1().m98241M0()).subscribe(dhw.m115825d(new y20() { // from class: l.s2m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165903a.m199141S3((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
        m113231o2(((rwn0) m213810E2()).f148282z.m170284r().m98261W0(), false).map(new qcj() { // from class: l.t2m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj).getTemplate();
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.u2m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177226a.m199139T3((String) obj);
            }
        }));
    }
}

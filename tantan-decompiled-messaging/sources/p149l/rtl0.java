package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;

/* JADX INFO: loaded from: classes5.dex */
public class rtl0 extends h4t<nnn0, VirtualBgView> {
    public rtl0(bsm bsmVar, VirtualBgView virtualBgView) {
        super(bsmVar);
        mo51532C(virtualBgView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m180806P3(BLiveVoice bLiveVoice) {
        if (x4s.m207013c(bLiveVoice.liveMode)) {
            ((VirtualBgView) this.viewModel).m76823k0();
        } else if (x4s.m207014d(bLiveVoice.liveMode) && VirtualVoiceMotionType.ktv.equals(bLiveVoice.template)) {
            ((VirtualBgView) this.viewModel).m76822j0();
        } else {
            m180811U3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m180807R3(String str) {
        if (TextUtils.isEmpty(str)) {
            m180812V3(((nnn0) m206027E2()).mo149817n().bgPicType, ((nnn0) m206027E2()).mo149817n().backgroundUrl, ((nnn0) m206027E2()).mo149813j().liveMode, ((nnn0) m206027E2()).mo149813j().template);
        } else {
            m180812V3(LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC, str, ((nnn0) m206027E2()).mo149813j().liveMode, ((nnn0) m206027E2()).mo149813j().template);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m180808T3(String str) {
        m180811U3();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m180809O3(y5p0 y5p0Var) {
        m180812V3(y5p0Var.f196468a, y5p0Var.f196469b, y5p0Var.f196470c, y5p0Var.f196471d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m180810S3(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        String url = voiceRoomBgPicUpdateMessage.getUrl();
        if (TextUtils.isEmpty(url)) {
            m180811U3();
            return;
        }
        ((nnn0) m206027E2()).mo149817n().backgroundUrl = voiceRoomBgPicUpdateMessage.getUrl();
        ((nnn0) m206027E2()).mo149817n().bgPicType = voiceRoomBgPicUpdateMessage.getPicType();
        m180812V3(voiceRoomBgPicUpdateMessage.getPicType(), url, ((nnn0) m206027E2()).mo149813j().liveMode, ((nnn0) m206027E2()).mo149813j().template);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().VoiceVirtualLiveEvent.preLoadRoomBg(), new e30() { // from class: l.ltl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129978a.m180809O3((y5p0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final void m180811U3() {
        m180812V3(((nnn0) m206027E2()).mo149817n().bgPicType, ((nnn0) m206027E2()).mo149817n().backgroundUrl, ((nnn0) m206027E2()).mo149813j().liveMode, ((nnn0) m206027E2()).mo149813j().template);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m180812V3(String str, String str2, String str3, String str4) {
        if (x4s.m207014d(str3) && VirtualVoiceMotionType.ktv.equals(str4)) {
            ((VirtualBgView) this.viewModel).m76822j0();
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zM207013c = x4s.m207013c(str3);
        V v2 = this.viewModel;
        if (zM207013c) {
            ((VirtualBgView) v2).m76823k0();
        } else {
            ((VirtualBgView) v2).m76824l0(str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160247O2().m165466d()).subscribe(ffw.m121197h(new e30() { // from class: l.mtl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135617a.m180806P3((BLiveVoice) obj);
            }
        }));
        m129304h3(m206028F2().VoiceVirtualLiveEvent.changeRoomBg(), new e30() { // from class: l.ntl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140488a.m180807R3((String) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).m132160q1().m189059M0()).subscribe(ffw.m121193d(new e30() { // from class: l.otl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145602a.m180810S3((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj);
            }
        }));
        m104250o2(((nnn0) m206027E2()).f108769z.m181789r().m189079W0(), false).map(new w9j() { // from class: l.ptl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj).getTemplate();
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.qtl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156370a.m180808T3((String) obj);
            }
        }));
    }
}

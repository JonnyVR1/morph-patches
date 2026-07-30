package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.root.VoiceLiveView;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes5.dex */
public class b4o0 extends AbstractC19518q4<jlm0, BLiveVoice, uzn0, VoiceLiveView> {

    /* JADX INFO: renamed from: i */
    public final LiveBaseFrag f74958i;

    /* JADX INFO: renamed from: j */
    public final String f74959j;

    /* JADX WARN: Multi-variable type inference failed */
    public b4o0(LiveBaseFrag liveBaseFrag, AnchorStartData anchorStartData, jlm0 jlm0Var) {
        super(new uzn0(liveBaseFrag, jlm0Var, new LiveEventBus()));
        VoiceLiveView voiceLiveView = (VoiceLiveView) liveBaseFrag.mo21577H2().inflate(yec0.f199245s7, (ViewGroup) null, false);
        this.f196918e.m118163a(this, voiceLiveView);
        mo52715C(voiceLiveView);
        this.f74958i = liveBaseFrag;
        String str = anchorStartData.anchorSource;
        this.f74959j = str;
        ((jlm0) m213810E2()).m183400H3(str);
        ((jlm0) m213810E2()).m146095T3(anchorStartData.voiceEntranceType);
        ((jlm0) m213810E2()).m183406L3(anchorStartData.isFromFloatWindow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m102500V3(BLiveSettings bLiveSettings) {
        ((jlm0) m213810E2()).m168480T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m102501W3(jsv jsvVar) {
        m163464M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m102502X3(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((VoiceLiveView) v2).f54275d.m79596c(((jlm0) m213810E2()).mo183440n().bgPicType, ((jlm0) m213810E2()).mo183440n().backgroundUrl);
        } else {
            ((VoiceLiveView) v2).f54275d.m79596c(LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: N3 */
    public View mo102503N3() {
        return (View) this.viewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: O3 */
    public void mo102504O3(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            ((jlm0) m213810E2()).mo168522i((BLiveRoom) intent.getSerializableExtra("room_tag"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: P3 */
    public void mo102505P3() {
        zrv.m221197r();
        pvn.m173968c("voice", new pvn.C19456a());
        ((jlm0) m213810E2()).mo168507c2();
        ((jlm0) m213810E2()).m168470P1();
        ((VoiceLiveView) this.viewModel).m79637k0(this.f74958i);
        q3o0.m175148a(this, (uzn0) m163462K3(), (VoiceLiveView) this.viewModel);
        m163463L3();
        duringCreated(zrv.m221193k().m159274k()).subscribe(dhw.m115825d(new y20() { // from class: l.z3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202847a.m102500V3((BLiveSettings) obj);
            }
        }));
        duringCreated(((jlm0) m213810E2()).mo183454y()).subscribe(dhw.m115825d(new y20() { // from class: l.a4o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68435a.m102501W3((jsv) obj);
            }
        }));
        ((jlm0) m213810E2()).mo160116h(yct.f198542b);
    }

    /* JADX INFO: renamed from: U3 */
    public void m102506U3() {
        m213811F2().LivePusherEvent.closeLive().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        if (!((jlm0) m213810E2()).m183437k3()) {
            ((jlm0) m213810E2()).m168518g2(((jlm0) m213810E2()).mo183435j());
        }
        super.mo70300n();
        this.f196918e.f90827m.destroy();
        ((jlm0) m213810E2()).mo146610c0(((jlm0) m213810E2()).m183437k3());
        mo120629s2();
        ain0.m98000f().m98001c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC19518q4
    /* JADX INFO: renamed from: o */
    public boolean mo102507o() {
        if (!((jlm0) m213810E2()).m202195r() && !((jlm0) m213810E2()).m202193m().m146881g()) {
            return false;
        }
        m102506U3();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((jlm0) m213810E2()).mo146096e2(true, ((jlm0) m213810E2()).mo183435j());
        ((VoiceLiveView) this.viewModel).m79638l0(true);
        ((VoiceLiveView) this.viewModel).f54275d.m79596c(((jlm0) m213810E2()).mo183440n().bgPicType, ((jlm0) m213810E2()).mo183440n().backgroundUrl);
        duringCreated(m213811F2().VoiceAuctionEvent.refreshVoiceBg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.y3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197382a.m102502X3((String) obj);
            }
        }));
    }
}

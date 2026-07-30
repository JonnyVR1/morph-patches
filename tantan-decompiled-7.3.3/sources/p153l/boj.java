package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.VoiceBottomGiftView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class boj extends qrm0<VoiceBottomGiftView> {

    /* JADX INFO: renamed from: r */
    public Boolean f77688r;

    /* JADX INFO: renamed from: s */
    public kcg0 f77689s;

    public boj(dum<? extends rwn0> dumVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(dumVar, bLiveBottomButton, area);
        this.f77688r = Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m105686u4(vxj0 vxj0Var) {
        m105696w4();
    }

    @Override // p153l.jc3
    /* JADX INFO: renamed from: C1 */
    public boolean mo105687C1(Area area) {
        return area == Area.BOTTOM;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m105693s4(m177578X3());
        m138860d3(er40.class, new qcj() { // from class: l.xnj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f195399a.m105694t4((er40) obj);
            }
        });
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: b4 */
    public int mo105689b4() {
        return obc0.f146336fa;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: c4 */
    public int mo105690c4() {
        return obc0.f146360ha;
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: m4 */
    public void mo105691m4(View view, BLiveButtonType bLiveButtonType, String str) {
        coj cojVarM220590e = znc0.m220590e(this);
        if (cojVarM220590e != null) {
            m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(800).m156158h(new cqj.C16337a().m111927h(cojVarM220590e).m111923d()).m156160j("voiceLiveMain"));
            m213811F2().BootBubbleEvent.dismissBubble().mo199273j("voiceGiftButtonBubble");
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        Boolean bool = Boolean.FALSE;
        this.f77688r = bool;
        m177578X3().m73382j0(bool);
        m177578X3().m73384l0();
        psd0.m173633z(this.f77689s);
    }

    @Override // p153l.qrm0
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public VoiceBottomGiftView mo105688T3(int i, boolean z) {
        VoiceBottomGiftView voiceBottomGiftView = (VoiceBottomGiftView) this.f159147l.f90815a.inflater().inflate(yec0.f199276v, (ViewGroup) null);
        voiceBottomGiftView.setLayoutParams(new LinearLayout.LayoutParams(this.f159145j, this.f159144i));
        String strMo107630e4 = mo107630e4(this.f159148m, this.f159151p);
        if (TextUtils.isEmpty(strMo107630e4)) {
            voiceBottomGiftView.setIcon(i);
        } else {
            voiceBottomGiftView.setIcon(strMo107630e4);
        }
        bnl0.m105525M0(voiceBottomGiftView, true);
        return voiceBottomGiftView;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m105693s4(final VoiceBottomGiftView voiceBottomGiftView) {
        C22421c c22421cDistinctUntilChanged = duringCreated(m213811F2().BottomZoneEvent.playGiftAnim().m199270g()).distinctUntilChanged();
        Objects.requireNonNull(voiceBottomGiftView);
        c22421cDistinctUntilChanged.subscribe(dhw.m115829h(new y20() { // from class: l.aoj
            @Override // p153l.y20
            public final void call(Object obj) {
                voiceBottomGiftView.m73382j0((Boolean) obj);
            }
        }));
        voiceBottomGiftView.m73382j0(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (((rwn0) m213810E2()).f165194Q) {
            m105696w4();
        }
        duringCreated(m213811F2().BottomZoneEvent.updateInspireGiftStatus().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ynj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200891a.m105686u4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.refreshGiftRedDot().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.znj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205203a.m105695v4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ View m105694t4(er40 er40Var) {
        return m177578X3();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m105695v4(Boolean bool) {
        m177578X3().m73380g0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: w4 */
    public void m105696w4() {
        if (this.f77688r.booleanValue()) {
            wft.m206159b(3);
        }
    }
}

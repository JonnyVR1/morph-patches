package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.VoiceBottomGiftView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class llj extends mim0<VoiceBottomGiftView> {

    /* JADX INFO: renamed from: r */
    public Boolean f128712r;

    /* JADX INFO: renamed from: s */
    public c4g0 f128713s;

    public llj(bsm<? extends nnn0> bsmVar, BLiveBottomButton bLiveBottomButton, Area area) {
        super(bsmVar, bLiveBottomButton, area);
        this.f128712r = Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m150488u4(soj0 soj0Var) {
        m150493w4();
    }

    @Override // p149l.ub3
    /* JADX INFO: renamed from: C1 */
    public boolean mo116693C1(Area area) {
        return area == Area.BOTTOM;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m150490s4(m154731X3());
        m129301d3(qi40.class, new w9j() { // from class: l.hlj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108354a.m150491t4((qi40) obj);
            }
        });
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: b4 */
    public int mo116704b4() {
        return i3c0.f111008fa;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: c4 */
    public int mo116705c4() {
        return i3c0.f111032ha;
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: m4 */
    public void mo116707m4(View view, BLiveButtonType bLiveButtonType, String str) {
        mlj mljVarM183907e = sfc0.m183907e(this);
        if (mljVarM183907e != null) {
            m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(800).m122564h(new mnj.C18509a().m155527h(mljVarM183907e).m155523d()).m122566j("voiceLiveMain"));
            m206028F2().BootBubbleEvent.dismissBubble().mo172463j("voiceGiftButtonBubble");
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        Boolean bool = Boolean.FALSE;
        this.f128712r = bool;
        m154731X3().m72199j0(bool);
        m154731X3().m72201l0();
        mkd0.m154992z(this.f128713s);
    }

    @Override // p149l.mim0
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public VoiceBottomGiftView mo108804T3(int i, boolean z) {
        VoiceBottomGiftView voiceBottomGiftView = (VoiceBottomGiftView) this.f134018l.f77095a.inflater().inflate(t6c0.f168544v, (ViewGroup) null);
        voiceBottomGiftView.setLayoutParams(new LinearLayout.LayoutParams(this.f134016j, this.f134015i));
        String strMo154734e4 = mo154734e4(this.f134019m, this.f134022p);
        if (TextUtils.isEmpty(strMo154734e4)) {
            voiceBottomGiftView.setIcon(i);
        } else {
            voiceBottomGiftView.setIcon(strMo154734e4);
        }
        xdl0.m208345M0(voiceBottomGiftView, true);
        return voiceBottomGiftView;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m150490s4(final VoiceBottomGiftView voiceBottomGiftView) {
        C22306c c22306cDistinctUntilChanged = duringCreated(m206028F2().BottomZoneEvent.playGiftAnim().m172460g()).distinctUntilChanged();
        Objects.requireNonNull(voiceBottomGiftView);
        c22306cDistinctUntilChanged.subscribe(ffw.m121197h(new e30() { // from class: l.klj
            @Override // p149l.e30
            public final void call(Object obj) {
                voiceBottomGiftView.m72199j0((Boolean) obj);
            }
        }));
        voiceBottomGiftView.m72199j0(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (((nnn0) m206027E2()).f139747Q) {
            m150493w4();
        }
        duringCreated(m206028F2().BottomZoneEvent.updateInspireGiftStatus().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ilj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113842a.m150488u4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.refreshGiftRedDot().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.jlj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118546a.m150492v4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ View m150491t4(qi40 qi40Var) {
        return m154731X3();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m150492v4(Boolean bool) {
        m154731X3().m72197g0(bool.booleanValue());
    }

    /* JADX INFO: renamed from: w4 */
    public void m150493w4() {
        if (this.f128712r.booleanValue()) {
            vdt.m198092b(3);
        }
    }
}

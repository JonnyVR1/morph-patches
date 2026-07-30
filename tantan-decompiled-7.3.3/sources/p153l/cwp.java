package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceRedDotButton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, m88121d2 = {"Ll/cwp;", "Ll/oan0;", "Ll/fjn$a;", "Ll/dum;", "Ll/rwn0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "bLiveBottomButton", "Lcom/p1/mobile/putong/live/livingroom/voice/bottom/Area;", "area", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;Lcom/p1/mobile/putong/live/livingroom/voice/bottom/Area;)V", "", "defaultRes", "", "visibility", "Lcom/p1/mobile/putong/live/livingroom/voice/bottom/VoiceRedDotButton;", "o4", "(IZ)Lcom/p1/mobile/putong/live/livingroom/voice/bottom/VoiceRedDotButton;", "", p7f.GPS_DIRECTION_TRUE, "()V", "isShowRedDot", "h0", "(Z)V", "l1", "()Z", "isShow", "p4", "q4", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cwp extends oan0 implements fjn.InterfaceC16988a {
    public cwp(@Nullable dum<? extends rwn0> dumVar, @Nullable BLiveBottomButton bLiveBottomButton, @Nullable Area area) {
        super(dumVar, bLiveBottomButton, area);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        dum<? extends rwn0> dumVar = this.f159147l;
        dumVar.getClass();
        m153103z2(new fjn(dumVar, this));
    }

    @Override // p153l.fjn.InterfaceC16988a
    /* JADX INFO: renamed from: h0 */
    public void mo112927h0(boolean isShowRedDot) {
        m112929p4(isShowRedDot);
    }

    @Override // p153l.qrm0, p153l.jc3
    /* JADX INFO: renamed from: l1 */
    public boolean mo103476l1() {
        return bnl0.m105529O0(m177578X3().f53779b);
    }

    @Override // p153l.oan0, p153l.qrm0
    @NotNull
    /* JADX INFO: renamed from: o4 */
    public VoiceRedDotButton mo105688T3(int defaultRes, boolean visibility) {
        m112930q4();
        VoiceRedDotButton voiceRedDotButtonMo105688T3 = super.mo105688T3(defaultRes, visibility);
        voiceRedDotButtonMo105688T3.getClass();
        return voiceRedDotButtonMo105688T3;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m112929p4(boolean isShow) {
        m177578X3().mo73321g0(isShow);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m112930q4() {
        i4g0.m138527y("e_gametab_entry_exposure", m177582f4().m213815L2() ? "p_anchor_audio_room" : "p_user_audio_room", MapsKt.mapOf(new Pair("live_type", "voice")));
    }
}

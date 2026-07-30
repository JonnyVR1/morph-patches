package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceRedDotButton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, m87232d2 = {"Ll/cup;", "Ll/k1n0;", "Ll/fhn$a;", "Ll/bsm;", "Ll/nnn0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "bLiveBottomButton", "Lcom/p1/mobile/putong/live/livingroom/voice/bottom/Area;", "area", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;Lcom/p1/mobile/putong/live/livingroom/voice/bottom/Area;)V", "", "defaultRes", "", "visibility", "Lcom/p1/mobile/putong/live/livingroom/voice/bottom/VoiceRedDotButton;", "o4", "(IZ)Lcom/p1/mobile/putong/live/livingroom/voice/bottom/VoiceRedDotButton;", "", j6f.GPS_DIRECTION_TRUE, "()V", "isShowRedDot", "h0", "(Z)V", "l1", "()Z", "isShow", "p4", "q4", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class cup extends k1n0 implements fhn.InterfaceC16833a {
    public cup(@Nullable bsm<? extends nnn0> bsmVar, @Nullable BLiveBottomButton bLiveBottomButton, @Nullable Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        bsm<? extends nnn0> bsmVar = this.f134018l;
        bsmVar.getClass();
        m144512z2(new fhn(bsmVar, this));
    }

    @Override // p149l.fhn.InterfaceC16833a
    /* JADX INFO: renamed from: h0 */
    public void mo108805h0(boolean isShowRedDot) {
        m108808p4(isShowRedDot);
    }

    @Override // p149l.mim0, p149l.ub3
    /* JADX INFO: renamed from: l1 */
    public boolean mo108806l1() {
        return xdl0.m208349O0(m154731X3().f52931b);
    }

    @Override // p149l.k1n0, p149l.mim0
    @NotNull
    /* JADX INFO: renamed from: o4 */
    public VoiceRedDotButton mo108804T3(int defaultRes, boolean visibility) {
        m108809q4();
        VoiceRedDotButton voiceRedDotButtonMo108804T3 = super.mo108804T3(defaultRes, visibility);
        voiceRedDotButtonMo108804T3.getClass();
        return voiceRedDotButtonMo108804T3;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m108808p4(boolean isShow) {
        m154731X3().mo72138g0(isShow);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m108809q4() {
        zvf0.m220403y("e_gametab_entry_exposure", m154735f4().m206032L2() ? "p_anchor_audio_room" : "p_user_audio_room", MapsKt.mapOf(new Pair("live_type", "voice")));
    }
}

package p002l;

import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p1.mobile.putong.live.livingroom.voice.bottom.VoiceRedDotButton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import l.k1n0;
import l.mim0;
import l.nnn0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Ll/cup;", "Ll/k1n0;", "Ll/fhn$a;", "Ll/bsm;", "Ll/nnn0;", "info", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "bLiveBottomButton", "Lcom/p1/mobile/putong/live/livingroom/voice/bottom/Area;", "area", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;Lcom/p1/mobile/putong/live/livingroom/voice/bottom/Area;)V", "", "defaultRes", "", "visibility", "Lcom/p1/mobile/putong/live/livingroom/voice/bottom/VoiceRedDotButton;", "o4", "(IZ)Lcom/p1/mobile/putong/live/livingroom/voice/bottom/VoiceRedDotButton;", "", "T", "()V", "isShowRedDot", "h0", "(Z)V", "l1", "()Z", "isShow", "p4", "q4", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cup extends k1n0 implements fhn.InterfaceC0566a {
    public cup(@Nullable bsm<? extends nnn0> bsmVar, @Nullable BLiveBottomButton bLiveBottomButton, @Nullable Area area) {
        super(bsmVar, bLiveBottomButton, area);
    }

    /* JADX INFO: renamed from: T */
    public void m11384T() {
        super/*l.k4t*/.T();
        bsm bsmVar = ((mim0) this).l;
        bsmVar.getClass();
        z2(new fhn(bsmVar, this));
    }

    @Override // p002l.fhn.InterfaceC0566a
    /* JADX INFO: renamed from: h0 */
    public void mo11386h0(boolean isShowRedDot) {
        m11389p4(isShowRedDot);
    }

    /* JADX INFO: renamed from: l1 */
    public boolean m11387l1() {
        return xdl0.O0(X3().b);
    }

    @NotNull
    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
    public VoiceRedDotButton m11385T3(int defaultRes, boolean visibility) {
        m11390q4();
        VoiceRedDotButton voiceRedDotButtonO4 = super.o4(defaultRes, visibility);
        voiceRedDotButtonO4.getClass();
        return voiceRedDotButtonO4;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m11389p4(boolean isShow) {
        X3().g0(isShow);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m11390q4() {
        zvf0.y("e_gametab_entry_exposure", f4().m25552L2() ? "p_anchor_audio_room" : "p_user_audio_room", MapsKt.mapOf(new Pair("live_type", "voice")));
    }
}

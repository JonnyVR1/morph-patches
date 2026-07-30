package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll/wun;", "Ll/yp1;", "Ll/fhn$a;", "Ll/bsm;", "info", "", "imageRes", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "button", "<init>", "(Ll/bsm;ILcom/p1/mobile/putong/live/base/data/BLiveBottomButton;)V", "", "j4", "()V", "T", "Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "X3", "()Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "", "isShowRedDot", "h0", "(Z)V", "Landroid/view/View;", "view", "V3", "(Landroid/view/View;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wun extends yp1 implements fhn.InterfaceC0566a {
    public wun(@Nullable bsm<?> bsmVar, int i, @Nullable BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i, bLiveBottomButton);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j4 */
    private final void m25503j4() {
        zvf0.y("e_gametab_entry_exposure", m25547E2().mo9893p() ? "p_anchor_live_room" : "p_user_live_room", MapsKt.mapOf(new Pair("live_type", "live")));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.mo10607T();
        m25503j4();
        bsm<? extends T> bsmVar = this.f22036e;
        bsmVar.getClass();
        z2(new fhn(bsmVar, this));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(@Nullable View view) {
        m11815g4();
        m11812c4();
    }

    @Override // p002l.df2
    @NotNull
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        BLiveButtonType bLiveButtonType = BLiveButtonType.get("intlGamePanel");
        bLiveButtonType.getClass();
        return bLiveButtonType;
    }

    @Override // p002l.fhn.InterfaceC0566a
    /* JADX INFO: renamed from: h0 */
    public void mo11386h0(boolean isShowRedDot) {
        ((RedDotButton) this.f9196k).mo5611g0(isShowRedDot);
    }
}

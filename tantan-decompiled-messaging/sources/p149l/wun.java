package p149l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/wun;", "Ll/yp1;", "Ll/fhn$a;", "Ll/bsm;", BaseSei.INFO, "", "imageRes", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "button", "<init>", "(Ll/bsm;ILcom/p1/mobile/putong/live/base/data/BLiveBottomButton;)V", "", "j4", "()V", j6f.GPS_DIRECTION_TRUE, "Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "X3", "()Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "", "isShowRedDot", "h0", "(Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "V3", "(Landroid/view/View;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wun extends yp1 implements fhn.InterfaceC16833a {
    public wun(@Nullable bsm<?> bsmVar, int i, @Nullable BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i, bLiveBottomButton);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j4 */
    private final void m205652j4() {
        zvf0.m220403y("e_gametab_entry_exposure", m206027E2().mo97490p() ? "p_anchor_live_room" : "p_user_live_room", MapsKt.mapOf(new Pair("live_type", "live")));
    }

    @Override // p149l.df2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m205652j4();
        bsm<? extends T> bsmVar = this.f188512e;
        bsmVar.getClass();
        m144512z2(new fhn(bsmVar, this));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(@Nullable View view) {
        m111423g4();
        m111420c4();
    }

    @Override // p149l.df2
    @NotNull
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        BLiveButtonType bLiveButtonType = BLiveButtonType.get(BLiveButtonType.intlGamePanel);
        bLiveButtonType.getClass();
        return bLiveButtonType;
    }

    @Override // p149l.fhn.InterfaceC16833a
    /* JADX INFO: renamed from: h0 */
    public void mo108805h0(boolean isShowRedDot) {
        ((RedDotButton) this.f85887k).mo72138g0(isShowRedDot);
    }
}

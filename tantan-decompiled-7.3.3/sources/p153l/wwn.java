package p153l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/wwn;", "Ll/fq1;", "Ll/fjn$a;", "Ll/dum;", BaseSei.INFO, "", "imageRes", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "button", "<init>", "(Ll/dum;ILcom/p1/mobile/putong/live/base/data/BLiveBottomButton;)V", "", "j4", "()V", p7f.GPS_DIRECTION_TRUE, "Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "X3", "()Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "", "isShowRedDot", "h0", "(Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "V3", "(Landroid/view/View;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wwn extends fq1 implements fjn.InterfaceC16988a {
    public wwn(@Nullable dum<?> dumVar, int i, @Nullable BLiveBottomButton bLiveBottomButton) {
        super(dumVar, i, bLiveBottomButton);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: j4 */
    private final void m208262j4() {
        i4g0.m138527y("e_gametab_entry_exposure", m213810E2().mo118373p() ? "p_anchor_live_room" : "p_user_live_room", MapsKt.mapOf(new Pair("live_type", "live")));
    }

    @Override // p153l.kf2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m208262j4();
        dum<? extends T> dumVar = this.f196918e;
        dumVar.getClass();
        m153103z2(new fjn(dumVar, this));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(@Nullable View view) {
        m149350g4();
        m149347c4();
    }

    @Override // p153l.kf2
    @NotNull
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        BLiveButtonType bLiveButtonType = BLiveButtonType.get(BLiveButtonType.intlGamePanel);
        bLiveButtonType.getClass();
        return bLiveButtonType;
    }

    @Override // p153l.fjn.InterfaceC16988a
    /* JADX INFO: renamed from: h0 */
    public void mo112927h0(boolean isShowRedDot) {
        ((RedDotButton) this.f126232k).mo73321g0(isShowRedDot);
    }
}

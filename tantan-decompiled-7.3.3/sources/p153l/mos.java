package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.GiftWallV2Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0017¨\u0006\""}, m88121d2 = {"Ll/mos;", "Ll/y8s;", "Ll/oo2;", "Ll/gos;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", "type", "giftId", "skinId", "V3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Ll/mx50;", "Z3", "(Ll/mx50;)V", "", "isFirst", "X3", "(Z)V", "j", "Ll/mx50;", "getOpenGiftDetailInfo", "()Ll/mx50;", "setOpenGiftDetailInfo", "openGiftDetailInfo", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mos extends y8s<oo2, gos> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public mx50 openGiftDetailInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mos(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m159310T3(mos mosVar, BLiveEnvelope bLiveEnvelope) {
        mosVar.m159315X3(false);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m159311U3(mos mosVar, mx50 mx50Var) {
        mx50Var.getClass();
        mosVar.m159316Z3(mx50Var);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m159312Y3(mos mosVar, mx50 mx50Var, boolean z, BLiveExtraResponse bLiveExtraResponse) {
        gos gosVar = (gos) mosVar.viewModel;
        String strM160644a = mx50Var.getGiftId();
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        gosVar.m131145B0(strM160644a, bLiveNewGiftWallDetailInfoItem, z);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m159313V3(@NotNull String type, @NotNull String giftId, @NotNull String skinId) {
        type.getClass();
        giftId.getClass();
        skinId.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode == -768915683) {
            if (type.equals("equipGiftSkin")) {
                duringCreated(aiv.m98122o0(giftId, skinId)).subscribe(dhw.m115829h(new y20() { // from class: l.los
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        mos.m159310T3(this.f132945a, (BLiveEnvelope) obj);
                    }
                }));
            }
        } else if (iHashCode == 0) {
            if (type.equals("")) {
                ((gos) this.viewModel).mo73021p();
            }
        } else if (iHashCode == 1319865717 && type.equals("showGiftDialog")) {
            ((gos) this.viewModel).mo73021p();
            m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(7008).m156160j("live"));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m159314W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new GiftWallV2Event().showUserCardDialog().mo199273j(user);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public final void m159315X3(final boolean isFirst) {
        UserCardData userCardData;
        UserCardData userCardData2;
        final mx50 mx50Var = this.openGiftDetailInfo;
        if (mx50Var != null) {
            String str = mx50Var.getUserCardUser().f56859id;
            UserCardBean userCardBeanM160646c = mx50Var.getUserCardBean();
            String to = null;
            String fromIdentity = (userCardBeanM160646c == null || (userCardData2 = userCardBeanM160646c.userCardData) == null) ? null : userCardData2.getFromIdentity();
            UserCardBean userCardBeanM160646c2 = mx50Var.getUserCardBean();
            if (userCardBeanM160646c2 != null && (userCardData = userCardBeanM160646c2.userCardData) != null) {
                to = userCardData.getTo();
            }
            duringCreated(aiv.m98040G0(str, fromIdentity, to, m213810E2().m202194o(), mx50Var.getOriginalId(), eb20.m120148a())).subscribe(dhw.m115829h(new y20() { // from class: l.kos
                @Override // p153l.y20
                public final void call(Object obj) {
                    mos.m159312Y3(this.f127792a, mx50Var, isFirst, (BLiveExtraResponse) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m159316Z3(mx50 info) {
        this.openGiftDetailInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            gos gosVar = new gos(act, this);
            this.viewModel = gosVar;
            gosVar.mo22064i1(this);
        }
        ((gos) this.viewModel).m73017E();
        m159315X3(true);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().GiftWallV2Event.showGiftWallV2DetailDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.jos
            @Override // p153l.y20
            public final void call(Object obj) {
                mos.m159311U3(this.f122054a, (mx50) obj);
            }
        }));
    }
}

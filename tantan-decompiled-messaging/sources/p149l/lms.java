package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.GiftWallV2Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0017¨\u0006\""}, m87232d2 = {"Ll/lms;", "Ll/x6s;", "Ll/ho2;", "Ll/fms;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", "type", "giftId", "skinId", "V3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Ll/gp50;", "Z3", "(Ll/gp50;)V", "", "isFirst", "X3", "(Z)V", "j", "Ll/gp50;", "getOpenGiftDetailInfo", "()Ll/gp50;", "setOpenGiftDetailInfo", "openGiftDetailInfo", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class lms extends x6s<ho2, fms> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public gp50 openGiftDetailInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lms(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m150605T3(lms lmsVar, BLiveEnvelope bLiveEnvelope) {
        lmsVar.m150610X3(false);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m150606U3(lms lmsVar, gp50 gp50Var) {
        gp50Var.getClass();
        lmsVar.m150611Z3(gp50Var);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m150607Y3(lms lmsVar, gp50 gp50Var, boolean z, BLiveExtraResponse bLiveExtraResponse) {
        fms fmsVar = (fms) lmsVar.viewModel;
        String strM127329a = gp50Var.getGiftId();
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        fmsVar.m122214B0(strM127329a, bLiveNewGiftWallDetailInfoItem, z);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m150608V3(@NotNull String type, @NotNull String giftId, @NotNull String skinId) {
        type.getClass();
        giftId.getClass();
        skinId.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode == -768915683) {
            if (type.equals("equipGiftSkin")) {
                duringCreated(zfv.m218588o0(giftId, skinId)).subscribe(ffw.m121197h(new e30() { // from class: l.kms
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        lms.m150605T3(this.f123824a, (BLiveEnvelope) obj);
                    }
                }));
            }
        } else if (iHashCode == 0) {
            if (type.equals("")) {
                ((fms) this.viewModel).mo71838p();
            }
        } else if (iHashCode == 1319865717 && type.equals("showGiftDialog")) {
            ((fms) this.viewModel).mo71838p();
            m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(7008).m122566j("live"));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m150609W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new GiftWallV2Event().showUserCardDialog().mo172463j(user);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m150610X3(final boolean isFirst) {
        UserCardData userCardData;
        UserCardData userCardData2;
        final gp50 gp50Var = this.openGiftDetailInfo;
        if (gp50Var != null) {
            String str = gp50Var.getUserCardUser().f56011id;
            UserCardBean userCardBeanM127331c = gp50Var.getUserCardBean();
            String to = null;
            String fromIdentity = (userCardBeanM127331c == null || (userCardData2 = userCardBeanM127331c.userCardData) == null) ? null : userCardData2.getFromIdentity();
            UserCardBean userCardBeanM127331c2 = gp50Var.getUserCardBean();
            if (userCardBeanM127331c2 != null && (userCardData = userCardBeanM127331c2.userCardData) != null) {
                to = userCardData.getTo();
            }
            duringCreated(zfv.m218506G0(str, fromIdentity, to, m206027E2().m149818o(), gp50Var.getOriginalId(), w220.m201014a())).subscribe(ffw.m121197h(new e30() { // from class: l.jms
                @Override // p149l.e30
                public final void call(Object obj) {
                    lms.m150607Y3(this.f118703a, gp50Var, isFirst, (BLiveExtraResponse) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m150611Z3(gp50 info) {
        this.openGiftDetailInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            fms fmsVar = new fms(act, this);
            this.viewModel = fmsVar;
            fmsVar.mo21065i1(this);
        }
        ((fms) this.viewModel).m71834E();
        m150610X3(true);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().GiftWallV2Event.showGiftWallV2DetailDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ims
            @Override // p149l.e30
            public final void call(Object obj) {
                lms.m150606U3(this.f113962a, (gp50) obj);
            }
        }));
    }
}

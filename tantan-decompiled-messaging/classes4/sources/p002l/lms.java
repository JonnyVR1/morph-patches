package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import l.bwr;
import l.e30;
import l.ffw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0017¨\u0006\""}, d2 = {"Ll/lms;", "Ll/x6s;", "Ll/ho2;", "Ll/fms;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "", "type", "giftId", "skinId", "V3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Ll/gp50;", "Z3", "(Ll/gp50;)V", "", "isFirst", "X3", "(Z)V", "j", "Ll/gp50;", "getOpenGiftDetailInfo", "()Ll/gp50;", "setOpenGiftDetailInfo", "openGiftDetailInfo", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m17318T3(lms lmsVar, BLiveEnvelope bLiveEnvelope) {
        lmsVar.m17323X3(false);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m17319U3(lms lmsVar, gp50 gp50Var) {
        gp50Var.getClass();
        lmsVar.m17324Z3(gp50Var);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m17320Y3(lms lmsVar, gp50 gp50Var, boolean z, BLiveExtraResponse bLiveExtraResponse) {
        fms fmsVar = (fms) ((bwr) lmsVar).viewModel;
        String giftId = gp50Var.getGiftId();
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        fmsVar.m13332B0(giftId, bLiveNewGiftWallDetailInfoItem, z);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m17321V3(@NotNull String type, @NotNull String giftId, @NotNull String skinId) {
        type.getClass();
        giftId.getClass();
        skinId.getClass();
        int iHashCode = type.hashCode();
        if (iHashCode == -768915683) {
            if (type.equals("equipGiftSkin")) {
                duringCreated(zfv.m27291o0(giftId, skinId)).subscribe(ffw.h(new e30() { // from class: l.kms
                    public final void call(Object obj) {
                        lms.m17318T3(this.f14423a, (BLiveEnvelope) obj);
                    }
                }));
            }
        } else if (iHashCode == 0) {
            if (type.equals("")) {
                ((fms) ((bwr) this).viewModel).mo5216p();
            }
        } else if (iHashCode == 1319865717 && type.equals("showGiftDialog")) {
            ((fms) ((bwr) this).viewModel).mo5216p();
            m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(7008).m13446j("live"));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m17322W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showUserCardDialog().j(user);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m17323X3(final boolean isFirst) {
        UserCardData userCardData;
        UserCardData userCardData2;
        final gp50 gp50Var = this.openGiftDetailInfo;
        if (gp50Var != null) {
            String str = ((DbObject) gp50Var.getUserCardUser()).id;
            UserCardBean userCardBean = gp50Var.getUserCardBean();
            String to = null;
            String fromIdentity = (userCardBean == null || (userCardData2 = userCardBean.userCardData) == null) ? null : userCardData2.getFromIdentity();
            UserCardBean userCardBean2 = gp50Var.getUserCardBean();
            if (userCardBean2 != null && (userCardData = userCardBean2.userCardData) != null) {
                to = userCardData.getTo();
            }
            duringCreated(zfv.m27209G0(str, fromIdentity, to, m25547E2().m17239o(), gp50Var.getOriginalId(), w220.m24290a())).subscribe(ffw.h(new e30() { // from class: l.jms
                public final void call(Object obj) {
                    lms.m17320Y3(this.f13875a, gp50Var, isFirst, (BLiveExtraResponse) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m17324Z3(gp50 info) {
        this.openGiftDetailInfo = info;
        if (((bwr) this).viewModel == null) {
            Act act = this.f22037f;
            act.getClass();
            fms fmsVar = new fms(act, this);
            ((bwr) this).viewModel = fmsVar;
            fmsVar.mo5212i1(this);
        }
        ((fms) ((bwr) this).viewModel).m5211E();
        m17323X3(true);
    }

    /* JADX INFO: renamed from: t */
    public void m17325t() {
        super.t();
        duringCreated((c) m25548F2().GiftWallV2Event.showGiftWallV2DetailDialog().g()).subscribe(ffw.h(new e30() { // from class: l.ims
            public final void call(Object obj) {
                lms.m17319U3(this.f13314a, (gp50) obj);
            }
        }));
    }
}

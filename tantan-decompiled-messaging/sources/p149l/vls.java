package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.GiftDialogEventGroup;
import com.tantan.live.eventbus.LiveEventBus.GiftWallV2Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/vls;", "Ll/x6s;", "Ll/ho2;", "Ll/ses;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Ll/hp50;", "Y3", "(Ll/hp50;)V", "X3", "j", "Ll/hp50;", "openGiftWallInfo", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vls extends x6s<ho2, ses> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public hp50 openGiftWallInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vls(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m198850S3(vls vlsVar, fp50 fp50Var) {
        ses sesVar = (ses) vlsVar.viewModel;
        if (sesVar != null) {
            sesVar.mo71838p();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m198851T3(vls vlsVar, BLiveExtraResponse bLiveExtraResponse) {
        ses sesVar = (ses) vlsVar.viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        sesVar.m183710g0(bLiveNewGiftWallDetailInfoItem);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m198852U3(vls vlsVar, hp50 hp50Var) {
        hp50Var.getClass();
        vlsVar.m198856Y3(hp50Var);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m198853V3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new GiftWallV2Event().showGiftDetail().mo172463j(gift);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m198854W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new GiftWallV2Event().showUserCardDialog().mo172463j(user);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m198855X3() {
        User userM132330c;
        hp50 hp50Var = this.openGiftWallInfo;
        String str = (hp50Var == null || (userM132330c = hp50Var.getUserCardUser()) == null) ? null : userM132330c.f56011id;
        String strM149818o = m206027E2().m149818o();
        hp50 hp50Var2 = this.openGiftWallInfo;
        duringCreated(zfv.m218508H0(str, strM149818o, hp50Var2 != null ? hp50Var2.getCategoryId() : null)).subscribe(ffw.m121197h(new e30() { // from class: l.uls
            @Override // p149l.e30
            public final void call(Object obj) {
                vls.m198851T3(this.f177090a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m198856Y3(hp50 info) {
        this.openGiftWallInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            ses sesVar = new ses(act, this);
            this.viewModel = sesVar;
            sesVar.mo21065i1(this);
        }
        ((ses) this.viewModel).m71834E();
        m198855X3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().GiftWallV2Event.showCategorySetDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.sls
            @Override // p149l.e30
            public final void call(Object obj) {
                vls.m198852U3(this.f165264a, (hp50) obj);
            }
        }));
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        duringCreated(liveEventBusM206028F2.new GiftDialogEventGroup().openGiftDialogEvent().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.tls
            @Override // p149l.e30
            public final void call(Object obj) {
                vls.m198850S3(this.f171043a, (fp50) obj);
            }
        }));
    }
}

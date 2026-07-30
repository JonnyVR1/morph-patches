package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ll/vls;", "Ll/x6s;", "Ll/ho2;", "Ll/ses;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Ll/hp50;", "Y3", "(Ll/hp50;)V", "X3", "j", "Ll/hp50;", "openGiftWallInfo", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m24057S3(vls vlsVar, fp50 fp50Var) {
        ses sesVar = (ses) ((bwr) vlsVar).viewModel;
        if (sesVar != null) {
            sesVar.mo5216p();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m24058T3(vls vlsVar, BLiveExtraResponse bLiveExtraResponse) {
        ses sesVar = (ses) ((bwr) vlsVar).viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        sesVar.m22404g0(bLiveNewGiftWallDetailInfoItem);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m24059U3(vls vlsVar, hp50 hp50Var) {
        hp50Var.getClass();
        vlsVar.m24063Y3(hp50Var);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m24060V3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showGiftDetail().j(gift);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m24061W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showUserCardDialog().j(user);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m24062X3() {
        User userCardUser;
        hp50 hp50Var = this.openGiftWallInfo;
        String str = (hp50Var == null || (userCardUser = hp50Var.getUserCardUser()) == null) ? null : ((DbObject) userCardUser).id;
        String strM17239o = m25547E2().m17239o();
        hp50 hp50Var2 = this.openGiftWallInfo;
        duringCreated(zfv.m27211H0(str, strM17239o, hp50Var2 != null ? hp50Var2.getCategoryId() : null)).subscribe(ffw.h(new e30() { // from class: l.uls
            public final void call(Object obj) {
                vls.m24058T3(this.f20703a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m24063Y3(hp50 info) {
        this.openGiftWallInfo = info;
        if (((bwr) this).viewModel == null) {
            Act act = this.f22037f;
            act.getClass();
            ses sesVar = new ses(act, this);
            ((bwr) this).viewModel = sesVar;
            sesVar.mo5212i1(this);
        }
        ((ses) ((bwr) this).viewModel).m5211E();
        m24062X3();
    }

    /* JADX INFO: renamed from: t */
    public void m24064t() {
        super.t();
        duringCreated((c) m25548F2().GiftWallV2Event.showCategorySetDialog().g()).subscribe(ffw.h(new e30() { // from class: l.sls
            public final void call(Object obj) {
                vls.m24059U3(this.f19118a, (hp50) obj);
            }
        }));
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        duringCreated((c) new LiveEventBus.GiftDialogEventGroup(liveEventBusM25548F2).openGiftDialogEvent().g()).subscribe(ffw.h(new e30() { // from class: l.tls
            public final void call(Object obj) {
                vls.m24057S3(this.f20301a, (fp50) obj);
            }
        }));
    }
}

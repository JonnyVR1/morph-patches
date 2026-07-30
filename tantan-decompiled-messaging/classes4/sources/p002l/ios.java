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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\rR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ll/ios;", "Ll/x6s;", "Ll/ho2;", "Ll/aos;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "Ll/hp50;", "", "Y3", "(Ll/hp50;)V", "t", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "X3", "j", "Ll/hp50;", "openGiftWallInfo", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ios extends x6s<ho2, aos> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public hp50 openGiftWallInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ios(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m15269S3(ios iosVar, fp50 fp50Var) {
        aos aosVar = (aos) ((bwr) iosVar).viewModel;
        if (aosVar != null) {
            aosVar.mo5216p();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m15270T3(ios iosVar, BLiveExtraResponse bLiveExtraResponse) {
        aos aosVar = (aos) ((bwr) iosVar).viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        aosVar.m9989f0(bLiveNewGiftWallDetailInfoItem);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m15271U3(ios iosVar, hp50 hp50Var) {
        hp50Var.getClass();
        iosVar.m15272Y3(hp50Var);
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m15272Y3(hp50 info) {
        this.openGiftWallInfo = info;
        if (((bwr) this).viewModel == null) {
            Act act = this.f22037f;
            act.getClass();
            aos aosVar = new aos(act, this);
            ((bwr) this).viewModel = aosVar;
            aosVar.mo5212i1(this);
        }
        ((aos) ((bwr) this).viewModel).m5211E();
        m15275X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m15273V3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showGiftDetail().j(gift);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m15274W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showUserCardDialog().j(user);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m15275X3() {
        User userCardUser;
        hp50 hp50Var = this.openGiftWallInfo;
        duringCreated(zfv.m27215J0((hp50Var == null || (userCardUser = hp50Var.getUserCardUser()) == null) ? null : ((DbObject) userCardUser).id, m25547E2().m17239o())).subscribe(ffw.h(new e30() { // from class: l.hos
            public final void call(Object obj) {
                ios.m15270T3(this.f12205a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m15276t() {
        super.t();
        duringCreated((c) m25548F2().GiftWallV2Event.showSkinSetDialog().g()).subscribe(ffw.h(new e30() { // from class: l.fos
            public final void call(Object obj) {
                ios.m15271U3(this.f10577a, (hp50) obj);
            }
        }));
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        duringCreated((c) new LiveEventBus.GiftDialogEventGroup(liveEventBusM25548F2).openGiftDialogEvent().g()).subscribe(ffw.h(new e30() { // from class: l.gos
            public final void call(Object obj) {
                ios.m15269S3(this.f11567a, (fp50) obj);
            }
        }));
    }
}

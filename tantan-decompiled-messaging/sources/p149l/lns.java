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
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/lns;", "Ll/x6s;", "Ll/ho2;", "Ll/fns;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "Ll/hp50;", "", "Y3", "(Ll/hp50;)V", "X3", "()V", Constants.KEY_T, "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "j", "Ll/hp50;", "openGiftWallInfo", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class lns extends x6s<ho2, fns> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public hp50 openGiftWallInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lns(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m150712S3(lns lnsVar, fp50 fp50Var) {
        fns fnsVar = (fns) lnsVar.viewModel;
        if (fnsVar != null) {
            fnsVar.mo71838p();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m150713T3(lns lnsVar, BLiveExtraResponse bLiveExtraResponse) {
        fns fnsVar = (fns) lnsVar.viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        fnsVar.m122377e0(bLiveNewGiftWallDetailInfoItem);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m150714U3(lns lnsVar, hp50 hp50Var) {
        hp50Var.getClass();
        lnsVar.m150716Y3(hp50Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    private final void m150715X3() {
        User userM132330c;
        hp50 hp50Var = this.openGiftWallInfo;
        duringCreated(zfv.m218510I0((hp50Var == null || (userM132330c = hp50Var.getUserCardUser()) == null) ? null : userM132330c.f56011id, m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.kns
            @Override // p149l.e30
            public final void call(Object obj) {
                lns.m150713T3(this.f123909a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m150716Y3(hp50 info) {
        this.openGiftWallInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            fns fnsVar = new fns(act, this);
            this.viewModel = fnsVar;
            fnsVar.mo21065i1(this);
        }
        ((fns) this.viewModel).m71834E();
        m150715X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m150717V3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new GiftWallV2Event().showGiftDetail().mo172463j(gift);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m150718W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new GiftWallV2Event().showUserCardDialog().mo172463j(user);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().GiftWallV2Event.showSetDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ins
            @Override // p149l.e30
            public final void call(Object obj) {
                lns.m150714U3(this.f114038a, (hp50) obj);
            }
        }));
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        duringCreated(liveEventBusM206028F2.new GiftDialogEventGroup().openGiftDialogEvent().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.jns
            @Override // p149l.e30
            public final void call(Object obj) {
                lns.m150712S3(this.f118885a, (fp50) obj);
            }
        }));
    }
}

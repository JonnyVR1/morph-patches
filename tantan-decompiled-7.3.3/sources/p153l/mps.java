package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.GiftDialogEventGroup;
import com.tantan.live.eventbus.LiveEventBus.GiftWallV2Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/mps;", "Ll/y8s;", "Ll/oo2;", "Ll/gps;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "Ll/nx50;", "", "Y3", "(Ll/nx50;)V", "X3", "()V", Constants.KEY_T, "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "j", "Ll/nx50;", "openGiftWallInfo", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mps extends y8s<oo2, gps> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public nx50 openGiftWallInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mps(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m159381S3(mps mpsVar, lx50 lx50Var) {
        gps gpsVar = (gps) mpsVar.viewModel;
        if (gpsVar != null) {
            gpsVar.mo73021p();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m159382T3(mps mpsVar, BLiveExtraResponse bLiveExtraResponse) {
        gps gpsVar = (gps) mpsVar.viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        gpsVar.m131314e0(bLiveNewGiftWallDetailInfoItem);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m159383U3(mps mpsVar, nx50 nx50Var) {
        nx50Var.getClass();
        mpsVar.m159385Y3(nx50Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    private final void m159384X3() {
        User userM165100c;
        nx50 nx50Var = this.openGiftWallInfo;
        duringCreated(aiv.m98044I0((nx50Var == null || (userM165100c = nx50Var.getUserCardUser()) == null) ? null : userM165100c.f56859id, m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.lps
            @Override // p153l.y20
            public final void call(Object obj) {
                mps.m159382T3(this.f133117a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m159385Y3(nx50 info) {
        this.openGiftWallInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            gps gpsVar = new gps(act, this);
            this.viewModel = gpsVar;
            gpsVar.mo22064i1(this);
        }
        ((gps) this.viewModel).m73017E();
        m159384X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m159386V3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new GiftWallV2Event().showGiftDetail().mo199273j(gift);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m159387W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new GiftWallV2Event().showUserCardDialog().mo199273j(user);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().GiftWallV2Event.showSetDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.jps
            @Override // p153l.y20
            public final void call(Object obj) {
                mps.m159383U3(this.f122132a, (nx50) obj);
            }
        }));
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        duringCreated(liveEventBusM213811F2.new GiftDialogEventGroup().openGiftDialogEvent().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.kps
            @Override // p153l.y20
            public final void call(Object obj) {
                mps.m159381S3(this.f127908a, (lx50) obj);
            }
        }));
    }
}

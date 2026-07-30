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
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\rR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/jqs;", "Ll/y8s;", "Ll/oo2;", "Ll/bqs;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "Ll/nx50;", "", "Y3", "(Ll/nx50;)V", Constants.KEY_T, "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "user", "W3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "X3", "j", "Ll/nx50;", "openGiftWallInfo", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jqs extends y8s<oo2, bqs> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public nx50 openGiftWallInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqs(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m146626S3(jqs jqsVar, lx50 lx50Var) {
        bqs bqsVar = (bqs) jqsVar.viewModel;
        if (bqsVar != null) {
            bqsVar.mo73021p();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m146627T3(jqs jqsVar, BLiveExtraResponse bLiveExtraResponse) {
        bqs bqsVar = (bqs) jqsVar.viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        bqsVar.m106005f0(bLiveNewGiftWallDetailInfoItem);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m146628U3(jqs jqsVar, nx50 nx50Var) {
        nx50Var.getClass();
        jqsVar.m146629Y3(nx50Var);
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m146629Y3(nx50 info) {
        this.openGiftWallInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            bqs bqsVar = new bqs(act, this);
            this.viewModel = bqsVar;
            bqsVar.mo22064i1(this);
        }
        ((bqs) this.viewModel).m73017E();
        m146632X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m146630V3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new GiftWallV2Event().showGiftDetail().mo199273j(gift);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m146631W3(@NotNull BLiveNewGiftWallUser user) {
        user.getClass();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new GiftWallV2Event().showUserCardDialog().mo199273j(user);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public final void m146632X3() {
        User userM165100c;
        nx50 nx50Var = this.openGiftWallInfo;
        duringCreated(aiv.m98046J0((nx50Var == null || (userM165100c = nx50Var.getUserCardUser()) == null) ? null : userM165100c.f56859id, m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.iqs
            @Override // p153l.y20
            public final void call(Object obj) {
                jqs.m146627T3(this.f116460a, (BLiveExtraResponse) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().GiftWallV2Event.showSkinSetDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.gqs
            @Override // p153l.y20
            public final void call(Object obj) {
                jqs.m146628U3(this.f105725a, (nx50) obj);
            }
        }));
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        duringCreated(liveEventBusM213811F2.new GiftDialogEventGroup().openGiftDialogEvent().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.hqs
            @Override // p153l.y20
            public final void call(Object obj) {
                jqs.m146626S3(this.f111174a, (lx50) obj);
            }
        }));
    }
}

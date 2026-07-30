package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.GiftDialogEventGroup;
import com.tantan.live.eventbus.LiveEventBus.GiftWallV2Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nR\"\u0010&\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010/\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010 ¨\u00060"}, m88121d2 = {"Ll/xrs;", "Ll/y8s;", "Ll/oo2;", "Ll/qrs;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "R3", "()V", Constants.KEY_T, "O3", "", "helpUrl", "", "height", "a4", "(Ljava/lang/String;I)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", Item.TYPE, "b4", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "categoryId", "Y3", "(Ljava/lang/String;)V", "Ll/nx50;", "d4", "(Ll/nx50;)V", "c4", "e4", "", "j", "Z", "isOpenUserCardDialog", "()Z", "setOpenUserCardDialog", "(Z)V", "k", "Ll/nx50;", "X3", "()Ll/nx50;", "setOpenGiftWallInfo", "openGiftWallInfo", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xrs extends y8s<oo2, qrs> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isOpenUserCardDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public nx50 openGiftWallInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrs(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.isOpenUserCardDialog = true;
    }

    /* JADX INFO: renamed from: S3 */
    public static void m212852S3(xrs xrsVar, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        bLiveNewGiftWallGift.getClass();
        xrsVar.m212859Z3(bLiveNewGiftWallGift);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m212853T3(xrs xrsVar, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        bLiveNewGiftWallUser.getClass();
        xrsVar.m212861b4(bLiveNewGiftWallUser);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m212854U3(xrs xrsVar, nx50 nx50Var) {
        xrsVar.isOpenUserCardDialog = true;
        nx50Var.getClass();
        xrsVar.m212863d4(nx50Var);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m212855V3(xrs xrsVar, BLiveExtraResponse bLiveExtraResponse) {
        UserCardBean userCardBeanM165099b;
        nx50 nx50Var = xrsVar.openGiftWallInfo;
        if (nx50Var == null || (userCardBeanM165099b = nx50Var.getUserCardBean()) == null) {
            return;
        }
        qrs qrsVar = (qrs) xrsVar.viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        qrsVar.m177693v1(bLiveNewGiftWallDetailInfoItem, userCardBeanM165099b);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m212856W3(xrs xrsVar, lx50 lx50Var) {
        xrsVar.isOpenUserCardDialog = false;
        qrs qrsVar = (qrs) xrsVar.viewModel;
        if (qrsVar == null || qrsVar == null) {
            return;
        }
        qrsVar.mo73021p();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        if (this.isOpenUserCardDialog) {
            m212864e4();
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        dum<? extends T> dumVar = this.f196918e;
        dumVar.getClass();
        m153103z2(new mos(dumVar));
        dum<? extends T> dumVar2 = this.f196918e;
        dumVar2.getClass();
        m153103z2(new jqs(dumVar2));
        dum<? extends T> dumVar3 = this.f196918e;
        dumVar3.getClass();
        m153103z2(new wns(dumVar3));
        dum<? extends T> dumVar4 = this.f196918e;
        dumVar4.getClass();
        m153103z2(new mps(dumVar4));
    }

    @Nullable
    /* JADX INFO: renamed from: X3, reason: from getter */
    public final nx50 getOpenGiftWallInfo() {
        return this.openGiftWallInfo;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m212858Y3(@NotNull String categoryId) {
        categoryId.getClass();
        nx50 nx50Var = this.openGiftWallInfo;
        if (nx50Var != null) {
            nx50Var.m165101d(categoryId);
            LiveEventBus liveEventBusM213811F2 = m213811F2();
            liveEventBusM213811F2.getClass();
            liveEventBusM213811F2.new GiftWallV2Event().showCategorySetDialog().mo199273j(nx50Var);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m212859Z3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        nx50 nx50Var = this.openGiftWallInfo;
        if (nx50Var != null) {
            String str = gift.f45259id;
            str.getClass();
            String str2 = gift.originalId;
            str2.getClass();
            mx50 mx50Var = new mx50(str, str2, nx50Var.getUserCardBean(), nx50Var.getUserCardUser());
            LiveEventBus liveEventBusM213811F2 = m213811F2();
            liveEventBusM213811F2.getClass();
            liveEventBusM213811F2.new GiftWallV2Event().showGiftWallV2DetailDialog().mo199273j(mx50Var);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m212860a4(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(ErrorCode.RENDER_TARGET_FAILED).m174141B(helpUrl).m174142p(CommonH5Builder.BgType.TRAN_BG).m174146t(80).m174145s(24).m174140A(bnl0.m105592y0(), height).m174143q());
    }

    /* JADX INFO: renamed from: b4 */
    public final void m212861b4(@NotNull BLiveNewGiftWallUser item) {
        item.getClass();
        Context contextM113230C0 = m113230C0();
        if (contextM113230C0 == null) {
            return;
        }
        if (Intrinsics.m88377d(item.fakeType, "mystery")) {
            o1j0.m165651y("神秘人不展示个人资料页面");
            return;
        }
        User userM207651V = zrv.f205799a.m207651V();
        userM207651V.getClass();
        String str = item.f45264id;
        str.getClass();
        vx50 vx50Var = new vx50(contextM113230C0, userM207651V, str);
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new GiftWallV2Event().openProfilePage().mo199273j(vx50Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c4 */
    public final void m212862c4() {
        User userM165100c;
        nx50 nx50Var = this.openGiftWallInfo;
        duringCreated(aiv.m98038F0((nx50Var == null || (userM165100c = nx50Var.getUserCardUser()) == null) ? null : userM165100c.f56859id, m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.wrs
            @Override // p153l.y20
            public final void call(Object obj) {
                xrs.m212855V3(this.f190557a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m212863d4(nx50 info) {
        this.openGiftWallInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            qrs qrsVar = new qrs(act, this);
            this.viewModel = qrsVar;
            qrsVar.mo22064i1(this);
        }
        ((qrs) this.viewModel).m73017E();
        m212862c4();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m212864e4() {
        User userM165100c;
        String str;
        nx50 nx50Var = this.openGiftWallInfo;
        if (nx50Var == null || (userM165100c = nx50Var.getUserCardUser()) == null || (str = userM165100c.f56859id) == null) {
            return;
        }
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(7008).showShadow().userId(str).setSource("giftWall").setFromIdentity(csq.m112227a(this, mo104749j3(), str, 7008)).setTo(csq.m112230d(this, mo104749j3(), str, 7008)).setScene("giftWall").trackFrom("giftWall").build());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().GiftWallV2Event.showGiftWallV2Dialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.srs
            @Override // p153l.y20
            public final void call(Object obj) {
                xrs.m212854U3(this.f170367a, (nx50) obj);
            }
        }));
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        duringCreated(liveEventBusM213811F2.new GiftDialogEventGroup().openGiftDialogEvent().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.trs
            @Override // p153l.y20
            public final void call(Object obj) {
                xrs.m212856W3(this.f175929a, (lx50) obj);
            }
        }));
        duringCreated(m213811F2().GiftWallV2Event.showGiftDetail().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.urs
            @Override // p153l.y20
            public final void call(Object obj) {
                xrs.m212852S3(this.f180700a, (BLiveNewGiftWallGift) obj);
            }
        }));
        duringCreated(m213811F2().GiftWallV2Event.showUserCardDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.vrs
            @Override // p153l.y20
            public final void call(Object obj) {
                xrs.m212853T3(this.f185518a, (BLiveNewGiftWallUser) obj);
            }
        }));
    }
}

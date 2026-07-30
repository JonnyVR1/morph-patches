package p002l;

import android.content.Context;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nR\"\u0010&\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010/\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010 ¨\u00060"}, d2 = {"Ll/wps;", "Ll/x6s;", "Ll/ho2;", "Ll/pps;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "R3", "()V", "t", "O3", "", "helpUrl", "", "height", "a4", "(Ljava/lang/String;I)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", "item", "b4", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "categoryId", "Y3", "(Ljava/lang/String;)V", "Ll/hp50;", "d4", "(Ll/hp50;)V", "c4", "e4", "", "j", "Z", "isOpenUserCardDialog", "()Z", "setOpenUserCardDialog", "(Z)V", "k", "Ll/hp50;", "X3", "()Ll/hp50;", "setOpenGiftWallInfo", "openGiftWallInfo", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class wps extends x6s<ho2, pps> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isOpenUserCardDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public hp50 openGiftWallInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wps(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.isOpenUserCardDialog = true;
    }

    /* JADX INFO: renamed from: S3 */
    public static void m25274S3(wps wpsVar, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        bLiveNewGiftWallGift.getClass();
        wpsVar.m25281Z3(bLiveNewGiftWallGift);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m25275T3(wps wpsVar, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        bLiveNewGiftWallUser.getClass();
        wpsVar.m25283b4(bLiveNewGiftWallUser);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m25276U3(wps wpsVar, hp50 hp50Var) {
        wpsVar.isOpenUserCardDialog = true;
        hp50Var.getClass();
        wpsVar.m25285d4(hp50Var);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m25277V3(wps wpsVar, BLiveExtraResponse bLiveExtraResponse) {
        UserCardBean userCardBean;
        hp50 hp50Var = wpsVar.openGiftWallInfo;
        if (hp50Var == null || (userCardBean = hp50Var.getUserCardBean()) == null) {
            return;
        }
        pps ppsVar = (pps) ((bwr) wpsVar).viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        ppsVar.m20614v1(bLiveNewGiftWallDetailInfoItem, userCardBean);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m25278W3(wps wpsVar, fp50 fp50Var) {
        wpsVar.isOpenUserCardDialog = false;
        pps ppsVar = (pps) ((bwr) wpsVar).viewModel;
        if (ppsVar == null || ppsVar == null) {
            return;
        }
        ppsVar.mo5216p();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        if (this.isOpenUserCardDialog) {
            m25286e4();
        }
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
        super.mo9823R3();
        bsm<? extends T> bsmVar = this.f22036e;
        bsmVar.getClass();
        z2(new lms(bsmVar));
        bsm<? extends T> bsmVar2 = this.f22036e;
        bsmVar2.getClass();
        z2(new ios(bsmVar2));
        bsm<? extends T> bsmVar3 = this.f22036e;
        bsmVar3.getClass();
        z2(new vls(bsmVar3));
        bsm<? extends T> bsmVar4 = this.f22036e;
        bsmVar4.getClass();
        z2(new lns(bsmVar4));
    }

    @Nullable
    /* JADX INFO: renamed from: X3, reason: from getter */
    public final hp50 getOpenGiftWallInfo() {
        return this.openGiftWallInfo;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m25280Y3(@NotNull String categoryId) {
        categoryId.getClass();
        hp50 hp50Var = this.openGiftWallInfo;
        if (hp50Var != null) {
            hp50Var.m14667d(categoryId);
            LiveEventBus liveEventBusM25548F2 = m25548F2();
            liveEventBusM25548F2.getClass();
            new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showCategorySetDialog().j(hp50Var);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m25281Z3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        hp50 hp50Var = this.openGiftWallInfo;
        if (hp50Var != null) {
            String str = gift.id;
            str.getClass();
            String str2 = gift.originalId;
            str2.getClass();
            gp50 gp50Var = new gp50(str, str2, hp50Var.getUserCardBean(), hp50Var.getUserCardUser());
            LiveEventBus liveEventBusM25548F2 = m25548F2();
            liveEventBusM25548F2.getClass();
            new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).showGiftWallV2DetailDialog().j(gp50Var);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m25282a4(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m25548F2().OpenH5Event.open().j(jp50.m16064c(7002).m16094B(helpUrl).m16095p(CommonH5Builder.BgType.TRAN_BG).m16099t(80).m16098s(24).m16093A(xdl0.y0(), height).m16096q());
    }

    /* JADX INFO: renamed from: b4 */
    public final void m25283b4(@NotNull BLiveNewGiftWallUser item) {
        item.getClass();
        Context contextC0 = C0();
        if (contextC0 == null) {
            return;
        }
        if (Intrinsics.d(item.fakeType, "mystery")) {
            lsi0.y("神秘人不展示个人资料页面");
            return;
        }
        User userV = ypv.a.V();
        userV.getClass();
        String str = item.id;
        str.getClass();
        pp50 pp50Var = new pp50(contextC0, userV, str);
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        new LiveEventBus.GiftWallV2Event(liveEventBusM25548F2).openProfilePage().j(pp50Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public final void m25284c4() {
        User userCardUser;
        hp50 hp50Var = this.openGiftWallInfo;
        duringCreated(zfv.m27207F0((hp50Var == null || (userCardUser = hp50Var.getUserCardUser()) == null) ? null : ((DbObject) userCardUser).id, m25547E2().m17239o())).subscribe(ffw.h(new e30() { // from class: l.vps
            public final void call(Object obj) {
                wps.m25277V3(this.f21262a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m25285d4(hp50 info) {
        this.openGiftWallInfo = info;
        if (((bwr) this).viewModel == null) {
            Act act = this.f22037f;
            act.getClass();
            pps ppsVar = new pps(act, this);
            ((bwr) this).viewModel = ppsVar;
            ppsVar.mo5212i1(this);
        }
        ((pps) ((bwr) this).viewModel).m5211E();
        m25284c4();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m25286e4() {
        User userCardUser;
        String str;
        hp50 hp50Var = this.openGiftWallInfo;
        if (hp50Var == null || (userCardUser = hp50Var.getUserCardUser()) == null || (str = ((DbObject) userCardUser).id) == null) {
            return;
        }
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(7008).showShadow().userId(str).setSource("giftWall").setFromIdentity(bqq.m10554a(this, mo9759j3(), str, 7008)).setTo(bqq.m10557d(this, mo9759j3(), str, 7008)).setScene("giftWall").trackFrom("giftWall").build());
    }

    /* JADX INFO: renamed from: t */
    public void m25287t() {
        super.t();
        duringCreated((c) m25548F2().GiftWallV2Event.showGiftWallV2Dialog().g()).subscribe(ffw.h(new e30() { // from class: l.rps
            public final void call(Object obj) {
                wps.m25276U3(this.f18639a, (hp50) obj);
            }
        }));
        LiveEventBus liveEventBusM25548F2 = m25548F2();
        liveEventBusM25548F2.getClass();
        duringCreated((c) new LiveEventBus.GiftDialogEventGroup(liveEventBusM25548F2).openGiftDialogEvent().g()).subscribe(ffw.h(new e30() { // from class: l.sps
            public final void call(Object obj) {
                wps.m25278W3(this.f19242a, (fp50) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftWallV2Event.showGiftDetail().g()).subscribe(ffw.h(new e30() { // from class: l.tps
            public final void call(Object obj) {
                wps.m25274S3(this.f20333a, (BLiveNewGiftWallGift) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftWallV2Event.showUserCardDialog().g()).subscribe(ffw.h(new e30() { // from class: l.ups
            public final void call(Object obj) {
                wps.m25275T3(this.f20749a, (BLiveNewGiftWallUser) obj);
            }
        }));
    }
}

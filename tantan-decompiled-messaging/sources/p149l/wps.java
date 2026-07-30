package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.GiftDialogEventGroup;
import com.tantan.live.eventbus.LiveEventBus.GiftWallV2Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nR\"\u0010&\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010/\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010 ¨\u00060"}, m87232d2 = {"Ll/wps;", "Ll/x6s;", "Ll/ho2;", "Ll/pps;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "R3", "()V", Constants.KEY_T, "O3", "", "helpUrl", "", "height", "a4", "(Ljava/lang/String;I)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;", Item.TYPE, "b4", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallUser;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;", "gift", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGift;)V", "categoryId", "Y3", "(Ljava/lang/String;)V", "Ll/hp50;", "d4", "(Ll/hp50;)V", "c4", "e4", "", "j", "Z", "isOpenUserCardDialog", "()Z", "setOpenUserCardDialog", "(Z)V", "k", "Ll/hp50;", "X3", "()Ll/hp50;", "setOpenGiftWallInfo", "openGiftWallInfo", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m204937S3(wps wpsVar, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        bLiveNewGiftWallGift.getClass();
        wpsVar.m204944Z3(bLiveNewGiftWallGift);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m204938T3(wps wpsVar, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        bLiveNewGiftWallUser.getClass();
        wpsVar.m204946b4(bLiveNewGiftWallUser);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m204939U3(wps wpsVar, hp50 hp50Var) {
        wpsVar.isOpenUserCardDialog = true;
        hp50Var.getClass();
        wpsVar.m204948d4(hp50Var);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m204940V3(wps wpsVar, BLiveExtraResponse bLiveExtraResponse) {
        UserCardBean userCardBeanM132329b;
        hp50 hp50Var = wpsVar.openGiftWallInfo;
        if (hp50Var == null || (userCardBeanM132329b = hp50Var.getUserCardBean()) == null) {
            return;
        }
        pps ppsVar = (pps) wpsVar.viewModel;
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = bLiveExtraResponse.data.giftWallV2;
        bLiveNewGiftWallDetailInfoItem.getClass();
        ppsVar.m170858v1(bLiveNewGiftWallDetailInfoItem, userCardBeanM132329b);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m204941W3(wps wpsVar, fp50 fp50Var) {
        wpsVar.isOpenUserCardDialog = false;
        pps ppsVar = (pps) wpsVar.viewModel;
        if (ppsVar == null || ppsVar == null) {
            return;
        }
        ppsVar.mo71838p();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        if (this.isOpenUserCardDialog) {
            m204949e4();
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        bsm<? extends T> bsmVar = this.f188512e;
        bsmVar.getClass();
        m144512z2(new lms(bsmVar));
        bsm<? extends T> bsmVar2 = this.f188512e;
        bsmVar2.getClass();
        m144512z2(new ios(bsmVar2));
        bsm<? extends T> bsmVar3 = this.f188512e;
        bsmVar3.getClass();
        m144512z2(new vls(bsmVar3));
        bsm<? extends T> bsmVar4 = this.f188512e;
        bsmVar4.getClass();
        m144512z2(new lns(bsmVar4));
    }

    @Nullable
    /* JADX INFO: renamed from: X3, reason: from getter */
    public final hp50 getOpenGiftWallInfo() {
        return this.openGiftWallInfo;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m204943Y3(@NotNull String categoryId) {
        categoryId.getClass();
        hp50 hp50Var = this.openGiftWallInfo;
        if (hp50Var != null) {
            hp50Var.m132331d(categoryId);
            LiveEventBus liveEventBusM206028F2 = m206028F2();
            liveEventBusM206028F2.getClass();
            liveEventBusM206028F2.new GiftWallV2Event().showCategorySetDialog().mo172463j(hp50Var);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m204944Z3(@NotNull BLiveNewGiftWallGift gift) {
        gift.getClass();
        hp50 hp50Var = this.openGiftWallInfo;
        if (hp50Var != null) {
            String str = gift.f44411id;
            str.getClass();
            String str2 = gift.originalId;
            str2.getClass();
            gp50 gp50Var = new gp50(str, str2, hp50Var.getUserCardBean(), hp50Var.getUserCardUser());
            LiveEventBus liveEventBusM206028F2 = m206028F2();
            liveEventBusM206028F2.getClass();
            liveEventBusM206028F2.new GiftWallV2Event().showGiftWallV2DetailDialog().mo172463j(gp50Var);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m204945a4(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(ErrorCode.RENDER_TARGET_FAILED).m142598B(helpUrl).m142599p(CommonH5Builder.BgType.TRAN_BG).m142603t(80).m142602s(24).m142597A(xdl0.m208412y0(), height).m142600q());
    }

    /* JADX INFO: renamed from: b4 */
    public final void m204946b4(@NotNull BLiveNewGiftWallUser item) {
        item.getClass();
        Context contextM104249C0 = m104249C0();
        if (contextM104249C0 == null) {
            return;
        }
        if (Intrinsics.m87488d(item.fakeType, "mystery")) {
            lsi0.m151595y("神秘人不展示个人资料页面");
            return;
        }
        User userM199329V = ypv.f199493a.m199329V();
        userM199329V.getClass();
        String str = item.f44416id;
        str.getClass();
        pp50 pp50Var = new pp50(contextM104249C0, userM199329V, str);
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new GiftWallV2Event().openProfilePage().mo172463j(pp50Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public final void m204947c4() {
        User userM132330c;
        hp50 hp50Var = this.openGiftWallInfo;
        duringCreated(zfv.m218504F0((hp50Var == null || (userM132330c = hp50Var.getUserCardUser()) == null) ? null : userM132330c.f56011id, m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.vps
            @Override // p149l.e30
            public final void call(Object obj) {
                wps.m204940V3(this.f182521a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m204948d4(hp50 info) {
        this.openGiftWallInfo = info;
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            pps ppsVar = new pps(act, this);
            this.viewModel = ppsVar;
            ppsVar.mo21065i1(this);
        }
        ((pps) this.viewModel).m71834E();
        m204947c4();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m204949e4() {
        User userM132330c;
        String str;
        hp50 hp50Var = this.openGiftWallInfo;
        if (hp50Var == null || (userM132330c = hp50Var.getUserCardUser()) == null || (str = userM132330c.f56011id) == null) {
            return;
        }
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(7008).showShadow().userId(str).setSource("giftWall").setFromIdentity(bqq.m103386a(this, mo96662j3(), str, 7008)).setTo(bqq.m103389d(this, mo96662j3(), str, 7008)).setScene("giftWall").trackFrom("giftWall").build());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().GiftWallV2Event.showGiftWallV2Dialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.rps
            @Override // p149l.e30
            public final void call(Object obj) {
                wps.m204939U3(this.f160560a, (hp50) obj);
            }
        }));
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        duringCreated(liveEventBusM206028F2.new GiftDialogEventGroup().openGiftDialogEvent().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.sps
            @Override // p149l.e30
            public final void call(Object obj) {
                wps.m204941W3(this.f165878a, (fp50) obj);
            }
        }));
        duringCreated(m206028F2().GiftWallV2Event.showGiftDetail().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.tps
            @Override // p149l.e30
            public final void call(Object obj) {
                wps.m204937S3(this.f171505a, (BLiveNewGiftWallGift) obj);
            }
        }));
        duringCreated(m206028F2().GiftWallV2Event.showUserCardDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ups
            @Override // p149l.e30
            public final void call(Object obj) {
                wps.m204938T3(this.f177665a, (BLiveNewGiftWallUser) obj);
            }
        }));
    }
}

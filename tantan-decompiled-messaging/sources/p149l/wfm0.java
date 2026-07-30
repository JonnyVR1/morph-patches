package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionPlatformLeaderboardInfo;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/wfm0;", "Ll/nnn0;", "D", "Ll/rfm0;", "Ll/gfm0;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/bsm;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", OMSTemplateModeType.view, "<init>", "(Ljava/lang/String;Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;)V", "", "c", "()V", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "L3", "(I)V", "", RequestParameters.SUBRESOURCE_APPEND, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionPlatformLeaderboardInfo;", "boardInfo", "", "Ll/d1q;", "R3", "(ZLcom/p1/mobile/putong/live/base/data/BLiveAuctionPlatformLeaderboardInfo;)Ljava/util/List;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class wfm0<D extends nnn0> extends rfm0<gfm0, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfm0(@NotNull String str, @NotNull bsm<D> bsmVar, @NotNull LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPage) {
        super(str, bsmVar, liveVoiceAuctionLeaderboardListPage);
        str.getClass();
        bsmVar.getClass();
        liveVoiceAuctionLeaderboardListPage.getClass();
    }

    /* JADX INFO: renamed from: M3 */
    public static void m202985M3(wfm0 wfm0Var, BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo) {
        LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPage = (LiveVoiceAuctionLeaderboardListPage) wfm0Var.viewModel;
        String strM179133J3 = wfm0Var.getName();
        bLiveAuctionPlatformLeaderboardInfo.getClass();
        liveVoiceAuctionLeaderboardListPage.m77838l0(strM179133J3, true, wfm0Var.m202989R3(true, bLiveAuctionPlatformLeaderboardInfo));
        wfm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m77836j0(vwb.m200296J(bLiveAuctionPlatformLeaderboardInfo.leaderboards));
    }

    /* JADX INFO: renamed from: N3 */
    public static void m202986N3(wfm0 wfm0Var, BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo) {
        LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPage = (LiveVoiceAuctionLeaderboardListPage) wfm0Var.viewModel;
        String strM179133J3 = wfm0Var.getName();
        bLiveAuctionPlatformLeaderboardInfo.getClass();
        liveVoiceAuctionLeaderboardListPage.m77838l0(strM179133J3, false, wfm0Var.m202989R3(false, bLiveAuctionPlatformLeaderboardInfo));
        ((LiveVoiceAuctionLeaderboardListPage) wfm0Var.viewModel).m77840n0(bLiveAuctionPlatformLeaderboardInfo.myLeaderboard);
        wfm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m77837k0();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m202987O3(wfm0 wfm0Var, Throwable th) {
        ((LiveVoiceAuctionLeaderboardListPage) wfm0Var.viewModel).m77839m0(wfm0Var.getName(), true);
        wfm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m77837k0();
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m202988P3(wfm0 wfm0Var, Throwable th) {
        ((LiveVoiceAuctionLeaderboardListPage) wfm0Var.viewModel).m77839m0(wfm0Var.getName(), true);
        wfm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m77836j0(false);
        th.getClass();
        r610.m178005j(th);
    }

    @Override // p149l.rfm0
    /* JADX INFO: renamed from: L3 */
    public void mo179135L3(int offset) {
        duringCreated(p61.m167535W(getName(), offset, 0, 4, null)).subscribe(ffw.m121194e(new e30() { // from class: l.ufm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wfm0.m202985M3(this.f176286a, (BLiveAuctionPlatformLeaderboardInfo) obj);
            }
        }, new e30() { // from class: l.vfm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wfm0.m202988P3(this.f181286a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public final List<d1q<?>> m202989R3(boolean append, BLiveAuctionPlatformLeaderboardInfo boardInfo) {
        long jM155944o;
        ArrayList arrayList = new ArrayList();
        if (vwb.m200296J(boardInfo.leaderboards)) {
            if (append) {
                arrayList.add(new hfm0());
            }
        } else if (TextUtils.equals(getName(), "worldRecord")) {
            Calendar calendar = Calendar.getInstance();
            List<d1q<?>> data = append ? ((LiveVoiceAuctionLeaderboardListPage) this.viewModel).getData() : new ArrayList<>();
            if (vwb.m200296J(data)) {
                jM155944o = mqi0.m155944o();
            } else {
                Object objLast = CollectionsKt.last((List<? extends Object>) data);
                objLast.getClass();
                jM155944o = ((gfm0) objLast).getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().auctionTime * 1000;
            }
            calendar.setTimeInMillis(jM155944o);
            Calendar calendar2 = Calendar.getInstance();
            List<BLiveAuctionLeaderboardItem> list = boardInfo.leaderboards;
            if (list != null) {
                for (BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem : list) {
                    calendar2.setTimeInMillis(bLiveAuctionLeaderboardItem.auctionTime * 1000);
                    if (calendar.get(1) != calendar2.get(1)) {
                        arrayList.add(new ifm0(bLiveAuctionLeaderboardItem));
                    }
                    arrayList.add(new gfm0(getName(), bLiveAuctionLeaderboardItem));
                    calendar.setTimeInMillis(calendar2.getTimeInMillis());
                }
            }
            if (!append && (CollectionsKt.first((List) arrayList) instanceof ifm0)) {
                arrayList.remove(0);
                return arrayList;
            }
        } else {
            List<BLiveAuctionLeaderboardItem> list2 = boardInfo.leaderboards;
            if (list2 != null) {
                for (BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem2 : list2) {
                    String strM179133J3 = getName();
                    bLiveAuctionLeaderboardItem2.getClass();
                    arrayList.add(new gfm0(strM179133J3, bLiveAuctionLeaderboardItem2));
                }
            }
        }
        return arrayList;
    }

    @Override // p149l.rfm0
    /* JADX INFO: renamed from: c */
    public void mo179136c() {
        duringCreated(p61.m167535W(getName(), 0, 0, 4, null)).subscribe(ffw.m121194e(new e30() { // from class: l.sfm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wfm0.m202986N3(this.f164307a, (BLiveAuctionPlatformLeaderboardInfo) obj);
            }
        }, new e30() { // from class: l.tfm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wfm0.m202987O3(this.f170008a, (Throwable) obj);
            }
        }));
    }
}

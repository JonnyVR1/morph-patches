package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeaderboardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionPlatformLeaderboardInfo;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/apm0;", "Ll/rwn0;", "D", "Ll/vom0;", "Ll/kom0;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/dum;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", OMSTemplateModeType.view, "<init>", "(Ljava/lang/String;Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;)V", "", "c", "()V", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "L3", "(I)V", "", RequestParameters.SUBRESOURCE_APPEND, "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionPlatformLeaderboardInfo;", "boardInfo", "", "Ll/d3q;", "R3", "(ZLcom/p1/mobile/putong/live/base/data/BLiveAuctionPlatformLeaderboardInfo;)Ljava/util/List;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class apm0<D extends rwn0> extends vom0<kom0, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apm0(@NotNull String str, @NotNull dum<D> dumVar, @NotNull LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPage) {
        super(str, dumVar, liveVoiceAuctionLeaderboardListPage);
        str.getClass();
        dumVar.getClass();
        liveVoiceAuctionLeaderboardListPage.getClass();
    }

    /* JADX INFO: renamed from: M3 */
    public static void m99323M3(apm0 apm0Var, BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo) {
        LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPage = (LiveVoiceAuctionLeaderboardListPage) apm0Var.viewModel;
        String strM202124J3 = apm0Var.getName();
        bLiveAuctionPlatformLeaderboardInfo.getClass();
        liveVoiceAuctionLeaderboardListPage.m79021l0(strM202124J3, true, apm0Var.m99328R3(true, bLiveAuctionPlatformLeaderboardInfo));
        apm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m79019j0(jyb.m147479J(bLiveAuctionPlatformLeaderboardInfo.leaderboards));
    }

    /* JADX INFO: renamed from: N3 */
    public static void m99324N3(apm0 apm0Var, BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo) {
        LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPage = (LiveVoiceAuctionLeaderboardListPage) apm0Var.viewModel;
        String strM202124J3 = apm0Var.getName();
        bLiveAuctionPlatformLeaderboardInfo.getClass();
        liveVoiceAuctionLeaderboardListPage.m79021l0(strM202124J3, false, apm0Var.m99328R3(false, bLiveAuctionPlatformLeaderboardInfo));
        ((LiveVoiceAuctionLeaderboardListPage) apm0Var.viewModel).m79023n0(bLiveAuctionPlatformLeaderboardInfo.myLeaderboard);
        apm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m79020k0();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m99325O3(apm0 apm0Var, Throwable th) {
        ((LiveVoiceAuctionLeaderboardListPage) apm0Var.viewModel).m79022m0(apm0Var.getName(), true);
        apm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m79020k0();
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m99326P3(apm0 apm0Var, Throwable th) {
        ((LiveVoiceAuctionLeaderboardListPage) apm0Var.viewModel).m79022m0(apm0Var.getName(), true);
        apm0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String().m79019j0(false);
        th.getClass();
        bf10.m103834j(th);
    }

    @Override // p153l.vom0
    /* JADX INFO: renamed from: L3 */
    public void mo99327L3(int offset) {
        duringCreated(w61.m205034W(getName(), offset, 0, 4, null)).subscribe(dhw.m115826e(new y20() { // from class: l.yom0
            @Override // p153l.y20
            public final void call(Object obj) {
                apm0.m99323M3(this.f200991a, (BLiveAuctionPlatformLeaderboardInfo) obj);
            }
        }, new y20() { // from class: l.zom0
            @Override // p153l.y20
            public final void call(Object obj) {
                apm0.m99326P3(this.f205360a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public final List<d3q<?>> m99328R3(boolean append, BLiveAuctionPlatformLeaderboardInfo boardInfo) {
        long jM174454o;
        ArrayList arrayList = new ArrayList();
        if (jyb.m147479J(boardInfo.leaderboards)) {
            if (append) {
                arrayList.add(new lom0());
            }
        } else if (TextUtils.equals(getName(), "worldRecord")) {
            Calendar calendar = Calendar.getInstance();
            List<d3q<?>> data = append ? ((LiveVoiceAuctionLeaderboardListPage) this.viewModel).getData() : new ArrayList<>();
            if (jyb.m147479J(data)) {
                jM174454o = pzi0.m174454o();
            } else {
                Object objLast = CollectionsKt.last((List<? extends Object>) data);
                objLast.getClass();
                jM174454o = ((kom0) objLast).getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().auctionTime * 1000;
            }
            calendar.setTimeInMillis(jM174454o);
            Calendar calendar2 = Calendar.getInstance();
            List<BLiveAuctionLeaderboardItem> list = boardInfo.leaderboards;
            if (list != null) {
                for (BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem : list) {
                    calendar2.setTimeInMillis(bLiveAuctionLeaderboardItem.auctionTime * 1000);
                    if (calendar.get(1) != calendar2.get(1)) {
                        arrayList.add(new mom0(bLiveAuctionLeaderboardItem));
                    }
                    arrayList.add(new kom0(getName(), bLiveAuctionLeaderboardItem));
                    calendar.setTimeInMillis(calendar2.getTimeInMillis());
                }
            }
            if (!append && (CollectionsKt.first((List) arrayList) instanceof mom0)) {
                arrayList.remove(0);
                return arrayList;
            }
        } else {
            List<BLiveAuctionLeaderboardItem> list2 = boardInfo.leaderboards;
            if (list2 != null) {
                for (BLiveAuctionLeaderboardItem bLiveAuctionLeaderboardItem2 : list2) {
                    String strM202124J3 = getName();
                    bLiveAuctionLeaderboardItem2.getClass();
                    arrayList.add(new kom0(strM202124J3, bLiveAuctionLeaderboardItem2));
                }
            }
        }
        return arrayList;
    }

    @Override // p153l.vom0
    /* JADX INFO: renamed from: c */
    public void mo99329c() {
        duringCreated(w61.m205034W(getName(), 0, 0, 4, null)).subscribe(dhw.m115826e(new y20() { // from class: l.wom0
            @Override // p153l.y20
            public final void call(Object obj) {
                apm0.m99324N3(this.f190050a, (BLiveAuctionPlatformLeaderboardInfo) obj);
            }
        }, new y20() { // from class: l.xom0
            @Override // p153l.y20
            public final void call(Object obj) {
                apm0.m99325O3(this.f195585a, (Throwable) obj);
            }
        }));
    }
}

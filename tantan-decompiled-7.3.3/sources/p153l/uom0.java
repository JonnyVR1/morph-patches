package p153l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Ll/uom0;", "Ll/rwn0;", "D", "Ll/hj2;", "Ll/som0;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "U3", "", "Ll/dpm0;", "R3", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "S3", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "T3", "()Ll/som0;", "P3", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "k", "Ll/dum;", "getCurInfo", "()Ll/dum;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class uom0<D extends rwn0> extends hj2<D, som0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uom0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m196996O3(uom0 uom0Var, String str) {
        uom0Var.m135319L3();
        uom0Var.mo135321N3();
    }

    /* JADX INFO: renamed from: P3 */
    public final LiveVoiceAuctionLeaderboardListPage m196997P3() {
        View viewInflate = LayoutInflater.from(m113230C0()).inflate(yec0.f198735D7, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveVoiceAuctionLeaderboardListPage) viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final List<dpm0> m196998R3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dpm0("today", "今日榜单", null, (som0) this.viewModel, true, 0, 4, null));
        arrayList.add(new dpm0("worldRecord", "世界记录", null, (som0) this.viewModel, false, 1, 20, null));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final LiveVoiceAuctionLeaderboardListPage m196999S3(@NotNull String name) {
        name.getClass();
        LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPageM196997P3 = m196997P3();
        m153103z2(new apm0(name, this.curInfo, liveVoiceAuctionLeaderboardListPageM196997P3));
        return liveVoiceAuctionLeaderboardListPageM196997P3;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().VoiceAuctionEvent.openAuctionLeaderboardDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.tom0
            @Override // p153l.y20
            public final void call(Object obj) {
                uom0.m196996O3(this.f175429a, (String) obj);
            }
        }));
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public som0 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new som0(act);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m197001U3() {
        Intent intentM70066d2 = LiveWebViewAct.m70066d2(this.f196919f, efv.f93832K);
        intentM70066d2.putExtra("extra_is_need_status_bar_hide", true);
        this.f196919f.startActivity(intentM70066d2);
    }
}

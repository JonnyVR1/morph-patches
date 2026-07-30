package p149l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m87232d2 = {"Ll/qfm0;", "Ll/nnn0;", "D", "Ll/zi2;", "Ll/ofm0;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "U3", "", "Ll/zfm0;", "R3", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "S3", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "T3", "()Ll/ofm0;", "P3", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/leaderboard/LiveVoiceAuctionLeaderboardListPage;", "k", "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qfm0<D extends nnn0> extends zi2<D, ofm0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfm0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m174360O3(qfm0 qfm0Var, String str) {
        qfm0Var.m218910L3();
        qfm0Var.mo168244N3();
    }

    /* JADX INFO: renamed from: P3 */
    public final LiveVoiceAuctionLeaderboardListPage m174361P3() {
        View viewInflate = LayoutInflater.from(m104249C0()).inflate(t6c0.f168003D7, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveVoiceAuctionLeaderboardListPage) viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final List<zfm0> m174362R3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zfm0("today", "今日榜单", null, (ofm0) this.viewModel, true, 0, 4, null));
        arrayList.add(new zfm0("worldRecord", "世界记录", null, (ofm0) this.viewModel, false, 1, 20, null));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final LiveVoiceAuctionLeaderboardListPage m174363S3(@NotNull String name) {
        name.getClass();
        LiveVoiceAuctionLeaderboardListPage liveVoiceAuctionLeaderboardListPageM174361P3 = m174361P3();
        m144512z2(new wfm0(name, this.curInfo, liveVoiceAuctionLeaderboardListPageM174361P3));
        return liveVoiceAuctionLeaderboardListPageM174361P3;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().VoiceAuctionEvent.openAuctionLeaderboardDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.pfm0
            @Override // p149l.e30
            public final void call(Object obj) {
                qfm0.m174360O3(this.f148574a, (String) obj);
            }
        }));
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public ofm0 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new ofm0(act);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m174365U3() {
        Intent intentM68883c2 = LiveWebViewAct.m68883c2(this.f188513f, ddv.f85639K);
        intentM68883c2.putExtra("extra_is_need_status_bar_hide", true);
        this.f188513f.startActivity(intentM68883c2);
    }
}

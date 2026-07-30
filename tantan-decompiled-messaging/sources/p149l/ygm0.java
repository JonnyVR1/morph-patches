package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/ygm0;", "Ll/nnn0;", "D", "Ll/zi2;", "Ll/ngm0;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "P3", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "", j6f.GPS_DIRECTION_TRUE, "()V", "U3", "", "Ll/zfm0;", "R3", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "S3", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "T3", "()Ll/ngm0;", "k", "Ll/bsm;", "getCurInfo", "()Ll/bsm;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/String;", "userId", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ygm0<D extends nnn0> extends zi2<D, ngm0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygm0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m214732O3(ygm0 ygm0Var, String str) {
        str.getClass();
        ygm0Var.userId = str;
        ygm0Var.m218910L3();
        ygm0Var.mo168244N3();
    }

    /* JADX INFO: renamed from: P3 */
    private final LiveVoiceAuctionListPage m214733P3() {
        View viewInflate = LayoutInflater.from(m104249C0()).inflate(t6c0.f168051H7, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveVoiceAuctionListPage) viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final List<zfm0> m214734R3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zfm0("personal", "个人关系卡", null, (ngm0) this.viewModel, true, 0, 4, null));
        arrayList.add(new zfm0("leaderboard", "全站关系卡", null, (ngm0) this.viewModel, false, 1, 20, null));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final LiveVoiceAuctionListPage m214735S3(@NotNull String name) {
        name.getClass();
        LiveVoiceAuctionListPage liveVoiceAuctionListPageM214733P3 = m214733P3();
        bsm<D> bsmVar = this.curInfo;
        String str = this.userId;
        if (str == null) {
            Intrinsics.m87502r("userId");
            str = null;
        }
        m144512z2(new wgm0(name, bsmVar, liveVoiceAuctionListPageM214733P3, str));
        return liveVoiceAuctionListPageM214733P3;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().VoiceAuctionEvent.openAuctionRelationCardDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.xgm0
            @Override // p149l.e30
            public final void call(Object obj) {
                ygm0.m214732O3(this.f192778a, (String) obj);
            }
        }));
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public ngm0 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new ngm0(act);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m214737U3() {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(7013).m142598B(ddv.f85637I).m142599p(CommonH5Builder.BgType.TRAN_GRAY_BG).m142602s(t100.f167261j).m142597A(xdl0.m208412y0(), t100.m186890d(574.0f)).m142603t(80).m142600q());
    }
}

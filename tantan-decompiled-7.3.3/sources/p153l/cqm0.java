package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/cqm0;", "Ll/rwn0;", "D", "Ll/hj2;", "Ll/rpm0;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "P3", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "", p7f.GPS_DIRECTION_TRUE, "()V", "U3", "", "Ll/dpm0;", "R3", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "S3", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "T3", "()Ll/rpm0;", "k", "Ll/dum;", "getCurInfo", "()Ll/dum;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "userId", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cqm0<D extends rwn0> extends hj2<D, rpm0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqm0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m111964O3(cqm0 cqm0Var, String str) {
        str.getClass();
        cqm0Var.userId = str;
        cqm0Var.m135319L3();
        cqm0Var.mo135321N3();
    }

    /* JADX INFO: renamed from: P3 */
    private final LiveVoiceAuctionListPage m111965P3() {
        View viewInflate = LayoutInflater.from(m113230C0()).inflate(yec0.f198783H7, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveVoiceAuctionListPage) viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final List<dpm0> m111966R3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dpm0("personal", "个人关系卡", null, (rpm0) this.viewModel, true, 0, 4, null));
        arrayList.add(new dpm0("leaderboard", "全站关系卡", null, (rpm0) this.viewModel, false, 1, 20, null));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final LiveVoiceAuctionListPage m111967S3(@NotNull String name) {
        name.getClass();
        LiveVoiceAuctionListPage liveVoiceAuctionListPageM111965P3 = m111965P3();
        dum<D> dumVar = this.curInfo;
        String str = this.userId;
        if (str == null) {
            Intrinsics.m88391r("userId");
            str = null;
        }
        m153103z2(new aqm0(name, dumVar, liveVoiceAuctionListPageM111965P3, str));
        return liveVoiceAuctionListPageM111965P3;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().VoiceAuctionEvent.openAuctionRelationCardDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.bqm0
            @Override // p153l.y20
            public final void call(Object obj) {
                cqm0.m111964O3(this.f77908a, (String) obj);
            }
        }));
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public rpm0 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new rpm0(act);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m111969U3() {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7013).m174141B(efv.f93830I).m174142p(CommonH5Builder.BgType.TRAN_GRAY_BG).m174145s(qa00.f156323j).m174140A(bnl0.m105592y0(), qa00.m175859d(574.0f)).m174146t(80).m174143q());
    }
}

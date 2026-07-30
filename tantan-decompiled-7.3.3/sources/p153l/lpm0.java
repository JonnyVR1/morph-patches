package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/lpm0;", "Ll/rwn0;", "D", "Ll/hj2;", "Ll/jpm0;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", "Ll/dpm0;", "R3", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "S3", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "T3", "()Ll/jpm0;", "P3", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "k", "Ll/dum;", "getCurInfo", "()Ll/dum;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "curLive", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class lpm0<D extends rwn0> extends hj2<D, jpm0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public BLiveVoice curLive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpm0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m155271O3(lpm0 lpm0Var, Boolean bool) {
        if (!bool.booleanValue()) {
            ((jpm0) lpm0Var.viewModel).mo72910j();
        } else {
            lpm0Var.m135319L3();
            lpm0Var.mo135321N3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final LiveVoiceAuctionListPage m155272P3() {
        View viewInflate = LayoutInflater.from(m113230C0()).inflate(yec0.f198783H7, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveVoiceAuctionListPage) viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final List<dpm0> m155273R3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dpm0("apply", "拍拍申请", null, (eqm0) this.viewModel, false, 0, 20, null));
        arrayList.add(new dpm0("invite", "邀请拍拍", null, (eqm0) this.viewModel, false, 1, 20, null));
        arrayList.add(new dpm0("list", "拍拍排序", null, (eqm0) this.viewModel, false, 2, 20, null));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final LiveVoiceAuctionListPage m155274S3(@NotNull String name) {
        name.getClass();
        LiveVoiceAuctionListPage liveVoiceAuctionListPageM155272P3 = m155272P3();
        m153103z2(new z3v(name, this.curInfo, liveVoiceAuctionListPageM155272P3));
        return liveVoiceAuctionListPageM155272P3;
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public jpm0 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new jpm0(act);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        bLiveVoiceMo183435j.getClass();
        this.curLive = bLiveVoiceMo183435j;
        duringCreated((C22421c) m213811F2().VoiceAuctionEvent.openAuctionQueueDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.kpm0
            @Override // p153l.y20
            public final void call(Object obj) {
                lpm0.m155271O3(this.f127898a, (Boolean) obj);
            }
        }));
    }
}

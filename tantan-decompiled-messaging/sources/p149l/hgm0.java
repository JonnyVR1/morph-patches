package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/hgm0;", "Ll/nnn0;", "D", "Ll/zi2;", "Ll/fgm0;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", "Ll/zfm0;", "R3", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "S3", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "T3", "()Ll/fgm0;", "P3", "()Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", "k", "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "curLive", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hgm0<D extends nnn0> extends zi2<D, fgm0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public BLiveVoice curLive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgm0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m130838O3(hgm0 hgm0Var, Boolean bool) {
        if (!bool.booleanValue()) {
            ((fgm0) hgm0Var.viewModel).mo71727j();
        } else {
            hgm0Var.m218910L3();
            hgm0Var.mo168244N3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final LiveVoiceAuctionListPage m130839P3() {
        View viewInflate = LayoutInflater.from(m104249C0()).inflate(t6c0.f168051H7, (ViewGroup) null, false);
        viewInflate.getClass();
        return (LiveVoiceAuctionListPage) viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final List<zfm0> m130840R3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zfm0("apply", "拍拍申请", null, (ahm0) this.viewModel, false, 0, 20, null));
        arrayList.add(new zfm0("invite", "邀请拍拍", null, (ahm0) this.viewModel, false, 1, 20, null));
        arrayList.add(new zfm0("list", "拍拍排序", null, (ahm0) this.viewModel, false, 2, 20, null));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final LiveVoiceAuctionListPage m130841S3(@NotNull String name) {
        name.getClass();
        LiveVoiceAuctionListPage liveVoiceAuctionListPageM130839P3 = m130839P3();
        m144512z2(new y1v(name, this.curInfo, liveVoiceAuctionListPageM130839P3));
        return liveVoiceAuctionListPageM130839P3;
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public fgm0 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new fgm0(act);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        bLiveVoiceMo149813j.getClass();
        this.curLive = bLiveVoiceMo149813j;
        duringCreated((C22306c) m206028F2().VoiceAuctionEvent.openAuctionQueueDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ggm0
            @Override // p149l.e30
            public final void call(Object obj) {
                hgm0.m130838O3(this.f102525a, (Boolean) obj);
            }
        }));
    }
}

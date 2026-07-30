package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWall;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import java.util.List;
import p149l.nnn0;
import p149l.qzj;

/* JADX INFO: loaded from: classes5.dex */
public class uzj<D extends nnn0, VM extends qzj> extends cyj<D, VM> {

    /* JADX INFO: renamed from: j */
    public String f179001j;

    public uzj(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        mo51532C(vm);
    }

    /* JADX INFO: renamed from: c4 */
    private void m196424c4() {
        duringCreated(sbn0.m183237e(this.f179001j, m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.rzj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161663a.m196427a4((BLiveVoiceGiftWall) obj);
            }
        }, new vud0()));
        duringCreated(sbn0.m183238f(this.f179001j, m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.szj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167063a.m196428b4((List) obj);
            }
        }, new vud0()));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        m196425Y3();
        super.mo94471O3();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.cyj
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public eyj mo109317S3() {
        return new eyj("礼物墙", ((qzj) this.viewModel).m177219c(), 0);
    }

    @Override // p149l.cyj
    /* JADX INFO: renamed from: T3 */
    public int mo109318T3() {
        return 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public void m196425Y3() {
        ((qzj) this.viewModel).m177218b();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m196426Z3(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (!bLiveVoiceGiftItem.f44498id.equals("0001")) {
            m196430e4(bLiveVoiceGiftItem);
            return;
        }
        m206028F2().GiftWallDialogEvent.openGiftDialogFromGiftWall().m172467p();
        m206028F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m172467p();
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m196427a4(BLiveVoiceGiftWall bLiveVoiceGiftWall) {
        ((qzj) this.viewModel).f157056a._gift_wall_enter.m76973k0(bLiveVoiceGiftWall, new e30() { // from class: l.tzj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172738a.m196426Z3((BLiveVoiceGiftItem) obj);
            }
        });
        m206028F2().GiftWallDialogEvent.updateLightedGifts().mo172463j(vwb.m200311Y(Integer.valueOf(bLiveVoiceGiftWall.process.current), Integer.valueOf(bLiveVoiceGiftWall.process.total)));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m196428b4(List list) {
        ((qzj) this.viewModel).m177220d(list);
    }

    /* JADX INFO: renamed from: d4 */
    public void m196429d4(String str) {
        this.f179001j = str;
    }

    /* JADX INFO: renamed from: e4 */
    public void m196430e4(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (TextUtils.isEmpty(bLiveVoiceGiftItem.interact.title)) {
            return;
        }
        GiftWallSendGiftDialogContentView giftWallSendGiftDialogContentView = (GiftWallSendGiftDialogContentView) LayoutInflater.from(act()).inflate(t6c0.f168069J1, (ViewGroup) null);
        dd80 dd80VarM110960O = new dd80.C16336a(this.f188513f).m110963R(giftWallSendGiftDialogContentView).m110961P(true).m110958M(false).m110960O();
        giftWallSendGiftDialogContentView.m73665n0(bLiveVoiceGiftItem, dd80VarM110960O, false, false, this);
        dd80VarM110960O.show();
    }

    public void init() {
        ((qzj) this.viewModel).m177221r();
        m196424c4();
    }
}

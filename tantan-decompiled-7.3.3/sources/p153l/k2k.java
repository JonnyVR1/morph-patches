package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWall;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import java.util.List;
import p153l.g2k;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class k2k<D extends rwn0, VM extends g2k> extends s0k<D, VM> {

    /* JADX INFO: renamed from: j */
    public String f123620j;

    public k2k(dum<D> dumVar, VM vm) {
        super(dumVar);
        mo52715C(vm);
    }

    /* JADX INFO: renamed from: c4 */
    private void m147972c4() {
        duringCreated(wkn0.m206852e(this.f123620j, m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.h2k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107563a.m147975a4((BLiveVoiceGiftWall) obj);
            }
        }, new z2e0()));
        duringCreated(wkn0.m206853f(this.f123620j, m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.i2k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112650a.m147976b4((List) obj);
            }
        }, new z2e0()));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        m147973Y3();
        super.mo96836O3();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.s0k
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public u0k mo146524S3() {
        return new u0k("礼物墙", ((g2k) this.viewModel).m128630c(), 0);
    }

    @Override // p153l.s0k
    /* JADX INFO: renamed from: T3 */
    public int mo146525T3() {
        return 0;
    }

    /* JADX INFO: renamed from: Y3 */
    public void m147973Y3() {
        ((g2k) this.viewModel).m128629b();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m147974Z3(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (!bLiveVoiceGiftItem.f45346id.equals("0001")) {
            m147978e4(bLiveVoiceGiftItem);
            return;
        }
        m213811F2().GiftWallDialogEvent.openGiftDialogFromGiftWall().m199277p();
        m213811F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m199277p();
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m147975a4(BLiveVoiceGiftWall bLiveVoiceGiftWall) {
        ((g2k) this.viewModel).f101851a._gift_wall_enter.m78156k0(bLiveVoiceGiftWall, new y20() { // from class: l.j2k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118064a.m147974Z3((BLiveVoiceGiftItem) obj);
            }
        });
        m213811F2().GiftWallDialogEvent.updateLightedGifts().mo199273j(jyb.m147494Y(Integer.valueOf(bLiveVoiceGiftWall.process.current), Integer.valueOf(bLiveVoiceGiftWall.process.total)));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m147976b4(List list) {
        ((g2k) this.viewModel).m128631d(list);
    }

    /* JADX INFO: renamed from: d4 */
    public void m147977d4(String str) {
        this.f123620j = str;
    }

    /* JADX INFO: renamed from: e4 */
    public void m147978e4(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (TextUtils.isEmpty(bLiveVoiceGiftItem.interact.title)) {
            return;
        }
        GiftWallSendGiftDialogContentView giftWallSendGiftDialogContentView = (GiftWallSendGiftDialogContentView) LayoutInflater.from(act()).inflate(yec0.f198801J1, (ViewGroup) null);
        jl80 jl80VarM146020O = new jl80.C17971a(this.f196919f).m146023R(giftWallSendGiftDialogContentView).m146021P(true).m146018M(false).m146020O();
        giftWallSendGiftDialogContentView.m74848n0(bLiveVoiceGiftItem, jl80VarM146020O, false, false, this);
        jl80VarM146020O.show();
    }

    public void init() {
        ((g2k) this.viewModel).m128632r();
        m147972c4();
    }
}

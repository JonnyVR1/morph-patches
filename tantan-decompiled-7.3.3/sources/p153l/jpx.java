package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import java.util.List;
import java.util.UUID;
import p153l.epx;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class jpx<D extends rwn0, VM extends epx> extends s0k<D, VM> {

    /* JADX INFO: renamed from: j */
    public String f122156j;

    public jpx(dum<D> dumVar, VM vm) {
        super(dumVar);
        mo52715C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m146523d4() {
        duringCreated(wkn0.m206854g(this.f122156j, m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.fpx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100228a.m146527a4((List) obj);
            }
        }, new z2e0()));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
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
        return new u0k("勋章墙", ((epx) this.viewModel).m121882e(), 1);
    }

    @Override // p153l.s0k
    /* JADX INFO: renamed from: T3 */
    public int mo146525T3() {
        return 1;
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m146526Z3() {
        return zrv.f205799a.m207631D0().equals(this.f122156j);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m146527a4(List list) {
        ((epx) this.viewModel).f95284a.m78175l0(jyb.m147479J(list));
        ((epx) this.viewModel).m121884k(list);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m146528b4(uxj0 uxj0Var) {
        r1j0.m179420g("领取成功");
        m146523d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m146529c4(DialogInterface dialogInterface) {
        l51.m152888H(act(), new Runnable() { // from class: l.ipx
            @Override // java.lang.Runnable
            public final void run() {
                this.f116312a.m146523d4();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: e4 */
    public void m146530e4(String str) {
        j1k.m143145g();
        duringCreated(wkn0.m206855h(str, UUID.randomUUID().toString())).subscribe(dhw.m115826e(new y20() { // from class: l.gpx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105631a.m146528b4((uxj0) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: f4 */
    public void m146531f4(String str) {
        this.f122156j = str;
    }

    /* JADX INFO: renamed from: g4 */
    public void m146532g4(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (TextUtils.isEmpty(bLiveVoiceGiftItem.interact.title)) {
            return;
        }
        GiftWallSendGiftDialogContentView giftWallSendGiftDialogContentView = (GiftWallSendGiftDialogContentView) LayoutInflater.from(act()).inflate(yec0.f198801J1, (ViewGroup) null);
        jl80 jl80VarM146020O = new jl80.C17971a(this.f196919f).m146023R(giftWallSendGiftDialogContentView).m146021P(true).m146018M(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.hpx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f111056a.m146529c4(dialogInterface);
            }
        }).m146020O();
        giftWallSendGiftDialogContentView.m74848n0(bLiveVoiceGiftItem, jl80VarM146020O, false, true, this);
        jl80VarM146020O.show();
    }

    public void init() {
        ((epx) this.viewModel).m121885r();
        m146523d4();
    }
}

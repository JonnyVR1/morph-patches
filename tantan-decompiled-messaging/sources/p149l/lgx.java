package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import java.util.List;
import java.util.UUID;
import p149l.ggx;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class lgx<D extends nnn0, VM extends ggx> extends cyj<D, VM> {

    /* JADX INFO: renamed from: j */
    public String f128024j;

    public lgx(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        mo51532C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m149791d4() {
        duringCreated(sbn0.m183239g(this.f128024j, m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.hgx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107669a.m149793a4((List) obj);
            }
        }, new vud0()));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
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
        return new eyj("勋章墙", ((ggx) this.viewModel).m126091e(), 1);
    }

    @Override // p149l.cyj
    /* JADX INFO: renamed from: T3 */
    public int mo109318T3() {
        return 1;
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m149792Z3() {
        return ypv.f199493a.m199309D0().equals(this.f128024j);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m149793a4(List list) {
        ((ggx) this.viewModel).f102583a.m76992l0(vwb.m200296J(list));
        ((ggx) this.viewModel).m126093k(list);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m149794b4(roj0 roj0Var) {
        osi0.m165783g("领取成功");
        m149791d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m149795c4(DialogInterface dialogInterface) {
        e51.m114743H(act(), new Runnable() { // from class: l.kgx
            @Override // java.lang.Runnable
            public final void run() {
                this.f123106a.m149791d4();
            }
        }, 1500L);
    }

    /* JADX INFO: renamed from: e4 */
    public void m149796e4(String str) {
        tyj.m191054g();
        duringCreated(sbn0.m183240h(str, UUID.randomUUID().toString())).subscribe(ffw.m121194e(new e30() { // from class: l.igx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113190a.m149794b4((roj0) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: f4 */
    public void m149797f4(String str) {
        this.f128024j = str;
    }

    /* JADX INFO: renamed from: g4 */
    public void m149798g4(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (TextUtils.isEmpty(bLiveVoiceGiftItem.interact.title)) {
            return;
        }
        GiftWallSendGiftDialogContentView giftWallSendGiftDialogContentView = (GiftWallSendGiftDialogContentView) LayoutInflater.from(act()).inflate(t6c0.f168069J1, (ViewGroup) null);
        dd80 dd80VarM110960O = new dd80.C16336a(this.f188513f).m110963R(giftWallSendGiftDialogContentView).m110961P(true).m110958M(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jgx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f117856a.m149795c4(dialogInterface);
            }
        }).m110960O();
        giftWallSendGiftDialogContentView.m73665n0(bLiveVoiceGiftItem, dd80VarM110960O, false, true, this);
        dd80VarM110960O.show();
    }

    public void init() {
        ((ggx) this.viewModel).m126094r();
        m149791d4();
    }
}

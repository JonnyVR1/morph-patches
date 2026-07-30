package p149l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class ekm0 extends jq2<w5o0> {

    /* JADX INFO: renamed from: a */
    public String f91996a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceBonusGifts f91997b;

    /* JADX INFO: renamed from: c */
    public Act f91998c;

    /* JADX INFO: renamed from: d */
    public d30 f91999d;

    public ekm0(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f91998c = act;
        mo51532C(new w5o0());
    }

    @Override // p149l.q0m
    public void destroy() {
        this.f91998c = null;
    }

    /* JADX INFO: renamed from: i0 */
    public void m116981i0() {
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts;
        if (TextUtils.isEmpty(this.f91996a) || (bLiveVoiceBonusGifts = this.f91997b) == null || vwb.m200296J(bLiveVoiceBonusGifts.giftItems)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f91997b.giftItems, new e30() { // from class: l.akm0
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(((BLiveVoiceBonusGiftItem) obj).f44484id);
            }
        });
        duringCreated(VCallApiProvider.openBonusGifts(ypv.f199493a.m199309D0(), this.f91996a)).doOnNext(new e30() { // from class: l.bkm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76059a.m116982j0((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.ckm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81347a.m116983k0((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dkm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86684a.m116984l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m116982j0(BLiveEnvelope bLiveEnvelope) {
        m116985m0();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m116983k0(BLiveEnvelope bLiveEnvelope) {
        w5o0 w5o0Var = (w5o0) this.viewModel;
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = this.f91997b;
        w5o0Var.m201677w(bLiveVoiceBonusGifts.tantanCoins, bLiveVoiceBonusGifts.giftItems);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m116984l0(Throwable th) {
        ((w5o0) this.viewModel).m201676v();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m116985m0() {
        d30 d30Var = this.f91999d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m116986n0(ViewGroup viewGroup, String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts, d30 d30Var) {
        this.f91996a = str;
        this.f91997b = bLiveVoiceBonusGifts;
        this.f91999d = d30Var;
        ((w5o0) this.viewModel).m201678x(this.f91998c, viewGroup, bLiveVoiceBonusGifts);
    }
}

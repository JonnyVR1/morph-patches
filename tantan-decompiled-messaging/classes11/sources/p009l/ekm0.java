package p009l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.ffw;
import l.jq2;
import l.mcr;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ekm0 extends jq2<w5o0> {

    /* JADX INFO: renamed from: a */
    public String f12594a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceBonusGifts f12595b;

    /* JADX INFO: renamed from: c */
    public Act f12596c;

    /* JADX INFO: renamed from: d */
    public d30 f12597d;

    public ekm0(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f12596c = act;
        C(new w5o0());
    }

    public void destroy() {
        this.f12596c = null;
    }

    /* JADX INFO: renamed from: i0 */
    public void m13968i0() {
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts;
        if (TextUtils.isEmpty(this.f12594a) || (bLiveVoiceBonusGifts = this.f12595b) == null || vwb.J(bLiveVoiceBonusGifts.giftItems)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        vwb.z(this.f12595b.giftItems, new e30() { // from class: l.akm0
            public final void call(Object obj) {
                arrayList.add(((BLiveVoiceBonusGiftItem) obj).id);
            }
        });
        duringCreated(VCallApiProvider.openBonusGifts(ypv.f23196a.m23619D0(), this.f12594a)).doOnNext(new e30() { // from class: l.bkm0
            public final void call(Object obj) {
                this.f10162a.m13969j0((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.ckm0
            public final void call(Object obj) {
                this.f10660a.m13970k0((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dkm0
            public final void call(Object obj) {
                this.f11891a.m13971l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m13969j0(BLiveEnvelope bLiveEnvelope) {
        m13972m0();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m13970k0(BLiveEnvelope bLiveEnvelope) {
        w5o0 w5o0Var = (w5o0) ((jq2) this).viewModel;
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = this.f12595b;
        w5o0Var.m23933w(bLiveVoiceBonusGifts.tantanCoins, bLiveVoiceBonusGifts.giftItems);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m13971l0(Throwable th) {
        ((w5o0) ((jq2) this).viewModel).m23932v();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m13972m0() {
        d30 d30Var = this.f12597d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m13973n0(ViewGroup viewGroup, String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts, d30 d30Var) {
        this.f12594a = str;
        this.f12595b = bLiveVoiceBonusGifts;
        this.f12597d = d30Var;
        ((w5o0) ((jq2) this).viewModel).m23934x(this.f12596c, viewGroup, bLiveVoiceBonusGifts);
    }
}

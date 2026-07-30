package p153l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class itm0 extends ar2<afo0> {

    /* JADX INFO: renamed from: a */
    public String f116853a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceBonusGifts f116854b;

    /* JADX INFO: renamed from: c */
    public Act f116855c;

    /* JADX INFO: renamed from: d */
    public x20 f116856d;

    public itm0(Act act, ner nerVar) {
        super(nerVar);
        this.f116855c = act;
        mo52715C(new afo0());
    }

    @Override // p153l.k3m
    public void destroy() {
        this.f116855c = null;
    }

    /* JADX INFO: renamed from: i0 */
    public void m142061i0() {
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts;
        if (TextUtils.isEmpty(this.f116853a) || (bLiveVoiceBonusGifts = this.f116854b) == null || jyb.m147479J(bLiveVoiceBonusGifts.giftItems)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f116854b.giftItems, new y20() { // from class: l.etm0
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(((BLiveVoiceBonusGiftItem) obj).f45332id);
            }
        });
        duringCreated(VCallApiProvider.openBonusGifts(zrv.f205799a.m207631D0(), this.f116853a)).doOnNext(new y20() { // from class: l.ftm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100762a.m142062j0((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.gtm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106430a.m142063k0((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.htm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111565a.m142064l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m142062j0(BLiveEnvelope bLiveEnvelope) {
        m142065m0();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m142063k0(BLiveEnvelope bLiveEnvelope) {
        afo0 afo0Var = (afo0) this.viewModel;
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = this.f116854b;
        afo0Var.m97539w(bLiveVoiceBonusGifts.tantanCoins, bLiveVoiceBonusGifts.giftItems);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m142064l0(Throwable th) {
        ((afo0) this.viewModel).m97538v();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m142065m0() {
        x20 x20Var = this.f116856d;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m142066n0(ViewGroup viewGroup, String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts, x20 x20Var) {
        this.f116853a = str;
        this.f116854b = bLiveVoiceBonusGifts;
        this.f116856d = x20Var;
        ((afo0) this.viewModel).m97540x(this.f116855c, viewGroup, bLiveVoiceBonusGifts);
    }
}

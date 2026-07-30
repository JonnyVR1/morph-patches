package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12506b;

/* JADX INFO: loaded from: classes13.dex */
public class ygu extends zeu<ygu> implements s7m<ygu> {

    /* JADX INFO: renamed from: f */
    public int f198244f;

    /* JADX INFO: renamed from: g */
    public String f198245g;

    /* JADX INFO: renamed from: h */
    public int f198246h;

    public ygu(jlu jluVar) {
        super(jluVar);
        this.f198244f = -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m214768X2(Long l2) {
        if (this.f198244f == -2) {
            this.f198244f = -1;
            m214773Z2(0);
            return;
        }
        long jLongValue = l2.longValue();
        int i = this.f198244f;
        if (jLongValue == i) {
            m214773Z2(i);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m218409H2().m203918R(new e30() { // from class: l.vgu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181426a.m214768X2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V2 */
    public final void m214770V2(Throwable th) {
        m218409H2().m203919S(slk0.f165241g);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 41021) {
                if (this.f198244f != 0) {
                    m218409H2().f187000e = true;
                }
            } else if (i == 41204) {
                osi0.m165783g("送礼账号隔离~~~~~~~~~~~~~");
            } else {
                if (i != 41323) {
                    return;
                }
                osi0.m165783g(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final void m214771W2(BLiveSendLiveGiftResult bLiveSendLiveGiftResult) {
        this.f198244f = bLiveSendLiveGiftResult.videoChat.untilSec;
        C12506b c12506b = new C12506b();
        String str = bLiveSendLiveGiftResult.videoChat.payType;
        c12506b.f45065a = str;
        if (TextUtils.equals(str, "randomCoupon")) {
            c12506b.f45066b = bLiveSendLiveGiftResult.videoChat.untilSec;
        } else {
            c12506b.f45066b = bLiveSendLiveGiftResult.remainingDurationSec;
        }
        m218411K2().LiveVideoChatEvent.m69199i().mo172463j(c12506b);
        m218411K2().LiveVideoChatEvent.m69198h().mo172463j(bLiveSendLiveGiftResult.tip);
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m214772Y2(BLiveData bLiveData) {
        m214771W2(bLiveData.givenGiftRes);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m214773Z2(int i) {
        gkh0.m126627j("videoChat", "updateSendGift nextReqSec:" + this.f198244f);
        if (m218409H2().m203939p().equals(this.f198245g) && i <= this.f198246h) {
            gkh0.m126627j("videoChat", "updateSendGift 重复调用");
            return;
        }
        this.f198245g = m218409H2().m203939p();
        this.f198246h = i;
        m104250o2(iuu.m138467a0(m218409H2().m203945v(), m218409H2().m203942s(), m218409H2().m203901A().giftId, i, m218409H2().m203939p(), m218409H2().m203938o(), m218409H2().m203901A().category), false).subscribe(ffw.m121194e(new e30() { // from class: l.wgu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186346a.m214772Y2((BLiveData) obj);
            }
        }, new e30() { // from class: l.xgu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192798a.m214770V2((Throwable) obj);
            }
        }));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: U2, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ygu yguVar) {
    }
}

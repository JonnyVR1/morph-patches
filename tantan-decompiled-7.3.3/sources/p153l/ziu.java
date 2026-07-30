package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12669b;

/* JADX INFO: loaded from: classes9.dex */
public class ziu extends ahu<ziu> implements iam<ziu> {

    /* JADX INFO: renamed from: f */
    public int f204620f;

    /* JADX INFO: renamed from: g */
    public String f204621g;

    /* JADX INFO: renamed from: h */
    public int f204622h;

    public ziu(knu knuVar) {
        super(knuVar);
        this.f204620f = -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public /* synthetic */ void m219942X2(Long l2) {
        if (this.f204620f == -2) {
            this.f204620f = -1;
            m219947Z2(0);
            return;
        }
        long jLongValue = l2.longValue();
        int i = this.f204620f;
        if (jLongValue == i) {
            m219947Z2(i);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m97926H2().m212325R(new y20() { // from class: l.wiu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189396a.m219942X2((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V2 */
    public final void m219944V2(Throwable th) {
        m97926H2().m212326S(yuk0.f201638g);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            int i = coreService.code;
            if (i == 41021) {
                if (this.f204620f != 0) {
                    m97926H2().f195474e = true;
                }
            } else if (i == 41204) {
                r1j0.m179420g("送礼账号隔离~~~~~~~~~~~~~");
            } else {
                if (i != 41323) {
                    return;
                }
                r1j0.m179420g(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final void m219945W2(BLiveSendLiveGiftResult bLiveSendLiveGiftResult) {
        this.f204620f = bLiveSendLiveGiftResult.videoChat.untilSec;
        C12669b c12669b = new C12669b();
        String str = bLiveSendLiveGiftResult.videoChat.payType;
        c12669b.f45913a = str;
        if (TextUtils.equals(str, "randomCoupon")) {
            c12669b.f45914b = bLiveSendLiveGiftResult.videoChat.untilSec;
        } else {
            c12669b.f45914b = bLiveSendLiveGiftResult.remainingDurationSec;
        }
        m97928K2().LiveVideoChatEvent.m70382i().mo199273j(c12669b);
        m97928K2().LiveVideoChatEvent.m70381h().mo199273j(bLiveSendLiveGiftResult.tip);
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m219946Y2(BLiveData bLiveData) {
        m219945W2(bLiveData.givenGiftRes);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m219947Z2(int i) {
        nsh0.m164608j("videoChat", "updateSendGift nextReqSec:" + this.f204620f);
        if (m97926H2().m212346p().equals(this.f204621g) && i <= this.f204622h) {
            nsh0.m164608j("videoChat", "updateSendGift 重复调用");
            return;
        }
        this.f204621g = m97926H2().m212346p();
        this.f204622h = i;
        m113231o2(jwu.m147253a0(m97926H2().m212352v(), m97926H2().m212349s(), m97926H2().m212308A().giftId, i, m97926H2().m212346p(), m97926H2().m212345o(), m97926H2().m212308A().category), false).subscribe(dhw.m115826e(new y20() { // from class: l.xiu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194511a.m219946Y2((BLiveData) obj);
            }
        }, new y20() { // from class: l.yiu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200239a.m219944V2((Throwable) obj);
            }
        }));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: U2, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ziu ziuVar) {
    }
}

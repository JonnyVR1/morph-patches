package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView;
import p137rx.C22421c;
import p151v.VDraweeView;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class orj<T extends oo2> extends i6t<T, GiftDialogSkinView> {

    /* JADX INFO: renamed from: i */
    public String f148718i;

    /* JADX INFO: renamed from: j */
    public kpj f148719j;

    /* JADX INFO: renamed from: k */
    public int f148720k;

    /* JADX INFO: renamed from: l */
    public int f148721l;

    public orj(dum<? extends T> dumVar, GiftDialogSkinView giftDialogSkinView, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        super(dumVar);
        this.f148720k = 0;
        this.f148721l = 0;
        mo52715C(giftDialogSkinView);
        giftDialogSkinView.m75660k(vDraweeView, vDraweeView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m168930P3(vxj0 vxj0Var) {
        m168931L3();
    }

    /* JADX INFO: renamed from: L3 */
    public void m168931L3() {
        ((GiftDialogSkinView) this.viewModel).m75663n();
    }

    /* JADX INFO: renamed from: M3 */
    public void m168932M3(final y20<String> y20Var) {
        if (TextUtils.isEmpty(this.f148718i)) {
            duringCreated((C22421c<T>) vxr.m203875a()).subscribe(dhw.m115829h(new y20() { // from class: l.nrj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143413a.m168935R3(y20Var, (AuthData) obj);
                }
            }));
        } else {
            y20Var.call(this.f148718i);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public int m168933N3() {
        return ((GiftDialogSkinView) this.viewModel).getTopSkinHeight();
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m168934O3() {
        return ((GiftDialogSkinView) this.viewModel).m75667u();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m168935R3(y20 y20Var, AuthData authData) {
        String str = authData.accessToken;
        this.f148718i = str;
        y20Var.call(str);
    }

    /* JADX INFO: renamed from: S3 */
    public void m168936S3() {
        kpj kpjVar = this.f148719j;
        if (kpjVar == null) {
            ((GiftDialogSkinView) this.viewModel).m75655L(null);
            return;
        }
        int i = this.f148720k;
        if (i != 0) {
            ((GiftDialogSkinView) this.viewModel).m75655L(kpjVar.m150736h(i));
            return;
        }
        int i2 = this.f148721l;
        if (i2 == 0) {
            ((GiftDialogSkinView) this.viewModel).m75655L(kpjVar.m150734f());
            return;
        }
        BLiveGiftSkin bLiveGiftSkinM150735g = kpjVar.m150735g(i2);
        if (bLiveGiftSkinM150735g != null) {
            ((GiftDialogSkinView) this.viewModel).m75655L(bLiveGiftSkinM150735g);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.closeH5Skin().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.mrj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138387a.m168930P3((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m168937T3(int i) {
        if (this.f148721l == i) {
            return;
        }
        this.f148721l = i;
        this.f148720k = 0;
        m168936S3();
    }

    /* JADX INFO: renamed from: U3 */
    public void m168938U3(int i) {
        if (this.f148720k == i) {
            return;
        }
        this.f148720k = i;
        this.f148721l = 0;
        m168936S3();
    }

    /* JADX INFO: renamed from: V3 */
    public void m168939V3(kpj kpjVar) {
        this.f148719j = kpjVar;
    }

    @Override // p153l.i6t
    /* JADX INFO: renamed from: p3 */
    public void mo138869p3(int i, String str) {
        super.mo138869p3(i, str);
        qzj.m178795l(mo78457R2());
    }
}

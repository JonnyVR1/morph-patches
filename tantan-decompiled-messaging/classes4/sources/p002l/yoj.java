package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.live.base.data.BLiveGiftSkin;
import l.bwr;
import l.e30;
import l.ffw;
import l.soj0;
import l.uvr;
import p002l.ho2;
import rx.c;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yoj<T extends ho2> extends h4t<T, GiftDialogSkinView> {

    /* JADX INFO: renamed from: i */
    public String f23001i;

    /* JADX INFO: renamed from: j */
    public umj f23002j;

    /* JADX INFO: renamed from: k */
    public int f23003k;

    /* JADX INFO: renamed from: l */
    public int f23004l;

    public yoj(bsm<? extends T> bsmVar, GiftDialogSkinView giftDialogSkinView, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        super(bsmVar);
        this.f23003k = 0;
        this.f23004l = 0;
        C(giftDialogSkinView);
        giftDialogSkinView.m8063k(vDraweeView, vDraweeView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m26848P3(soj0 soj0Var) {
        m26849L3();
    }

    /* JADX INFO: renamed from: L3 */
    public void m26849L3() {
        ((GiftDialogSkinView) ((bwr) this).viewModel).m8066n();
    }

    /* JADX INFO: renamed from: M3 */
    public void m26850M3(final e30<String> e30Var) {
        if (TextUtils.isEmpty(this.f23001i)) {
            duringCreated(uvr.a()).subscribe(ffw.h(new e30() { // from class: l.xoj
                public final void call(Object obj) {
                    this.f22389a.m26853R3(e30Var, (AuthData) obj);
                }
            }));
        } else {
            e30Var.call(this.f23001i);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public int m26851N3() {
        return ((GiftDialogSkinView) ((bwr) this).viewModel).getTopSkinHeight();
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m26852O3() {
        return ((GiftDialogSkinView) ((bwr) this).viewModel).m8070u();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m26853R3(e30 e30Var, AuthData authData) {
        String str = authData.accessToken;
        this.f23001i = str;
        e30Var.call(str);
    }

    /* JADX INFO: renamed from: S3 */
    public void m26854S3() {
        umj umjVar = this.f23002j;
        if (umjVar == null) {
            ((GiftDialogSkinView) ((bwr) this).viewModel).m8057L(null);
            return;
        }
        int i = this.f23003k;
        if (i != 0) {
            ((GiftDialogSkinView) ((bwr) this).viewModel).m8057L(umjVar.m23561h(i));
            return;
        }
        int i2 = this.f23004l;
        if (i2 == 0) {
            ((GiftDialogSkinView) ((bwr) this).viewModel).m8057L(umjVar.m23559f());
            return;
        }
        BLiveGiftSkin bLiveGiftSkinM23560g = umjVar.m23560g(i2);
        if (bLiveGiftSkinM23560g != null) {
            ((GiftDialogSkinView) ((bwr) this).viewModel).m8057L(bLiveGiftSkinM23560g);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m26855T() {
        super.T();
        duringCreated((c) m25548F2().GiftDialogEventGroup.closeH5Skin().g()).subscribe(ffw.h(new e30() { // from class: l.woj
            public final void call(Object obj) {
                this.f21897a.m26848P3((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m26856T3(int i) {
        if (this.f23004l == i) {
            return;
        }
        this.f23004l = i;
        this.f23003k = 0;
        m26854S3();
    }

    /* JADX INFO: renamed from: U3 */
    public void m26857U3(int i) {
        if (this.f23003k == i) {
            return;
        }
        this.f23003k = i;
        this.f23004l = 0;
        m26854S3();
    }

    /* JADX INFO: renamed from: V3 */
    public void m26858V3(umj umjVar) {
        this.f23002j = umjVar;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: p3 */
    public void mo14197p3(int i, String str) {
        super.mo14197p3(i, str);
        axj.m10098l(mo21430R2());
    }
}

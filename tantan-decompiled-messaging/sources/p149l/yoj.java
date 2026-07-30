package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView;
import p133rx.C22306c;
import p147v.VDraweeView;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class yoj<T extends ho2> extends h4t<T, GiftDialogSkinView> {

    /* JADX INFO: renamed from: i */
    public String f199300i;

    /* JADX INFO: renamed from: j */
    public umj f199301j;

    /* JADX INFO: renamed from: k */
    public int f199302k;

    /* JADX INFO: renamed from: l */
    public int f199303l;

    public yoj(bsm<? extends T> bsmVar, GiftDialogSkinView giftDialogSkinView, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        super(bsmVar);
        this.f199302k = 0;
        this.f199303l = 0;
        mo51532C(giftDialogSkinView);
        giftDialogSkinView.m74477k(vDraweeView, vDraweeView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m215515P3(soj0 soj0Var) {
        m215516L3();
    }

    /* JADX INFO: renamed from: L3 */
    public void m215516L3() {
        ((GiftDialogSkinView) this.viewModel).m74480n();
    }

    /* JADX INFO: renamed from: M3 */
    public void m215517M3(final e30<String> e30Var) {
        if (TextUtils.isEmpty(this.f199300i)) {
            duringCreated((C22306c<T>) uvr.m196086a()).subscribe(ffw.m121197h(new e30() { // from class: l.xoj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193849a.m215520R3(e30Var, (AuthData) obj);
                }
            }));
        } else {
            e30Var.call(this.f199300i);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public int m215518N3() {
        return ((GiftDialogSkinView) this.viewModel).getTopSkinHeight();
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m215519O3() {
        return ((GiftDialogSkinView) this.viewModel).m74484u();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m215520R3(e30 e30Var, AuthData authData) {
        String str = authData.accessToken;
        this.f199300i = str;
        e30Var.call(str);
    }

    /* JADX INFO: renamed from: S3 */
    public void m215521S3() {
        umj umjVar = this.f199301j;
        if (umjVar == null) {
            ((GiftDialogSkinView) this.viewModel).m74472L(null);
            return;
        }
        int i = this.f199302k;
        if (i != 0) {
            ((GiftDialogSkinView) this.viewModel).m74472L(umjVar.m194371h(i));
            return;
        }
        int i2 = this.f199303l;
        if (i2 == 0) {
            ((GiftDialogSkinView) this.viewModel).m74472L(umjVar.m194369f());
            return;
        }
        BLiveGiftSkin bLiveGiftSkinM194370g = umjVar.m194370g(i2);
        if (bLiveGiftSkinM194370g != null) {
            ((GiftDialogSkinView) this.viewModel).m74472L(bLiveGiftSkinM194370g);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.closeH5Skin().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.woj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187431a.m215515P3((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m215522T3(int i) {
        if (this.f199303l == i) {
            return;
        }
        this.f199303l = i;
        this.f199302k = 0;
        m215521S3();
    }

    /* JADX INFO: renamed from: U3 */
    public void m215523U3(int i) {
        if (this.f199302k == i) {
            return;
        }
        this.f199302k = i;
        this.f199303l = 0;
        m215521S3();
    }

    /* JADX INFO: renamed from: V3 */
    public void m215524V3(umj umjVar) {
        this.f199301j = umjVar;
    }

    @Override // p149l.h4t
    /* JADX INFO: renamed from: p3 */
    public void mo129310p3(int i, String str) {
        super.mo129310p3(i, str);
        axj.m99438l(mo77274R2());
    }
}

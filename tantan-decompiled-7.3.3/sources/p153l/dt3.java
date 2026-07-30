package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveTouchMeDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.areaC.item.GuideGiftItemView;

/* JADX INFO: loaded from: classes4.dex */
public class dt3 extends e80<GuideGiftItemView> {

    /* JADX INFO: renamed from: x */
    public boolean f90535x;

    public dt3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, yec0.f199256t5, bLiveBottomButton, i, i2, str, str2);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m117791r4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m117792v4(vxj0 vxj0Var) {
        m117793s4();
    }

    @Override // p153l.e80, p153l.kf2
    @SuppressLint({"MissingSuperCall"})
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        m149350g4();
        duringCreated(aiv.m98105i1(zrv.f205799a.m207631D0(), !this.f90535x)).subscribe(dhw.m115826e(new y20() { // from class: l.bt3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78324a.m117794t4((Boolean) obj);
            }
        }, new y20() { // from class: l.ct3
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179419f(R$string.f47502E9);
            }
        }));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.guideGift);
    }

    @Override // p153l.kf2, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m117793s4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m117793s4() {
        V v2 = this.f126232k;
        if (v2 != 0) {
            ((GuideGiftItemView) v2).m73387b();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(aiv.m98030B0(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.ys3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201368a.m117795u4((BLiveTouchMeDetail) obj);
            }
        }, new y20() { // from class: l.zs3
            @Override // p153l.y20
            public final void call(Object obj) {
                dt3.m117791r4((Throwable) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.onSettingDialogDismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.at3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73206a.m117792v4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m117794t4(Boolean bool) {
        m117797x4(!this.f90535x);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m117795u4(BLiveTouchMeDetail bLiveTouchMeDetail) {
        m117797x4(bLiveTouchMeDetail.openStatus);
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(GuideGiftItemView guideGiftItemView) {
        super.mo108591d4(guideGiftItemView);
        guideGiftItemView.m73388d(this.f126233l.name, mo119793Z3(), this.f90535x);
    }

    /* JADX INFO: renamed from: x4 */
    public void m117797x4(boolean z) {
        this.f90535x = z;
        V v2 = this.f126232k;
        if (v2 != 0) {
            ((GuideGiftItemView) v2).m73389e(z, true);
        }
    }
}

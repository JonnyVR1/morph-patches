package p002l;

import android.annotation.SuppressLint;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.areaC.item.GuideGiftItemView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveTouchMeDetail;
import l.e30;
import l.ffw;
import l.osi0;
import l.soj0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class es3 extends i80<GuideGiftItemView> {

    /* JADX INFO: renamed from: x */
    public boolean f9954x;

    public es3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, t6c0.f20020t5, bLiveBottomButton, i, i2, str, str2);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m12688r4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m12689v4(soj0 soj0Var) {
        m12690s4();
    }

    @Override // p002l.i80, p002l.df2
    @SuppressLint({"MissingSuperCall"})
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        m11815g4();
        duringCreated(zfv.m27274i1(ypv.a.D0(), !this.f9954x)).subscribe(ffw.e(new e30() { // from class: l.cs3
            public final void call(Object obj) {
                this.f8925a.m12692t4((Boolean) obj);
            }
        }, new e30() { // from class: l.ds3
            public final void call(Object obj) {
                osi0.f(R$string.f2696E9);
            }
        }));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("guideGift");
    }

    @Override // p002l.df2, p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m12690s4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m12690s4() {
        V v = this.f9196k;
        if (v != 0) {
            ((GuideGiftItemView) v).m5677b();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m12691t() {
        super.t();
        duringCreated(zfv.m27199B0(ypv.a.D0())).subscribe(ffw.e(new e30() { // from class: l.zr3
            public final void call(Object obj) {
                this.f23571a.m12693u4((BLiveTouchMeDetail) obj);
            }
        }, new e30() { // from class: l.as3
            public final void call(Object obj) {
                es3.m12688r4((Throwable) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.onSettingDialogDismiss().g()).subscribe(ffw.d(new e30() { // from class: l.bs3
            public final void call(Object obj) {
                this.f8325a.m12689v4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m12692t4(Boolean bool) {
        m12695x4(!this.f9954x);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m12693u4(BLiveTouchMeDetail bLiveTouchMeDetail) {
        m12695x4(bLiveTouchMeDetail.openStatus);
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(GuideGiftItemView guideGiftItemView) {
        super.mo11312d4(guideGiftItemView);
        guideGiftItemView.m5678d(this.f9197l.name, mo11809Z3(), this.f9954x);
    }

    /* JADX INFO: renamed from: x4 */
    public void m12695x4(boolean z) {
        this.f9954x = z;
        V v = this.f9196k;
        if (v != 0) {
            ((GuideGiftItemView) v).m5679e(z, true);
        }
    }
}

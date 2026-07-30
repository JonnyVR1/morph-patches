package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveTouchMeDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.areaC.item.GuideGiftItemView;

/* JADX INFO: loaded from: classes4.dex */
public class es3 extends i80<GuideGiftItemView> {

    /* JADX INFO: renamed from: x */
    public boolean f92978x;

    public es3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, t6c0.f168524t5, bLiveBottomButton, i, i2, str, str2);
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m117898r4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m117899v4(soj0 soj0Var) {
        m117900s4();
    }

    @Override // p149l.i80, p149l.df2
    @SuppressLint({"MissingSuperCall"})
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        m111423g4();
        duringCreated(zfv.m218571i1(ypv.f199493a.m199309D0(), !this.f92978x)).subscribe(ffw.m121194e(new e30() { // from class: l.cs3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82316a.m117901t4((Boolean) obj);
            }
        }, new e30() { // from class: l.ds3
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165782f(R$string.f46654E9);
            }
        }));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.guideGift);
    }

    @Override // p149l.df2, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m117900s4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m117900s4() {
        V v2 = this.f85887k;
        if (v2 != 0) {
            ((GuideGiftItemView) v2).m72204b();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(zfv.m218496B0(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.zr3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204453a.m117902u4((BLiveTouchMeDetail) obj);
            }
        }, new e30() { // from class: l.as3
            @Override // p149l.e30
            public final void call(Object obj) {
                es3.m117898r4((Throwable) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.onSettingDialogDismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.bs3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77002a.m117899v4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m117901t4(Boolean bool) {
        m117904x4(!this.f92978x);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m117902u4(BLiveTouchMeDetail bLiveTouchMeDetail) {
        m117904x4(bLiveTouchMeDetail.openStatus);
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(GuideGiftItemView guideGiftItemView) {
        super.mo108215d4(guideGiftItemView);
        guideGiftItemView.m72205d(this.f85888l.name, mo111417Z3(), this.f92978x);
    }

    /* JADX INFO: renamed from: x4 */
    public void m117904x4(boolean z) {
        this.f92978x = z;
        V v2 = this.f85887k;
        if (v2 != 0) {
            ((GuideGiftItemView) v2).m72206e(z, true);
        }
    }
}

package p002l;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.SummonFansItemView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.livingroom.view.LiveSettingNewBaseView;
import com.p1.mobile.putong.live.livingroom.view.LiveSettingView;
import l.bwr;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lt3 extends i80<SummonFansItemView> {

    /* JADX INFO: renamed from: A */
    public boolean f15042A;

    /* JADX INFO: renamed from: B */
    public final x24 f15043B;

    /* JADX INFO: renamed from: C */
    @DrawableRes
    public final int f15044C;

    /* JADX INFO: renamed from: D */
    @DrawableRes
    public final int f15045D;

    /* JADX INFO: renamed from: E */
    public View f15046E;

    /* JADX INFO: renamed from: x */
    public boolean f15047x;

    /* JADX INFO: renamed from: y */
    public String f15048y;

    /* JADX INFO: renamed from: z */
    public boolean f15049z;

    public lt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, t6c0.f20092z, bLiveBottomButton, i, i2, str, str2);
        this.f15047x = false;
        this.f15048y = "";
        this.f15049z = true;
        this.f15042A = false;
        this.f15044C = i3c0.f12861l6;
        this.f15045D = i3c0.f12873m6;
        this.f15046E = null;
        this.f15043B = (x24) z2(new x24(bsmVar, this));
    }

    @Override // p002l.i80, p002l.df2
    @SuppressLint({"MissingSuperCall"})
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        m11815g4();
        LiveSettingView liveSettingView = (LiveSettingView) m14184F3(new xjj(5000));
        LiveSettingNewBaseView liveSettingNewBaseView = (LiveSettingNewBaseView) m14184F3(new wjj(5000));
        if (liveSettingView == null && liveSettingNewBaseView == null) {
            return;
        }
        this.f15043B.m25643D4(liveSettingView);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("summonFans");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: f4 */
    public boolean mo11814f4() {
        return this.f15047x;
    }

    /* JADX INFO: renamed from: n4 */
    public View m17418n4() {
        if (((bwr) this).viewModel == null) {
            return null;
        }
        return this.f15046E;
    }

    /* JADX INFO: renamed from: o4 */
    public void m17419o4() {
        V v = this.f9196k;
        if (v != 0) {
            mo11312d4((SummonFansItemView) v);
        }
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(SummonFansItemView summonFansItemView) {
        super.mo11312d4(summonFansItemView);
        this.f15046E = summonFansItemView;
        summonFansItemView.f4589f.setText(this.f9197l.name);
        m17421q4(this.f15049z);
        m17422r4(this.f15042A);
    }

    /* JADX INFO: renamed from: q4 */
    public void m17421q4(boolean z) {
        this.f15049z = z;
        V v = this.f9196k;
        if (v == 0) {
            return;
        }
        if (z) {
            ((SummonFansItemView) v).f4586c.setImageResource(this.f15044C);
        } else {
            ((SummonFansItemView) v).f4586c.setImageResource(this.f15045D);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m17422r4(boolean z) {
        this.f15042A = z;
        V v = this.f9196k;
        if (v == 0) {
            return;
        }
        xdl0.M(((SummonFansItemView) v).f4590g, z);
        ((SummonFansItemView) this.f9196k).f4590g.setText(this.f15048y);
    }

    /* JADX INFO: renamed from: s4 */
    public void m17423s4(String str) {
        this.f15048y = str;
    }

    /* JADX INFO: renamed from: t4 */
    public void m17424t4(boolean z) {
        this.f15047x = z;
    }
}

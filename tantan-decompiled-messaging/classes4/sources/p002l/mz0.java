package p002l;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class mz0 extends i80<BottomItemView> {

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public final int f15747x;

    public mz0(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, @DrawableRes int i3, String str2) {
        super(bsmVar, t6c0.f19834f1, bLiveBottomButton, i, i2, str, str2);
        this.f15747x = i3;
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: n4 */
    public void mo11312d4(BottomItemView bottomItemView) {
        super.mo11312d4(bottomItemView);
        boolean zIsEmpty = TextUtils.isEmpty(mo11809Z3());
        V v = this.f9196k;
        if (zIsEmpty) {
            ((BottomItemView) v).setImageRes(this.f15747x);
        } else {
            ((BottomItemView) v).setImageUrl(mo11809Z3());
        }
        ((BottomItemView) this.f9196k).setText(this.f9197l.name);
    }
}

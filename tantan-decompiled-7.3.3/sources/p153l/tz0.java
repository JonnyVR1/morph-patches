package p153l;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tz0 extends e80<BottomItemView> {

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public final int f176733x;

    public tz0(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, @DrawableRes int i3, String str2) {
        super(dumVar, yec0.f199070f1, bLiveBottomButton, i, i2, str, str2);
        this.f176733x = i3;
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: n4 */
    public void mo108591d4(BottomItemView bottomItemView) {
        super.mo108591d4(bottomItemView);
        boolean zIsEmpty = TextUtils.isEmpty(mo119793Z3());
        V v2 = this.f126232k;
        if (zIsEmpty) {
            ((BottomItemView) v2).setImageRes(this.f176733x);
        } else {
            ((BottomItemView) v2).setImageUrl(mo119793Z3());
        }
        ((BottomItemView) this.f126232k).setText(this.f126233l.name);
    }
}

package p149l;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mz0 extends i80<BottomItemView> {

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public final int f136344x;

    public mz0(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, @DrawableRes int i3, String str2) {
        super(bsmVar, t6c0.f168338f1, bLiveBottomButton, i, i2, str, str2);
        this.f136344x = i3;
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: n4 */
    public void mo108215d4(BottomItemView bottomItemView) {
        super.mo108215d4(bottomItemView);
        boolean zIsEmpty = TextUtils.isEmpty(mo111417Z3());
        V v2 = this.f85887k;
        if (zIsEmpty) {
            ((BottomItemView) v2).setImageRes(this.f136344x);
        } else {
            ((BottomItemView) v2).setImageUrl(mo111417Z3());
        }
        ((BottomItemView) this.f85887k).setText(this.f85888l.name);
    }
}

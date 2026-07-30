package p002l;

import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class yp1 extends df2<RedDotButton> {

    /* JADX INFO: renamed from: q */
    @DrawableRes
    public final int f23011q;

    /* JADX INFO: renamed from: r */
    public boolean f23012r;

    public yp1(bsm bsmVar, @DrawableRes int i, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f20079y, bLiveBottomButton);
        this.f23011q = i;
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(RedDotButton redDotButton) {
        super.mo11312d4(redDotButton);
        redDotButton.setLayoutParams(new LinearLayout.LayoutParams(df2.f9193o, df2.f9194p));
        if (TextUtils.isEmpty(mo11809Z3())) {
            redDotButton.setLocalIcon(this.f23011q);
        } else {
            redDotButton.setRemoteIcon(mo11809Z3());
        }
        redDotButton.m5664c(this.f9197l);
        if (this.f23012r) {
            redDotButton.m5666e();
        }
    }
}

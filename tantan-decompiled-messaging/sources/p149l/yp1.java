package p149l;

import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yp1 extends df2<RedDotButton> {

    /* JADX INFO: renamed from: q */
    @DrawableRes
    public final int f199379q;

    /* JADX INFO: renamed from: r */
    public boolean f199380r;

    public yp1(bsm bsmVar, @DrawableRes int i, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168583y, bLiveBottomButton);
        this.f199379q = i;
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(RedDotButton redDotButton) {
        super.mo108215d4(redDotButton);
        redDotButton.setLayoutParams(new LinearLayout.LayoutParams(df2.f85884o, df2.f85885p));
        if (TextUtils.isEmpty(mo111417Z3())) {
            redDotButton.setLocalIcon(this.f199379q);
        } else {
            redDotButton.setRemoteIcon(mo111417Z3());
        }
        redDotButton.m72191c(this.f85888l);
        if (this.f199380r) {
            redDotButton.m72193e();
        }
    }
}

package p153l;

import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fq1 extends kf2<RedDotButton> {

    /* JADX INFO: renamed from: q */
    @DrawableRes
    public final int f100238q;

    /* JADX INFO: renamed from: r */
    public boolean f100239r;

    public fq1(dum dumVar, @DrawableRes int i, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f199315y, bLiveBottomButton);
        this.f100238q = i;
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(RedDotButton redDotButton) {
        super.mo108591d4(redDotButton);
        redDotButton.setLayoutParams(new LinearLayout.LayoutParams(kf2.f126229o, kf2.f126230p));
        if (TextUtils.isEmpty(mo119793Z3())) {
            redDotButton.setLocalIcon(this.f100238q);
        } else {
            redDotButton.setRemoteIcon(mo119793Z3());
        }
        redDotButton.m73374c(this.f126233l);
        if (this.f100239r) {
            redDotButton.m73376e();
        }
    }
}

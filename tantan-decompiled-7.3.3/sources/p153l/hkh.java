package p153l;

import android.animation.AnimatorListenerAdapter;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;

/* JADX INFO: loaded from: classes13.dex */
public class hkh implements tih<FeedMyInterestItem> {

    /* JADX INFO: renamed from: a */
    public ViewPager f110415a;

    @Override // p153l.tih
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo135622d(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
        m191332a(feedMyInterestItem.f43026d1);
        for (int i = 0; i < 30; i++) {
            if (feedMyInterestItem.getParent() instanceof ViewPager) {
                this.f110415a = (ViewPager) feedMyInterestItem.getParent();
                break;
            }
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -10.0f, 0, feedMyInterestItem.getWidth() / 2.0f, 0, feedMyInterestItem.getHeight() + qa00.m175859d(50.0f));
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(400L);
        rotateAnimation.setFillAfter(true);
        feedMyInterestItem.startAnimation(rotateAnimation);
        feedMyInterestItem.animate().alpha(0.0f).setDuration(400L).start();
        m191333b(this.f110415a, feedMyInterestItem, animatorListenerAdapter);
    }
}

package p007l;

import android.animation.AnimatorListenerAdapter;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sih implements ehh<FeedMyInterestItem> {

    /* JADX INFO: renamed from: a */
    public ViewPager f12965a;

    @Override // p007l.ehh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo9840d(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
        m9838a(feedMyInterestItem.f3639d1);
        for (int i = 0; i < 30; i++) {
            if (feedMyInterestItem.getParent() instanceof ViewPager) {
                this.f12965a = feedMyInterestItem.getParent();
                break;
            }
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -10.0f, 0, feedMyInterestItem.getWidth() / 2.0f, 0, feedMyInterestItem.getHeight() + t100.d(50.0f));
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(400L);
        rotateAnimation.setFillAfter(true);
        feedMyInterestItem.startAnimation(rotateAnimation);
        feedMyInterestItem.animate().alpha(0.0f).setDuration(400L).start();
        m9839b(this.f12965a, feedMyInterestItem, animatorListenerAdapter);
    }
}

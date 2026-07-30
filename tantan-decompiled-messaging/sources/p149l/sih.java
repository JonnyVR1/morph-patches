package p149l;

import android.animation.AnimatorListenerAdapter;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;

/* JADX INFO: loaded from: classes12.dex */
public class sih implements ehh<FeedMyInterestItem> {

    /* JADX INFO: renamed from: a */
    public ViewPager f164717a;

    @Override // p149l.ehh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo116455d(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
        m116453a(feedMyInterestItem.f42178d1);
        for (int i = 0; i < 30; i++) {
            if (feedMyInterestItem.getParent() instanceof ViewPager) {
                this.f164717a = (ViewPager) feedMyInterestItem.getParent();
                break;
            }
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -10.0f, 0, feedMyInterestItem.getWidth() / 2.0f, 0, feedMyInterestItem.getHeight() + t100.m186890d(50.0f));
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(400L);
        rotateAnimation.setFillAfter(true);
        feedMyInterestItem.startAnimation(rotateAnimation);
        feedMyInterestItem.animate().alpha(0.0f).setDuration(400L).start();
        m116454b(this.f164717a, feedMyInterestItem, animatorListenerAdapter);
    }
}

package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;

/* JADX INFO: loaded from: classes13.dex */
public class lah implements tih<FeedMyInterestItem> {

    /* JADX INFO: renamed from: a */
    public ViewPager f130693a;

    /* JADX INFO: renamed from: l.lah$a */
    public class C18373a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FeedMyInterestItem f130694a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimatorListenerAdapter f130695b;

        public C18373a(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f130694a = feedMyInterestItem;
            this.f130695b = animatorListenerAdapter;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            lah lahVar = lah.this;
            ViewPager viewPager = lahVar.f130693a;
            if (viewPager != null) {
                lahVar.m191333b(viewPager, this.f130694a, this.f130695b);
            }
        }
    }

    @Override // p153l.tih
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo135622d(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
        m191332a(feedMyInterestItem.f43028e1);
        for (int i = 0; i < 30; i++) {
            if (feedMyInterestItem.getParent() instanceof ViewPager) {
                this.f130693a = (ViewPager) feedMyInterestItem.getParent();
                break;
            }
        }
        feedMyInterestItem.animate().alpha(0.0f).translationY(-feedMyInterestItem.getHeight()).setDuration(300L).setListener(new C18373a(feedMyInterestItem, animatorListenerAdapter)).start();
    }
}

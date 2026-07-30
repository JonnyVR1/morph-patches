package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;

/* JADX INFO: loaded from: classes12.dex */
public class w8h implements ehh<FeedMyInterestItem> {

    /* JADX INFO: renamed from: a */
    public ViewPager f185210a;

    /* JADX INFO: renamed from: l.w8h$a */
    public class C20831a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FeedMyInterestItem f185211a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimatorListenerAdapter f185212b;

        public C20831a(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f185211a = feedMyInterestItem;
            this.f185212b = animatorListenerAdapter;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w8h w8hVar = w8h.this;
            ViewPager viewPager = w8hVar.f185210a;
            if (viewPager != null) {
                w8hVar.m116454b(viewPager, this.f185211a, this.f185212b);
            }
        }
    }

    @Override // p149l.ehh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo116455d(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
        m116453a(feedMyInterestItem.f42180e1);
        for (int i = 0; i < 30; i++) {
            if (feedMyInterestItem.getParent() instanceof ViewPager) {
                this.f185210a = (ViewPager) feedMyInterestItem.getParent();
                break;
            }
        }
        feedMyInterestItem.animate().alpha(0.0f).translationY(-feedMyInterestItem.getHeight()).setDuration(300L).setListener(new C20831a(feedMyInterestItem, animatorListenerAdapter)).start();
    }
}

package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w8h implements ehh<FeedMyInterestItem> {

    /* JADX INFO: renamed from: a */
    public ViewPager f14463a;

    /* JADX INFO: renamed from: l.w8h$a */
    public class C2528a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FeedMyInterestItem f14464a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimatorListenerAdapter f14465b;

        public C2528a(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f14464a = feedMyInterestItem;
            this.f14465b = animatorListenerAdapter;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w8h w8hVar = w8h.this;
            ViewPager viewPager = w8hVar.f14463a;
            if (viewPager != null) {
                w8hVar.m9839b(viewPager, this.f14464a, this.f14465b);
            }
        }
    }

    @Override // p007l.ehh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo9840d(FeedMyInterestItem feedMyInterestItem, AnimatorListenerAdapter animatorListenerAdapter) {
        m9838a(feedMyInterestItem.f3641e1);
        for (int i = 0; i < 30; i++) {
            if (feedMyInterestItem.getParent() instanceof ViewPager) {
                this.f14463a = feedMyInterestItem.getParent();
                break;
            }
        }
        feedMyInterestItem.animate().alpha(0.0f).translationY(-feedMyInterestItem.getHeight()).setDuration(300L).setListener(new C2528a(feedMyInterestItem, animatorListenerAdapter)).start();
    }
}

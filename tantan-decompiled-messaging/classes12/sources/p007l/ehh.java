package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import java.lang.reflect.Method;
import p007l.jol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface ehh<T extends jol> {

    /* JADX INFO: renamed from: l.ehh$a */
    public class C2375a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f7375a;

        public C2375a(View view) {
            this.f7375a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7375a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m9837c(ViewPager viewPager, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        viewPager.T(i, false);
        animatorListenerAdapter.onAnimationEnd(null);
    }

    /* JADX INFO: renamed from: a */
    default void m9838a(View view) {
        view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(100L).setListener(new C2375a(view)).start();
    }

    /* JADX INFO: renamed from: b */
    default void m9839b(final ViewPager viewPager, FeedMyInterestItem feedMyInterestItem, final AnimatorListenerAdapter animatorListenerAdapter) {
        FeedMyInterestPeopleAct feedMyInterestPeopleAct = (FeedMyInterestPeopleAct) viewPager.getContext();
        boolean z = viewPager.indexOfChild(feedMyInterestItem) + 1 == viewPager.getChildCount();
        final int position = feedMyInterestItem.getPosition();
        feedMyInterestPeopleAct.m6005z2(true);
        int i = z ? position - 1 : position + 1;
        try {
            Class<?> cls = viewPager.getClass();
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("setCurrentItemInternal", cls2, cls3, cls3, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(viewPager, Integer.valueOf(i), Boolean.TRUE, Boolean.FALSE, 30);
        } catch (Exception unused) {
            viewPager.setCurrentItem(i);
        }
        feedMyInterestPeopleAct.m6005z2(false);
        viewPager.postDelayed(new Runnable() { // from class: l.dhh
            @Override // java.lang.Runnable
            public final void run() {
                ehh.m9837c(viewPager, position, animatorListenerAdapter);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: d */
    void mo9840d(T t, AnimatorListenerAdapter animatorListenerAdapter);
}

package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.FeedMyInterestItem;
import java.lang.reflect.Method;
import p153l.uql;

/* JADX INFO: loaded from: classes13.dex */
public interface tih<T extends uql> {

    /* JADX INFO: renamed from: l.tih$a */
    public class C20323a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f174460a;

        public C20323a(View view) {
            this.f174460a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f174460a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m191331c(ViewPager viewPager, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        viewPager.m4178T(i, false);
        animatorListenerAdapter.onAnimationEnd(null);
    }

    /* JADX INFO: renamed from: a */
    default void m191332a(View view) {
        view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(100L).setListener(new C20323a(view)).start();
    }

    /* JADX INFO: renamed from: b */
    default void m191333b(final ViewPager viewPager, FeedMyInterestItem feedMyInterestItem, final AnimatorListenerAdapter animatorListenerAdapter) {
        FeedMyInterestPeopleAct feedMyInterestPeopleAct = (FeedMyInterestPeopleAct) viewPager.getContext();
        boolean z = viewPager.indexOfChild(feedMyInterestItem) + 1 == viewPager.getChildCount();
        final int position = feedMyInterestItem.getPosition();
        feedMyInterestPeopleAct.m66070A2(true);
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
        feedMyInterestPeopleAct.m66070A2(false);
        viewPager.postDelayed(new Runnable() { // from class: l.sih
            @Override // java.lang.Runnable
            public final void run() {
                tih.m191331c(viewPager, position, animatorListenerAdapter);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: d */
    void mo135622d(T t, AnimatorListenerAdapter animatorListenerAdapter);
}

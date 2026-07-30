package p007l;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import com.p000p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z2h implements a3h {
    @Override // p007l.a3h
    /* JADX INFO: renamed from: a */
    public void mo8400a(MotionEvent motionEvent, Point point, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        m17210e(point, feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: c */
    public final void m17208c(int i, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        m17211f(i, 0, feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: d */
    public final void m17209d(int i, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        m17211f(i, xdl0.y0() - feedFloatingDraggableContainerView.getAttachView().getWidth(), feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: e */
    public final void m17210e(Point point, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        int i = point.x;
        if (vqg.m15526l0(i, feedFloatingDraggableContainerView.getAttachView().getWidth())) {
            m17209d(i, feedFloatingDraggableContainerView);
        } else {
            m17208c(i, feedFloatingDraggableContainerView);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17211f(int i, int i2, final FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.y2h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                feedFloatingDraggableContainerView.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.start();
    }
}

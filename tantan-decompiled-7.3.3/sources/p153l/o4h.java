package p153l;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import com.p051p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView;

/* JADX INFO: loaded from: classes13.dex */
public class o4h implements p4h {
    @Override // p153l.p4h
    /* JADX INFO: renamed from: a */
    public void mo166011a(MotionEvent motionEvent, Point point, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        m166014e(point, feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: c */
    public final void m166012c(int i, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        m166015f(i, 0, feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: d */
    public final void m166013d(int i, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        m166015f(i, bnl0.m105592y0() - feedFloatingDraggableContainerView.getAttachView().getWidth(), feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: e */
    public final void m166014e(Point point, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        int i = point.x;
        if (ksg.m151215l0(i, feedFloatingDraggableContainerView.getAttachView().getWidth())) {
            m166013d(i, feedFloatingDraggableContainerView);
        } else {
            m166012c(i, feedFloatingDraggableContainerView);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m166015f(int i, int i2, final FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n4h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                feedFloatingDraggableContainerView.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.start();
    }
}

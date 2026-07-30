package p149l;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import com.p046p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView;

/* JADX INFO: loaded from: classes12.dex */
public class z2h implements a3h {
    @Override // p149l.a3h
    /* JADX INFO: renamed from: a */
    public void mo94691a(MotionEvent motionEvent, Point point, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        m216967e(point, feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: c */
    public final void m216965c(int i, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        m216968f(i, 0, feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: d */
    public final void m216966d(int i, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        m216968f(i, xdl0.m208412y0() - feedFloatingDraggableContainerView.getAttachView().getWidth(), feedFloatingDraggableContainerView);
    }

    /* JADX INFO: renamed from: e */
    public final void m216967e(Point point, FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
        int i = point.x;
        if (vqg.m199556l0(i, feedFloatingDraggableContainerView.getAttachView().getWidth())) {
            m216966d(i, feedFloatingDraggableContainerView);
        } else {
            m216965c(i, feedFloatingDraggableContainerView);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m216968f(int i, int i2, final FeedFloatingDraggableContainerView feedFloatingDraggableContainerView) {
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

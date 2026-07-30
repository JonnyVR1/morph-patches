package cn.qqtheme.framework.wheelview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class WheelScroller {
    public static final int MIN_DELTA_FOR_SCROLLING = 1;
    private static final int SCROLLING_DURATION = 400;
    private Context context;
    private GestureDetector gestureDetector;
    private boolean isScrollingPerformed;
    private int lastScrollY;
    private float lastTouchedY;
    private ScrollingListener listener;
    private Scroller scroller;
    private GestureDetector.SimpleOnGestureListener gestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: cn.qqtheme.framework.wheelview.WheelScroller.1
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            WheelScroller.this.lastScrollY = 0;
            WheelScroller.this.scroller.fling(0, WheelScroller.this.lastScrollY, 0, (int) (-f2), 0, 0, -2147483647, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            WheelScroller.this.setNextMessage(0);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    };
    private final int MESSAGE_SCROLL = 0;
    private final int MESSAGE_JUSTIFY = 1;
    private Handler animationHandler = new Handler() { // from class: cn.qqtheme.framework.wheelview.WheelScroller.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WheelScroller.this.scroller.computeScrollOffset();
            int currY = WheelScroller.this.scroller.getCurrY();
            int i = WheelScroller.this.lastScrollY - currY;
            WheelScroller.this.lastScrollY = currY;
            if (i != 0) {
                WheelScroller.this.listener.onScroll(i);
            }
            if (Math.abs(currY - WheelScroller.this.scroller.getFinalY()) < 1) {
                WheelScroller.this.scroller.getFinalY();
                WheelScroller.this.scroller.forceFinished(true);
            }
            if (!WheelScroller.this.scroller.isFinished()) {
                WheelScroller.this.animationHandler.sendEmptyMessage(message.what);
                return;
            }
            int i2 = message.what;
            WheelScroller wheelScroller = WheelScroller.this;
            if (i2 == 0) {
                wheelScroller.justify();
            } else {
                wheelScroller.finishScrolling();
            }
        }
    };

    public interface ScrollingListener {
        void onFinished();

        void onJustify();

        void onScroll(int i);

        void onStarted();
    }

    public WheelScroller(Context context, ScrollingListener scrollingListener) {
        GestureDetector gestureDetector = new GestureDetector(context, this.gestureListener);
        this.gestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.scroller = new Scroller(context);
        this.listener = scrollingListener;
        this.context = context;
    }

    private void clearMessages() {
        this.animationHandler.removeMessages(0);
        this.animationHandler.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void justify() {
        this.listener.onJustify();
        setNextMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextMessage(int i) {
        clearMessages();
        this.animationHandler.sendEmptyMessage(i);
    }

    private void startScrolling() {
        if (this.isScrollingPerformed) {
            return;
        }
        this.isScrollingPerformed = true;
        this.listener.onStarted();
    }

    public void finishScrolling() {
        if (this.isScrollingPerformed) {
            this.listener.onFinished();
            this.isScrollingPerformed = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int y;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lastTouchedY = motionEvent.getY();
            this.scroller.forceFinished(true);
            clearMessages();
        } else if (action == 2 && (y = (int) (motionEvent.getY() - this.lastTouchedY)) != 0) {
            startScrolling();
            this.listener.onScroll(y);
            this.lastTouchedY = motionEvent.getY();
        }
        if (!this.gestureDetector.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            justify();
        }
        return true;
    }

    public void scroll(int i, int i2) {
        this.scroller.forceFinished(true);
        this.lastScrollY = 0;
        Scroller scroller = this.scroller;
        if (i2 == 0) {
            i2 = 400;
        }
        scroller.startScroll(0, 0, 0, i, i2);
        setNextMessage(0);
        startScrolling();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.scroller.forceFinished(true);
        this.scroller = new Scroller(this.context, interpolator);
    }

    public void stopScrolling() {
        this.scroller.forceFinished(true);
    }
}

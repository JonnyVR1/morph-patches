package com.tencent.rtmp.p114ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.liteav.InterfaceC14277k;
import com.tencent.liteav.renderer.TXCFocusIndicatorView;
import com.tencent.liteav.renderer.TXCGLSurfaceView;

/* JADX INFO: loaded from: classes2.dex */
public class TXCloudVideoView extends FrameLayout implements View.OnTouchListener {
    private static final int FOCUS_AREA_SIZE_DP = 70;
    private static final String TAG = "TXCloudVideoView";
    private float mBottom;
    private InterfaceC14277k mCapture;
    private int mCaptureHeight;
    private int mCaptureWidth;
    private int mCurrentScale;
    protected TXDashBoard mDashBoard;
    private boolean mFocus;
    private int mFocusAreaSize;
    protected TXCFocusIndicatorView mFocusIndicatorView;
    protected TXCGLSurfaceView mGLSurfaceView;
    private float mLeft;
    private float mRight;
    private ScaleGestureDetector mScaleGestureDetector;
    private ScaleGestureDetector.OnScaleGestureListener mScaleGestureListener;
    protected SurfaceView mSurfaceView;
    private float mTop;
    private RunnableC14586a mTouchFocusRunnable;
    private String mUserId;
    protected TextureView mVideoView;
    private boolean mZoom;

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCaptureWidth = 0;
        this.mCaptureHeight = 0;
        this.mLeft = 0.0f;
        this.mRight = 0.0f;
        this.mTop = 0.0f;
        this.mBottom = 0.0f;
        this.mFocusAreaSize = 0;
        this.mUserId = "";
        this.mFocus = false;
        this.mZoom = false;
        this.mCurrentScale = 1;
        this.mScaleGestureDetector = null;
        this.mScaleGestureListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.2
            /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r3
              0x0039: PHI (r3v13 float) = (r3v2 float), (r3v14 float) binds: [B:15:0x0050, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float f;
                int iMo84539e = TXCloudVideoView.this.mCapture != null ? TXCloudVideoView.this.mCapture.mo84539e() : 0;
                if (iMo84539e > 0) {
                    float scaleFactor = scaleGestureDetector.getScaleFactor();
                    if (scaleFactor > 1.0f) {
                        scaleFactor = ((0.2f / iMo84539e) * (iMo84539e - TXCloudVideoView.this.mCurrentScale)) + 1.0f;
                        f = 1.1f;
                        if (scaleFactor <= 1.1f) {
                            scaleFactor = f;
                        }
                    } else if (scaleFactor < 1.0f) {
                        scaleFactor = 1.0f - ((0.2f / iMo84539e) * TXCloudVideoView.this.mCurrentScale);
                        f = 0.9f;
                        if (scaleFactor >= 0.9f) {
                            scaleFactor = f;
                        }
                    }
                    int iRound = Math.round(TXCloudVideoView.this.mCurrentScale * scaleFactor);
                    if (iRound == TXCloudVideoView.this.mCurrentScale) {
                        if (scaleFactor > 1.0f) {
                            iRound++;
                        } else if (scaleFactor < 1.0f) {
                            iRound--;
                        }
                    }
                    if (iRound < iMo84539e) {
                        iMo84539e = iRound;
                    }
                    if (iMo84539e <= 1) {
                        iMo84539e = 1;
                    }
                    if (scaleFactor > 1.0f) {
                        if (iMo84539e < TXCloudVideoView.this.mCurrentScale) {
                            iMo84539e = TXCloudVideoView.this.mCurrentScale;
                        }
                    } else if (scaleFactor < 1.0f && iMo84539e > TXCloudVideoView.this.mCurrentScale) {
                        iMo84539e = TXCloudVideoView.this.mCurrentScale;
                    }
                    TXCloudVideoView.this.mCurrentScale = iMo84539e;
                    if (TXCloudVideoView.this.mCapture != null) {
                        TXCloudVideoView.this.mCapture.mo84528a(TXCloudVideoView.this.mCurrentScale);
                    }
                }
                return false;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        };
        this.mTouchFocusRunnable = new RunnableC14586a();
        this.mDashBoard = new TXDashBoard(context);
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this.mScaleGestureListener);
    }

    private int clamp(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    private Rect getTouchRect(int i, int i2, int i3, int i4, float f) {
        TXCGLSurfaceView tXCGLSurfaceView;
        if (this.mFocusAreaSize == 0 && (tXCGLSurfaceView = this.mGLSurfaceView) != null) {
            this.mFocusAreaSize = (int) ((tXCGLSurfaceView.getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        }
        int iIntValue = Float.valueOf(this.mFocusAreaSize * f).intValue();
        int i5 = iIntValue / 2;
        int iClamp = clamp(i - i5, 0, i3 - iIntValue);
        int iClamp2 = clamp(i2 - i5, 0, i4 - iIntValue);
        return new Rect(iClamp, iClamp2, iClamp + iIntValue, iIntValue + iClamp2);
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void updateDbMargin() {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.m85786a((int) this.mLeft, (int) this.mTop, (int) this.mRight, (int) this.mBottom);
        }
    }

    public void addVideoView(TXCGLSurfaceView tXCGLSurfaceView) {
        TXCGLSurfaceView tXCGLSurfaceView2 = this.mGLSurfaceView;
        if (tXCGLSurfaceView2 != null) {
            removeView(tXCGLSurfaceView2);
        }
        this.mGLSurfaceView = tXCGLSurfaceView;
        addView(tXCGLSurfaceView);
        resetLogView();
    }

    public void appendEventInfo(String str) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.m85790a(str);
        }
    }

    public void clearLastFrame(boolean z) {
        if (z) {
            setVisibility(8);
        }
    }

    public void clearLog() {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.m85785a();
        }
    }

    public void disableLog(boolean z) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.m85791a(z);
        }
    }

    public TXCGLSurfaceView getGLSurfaceView() {
        return this.mGLSurfaceView;
    }

    public TextureView getHWVideoView() {
        return this.mVideoView;
    }

    public SurfaceView getSurfaceView() {
        return this.mSurfaceView;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public TextureView getVideoView() {
        return this.mVideoView;
    }

    public void onDestroy() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        updateDbMargin();
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.setStatusTextSize((float) (((double) px2dip(getContext(), getWidth())) / 30.0d));
            this.mDashBoard.setEventTextSize((float) (((double) px2dip(getContext(), getWidth())) / 25.0d));
        }
        int i6 = this.mCaptureWidth;
        if (i6 == 0 || (i5 = this.mCaptureHeight) == 0) {
            return;
        }
        updateVideoViewSize(i6, i5);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            this.mTouchFocusRunnable.m85781a(view);
            this.mTouchFocusRunnable.m85780a(motionEvent);
            postDelayed(this.mTouchFocusRunnable, 100L);
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2) {
            removeCallbacks(this.mTouchFocusRunnable);
            onTouchFocus(-1, -1);
            ScaleGestureDetector scaleGestureDetector = this.mScaleGestureDetector;
            if (scaleGestureDetector != null && this.mZoom) {
                scaleGestureDetector.onTouchEvent(motionEvent);
            }
        }
        if (this.mZoom && motionEvent.getAction() == 0) {
            performClick();
        }
        return this.mZoom;
    }

    public void onTouchFocus(int i, int i2) {
        if (this.mGLSurfaceView == null) {
            return;
        }
        if (i < 0 || i2 < 0) {
            TXCFocusIndicatorView tXCFocusIndicatorView = this.mFocusIndicatorView;
            if (tXCFocusIndicatorView != null) {
                tXCFocusIndicatorView.setVisibility(8);
                return;
            }
            return;
        }
        TXCFocusIndicatorView tXCFocusIndicatorView2 = this.mFocusIndicatorView;
        if (tXCFocusIndicatorView2 == null) {
            TXCFocusIndicatorView tXCFocusIndicatorView3 = new TXCFocusIndicatorView(getContext());
            this.mFocusIndicatorView = tXCFocusIndicatorView3;
            tXCFocusIndicatorView3.setVisibility(0);
            addView(this.mFocusIndicatorView);
        } else if (indexOfChild(tXCFocusIndicatorView2) != getChildCount() - 1) {
            removeView(this.mFocusIndicatorView);
            addView(this.mFocusIndicatorView);
        }
        Rect touchRect = getTouchRect(i, i2, this.mGLSurfaceView.getWidth(), this.mGLSurfaceView.getHeight(), 1.0f);
        TXCFocusIndicatorView tXCFocusIndicatorView4 = this.mFocusIndicatorView;
        int i3 = touchRect.left;
        tXCFocusIndicatorView4.show(i3, touchRect.top, touchRect.right - i3);
    }

    public void removeFocusIndicatorView() {
        TXCFocusIndicatorView tXCFocusIndicatorView = this.mFocusIndicatorView;
        if (tXCFocusIndicatorView != null) {
            removeView(tXCFocusIndicatorView);
            this.mFocusIndicatorView = null;
        }
    }

    public void removeVideoView() {
        TextureView textureView = this.mVideoView;
        if (textureView != null) {
            removeView(textureView);
            this.mVideoView = null;
        }
        TXCGLSurfaceView tXCGLSurfaceView = this.mGLSurfaceView;
        if (tXCGLSurfaceView != null) {
            removeView(tXCGLSurfaceView);
            this.mGLSurfaceView = null;
        }
        this.mSurfaceView = null;
    }

    public void resetLogView() {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            removeView(tXDashBoard);
            addView(this.mDashBoard);
        }
    }

    public void setDashBoardStatusInfo(CharSequence charSequence) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.m85789a(charSequence);
        }
    }

    public void setLogMargin(float f, float f2, float f3, float f4) {
        this.mLeft = f;
        this.mRight = f2;
        this.mTop = f3;
        this.mBottom = f4;
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.m85786a((int) f, (int) f3, (int) f2, (int) f4);
        }
    }

    public void setLogMarginRatio(final float f, final float f2, final float f3, final float f4) {
        getWidth();
        getHeight();
        postDelayed(new Runnable() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView tXCloudVideoView = TXCloudVideoView.this;
                tXCloudVideoView.mLeft = tXCloudVideoView.getWidth() * f;
                TXCloudVideoView tXCloudVideoView2 = TXCloudVideoView.this;
                tXCloudVideoView2.mRight = tXCloudVideoView2.getWidth() * f2;
                TXCloudVideoView tXCloudVideoView3 = TXCloudVideoView.this;
                tXCloudVideoView3.mTop = tXCloudVideoView3.getHeight() * f3;
                TXCloudVideoView tXCloudVideoView4 = TXCloudVideoView.this;
                tXCloudVideoView4.mBottom = tXCloudVideoView4.getHeight() * f4;
                TXCloudVideoView tXCloudVideoView5 = TXCloudVideoView.this;
                TXDashBoard tXDashBoard = tXCloudVideoView5.mDashBoard;
                if (tXDashBoard != null) {
                    tXDashBoard.m85786a((int) tXCloudVideoView5.mLeft, (int) TXCloudVideoView.this.mTop, (int) TXCloudVideoView.this.mRight, (int) TXCloudVideoView.this.mBottom);
                }
            }
        }, 100L);
    }

    public void setLogText(Bundle bundle, Bundle bundle2, int i) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.m85788a(bundle, bundle2, i);
        }
    }

    public void setMirror(boolean z) {
    }

    public void setRenderMode(int i) {
    }

    public void setRenderRotation(int i) {
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void showLog(boolean z) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.setShowLevel(z ? 2 : 0);
        }
    }

    public void showVideoDebugLog(int i) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.setShowLevel(i);
        }
    }

    public void start(boolean z, boolean z2, InterfaceC14277k interfaceC14277k) {
        this.mFocus = z;
        this.mZoom = z2;
        if (z || z2) {
            setOnTouchListener(this);
            this.mCapture = interfaceC14277k;
        }
        TXCGLSurfaceView tXCGLSurfaceView = this.mGLSurfaceView;
        if (tXCGLSurfaceView != null) {
            tXCGLSurfaceView.setVisibility(0);
        }
    }

    public void stop(boolean z) {
        TXCGLSurfaceView tXCGLSurfaceView;
        if (this.mFocus || this.mZoom) {
            setOnTouchListener(null);
        }
        this.mCapture = null;
        if (!z || (tXCGLSurfaceView = this.mGLSurfaceView) == null) {
            return;
        }
        tXCGLSurfaceView.setVisibility(8);
    }

    public void updateVideoViewSize(int i, int i2) {
        int height;
        FrameLayout.LayoutParams layoutParams;
        View view = this.mGLSurfaceView;
        if (view == null && (view = this.mVideoView) == null) {
            return;
        }
        int width = getWidth();
        int height2 = getHeight();
        if (i2 == 0 || height2 == 0) {
            return;
        }
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        float f = (i * 1.0f) / i2;
        float f2 = width;
        float f3 = height2;
        int width2 = 0;
        if (f > (1.0f * f2) / f3) {
            height2 = (int) (f2 / f);
            height = (getHeight() - height2) / 2;
        } else {
            width = (int) (f3 * f);
            width2 = (getWidth() - width) / 2;
            height = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            if (layoutParams.width == width && layoutParams.height == height2) {
                return;
            }
            layoutParams.width = width;
            layoutParams.height = height2;
        } else {
            layoutParams = new FrameLayout.LayoutParams(width, height2);
        }
        layoutParams.leftMargin = width2;
        layoutParams.topMargin = height;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.ui.TXCloudVideoView$a */
    public class RunnableC14586a implements Runnable {

        /* JADX INFO: renamed from: b */
        private View f61287b;

        /* JADX INFO: renamed from: c */
        private MotionEvent f61288c;

        private RunnableC14586a() {
        }

        /* JADX INFO: renamed from: a */
        public void m85781a(View view) {
            this.f61287b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TXCloudVideoView.this.mCapture != null && TXCloudVideoView.this.mFocus) {
                TXCloudVideoView.this.mCapture.mo84518a(this.f61288c.getX() / this.f61287b.getWidth(), this.f61288c.getY() / this.f61287b.getHeight());
            }
            if (TXCloudVideoView.this.mFocus) {
                TXCloudVideoView.this.onTouchFocus((int) this.f61288c.getX(), (int) this.f61288c.getY());
            }
        }

        /* JADX INFO: renamed from: a */
        public void m85780a(MotionEvent motionEvent) {
            this.f61288c = motionEvent;
        }
    }

    public void addVideoView(TextureView textureView) {
        TextureView textureView2 = this.mVideoView;
        if (textureView2 != null) {
            removeView(textureView2);
        }
        this.mVideoView = textureView;
        addView(textureView);
        resetLogView();
    }

    public TXCloudVideoView(Context context) {
        this(context, null);
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
        this(surfaceView.getContext(), null);
        this.mSurfaceView = surfaceView;
    }
}

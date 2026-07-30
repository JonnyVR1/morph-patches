package com.momo.xeengine.gift;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.game.XEGameView;
import com.momo.xeengine.svgaplayer.SVGAImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class GiftView extends XEGameView {
    private SVGAImageView svgaImageView;
    private TouchPolicy touchPolicy;
    private final List<RectF> validTouchAreas;

    /* JADX INFO: renamed from: com.momo.xeengine.gift.GiftView$1 */
    public static /* synthetic */ class C41941 {
        static final /* synthetic */ int[] $SwitchMap$com$momo$xeengine$gift$GiftView$TouchPolicy;

        static {
            int[] iArr = new int[TouchPolicy.values().length];
            $SwitchMap$com$momo$xeengine$gift$GiftView$TouchPolicy = iArr;
            try {
                iArr[TouchPolicy.INTERCEPT_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$momo$xeengine$gift$GiftView$TouchPolicy[TouchPolicy.PASS_THROUGH_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$momo$xeengine$gift$GiftView$TouchPolicy[TouchPolicy.PASS_THROUGH_INVALID_AREA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Keep
    public enum TouchPolicy {
        DEFAULT,
        INTERCEPT_ALL,
        PASS_THROUGH_ALL,
        PASS_THROUGH_INVALID_AREA
    }

    public GiftView(Context context) {
        super(context);
        this.touchPolicy = TouchPolicy.DEFAULT;
        this.validTouchAreas = new ArrayList();
        this.enableBackgroundTick = true;
    }

    private int dpToPx(float f) {
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        return (int) (f * f2);
    }

    private boolean isTouchInValidArea(float f, float f2) {
        Iterator<RectF> it = this.validTouchAreas.iterator();
        while (it.hasNext()) {
            if (it.next().contains(f, f2)) {
                return true;
            }
        }
        return false;
    }

    private void sendTouchEventToEngine(MotionEvent motionEvent) {
        IXEventDispatcher engineEventDispatcher = getEngineEventDispatcher();
        if (engineEventDispatcher != null) {
            engineEventDispatcher.handleTouchEvent(motionEvent, getRenderScale(), getRenderScale());
        }
    }

    public void addValidTouchArea(RectF rectF) {
        if (rectF != null) {
            this.validTouchAreas.add(rectF);
        }
    }

    public void clearValidTouchAreas() {
        this.validTouchAreas.clear();
    }

    public SVGAImageView getSVGAView() {
        if (this.svgaImageView == null) {
            SVGAImageView sVGAImageView = new SVGAImageView(getContext());
            this.svgaImageView = sVGAImageView;
            sVGAImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            addView(this.svgaImageView);
        }
        return this.svgaImageView;
    }

    public TouchPolicy getTouchPolicy() {
        return this.touchPolicy;
    }

    public List<RectF> getValidTouchAreas() {
        return new ArrayList(this.validTouchAreas);
    }

    @Override // com.momo.xeengine.game.XEGameView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = C41941.$SwitchMap$com$momo$xeengine$gift$GiftView$TouchPolicy[this.touchPolicy.ordinal()];
        if (i == 1) {
            sendTouchEventToEngine(motionEvent);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTouchEvent(motionEvent);
            }
            if (isTouchInValidArea(motionEvent.getX(), motionEvent.getY())) {
                sendTouchEventToEngine(motionEvent);
                return true;
            }
        }
        return false;
    }

    public void setTouchPolicy(TouchPolicy touchPolicy) {
        this.touchPolicy = touchPolicy;
    }

    public void setupSVGAViewLayout(SizeF sizeF, SVGAPositionType sVGAPositionType, SVGAScaleType sVGAScaleType) {
        SVGAImageView sVGAImageView = this.svgaImageView;
        if (sVGAImageView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sVGAImageView.getLayoutParams();
        if (sVGAScaleType == SVGAScaleType.FILL) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else if (sVGAScaleType == SVGAScaleType.ASPECT_FIT) {
            float fMin = Float.min(getWidth() / sizeF.getWidth(), getHeight() / sizeF.getHeight());
            layoutParams.width = (int) (sizeF.getWidth() * fMin);
            layoutParams.height = (int) (sizeF.getHeight() * fMin);
        } else if (sVGAScaleType == SVGAScaleType.ASPECT_FILL) {
            float fMax = Float.max(getWidth() / sizeF.getWidth(), getHeight() / sizeF.getHeight());
            layoutParams.width = (int) (sizeF.getWidth() * fMax);
            layoutParams.height = (int) (sizeF.getHeight() * fMax);
        } else if (sVGAScaleType == SVGAScaleType.WIDTH) {
            float width = getWidth() / sizeF.getWidth();
            layoutParams.width = (int) (sizeF.getWidth() * width);
            layoutParams.height = (int) (sizeF.getHeight() * width);
        } else {
            layoutParams.width = dpToPx(sizeF.getWidth());
            layoutParams.height = dpToPx(sizeF.getHeight());
        }
        if (sVGAPositionType == SVGAPositionType.TOP) {
            layoutParams.gravity = 49;
        } else if (sVGAPositionType == SVGAPositionType.BOTTOM) {
            layoutParams.gravity = 81;
        } else {
            layoutParams.gravity = 17;
        }
        this.svgaImageView.setLayoutParams(layoutParams);
    }

    @Override // com.momo.xeengine.game.XEGameView
    public void stop() {
        super.stop();
        clearValidTouchAreas();
        SVGAImageView sVGAImageView = this.svgaImageView;
        if (sVGAImageView != null) {
            sVGAImageView.setCallback(null);
            this.svgaImageView.stopAnimation();
        }
    }

    public GiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.touchPolicy = TouchPolicy.DEFAULT;
        this.validTouchAreas = new ArrayList();
        this.enableBackgroundTick = true;
    }

    public GiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.touchPolicy = TouchPolicy.DEFAULT;
        this.validTouchAreas = new ArrayList();
        this.enableBackgroundTick = true;
    }

    public GiftView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.touchPolicy = TouchPolicy.DEFAULT;
        this.validTouchAreas = new ArrayList();
        this.enableBackgroundTick = true;
    }
}

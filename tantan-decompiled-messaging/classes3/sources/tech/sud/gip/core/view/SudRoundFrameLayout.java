package tech.sud.gip.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import tech.sud.gip.C1189R;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SudRoundFrameLayout extends FrameLayout {
    private final boolean leftBottomCorner;
    private final boolean leftTopCorner;
    private final Path path;
    private final float[] radiusArray;
    private final RectF rectF;
    private final boolean rightBottomCorner;
    private final boolean rightTopCorner;

    public SudRoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.radiusArray = fArr;
        this.path = new Path();
        this.rectF = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1189R.styleable.fsm_mgp_RoundFrameLayout, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1189R.styleable.fsm_mgp_RoundFrameLayout_sudTopLeftEnabled, true);
        this.leftTopCorner = z;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C1189R.styleable.fsm_mgp_RoundFrameLayout_sudTopRightEnabled, true);
        this.rightTopCorner = z2;
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C1189R.styleable.fsm_mgp_RoundFrameLayout_sudBottomLeftEnabled, true);
        this.leftBottomCorner = z3;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C1189R.styleable.fsm_mgp_RoundFrameLayout_sudBottomRightEnabled, true);
        this.rightBottomCorner = z4;
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C1189R.styleable.fsm_mgp_RoundFrameLayout_sudCornerRadius, 0.0f);
        if (z) {
            float f = dimension;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (z2) {
            float f2 = dimension;
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (z4) {
            float f3 = dimension;
            fArr[6] = f3;
            fArr[7] = f3;
        }
        if (z3) {
            float f4 = dimension;
            fArr[4] = f4;
            fArr[5] = f4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.leftTopCorner || this.leftBottomCorner || this.rightTopCorner || this.rightBottomCorner) {
            canvas.clipPath(this.path);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.rectF.right = getMeasuredWidth();
        this.rectF.bottom = getMeasuredHeight();
        this.path.reset();
        this.path.addRoundRect(this.rectF, this.radiusArray, Path.Direction.CW);
    }

    public SudRoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SudRoundFrameLayout(Context context) {
        this(context, null);
    }
}

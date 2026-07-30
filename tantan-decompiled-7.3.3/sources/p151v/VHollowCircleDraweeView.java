package p151v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import p153l.qa00;
import p153l.wlj;

/* JADX INFO: loaded from: classes3.dex */
public class VHollowCircleDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Path f210046o;

    /* JADX INFO: renamed from: p */
    public Paint f210047p;

    public VHollowCircleDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
        this.f210046o = new Path();
        this.f210047p = new Paint();
    }

    @Override // p151v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.f210046o.reset();
        this.f210046o.addCircle(width / 2.0f, height / 2.0f, (width / 5.0f) - qa00.m175859d(2.0f), Path.Direction.CW);
        int i = Build.VERSION.SDK_INT;
        Path path = this.f210046o;
        if (i >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.XOR);
        }
        super.onDraw(canvas);
    }

    public VHollowCircleDraweeView(Context context) {
        super(context);
        this.f210046o = new Path();
        this.f210047p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210046o = new Path();
        this.f210047p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210046o = new Path();
        this.f210047p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f210046o = new Path();
        this.f210047p = new Paint();
    }
}

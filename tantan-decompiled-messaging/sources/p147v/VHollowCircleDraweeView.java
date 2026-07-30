package p147v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import p149l.djj;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VHollowCircleDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Path f209124o;

    /* JADX INFO: renamed from: p */
    public Paint f209125p;

    public VHollowCircleDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f209124o = new Path();
        this.f209125p = new Paint();
    }

    @Override // p147v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.f209124o.reset();
        this.f209124o.addCircle(width / 2.0f, height / 2.0f, (width / 5.0f) - t100.m186890d(2.0f), Path.Direction.CW);
        int i = Build.VERSION.SDK_INT;
        Path path = this.f209124o;
        if (i >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.XOR);
        }
        super.onDraw(canvas);
    }

    public VHollowCircleDraweeView(Context context) {
        super(context);
        this.f209124o = new Path();
        this.f209125p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209124o = new Path();
        this.f209125p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209124o = new Path();
        this.f209125p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f209124o = new Path();
        this.f209125p = new Paint();
    }
}

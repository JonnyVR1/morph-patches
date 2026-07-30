package p028v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import l.djj;
import l.kto;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VHollowCircleDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Path f12749o;

    /* JADX INFO: renamed from: p */
    public Paint f12750p;

    public VHollowCircleDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f12749o = new Path();
        this.f12750p = new Paint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028v.VDraweeView
    public void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.f12749o.reset();
        this.f12749o.addCircle(width / 2.0f, height / 2.0f, (width / 5.0f) - t100.d(2.0f), Path.Direction.CW);
        int i = Build.VERSION.SDK_INT;
        Path path = this.f12749o;
        if (i >= 26) {
            kto.a(canvas, path);
        } else {
            canvas.clipPath(path, Region.Op.XOR);
        }
        super.onDraw(canvas);
    }

    public VHollowCircleDraweeView(Context context) {
        super(context);
        this.f12749o = new Path();
        this.f12750p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12749o = new Path();
        this.f12750p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12749o = new Path();
        this.f12750p = new Paint();
    }

    public VHollowCircleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12749o = new Path();
        this.f12750p = new Paint();
    }
}

package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p149l.l6c0;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes4.dex */
public class GroupAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f32317a;

    /* JADX INFO: renamed from: b */
    public Bitmap f32318b;

    /* JADX INFO: renamed from: c */
    public View[] f32319c;

    /* JADX INFO: renamed from: d */
    public View f32320d;

    /* JADX INFO: renamed from: e */
    public VDraweeView[] f32321e;

    /* JADX INFO: renamed from: f */
    public int f32322f;

    /* JADX INFO: renamed from: g */
    public int f32323g;

    public GroupAvatarView(Context context) {
        super(context);
        m49792b();
    }

    /* JADX INFO: renamed from: a */
    public final void m49791a() {
        View viewInflate = o7r.m163037a(getContext()).inflate(l6c0.f126460e0, (ViewGroup) null);
        addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        View[] viewArr = new View[2];
        this.f32319c = viewArr;
        this.f32321e = new VDraweeView[4];
        viewArr[0] = viewInflate.findViewById(y4c0.f196234v);
        this.f32319c[1] = viewInflate.findViewById(y4c0.f196241w);
        this.f32321e[0] = (VDraweeView) viewInflate.findViewById(y4c0.f196206r);
        this.f32321e[1] = (VDraweeView) viewInflate.findViewById(y4c0.f196213s);
        this.f32321e[2] = (VDraweeView) viewInflate.findViewById(y4c0.f196220t);
        this.f32321e[3] = (VDraweeView) viewInflate.findViewById(y4c0.f196227u);
        this.f32320d = viewInflate.findViewById(y4c0.f196010N0);
        m49793c();
    }

    /* JADX INFO: renamed from: b */
    public final void m49792b() {
        m49791a();
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.f32317a = paint;
        paint.setColor(-1);
    }

    /* JADX INFO: renamed from: c */
    public final void m49793c() {
        for (View view : this.f32319c) {
            xdl0.m208344M(view, false);
        }
        for (VDraweeView vDraweeView : this.f32321e) {
            xdl0.m208344M(vDraweeView, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m49794d(List<Picture> list) {
        m49793c();
        boolean zM200296J = vwb.m200296J(list);
        View view = this.f32320d;
        if (zM200296J) {
            xdl0.m208344M(view, true);
            return;
        }
        xdl0.m208344M(view, false);
        int size = list.size();
        if (size > 0) {
            xdl0.m208344M(this.f32319c[0], true);
            xdl0.m208344M(this.f32321e[0], true);
            qib0.f154691G.m102356Z0(this.f32321e[0], list.get(0).cover().profileSmall().formatted());
        }
        if (size > 1) {
            xdl0.m208344M(this.f32321e[1], true);
            qib0.f154691G.m102356Z0(this.f32321e[1], list.get(1).cover().profileSmall().formatted());
        }
        if (size > 2) {
            xdl0.m208344M(this.f32319c[1], true);
            xdl0.m208344M(this.f32321e[2], true);
            qib0.f154691G.m102356Z0(this.f32321e[2], list.get(2).cover().profileSmall().formatted());
        }
        if (size > 3) {
            xdl0.m208344M(this.f32321e[3], true);
            qib0.f154691G.m102356Z0(this.f32321e[3], list.get(3).cover().profileSmall().formatted());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (NullChecker.m81303a(this.f32318b)) {
            canvas.save();
            this.f32317a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(this.f32318b, 0.0f, 0.0f, this.f32317a);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0) {
            return;
        }
        if (this.f32322f == size && this.f32323g == size2) {
            return;
        }
        this.f32322f = size;
        this.f32323g = size2;
        this.f32318b = Bitmap.createBitmap(size, size2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f32318b);
        float f = this.f32322f;
        float f2 = this.f32323g;
        int i3 = t100.f167260i;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, i3, i3, this.f32317a);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49792b();
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49792b();
    }
}

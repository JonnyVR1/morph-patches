package com.p000p1.mobile.putong.core.p001ui.messages.view;

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
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.l6c0;
import l.o7r;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GroupAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f139a;

    /* JADX INFO: renamed from: b */
    public Bitmap f140b;

    /* JADX INFO: renamed from: c */
    public View[] f141c;

    /* JADX INFO: renamed from: d */
    public View f142d;

    /* JADX INFO: renamed from: e */
    public VDraweeView[] f143e;

    /* JADX INFO: renamed from: f */
    public int f144f;

    /* JADX INFO: renamed from: g */
    public int f145g;

    public GroupAvatarView(Context context) {
        super(context);
        m210b();
    }

    /* JADX INFO: renamed from: a */
    public final void m209a() {
        View viewInflate = o7r.a(getContext()).inflate(l6c0.e0, (ViewGroup) null);
        addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        View[] viewArr = new View[2];
        this.f141c = viewArr;
        this.f143e = new VDraweeView[4];
        viewArr[0] = viewInflate.findViewById(y4c0.v);
        this.f141c[1] = viewInflate.findViewById(y4c0.w);
        this.f143e[0] = (VDraweeView) viewInflate.findViewById(y4c0.r);
        this.f143e[1] = (VDraweeView) viewInflate.findViewById(y4c0.s);
        this.f143e[2] = (VDraweeView) viewInflate.findViewById(y4c0.t);
        this.f143e[3] = (VDraweeView) viewInflate.findViewById(y4c0.u);
        this.f142d = viewInflate.findViewById(y4c0.N0);
        m211c();
    }

    /* JADX INFO: renamed from: b */
    public final void m210b() {
        m209a();
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.f139a = paint;
        paint.setColor(-1);
    }

    /* JADX INFO: renamed from: c */
    public final void m211c() {
        for (View view : this.f141c) {
            xdl0.M(view, false);
        }
        for (View view2 : this.f143e) {
            xdl0.M(view2, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m212d(List<Picture> list) {
        m211c();
        boolean zJ = vwb.J(list);
        View view = this.f142d;
        if (zJ) {
            xdl0.M(view, true);
            return;
        }
        xdl0.M(view, false);
        int size = list.size();
        if (size > 0) {
            xdl0.M(this.f141c[0], true);
            xdl0.M(this.f143e[0], true);
            qib0.G.Z0(this.f143e[0], list.get(0).cover().profileSmall().formatted());
        }
        if (size > 1) {
            xdl0.M(this.f143e[1], true);
            qib0.G.Z0(this.f143e[1], list.get(1).cover().profileSmall().formatted());
        }
        if (size > 2) {
            xdl0.M(this.f141c[1], true);
            xdl0.M(this.f143e[2], true);
            qib0.G.Z0(this.f143e[2], list.get(2).cover().profileSmall().formatted());
        }
        if (size > 3) {
            xdl0.M(this.f143e[3], true);
            qib0.G.Z0(this.f143e[3], list.get(3).cover().profileSmall().formatted());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (NullChecker.a(this.f140b)) {
            canvas.save();
            this.f139a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(this.f140b, 0.0f, 0.0f, this.f139a);
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
        if (this.f144f == size && this.f145g == size2) {
            return;
        }
        this.f144f = size;
        this.f145g = size2;
        this.f140b = Bitmap.createBitmap(size, size2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f140b);
        float f = this.f144f;
        float f2 = this.f145g;
        int i3 = t100.i;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, i3, i3, this.f139a);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m210b();
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m210b();
    }
}

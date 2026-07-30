package com.p051p1.mobile.putong.core.p058ui.messages.view;

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
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.edc0;
import p153l.jyb;
import p153l.p9r;
import p153l.qa00;
import p153l.qec0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class GroupAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f33165a;

    /* JADX INFO: renamed from: b */
    public Bitmap f33166b;

    /* JADX INFO: renamed from: c */
    public View[] f33167c;

    /* JADX INFO: renamed from: d */
    public View f33168d;

    /* JADX INFO: renamed from: e */
    public VDraweeView[] f33169e;

    /* JADX INFO: renamed from: f */
    public int f33170f;

    /* JADX INFO: renamed from: g */
    public int f33171g;

    public GroupAvatarView(Context context) {
        super(context);
        m50975b();
    }

    /* JADX INFO: renamed from: a */
    public final void m50974a() {
        View viewInflate = p9r.m171370a(getContext()).inflate(qec0.f157016e0, (ViewGroup) null);
        addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        View[] viewArr = new View[2];
        this.f33167c = viewArr;
        this.f33169e = new VDraweeView[4];
        viewArr[0] = viewInflate.findViewById(edc0.f93469v);
        this.f33167c[1] = viewInflate.findViewById(edc0.f93476w);
        this.f33169e[0] = (VDraweeView) viewInflate.findViewById(edc0.f93441r);
        this.f33169e[1] = (VDraweeView) viewInflate.findViewById(edc0.f93448s);
        this.f33169e[2] = (VDraweeView) viewInflate.findViewById(edc0.f93455t);
        this.f33169e[3] = (VDraweeView) viewInflate.findViewById(edc0.f93462u);
        this.f33168d = viewInflate.findViewById(edc0.f93245N0);
        m50976c();
    }

    /* JADX INFO: renamed from: b */
    public final void m50975b() {
        m50974a();
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.f33165a = paint;
        paint.setColor(-1);
    }

    /* JADX INFO: renamed from: c */
    public final void m50976c() {
        for (View view : this.f33167c) {
            bnl0.m105524M(view, false);
        }
        for (VDraweeView vDraweeView : this.f33169e) {
            bnl0.m105524M(vDraweeView, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m50977d(List<Picture> list) {
        m50976c();
        boolean zM147479J = jyb.m147479J(list);
        View view = this.f33168d;
        if (zM147479J) {
            bnl0.m105524M(view, true);
            return;
        }
        bnl0.m105524M(view, false);
        int size = list.size();
        if (size > 0) {
            bnl0.m105524M(this.f33167c[0], true);
            bnl0.m105524M(this.f33169e[0], true);
            uqb0.f180374G.m127140Z0(this.f33169e[0], list.get(0).cover().profileSmall().formatted());
        }
        if (size > 1) {
            bnl0.m105524M(this.f33169e[1], true);
            uqb0.f180374G.m127140Z0(this.f33169e[1], list.get(1).cover().profileSmall().formatted());
        }
        if (size > 2) {
            bnl0.m105524M(this.f33167c[1], true);
            bnl0.m105524M(this.f33169e[2], true);
            uqb0.f180374G.m127140Z0(this.f33169e[2], list.get(2).cover().profileSmall().formatted());
        }
        if (size > 3) {
            bnl0.m105524M(this.f33169e[3], true);
            uqb0.f180374G.m127140Z0(this.f33169e[3], list.get(3).cover().profileSmall().formatted());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (NullChecker.m82486a(this.f33166b)) {
            canvas.save();
            this.f33165a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(this.f33166b, 0.0f, 0.0f, this.f33165a);
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
        if (this.f33170f == size && this.f33171g == size2) {
            return;
        }
        this.f33170f = size;
        this.f33171g = size2;
        this.f33166b = Bitmap.createBitmap(size, size2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f33166b);
        float f = this.f33170f;
        float f2 = this.f33171g;
        int i3 = qa00.f156322i;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, i3, i3, this.f33165a);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50975b();
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50975b();
    }
}

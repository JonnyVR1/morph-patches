package com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.base.data.BLiveBeautyItem;
import java.util.Locale;
import l.hpd0;
import l.t100;
import l.twr;
import l.ypv;
import p002l.bv2;
import p002l.lu2;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BeautyItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f4638a;

    /* JADX INFO: renamed from: b */
    public VText f4639b;

    /* JADX INFO: renamed from: c */
    public VText f4640c;

    /* JADX INFO: renamed from: d */
    public boolean f4641d;

    /* JADX INFO: renamed from: e */
    public final Paint f4642e;

    public BeautyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4641d = false;
        Paint paint = new Paint(1);
        this.f4642e = paint;
        paint.setColor(-50688);
        paint.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: a */
    public final void m5694a(View view) {
        bv2.m10626a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5695b(BLiveBeautyItem bLiveBeautyItem) {
        this.f4639b.setText(bLiveBeautyItem.name);
        this.f4640c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf((int) (bLiveBeautyItem.getValue() * 100.0f))));
        this.f4641d = bLiveBeautyItem.isSuggested && ((Boolean) new hpd0(twr.c(bLiveBeautyItem.id, ypv.a.D0()), Boolean.TRUE).get()).booleanValue();
        this.f4638a.setImageResource(lu2.m17462a(bLiveBeautyItem.id));
        this.f4638a.setSelected(bLiveBeautyItem.isSelected);
        this.f4639b.setSelected(bLiveBeautyItem.isSelected);
        this.f4640c.setSelected(bLiveBeautyItem.isSelected || ((double) Math.abs(bLiveBeautyItem.getValue() - bLiveBeautyItem.getDefaultBeautyValue())) > 1.0E-4d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4641d) {
            float x = this.f4638a.getX() + this.f4638a.getMeasuredWidth();
            int i = t100.d;
            canvas.drawCircle((int) (x + i), i, i, this.f4642e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5694a(this);
    }

    public BeautyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyItemView(Context context) {
        this(context, null);
    }
}

package com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import java.util.Locale;
import p151v.VImage;
import p151v.VText;
import p153l.bv2;
import p153l.jxd0;
import p153l.qa00;
import p153l.rv2;
import p153l.uyr;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class BeautyItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f49444a;

    /* JADX INFO: renamed from: b */
    public VText f49445b;

    /* JADX INFO: renamed from: c */
    public VText f49446c;

    /* JADX INFO: renamed from: d */
    public boolean f49447d;

    /* JADX INFO: renamed from: e */
    public final Paint f49448e;

    public BeautyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49447d = false;
        Paint paint = new Paint(1);
        this.f49448e = paint;
        paint.setColor(-50688);
        paint.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: a */
    public final void m73404a(View view) {
        rv2.m183250a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73405b(BLiveBeautyItem bLiveBeautyItem) {
        this.f49445b.setText(bLiveBeautyItem.name);
        this.f49446c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf((int) (bLiveBeautyItem.getValue() * 100.0f))));
        this.f49447d = bLiveBeautyItem.isSuggested && new jxd0(uyr.m198692c(bLiveBeautyItem.f45185id, zrv.f205799a.m207631D0()), Boolean.TRUE).get().booleanValue();
        this.f49444a.setImageResource(bv2.m106550a(bLiveBeautyItem.f45185id));
        this.f49444a.setSelected(bLiveBeautyItem.isSelected);
        this.f49445b.setSelected(bLiveBeautyItem.isSelected);
        this.f49446c.setSelected(bLiveBeautyItem.isSelected || ((double) Math.abs(bLiveBeautyItem.getValue() - bLiveBeautyItem.getDefaultBeautyValue())) > 1.0E-4d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f49447d) {
            float x = this.f49444a.getX() + this.f49444a.getMeasuredWidth();
            int i = qa00.f156317d;
            canvas.drawCircle((int) (x + i), i, i, this.f49448e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73404a(this);
    }

    public BeautyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyItemView(Context context) {
        this(context, null);
    }
}

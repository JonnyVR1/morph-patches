package com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import java.util.Locale;
import p147v.VImage;
import p147v.VText;
import p149l.bv2;
import p149l.hpd0;
import p149l.lu2;
import p149l.t100;
import p149l.twr;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class BeautyItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f48596a;

    /* JADX INFO: renamed from: b */
    public VText f48597b;

    /* JADX INFO: renamed from: c */
    public VText f48598c;

    /* JADX INFO: renamed from: d */
    public boolean f48599d;

    /* JADX INFO: renamed from: e */
    public final Paint f48600e;

    public BeautyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48599d = false;
        Paint paint = new Paint(1);
        this.f48600e = paint;
        paint.setColor(-50688);
        paint.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: a */
    public final void m72221a(View view) {
        bv2.m104009a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72222b(BLiveBeautyItem bLiveBeautyItem) {
        this.f48597b.setText(bLiveBeautyItem.name);
        this.f48598c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf((int) (bLiveBeautyItem.getValue() * 100.0f))));
        this.f48599d = bLiveBeautyItem.isSuggested && new hpd0(twr.m190886c(bLiveBeautyItem.f44337id, ypv.f199493a.m199309D0()), Boolean.TRUE).get().booleanValue();
        this.f48596a.setImageResource(lu2.m151764a(bLiveBeautyItem.f44337id));
        this.f48596a.setSelected(bLiveBeautyItem.isSelected);
        this.f48597b.setSelected(bLiveBeautyItem.isSelected);
        this.f48598c.setSelected(bLiveBeautyItem.isSelected || ((double) Math.abs(bLiveBeautyItem.getValue() - bLiveBeautyItem.getDefaultBeautyValue())) > 1.0E-4d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f48599d) {
            float x = this.f48596a.getX() + this.f48596a.getMeasuredWidth();
            int i = t100.f167255d;
            canvas.drawCircle((int) (x + i), i, i, this.f48600e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72221a(this);
    }

    public BeautyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyItemView(Context context) {
        this(context, null);
    }
}

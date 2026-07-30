package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import org.slf4j.Marker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.t100;
import p149l.u4c0;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileIntegrityOptView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f34081c;

    /* JADX INFO: renamed from: d */
    public VText f34082d;

    /* JADX INFO: renamed from: e */
    public VText f34083e;

    /* JADX INFO: renamed from: f */
    public VText f34084f;

    /* JADX INFO: renamed from: g */
    public Paint f34085g;

    /* JADX INFO: renamed from: h */
    public Paint f34086h;

    /* JADX INFO: renamed from: i */
    public int f34087i;

    /* JADX INFO: renamed from: j */
    public int f34088j;

    /* JADX INFO: renamed from: k */
    public int f34089k;

    /* JADX INFO: renamed from: l */
    public int f34090l;

    /* JADX INFO: renamed from: m */
    public int f34091m;

    /* JADX INFO: renamed from: n */
    public int f34092n;

    public ProfileIntegrityOptView(Context context) {
        super(context);
        this.f34089k = t100.m186890d(20.0f);
        this.f34090l = t100.m186890d(20.0f);
        this.f34091m = t100.m186890d(16.0f);
        this.f34092n = t100.m186890d(3.0f);
    }

    /* JADX INFO: renamed from: P */
    public void m52883P(int i, int i2, String str) {
        m52884Q(i, i2, str, "");
    }

    /* JADX INFO: renamed from: Q */
    public void m52884Q(int i, int i2, String str, String str2) {
        this.f34087i = i;
        this.f34088j = i2;
        VImage vImage = this.f34081c;
        if (i == i2) {
            xdl0.m208344M(vImage, true);
            this.f34082d.setText(String.format("资料完整度%s%%", Integer.valueOf(i2)));
            xdl0.m208345M0(this.f34083e, false);
            xdl0.m208345M0(this.f34084f, false);
            return;
        }
        xdl0.m208345M0(vImage, false);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f34082d;
        if (zIsEmpty) {
            vText.setText(String.format("资料完整度%s%%", Integer.valueOf(i)));
        } else {
            vText.setText(String.format("资料完整度%s%%，" + str, Integer.valueOf(i)));
        }
        this.f34083e.setText(Marker.ANY_NON_NULL_MARKER + (i2 - i) + "%");
        this.f34084f.setText(str2);
        xdl0.m208345M0(this.f34084f, true);
        xdl0.m208345M0(this.f34083e, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f34087i == this.f34088j) {
            return;
        }
        canvas.save();
        canvas.rotate(-90.0f, (this.f34091m / 2) + this.f34089k, this.f34090l / 2);
        int i = this.f34091m;
        canvas.drawCircle((i / 2) + this.f34089k, this.f34090l / 2, (i / 2) - this.f34092n, this.f34085g);
        int i2 = this.f34089k;
        int i3 = this.f34092n;
        RectF rectF = new RectF(i2 + i3, i3 + t100.m186890d(2.0f), (this.f34089k + this.f34091m) - this.f34092n, (this.f34090l - t100.m186890d(2.0f)) - this.f34092n);
        int i4 = this.f34087i;
        canvas.drawArc(rectF, 0.0f, i4 == 0 ? 36.0f : (i4 / this.f34088j) * 360.0f, false, this.f34086h);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f34081c = (VImage) findViewById(u4c0.f173824G5);
        this.f34082d = (VText) findViewById(u4c0.f174268ge);
        this.f34083e = (VText) findViewById(u4c0.f174490u);
        this.f34084f = (VText) findViewById(u4c0.f174207d4);
        Paint paint = new Paint();
        this.f34085g = paint;
        paint.setColor(CoreModule.f17544b.getResources().getColor(w0c0.f183870n0));
        Paint paint2 = this.f34085g;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f34085g.setStrokeWidth(t100.m186890d(3.2f));
        this.f34085g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f34086h = paint3;
        paint3.setColor(Color.parseColor("#FE7E1D"));
        this.f34086h.setStyle(style);
        this.f34086h.setStrokeWidth(t100.m186890d(3.2f));
        this.f34086h.setAntiAlias(true);
    }

    public ProfileIntegrityOptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34089k = t100.m186890d(20.0f);
        this.f34090l = t100.m186890d(20.0f);
        this.f34091m = t100.m186890d(16.0f);
        this.f34092n = t100.m186890d(3.0f);
    }

    public ProfileIntegrityOptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34089k = t100.m186890d(20.0f);
        this.f34090l = t100.m186890d(20.0f);
        this.f34091m = t100.m186890d(16.0f);
        this.f34092n = t100.m186890d(3.0f);
    }
}

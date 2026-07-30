package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import org.slf4j.Marker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileIntegrityOptView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f34929c;

    /* JADX INFO: renamed from: d */
    public VText f34930d;

    /* JADX INFO: renamed from: e */
    public VText f34931e;

    /* JADX INFO: renamed from: f */
    public VText f34932f;

    /* JADX INFO: renamed from: g */
    public Paint f34933g;

    /* JADX INFO: renamed from: h */
    public Paint f34934h;

    /* JADX INFO: renamed from: i */
    public int f34935i;

    /* JADX INFO: renamed from: j */
    public int f34936j;

    /* JADX INFO: renamed from: k */
    public int f34937k;

    /* JADX INFO: renamed from: l */
    public int f34938l;

    /* JADX INFO: renamed from: m */
    public int f34939m;

    /* JADX INFO: renamed from: n */
    public int f34940n;

    public ProfileIntegrityOptView(Context context) {
        super(context);
        this.f34937k = qa00.m175859d(20.0f);
        this.f34938l = qa00.m175859d(20.0f);
        this.f34939m = qa00.m175859d(16.0f);
        this.f34940n = qa00.m175859d(3.0f);
    }

    /* JADX INFO: renamed from: P */
    public void m54066P(int i, int i2, String str) {
        m54067Q(i, i2, str, "");
    }

    /* JADX INFO: renamed from: Q */
    public void m54067Q(int i, int i2, String str, String str2) {
        this.f34935i = i;
        this.f34936j = i2;
        VImage vImage = this.f34929c;
        if (i == i2) {
            bnl0.m105524M(vImage, true);
            this.f34930d.setText(String.format("资料完整度%s%%", Integer.valueOf(i2)));
            bnl0.m105525M0(this.f34931e, false);
            bnl0.m105525M0(this.f34932f, false);
            return;
        }
        bnl0.m105525M0(vImage, false);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f34930d;
        if (zIsEmpty) {
            vText.setText(String.format("资料完整度%s%%", Integer.valueOf(i)));
        } else {
            vText.setText(String.format("资料完整度%s%%，" + str, Integer.valueOf(i)));
        }
        this.f34931e.setText(Marker.ANY_NON_NULL_MARKER + (i2 - i) + "%");
        this.f34932f.setText(str2);
        bnl0.m105525M0(this.f34932f, true);
        bnl0.m105525M0(this.f34931e, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f34935i == this.f34936j) {
            return;
        }
        canvas.save();
        canvas.rotate(-90.0f, (this.f34939m / 2) + this.f34937k, this.f34938l / 2);
        int i = this.f34939m;
        canvas.drawCircle((i / 2) + this.f34937k, this.f34938l / 2, (i / 2) - this.f34940n, this.f34933g);
        int i2 = this.f34937k;
        int i3 = this.f34940n;
        RectF rectF = new RectF(i2 + i3, i3 + qa00.m175859d(2.0f), (this.f34937k + this.f34939m) - this.f34940n, (this.f34938l - qa00.m175859d(2.0f)) - this.f34940n);
        int i4 = this.f34935i;
        canvas.drawArc(rectF, 0.0f, i4 == 0 ? 36.0f : (i4 / this.f34936j) * 360.0f, false, this.f34934h);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f34929c = (VImage) findViewById(adc0.f69946I5);
        this.f34930d = (VText) findViewById(adc0.f70409je);
        this.f34931e = (VText) findViewById(adc0.f70581u);
        this.f34932f = (VText) findViewById(adc0.f70332f4);
        Paint paint = new Paint();
        this.f34933g = paint;
        paint.setColor(CoreModule.f18263b.getResources().getColor(c9c0.f80443o0));
        Paint paint2 = this.f34933g;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f34933g.setStrokeWidth(qa00.m175859d(3.2f));
        this.f34933g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f34934h = paint3;
        paint3.setColor(Color.parseColor("#FE7E1D"));
        this.f34934h.setStyle(style);
        this.f34934h.setStrokeWidth(qa00.m175859d(3.2f));
        this.f34934h.setAntiAlias(true);
    }

    public ProfileIntegrityOptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34937k = qa00.m175859d(20.0f);
        this.f34938l = qa00.m175859d(20.0f);
        this.f34939m = qa00.m175859d(16.0f);
        this.f34940n = qa00.m175859d(3.0f);
    }

    public ProfileIntegrityOptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34937k = qa00.m175859d(20.0f);
        this.f34938l = qa00.m175859d(20.0f);
        this.f34939m = qa00.m175859d(16.0f);
        this.f34940n = qa00.m175859d(3.0f);
    }
}

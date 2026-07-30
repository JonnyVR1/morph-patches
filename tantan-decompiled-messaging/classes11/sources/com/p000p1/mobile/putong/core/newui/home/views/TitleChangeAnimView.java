package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import l.t100;
import l.u4c0;
import p009l.sri0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TitleChangeAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f2804a;

    /* JADX INFO: renamed from: b */
    public int f2805b;

    /* JADX INFO: renamed from: c */
    public View f2806c;

    /* JADX INFO: renamed from: d */
    public TextView f2807d;

    /* JADX INFO: renamed from: e */
    public TextView f2808e;

    /* JADX INFO: renamed from: f */
    public TextView f2809f;

    /* JADX INFO: renamed from: g */
    public TextView f2810g;

    /* JADX INFO: renamed from: h */
    public ImageView f2811h;

    /* JADX INFO: renamed from: i */
    public View f2812i;

    /* JADX INFO: renamed from: j */
    public C0229a f2813j;

    /* JADX INFO: renamed from: k */
    public TextPaint f2814k;

    /* JADX INFO: renamed from: l */
    public sri0 f2815l;

    /* JADX INFO: renamed from: m */
    public boolean f2816m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.TitleChangeAnimView$a */
    public class C0229a {

        /* JADX INFO: renamed from: a */
        public int f2817a = 0;

        /* JADX INFO: renamed from: b */
        public boolean f2818b = false;

        /* JADX INFO: renamed from: c */
        public C0230b f2819c;

        /* JADX INFO: renamed from: d */
        public C0230b f2820d;

        /* JADX INFO: renamed from: e */
        public C0230b f2821e;

        /* JADX INFO: renamed from: f */
        public C0230b f2822f;

        public C0229a() {
            this.f2819c = TitleChangeAnimView.this.new C0230b();
            this.f2820d = TitleChangeAnimView.this.new C0230b();
            this.f2821e = TitleChangeAnimView.this.new C0230b();
            this.f2822f = TitleChangeAnimView.this.new C0230b();
        }

        /* JADX INFO: renamed from: a */
        public void m3241a(int i) {
            this.f2819c.m3242a(i);
            this.f2822f.m3242a(i);
            this.f2820d.m3242a(i);
            this.f2821e.m3242a(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.TitleChangeAnimView$b */
    public class C0230b {

        /* JADX INFO: renamed from: a */
        public int f2824a;

        /* JADX INFO: renamed from: b */
        public int f2825b;

        /* JADX INFO: renamed from: c */
        public int f2826c;

        /* JADX INFO: renamed from: d */
        public int f2827d;

        /* JADX INFO: renamed from: e */
        public int f2828e;

        /* JADX INFO: renamed from: f */
        public int f2829f;

        /* JADX INFO: renamed from: j */
        public int f2833j;

        /* JADX INFO: renamed from: k */
        public int f2834k;

        /* JADX INFO: renamed from: l */
        public int f2835l;

        /* JADX INFO: renamed from: g */
        public float f2830g = 1.0f;

        /* JADX INFO: renamed from: h */
        public float f2831h = 0.0f;

        /* JADX INFO: renamed from: i */
        public float f2832i = 1.0f;

        /* JADX INFO: renamed from: m */
        public boolean f2836m = false;

        public C0230b() {
        }

        /* JADX INFO: renamed from: a */
        public void m3242a(int i) {
            this.f2826c = this.f2824a + ((this.f2825b * i) / 100);
            this.f2829f = this.f2827d + ((this.f2828e * i) / 100);
            if (this.f2836m) {
                TitleChangeAnimView titleChangeAnimView = TitleChangeAnimView.this;
                int i2 = this.f2833j;
                this.f2835l = titleChangeAnimView.m3236d(i2, this.f2834k + i2, i);
            }
            this.f2832i = this.f2830g + ((this.f2831h * i) / 100.0f);
        }

        /* JADX INFO: renamed from: b */
        public C0230b m3243b(float f, float f2) {
            this.f2830g = f;
            this.f2831h = f2;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0230b m3244c(int i, int i2, int i3, int i4) {
            this.f2836m = false;
            this.f2824a = i;
            this.f2825b = i2;
            this.f2827d = i3;
            this.f2828e = i4;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0230b m3245d(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2836m = true;
            this.f2833j = i5;
            this.f2834k = i6;
            this.f2824a = i;
            this.f2825b = i2;
            this.f2827d = i3;
            this.f2828e = i4;
            return this;
        }
    }

    public TitleChangeAnimView(Context context) {
        super(context);
        this.f2804a = -10263709;
        this.f2805b = -1;
        m3237e();
    }

    /* JADX INFO: renamed from: b */
    public final int m3234b(String str) {
        return (int) this.f2814k.measureText(str, 0, str.length());
    }

    /* JADX INFO: renamed from: c */
    public final int m3235c(int i) {
        return t100.d(i);
    }

    /* JADX INFO: renamed from: d */
    public final int m3236d(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: e */
    public final void m3237e() {
        TextPaint textPaint = new TextPaint();
        this.f2814k = textPaint;
        textPaint.setTextSize(m3235c(13));
        this.f2813j = new C0229a();
    }

    /* JADX INFO: renamed from: f */
    public void m3238f() {
        int iM3235c = m3235c(3);
        int iM3235c2 = m3235c(2);
        sri0 sri0Var = this.f2815l;
        if (sri0Var.f20438d) {
            this.f2807d.setText(sri0Var.f20437c);
            this.f2808e.setText(this.f2815l.f20435a);
            this.f2809f.setText(this.f2815l.f20436b);
            this.f2806c.setVisibility(0);
            int iM3234b = m3234b(this.f2815l.f20435a) + m3235c(12) + m3235c(15);
            int iM3234b2 = m3234b(this.f2815l.f20437c) + m3235c(12) + m3235c(10) + m3235c(18);
            int iM3234b3 = m3234b(this.f2815l.f20436b) + m3235c(12) + m3235c(15);
            this.f2813j.f2819c.m3244c(0, iM3234b - iM3235c, iM3234b2 + iM3235c2, ((iM3235c + iM3234b3) - iM3234b2) - iM3235c2).m3242a(this.f2813j.f2817a);
            int i = this.f2804a;
            this.f2813j.f2822f.m3245d(iM3234b2, iM3234b - iM3234b2, iM3234b3, 0, i, this.f2805b - i).m3242a(this.f2813j.f2817a);
            C0230b c0230b = this.f2813j.f2820d;
            int i2 = this.f2805b;
            c0230b.m3245d(0, 0, iM3234b, 0, i2, this.f2804a - i2).m3243b(-1.0f, 2.0f).m3242a(this.f2813j.f2817a);
            this.f2813j.f2821e.m3245d(0, 0, iM3234b2, 0, this.f2805b, 0).m3243b(1.0f, -2.0f).m3242a(this.f2813j.f2817a);
        } else {
            this.f2808e.setText(sri0Var.f20435a);
            this.f2809f.setText(this.f2815l.f20436b);
            int iM3234b4 = m3234b(this.f2815l.f20435a) + m3235c(12) + m3235c(15);
            int iM3234b5 = m3234b(this.f2815l.f20436b) + m3235c(12) + m3235c(15);
            this.f2813j.f2819c.m3244c(0, iM3234b4 - iM3235c, iM3235c + iM3234b4, iM3234b5 - iM3234b4).m3242a(this.f2813j.f2817a);
            C0230b c0230b2 = this.f2813j.f2820d;
            int i3 = this.f2805b;
            c0230b2.m3245d(0, 0, iM3234b4, 0, i3, this.f2804a - i3).m3243b(1.0f, 0.0f).m3242a(this.f2813j.f2817a);
            C0230b c0230b3 = this.f2813j.f2822f;
            int i4 = this.f2804a;
            c0230b3.m3245d(iM3234b4, 0, iM3234b5, 0, i4, this.f2805b - i4).m3242a(this.f2813j.f2817a);
            this.f2806c.setVisibility(8);
        }
        m3239g();
    }

    /* JADX INFO: renamed from: g */
    public final void m3239g() {
        m3240h(this.f2812i, this.f2813j.f2819c);
        m3240h(this.f2809f, this.f2813j.f2822f);
        m3240h(this.f2808e, this.f2813j.f2820d);
        m3240h(this.f2806c, this.f2813j.f2821e);
    }

    public View getRightView() {
        return this.f2809f;
    }

    /* JADX INFO: renamed from: h */
    public final void m3240h(View view, C0230b c0230b) {
        ViewGroup viewGroup;
        int childCount;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = c0230b.f2829f;
        layoutParams.leftMargin = c0230b.f2826c;
        if (c0230b.f2836m && (view instanceof TextView)) {
            ((TextView) view).setTextColor(c0230b.f2835l);
        } else if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(c0230b.f2835l);
                }
            }
        }
        view.setLayoutParams(layoutParams);
        view.setAlpha(Math.min(1.0f, Math.max(0.0f, c0230b.f2832i)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2807d = (TextView) findViewById(u4c0.O6);
        this.f2808e = (TextView) findViewById(u4c0.P6);
        this.f2806c = findViewById(u4c0.N6);
        this.f2809f = (TextView) findViewById(u4c0.Eb);
        this.f2812i = findViewById(u4c0.q0);
        this.f2810g = (TextView) findViewById(u4c0.Fb);
        this.f2811h = (ImageView) findViewById(u4c0.qb);
        sri0 sri0Var = new sri0();
        this.f2815l = sri0Var;
        sri0Var.f20435a = "滑卡";
        sri0Var.f20436b = "快聊";
        sri0Var.f20438d = false;
        C0229a c0229a = new C0229a();
        this.f2813j = c0229a;
        c0229a.f2818b = this.f2815l.f20438d;
        m3238f();
    }

    public void setAnimProgress(int i) {
        C0229a c0229a = this.f2813j;
        c0229a.f2817a = i;
        c0229a.m3241a(i);
        m3239g();
    }

    public void setRedDot(boolean z) {
        this.f2816m = z;
    }

    public void setTitleFillInfo(sri0 sri0Var) {
        this.f2815l = sri0Var;
        if (!TextUtils.isEmpty(sri0Var.f20437c) && this.f2815l.f20437c.length() > 4) {
            sri0 sri0Var2 = this.f2815l;
            sri0Var2.f20437c = sri0Var2.f20437c.substring(0, 4).concat("…");
        }
        m3238f();
    }

    public TitleChangeAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2804a = -10263709;
        this.f2805b = -1;
        m3237e();
    }

    public TitleChangeAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2804a = -10263709;
        this.f2805b = -1;
        m3237e();
    }
}

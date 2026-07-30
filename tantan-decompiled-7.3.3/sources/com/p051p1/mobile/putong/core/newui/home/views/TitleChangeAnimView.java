package com.p051p1.mobile.putong.core.newui.home.views;

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
import p153l.adc0;
import p153l.qa00;
import p153l.v0j0;

/* JADX INFO: loaded from: classes11.dex */
public class TitleChangeAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f24768a;

    /* JADX INFO: renamed from: b */
    public int f24769b;

    /* JADX INFO: renamed from: c */
    public View f24770c;

    /* JADX INFO: renamed from: d */
    public TextView f24771d;

    /* JADX INFO: renamed from: e */
    public TextView f24772e;

    /* JADX INFO: renamed from: f */
    public TextView f24773f;

    /* JADX INFO: renamed from: g */
    public TextView f24774g;

    /* JADX INFO: renamed from: h */
    public ImageView f24775h;

    /* JADX INFO: renamed from: i */
    public View f24776i;

    /* JADX INFO: renamed from: j */
    public C8216a f24777j;

    /* JADX INFO: renamed from: k */
    public TextPaint f24778k;

    /* JADX INFO: renamed from: l */
    public v0j0 f24779l;

    /* JADX INFO: renamed from: m */
    public boolean f24780m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.TitleChangeAnimView$a */
    public class C8216a {

        /* JADX INFO: renamed from: a */
        public int f24781a = 0;

        /* JADX INFO: renamed from: b */
        public boolean f24782b = false;

        /* JADX INFO: renamed from: c */
        public C8217b f24783c;

        /* JADX INFO: renamed from: d */
        public C8217b f24784d;

        /* JADX INFO: renamed from: e */
        public C8217b f24785e;

        /* JADX INFO: renamed from: f */
        public C8217b f24786f;

        public C8216a() {
            this.f24783c = TitleChangeAnimView.this.new C8217b();
            this.f24784d = TitleChangeAnimView.this.new C8217b();
            this.f24785e = TitleChangeAnimView.this.new C8217b();
            this.f24786f = TitleChangeAnimView.this.new C8217b();
        }

        /* JADX INFO: renamed from: a */
        public void m40226a(int i) {
            this.f24783c.m40227a(i);
            this.f24786f.m40227a(i);
            this.f24784d.m40227a(i);
            this.f24785e.m40227a(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.TitleChangeAnimView$b */
    public class C8217b {

        /* JADX INFO: renamed from: a */
        public int f24788a;

        /* JADX INFO: renamed from: b */
        public int f24789b;

        /* JADX INFO: renamed from: c */
        public int f24790c;

        /* JADX INFO: renamed from: d */
        public int f24791d;

        /* JADX INFO: renamed from: e */
        public int f24792e;

        /* JADX INFO: renamed from: f */
        public int f24793f;

        /* JADX INFO: renamed from: j */
        public int f24797j;

        /* JADX INFO: renamed from: k */
        public int f24798k;

        /* JADX INFO: renamed from: l */
        public int f24799l;

        /* JADX INFO: renamed from: g */
        public float f24794g = 1.0f;

        /* JADX INFO: renamed from: h */
        public float f24795h = 0.0f;

        /* JADX INFO: renamed from: i */
        public float f24796i = 1.0f;

        /* JADX INFO: renamed from: m */
        public boolean f24800m = false;

        public C8217b() {
        }

        /* JADX INFO: renamed from: a */
        public void m40227a(int i) {
            this.f24790c = this.f24788a + ((this.f24789b * i) / 100);
            this.f24793f = this.f24791d + ((this.f24792e * i) / 100);
            if (this.f24800m) {
                TitleChangeAnimView titleChangeAnimView = TitleChangeAnimView.this;
                int i2 = this.f24797j;
                this.f24799l = titleChangeAnimView.m40221d(i2, this.f24798k + i2, i);
            }
            this.f24796i = this.f24794g + ((this.f24795h * i) / 100.0f);
        }

        /* JADX INFO: renamed from: b */
        public C8217b m40228b(float f, float f2) {
            this.f24794g = f;
            this.f24795h = f2;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C8217b m40229c(int i, int i2, int i3, int i4) {
            this.f24800m = false;
            this.f24788a = i;
            this.f24789b = i2;
            this.f24791d = i3;
            this.f24792e = i4;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C8217b m40230d(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f24800m = true;
            this.f24797j = i5;
            this.f24798k = i6;
            this.f24788a = i;
            this.f24789b = i2;
            this.f24791d = i3;
            this.f24792e = i4;
            return this;
        }
    }

    public TitleChangeAnimView(Context context) {
        super(context);
        this.f24768a = -10263709;
        this.f24769b = -1;
        m40222e();
    }

    /* JADX INFO: renamed from: b */
    public final int m40219b(String str) {
        return (int) this.f24778k.measureText(str, 0, str.length());
    }

    /* JADX INFO: renamed from: c */
    public final int m40220c(int i) {
        return qa00.m175859d(i);
    }

    /* JADX INFO: renamed from: d */
    public final int m40221d(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: e */
    public final void m40222e() {
        TextPaint textPaint = new TextPaint();
        this.f24778k = textPaint;
        textPaint.setTextSize(m40220c(13));
        this.f24777j = new C8216a();
    }

    /* JADX INFO: renamed from: f */
    public void m40223f() {
        int iM40220c = m40220c(3);
        int iM40220c2 = m40220c(2);
        v0j0 v0j0Var = this.f24779l;
        if (v0j0Var.f181881d) {
            this.f24771d.setText(v0j0Var.f181880c);
            this.f24772e.setText(this.f24779l.f181878a);
            this.f24773f.setText(this.f24779l.f181879b);
            this.f24770c.setVisibility(0);
            int iM40219b = m40219b(this.f24779l.f181878a) + m40220c(12) + m40220c(15);
            int iM40219b2 = m40219b(this.f24779l.f181880c) + m40220c(12) + m40220c(10) + m40220c(18);
            int iM40219b3 = m40219b(this.f24779l.f181879b) + m40220c(12) + m40220c(15);
            this.f24777j.f24783c.m40229c(0, iM40219b - iM40220c, iM40219b2 + iM40220c2, ((iM40220c + iM40219b3) - iM40219b2) - iM40220c2).m40227a(this.f24777j.f24781a);
            int i = this.f24768a;
            this.f24777j.f24786f.m40230d(iM40219b2, iM40219b - iM40219b2, iM40219b3, 0, i, this.f24769b - i).m40227a(this.f24777j.f24781a);
            C8217b c8217b = this.f24777j.f24784d;
            int i2 = this.f24769b;
            c8217b.m40230d(0, 0, iM40219b, 0, i2, this.f24768a - i2).m40228b(-1.0f, 2.0f).m40227a(this.f24777j.f24781a);
            this.f24777j.f24785e.m40230d(0, 0, iM40219b2, 0, this.f24769b, 0).m40228b(1.0f, -2.0f).m40227a(this.f24777j.f24781a);
        } else {
            this.f24772e.setText(v0j0Var.f181878a);
            this.f24773f.setText(this.f24779l.f181879b);
            int iM40219b4 = m40219b(this.f24779l.f181878a) + m40220c(12) + m40220c(15);
            int iM40219b5 = m40219b(this.f24779l.f181879b) + m40220c(12) + m40220c(15);
            this.f24777j.f24783c.m40229c(0, iM40219b4 - iM40220c, iM40220c + iM40219b4, iM40219b5 - iM40219b4).m40227a(this.f24777j.f24781a);
            C8217b c8217b2 = this.f24777j.f24784d;
            int i3 = this.f24769b;
            c8217b2.m40230d(0, 0, iM40219b4, 0, i3, this.f24768a - i3).m40228b(1.0f, 0.0f).m40227a(this.f24777j.f24781a);
            C8217b c8217b3 = this.f24777j.f24786f;
            int i4 = this.f24768a;
            c8217b3.m40230d(iM40219b4, 0, iM40219b5, 0, i4, this.f24769b - i4).m40227a(this.f24777j.f24781a);
            this.f24770c.setVisibility(8);
        }
        m40224g();
    }

    /* JADX INFO: renamed from: g */
    public final void m40224g() {
        m40225h(this.f24776i, this.f24777j.f24783c);
        m40225h(this.f24773f, this.f24777j.f24786f);
        m40225h(this.f24772e, this.f24777j.f24784d);
        m40225h(this.f24770c, this.f24777j.f24785e);
    }

    public View getRightView() {
        return this.f24773f;
    }

    /* JADX INFO: renamed from: h */
    public final void m40225h(View view, C8217b c8217b) {
        ViewGroup viewGroup;
        int childCount;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = c8217b.f24793f;
        layoutParams.leftMargin = c8217b.f24790c;
        if (c8217b.f24800m && (view instanceof TextView)) {
            ((TextView) view).setTextColor(c8217b.f24799l);
        } else if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(c8217b.f24799l);
                }
            }
        }
        view.setLayoutParams(layoutParams);
        view.setAlpha(Math.min(1.0f, Math.max(0.0f, c8217b.f24796i)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24771d = (TextView) findViewById(adc0.f70083Q6);
        this.f24772e = (TextView) findViewById(adc0.f70100R6);
        this.f24770c = findViewById(adc0.f70066P6);
        this.f24773f = (TextView) findViewById(adc0.f69918Gb);
        this.f24776i = findViewById(adc0.f70514q0);
        this.f24774g = (TextView) findViewById(adc0.f69935Hb);
        this.f24775h = (ImageView) findViewById(adc0.f70559sb);
        v0j0 v0j0Var = new v0j0();
        this.f24779l = v0j0Var;
        v0j0Var.f181878a = "滑卡";
        v0j0Var.f181879b = "快聊";
        v0j0Var.f181881d = false;
        C8216a c8216a = new C8216a();
        this.f24777j = c8216a;
        c8216a.f24782b = this.f24779l.f181881d;
        m40223f();
    }

    public void setAnimProgress(int i) {
        C8216a c8216a = this.f24777j;
        c8216a.f24781a = i;
        c8216a.m40226a(i);
        m40224g();
    }

    public void setRedDot(boolean z) {
        this.f24780m = z;
    }

    public void setTitleFillInfo(v0j0 v0j0Var) {
        this.f24779l = v0j0Var;
        if (!TextUtils.isEmpty(v0j0Var.f181880c) && this.f24779l.f181880c.length() > 4) {
            v0j0 v0j0Var2 = this.f24779l;
            v0j0Var2.f181880c = v0j0Var2.f181880c.substring(0, 4).concat("…");
        }
        m40223f();
    }

    public TitleChangeAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24768a = -10263709;
        this.f24769b = -1;
        m40222e();
    }

    public TitleChangeAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24768a = -10263709;
        this.f24769b = -1;
        m40222e();
    }
}

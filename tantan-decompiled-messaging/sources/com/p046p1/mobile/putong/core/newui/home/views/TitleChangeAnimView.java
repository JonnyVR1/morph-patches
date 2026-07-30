package com.p046p1.mobile.putong.core.newui.home.views;

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
import p149l.sri0;
import p149l.t100;
import p149l.u4c0;

/* JADX INFO: loaded from: classes11.dex */
public class TitleChangeAnimView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f24026a;

    /* JADX INFO: renamed from: b */
    public int f24027b;

    /* JADX INFO: renamed from: c */
    public View f24028c;

    /* JADX INFO: renamed from: d */
    public TextView f24029d;

    /* JADX INFO: renamed from: e */
    public TextView f24030e;

    /* JADX INFO: renamed from: f */
    public TextView f24031f;

    /* JADX INFO: renamed from: g */
    public TextView f24032g;

    /* JADX INFO: renamed from: h */
    public ImageView f24033h;

    /* JADX INFO: renamed from: i */
    public View f24034i;

    /* JADX INFO: renamed from: j */
    public C8065a f24035j;

    /* JADX INFO: renamed from: k */
    public TextPaint f24036k;

    /* JADX INFO: renamed from: l */
    public sri0 f24037l;

    /* JADX INFO: renamed from: m */
    public boolean f24038m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.TitleChangeAnimView$a */
    public class C8065a {

        /* JADX INFO: renamed from: a */
        public int f24039a = 0;

        /* JADX INFO: renamed from: b */
        public boolean f24040b = false;

        /* JADX INFO: renamed from: c */
        public C8066b f24041c;

        /* JADX INFO: renamed from: d */
        public C8066b f24042d;

        /* JADX INFO: renamed from: e */
        public C8066b f24043e;

        /* JADX INFO: renamed from: f */
        public C8066b f24044f;

        public C8065a() {
            this.f24041c = TitleChangeAnimView.this.new C8066b();
            this.f24042d = TitleChangeAnimView.this.new C8066b();
            this.f24043e = TitleChangeAnimView.this.new C8066b();
            this.f24044f = TitleChangeAnimView.this.new C8066b();
        }

        /* JADX INFO: renamed from: a */
        public void m39223a(int i) {
            this.f24041c.m39224a(i);
            this.f24044f.m39224a(i);
            this.f24042d.m39224a(i);
            this.f24043e.m39224a(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.TitleChangeAnimView$b */
    public class C8066b {

        /* JADX INFO: renamed from: a */
        public int f24046a;

        /* JADX INFO: renamed from: b */
        public int f24047b;

        /* JADX INFO: renamed from: c */
        public int f24048c;

        /* JADX INFO: renamed from: d */
        public int f24049d;

        /* JADX INFO: renamed from: e */
        public int f24050e;

        /* JADX INFO: renamed from: f */
        public int f24051f;

        /* JADX INFO: renamed from: j */
        public int f24055j;

        /* JADX INFO: renamed from: k */
        public int f24056k;

        /* JADX INFO: renamed from: l */
        public int f24057l;

        /* JADX INFO: renamed from: g */
        public float f24052g = 1.0f;

        /* JADX INFO: renamed from: h */
        public float f24053h = 0.0f;

        /* JADX INFO: renamed from: i */
        public float f24054i = 1.0f;

        /* JADX INFO: renamed from: m */
        public boolean f24058m = false;

        public C8066b() {
        }

        /* JADX INFO: renamed from: a */
        public void m39224a(int i) {
            this.f24048c = this.f24046a + ((this.f24047b * i) / 100);
            this.f24051f = this.f24049d + ((this.f24050e * i) / 100);
            if (this.f24058m) {
                TitleChangeAnimView titleChangeAnimView = TitleChangeAnimView.this;
                int i2 = this.f24055j;
                this.f24057l = titleChangeAnimView.m39218d(i2, this.f24056k + i2, i);
            }
            this.f24054i = this.f24052g + ((this.f24053h * i) / 100.0f);
        }

        /* JADX INFO: renamed from: b */
        public C8066b m39225b(float f, float f2) {
            this.f24052g = f;
            this.f24053h = f2;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C8066b m39226c(int i, int i2, int i3, int i4) {
            this.f24058m = false;
            this.f24046a = i;
            this.f24047b = i2;
            this.f24049d = i3;
            this.f24050e = i4;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C8066b m39227d(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f24058m = true;
            this.f24055j = i5;
            this.f24056k = i6;
            this.f24046a = i;
            this.f24047b = i2;
            this.f24049d = i3;
            this.f24050e = i4;
            return this;
        }
    }

    public TitleChangeAnimView(Context context) {
        super(context);
        this.f24026a = -10263709;
        this.f24027b = -1;
        m39219e();
    }

    /* JADX INFO: renamed from: b */
    public final int m39216b(String str) {
        return (int) this.f24036k.measureText(str, 0, str.length());
    }

    /* JADX INFO: renamed from: c */
    public final int m39217c(int i) {
        return t100.m186890d(i);
    }

    /* JADX INFO: renamed from: d */
    public final int m39218d(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: e */
    public final void m39219e() {
        TextPaint textPaint = new TextPaint();
        this.f24036k = textPaint;
        textPaint.setTextSize(m39217c(13));
        this.f24035j = new C8065a();
    }

    /* JADX INFO: renamed from: f */
    public void m39220f() {
        int iM39217c = m39217c(3);
        int iM39217c2 = m39217c(2);
        sri0 sri0Var = this.f24037l;
        if (sri0Var.f166100d) {
            this.f24029d.setText(sri0Var.f166099c);
            this.f24030e.setText(this.f24037l.f166097a);
            this.f24031f.setText(this.f24037l.f166098b);
            this.f24028c.setVisibility(0);
            int iM39216b = m39216b(this.f24037l.f166097a) + m39217c(12) + m39217c(15);
            int iM39216b2 = m39216b(this.f24037l.f166099c) + m39217c(12) + m39217c(10) + m39217c(18);
            int iM39216b3 = m39216b(this.f24037l.f166098b) + m39217c(12) + m39217c(15);
            this.f24035j.f24041c.m39226c(0, iM39216b - iM39217c, iM39216b2 + iM39217c2, ((iM39217c + iM39216b3) - iM39216b2) - iM39217c2).m39224a(this.f24035j.f24039a);
            int i = this.f24026a;
            this.f24035j.f24044f.m39227d(iM39216b2, iM39216b - iM39216b2, iM39216b3, 0, i, this.f24027b - i).m39224a(this.f24035j.f24039a);
            C8066b c8066b = this.f24035j.f24042d;
            int i2 = this.f24027b;
            c8066b.m39227d(0, 0, iM39216b, 0, i2, this.f24026a - i2).m39225b(-1.0f, 2.0f).m39224a(this.f24035j.f24039a);
            this.f24035j.f24043e.m39227d(0, 0, iM39216b2, 0, this.f24027b, 0).m39225b(1.0f, -2.0f).m39224a(this.f24035j.f24039a);
        } else {
            this.f24030e.setText(sri0Var.f166097a);
            this.f24031f.setText(this.f24037l.f166098b);
            int iM39216b4 = m39216b(this.f24037l.f166097a) + m39217c(12) + m39217c(15);
            int iM39216b5 = m39216b(this.f24037l.f166098b) + m39217c(12) + m39217c(15);
            this.f24035j.f24041c.m39226c(0, iM39216b4 - iM39217c, iM39217c + iM39216b4, iM39216b5 - iM39216b4).m39224a(this.f24035j.f24039a);
            C8066b c8066b2 = this.f24035j.f24042d;
            int i3 = this.f24027b;
            c8066b2.m39227d(0, 0, iM39216b4, 0, i3, this.f24026a - i3).m39225b(1.0f, 0.0f).m39224a(this.f24035j.f24039a);
            C8066b c8066b3 = this.f24035j.f24044f;
            int i4 = this.f24026a;
            c8066b3.m39227d(iM39216b4, 0, iM39216b5, 0, i4, this.f24027b - i4).m39224a(this.f24035j.f24039a);
            this.f24028c.setVisibility(8);
        }
        m39221g();
    }

    /* JADX INFO: renamed from: g */
    public final void m39221g() {
        m39222h(this.f24034i, this.f24035j.f24041c);
        m39222h(this.f24031f, this.f24035j.f24044f);
        m39222h(this.f24030e, this.f24035j.f24042d);
        m39222h(this.f24028c, this.f24035j.f24043e);
    }

    public View getRightView() {
        return this.f24031f;
    }

    /* JADX INFO: renamed from: h */
    public final void m39222h(View view, C8066b c8066b) {
        ViewGroup viewGroup;
        int childCount;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = c8066b.f24051f;
        layoutParams.leftMargin = c8066b.f24048c;
        if (c8066b.f24058m && (view instanceof TextView)) {
            ((TextView) view).setTextColor(c8066b.f24057l);
        } else if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(c8066b.f24057l);
                }
            }
        }
        view.setLayoutParams(layoutParams);
        view.setAlpha(Math.min(1.0f, Math.max(0.0f, c8066b.f24054i)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24029d = (TextView) findViewById(u4c0.f173961O6);
        this.f24030e = (TextView) findViewById(u4c0.f173978P6);
        this.f24028c = findViewById(u4c0.f173944N6);
        this.f24031f = (TextView) findViewById(u4c0.f173796Eb);
        this.f24034i = findViewById(u4c0.f174423q0);
        this.f24032g = (TextView) findViewById(u4c0.f173813Fb);
        this.f24033h = (ImageView) findViewById(u4c0.f174434qb);
        sri0 sri0Var = new sri0();
        this.f24037l = sri0Var;
        sri0Var.f166097a = "滑卡";
        sri0Var.f166098b = "快聊";
        sri0Var.f166100d = false;
        C8065a c8065a = new C8065a();
        this.f24035j = c8065a;
        c8065a.f24040b = this.f24037l.f166100d;
        m39220f();
    }

    public void setAnimProgress(int i) {
        C8065a c8065a = this.f24035j;
        c8065a.f24039a = i;
        c8065a.m39223a(i);
        m39221g();
    }

    public void setRedDot(boolean z) {
        this.f24038m = z;
    }

    public void setTitleFillInfo(sri0 sri0Var) {
        this.f24037l = sri0Var;
        if (!TextUtils.isEmpty(sri0Var.f166099c) && this.f24037l.f166099c.length() > 4) {
            sri0 sri0Var2 = this.f24037l;
            sri0Var2.f166099c = sri0Var2.f166099c.substring(0, 4).concat("…");
        }
        m39220f();
    }

    public TitleChangeAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24026a = -10263709;
        this.f24027b = -1;
        m39219e();
    }

    public TitleChangeAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24026a = -10263709;
        this.f24027b = -1;
        m39219e();
    }
}

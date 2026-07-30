package com.p046p1.mobile.putong.core.newui.profile;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e16;
import p149l.e9c0;
import p149l.i0g0;
import p149l.o7r;
import p149l.pr90;
import p149l.t100;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f26469a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f26470b;

    /* JADX INFO: renamed from: c */
    public VText f26471c;

    /* JADX INFO: renamed from: d */
    public VText f26472d;

    /* JADX INFO: renamed from: e */
    public View f26473e;

    /* JADX INFO: renamed from: f */
    public VText f26474f;

    /* JADX INFO: renamed from: g */
    public VText f26475g;

    /* JADX INFO: renamed from: h */
    public VImage f26476h;

    /* JADX INFO: renamed from: i */
    public VText f26477i;

    /* JADX INFO: renamed from: j */
    public ImageView f26478j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f26479k;

    /* JADX INFO: renamed from: l */
    public ViewStub f26480l;

    /* JADX INFO: renamed from: m */
    public ViewStub f26481m;

    /* JADX INFO: renamed from: n */
    public View f26482n;

    /* JADX INFO: renamed from: o */
    public String f26483o;

    /* JADX INFO: renamed from: p */
    public String f26484p;

    /* JADX INFO: renamed from: q */
    @StringRes
    public int f26485q;

    /* JADX INFO: renamed from: r */
    @StringRes
    public int f26486r;

    /* JADX INFO: renamed from: s */
    @DrawableRes
    public int f26487s;

    /* JADX INFO: renamed from: t */
    public boolean f26488t;

    /* JADX INFO: renamed from: u */
    public boolean f26489u;

    /* JADX INFO: renamed from: v */
    @ColorInt
    public int f26490v;

    /* JADX INFO: renamed from: w */
    @ColorInt
    public int f26491w;

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public int f26492x;

    public ProfileItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f90010Y0, i, 0);
        this.f26483o = typedArrayObtainStyledAttributes.getString(e9c0.f90033g1);
        this.f26484p = typedArrayObtainStyledAttributes.getString(e9c0.f90024d1);
        this.f26485q = typedArrayObtainStyledAttributes.getResourceId(e9c0.f90039i1, 0);
        this.f26486r = typedArrayObtainStyledAttributes.getResourceId(e9c0.f90030f1, 0);
        this.f26487s = typedArrayObtainStyledAttributes.getResourceId(e9c0.f90021c1, 0);
        this.f26488t = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90012Z0, true);
        this.f26489u = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90018b1, true);
        this.f26490v = typedArrayObtainStyledAttributes.getColor(e9c0.f90027e1, e16.m114375c(getContext(), w0c0.f183799Q1));
        this.f26491w = typedArrayObtainStyledAttributes.getColor(e9c0.f90036h1, Color.parseColor("#1a1a1a"));
        this.f26492x = typedArrayObtainStyledAttributes.getResourceId(e9c0.f90015a1, x2c0.f189309Er);
        typedArrayObtainStyledAttributes.recycle();
        m43208b();
    }

    /* JADX INFO: renamed from: a */
    public View m43207a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pr90.m170993b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m43208b() {
        m43207a(o7r.m163037a(getContext()), this);
        if (this.f26487s != 0) {
            xdl0.m208344M(this.f26469a, true);
            this.f26469a.setImageResource(this.f26487s);
        }
        int i = this.f26485q;
        VText vText = this.f26471c;
        if (i != 0) {
            vText.setText(i);
        } else {
            vText.setText(this.f26483o);
        }
        int i2 = this.f26486r;
        if (i2 != 0) {
            this.f26472d.setText(i2);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f26484p);
            VText vText2 = this.f26472d;
            if (zIsEmpty) {
                xdl0.m208344M(vText2, false);
            } else {
                vText2.setText(this.f26484p);
            }
        }
        int i3 = this.f26490v;
        if (i3 != 0) {
            this.f26472d.setTextColor(i3);
        }
        int i4 = this.f26491w;
        if (i4 != 0) {
            this.f26471c.setTextColor(i4);
        }
        int i5 = this.f26492x;
        if (i5 != 0) {
            this.f26478j.setImageResource(i5);
        }
        xdl0.m208344M(this.f26478j, this.f26488t);
        xdl0.m208344M(this.f26482n, this.f26489u);
    }

    /* JADX INFO: renamed from: c */
    public void m43209c() {
        m43213g(true);
        if (CoreModule.f17545c.f19654j0.m30604Q4()) {
            this.f26475g.setBackgroundResource(x2c0.f190044ce);
        }
        this.f26475g.setText(getContext().getResources().getString(CoreModule.f17545c.f19654j0.m30645z4() ? R$string.f17602B5 : R$string.f17632C5));
    }

    /* JADX INFO: renamed from: d */
    public void m43210d(boolean z) {
        xdl0.m208344M(this.f26482n, z);
        this.f26482n.setBackgroundResource(w0c0.f183763E1);
    }

    /* JADX INFO: renamed from: e */
    public void m43211e(boolean z) {
        xdl0.m208344M(this.f26473e, z);
    }

    /* JADX INFO: renamed from: f */
    public void m43212f(int i) {
        xdl0.m208344M(this.f26474f, i > 0);
        if (i <= 0) {
            xdl0.m208359W(this.f26472d, 0);
            return;
        }
        m43211e(false);
        m43213g(false);
        this.f26474f.setText(i > 99 ? "99+" : String.valueOf(i));
        xdl0.m208359W(this.f26472d, t100.f167271t);
    }

    /* JADX INFO: renamed from: g */
    public void m43213g(boolean z) {
        if (!z) {
            this.f26475g.setBackgroundResource(x2c0.f190076de);
        }
        xdl0.m208344M(this.f26475g, z);
    }

    /* JADX INFO: renamed from: h */
    public void m43214h(boolean z) {
        xdl0.m208344M(this.f26476h, z);
        if (!z) {
            xdl0.m208359W(this.f26472d, 0);
        } else {
            this.f26476h.setImageResource(x2c0.f189386H9);
            xdl0.m208359W(this.f26472d, t100.f167271t);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m43215i(String str) {
        xdl0.m208344M(this.f26472d, true);
        this.f26472d.setText(str);
    }

    /* JADX INFO: renamed from: j */
    public void m43216j(String str) {
        xdl0.m208344M(this.f26471c, true);
        this.f26471c.setText(str);
    }

    public void setIconRes(@DrawableRes int i) {
        xdl0.m208344M(this.f26469a, true);
        this.f26487s = i;
        this.f26469a.setImageResource(i);
    }

    public void setSubtitle(String str) {
        xdl0.m208344M(this.f26472d, true);
        this.f26472d.setText(str);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        i0g0.m133874n(this.f26471c, getContext().getResources().getDrawable(i));
    }

    public ProfileItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileItem(Context context) {
        this(context, null, 0);
    }
}

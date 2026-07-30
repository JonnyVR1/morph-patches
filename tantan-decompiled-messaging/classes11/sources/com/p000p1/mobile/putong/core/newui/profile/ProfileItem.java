package com.p000p1.mobile.putong.core.newui.profile;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import l.e16;
import l.e9c0;
import l.pr90;
import l.t100;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import p009l.i0g0;
import p009l.o7r;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ProfileItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5247a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5248b;

    /* JADX INFO: renamed from: c */
    public VText f5249c;

    /* JADX INFO: renamed from: d */
    public VText f5250d;

    /* JADX INFO: renamed from: e */
    public View f5251e;

    /* JADX INFO: renamed from: f */
    public VText f5252f;

    /* JADX INFO: renamed from: g */
    public VText f5253g;

    /* JADX INFO: renamed from: h */
    public VImage f5254h;

    /* JADX INFO: renamed from: i */
    public VText f5255i;

    /* JADX INFO: renamed from: j */
    public ImageView f5256j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f5257k;

    /* JADX INFO: renamed from: l */
    public ViewStub f5258l;

    /* JADX INFO: renamed from: m */
    public ViewStub f5259m;

    /* JADX INFO: renamed from: n */
    public View f5260n;

    /* JADX INFO: renamed from: o */
    public String f5261o;

    /* JADX INFO: renamed from: p */
    public String f5262p;

    /* JADX INFO: renamed from: q */
    @StringRes
    public int f5263q;

    /* JADX INFO: renamed from: r */
    @StringRes
    public int f5264r;

    /* JADX INFO: renamed from: s */
    @DrawableRes
    public int f5265s;

    /* JADX INFO: renamed from: t */
    public boolean f5266t;

    /* JADX INFO: renamed from: u */
    public boolean f5267u;

    /* JADX INFO: renamed from: v */
    @ColorInt
    public int f5268v;

    /* JADX INFO: renamed from: w */
    @ColorInt
    public int f5269w;

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public int f5270x;

    public ProfileItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.Y0, i, 0);
        this.f5261o = typedArrayObtainStyledAttributes.getString(e9c0.g1);
        this.f5262p = typedArrayObtainStyledAttributes.getString(e9c0.d1);
        this.f5263q = typedArrayObtainStyledAttributes.getResourceId(e9c0.i1, 0);
        this.f5264r = typedArrayObtainStyledAttributes.getResourceId(e9c0.f1, 0);
        this.f5265s = typedArrayObtainStyledAttributes.getResourceId(e9c0.c1, 0);
        this.f5266t = typedArrayObtainStyledAttributes.getBoolean(e9c0.Z0, true);
        this.f5267u = typedArrayObtainStyledAttributes.getBoolean(e9c0.b1, true);
        this.f5268v = typedArrayObtainStyledAttributes.getColor(e9c0.e1, e16.c(getContext(), w0c0.Q1));
        this.f5269w = typedArrayObtainStyledAttributes.getColor(e9c0.h1, Color.parseColor("#1a1a1a"));
        this.f5270x = typedArrayObtainStyledAttributes.getResourceId(e9c0.a1, x2c0.Er);
        typedArrayObtainStyledAttributes.recycle();
        m7429b();
    }

    /* JADX INFO: renamed from: a */
    public View m7428a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pr90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m7429b() {
        m7428a(o7r.m19649a(getContext()), this);
        if (this.f5265s != 0) {
            xdl0.M(this.f5247a, true);
            this.f5247a.setImageResource(this.f5265s);
        }
        int i = this.f5263q;
        VText vText = this.f5249c;
        if (i != 0) {
            vText.setText(i);
        } else {
            vText.setText(this.f5261o);
        }
        int i2 = this.f5264r;
        if (i2 != 0) {
            this.f5250d.setText(i2);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f5262p);
            VText vText2 = this.f5250d;
            if (zIsEmpty) {
                xdl0.M(vText2, false);
            } else {
                vText2.setText(this.f5262p);
            }
        }
        int i3 = this.f5268v;
        if (i3 != 0) {
            this.f5250d.setTextColor(i3);
        }
        int i4 = this.f5269w;
        if (i4 != 0) {
            this.f5249c.setTextColor(i4);
        }
        int i5 = this.f5270x;
        if (i5 != 0) {
            this.f5256j.setImageResource(i5);
        }
        xdl0.M(this.f5256j, this.f5266t);
        xdl0.M(this.f5260n, this.f5267u);
    }

    /* JADX INFO: renamed from: c */
    public void m7430c() {
        m7434g(true);
        if (CoreModule.c.j0.Q4()) {
            this.f5253g.setBackgroundResource(x2c0.ce);
        }
        this.f5253g.setText(getContext().getResources().getString(CoreModule.c.j0.z4() ? R.string.B5 : R.string.C5));
    }

    /* JADX INFO: renamed from: d */
    public void m7431d(boolean z) {
        xdl0.M(this.f5260n, z);
        this.f5260n.setBackgroundResource(w0c0.E1);
    }

    /* JADX INFO: renamed from: e */
    public void m7432e(boolean z) {
        xdl0.M(this.f5251e, z);
    }

    /* JADX INFO: renamed from: f */
    public void m7433f(int i) {
        xdl0.M(this.f5252f, i > 0);
        if (i <= 0) {
            xdl0.W(this.f5250d, 0);
            return;
        }
        m7432e(false);
        m7434g(false);
        this.f5252f.setText(i > 99 ? "99+" : String.valueOf(i));
        xdl0.W(this.f5250d, t100.t);
    }

    /* JADX INFO: renamed from: g */
    public void m7434g(boolean z) {
        if (!z) {
            this.f5253g.setBackgroundResource(x2c0.de);
        }
        xdl0.M(this.f5253g, z);
    }

    /* JADX INFO: renamed from: h */
    public void m7435h(boolean z) {
        xdl0.M(this.f5254h, z);
        if (!z) {
            xdl0.W(this.f5250d, 0);
        } else {
            this.f5254h.setImageResource(x2c0.H9);
            xdl0.W(this.f5250d, t100.t);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7436i(String str) {
        xdl0.M(this.f5250d, true);
        this.f5250d.setText(str);
    }

    /* JADX INFO: renamed from: j */
    public void m7437j(String str) {
        xdl0.M(this.f5249c, true);
        this.f5249c.setText(str);
    }

    public void setIconRes(@DrawableRes int i) {
        xdl0.M(this.f5247a, true);
        this.f5265s = i;
        this.f5247a.setImageResource(i);
    }

    public void setSubtitle(String str) {
        xdl0.M(this.f5250d, true);
        this.f5250d.setText(str);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        i0g0.m16142n(this.f5249c, getContext().getResources().getDrawable(i));
    }

    public ProfileItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileItem(Context context) {
        this(context, null, 0);
    }
}

package com.p051p1.mobile.putong.core.newui.profile;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.j26;
import p153l.khc0;
import p153l.p9r;
import p153l.q8g0;
import p153l.qa00;
import p153l.tz90;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f27211a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f27212b;

    /* JADX INFO: renamed from: c */
    public VText f27213c;

    /* JADX INFO: renamed from: d */
    public VText f27214d;

    /* JADX INFO: renamed from: e */
    public View f27215e;

    /* JADX INFO: renamed from: f */
    public VText f27216f;

    /* JADX INFO: renamed from: g */
    public VText f27217g;

    /* JADX INFO: renamed from: h */
    public VImage f27218h;

    /* JADX INFO: renamed from: i */
    public VText f27219i;

    /* JADX INFO: renamed from: j */
    public ImageView f27220j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f27221k;

    /* JADX INFO: renamed from: l */
    public ViewStub f27222l;

    /* JADX INFO: renamed from: m */
    public ViewStub f27223m;

    /* JADX INFO: renamed from: n */
    public View f27224n;

    /* JADX INFO: renamed from: o */
    public String f27225o;

    /* JADX INFO: renamed from: p */
    public String f27226p;

    /* JADX INFO: renamed from: q */
    @StringRes
    public int f27227q;

    /* JADX INFO: renamed from: r */
    @StringRes
    public int f27228r;

    /* JADX INFO: renamed from: s */
    @DrawableRes
    public int f27229s;

    /* JADX INFO: renamed from: t */
    public boolean f27230t;

    /* JADX INFO: renamed from: u */
    public boolean f27231u;

    /* JADX INFO: renamed from: v */
    @ColorInt
    public int f27232v;

    /* JADX INFO: renamed from: w */
    @ColorInt
    public int f27233w;

    /* JADX INFO: renamed from: x */
    @DrawableRes
    public int f27234x;

    public ProfileItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126780Y0, i, 0);
        this.f27225o = typedArrayObtainStyledAttributes.getString(khc0.f126803g1);
        this.f27226p = typedArrayObtainStyledAttributes.getString(khc0.f126794d1);
        this.f27227q = typedArrayObtainStyledAttributes.getResourceId(khc0.f126809i1, 0);
        this.f27228r = typedArrayObtainStyledAttributes.getResourceId(khc0.f126800f1, 0);
        this.f27229s = typedArrayObtainStyledAttributes.getResourceId(khc0.f126791c1, 0);
        this.f27230t = typedArrayObtainStyledAttributes.getBoolean(khc0.f126782Z0, true);
        this.f27231u = typedArrayObtainStyledAttributes.getBoolean(khc0.f126788b1, true);
        this.f27232v = typedArrayObtainStyledAttributes.getColor(khc0.f126797e1, j26.m143190c(getContext(), c9c0.f80371R1));
        this.f27233w = typedArrayObtainStyledAttributes.getColor(khc0.f126806h1, Color.parseColor("#1a1a1a"));
        this.f27234x = typedArrayObtainStyledAttributes.getResourceId(khc0.f126785a1, dbc0.f87428ss);
        typedArrayObtainStyledAttributes.recycle();
        m44219b();
    }

    /* JADX INFO: renamed from: a */
    public View m44218a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tz90.m193653b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m44219b() {
        m44218a(p9r.m171370a(getContext()), this);
        if (this.f27229s != 0) {
            bnl0.m105524M(this.f27211a, true);
            this.f27211a.setImageResource(this.f27229s);
        }
        int i = this.f27227q;
        VText vText = this.f27213c;
        if (i != 0) {
            vText.setText(i);
        } else {
            vText.setText(this.f27225o);
        }
        int i2 = this.f27228r;
        if (i2 != 0) {
            this.f27214d.setText(i2);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f27226p);
            VText vText2 = this.f27214d;
            if (zIsEmpty) {
                bnl0.m105524M(vText2, false);
            } else {
                vText2.setText(this.f27226p);
            }
        }
        int i3 = this.f27232v;
        if (i3 != 0) {
            this.f27214d.setTextColor(i3);
        }
        int i4 = this.f27233w;
        if (i4 != 0) {
            this.f27213c.setTextColor(i4);
        }
        int i5 = this.f27234x;
        if (i5 != 0) {
            this.f27220j.setImageResource(i5);
        }
        bnl0.m105524M(this.f27220j, this.f27230t);
        bnl0.m105524M(this.f27224n, this.f27231u);
    }

    /* JADX INFO: renamed from: c */
    public void m44220c() {
        m44224g(true);
        if (CoreModule.f18264c.f20396j0.m31607Q4()) {
            this.f27217g.setBackgroundResource(dbc0.f86922de);
        }
        this.f27217g.setText(getContext().getResources().getString(CoreModule.f18264c.f20396j0.m31648z4() ? R$string.f18384D5 : R$string.f18415E5));
    }

    /* JADX INFO: renamed from: d */
    public void m44221d(boolean z) {
        bnl0.m105524M(this.f27224n, z);
        this.f27224n.setBackgroundResource(c9c0.f80335F1);
    }

    /* JADX INFO: renamed from: e */
    public void m44222e(boolean z) {
        bnl0.m105524M(this.f27215e, z);
    }

    /* JADX INFO: renamed from: f */
    public void m44223f(int i) {
        bnl0.m105524M(this.f27216f, i > 0);
        if (i <= 0) {
            bnl0.m105539W(this.f27214d, 0);
            return;
        }
        m44222e(false);
        m44224g(false);
        this.f27216f.setText(i > 99 ? "99+" : String.valueOf(i));
        bnl0.m105539W(this.f27214d, qa00.f156333t);
    }

    /* JADX INFO: renamed from: g */
    public void m44224g(boolean z) {
        if (!z) {
            this.f27217g.setBackgroundResource(dbc0.f86954ee);
        }
        bnl0.m105524M(this.f27217g, z);
    }

    /* JADX INFO: renamed from: h */
    public void m44225h(boolean z) {
        bnl0.m105524M(this.f27218h, z);
        if (!z) {
            bnl0.m105539W(this.f27214d, 0);
        } else {
            this.f27218h.setImageResource(dbc0.f86242I9);
            bnl0.m105539W(this.f27214d, qa00.f156333t);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m44226i(String str) {
        bnl0.m105524M(this.f27214d, true);
        this.f27214d.setText(str);
    }

    /* JADX INFO: renamed from: j */
    public void m44227j(String str) {
        bnl0.m105524M(this.f27213c, true);
        this.f27213c.setText(str);
    }

    public void setIconRes(@DrawableRes int i) {
        bnl0.m105524M(this.f27211a, true);
        this.f27229s = i;
        this.f27211a.setImageResource(i);
    }

    public void setSubtitle(String str) {
        bnl0.m105524M(this.f27214d, true);
        this.f27214d.setText(str);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        q8g0.m175809n(this.f27213c, getContext().getResources().getDrawable(i));
    }

    public ProfileItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileItem(Context context) {
        this(context, null, 0);
    }
}

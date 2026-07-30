package p147v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.gms.common.api.Api;
import p149l.b6c0;
import p149l.b9c0;
import p149l.eqh0;
import p149l.p4c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VListCell<V extends View> extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f209151a;

    /* JADX INFO: renamed from: b */
    public ViewStub f209152b;

    /* JADX INFO: renamed from: c */
    public VIcon f209153c;

    /* JADX INFO: renamed from: d */
    public VIcon f209154d;

    /* JADX INFO: renamed from: e */
    public VLinear f209155e;

    /* JADX INFO: renamed from: f */
    public VText f209156f;

    /* JADX INFO: renamed from: g */
    public VText f209157g;

    /* JADX INFO: renamed from: h */
    public VText f209158h;

    public VListCell(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223075b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m223074a() {
        boolean z;
        if (this.f209151a == null && this.f209158h.getVisibility() != 8) {
            ((LinearLayout.LayoutParams) this.f209158h.getLayoutParams()).leftMargin = t100.f167259h;
        }
        if (this.f209153c.getVisibility() == 8 && this.f209154d.getVisibility() == 8 && this.f209158h.getVisibility() == 8 && this.f209151a == null) {
            if (this.f209156f.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) this.f209156f.getLayoutParams()).gravity = 17;
            }
            if (this.f209157g.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) this.f209157g.getLayoutParams()).gravity = 17;
            }
            ((LinearLayout.LayoutParams) this.f209155e.getLayoutParams()).rightMargin = 0;
            return;
        }
        boolean z2 = true;
        if (this.f209156f.getVisibility() == 0) {
            ((LinearLayout.LayoutParams) this.f209156f.getLayoutParams()).gravity = 8388627;
            z = true;
        } else {
            z = false;
        }
        if (this.f209157g.getVisibility() == 0) {
            ((LinearLayout.LayoutParams) this.f209157g.getLayoutParams()).gravity = 8388627;
        } else {
            z2 = false;
        }
        ((LinearLayout.LayoutParams) this.f209155e.getLayoutParams()).rightMargin = t100.f167268q;
        if (!z || z2) {
            this.f209156f.setPadding(0, 0, 0, 0);
        } else {
            this.f209156f.setPadding(0, t100.f167254c, 0, 0);
        }
    }

    @SuppressLint({"WrongViewCast"})
    /* JADX INFO: renamed from: b */
    public final void m223075b(Context context, @Nullable AttributeSet attributeSet) {
        int i;
        Drawable drawable;
        int i2;
        int i3;
        int i4;
        int dimensionPixelSize;
        int i5;
        int resourceId;
        int i6;
        int i7;
        int i8;
        String str;
        String str2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        String str3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ColorStateList colorStateList4;
        LayoutInflater.from(context).inflate(b6c0.f73787m, this);
        setGravity(16);
        setOrientation(0);
        this.f209153c = (VIcon) findViewById(p4c0.f147097V);
        this.f209154d = (VIcon) findViewById(p4c0.f147099W);
        this.f209152b = (ViewStub) findViewById(p4c0.f147150x);
        this.f209155e = (VLinear) findViewById(p4c0.f147094T0);
        VText vText = (VText) findViewById(p4c0.f147090R0);
        this.f209156f = vText;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f209157g = (VText) findViewById(p4c0.f147076K0);
        this.f209158h = (VText) findViewById(p4c0.f147103Z);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74428g0);
            String string = typedArrayObtainStyledAttributes.getString(b9c0.f74526u0);
            int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74533v0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            ColorStateList colorStateList5 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.f74533v0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74540w0, -1);
            i4 = typedArrayObtainStyledAttributes.getInt(b9c0.f74547x0, -1);
            String string2 = typedArrayObtainStyledAttributes.getString(b9c0.f74491p0);
            int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.f74498q0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            ColorStateList colorStateList6 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.f74498q0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74512s0, -1);
            int i15 = typedArrayObtainStyledAttributes.getInt(b9c0.f74519t0, -1);
            String string3 = typedArrayObtainStyledAttributes.getString(b9c0.f74463l0);
            int color3 = typedArrayObtainStyledAttributes.getColor(b9c0.f74470m0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(b9c0.f74470m0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74477n0, -1);
            i6 = typedArrayObtainStyledAttributes.getInt(b9c0.f74484o0, -1);
            int color4 = typedArrayObtainStyledAttributes.getColor(b9c0.f74435h0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(b9c0.f74435h0);
            i8 = i15;
            resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74449j0, -1);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74456k0, -1);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74442i0, -1);
            i = 1;
            i13 = typedArrayObtainStyledAttributes.getInt(b9c0.f74505r0, 1);
            typedArrayObtainStyledAttributes.recycle();
            i7 = dimensionPixelSize3;
            str = string2;
            i11 = color3;
            i9 = color4;
            i3 = dimensionPixelSize2;
            colorStateList3 = colorStateList5;
            i10 = color2;
            str3 = string;
            drawable = drawable2;
            i12 = color;
            colorStateList2 = colorStateList6;
            str2 = string3;
            i5 = resourceId2;
            i2 = resourceId3;
        } else {
            i = 1;
            drawable = null;
            i2 = -1;
            i3 = -1;
            i4 = -1;
            dimensionPixelSize = -1;
            i5 = -1;
            resourceId = -1;
            i6 = -1;
            i7 = -1;
            i8 = -1;
            str = null;
            str2 = null;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            str3 = null;
            i9 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i13 = 1;
        }
        if (i13 <= i) {
            ((LinearLayout.LayoutParams) this.f209155e.getLayoutParams()).height = t100.f167230E;
            this.f209155e.setGravity(16);
        }
        if (i9 != Integer.MAX_VALUE) {
            setBackgroundColor(i9);
        }
        if (drawable != null) {
            drawable.mutate();
            setBackground(drawable);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        VText vText2 = this.f209156f;
        if (zIsEmpty) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
            this.f209156f.setText(str3);
        }
        if (i12 != Integer.MAX_VALUE) {
            this.f209156f.setTextColor(i12);
        }
        if (colorStateList3 != null) {
            this.f209156f.setTextColor(colorStateList3);
        }
        if (i3 > 0) {
            this.f209156f.setTextSize(0, i3);
        }
        if (i4 > 0) {
            VText vText3 = this.f209156f;
            if (i4 == 4) {
                vText3.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                vText3.setTypeface(eqh0.m117752c(i4));
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        VText vText4 = this.f209157g;
        if (zIsEmpty2) {
            vText4.setVisibility(8);
        } else {
            vText4.setVisibility(0);
            this.f209157g.setText(str);
        }
        if (i10 != Integer.MAX_VALUE) {
            this.f209157g.setTextColor(i10);
        }
        if (colorStateList2 != null) {
            this.f209157g.setTextColor(colorStateList2);
        }
        if (dimensionPixelSize > 0) {
            this.f209157g.setTextSize(0, dimensionPixelSize);
        }
        if (i8 > 0) {
            this.f209157g.setTypeface(eqh0.m117752c(i8));
        }
        this.f209157g.setMaxLines(i13);
        boolean zIsEmpty3 = TextUtils.isEmpty(str2);
        VText vText5 = this.f209158h;
        if (zIsEmpty3) {
            vText5.setVisibility(8);
        } else {
            vText5.setVisibility(0);
            this.f209158h.setText(str2);
        }
        if (i11 != Integer.MAX_VALUE) {
            this.f209158h.setTextColor(i11);
        }
        if (colorStateList != 0) {
            this.f209158h.setTextColor(colorStateList4);
        }
        if (i7 > 0) {
            colorStateList4 = colorStateList;
            this.f209158h.setTextSize(i7);
        }
        if (i6 > 0) {
            this.f209158h.setTypeface(eqh0.m117752c(i6));
        }
        VIcon vIcon = this.f209153c;
        if (resourceId > 0) {
            i14 = 0;
            vIcon.setVisibility(0);
            this.f209153c.setImageResource(resourceId);
        } else {
            i14 = 0;
            vIcon.setVisibility(8);
        }
        VIcon vIcon2 = this.f209154d;
        if (i5 > 0) {
            vIcon2.setVisibility(i14);
            this.f209154d.setImageResource(i5);
        } else {
            vIcon2.setVisibility(8);
        }
        if (i2 > 0) {
            this.f209152b.setLayoutResource(i2);
            this.f209151a = this.f209152b.inflate();
        }
        m223074a();
    }

    /* JADX INFO: renamed from: c */
    public void m223076c(Typeface typeface, int i) {
        if (typeface != null) {
            this.f209156f.setTypeface(typeface, i);
        }
    }

    public int getDescribeColor() {
        return this.f209158h.getCurrentTextColor();
    }

    public V getRightView() {
        return (V) this.f209151a;
    }

    public int getSubTitleColor() {
        return this.f209157g.getCurrentTextColor();
    }

    public int getTitleColor() {
        return this.f209156f.getCurrentTextColor();
    }

    public void setDescribe(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f209158h.setText(string);
        this.f209158h.setVisibility(0);
        m223074a();
    }

    public void setDescribeColor(int i) {
        this.f209158h.setTextColor(i);
    }

    public void setDescribeSelector(int i) {
        this.f209158h.setTextColor(getResources().getColorStateList(i));
    }

    public void setDescribeTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f209158h.setTypeface(typeface);
        }
    }

    public void setLeftLargeImage(int i) {
        if (i > 0) {
            this.f209153c.setVisibility(0);
            this.f209153c.setImageResource(i);
            m223074a();
        }
    }

    public void setLeftSmallImage(int i) {
        if (i > 0) {
            this.f209154d.setVisibility(0);
            this.f209154d.setImageResource(i);
            m223074a();
        }
    }

    public void setLeftSmallImageGravity(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f209154d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.gravity = i;
        }
        xdl0.m208374f0(this.f209154d, t100.m186890d(11.0f));
        xdl0.m208368c0(this.f209154d, t100.m186890d(11.0f));
        this.f209154d.setLayoutParams(layoutParams);
    }

    public void setRightLayoutRes(int i) {
        if (i > 0) {
            this.f209152b.setLayoutResource(i);
            this.f209151a = this.f209152b.inflate();
            m223074a();
        }
    }

    public void setSubTitle(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f209157g.setText(string);
        this.f209157g.setVisibility(0);
        m223074a();
    }

    public void setSubTitleColor(int i) {
        this.f209157g.setTextColor(i);
    }

    public void setSubTitleSelector(int i) {
        this.f209157g.setTextColor(getResources().getColorStateList(i));
    }

    public void setSubTitleSize(int i) {
        this.f209157g.setTextSize(i);
    }

    public void setSubTitleTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f209157g.setTypeface(typeface);
        }
    }

    public void setSubtitleMaxLines(int i) {
        this.f209157g.setMaxLines(i);
        if (i > 1) {
            ((LinearLayout.LayoutParams) this.f209155e.getLayoutParams()).height = -2;
            this.f209155e.setGravity(16);
        }
    }

    public void setTitle(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f209156f.setText(string);
        this.f209156f.setVisibility(0);
        m223074a();
    }

    public void setTitleBottomPadding(int i) {
        this.f209156f.setPadding(0, 0, 0, xdl0.m208407w(i));
    }

    public void setTitleColor(int i) {
        this.f209156f.setTextColor(i);
    }

    public void setTitleSelector(int i) {
        this.f209156f.setTextColor(getResources().getColorStateList(i));
    }

    public void setTitleTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f209156f.setTypeface(typeface);
        }
    }

    public VListCell(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VListCell(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: v.VListCell$a */
    public static class C22545a {

        /* JADX INFO: renamed from: a */
        public final CharSequence f209159a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f209160b;

        /* JADX INFO: renamed from: c */
        public final CharSequence f209161c;

        /* JADX INFO: renamed from: d */
        public final int f209162d;

        /* JADX INFO: renamed from: e */
        public final int f209163e;

        /* JADX INFO: renamed from: f */
        public final int f209164f;

        public C22545a(CharSequence charSequence) {
            this.f209159a = charSequence;
            this.f209160b = null;
            this.f209161c = null;
            this.f209162d = -1;
            this.f209163e = -1;
            this.f209164f = -1;
        }

        public C22545a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, int i2, int i3) {
            this.f209159a = charSequence;
            this.f209160b = charSequence2;
            this.f209161c = charSequence3;
            this.f209162d = i;
            this.f209163e = i2;
            this.f209164f = i3;
        }
    }

    public void setDescribe(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f209158h.setText(charSequence);
        this.f209158h.setVisibility(0);
        m223074a();
    }

    public void setSubTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f209157g.setText(charSequence);
        this.f209157g.setVisibility(0);
        m223074a();
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f209156f.setText(charSequence);
        this.f209156f.setVisibility(0);
        m223074a();
    }
}

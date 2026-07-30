package p151v;

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
import p153l.bnl0;
import p153l.gec0;
import p153l.hhc0;
import p153l.lyh0;
import p153l.qa00;
import p153l.vcc0;

/* JADX INFO: loaded from: classes3.dex */
public class VListCell<V extends View> extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f210073a;

    /* JADX INFO: renamed from: b */
    public ViewStub f210074b;

    /* JADX INFO: renamed from: c */
    public VIcon f210075c;

    /* JADX INFO: renamed from: d */
    public VIcon f210076d;

    /* JADX INFO: renamed from: e */
    public VLinear f210077e;

    /* JADX INFO: renamed from: f */
    public VText f210078f;

    /* JADX INFO: renamed from: g */
    public VText f210079g;

    /* JADX INFO: renamed from: h */
    public VText f210080h;

    public VListCell(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224321b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m224320a() {
        boolean z;
        if (this.f210073a == null && this.f210080h.getVisibility() != 8) {
            ((LinearLayout.LayoutParams) this.f210080h.getLayoutParams()).leftMargin = qa00.f156321h;
        }
        if (this.f210075c.getVisibility() == 8 && this.f210076d.getVisibility() == 8 && this.f210080h.getVisibility() == 8 && this.f210073a == null) {
            if (this.f210078f.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) this.f210078f.getLayoutParams()).gravity = 17;
            }
            if (this.f210079g.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) this.f210079g.getLayoutParams()).gravity = 17;
            }
            ((LinearLayout.LayoutParams) this.f210077e.getLayoutParams()).rightMargin = 0;
            return;
        }
        boolean z2 = true;
        if (this.f210078f.getVisibility() == 0) {
            ((LinearLayout.LayoutParams) this.f210078f.getLayoutParams()).gravity = 8388627;
            z = true;
        } else {
            z = false;
        }
        if (this.f210079g.getVisibility() == 0) {
            ((LinearLayout.LayoutParams) this.f210079g.getLayoutParams()).gravity = 8388627;
        } else {
            z2 = false;
        }
        ((LinearLayout.LayoutParams) this.f210077e.getLayoutParams()).rightMargin = qa00.f156330q;
        if (!z || z2) {
            this.f210078f.setPadding(0, 0, 0, 0);
        } else {
            this.f210078f.setPadding(0, qa00.f156316c, 0, 0);
        }
    }

    @SuppressLint({"WrongViewCast"})
    /* JADX INFO: renamed from: b */
    public final void m224321b(Context context, @Nullable AttributeSet attributeSet) {
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
        LayoutInflater.from(context).inflate(gec0.f103800m, this);
        setGravity(16);
        setOrientation(0);
        this.f210075c = (VIcon) findViewById(vcc0.f183397V);
        this.f210076d = (VIcon) findViewById(vcc0.f183399W);
        this.f210074b = (ViewStub) findViewById(vcc0.f183450x);
        this.f210077e = (VLinear) findViewById(vcc0.f183394T0);
        VText vText = (VText) findViewById(vcc0.f183390R0);
        this.f210078f = vText;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f210079g = (VText) findViewById(vcc0.f183376K0);
        this.f210080h = (VText) findViewById(vcc0.f183403Z);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109737g0);
            String string = typedArrayObtainStyledAttributes.getString(hhc0.f109835u0);
            int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109842v0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            ColorStateList colorStateList5 = typedArrayObtainStyledAttributes.getColorStateList(hhc0.f109842v0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109849w0, -1);
            i4 = typedArrayObtainStyledAttributes.getInt(hhc0.f109856x0, -1);
            String string2 = typedArrayObtainStyledAttributes.getString(hhc0.f109800p0);
            int color2 = typedArrayObtainStyledAttributes.getColor(hhc0.f109807q0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            ColorStateList colorStateList6 = typedArrayObtainStyledAttributes.getColorStateList(hhc0.f109807q0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109821s0, -1);
            int i15 = typedArrayObtainStyledAttributes.getInt(hhc0.f109828t0, -1);
            String string3 = typedArrayObtainStyledAttributes.getString(hhc0.f109772l0);
            int color3 = typedArrayObtainStyledAttributes.getColor(hhc0.f109779m0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(hhc0.f109779m0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109786n0, -1);
            i6 = typedArrayObtainStyledAttributes.getInt(hhc0.f109793o0, -1);
            int color4 = typedArrayObtainStyledAttributes.getColor(hhc0.f109744h0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(hhc0.f109744h0);
            i8 = i15;
            resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109758j0, -1);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109765k0, -1);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109751i0, -1);
            i = 1;
            i13 = typedArrayObtainStyledAttributes.getInt(hhc0.f109814r0, 1);
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
            ((LinearLayout.LayoutParams) this.f210077e.getLayoutParams()).height = qa00.f156292E;
            this.f210077e.setGravity(16);
        }
        if (i9 != Integer.MAX_VALUE) {
            setBackgroundColor(i9);
        }
        if (drawable != null) {
            drawable.mutate();
            setBackground(drawable);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        VText vText2 = this.f210078f;
        if (zIsEmpty) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
            this.f210078f.setText(str3);
        }
        if (i12 != Integer.MAX_VALUE) {
            this.f210078f.setTextColor(i12);
        }
        if (colorStateList3 != null) {
            this.f210078f.setTextColor(colorStateList3);
        }
        if (i3 > 0) {
            this.f210078f.setTextSize(0, i3);
        }
        if (i4 > 0) {
            VText vText3 = this.f210078f;
            if (i4 == 4) {
                vText3.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                vText3.setTypeface(lyh0.m156283c(i4));
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        VText vText4 = this.f210079g;
        if (zIsEmpty2) {
            vText4.setVisibility(8);
        } else {
            vText4.setVisibility(0);
            this.f210079g.setText(str);
        }
        if (i10 != Integer.MAX_VALUE) {
            this.f210079g.setTextColor(i10);
        }
        if (colorStateList2 != null) {
            this.f210079g.setTextColor(colorStateList2);
        }
        if (dimensionPixelSize > 0) {
            this.f210079g.setTextSize(0, dimensionPixelSize);
        }
        if (i8 > 0) {
            this.f210079g.setTypeface(lyh0.m156283c(i8));
        }
        this.f210079g.setMaxLines(i13);
        boolean zIsEmpty3 = TextUtils.isEmpty(str2);
        VText vText5 = this.f210080h;
        if (zIsEmpty3) {
            vText5.setVisibility(8);
        } else {
            vText5.setVisibility(0);
            this.f210080h.setText(str2);
        }
        if (i11 != Integer.MAX_VALUE) {
            this.f210080h.setTextColor(i11);
        }
        if (colorStateList != 0) {
            this.f210080h.setTextColor(colorStateList4);
        }
        if (i7 > 0) {
            colorStateList4 = colorStateList;
            this.f210080h.setTextSize(i7);
        }
        if (i6 > 0) {
            this.f210080h.setTypeface(lyh0.m156283c(i6));
        }
        VIcon vIcon = this.f210075c;
        if (resourceId > 0) {
            i14 = 0;
            vIcon.setVisibility(0);
            this.f210075c.setImageResource(resourceId);
        } else {
            i14 = 0;
            vIcon.setVisibility(8);
        }
        VIcon vIcon2 = this.f210076d;
        if (i5 > 0) {
            vIcon2.setVisibility(i14);
            this.f210076d.setImageResource(i5);
        } else {
            vIcon2.setVisibility(8);
        }
        if (i2 > 0) {
            this.f210074b.setLayoutResource(i2);
            this.f210073a = this.f210074b.inflate();
        }
        m224320a();
    }

    /* JADX INFO: renamed from: c */
    public void m224322c(Typeface typeface, int i) {
        if (typeface != null) {
            this.f210078f.setTypeface(typeface, i);
        }
    }

    public int getDescribeColor() {
        return this.f210080h.getCurrentTextColor();
    }

    public V getRightView() {
        return (V) this.f210073a;
    }

    public int getSubTitleColor() {
        return this.f210079g.getCurrentTextColor();
    }

    public int getTitleColor() {
        return this.f210078f.getCurrentTextColor();
    }

    public void setDescribe(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f210080h.setText(string);
        this.f210080h.setVisibility(0);
        m224320a();
    }

    public void setDescribeColor(int i) {
        this.f210080h.setTextColor(i);
    }

    public void setDescribeSelector(int i) {
        this.f210080h.setTextColor(getResources().getColorStateList(i));
    }

    public void setDescribeTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f210080h.setTypeface(typeface);
        }
    }

    public void setLeftLargeImage(int i) {
        if (i > 0) {
            this.f210075c.setVisibility(0);
            this.f210075c.setImageResource(i);
            m224320a();
        }
    }

    public void setLeftSmallImage(int i) {
        if (i > 0) {
            this.f210076d.setVisibility(0);
            this.f210076d.setImageResource(i);
            m224320a();
        }
    }

    public void setLeftSmallImageGravity(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f210076d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.gravity = i;
        }
        bnl0.m105554f0(this.f210076d, qa00.m175859d(11.0f));
        bnl0.m105548c0(this.f210076d, qa00.m175859d(11.0f));
        this.f210076d.setLayoutParams(layoutParams);
    }

    public void setRightLayoutRes(int i) {
        if (i > 0) {
            this.f210074b.setLayoutResource(i);
            this.f210073a = this.f210074b.inflate();
            m224320a();
        }
    }

    public void setSubTitle(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f210079g.setText(string);
        this.f210079g.setVisibility(0);
        m224320a();
    }

    public void setSubTitleColor(int i) {
        this.f210079g.setTextColor(i);
    }

    public void setSubTitleSelector(int i) {
        this.f210079g.setTextColor(getResources().getColorStateList(i));
    }

    public void setSubTitleSize(int i) {
        this.f210079g.setTextSize(i);
    }

    public void setSubTitleTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f210079g.setTypeface(typeface);
        }
    }

    public void setSubtitleMaxLines(int i) {
        this.f210079g.setMaxLines(i);
        if (i > 1) {
            ((LinearLayout.LayoutParams) this.f210077e.getLayoutParams()).height = -2;
            this.f210077e.setGravity(16);
        }
    }

    public void setTitle(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f210078f.setText(string);
        this.f210078f.setVisibility(0);
        m224320a();
    }

    public void setTitleBottomPadding(int i) {
        this.f210078f.setPadding(0, 0, 0, bnl0.m105587w(i));
    }

    public void setTitleColor(int i) {
        this.f210078f.setTextColor(i);
    }

    public void setTitleSelector(int i) {
        this.f210078f.setTextColor(getResources().getColorStateList(i));
    }

    public void setTitleTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f210078f.setTypeface(typeface);
        }
    }

    public VListCell(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VListCell(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: v.VListCell$a */
    public static class C22660a {

        /* JADX INFO: renamed from: a */
        public final CharSequence f210081a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f210082b;

        /* JADX INFO: renamed from: c */
        public final CharSequence f210083c;

        /* JADX INFO: renamed from: d */
        public final int f210084d;

        /* JADX INFO: renamed from: e */
        public final int f210085e;

        /* JADX INFO: renamed from: f */
        public final int f210086f;

        public C22660a(CharSequence charSequence) {
            this.f210081a = charSequence;
            this.f210082b = null;
            this.f210083c = null;
            this.f210084d = -1;
            this.f210085e = -1;
            this.f210086f = -1;
        }

        public C22660a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, int i2, int i3) {
            this.f210081a = charSequence;
            this.f210082b = charSequence2;
            this.f210083c = charSequence3;
            this.f210084d = i;
            this.f210085e = i2;
            this.f210086f = i3;
        }
    }

    public void setDescribe(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f210080h.setText(charSequence);
        this.f210080h.setVisibility(0);
        m224320a();
    }

    public void setSubTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f210079g.setText(charSequence);
        this.f210079g.setVisibility(0);
        m224320a();
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f210078f.setText(charSequence);
        this.f210078f.setVisibility(0);
        m224320a();
    }
}

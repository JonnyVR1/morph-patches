package p028v;

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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import l.b6c0;
import l.b9c0;
import l.p4c0;
import l.t100;
import l.xdl0;
import p003l.eqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VListCell<V extends View> extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f12776a;

    /* JADX INFO: renamed from: b */
    public ViewStub f12777b;

    /* JADX INFO: renamed from: c */
    public VIcon f12778c;

    /* JADX INFO: renamed from: d */
    public VIcon f12779d;

    /* JADX INFO: renamed from: e */
    public VLinear f12780e;

    /* JADX INFO: renamed from: f */
    public VText f12781f;

    /* JADX INFO: renamed from: g */
    public VText f12782g;

    /* JADX INFO: renamed from: h */
    public VText f12783h;

    public VListCell(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11556b(context, attributeSet);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m11555a() {
        boolean z;
        if (this.f12776a == null && this.f12783h.getVisibility() != 8) {
            ((LinearLayout.LayoutParams) this.f12783h.getLayoutParams()).leftMargin = t100.h;
        }
        if (this.f12778c.getVisibility() == 8 && this.f12779d.getVisibility() == 8 && this.f12783h.getVisibility() == 8 && this.f12776a == null) {
            if (this.f12781f.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) this.f12781f.getLayoutParams()).gravity = 17;
            }
            if (this.f12782g.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) this.f12782g.getLayoutParams()).gravity = 17;
            }
            ((LinearLayout.LayoutParams) this.f12780e.getLayoutParams()).rightMargin = 0;
            return;
        }
        boolean z2 = true;
        if (this.f12781f.getVisibility() == 0) {
            ((LinearLayout.LayoutParams) this.f12781f.getLayoutParams()).gravity = 8388627;
            z = true;
        } else {
            z = false;
        }
        if (this.f12782g.getVisibility() == 0) {
            ((LinearLayout.LayoutParams) this.f12782g.getLayoutParams()).gravity = 8388627;
        } else {
            z2 = false;
        }
        ((LinearLayout.LayoutParams) this.f12780e.getLayoutParams()).rightMargin = t100.q;
        if (!z || z2) {
            this.f12781f.setPadding(0, 0, 0, 0);
        } else {
            this.f12781f.setPadding(0, t100.c, 0, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, v.VText] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @SuppressLint({"WrongViewCast"})
    /* JADX INFO: renamed from: b */
    public final void m11556b(Context context, @Nullable AttributeSet attributeSet) {
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
        CharSequence charSequence;
        CharSequence charSequence2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        CharSequence charSequence3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ColorStateList colorStateList4;
        LayoutInflater.from(context).inflate(b6c0.m, this);
        setGravity(16);
        setOrientation(0);
        this.f12778c = (VIcon) findViewById(p4c0.V);
        this.f12779d = (VIcon) findViewById(p4c0.W);
        this.f12777b = (ViewStub) findViewById(p4c0.x);
        this.f12780e = (VLinear) findViewById(p4c0.T0);
        ?? r4 = (VText) findViewById(p4c0.R0);
        this.f12781f = r4;
        r4.setTypeface(r4.getTypeface(), 1);
        this.f12782g = (VText) findViewById(p4c0.K0);
        this.f12783h = (VText) findViewById(p4c0.Z);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.g0);
            CharSequence string = typedArrayObtainStyledAttributes.getString(b9c0.u0);
            int color = typedArrayObtainStyledAttributes.getColor(b9c0.v0, Integer.MAX_VALUE);
            ColorStateList colorStateList5 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.v0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.w0, -1);
            i4 = typedArrayObtainStyledAttributes.getInt(b9c0.x0, -1);
            CharSequence string2 = typedArrayObtainStyledAttributes.getString(b9c0.p0);
            int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.q0, Integer.MAX_VALUE);
            ColorStateList colorStateList6 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.q0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.s0, -1);
            int i15 = typedArrayObtainStyledAttributes.getInt(b9c0.t0, -1);
            CharSequence string3 = typedArrayObtainStyledAttributes.getString(b9c0.l0);
            int color3 = typedArrayObtainStyledAttributes.getColor(b9c0.m0, Integer.MAX_VALUE);
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(b9c0.m0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.n0, -1);
            i6 = typedArrayObtainStyledAttributes.getInt(b9c0.o0, -1);
            int color4 = typedArrayObtainStyledAttributes.getColor(b9c0.h0, Integer.MAX_VALUE);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(b9c0.h0);
            i8 = i15;
            resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.j0, -1);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b9c0.k0, -1);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(b9c0.i0, -1);
            i = 1;
            i13 = typedArrayObtainStyledAttributes.getInt(b9c0.r0, 1);
            typedArrayObtainStyledAttributes.recycle();
            i7 = dimensionPixelSize3;
            charSequence = string2;
            i11 = color3;
            i9 = color4;
            i3 = dimensionPixelSize2;
            colorStateList3 = colorStateList5;
            i10 = color2;
            charSequence3 = string;
            drawable = drawable2;
            i12 = color;
            colorStateList2 = colorStateList6;
            charSequence2 = string3;
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
            charSequence = null;
            charSequence2 = null;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            charSequence3 = null;
            i9 = Integer.MAX_VALUE;
            i10 = Integer.MAX_VALUE;
            i11 = Integer.MAX_VALUE;
            i12 = Integer.MAX_VALUE;
            i13 = 1;
        }
        if (i13 <= i) {
            ((LinearLayout.LayoutParams) this.f12780e.getLayoutParams()).height = t100.E;
            this.f12780e.setGravity(16);
        }
        if (i9 != Integer.MAX_VALUE) {
            setBackgroundColor(i9);
        }
        if (drawable != null) {
            drawable.mutate();
            setBackground(drawable);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence3);
        AppCompatTextView appCompatTextView = this.f12781f;
        if (zIsEmpty) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
            this.f12781f.setText(charSequence3);
        }
        if (i12 != Integer.MAX_VALUE) {
            this.f12781f.setTextColor(i12);
        }
        if (colorStateList3 != null) {
            this.f12781f.setTextColor(colorStateList3);
        }
        if (i3 > 0) {
            this.f12781f.setTextSize(0, i3);
        }
        if (i4 > 0) {
            AppCompatTextView appCompatTextView2 = this.f12781f;
            if (i4 == 4) {
                appCompatTextView2.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                appCompatTextView2.setTypeface(eqh0.m3924c(i4));
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView3 = this.f12782g;
        if (zIsEmpty2) {
            appCompatTextView3.setVisibility(8);
        } else {
            appCompatTextView3.setVisibility(0);
            this.f12782g.setText(charSequence);
        }
        if (i10 != Integer.MAX_VALUE) {
            this.f12782g.setTextColor(i10);
        }
        if (colorStateList2 != null) {
            this.f12782g.setTextColor(colorStateList2);
        }
        if (dimensionPixelSize > 0) {
            this.f12782g.setTextSize(0, dimensionPixelSize);
        }
        if (i8 > 0) {
            this.f12782g.setTypeface(eqh0.m3924c(i8));
        }
        this.f12782g.setMaxLines(i13);
        boolean zIsEmpty3 = TextUtils.isEmpty(charSequence2);
        AppCompatTextView appCompatTextView4 = this.f12783h;
        if (zIsEmpty3) {
            appCompatTextView4.setVisibility(8);
        } else {
            appCompatTextView4.setVisibility(0);
            this.f12783h.setText(charSequence2);
        }
        if (i11 != Integer.MAX_VALUE) {
            this.f12783h.setTextColor(i11);
        }
        if (colorStateList != 0) {
            this.f12783h.setTextColor(colorStateList4);
        }
        if (i7 > 0) {
            colorStateList4 = colorStateList;
            this.f12783h.setTextSize(i7);
        }
        if (i6 > 0) {
            this.f12783h.setTypeface(eqh0.m3924c(i6));
        }
        AppCompatImageView appCompatImageView = this.f12778c;
        if (resourceId > 0) {
            i14 = 0;
            appCompatImageView.setVisibility(0);
            this.f12778c.setImageResource(resourceId);
        } else {
            i14 = 0;
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = this.f12779d;
        if (i5 > 0) {
            appCompatImageView2.setVisibility(i14);
            this.f12779d.setImageResource(i5);
        } else {
            appCompatImageView2.setVisibility(8);
        }
        if (i2 > 0) {
            this.f12777b.setLayoutResource(i2);
            this.f12776a = this.f12777b.inflate();
        }
        m11555a();
    }

    /* JADX INFO: renamed from: c */
    public void m11557c(Typeface typeface, int i) {
        if (typeface != null) {
            this.f12781f.setTypeface(typeface, i);
        }
    }

    public int getDescribeColor() {
        return this.f12783h.getCurrentTextColor();
    }

    public V getRightView() {
        return (V) this.f12776a;
    }

    public int getSubTitleColor() {
        return this.f12782g.getCurrentTextColor();
    }

    public int getTitleColor() {
        return this.f12781f.getCurrentTextColor();
    }

    public void setDescribe(@StringRes int i) {
        CharSequence string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f12783h.setText(string);
        this.f12783h.setVisibility(0);
        m11555a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setDescribeColor(int i) {
        this.f12783h.setTextColor(i);
    }

    public void setDescribeSelector(int i) {
        this.f12783h.setTextColor(getResources().getColorStateList(i));
    }

    public void setDescribeTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f12783h.setTypeface(typeface);
        }
    }

    public void setLeftLargeImage(int i) {
        if (i > 0) {
            this.f12778c.setVisibility(0);
            this.f12778c.setImageResource(i);
            m11555a();
        }
    }

    public void setLeftSmallImage(int i) {
        if (i > 0) {
            this.f12779d.setVisibility(0);
            this.f12779d.setImageResource(i);
            m11555a();
        }
    }

    public void setLeftSmallImageGravity(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12779d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.gravity = i;
        }
        xdl0.f0(this.f12779d, t100.d(11.0f));
        xdl0.c0(this.f12779d, t100.d(11.0f));
        this.f12779d.setLayoutParams(layoutParams);
    }

    public void setRightLayoutRes(int i) {
        if (i > 0) {
            this.f12777b.setLayoutResource(i);
            this.f12776a = this.f12777b.inflate();
            m11555a();
        }
    }

    public void setSubTitle(@StringRes int i) {
        CharSequence string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f12782g.setText(string);
        this.f12782g.setVisibility(0);
        m11555a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setSubTitleColor(int i) {
        this.f12782g.setTextColor(i);
    }

    public void setSubTitleSelector(int i) {
        this.f12782g.setTextColor(getResources().getColorStateList(i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setSubTitleSize(int i) {
        this.f12782g.setTextSize(i);
    }

    public void setSubTitleTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f12782g.setTypeface(typeface);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setSubtitleMaxLines(int i) {
        this.f12782g.setMaxLines(i);
        if (i > 1) {
            ((LinearLayout.LayoutParams) this.f12780e.getLayoutParams()).height = -2;
            this.f12780e.setGravity(16);
        }
    }

    public void setTitle(@StringRes int i) {
        CharSequence string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f12781f.setText(string);
        this.f12781f.setVisibility(0);
        m11555a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setTitleBottomPadding(int i) {
        this.f12781f.setPadding(0, 0, 0, xdl0.w(i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setTitleColor(int i) {
        this.f12781f.setTextColor(i);
    }

    public void setTitleSelector(int i) {
        this.f12781f.setTextColor(getResources().getColorStateList(i));
    }

    public void setTitleTypeface(Typeface typeface) {
        if (typeface != null) {
            this.f12781f.setTypeface(typeface);
        }
    }

    public VListCell(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VListCell(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: v.VListCell$a */
    public static class C1338a {

        /* JADX INFO: renamed from: a */
        public final CharSequence f12784a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f12785b;

        /* JADX INFO: renamed from: c */
        public final CharSequence f12786c;

        /* JADX INFO: renamed from: d */
        public final int f12787d;

        /* JADX INFO: renamed from: e */
        public final int f12788e;

        /* JADX INFO: renamed from: f */
        public final int f12789f;

        public C1338a(CharSequence charSequence) {
            this.f12784a = charSequence;
            this.f12785b = null;
            this.f12786c = null;
            this.f12787d = -1;
            this.f12788e = -1;
            this.f12789f = -1;
        }

        public C1338a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, int i2, int i3) {
            this.f12784a = charSequence;
            this.f12785b = charSequence2;
            this.f12786c = charSequence3;
            this.f12787d = i;
            this.f12788e = i2;
            this.f12789f = i3;
        }
    }

    public void setDescribe(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f12783h.setText(charSequence);
        this.f12783h.setVisibility(0);
        m11555a();
    }

    public void setSubTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f12782g.setText(charSequence);
        this.f12782g.setVisibility(0);
        m11555a();
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f12781f.setText(charSequence);
        this.f12781f.setVisibility(0);
        m11555a();
    }
}

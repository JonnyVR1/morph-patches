package p028v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import l.b6c0;
import l.b9c0;
import l.p4c0;
import l.t100;
import l.u2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VMenuBar<V extends View> extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f12829d;

    /* JADX INFO: renamed from: e */
    public VText f12830e;

    /* JADX INFO: renamed from: f */
    public VText f12831f;

    /* JADX INFO: renamed from: g */
    public VIcon f12832g;

    /* JADX INFO: renamed from: h */
    public VIcon f12833h;

    /* JADX INFO: renamed from: i */
    public VIcon f12834i;

    /* JADX INFO: renamed from: j */
    public VLine f12835j;

    /* JADX INFO: renamed from: k */
    public ViewStub f12836k;

    /* JADX INFO: renamed from: l */
    public View f12837l;

    public VMenuBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11611h0(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, v.VText] */
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
    /* JADX INFO: renamed from: h0 */
    private void m11611h0(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(b6c0.o, (ViewGroup) this);
        setBackgroundResource(u2c0.w);
        this.f12829d = (VText) findViewById(p4c0.d0);
        this.f12830e = (VText) findViewById(p4c0.G0);
        ?? r1 = (VText) findViewById(p4c0.r);
        this.f12831f = r1;
        r1.setTypeface(r1.getTypeface(), 1);
        this.f12832g = (VIcon) findViewById(p4c0.b0);
        this.f12833h = (VIcon) findViewById(p4c0.E0);
        this.f12834i = (VIcon) findViewById(p4c0.q);
        this.f12835j = (VLine) findViewById(p4c0.j);
        this.f12836k = (ViewStub) findViewById(p4c0.s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.y0);
        CharSequence string = typedArrayObtainStyledAttributes.getString(b9c0.G0);
        CharSequence string2 = typedArrayObtainStyledAttributes.getString(b9c0.I0);
        CharSequence string3 = typedArrayObtainStyledAttributes.getString(b9c0.E0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.C0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b9c0.D0, -1);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(b9c0.B0, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b9c0.z0, true);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(b9c0.A0, -1);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(b9c0.H0);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.J0);
        ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.F0);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.H0, Integer.MAX_VALUE);
        int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.J0, Integer.MAX_VALUE);
        int color3 = typedArrayObtainStyledAttributes.getColor(b9c0.F0, Integer.MAX_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        this.f12829d.setText(string);
        if (color != Integer.MAX_VALUE) {
            this.f12829d.setTextColor(color);
        }
        if (colorStateList != null) {
            this.f12829d.setTextColor(colorStateList);
        }
        boolean zIsEmpty = TextUtils.isEmpty(string);
        AppCompatTextView appCompatTextView = this.f12829d;
        if (zIsEmpty) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
        }
        this.f12830e.setText(string2);
        if (color2 != Integer.MAX_VALUE) {
            this.f12830e.setTextColor(color2);
        }
        if (colorStateList2 != null) {
            this.f12830e.setTextColor(colorStateList2);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        AppCompatTextView appCompatTextView2 = this.f12830e;
        if (zIsEmpty2) {
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView2.setVisibility(0);
        }
        this.f12831f.setText(string3);
        if (color3 != Integer.MAX_VALUE) {
            this.f12831f.setTextColor(color3);
        }
        if (colorStateList3 != null) {
            this.f12831f.setTextColor(colorStateList3);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(string3);
        AppCompatTextView appCompatTextView3 = this.f12831f;
        if (zIsEmpty3) {
            appCompatTextView3.setVisibility(8);
        } else {
            appCompatTextView3.setVisibility(0);
        }
        AppCompatImageView appCompatImageView = this.f12832g;
        if (resourceId != -1) {
            appCompatImageView.setVisibility(0);
            this.f12832g.setImageResource(resourceId);
        } else {
            appCompatImageView.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = this.f12833h;
        if (resourceId2 != -1) {
            appCompatImageView2.setVisibility(0);
            this.f12833h.setImageResource(resourceId2);
        } else {
            appCompatImageView2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = this.f12834i;
        if (resourceId3 != -1) {
            appCompatImageView3.setVisibility(0);
            this.f12834i.setImageResource(resourceId3);
        } else {
            appCompatImageView3.setVisibility(8);
        }
        this.f12835j.setVisibility(z ? 0 : 8);
        if (resourceId4 != -1) {
            this.f12836k.setLayoutResource(resourceId4);
            this.f12837l = this.f12836k.inflate();
        }
    }

    public V getCenterCustomView() {
        return (V) this.f12837l;
    }

    /* JADX INFO: renamed from: i0 */
    public void m11612i0(boolean z) {
        this.f12835j.setVisibility(z ? 0 : 8);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(t100.d(62.0f), 1073741824));
    }

    public void setCenterCustomLayoutRes(int i) {
        if (i > 0) {
            this.f12836k.setLayoutResource(i);
            this.f12837l = this.f12836k.inflate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <V extends View> void setCenterCustomView(V v2) {
        if (v2 != null) {
            Constraints.a aVar = new Constraints.a(-2, -2);
            ((ConstraintLayout.a) aVar).k = 0;
            ((ConstraintLayout.a) aVar).q = 0;
            ((ConstraintLayout.a) aVar).h = 0;
            ((ConstraintLayout.a) aVar).s = 0;
            addView(v2, aVar);
            this.f12837l = v2;
        }
    }

    public void setCenterImage(@DrawableRes int i) {
        AppCompatImageView appCompatImageView = this.f12834i;
        if (i == -1) {
            appCompatImageView.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(0);
            this.f12834i.setImageResource(i);
        }
    }

    public void setCenterRegionClick(View.OnClickListener onClickListener) {
        this.f12834i.setOnClickListener(onClickListener);
        this.f12831f.setOnClickListener(onClickListener);
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
    public void setCenterTextColor(@ColorInt int i) {
        this.f12831f.setTextColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCenterTextView(@StringRes int i) {
        CharSequence string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f12831f.setText(string);
        this.f12831f.setVisibility(0);
    }

    public void setLeftImage(@DrawableRes int i) {
        AppCompatImageView appCompatImageView = this.f12832g;
        if (i == -1) {
            appCompatImageView.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(0);
            this.f12832g.setImageResource(i);
        }
    }

    public void setLeftRegionClick(View.OnClickListener onClickListener) {
        this.f12832g.setOnClickListener(onClickListener);
        this.f12829d.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLeftTextView(@StringRes int i) {
        CharSequence string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f12829d.setText(string);
        this.f12829d.setVisibility(0);
    }

    public void setRightImage(@DrawableRes int i) {
        AppCompatImageView appCompatImageView = this.f12833h;
        if (i == -1) {
            appCompatImageView.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(0);
            this.f12833h.setImageResource(i);
        }
    }

    public void setRightRegionClick(View.OnClickListener onClickListener) {
        this.f12833h.setOnClickListener(onClickListener);
        this.f12830e.setOnClickListener(onClickListener);
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
    public void setRightTextColor(@ColorInt int i) {
        this.f12830e.setTextColor(i);
    }

    public void setRightTextMarginEnd(int i) {
        xdl0.W(this.f12830e, i);
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
    public void setRightTextSize(float f) {
        this.f12830e.setTextSize(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRightTextView(@StringRes int i) {
        CharSequence string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f12830e.setText(string);
        this.f12830e.setVisibility(0);
    }

    public VMenuBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VMenuBar(@NonNull Context context) {
        this(context, null);
    }

    public void setCenterTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f12831f.setText(charSequence);
        this.f12831f.setVisibility(0);
    }

    public void setLeftTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f12829d.setText(charSequence);
        this.f12829d.setVisibility(0);
    }

    public void setRightTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f12830e.setText(charSequence);
        this.f12830e.setVisibility(0);
    }
}

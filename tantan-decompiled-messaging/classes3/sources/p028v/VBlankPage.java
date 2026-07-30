package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.b6c0;
import l.b9c0;
import l.p4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VBlankPage extends ConstraintLayout {

    /* JADX INFO: renamed from: f */
    public static final ImageView.ScaleType[] f12666f = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: d */
    public VImage f12667d;

    /* JADX INFO: renamed from: e */
    public VText f12668e;

    public VBlankPage(Context context) {
        super(context);
        m11464h0(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void m11464h0(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(b6c0.h, (ViewGroup) this);
        this.f12667d = (VImage) findViewById(p4c0.h);
        this.f12668e = (VText) findViewById(p4c0.i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.c);
        CharSequence string = typedArrayObtainStyledAttributes.getString(b9c0.i);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.d, -1);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f, Integer.MAX_VALUE);
        int i = typedArrayObtainStyledAttributes.getInt(b9c0.e, -1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.g, -1);
        int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.h, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.f12668e.setText(string);
        }
        if (dimensionPixelSize != -1) {
            this.f12668e.setTextSize(0, dimensionPixelSize);
        }
        if (color != Integer.MAX_VALUE) {
            this.f12668e.setTextColor(color);
        }
        if (resourceId != -1) {
            this.f12667d.setImageResource(resourceId);
        }
        if (i2 >= 0) {
            this.f12667d.setScaleType(f12666f[i2]);
        }
        if (i >= 0) {
            AppCompatTextView appCompatTextView = this.f12668e;
            appCompatTextView.setTypeface(appCompatTextView.getTypeface(), i);
        }
    }

    public VBlankPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11464h0(context, attributeSet);
    }

    public VBlankPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11464h0(context, attributeSet);
    }
}

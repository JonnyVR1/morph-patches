package p028v;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.R;
import java.util.HashMap;
import l.b9c0;
import l.ig3;
import l.ojf0;
import p003l.z9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VText_Expandable extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public static String f13068s;

    /* JADX INFO: renamed from: t */
    public static String f13069t;

    /* JADX INFO: renamed from: a */
    public VText f13070a;

    /* JADX INFO: renamed from: b */
    public VText f13071b;

    /* JADX INFO: renamed from: c */
    public boolean f13072c;

    /* JADX INFO: renamed from: d */
    public boolean f13073d;

    /* JADX INFO: renamed from: e */
    public int f13074e;

    /* JADX INFO: renamed from: f */
    public int f13075f;

    /* JADX INFO: renamed from: g */
    public int f13076g;

    /* JADX INFO: renamed from: h */
    public int f13077h;

    /* JADX INFO: renamed from: i */
    public int f13078i;

    /* JADX INFO: renamed from: j */
    public float f13079j;

    /* JADX INFO: renamed from: k */
    public boolean f13080k;

    /* JADX INFO: renamed from: l */
    public boolean f13081l;

    /* JADX INFO: renamed from: m */
    public boolean f13082m;

    /* JADX INFO: renamed from: n */
    public boolean f13083n;

    /* JADX INFO: renamed from: o */
    public boolean f13084o;

    /* JADX INFO: renamed from: p */
    public InterfaceC1374c f13085p;

    /* JADX INFO: renamed from: q */
    public HashMap<String, Boolean> f13086q;

    /* JADX INFO: renamed from: r */
    public String f13087r;

    /* JADX INFO: renamed from: v.VText_Expandable$a */
    public class AnimationAnimationListenerC1372a implements Animation.AnimationListener {
        public AnimationAnimationListenerC1372a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            VText_Expandable.this.clearAnimation();
            VText_Expandable.this.f13083n = false;
            if (VText_Expandable.this.f13085p != null) {
                InterfaceC1374c interfaceC1374c = VText_Expandable.this.f13085p;
                VText_Expandable vText_Expandable = VText_Expandable.this;
                interfaceC1374c.m11771a(vText_Expandable.f13070a, !vText_Expandable.f13073d);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            VText_Expandable vText_Expandable = VText_Expandable.this;
            VText_Expandable.m11763h(vText_Expandable.f13070a, vText_Expandable.f13079j);
        }
    }

    /* JADX INFO: renamed from: v.VText_Expandable$b */
    public class RunnableC1373b implements Runnable {
        public RunnableC1373b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VText_Expandable vText_Expandable = VText_Expandable.this;
            vText_Expandable.f13077h = vText_Expandable.getHeight() - VText_Expandable.this.f13070a.getHeight();
        }
    }

    /* JADX INFO: renamed from: v.VText_Expandable$c */
    public interface InterfaceC1374c {
        /* JADX INFO: renamed from: a */
        void m11771a(TextView textView, boolean z);
    }

    public VText_Expandable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13073d = true;
        this.f13080k = true;
        this.f13081l = false;
        this.f13082m = false;
        m11767k(attributeSet);
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: h */
    public static void m11763h(View view, float f) {
        if (m11765l()) {
            view.setAlpha(f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: j */
    public static int m11764j(@NonNull TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m11765l() {
        return true;
    }

    @Nullable
    public CharSequence getText() {
        VText vText = this.f13070a;
        return vText == null ? "" : vText.getText();
    }

    public VText getTextView() {
        return this.f13070a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, v.VText] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, v.VText] */
    /* JADX INFO: renamed from: i */
    public final void m11766i() {
        ?? r0 = (VText) getChildAt(0);
        this.f13070a = r0;
        if (this.f13081l) {
            r0.setOnClickListener(this);
        }
        ?? r1 = (VText) getChildAt(1);
        this.f13071b = r1;
        if (this.f13082m) {
            r1.setOnClickListener(this);
        }
        this.f13071b.setText(this.f13073d ? f13068s : f13069t);
        setOnClickListener(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m11767k(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.u5);
        this.f13076g = typedArrayObtainStyledAttributes.getInt(b9c0.y5, 4);
        this.f13078i = typedArrayObtainStyledAttributes.getInt(b9c0.w5, 0);
        this.f13079j = typedArrayObtainStyledAttributes.getFloat(b9c0.v5, 1.0f);
        this.f13081l = typedArrayObtainStyledAttributes.getBoolean(b9c0.z5, false);
        this.f13082m = typedArrayObtainStyledAttributes.getBoolean(b9c0.x5, false);
        typedArrayObtainStyledAttributes.recycle();
        f13068s = getContext().getResources().getString(R.string.c);
        f13069t = getContext().getResources().getString(R.string.a);
        setOrientation(1);
        setVisibility(8);
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
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object m11768m(Float f, Transformation transformation, Integer num, Integer num2) {
        this.f13070a.setMaxHeight(((int) (((num2.intValue() - num.intValue()) * f.floatValue()) + num.intValue())) - this.f13077h);
        if (Float.compare(this.f13079j, 1.0f) == 0) {
            return null;
        }
        m11763h(this.f13070a, this.f13079j + (f.floatValue() * (1.0f - this.f13079j)));
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m11769n(@NonNull HashMap<String, Boolean> map, String str) {
        this.f13086q = map;
        this.f13087r = str;
        Boolean bool = map.get(str);
        this.f13073d = bool == null ? true : bool.booleanValue();
        clearAnimation();
        this.f13071b.setText(this.f13073d ? f13068s : f13069t);
        getLayoutParams().height = -2;
        requestLayout();
    }

    /* JADX INFO: renamed from: o */
    public void m11770o(@Nullable CharSequence charSequence, boolean z) {
        this.f13084o = z;
        if (this.f13070a == null) {
            m11766i();
        }
        this.f13072c = true;
        this.f13070a.setText(charSequence);
        setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int height;
        int height2;
        if (this.f13071b.getVisibility() != 0) {
            return;
        }
        boolean z = this.f13073d;
        this.f13073d = !z;
        this.f13071b.setText(!z ? f13068s : f13069t);
        HashMap<String, Boolean> map = this.f13086q;
        if (map != null) {
            map.put(this.f13087r, Boolean.valueOf(this.f13073d));
        }
        this.f13083n = true;
        z9j z9jVar = new z9j() { // from class: l.pqk0
            @Override // p003l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo6904b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f6490a.m11768m((Float) obj, (Transformation) obj2, (Integer) obj3, (Integer) obj4);
            }
        };
        if (this.f13073d) {
            height = getHeight();
            height2 = this.f13074e;
        } else {
            height = getHeight();
            height2 = (getHeight() + this.f13075f) - this.f13070a.getHeight();
        }
        ojf0 ojf0Var = new ojf0(this, height, height2, 0L, z9jVar);
        ojf0Var.setFillAfter(true);
        ojf0Var.setAnimationListener(new AnimationAnimationListenerC1372a());
        clearAnimation();
        startAnimation(ojf0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11766i();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13080k ? this.f13083n : super.onInterceptTouchEvent(motionEvent);
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
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f13072c || getVisibility() == 8 || !this.f13080k) {
            super.onMeasure(i, i2);
            return;
        }
        this.f13072c = false;
        this.f13071b.setVisibility(8);
        this.f13070a.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
        if (this.f13070a.getLineCount() <= this.f13076g) {
            return;
        }
        this.f13075f = m11764j(this.f13070a);
        if (this.f13073d || this.f13074e == 0) {
            this.f13070a.setMaxLines(this.f13076g);
            this.f13070a.setEllipsize(null);
        }
        this.f13071b.setVisibility(0);
        super.onMeasure(i, i2);
        if (this.f13073d || this.f13074e == 0) {
            this.f13070a.post(new RunnableC1373b());
            this.f13074e = getMeasuredHeight();
        }
        if (this.f13084o) {
            this.f13070a.setMaxLines(Integer.MAX_VALUE);
            this.f13073d = false;
            this.f13071b.setText(f13069t);
            super.onMeasure(i, i2);
            return;
        }
        if (this.f13073d) {
            return;
        }
        this.f13070a.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
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
    public void setBtnColor(int i) {
        if (this.f13071b == null) {
            m11766i();
        }
        this.f13071b.setTextColor(i);
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
    public void setBtnTextSize(int i) {
        if (this.f13071b == null) {
            m11766i();
        }
        this.f13071b.setTextSize(i);
    }

    public void setExpandable(boolean z) {
        this.f13080k = z;
    }

    public void setMaxCollapsedLines(int i) {
        this.f13076g = i;
    }

    public void setMovementMethod(MovementMethod movementMethod) {
        this.f13070a.setMovementMethod(movementMethod);
    }

    public void setOnExpandStateChangeListener(@Nullable InterfaceC1374c interfaceC1374c) {
        this.f13085p = interfaceC1374c;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 0) {
            super.setOrientation(i);
        } else {
            ig3.a("VText_Expandable only supports Vertical Orientation.");
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        m11770o(charSequence, false);
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
    public void setTextColor(int i) {
        if (this.f13070a == null) {
            m11766i();
        }
        this.f13070a.setTextColor(i);
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
    public void setTextSize(int i) {
        if (this.f13070a == null) {
            m11766i();
        }
        this.f13070a.setTextSize(i);
    }

    public void setTypeface(Typeface typeface) {
        if (this.f13070a == null) {
            m11766i();
        }
        this.f13070a.setTypeface(typeface);
    }

    public VText_Expandable(Context context) {
        this(context, null);
    }

    public VText_Expandable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13073d = true;
        this.f13080k = true;
        this.f13081l = false;
        this.f13082m = false;
        m11767k(attributeSet);
    }
}

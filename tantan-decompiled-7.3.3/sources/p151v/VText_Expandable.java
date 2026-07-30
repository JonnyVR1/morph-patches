package p151v;

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
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.R$string;
import java.util.HashMap;
import p153l.hhc0;
import p153l.tcj;
import p153l.wg3;
import p153l.xrf0;

/* JADX INFO: loaded from: classes3.dex */
public class VText_Expandable extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public static String f210365s;

    /* JADX INFO: renamed from: t */
    public static String f210366t;

    /* JADX INFO: renamed from: a */
    public VText f210367a;

    /* JADX INFO: renamed from: b */
    public VText f210368b;

    /* JADX INFO: renamed from: c */
    public boolean f210369c;

    /* JADX INFO: renamed from: d */
    public boolean f210370d;

    /* JADX INFO: renamed from: e */
    public int f210371e;

    /* JADX INFO: renamed from: f */
    public int f210372f;

    /* JADX INFO: renamed from: g */
    public int f210373g;

    /* JADX INFO: renamed from: h */
    public int f210374h;

    /* JADX INFO: renamed from: i */
    public int f210375i;

    /* JADX INFO: renamed from: j */
    public float f210376j;

    /* JADX INFO: renamed from: k */
    public boolean f210377k;

    /* JADX INFO: renamed from: l */
    public boolean f210378l;

    /* JADX INFO: renamed from: m */
    public boolean f210379m;

    /* JADX INFO: renamed from: n */
    public boolean f210380n;

    /* JADX INFO: renamed from: o */
    public boolean f210381o;

    /* JADX INFO: renamed from: p */
    public InterfaceC22696c f210382p;

    /* JADX INFO: renamed from: q */
    public HashMap<String, Boolean> f210383q;

    /* JADX INFO: renamed from: r */
    public String f210384r;

    /* JADX INFO: renamed from: v.VText_Expandable$a */
    public class AnimationAnimationListenerC22694a implements Animation.AnimationListener {
        public AnimationAnimationListenerC22694a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            VText_Expandable.this.clearAnimation();
            VText_Expandable.this.f210380n = false;
            if (VText_Expandable.this.f210382p != null) {
                InterfaceC22696c interfaceC22696c = VText_Expandable.this.f210382p;
                VText_Expandable vText_Expandable = VText_Expandable.this;
                interfaceC22696c.mo98783a(vText_Expandable.f210367a, !vText_Expandable.f210370d);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            VText_Expandable vText_Expandable = VText_Expandable.this;
            VText_Expandable.m224523h(vText_Expandable.f210367a, vText_Expandable.f210376j);
        }
    }

    /* JADX INFO: renamed from: v.VText_Expandable$b */
    public class RunnableC22695b implements Runnable {
        public RunnableC22695b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VText_Expandable vText_Expandable = VText_Expandable.this;
            vText_Expandable.f210374h = vText_Expandable.getHeight() - VText_Expandable.this.f210367a.getHeight();
        }
    }

    /* JADX INFO: renamed from: v.VText_Expandable$c */
    public interface InterfaceC22696c {
        /* JADX INFO: renamed from: a */
        void mo98783a(TextView textView, boolean z);
    }

    public VText_Expandable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210370d = true;
        this.f210377k = true;
        this.f210378l = false;
        this.f210379m = false;
        m224527k(attributeSet);
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: h */
    public static void m224523h(View view, float f) {
        if (m224525l()) {
            view.setAlpha(f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: j */
    public static int m224524j(@NonNull TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m224525l() {
        return true;
    }

    @Nullable
    public CharSequence getText() {
        VText vText = this.f210367a;
        return vText == null ? "" : vText.getText();
    }

    public VText getTextView() {
        return this.f210367a;
    }

    /* JADX INFO: renamed from: i */
    public final void m224526i() {
        VText vText = (VText) getChildAt(0);
        this.f210367a = vText;
        if (this.f210378l) {
            vText.setOnClickListener(this);
        }
        VText vText2 = (VText) getChildAt(1);
        this.f210368b = vText2;
        if (this.f210379m) {
            vText2.setOnClickListener(this);
        }
        this.f210368b.setText(this.f210370d ? f210365s : f210366t);
        setOnClickListener(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m224527k(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hhc0.f109840u5);
        this.f210373g = typedArrayObtainStyledAttributes.getInt(hhc0.f109868y5, 4);
        this.f210375i = typedArrayObtainStyledAttributes.getInt(hhc0.f109854w5, 0);
        this.f210376j = typedArrayObtainStyledAttributes.getFloat(hhc0.f109847v5, 1.0f);
        this.f210378l = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109875z5, false);
        this.f210379m = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109861x5, false);
        typedArrayObtainStyledAttributes.recycle();
        f210365s = getContext().getResources().getString(R$string.f15785c);
        f210366t = getContext().getResources().getString(R$string.f15765a);
        setOrientation(1);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object m224528m(Float f, Transformation transformation, Integer num, Integer num2) {
        this.f210367a.setMaxHeight(((int) (((num2.intValue() - num.intValue()) * f.floatValue()) + num.intValue())) - this.f210374h);
        if (Float.compare(this.f210376j, 1.0f) == 0) {
            return null;
        }
        m224523h(this.f210367a, this.f210376j + (f.floatValue() * (1.0f - this.f210376j)));
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m224529n(@NonNull HashMap<String, Boolean> map, String str) {
        this.f210383q = map;
        this.f210384r = str;
        Boolean bool = map.get(str);
        this.f210370d = bool == null ? true : bool.booleanValue();
        clearAnimation();
        this.f210368b.setText(this.f210370d ? f210365s : f210366t);
        getLayoutParams().height = -2;
        requestLayout();
    }

    /* JADX INFO: renamed from: o */
    public void m224530o(@Nullable CharSequence charSequence, boolean z) {
        this.f210381o = z;
        if (this.f210367a == null) {
            m224526i();
        }
        this.f210369c = true;
        this.f210367a.setText(charSequence);
        setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int height;
        int height2;
        if (this.f210368b.getVisibility() != 0) {
            return;
        }
        boolean z = this.f210370d;
        this.f210370d = !z;
        this.f210368b.setText(!z ? f210365s : f210366t);
        HashMap<String, Boolean> map = this.f210383q;
        if (map != null) {
            map.put(this.f210384r, Boolean.valueOf(this.f210370d));
        }
        this.f210380n = true;
        tcj tcjVar = new tcj() { // from class: l.vzk0
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f186500a.m224528m((Float) obj, (Transformation) obj2, (Integer) obj3, (Integer) obj4);
            }
        };
        if (this.f210370d) {
            height = getHeight();
            height2 = this.f210371e;
        } else {
            height = getHeight();
            height2 = (getHeight() + this.f210372f) - this.f210367a.getHeight();
        }
        xrf0 xrf0Var = new xrf0(this, height, height2, 0L, tcjVar);
        xrf0Var.setFillAfter(true);
        xrf0Var.setAnimationListener(new AnimationAnimationListenerC22694a());
        clearAnimation();
        startAnimation(xrf0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m224526i();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f210377k ? this.f210380n : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f210369c || getVisibility() == 8 || !this.f210377k) {
            super.onMeasure(i, i2);
            return;
        }
        this.f210369c = false;
        this.f210368b.setVisibility(8);
        this.f210367a.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        super.onMeasure(i, i2);
        if (this.f210367a.getLineCount() <= this.f210373g) {
            return;
        }
        this.f210372f = m224524j(this.f210367a);
        if (this.f210370d || this.f210371e == 0) {
            this.f210367a.setMaxLines(this.f210373g);
            this.f210367a.setEllipsize(null);
        }
        this.f210368b.setVisibility(0);
        super.onMeasure(i, i2);
        if (this.f210370d || this.f210371e == 0) {
            this.f210367a.post(new RunnableC22695b());
            this.f210371e = getMeasuredHeight();
        }
        if (this.f210381o) {
            this.f210367a.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f210370d = false;
            this.f210368b.setText(f210366t);
            super.onMeasure(i, i2);
            return;
        }
        if (this.f210370d) {
            return;
        }
        this.f210367a.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        super.onMeasure(i, i2);
    }

    public void setBtnColor(int i) {
        if (this.f210368b == null) {
            m224526i();
        }
        this.f210368b.setTextColor(i);
    }

    public void setBtnTextSize(int i) {
        if (this.f210368b == null) {
            m224526i();
        }
        this.f210368b.setTextSize(i);
    }

    public void setExpandable(boolean z) {
        this.f210377k = z;
    }

    public void setMaxCollapsedLines(int i) {
        this.f210373g = i;
    }

    public void setMovementMethod(MovementMethod movementMethod) {
        this.f210367a.setMovementMethod(movementMethod);
    }

    public void setOnExpandStateChangeListener(@Nullable InterfaceC22696c interfaceC22696c) {
        this.f210382p = interfaceC22696c;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 0) {
            super.setOrientation(i);
        } else {
            wg3.m206174a("VText_Expandable only supports Vertical Orientation.");
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        m224530o(charSequence, false);
    }

    public void setTextColor(int i) {
        if (this.f210367a == null) {
            m224526i();
        }
        this.f210367a.setTextColor(i);
    }

    public void setTextSize(int i) {
        if (this.f210367a == null) {
            m224526i();
        }
        this.f210367a.setTextSize(i);
    }

    public void setTypeface(Typeface typeface) {
        if (this.f210367a == null) {
            m224526i();
        }
        this.f210367a.setTypeface(typeface);
    }

    public VText_Expandable(Context context) {
        this(context, null);
    }

    public VText_Expandable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210370d = true;
        this.f210377k = true;
        this.f210378l = false;
        this.f210379m = false;
        m224527k(attributeSet);
    }
}

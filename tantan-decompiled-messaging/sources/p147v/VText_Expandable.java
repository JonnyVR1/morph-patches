package p147v;

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
import com.p046p1.mobile.android.R$string;
import java.util.HashMap;
import p149l.b9c0;
import p149l.ig3;
import p149l.ojf0;
import p149l.z9j;

/* JADX INFO: loaded from: classes3.dex */
public class VText_Expandable extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public static String f209443s;

    /* JADX INFO: renamed from: t */
    public static String f209444t;

    /* JADX INFO: renamed from: a */
    public VText f209445a;

    /* JADX INFO: renamed from: b */
    public VText f209446b;

    /* JADX INFO: renamed from: c */
    public boolean f209447c;

    /* JADX INFO: renamed from: d */
    public boolean f209448d;

    /* JADX INFO: renamed from: e */
    public int f209449e;

    /* JADX INFO: renamed from: f */
    public int f209450f;

    /* JADX INFO: renamed from: g */
    public int f209451g;

    /* JADX INFO: renamed from: h */
    public int f209452h;

    /* JADX INFO: renamed from: i */
    public int f209453i;

    /* JADX INFO: renamed from: j */
    public float f209454j;

    /* JADX INFO: renamed from: k */
    public boolean f209455k;

    /* JADX INFO: renamed from: l */
    public boolean f209456l;

    /* JADX INFO: renamed from: m */
    public boolean f209457m;

    /* JADX INFO: renamed from: n */
    public boolean f209458n;

    /* JADX INFO: renamed from: o */
    public boolean f209459o;

    /* JADX INFO: renamed from: p */
    public InterfaceC22581c f209460p;

    /* JADX INFO: renamed from: q */
    public HashMap<String, Boolean> f209461q;

    /* JADX INFO: renamed from: r */
    public String f209462r;

    /* JADX INFO: renamed from: v.VText_Expandable$a */
    public class AnimationAnimationListenerC22579a implements Animation.AnimationListener {
        public AnimationAnimationListenerC22579a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            VText_Expandable.this.clearAnimation();
            VText_Expandable.this.f209458n = false;
            if (VText_Expandable.this.f209460p != null) {
                InterfaceC22581c interfaceC22581c = VText_Expandable.this.f209460p;
                VText_Expandable vText_Expandable = VText_Expandable.this;
                interfaceC22581c.mo116115a(vText_Expandable.f209445a, !vText_Expandable.f209448d);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            VText_Expandable vText_Expandable = VText_Expandable.this;
            VText_Expandable.m223277h(vText_Expandable.f209445a, vText_Expandable.f209454j);
        }
    }

    /* JADX INFO: renamed from: v.VText_Expandable$b */
    public class RunnableC22580b implements Runnable {
        public RunnableC22580b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VText_Expandable vText_Expandable = VText_Expandable.this;
            vText_Expandable.f209452h = vText_Expandable.getHeight() - VText_Expandable.this.f209445a.getHeight();
        }
    }

    /* JADX INFO: renamed from: v.VText_Expandable$c */
    public interface InterfaceC22581c {
        /* JADX INFO: renamed from: a */
        void mo116115a(TextView textView, boolean z);
    }

    public VText_Expandable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209448d = true;
        this.f209455k = true;
        this.f209456l = false;
        this.f209457m = false;
        m223281k(attributeSet);
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: h */
    public static void m223277h(View view, float f) {
        if (m223279l()) {
            view.setAlpha(f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: j */
    public static int m223278j(@NonNull TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m223279l() {
        return true;
    }

    @Nullable
    public CharSequence getText() {
        VText vText = this.f209445a;
        return vText == null ? "" : vText.getText();
    }

    public VText getTextView() {
        return this.f209445a;
    }

    /* JADX INFO: renamed from: i */
    public final void m223280i() {
        VText vText = (VText) getChildAt(0);
        this.f209445a = vText;
        if (this.f209456l) {
            vText.setOnClickListener(this);
        }
        VText vText2 = (VText) getChildAt(1);
        this.f209446b = vText2;
        if (this.f209457m) {
            vText2.setOnClickListener(this);
        }
        this.f209446b.setText(this.f209448d ? f209443s : f209444t);
        setOnClickListener(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m223281k(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f74531u5);
        this.f209451g = typedArrayObtainStyledAttributes.getInt(b9c0.f74559y5, 4);
        this.f209453i = typedArrayObtainStyledAttributes.getInt(b9c0.f74545w5, 0);
        this.f209454j = typedArrayObtainStyledAttributes.getFloat(b9c0.f74538v5, 1.0f);
        this.f209456l = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74566z5, false);
        this.f209457m = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74552x5, false);
        typedArrayObtainStyledAttributes.recycle();
        f209443s = getContext().getResources().getString(R$string.f15066c);
        f209444t = getContext().getResources().getString(R$string.f15046a);
        setOrientation(1);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object m223282m(Float f, Transformation transformation, Integer num, Integer num2) {
        this.f209445a.setMaxHeight(((int) (((num2.intValue() - num.intValue()) * f.floatValue()) + num.intValue())) - this.f209452h);
        if (Float.compare(this.f209454j, 1.0f) == 0) {
            return null;
        }
        m223277h(this.f209445a, this.f209454j + (f.floatValue() * (1.0f - this.f209454j)));
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m223283n(@NonNull HashMap<String, Boolean> map, String str) {
        this.f209461q = map;
        this.f209462r = str;
        Boolean bool = map.get(str);
        this.f209448d = bool == null ? true : bool.booleanValue();
        clearAnimation();
        this.f209446b.setText(this.f209448d ? f209443s : f209444t);
        getLayoutParams().height = -2;
        requestLayout();
    }

    /* JADX INFO: renamed from: o */
    public void m223284o(@Nullable CharSequence charSequence, boolean z) {
        this.f209459o = z;
        if (this.f209445a == null) {
            m223280i();
        }
        this.f209447c = true;
        this.f209445a.setText(charSequence);
        setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int height;
        int height2;
        if (this.f209446b.getVisibility() != 0) {
            return;
        }
        boolean z = this.f209448d;
        this.f209448d = !z;
        this.f209446b.setText(!z ? f209443s : f209444t);
        HashMap<String, Boolean> map = this.f209461q;
        if (map != null) {
            map.put(this.f209462r, Boolean.valueOf(this.f209448d));
        }
        this.f209458n = true;
        z9j z9jVar = new z9j() { // from class: l.pqk0
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f150802a.m223282m((Float) obj, (Transformation) obj2, (Integer) obj3, (Integer) obj4);
            }
        };
        if (this.f209448d) {
            height = getHeight();
            height2 = this.f209449e;
        } else {
            height = getHeight();
            height2 = (getHeight() + this.f209450f) - this.f209445a.getHeight();
        }
        ojf0 ojf0Var = new ojf0(this, height, height2, 0L, z9jVar);
        ojf0Var.setFillAfter(true);
        ojf0Var.setAnimationListener(new AnimationAnimationListenerC22579a());
        clearAnimation();
        startAnimation(ojf0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m223280i();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f209455k ? this.f209458n : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f209447c || getVisibility() == 8 || !this.f209455k) {
            super.onMeasure(i, i2);
            return;
        }
        this.f209447c = false;
        this.f209446b.setVisibility(8);
        this.f209445a.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        super.onMeasure(i, i2);
        if (this.f209445a.getLineCount() <= this.f209451g) {
            return;
        }
        this.f209450f = m223278j(this.f209445a);
        if (this.f209448d || this.f209449e == 0) {
            this.f209445a.setMaxLines(this.f209451g);
            this.f209445a.setEllipsize(null);
        }
        this.f209446b.setVisibility(0);
        super.onMeasure(i, i2);
        if (this.f209448d || this.f209449e == 0) {
            this.f209445a.post(new RunnableC22580b());
            this.f209449e = getMeasuredHeight();
        }
        if (this.f209459o) {
            this.f209445a.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f209448d = false;
            this.f209446b.setText(f209444t);
            super.onMeasure(i, i2);
            return;
        }
        if (this.f209448d) {
            return;
        }
        this.f209445a.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        super.onMeasure(i, i2);
    }

    public void setBtnColor(int i) {
        if (this.f209446b == null) {
            m223280i();
        }
        this.f209446b.setTextColor(i);
    }

    public void setBtnTextSize(int i) {
        if (this.f209446b == null) {
            m223280i();
        }
        this.f209446b.setTextSize(i);
    }

    public void setExpandable(boolean z) {
        this.f209455k = z;
    }

    public void setMaxCollapsedLines(int i) {
        this.f209451g = i;
    }

    public void setMovementMethod(MovementMethod movementMethod) {
        this.f209445a.setMovementMethod(movementMethod);
    }

    public void setOnExpandStateChangeListener(@Nullable InterfaceC22581c interfaceC22581c) {
        this.f209460p = interfaceC22581c;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 0) {
            super.setOrientation(i);
        } else {
            ig3.m135964a("VText_Expandable only supports Vertical Orientation.");
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        m223284o(charSequence, false);
    }

    public void setTextColor(int i) {
        if (this.f209445a == null) {
            m223280i();
        }
        this.f209445a.setTextColor(i);
    }

    public void setTextSize(int i) {
        if (this.f209445a == null) {
            m223280i();
        }
        this.f209445a.setTextSize(i);
    }

    public void setTypeface(Typeface typeface) {
        if (this.f209445a == null) {
            m223280i();
        }
        this.f209445a.setTypeface(typeface);
    }

    public VText_Expandable(Context context) {
        this(context, null);
    }

    public VText_Expandable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209448d = true;
        this.f209455k = true;
        this.f209456l = false;
        this.f209457m = false;
        m223281k(attributeSet);
    }
}

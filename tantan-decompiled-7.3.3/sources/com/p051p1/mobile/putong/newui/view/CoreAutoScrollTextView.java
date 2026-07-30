package com.p051p1.mobile.putong.newui.view;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import java.util.List;
import p151v.VText;
import p153l.b9c0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreAutoScrollTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f54982a;

    /* JADX INFO: renamed from: b */
    public C13241b f54983b;

    /* JADX INFO: renamed from: c */
    public C13241b f54984c;

    /* JADX INFO: renamed from: d */
    public Handler f54985d;

    /* JADX INFO: renamed from: e */
    public Runnable f54986e;

    /* JADX INFO: renamed from: f */
    public List<String> f54987f;

    /* JADX INFO: renamed from: g */
    public int f54988g;

    /* JADX INFO: renamed from: h */
    public int f54989h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.CoreAutoScrollTextView$a */
    public interface InterfaceC13240a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.CoreAutoScrollTextView$b */
    public class C13241b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f54990a;

        /* JADX INFO: renamed from: b */
        public float f54991b;

        /* JADX INFO: renamed from: c */
        public final boolean f54992c;

        /* JADX INFO: renamed from: d */
        public final boolean f54993d;

        /* JADX INFO: renamed from: e */
        public Camera f54994e;

        public C13241b(boolean z, boolean z2) {
            this.f54992c = z;
            this.f54993d = z2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f54990a;
            float f3 = this.f54991b;
            Camera camera = this.f54994e;
            int i = this.f54993d ? 1 : -1;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            boolean z = this.f54992c;
            float f4 = this.f54991b;
            if (z) {
                camera.translate(0.0f, i * f4 * (f - 1.0f), 0.0f);
            } else {
                camera.translate(0.0f, i * f4 * f, 0.0f);
            }
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f2, -f3);
            matrix.postTranslate(f2, f3);
        }

        @Override // android.view.animation.Animation
        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f54994e = new Camera();
            this.f54991b = CoreAutoScrollTextView.this.getHeight();
            this.f54990a = CoreAutoScrollTextView.this.getWidth();
        }
    }

    public CoreAutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54988g = 0;
        this.f54989h = 1000;
        this.f54982a = context;
        setFactory(this);
        this.f54985d = new Handler();
        this.f54986e = new Runnable() { // from class: l.zz6
            @Override // java.lang.Runnable
            public final void run() {
                this.f206674a.m80330f();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final C13241b m80327c(boolean z, boolean z2) {
        C13241b c13241b = new C13241b(z, z2);
        c13241b.setDuration(250L);
        c13241b.setFillAfter(false);
        c13241b.setInterpolator(new AccelerateInterpolator());
        return c13241b;
    }

    @Override // android.view.View
    public void clearAnimation() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m80328d(boolean z) {
        this.f54983b = m80327c(z, z);
        C13241b c13241bM80327c = m80327c(!z, z);
        this.f54984c = c13241bM80327c;
        if (z) {
            c13241bM80327c = this.f54983b;
        }
        setInAnimation(c13241bM80327c);
        setOutAnimation(z ? this.f54984c : this.f54983b);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m80329e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m80330f() {
        int i = this.f54988g + 1;
        this.f54988g = i;
        List<String> list = this.f54987f;
        if (list == null) {
            return;
        }
        if (i == list.size()) {
            this.f54988g = 0;
        }
        m80331g();
        setText(this.f54987f.get(this.f54988g));
        this.f54985d.postDelayed(this.f54986e, this.f54989h);
    }

    /* JADX INFO: renamed from: g */
    public void m80331g() {
        Animation inAnimation = getInAnimation();
        C13241b c13241b = this.f54983b;
        if (inAnimation != c13241b) {
            setInAnimation(c13241b);
        }
        Animation outAnimation = getOutAnimation();
        C13241b c13241b2 = this.f54984c;
        if (outAnimation != c13241b2) {
            setOutAnimation(c13241b2);
        }
    }

    public String getText() {
        VText vText = (VText) getCurrentView();
        return vText == null ? "" : vText.getText().toString();
    }

    /* JADX INFO: renamed from: h */
    public void m80332h(int i) {
        this.f54989h = i;
        this.f54988g = 0;
        this.f54985d.post(this.f54986e);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        VText vText = new VText(this.f54982a);
        vText.setGravity(16);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setSingleLine();
        vText.setTextSize(14.0f);
        vText.setSingleLine(true);
        vText.setTextColor(getResources().getColor(b9c0.f75556b));
        vText.getPaint().setFakeBoldText(true);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.a07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67692a.m80329e(view);
            }
        });
        return vText;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54985d.removeCallbacks(this.f54986e);
        this.f54985d.removeCallbacksAndMessages(null);
    }

    public void setClickLisener(InterfaceC13240a interfaceC13240a) {
    }

    public void setList(List<String> list) {
        this.f54987f = list;
        m80328d(true);
    }

    @Override // android.widget.TextSwitcher
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTextColor(int i) {
        VText vText = (VText) getCurrentView();
        if (vText == null) {
            return;
        }
        vText.setTextColor(i);
    }

    public void setTextSize(float f) {
        VText vText = (VText) getCurrentView();
        if (vText == null) {
            return;
        }
        vText.setTextSize(f);
    }

    public CoreAutoScrollTextView(Context context) {
        this(context, null);
    }
}

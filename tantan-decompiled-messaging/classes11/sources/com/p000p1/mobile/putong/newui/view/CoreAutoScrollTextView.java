package com.p000p1.mobile.putong.newui.view;

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
import l.v0c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreAutoScrollTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f7740a;

    /* JADX INFO: renamed from: b */
    public C0480b f7741b;

    /* JADX INFO: renamed from: c */
    public C0480b f7742c;

    /* JADX INFO: renamed from: d */
    public Handler f7743d;

    /* JADX INFO: renamed from: e */
    public Runnable f7744e;

    /* JADX INFO: renamed from: f */
    public List<String> f7745f;

    /* JADX INFO: renamed from: g */
    public int f7746g;

    /* JADX INFO: renamed from: h */
    public int f7747h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.CoreAutoScrollTextView$a */
    public interface InterfaceC0479a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.CoreAutoScrollTextView$b */
    public class C0480b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f7748a;

        /* JADX INFO: renamed from: b */
        public float f7749b;

        /* JADX INFO: renamed from: c */
        public final boolean f7750c;

        /* JADX INFO: renamed from: d */
        public final boolean f7751d;

        /* JADX INFO: renamed from: e */
        public Camera f7752e;

        public C0480b(boolean z, boolean z2) {
            this.f7750c = z;
            this.f7751d = z2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f7748a;
            float f3 = this.f7749b;
            Camera camera = this.f7752e;
            int i = this.f7751d ? 1 : -1;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            boolean z = this.f7750c;
            float f4 = this.f7749b;
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
            this.f7752e = new Camera();
            this.f7749b = CoreAutoScrollTextView.this.getHeight();
            this.f7748a = CoreAutoScrollTextView.this.getWidth();
        }
    }

    public CoreAutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7746g = 0;
        this.f7747h = 1000;
        this.f7740a = context;
        setFactory(this);
        this.f7743d = new Handler();
        this.f7744e = new Runnable() { // from class: l.wy6
            @Override // java.lang.Runnable
            public final void run() {
                this.f22368a.m9466f();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final C0480b m9463c(boolean z, boolean z2) {
        C0480b c0480b = new C0480b(z, z2);
        c0480b.setDuration(250L);
        c0480b.setFillAfter(false);
        c0480b.setInterpolator(new AccelerateInterpolator());
        return c0480b;
    }

    @Override // android.view.View
    public void clearAnimation() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m9464d(boolean z) {
        this.f7741b = m9463c(z, z);
        C0480b c0480bM9463c = m9463c(!z, z);
        this.f7742c = c0480bM9463c;
        if (z) {
            c0480bM9463c = this.f7741b;
        }
        setInAnimation(c0480bM9463c);
        setOutAnimation(z ? this.f7742c : this.f7741b);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m9465e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m9466f() {
        int i = this.f7746g + 1;
        this.f7746g = i;
        List<String> list = this.f7745f;
        if (list == null) {
            return;
        }
        if (i == list.size()) {
            this.f7746g = 0;
        }
        m9467g();
        setText(this.f7745f.get(this.f7746g));
        this.f7743d.postDelayed(this.f7744e, this.f7747h);
    }

    /* JADX INFO: renamed from: g */
    public void m9467g() {
        Animation inAnimation = getInAnimation();
        C0480b c0480b = this.f7741b;
        if (inAnimation != c0480b) {
            setInAnimation(c0480b);
        }
        Animation outAnimation = getOutAnimation();
        C0480b c0480b2 = this.f7742c;
        if (outAnimation != c0480b2) {
            setOutAnimation(c0480b2);
        }
    }

    public String getText() {
        VText currentView = getCurrentView();
        return currentView == null ? "" : currentView.getText().toString();
    }

    /* JADX INFO: renamed from: h */
    public void m9468h(int i) {
        this.f7747h = i;
        this.f7746g = 0;
        this.f7743d.post(this.f7744e);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        VText vText = new VText(this.f7740a);
        vText.setGravity(16);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setSingleLine();
        vText.setTextSize(14.0f);
        vText.setSingleLine(true);
        vText.setTextColor(getResources().getColor(v0c0.b));
        vText.getPaint().setFakeBoldText(true);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.xy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22809a.m9465e(view);
            }
        });
        return vText;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7743d.removeCallbacks(this.f7744e);
        this.f7743d.removeCallbacksAndMessages(null);
    }

    public void setClickLisener(InterfaceC0479a interfaceC0479a) {
    }

    public void setList(List<String> list) {
        this.f7745f = list;
        m9464d(true);
    }

    @Override // android.widget.TextSwitcher
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTextColor(int i) {
        VText currentView = getCurrentView();
        if (currentView == null) {
            return;
        }
        currentView.setTextColor(i);
    }

    public void setTextSize(float f) {
        VText currentView = getCurrentView();
        if (currentView == null) {
            return;
        }
        currentView.setTextSize(f);
    }

    public CoreAutoScrollTextView(Context context) {
        this(context, null);
    }
}

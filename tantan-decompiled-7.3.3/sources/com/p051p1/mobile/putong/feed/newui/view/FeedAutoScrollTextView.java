package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import java.util.List;
import p151v.VText;
import p153l.k9c0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAutoScrollTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f44199a;

    /* JADX INFO: renamed from: b */
    public C11546b f44200b;

    /* JADX INFO: renamed from: c */
    public C11546b f44201c;

    /* JADX INFO: renamed from: d */
    public Handler f44202d;

    /* JADX INFO: renamed from: e */
    public Runnable f44203e;

    /* JADX INFO: renamed from: f */
    public List<String> f44204f;

    /* JADX INFO: renamed from: g */
    public int f44205g;

    /* JADX INFO: renamed from: h */
    public int f44206h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView$a */
    public interface InterfaceC11545a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView$b */
    public class C11546b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f44207a;

        /* JADX INFO: renamed from: b */
        public float f44208b;

        /* JADX INFO: renamed from: c */
        public final boolean f44209c;

        /* JADX INFO: renamed from: d */
        public final boolean f44210d;

        /* JADX INFO: renamed from: e */
        public Camera f44211e;

        public C11546b(boolean z, boolean z2) {
            this.f44209c = z;
            this.f44210d = z2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f44207a;
            float f3 = this.f44208b;
            Camera camera = this.f44211e;
            int i = this.f44210d ? 1 : -1;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            boolean z = this.f44209c;
            float f4 = this.f44208b;
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
            this.f44211e = new Camera();
            this.f44208b = FeedAutoScrollTextView.this.getHeight();
            this.f44207a = FeedAutoScrollTextView.this.getWidth();
        }
    }

    public FeedAutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44205g = 0;
        this.f44206h = 1000;
        this.f44199a = context;
        setFactory(this);
        this.f44202d = new Handler();
        this.f44203e = new Runnable() { // from class: l.eqg
            @Override // java.lang.Runnable
            public final void run() {
                this.f95338a.m67484f();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final C11546b m67481c(boolean z, boolean z2) {
        C11546b c11546b = new C11546b(z, z2);
        c11546b.setDuration(250L);
        c11546b.setFillAfter(false);
        c11546b.setInterpolator(new AccelerateInterpolator());
        return c11546b;
    }

    @Override // android.view.View
    public void clearAnimation() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m67482d(boolean z) {
        this.f44200b = m67481c(z, z);
        C11546b c11546bM67481c = m67481c(!z, z);
        this.f44201c = c11546bM67481c;
        if (z) {
            c11546bM67481c = this.f44200b;
        }
        setInAnimation(c11546bM67481c);
        setOutAnimation(z ? this.f44201c : this.f44200b);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m67483e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m67484f() {
        int i = this.f44205g + 1;
        this.f44205g = i;
        List<String> list = this.f44204f;
        if (list == null) {
            return;
        }
        if (i == list.size()) {
            this.f44205g = 0;
        }
        m67485g();
        setText(this.f44204f.get(this.f44205g));
        this.f44202d.postDelayed(this.f44203e, this.f44206h);
    }

    /* JADX INFO: renamed from: g */
    public void m67485g() {
        Animation inAnimation = getInAnimation();
        C11546b c11546b = this.f44200b;
        if (inAnimation != c11546b) {
            setInAnimation(c11546b);
        }
        Animation outAnimation = getOutAnimation();
        C11546b c11546b2 = this.f44201c;
        if (outAnimation != c11546b2) {
            setOutAnimation(c11546b2);
        }
    }

    public String getText() {
        VText vText = (VText) getCurrentView();
        return vText == null ? "" : vText.getText().toString();
    }

    /* JADX INFO: renamed from: h */
    public void m67486h(CharSequence charSequence, boolean z) {
        m67482d(z);
        setText(charSequence);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        VText vText = new VText(this.f44199a);
        vText.setGravity(17);
        vText.setTextSize(12.0f);
        vText.setSingleLine(true);
        vText.setGravity(17);
        vText.setTextColor(getResources().getColor(k9c0.f124479K));
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.dqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90241a.m67483e(view);
            }
        });
        return vText;
    }

    public void setClickLisener(InterfaceC11545a interfaceC11545a) {
    }

    public void setList(List<String> list) {
        this.f44204f = list;
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

    public FeedAutoScrollTextView(Context context) {
        this(context, null);
    }
}

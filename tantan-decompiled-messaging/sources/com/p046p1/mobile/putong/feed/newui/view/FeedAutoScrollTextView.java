package com.p046p1.mobile.putong.feed.newui.view;

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
import p147v.VText;
import p149l.e1c0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAutoScrollTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f43351a;

    /* JADX INFO: renamed from: b */
    public C11383b f43352b;

    /* JADX INFO: renamed from: c */
    public C11383b f43353c;

    /* JADX INFO: renamed from: d */
    public Handler f43354d;

    /* JADX INFO: renamed from: e */
    public Runnable f43355e;

    /* JADX INFO: renamed from: f */
    public List<String> f43356f;

    /* JADX INFO: renamed from: g */
    public int f43357g;

    /* JADX INFO: renamed from: h */
    public int f43358h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView$a */
    public interface InterfaceC11382a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView$b */
    public class C11383b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f43359a;

        /* JADX INFO: renamed from: b */
        public float f43360b;

        /* JADX INFO: renamed from: c */
        public final boolean f43361c;

        /* JADX INFO: renamed from: d */
        public final boolean f43362d;

        /* JADX INFO: renamed from: e */
        public Camera f43363e;

        public C11383b(boolean z, boolean z2) {
            this.f43361c = z;
            this.f43362d = z2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f43359a;
            float f3 = this.f43360b;
            Camera camera = this.f43363e;
            int i = this.f43362d ? 1 : -1;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            boolean z = this.f43361c;
            float f4 = this.f43360b;
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
            this.f43363e = new Camera();
            this.f43360b = FeedAutoScrollTextView.this.getHeight();
            this.f43359a = FeedAutoScrollTextView.this.getWidth();
        }
    }

    public FeedAutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43357g = 0;
        this.f43358h = 1000;
        this.f43351a = context;
        setFactory(this);
        this.f43354d = new Handler();
        this.f43355e = new Runnable() { // from class: l.pog
            @Override // java.lang.Runnable
            public final void run() {
                this.f150502a.m66301f();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final C11383b m66298c(boolean z, boolean z2) {
        C11383b c11383b = new C11383b(z, z2);
        c11383b.setDuration(250L);
        c11383b.setFillAfter(false);
        c11383b.setInterpolator(new AccelerateInterpolator());
        return c11383b;
    }

    @Override // android.view.View
    public void clearAnimation() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m66299d(boolean z) {
        this.f43352b = m66298c(z, z);
        C11383b c11383bM66298c = m66298c(!z, z);
        this.f43353c = c11383bM66298c;
        if (z) {
            c11383bM66298c = this.f43352b;
        }
        setInAnimation(c11383bM66298c);
        setOutAnimation(z ? this.f43353c : this.f43352b);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m66300e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m66301f() {
        int i = this.f43357g + 1;
        this.f43357g = i;
        List<String> list = this.f43356f;
        if (list == null) {
            return;
        }
        if (i == list.size()) {
            this.f43357g = 0;
        }
        m66302g();
        setText(this.f43356f.get(this.f43357g));
        this.f43354d.postDelayed(this.f43355e, this.f43358h);
    }

    /* JADX INFO: renamed from: g */
    public void m66302g() {
        Animation inAnimation = getInAnimation();
        C11383b c11383b = this.f43352b;
        if (inAnimation != c11383b) {
            setInAnimation(c11383b);
        }
        Animation outAnimation = getOutAnimation();
        C11383b c11383b2 = this.f43353c;
        if (outAnimation != c11383b2) {
            setOutAnimation(c11383b2);
        }
    }

    public String getText() {
        VText vText = (VText) getCurrentView();
        return vText == null ? "" : vText.getText().toString();
    }

    /* JADX INFO: renamed from: h */
    public void m66303h(CharSequence charSequence, boolean z) {
        m66299d(z);
        setText(charSequence);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        VText vText = new VText(this.f43351a);
        vText.setGravity(17);
        vText.setTextSize(12.0f);
        vText.setSingleLine(true);
        vText.setGravity(17);
        vText.setTextColor(getResources().getColor(e1c0.f88756K));
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.oog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144871a.m66300e(view);
            }
        });
        return vText;
    }

    public void setClickLisener(InterfaceC11382a interfaceC11382a) {
    }

    public void setList(List<String> list) {
        this.f43356f = list;
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

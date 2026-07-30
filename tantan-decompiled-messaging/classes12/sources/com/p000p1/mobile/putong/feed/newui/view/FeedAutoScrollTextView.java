package com.p000p1.mobile.putong.feed.newui.view;

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
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import java.util.List;
import p007l.e1c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAutoScrollTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f4812a;

    /* JADX INFO: renamed from: b */
    public C2227b f4813b;

    /* JADX INFO: renamed from: c */
    public C2227b f4814c;

    /* JADX INFO: renamed from: d */
    public Handler f4815d;

    /* JADX INFO: renamed from: e */
    public Runnable f4816e;

    /* JADX INFO: renamed from: f */
    public List<String> f4817f;

    /* JADX INFO: renamed from: g */
    public int f4818g;

    /* JADX INFO: renamed from: h */
    public int f4819h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView$a */
    public interface InterfaceC2226a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView$b */
    public class C2227b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f4820a;

        /* JADX INFO: renamed from: b */
        public float f4821b;

        /* JADX INFO: renamed from: c */
        public final boolean f4822c;

        /* JADX INFO: renamed from: d */
        public final boolean f4823d;

        /* JADX INFO: renamed from: e */
        public Camera f4824e;

        public C2227b(boolean z, boolean z2) {
            this.f4822c = z;
            this.f4823d = z2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f4820a;
            float f3 = this.f4821b;
            Camera camera = this.f4824e;
            int i = this.f4823d ? 1 : -1;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            boolean z = this.f4822c;
            float f4 = this.f4821b;
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
            this.f4824e = new Camera();
            this.f4821b = FeedAutoScrollTextView.this.getHeight();
            this.f4820a = FeedAutoScrollTextView.this.getWidth();
        }
    }

    public FeedAutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4818g = 0;
        this.f4819h = MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
        this.f4812a = context;
        setFactory(this);
        this.f4815d = new Handler();
        this.f4816e = new Runnable() { // from class: l.pog
            @Override // java.lang.Runnable
            public final void run() {
                this.f11931a.m7463f();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final C2227b m7460c(boolean z, boolean z2) {
        C2227b c2227b = new C2227b(z, z2);
        c2227b.setDuration(250L);
        c2227b.setFillAfter(false);
        c2227b.setInterpolator(new AccelerateInterpolator());
        return c2227b;
    }

    @Override // android.view.View
    public void clearAnimation() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m7461d(boolean z) {
        this.f4813b = m7460c(z, z);
        C2227b c2227bM7460c = m7460c(!z, z);
        this.f4814c = c2227bM7460c;
        if (z) {
            c2227bM7460c = this.f4813b;
        }
        setInAnimation(c2227bM7460c);
        setOutAnimation(z ? this.f4814c : this.f4813b);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7462e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7463f() {
        int i = this.f4818g + 1;
        this.f4818g = i;
        List<String> list = this.f4817f;
        if (list == null) {
            return;
        }
        if (i == list.size()) {
            this.f4818g = 0;
        }
        m7464g();
        setText(this.f4817f.get(this.f4818g));
        this.f4815d.postDelayed(this.f4816e, this.f4819h);
    }

    /* JADX INFO: renamed from: g */
    public void m7464g() {
        Animation inAnimation = getInAnimation();
        C2227b c2227b = this.f4813b;
        if (inAnimation != c2227b) {
            setInAnimation(c2227b);
        }
        Animation outAnimation = getOutAnimation();
        C2227b c2227b2 = this.f4814c;
        if (outAnimation != c2227b2) {
            setOutAnimation(c2227b2);
        }
    }

    public String getText() {
        VText currentView = getCurrentView();
        return currentView == null ? "" : currentView.getText().toString();
    }

    /* JADX INFO: renamed from: h */
    public void m7465h(CharSequence charSequence, boolean z) {
        m7461d(z);
        setText(charSequence);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        VText vText = new VText(this.f4812a);
        vText.setGravity(17);
        vText.setTextSize(12.0f);
        vText.setSingleLine(true);
        vText.setGravity(17);
        vText.setTextColor(getResources().getColor(e1c0.f7112K));
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.oog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11547a.m7462e(view);
            }
        });
        return vText;
    }

    public void setClickLisener(InterfaceC2226a interfaceC2226a) {
    }

    public void setList(List<String> list) {
        this.f4817f = list;
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

    public FeedAutoScrollTextView(Context context) {
        this(context, null);
    }
}

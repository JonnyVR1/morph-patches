package com.p046p1.mobile.putong.newui.view;

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
import p147v.VText;
import p149l.v0c0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreAutoScrollTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f54134a;

    /* JADX INFO: renamed from: b */
    public C13078b f54135b;

    /* JADX INFO: renamed from: c */
    public C13078b f54136c;

    /* JADX INFO: renamed from: d */
    public Handler f54137d;

    /* JADX INFO: renamed from: e */
    public Runnable f54138e;

    /* JADX INFO: renamed from: f */
    public List<String> f54139f;

    /* JADX INFO: renamed from: g */
    public int f54140g;

    /* JADX INFO: renamed from: h */
    public int f54141h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.CoreAutoScrollTextView$a */
    public interface InterfaceC13077a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.CoreAutoScrollTextView$b */
    public class C13078b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f54142a;

        /* JADX INFO: renamed from: b */
        public float f54143b;

        /* JADX INFO: renamed from: c */
        public final boolean f54144c;

        /* JADX INFO: renamed from: d */
        public final boolean f54145d;

        /* JADX INFO: renamed from: e */
        public Camera f54146e;

        public C13078b(boolean z, boolean z2) {
            this.f54144c = z;
            this.f54145d = z2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f54142a;
            float f3 = this.f54143b;
            Camera camera = this.f54146e;
            int i = this.f54145d ? 1 : -1;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            boolean z = this.f54144c;
            float f4 = this.f54143b;
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
            this.f54146e = new Camera();
            this.f54143b = CoreAutoScrollTextView.this.getHeight();
            this.f54142a = CoreAutoScrollTextView.this.getWidth();
        }
    }

    public CoreAutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54140g = 0;
        this.f54141h = 1000;
        this.f54134a = context;
        setFactory(this);
        this.f54137d = new Handler();
        this.f54138e = new Runnable() { // from class: l.wy6
            @Override // java.lang.Runnable
            public final void run() {
                this.f188545a.m79147f();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final C13078b m79144c(boolean z, boolean z2) {
        C13078b c13078b = new C13078b(z, z2);
        c13078b.setDuration(250L);
        c13078b.setFillAfter(false);
        c13078b.setInterpolator(new AccelerateInterpolator());
        return c13078b;
    }

    @Override // android.view.View
    public void clearAnimation() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m79145d(boolean z) {
        this.f54135b = m79144c(z, z);
        C13078b c13078bM79144c = m79144c(!z, z);
        this.f54136c = c13078bM79144c;
        if (z) {
            c13078bM79144c = this.f54135b;
        }
        setInAnimation(c13078bM79144c);
        setOutAnimation(z ? this.f54136c : this.f54135b);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m79146e(View view) {
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m79147f() {
        int i = this.f54140g + 1;
        this.f54140g = i;
        List<String> list = this.f54139f;
        if (list == null) {
            return;
        }
        if (i == list.size()) {
            this.f54140g = 0;
        }
        m79148g();
        setText(this.f54139f.get(this.f54140g));
        this.f54137d.postDelayed(this.f54138e, this.f54141h);
    }

    /* JADX INFO: renamed from: g */
    public void m79148g() {
        Animation inAnimation = getInAnimation();
        C13078b c13078b = this.f54135b;
        if (inAnimation != c13078b) {
            setInAnimation(c13078b);
        }
        Animation outAnimation = getOutAnimation();
        C13078b c13078b2 = this.f54136c;
        if (outAnimation != c13078b2) {
            setOutAnimation(c13078b2);
        }
    }

    public String getText() {
        VText vText = (VText) getCurrentView();
        return vText == null ? "" : vText.getText().toString();
    }

    /* JADX INFO: renamed from: h */
    public void m79149h(int i) {
        this.f54141h = i;
        this.f54140g = 0;
        this.f54137d.post(this.f54138e);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        VText vText = new VText(this.f54134a);
        vText.setGravity(16);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setSingleLine();
        vText.setTextSize(14.0f);
        vText.setSingleLine(true);
        vText.setTextColor(getResources().getColor(v0c0.f179095b));
        vText.getPaint().setFakeBoldText(true);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.xy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195027a.m79146e(view);
            }
        });
        return vText;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54137d.removeCallbacks(this.f54138e);
        this.f54137d.removeCallbacksAndMessages(null);
    }

    public void setClickLisener(InterfaceC13077a interfaceC13077a) {
    }

    public void setList(List<String> list) {
        this.f54139f = list;
        m79145d(true);
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

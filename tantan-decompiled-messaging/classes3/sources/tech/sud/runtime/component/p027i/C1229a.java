package tech.sud.runtime.component.p027i;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class C1229a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    Button f11410a;

    /* JADX INFO: renamed from: b */
    WeakReference<C1231c> f11411b;

    /* JADX INFO: renamed from: c */
    private View.OnClickListener f11412c;

    public C1229a(Context context, C1231c c1231c) {
        super(context);
        this.f11412c = new View.OnClickListener() { // from class: tech.sud.runtime.component.i.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeakReference<C1231c> weakReference = C1229a.this.f11411b;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                C1231c c1231c2 = C1229a.this.f11411b.get();
                c1231c2.m10375b();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
                c1231c2.setLayoutParams(layoutParams);
                C1229a.this.setLayoutParams(layoutParams);
            }
        };
        setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        Button button = new Button(context);
        this.f11410a = button;
        button.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f11410a.setText("exit");
        this.f11410a.setTextSize(24.0f);
        this.f11410a.setTextColor(-12303292);
        this.f11410a.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.setMargins(0, 20, 20, 0);
        this.f11410a.setLayoutParams(layoutParams);
        this.f11410a.setOnClickListener(this.f11412c);
        addView(c1231c);
        addView(this.f11410a);
        this.f11411b = new WeakReference<>(c1231c);
    }

    /* JADX INFO: renamed from: a */
    public void m10333a(boolean z) {
        setLayoutParams(z ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: a */
    public void m10332a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }
}

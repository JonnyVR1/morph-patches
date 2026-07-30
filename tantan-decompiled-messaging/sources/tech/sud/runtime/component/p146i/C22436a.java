package tech.sud.runtime.component.p146i;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.a */
/* JADX INFO: loaded from: classes3.dex */
class C22436a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    Button f207785a;

    /* JADX INFO: renamed from: b */
    WeakReference<C22438c> f207786b;

    /* JADX INFO: renamed from: c */
    private View.OnClickListener f207787c;

    public C22436a(Context context, C22438c c22438c) {
        super(context);
        this.f207787c = new View.OnClickListener() { // from class: tech.sud.runtime.component.i.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeakReference<C22438c> weakReference = C22436a.this.f207786b;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                C22438c c22438c2 = C22436a.this.f207786b.get();
                c22438c2.m221904b();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
                c22438c2.setLayoutParams(layoutParams);
                C22436a.this.setLayoutParams(layoutParams);
            }
        };
        setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        Button button = new Button(context);
        this.f207785a = button;
        button.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f207785a.setText("exit");
        this.f207785a.setTextSize(24.0f);
        this.f207785a.setTextColor(-12303292);
        this.f207785a.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.setMargins(0, 20, 20, 0);
        this.f207785a.setLayoutParams(layoutParams);
        this.f207785a.setOnClickListener(this.f207787c);
        addView(c22438c);
        addView(this.f207785a);
        this.f207786b = new WeakReference<>(c22438c);
    }

    /* JADX INFO: renamed from: a */
    public void m221862a(boolean z) {
        setLayoutParams(z ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: a */
    public void m221861a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }
}

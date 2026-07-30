package tech.sud.runtime.component.p150i;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.a */
/* JADX INFO: loaded from: classes3.dex */
class C22551a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    Button f208707a;

    /* JADX INFO: renamed from: b */
    WeakReference<C22553c> f208708b;

    /* JADX INFO: renamed from: c */
    private View.OnClickListener f208709c;

    public C22551a(Context context, C22553c c22553c) {
        super(context);
        this.f208709c = new View.OnClickListener() { // from class: tech.sud.runtime.component.i.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeakReference<C22553c> weakReference = C22551a.this.f208708b;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                C22553c c22553c2 = C22551a.this.f208708b.get();
                c22553c2.m223150b();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
                c22553c2.setLayoutParams(layoutParams);
                C22551a.this.setLayoutParams(layoutParams);
            }
        };
        setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        Button button = new Button(context);
        this.f208707a = button;
        button.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f208707a.setText("exit");
        this.f208707a.setTextSize(24.0f);
        this.f208707a.setTextColor(-12303292);
        this.f208707a.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.setMargins(0, 20, 20, 0);
        this.f208707a.setLayoutParams(layoutParams);
        this.f208707a.setOnClickListener(this.f208709c);
        addView(c22553c);
        addView(this.f208707a);
        this.f208708b = new WeakReference<>(c22553c);
    }

    /* JADX INFO: renamed from: a */
    public void m223108a(boolean z) {
        setLayoutParams(z ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: a */
    public void m223107a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }
}

package p151v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class ExpIconView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final int f209876d = qa00.m175859d(44.0f);

    /* JADX INFO: renamed from: a */
    public View f209877a;

    /* JADX INFO: renamed from: b */
    public VOnlineIndicator f209878b;

    /* JADX INFO: renamed from: c */
    public int f209879c;

    public ExpIconView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int i = qa00.f156314a;
            layoutParams2.rightMargin = -i;
            layoutParams2.leftMargin = -i;
        }
        this.f209877a = new View(getContext());
        int i2 = qa00.f156335v;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        addView(this.f209877a, layoutParams3);
        setBackgroundColor(-256);
        this.f209878b = new VOnlineIndicator(getContext());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 53;
        int i3 = qa00.f156317d;
        layoutParams4.rightMargin = i3;
        layoutParams4.topMargin = i3;
        addView(this.f209878b, layoutParams4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = f209876d;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void setColor(int i) {
        this.f209879c = i;
        if (getBackground() == null || i == 0) {
            return;
        }
        Drawable background = this.f209877a.getBackground();
        background.setTint(i);
        this.f209877a.setBackground(background);
    }

    public void setIcon(int i) {
        if (this.f209879c == 0) {
            this.f209877a.setBackgroundResource(i);
            return;
        }
        Drawable drawable = getResources().getDrawable(i);
        drawable.setTint(this.f209879c);
        this.f209877a.setBackground(drawable);
    }

    public ExpIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

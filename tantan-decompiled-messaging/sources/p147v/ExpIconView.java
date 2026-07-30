package p147v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class ExpIconView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final int f208954d = t100.m186890d(44.0f);

    /* JADX INFO: renamed from: a */
    public View f208955a;

    /* JADX INFO: renamed from: b */
    public VOnlineIndicator f208956b;

    /* JADX INFO: renamed from: c */
    public int f208957c;

    public ExpIconView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int i = t100.f167252a;
            layoutParams2.rightMargin = -i;
            layoutParams2.leftMargin = -i;
        }
        this.f208955a = new View(getContext());
        int i2 = t100.f167273v;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        addView(this.f208955a, layoutParams3);
        setBackgroundColor(-256);
        this.f208956b = new VOnlineIndicator(getContext());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 53;
        int i3 = t100.f167255d;
        layoutParams4.rightMargin = i3;
        layoutParams4.topMargin = i3;
        addView(this.f208956b, layoutParams4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = f208954d;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void setColor(int i) {
        this.f208957c = i;
        if (getBackground() == null || i == 0) {
            return;
        }
        Drawable background = this.f208955a.getBackground();
        background.setTint(i);
        this.f208955a.setBackground(background);
    }

    public void setIcon(int i) {
        if (this.f208957c == 0) {
            this.f208955a.setBackgroundResource(i);
            return;
        }
        Drawable drawable = getResources().getDrawable(i);
        drawable.setTint(this.f208957c);
        this.f208955a.setBackground(drawable);
    }

    public ExpIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

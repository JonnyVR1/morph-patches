package com.wdullaer.materialdatetimepicker.date;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.wdullaer.materialdatetimepicker.R$string;
import p153l.j26;
import p153l.q9c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class TextViewWithCircularIndicator extends TextView {

    /* JADX INFO: renamed from: a */
    Paint f62151a;

    /* JADX INFO: renamed from: b */
    private int f62152b;

    /* JADX INFO: renamed from: c */
    private final String f62153c;

    /* JADX INFO: renamed from: d */
    private boolean f62154d;

    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62151a = new Paint();
        this.f62152b = j26.m143190c(context, q9c0.f156216a);
        this.f62153c = context.getResources().getString(R$string.f62011i);
        m86313c();
    }

    /* JADX INFO: renamed from: a */
    private ColorStateList m86312a(int i, boolean z) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_selected}, new int[0]}, new int[]{i, -1, z ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR});
    }

    /* JADX INFO: renamed from: c */
    private void m86313c() {
        this.f62151a.setFakeBoldText(true);
        this.f62151a.setAntiAlias(true);
        this.f62151a.setColor(this.f62152b);
        this.f62151a.setTextAlign(Paint.Align.CENTER);
        this.f62151a.setStyle(Paint.Style.FILL);
        this.f62151a.setAlpha(255);
    }

    /* JADX INFO: renamed from: b */
    public void m86314b(boolean z) {
        this.f62154d = z;
    }

    /* JADX INFO: renamed from: d */
    public void m86315d(int i, boolean z) {
        this.f62152b = i;
        this.f62151a.setColor(i);
        setTextColor(m86312a(i, z));
    }

    @Override // android.view.View
    @SuppressLint({"GetContentDescriptionOverride"})
    public CharSequence getContentDescription() {
        CharSequence text = getText();
        return this.f62154d ? String.format(this.f62153c, text) : text;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f62154d) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle(width / 2, height / 2, Math.min(width, height) / 2, this.f62151a);
        }
        setSelected(this.f62154d);
        super.onDraw(canvas);
    }
}

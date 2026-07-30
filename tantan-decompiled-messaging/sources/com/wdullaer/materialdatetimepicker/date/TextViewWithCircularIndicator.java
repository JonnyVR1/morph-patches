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
import p149l.e16;
import p149l.k1c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class TextViewWithCircularIndicator extends TextView {

    /* JADX INFO: renamed from: a */
    Paint f61304a;

    /* JADX INFO: renamed from: b */
    private int f61305b;

    /* JADX INFO: renamed from: c */
    private final String f61306c;

    /* JADX INFO: renamed from: d */
    private boolean f61307d;

    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61304a = new Paint();
        this.f61305b = e16.m114375c(context, k1c0.f120558a);
        this.f61306c = context.getResources().getString(R$string.f61164i);
        m85142c();
    }

    /* JADX INFO: renamed from: a */
    private ColorStateList m85141a(int i, boolean z) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_selected}, new int[0]}, new int[]{i, -1, z ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR});
    }

    /* JADX INFO: renamed from: c */
    private void m85142c() {
        this.f61304a.setFakeBoldText(true);
        this.f61304a.setAntiAlias(true);
        this.f61304a.setColor(this.f61305b);
        this.f61304a.setTextAlign(Paint.Align.CENTER);
        this.f61304a.setStyle(Paint.Style.FILL);
        this.f61304a.setAlpha(255);
    }

    /* JADX INFO: renamed from: b */
    public void m85143b(boolean z) {
        this.f61307d = z;
    }

    /* JADX INFO: renamed from: d */
    public void m85144d(int i, boolean z) {
        this.f61305b = i;
        this.f61304a.setColor(i);
        setTextColor(m85141a(i, z));
    }

    @Override // android.view.View
    @SuppressLint({"GetContentDescriptionOverride"})
    public CharSequence getContentDescription() {
        CharSequence text = getText();
        return this.f61307d ? String.format(this.f61306c, text) : text;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f61307d) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle(width / 2, height / 2, Math.min(width, height) / 2, this.f61304a);
        }
        setSelected(this.f61307d);
        super.onDraw(canvas);
    }
}

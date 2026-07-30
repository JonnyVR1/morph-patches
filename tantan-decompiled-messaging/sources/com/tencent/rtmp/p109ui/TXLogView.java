package com.tencent.rtmp.p109ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class TXLogView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    StringBuffer f60448a;

    /* JADX INFO: renamed from: b */
    private TextView f60449b;

    /* JADX INFO: renamed from: c */
    private TextView f60450c;

    /* JADX INFO: renamed from: d */
    private ScrollView f60451d;

    /* JADX INFO: renamed from: e */
    private ScrollView f60452e;

    /* JADX INFO: renamed from: f */
    private final int f60453f;

    /* JADX INFO: renamed from: g */
    private boolean f60454g;

    public TXLogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60448a = new StringBuffer("");
        this.f60453f = 3000;
        this.f60454g = false;
        setOrientation(1);
        this.f60449b = new TextView(context);
        this.f60450c = new TextView(context);
        this.f60451d = new ScrollView(context);
        this.f60452e = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 0.2f;
        this.f60451d.setLayoutParams(layoutParams);
        this.f60451d.setBackgroundColor(1627389951);
        this.f60451d.setVerticalScrollBarEnabled(true);
        this.f60451d.setScrollbarFadingEnabled(true);
        this.f60449b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f60449b.setTextSize(2, 11.0f);
        this.f60449b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f60449b.setTypeface(Typeface.MONOSPACE, 1);
        this.f60449b.setLineSpacing(4.0f, 1.0f);
        this.f60449b.setPadding(m84609a(context, 2.0f), m84609a(context, 2.0f), m84609a(context, 2.0f), m84609a(context, 2.0f));
        this.f60451d.addView(this.f60449b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 0.8f;
        layoutParams2.topMargin = m84609a(context, 2.0f);
        this.f60452e.setLayoutParams(layoutParams2);
        this.f60452e.setBackgroundColor(1627389951);
        this.f60452e.setVerticalScrollBarEnabled(true);
        this.f60452e.setScrollbarFadingEnabled(true);
        this.f60450c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f60450c.setTextSize(2, 13.0f);
        this.f60450c.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f60450c.setPadding(m84609a(context, 2.0f), m84609a(context, 2.0f), m84609a(context, 2.0f), m84609a(context, 2.0f));
        this.f60452e.addView(this.f60450c);
        addView(this.f60451d);
        addView(this.f60452e);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public static int m84609a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public TXLogView(Context context) {
        this(context, null);
    }
}

package com.tencent.rtmp.p114ui;

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
    StringBuffer f61296a;

    /* JADX INFO: renamed from: b */
    private TextView f61297b;

    /* JADX INFO: renamed from: c */
    private TextView f61298c;

    /* JADX INFO: renamed from: d */
    private ScrollView f61299d;

    /* JADX INFO: renamed from: e */
    private ScrollView f61300e;

    /* JADX INFO: renamed from: f */
    private final int f61301f;

    /* JADX INFO: renamed from: g */
    private boolean f61302g;

    public TXLogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61296a = new StringBuffer("");
        this.f61301f = 3000;
        this.f61302g = false;
        setOrientation(1);
        this.f61297b = new TextView(context);
        this.f61298c = new TextView(context);
        this.f61299d = new ScrollView(context);
        this.f61300e = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 0.2f;
        this.f61299d.setLayoutParams(layoutParams);
        this.f61299d.setBackgroundColor(1627389951);
        this.f61299d.setVerticalScrollBarEnabled(true);
        this.f61299d.setScrollbarFadingEnabled(true);
        this.f61297b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f61297b.setTextSize(2, 11.0f);
        this.f61297b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f61297b.setTypeface(Typeface.MONOSPACE, 1);
        this.f61297b.setLineSpacing(4.0f, 1.0f);
        this.f61297b.setPadding(m85792a(context, 2.0f), m85792a(context, 2.0f), m85792a(context, 2.0f), m85792a(context, 2.0f));
        this.f61299d.addView(this.f61297b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 0.8f;
        layoutParams2.topMargin = m85792a(context, 2.0f);
        this.f61300e.setLayoutParams(layoutParams2);
        this.f61300e.setBackgroundColor(1627389951);
        this.f61300e.setVerticalScrollBarEnabled(true);
        this.f61300e.setScrollbarFadingEnabled(true);
        this.f61298c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f61298c.setTextSize(2, 13.0f);
        this.f61298c.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f61298c.setPadding(m85792a(context, 2.0f), m85792a(context, 2.0f), m85792a(context, 2.0f), m85792a(context, 2.0f));
        this.f61300e.addView(this.f61298c);
        addView(this.f61299d);
        addView(this.f61300e);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public static int m85792a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public TXLogView(Context context) {
        this(context, null);
    }
}

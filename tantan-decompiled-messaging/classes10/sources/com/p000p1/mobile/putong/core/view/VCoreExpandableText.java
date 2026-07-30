package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.e9c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VCoreExpandableText extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public int f2532a;

    /* JADX INFO: renamed from: b */
    public int f2533b;

    /* JADX INFO: renamed from: c */
    public TextView f2534c;

    /* JADX INFO: renamed from: d */
    public TextView f2535d;

    /* JADX INFO: renamed from: e */
    public boolean f2536e;

    /* JADX INFO: renamed from: f */
    public long f2537f;

    /* JADX INFO: renamed from: g */
    public String f2538g;

    /* JADX INFO: renamed from: h */
    public CharSequence f2539h;

    /* JADX INFO: renamed from: i */
    public int f2540i;

    /* JADX INFO: renamed from: j */
    public int f2541j;

    /* JADX INFO: renamed from: k */
    public int f2542k;

    /* JADX INFO: renamed from: l */
    public CharSequence f2543l;

    public VCoreExpandableText(@NonNull Context context) {
        super(context);
        this.f2537f = 0L;
        this.f2540i = Color.parseColor("#80ffffff");
        this.f2541j = 0;
        m4959c(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m4957a() {
        this.f2534c.setText(this.f2539h);
        this.f2534c.setMaxLines(Integer.MAX_VALUE);
        this.f2534c.setScrollY(0);
        this.f2535d.setVisibility(8);
        this.f2536e = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4958b() {
        this.f2534c.setText(this.f2543l);
        int i = this.f2542k;
        int i2 = this.f2533b;
        TextView textView = this.f2534c;
        if (i >= i2) {
            textView.setMaxLines(8);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        this.f2535d.setVisibility(0);
        this.f2536e = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4959c(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.Q);
            this.f2537f = typedArrayObtainStyledAttributes.getInt(e9c0.R, 0);
            this.f2538g = typedArrayObtainStyledAttributes.getString(e9c0.S);
            this.f2532a = typedArrayObtainStyledAttributes.getInt(e9c0.U, 3);
            this.f2533b = typedArrayObtainStyledAttributes.getInt(e9c0.T, 8);
            if (TextUtils.isEmpty(this.f2538g)) {
                this.f2538g = "显示全文";
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4960d() {
        if (getChildCount() == 2) {
            return;
        }
        CoreClickSpanTextView coreClickSpanTextView = new CoreClickSpanTextView(getContext());
        this.f2534c = coreClickSpanTextView;
        coreClickSpanTextView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        this.f2534c.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f2534c.setTextColor(-1);
        this.f2534c.setTextSize(16.0f);
        this.f2534c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(getContext());
        this.f2535d = textView;
        textView.setTextColor(this.f2540i);
        this.f2535d.setTextSize(16.0f);
        this.f2535d.setText("收起");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.d(5.0f);
        layoutParams.rightMargin = t100.d(4.0f);
        layoutParams.gravity = 5;
        this.f2535d.setGravity(5);
        this.f2535d.setLayoutParams(layoutParams);
        addView(this.f2534c);
        addView(this.f2535d);
        this.f2535d.setOnClickListener(this);
        this.f2534c.setOnClickListener(this);
        this.f2535d.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f2542k <= this.f2532a) {
            return;
        }
        if (this.f2536e) {
            m4957a();
        } else {
            m4958b();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4960d();
    }

    public void setWidth(int i) {
        this.f2541j = i;
    }

    public VCoreExpandableText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2537f = 0L;
        this.f2540i = Color.parseColor("#80ffffff");
        this.f2541j = 0;
        m4959c(context, attributeSet);
    }

    public VCoreExpandableText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2537f = 0L;
        this.f2540i = Color.parseColor("#80ffffff");
        this.f2541j = 0;
        m4959c(context, attributeSet);
    }
}

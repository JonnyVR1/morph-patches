package com.p046p1.mobile.putong.core.view;

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
import com.google.android.gms.common.api.Api;
import p149l.e9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes10.dex */
public class VCoreExpandableText extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public int f38590a;

    /* JADX INFO: renamed from: b */
    public int f38591b;

    /* JADX INFO: renamed from: c */
    public TextView f38592c;

    /* JADX INFO: renamed from: d */
    public TextView f38593d;

    /* JADX INFO: renamed from: e */
    public boolean f38594e;

    /* JADX INFO: renamed from: f */
    public long f38595f;

    /* JADX INFO: renamed from: g */
    public String f38596g;

    /* JADX INFO: renamed from: h */
    public CharSequence f38597h;

    /* JADX INFO: renamed from: i */
    public int f38598i;

    /* JADX INFO: renamed from: j */
    public int f38599j;

    /* JADX INFO: renamed from: k */
    public int f38600k;

    /* JADX INFO: renamed from: l */
    public CharSequence f38601l;

    public VCoreExpandableText(@NonNull Context context) {
        super(context);
        this.f38595f = 0L;
        this.f38598i = Color.parseColor("#80ffffff");
        this.f38599j = 0;
        m59550c(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m59548a() {
        this.f38592c.setText(this.f38597h);
        this.f38592c.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f38592c.setScrollY(0);
        this.f38593d.setVisibility(8);
        this.f38594e = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m59549b() {
        this.f38592c.setText(this.f38601l);
        int i = this.f38600k;
        int i2 = this.f38591b;
        TextView textView = this.f38592c;
        if (i >= i2) {
            textView.setMaxLines(8);
        } else {
            textView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        this.f38593d.setVisibility(0);
        this.f38594e = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m59550c(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f89987Q);
            this.f38595f = typedArrayObtainStyledAttributes.getInt(e9c0.f89990R, 0);
            this.f38596g = typedArrayObtainStyledAttributes.getString(e9c0.f89993S);
            this.f38590a = typedArrayObtainStyledAttributes.getInt(e9c0.f89999U, 3);
            this.f38591b = typedArrayObtainStyledAttributes.getInt(e9c0.f89996T, 8);
            if (TextUtils.isEmpty(this.f38596g)) {
                this.f38596g = "显示全文";
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m59551d() {
        if (getChildCount() == 2) {
            return;
        }
        CoreClickSpanTextView coreClickSpanTextView = new CoreClickSpanTextView(getContext());
        this.f38592c = coreClickSpanTextView;
        coreClickSpanTextView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        this.f38592c.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f38592c.setTextColor(-1);
        this.f38592c.setTextSize(16.0f);
        this.f38592c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(getContext());
        this.f38593d = textView;
        textView.setTextColor(this.f38598i);
        this.f38593d.setTextSize(16.0f);
        this.f38593d.setText("收起");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = t100.m186890d(5.0f);
        layoutParams.rightMargin = t100.m186890d(4.0f);
        layoutParams.gravity = 5;
        this.f38593d.setGravity(5);
        this.f38593d.setLayoutParams(layoutParams);
        addView(this.f38592c);
        addView(this.f38593d);
        this.f38593d.setOnClickListener(this);
        this.f38592c.setOnClickListener(this);
        this.f38593d.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f38600k <= this.f38590a) {
            return;
        }
        if (this.f38594e) {
            m59548a();
        } else {
            m59549b();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59551d();
    }

    public void setWidth(int i) {
        this.f38599j = i;
    }

    public VCoreExpandableText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38595f = 0L;
        this.f38598i = Color.parseColor("#80ffffff");
        this.f38599j = 0;
        m59550c(context, attributeSet);
    }

    public VCoreExpandableText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38595f = 0L;
        this.f38598i = Color.parseColor("#80ffffff");
        this.f38599j = 0;
        m59550c(context, attributeSet);
    }
}

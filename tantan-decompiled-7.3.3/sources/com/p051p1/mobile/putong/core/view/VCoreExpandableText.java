package com.p051p1.mobile.putong.core.view;

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
import p153l.khc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class VCoreExpandableText extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public int f39438a;

    /* JADX INFO: renamed from: b */
    public int f39439b;

    /* JADX INFO: renamed from: c */
    public TextView f39440c;

    /* JADX INFO: renamed from: d */
    public TextView f39441d;

    /* JADX INFO: renamed from: e */
    public boolean f39442e;

    /* JADX INFO: renamed from: f */
    public long f39443f;

    /* JADX INFO: renamed from: g */
    public String f39444g;

    /* JADX INFO: renamed from: h */
    public CharSequence f39445h;

    /* JADX INFO: renamed from: i */
    public int f39446i;

    /* JADX INFO: renamed from: j */
    public int f39447j;

    /* JADX INFO: renamed from: k */
    public int f39448k;

    /* JADX INFO: renamed from: l */
    public CharSequence f39449l;

    public VCoreExpandableText(@NonNull Context context) {
        super(context);
        this.f39443f = 0L;
        this.f39446i = Color.parseColor("#80ffffff");
        this.f39447j = 0;
        m60734c(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m60732a() {
        this.f39440c.setText(this.f39445h);
        this.f39440c.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f39440c.setScrollY(0);
        this.f39441d.setVisibility(8);
        this.f39442e = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m60733b() {
        this.f39440c.setText(this.f39449l);
        int i = this.f39448k;
        int i2 = this.f39439b;
        TextView textView = this.f39440c;
        if (i >= i2) {
            textView.setMaxLines(8);
        } else {
            textView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        this.f39441d.setVisibility(0);
        this.f39442e = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m60734c(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126757Q);
            this.f39443f = typedArrayObtainStyledAttributes.getInt(khc0.f126760R, 0);
            this.f39444g = typedArrayObtainStyledAttributes.getString(khc0.f126763S);
            this.f39438a = typedArrayObtainStyledAttributes.getInt(khc0.f126769U, 3);
            this.f39439b = typedArrayObtainStyledAttributes.getInt(khc0.f126766T, 8);
            if (TextUtils.isEmpty(this.f39444g)) {
                this.f39444g = "显示全文";
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m60735d() {
        if (getChildCount() == 2) {
            return;
        }
        CoreClickSpanTextView coreClickSpanTextView = new CoreClickSpanTextView(getContext());
        this.f39440c = coreClickSpanTextView;
        coreClickSpanTextView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        this.f39440c.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f39440c.setTextColor(-1);
        this.f39440c.setTextSize(16.0f);
        this.f39440c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(getContext());
        this.f39441d = textView;
        textView.setTextColor(this.f39446i);
        this.f39441d.setTextSize(16.0f);
        this.f39441d.setText("收起");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = qa00.m175859d(5.0f);
        layoutParams.rightMargin = qa00.m175859d(4.0f);
        layoutParams.gravity = 5;
        this.f39441d.setGravity(5);
        this.f39441d.setLayoutParams(layoutParams);
        addView(this.f39440c);
        addView(this.f39441d);
        this.f39441d.setOnClickListener(this);
        this.f39440c.setOnClickListener(this);
        this.f39441d.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f39448k <= this.f39438a) {
            return;
        }
        if (this.f39442e) {
            m60732a();
        } else {
            m60733b();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60735d();
    }

    public void setWidth(int i) {
        this.f39447j = i;
    }

    public VCoreExpandableText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39443f = 0L;
        this.f39446i = Color.parseColor("#80ffffff");
        this.f39447j = 0;
        m60734c(context, attributeSet);
    }

    public VCoreExpandableText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39443f = 0L;
        this.f39446i = Color.parseColor("#80ffffff");
        this.f39447j = 0;
        m60734c(context, attributeSet);
    }
}

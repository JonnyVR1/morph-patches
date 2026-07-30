package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.t100;
import l.u4c0;
import l.w0c0;
import l.xdl0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterCenterTextLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f3147a;

    /* JADX INFO: renamed from: b */
    public View f3148b;

    /* JADX INFO: renamed from: c */
    public TextView f3149c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f3150d;

    /* JADX INFO: renamed from: e */
    public TextView f3151e;

    /* JADX INFO: renamed from: f */
    public TextView f3152f;

    /* JADX INFO: renamed from: g */
    public View f3153g;

    /* JADX INFO: renamed from: h */
    public View f3154h;

    /* JADX INFO: renamed from: i */
    public View f3155i;

    public LoveLetterCenterTextLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m3621a(String str, boolean z, String str2, LoveLetterMessageState loveLetterMessageState) {
        xdl0.M(this.f3148b, true);
        xdl0.M(this.f3154h, true);
        View view = this.f3153g;
        int i = t100.q;
        xdl0.X(view, i);
        this.f3153g.setBackgroundResource(w0c0.V);
        xdl0.X(this.f3154h, i);
        this.f3154h.setBackgroundResource(w0c0.V);
        xdl0.X(this.f3155i, i);
        this.f3155i.setBackgroundResource(w0c0.V);
        xdl0.X(this.f3147a, i);
        xdl0.X(this.f3148b, i);
        xdl0.X(this.f3152f, i);
        this.f3147a.setText("（  你的情书状态  ）");
        this.f3147a.setTextSize(1, 16.0f);
        this.f3147a.setTextColor(getResources().getColor(w0c0.p0));
        this.f3149c.setText("情书已发送给");
        this.f3149c.setTextSize(1, 16.0f);
        this.f3149c.setTextColor(getResources().getColor(w0c0.p0));
        this.f3150d.setImageUrl(str2);
        this.f3151e.setText(str);
        this.f3151e.setTextSize(1, 16.0f);
        this.f3151e.setTextColor(getResources().getColor(w0c0.p0));
        if (TEnum.equals(loveLetterMessageState, "replied")) {
            TextView textView = this.f3152f;
            if (z) {
                textView.setTextColor(getResources().getColor(w0c0.p0));
                this.f3152f.setText("她已回复你的情书");
            } else {
                textView.setText("他已回复你的情书");
            }
        } else {
            this.f3152f.setTextColor(getResources().getColor(w0c0.V));
            TextView textView2 = this.f3152f;
            if (z) {
                textView2.setText("她还未回复你的情书");
            } else {
                textView2.setText("他还未回复你的情书");
            }
        }
        this.f3152f.setTextSize(1, 16.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m3622b(String str, String str2) {
        String str3 = "（  " + str + "  ）";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FE5F1D"));
        int iIndexOf = str3.indexOf(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f3147a.setText(spannableStringBuilder);
        this.f3152f.setText(str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(u4c0.Qd);
        this.f3147a = textView;
        textView.setLetterSpacing(0.5f);
        this.f3148b = findViewById(u4c0.K6);
        this.f3149c = (TextView) findViewById(u4c0.Pd);
        this.f3150d = findViewById(u4c0.O);
        this.f3151e = (TextView) findViewById(u4c0.I8);
        this.f3152f = (TextView) findViewById(u4c0.Rd);
        this.f3153g = findViewById(u4c0.Y6);
        this.f3154h = findViewById(u4c0.Z6);
        this.f3155i = findViewById(u4c0.a7);
    }

    public LoveLetterCenterTextLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterCenterTextLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

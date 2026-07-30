package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.AutoVDraweeView;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterCenterTextLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f25111a;

    /* JADX INFO: renamed from: b */
    public View f25112b;

    /* JADX INFO: renamed from: c */
    public TextView f25113c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f25114d;

    /* JADX INFO: renamed from: e */
    public TextView f25115e;

    /* JADX INFO: renamed from: f */
    public TextView f25116f;

    /* JADX INFO: renamed from: g */
    public View f25117g;

    /* JADX INFO: renamed from: h */
    public View f25118h;

    /* JADX INFO: renamed from: i */
    public View f25119i;

    public LoveLetterCenterTextLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m40553a(String str, boolean z, String str2, LoveLetterMessageState loveLetterMessageState) {
        bnl0.m105524M(this.f25112b, true);
        bnl0.m105524M(this.f25118h, true);
        View view = this.f25117g;
        int i = qa00.f156330q;
        bnl0.m105540X(view, i);
        this.f25117g.setBackgroundResource(c9c0.f80384W);
        bnl0.m105540X(this.f25118h, i);
        this.f25118h.setBackgroundResource(c9c0.f80384W);
        bnl0.m105540X(this.f25119i, i);
        this.f25119i.setBackgroundResource(c9c0.f80384W);
        bnl0.m105540X(this.f25111a, i);
        bnl0.m105540X(this.f25112b, i);
        bnl0.m105540X(this.f25116f, i);
        this.f25111a.setText("（  你的情书状态  ）");
        this.f25111a.setTextSize(1, 16.0f);
        this.f25111a.setTextColor(getResources().getColor(c9c0.f80449q0));
        this.f25113c.setText("情书已发送给");
        this.f25113c.setTextSize(1, 16.0f);
        this.f25113c.setTextColor(getResources().getColor(c9c0.f80449q0));
        this.f25114d.setImageUrl(str2);
        this.f25115e.setText(str);
        this.f25115e.setTextSize(1, 16.0f);
        this.f25115e.setTextColor(getResources().getColor(c9c0.f80449q0));
        if (TEnum.equals(loveLetterMessageState, LoveLetterMessageState.replied)) {
            TextView textView = this.f25116f;
            if (z) {
                textView.setTextColor(getResources().getColor(c9c0.f80449q0));
                this.f25116f.setText("她已回复你的情书");
            } else {
                textView.setText("他已回复你的情书");
            }
        } else {
            this.f25116f.setTextColor(getResources().getColor(c9c0.f80384W));
            TextView textView2 = this.f25116f;
            if (z) {
                textView2.setText("她还未回复你的情书");
            } else {
                textView2.setText("他还未回复你的情书");
            }
        }
        this.f25116f.setTextSize(1, 16.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m40554b(String str, String str2) {
        String str3 = "（  " + str + "  ）";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FE5F1D"));
        int iIndexOf = str3.indexOf(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f25111a.setText(spannableStringBuilder);
        this.f25116f.setText(str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(adc0.f70141Td);
        this.f25111a = textView;
        textView.setLetterSpacing(0.5f);
        this.f25112b = findViewById(adc0.f70015M6);
        this.f25113c = (TextView) findViewById(adc0.f70124Sd);
        this.f25114d = (AutoVDraweeView) findViewById(adc0.f70042O);
        this.f25115e = (TextView) findViewById(adc0.f69983K8);
        this.f25116f = (TextView) findViewById(adc0.f70158Ud);
        this.f25117g = findViewById(adc0.f70250a7);
        this.f25118h = findViewById(adc0.f70267b7);
        this.f25119i = findViewById(adc0.f70284c7);
    }

    public LoveLetterCenterTextLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterCenterTextLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

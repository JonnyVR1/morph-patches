package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.AutoVDraweeView;
import p149l.t100;
import p149l.u4c0;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterCenterTextLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f24369a;

    /* JADX INFO: renamed from: b */
    public View f24370b;

    /* JADX INFO: renamed from: c */
    public TextView f24371c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f24372d;

    /* JADX INFO: renamed from: e */
    public TextView f24373e;

    /* JADX INFO: renamed from: f */
    public TextView f24374f;

    /* JADX INFO: renamed from: g */
    public View f24375g;

    /* JADX INFO: renamed from: h */
    public View f24376h;

    /* JADX INFO: renamed from: i */
    public View f24377i;

    public LoveLetterCenterTextLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m39550a(String str, boolean z, String str2, LoveLetterMessageState loveLetterMessageState) {
        xdl0.m208344M(this.f24370b, true);
        xdl0.m208344M(this.f24376h, true);
        View view = this.f24375g;
        int i = t100.f167268q;
        xdl0.m208360X(view, i);
        this.f24375g.setBackgroundResource(w0c0.f183812V);
        xdl0.m208360X(this.f24376h, i);
        this.f24376h.setBackgroundResource(w0c0.f183812V);
        xdl0.m208360X(this.f24377i, i);
        this.f24377i.setBackgroundResource(w0c0.f183812V);
        xdl0.m208360X(this.f24369a, i);
        xdl0.m208360X(this.f24370b, i);
        xdl0.m208360X(this.f24374f, i);
        this.f24369a.setText("（  你的情书状态  ）");
        this.f24369a.setTextSize(1, 16.0f);
        this.f24369a.setTextColor(getResources().getColor(w0c0.f183876p0));
        this.f24371c.setText("情书已发送给");
        this.f24371c.setTextSize(1, 16.0f);
        this.f24371c.setTextColor(getResources().getColor(w0c0.f183876p0));
        this.f24372d.setImageUrl(str2);
        this.f24373e.setText(str);
        this.f24373e.setTextSize(1, 16.0f);
        this.f24373e.setTextColor(getResources().getColor(w0c0.f183876p0));
        if (TEnum.equals(loveLetterMessageState, LoveLetterMessageState.replied)) {
            TextView textView = this.f24374f;
            if (z) {
                textView.setTextColor(getResources().getColor(w0c0.f183876p0));
                this.f24374f.setText("她已回复你的情书");
            } else {
                textView.setText("他已回复你的情书");
            }
        } else {
            this.f24374f.setTextColor(getResources().getColor(w0c0.f183812V));
            TextView textView2 = this.f24374f;
            if (z) {
                textView2.setText("她还未回复你的情书");
            } else {
                textView2.setText("他还未回复你的情书");
            }
        }
        this.f24374f.setTextSize(1, 16.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m39551b(String str, String str2) {
        String str3 = "（  " + str + "  ）";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FE5F1D"));
        int iIndexOf = str3.indexOf(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f24369a.setText(spannableStringBuilder);
        this.f24374f.setText(str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(u4c0.f174002Qd);
        this.f24369a = textView;
        textView.setLetterSpacing(0.5f);
        this.f24370b = findViewById(u4c0.f173893K6);
        this.f24371c = (TextView) findViewById(u4c0.f173985Pd);
        this.f24372d = (AutoVDraweeView) findViewById(u4c0.f173954O);
        this.f24373e = (TextView) findViewById(u4c0.f173861I8);
        this.f24374f = (TextView) findViewById(u4c0.f174019Rd);
        this.f24375g = findViewById(u4c0.f174126Y6);
        this.f24376h = findViewById(u4c0.f174142Z6);
        this.f24377i = findViewById(u4c0.f174159a7);
    }

    public LoveLetterCenterTextLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterCenterTextLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

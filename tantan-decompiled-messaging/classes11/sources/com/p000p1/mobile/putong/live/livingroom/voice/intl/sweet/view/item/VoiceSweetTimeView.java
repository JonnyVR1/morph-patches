package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.h1c0;
import l.i3c0;
import l.jto0;
import l.kvc0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetTimeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f7228a;

    /* JADX INFO: renamed from: b */
    public TextView f7229b;

    /* JADX INFO: renamed from: c */
    public TextView f7230c;

    /* JADX INFO: renamed from: d */
    public TextView f7231d;

    /* JADX INFO: renamed from: e */
    public TextView f7232e;

    /* JADX INFO: renamed from: f */
    public TextView f7233f;

    public VoiceSweetTimeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8795a(View view) {
        jto0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8796b(long j, boolean z) {
        long j2 = j / 1000;
        int i = (int) (j2 / 86400);
        long j3 = j2 - ((long) (86400 * i));
        int i2 = (int) (j3 / 3600);
        int i3 = (int) ((j3 - ((long) (i2 * 3600))) / 60);
        String strValueOf = i > 99 ? String.valueOf(i) : String.format("%02d", Integer.valueOf(i));
        String str = String.format("%02d", Integer.valueOf(i2));
        String str2 = String.format("%02d", Integer.valueOf(i3));
        this.f7228a.setText(strValueOf);
        this.f7230c.setText(str);
        this.f7232e.setText(str2);
        if (z) {
            return;
        }
        this.f7228a.setTextColor(kvc0.a(h1c0.w1));
        this.f7230c.setTextColor(kvc0.a(h1c0.w1));
        this.f7232e.setTextColor(kvc0.a(h1c0.w1));
        this.f7228a.setBackgroundResource(i3c0.d8);
        this.f7230c.setBackgroundResource(i3c0.d8);
        this.f7232e.setBackgroundResource(i3c0.d8);
        this.f7229b.setTextColor(kvc0.a(h1c0.o0));
        this.f7231d.setTextColor(kvc0.a(h1c0.o0));
        this.f7233f.setTextColor(kvc0.a(h1c0.o0));
        this.f7228a.setTextSize(12.0f);
        this.f7230c.setTextSize(12.0f);
        this.f7232e.setTextSize(12.0f);
        this.f7229b.setTextSize(12.0f);
        this.f7231d.setTextSize(12.0f);
        this.f7233f.setTextSize(12.0f);
        TextView textView = this.f7229b;
        int i4 = t100.d;
        xdl0.V(textView, i4);
        xdl0.W(this.f7229b, i4);
        xdl0.V(this.f7231d, i4);
        xdl0.W(this.f7231d, i4);
        xdl0.V(this.f7233f, i4);
        TextView textView2 = this.f7228a;
        int i5 = t100.n;
        xdl0.C0(textView2, i5);
        xdl0.C0(this.f7230c, i5);
        xdl0.C0(this.f7232e, i5);
        this.f7228a.setMinimumWidth(i5);
        this.f7230c.setMinimumWidth(i5);
        this.f7232e.setMinimumWidth(i5);
        xdl0.d0(this.f7228a, t100.d(2.5f));
        xdl0.e0(this.f7228a, t100.d(2.5f));
        xdl0.d0(this.f7230c, t100.d(2.5f));
        xdl0.e0(this.f7230c, t100.d(2.5f));
        xdl0.d0(this.f7232e, t100.d(2.5f));
        xdl0.e0(this.f7232e, t100.d(2.5f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8795a(this);
    }

    public VoiceSweetTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

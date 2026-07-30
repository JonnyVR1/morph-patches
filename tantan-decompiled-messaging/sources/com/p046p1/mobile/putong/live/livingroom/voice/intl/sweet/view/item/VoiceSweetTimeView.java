package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mmkv.MMKV;
import p149l.h1c0;
import p149l.i3c0;
import p149l.jto0;
import p149l.kvc0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetTimeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f53622a;

    /* JADX INFO: renamed from: b */
    public TextView f53623b;

    /* JADX INFO: renamed from: c */
    public TextView f53624c;

    /* JADX INFO: renamed from: d */
    public TextView f53625d;

    /* JADX INFO: renamed from: e */
    public TextView f53626e;

    /* JADX INFO: renamed from: f */
    public TextView f53627f;

    public VoiceSweetTimeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78582a(View view) {
        jto0.m143158a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78583b(long j, boolean z) {
        long j2 = j / 1000;
        int i = (int) (j2 / 86400);
        long j3 = j2 - ((long) (MMKV.ExpireInDay * i));
        int i2 = (int) (j3 / 3600);
        int i3 = (int) ((j3 - ((long) (i2 * MMKV.ExpireInHour))) / 60);
        String strValueOf = i > 99 ? String.valueOf(i) : String.format("%02d", Integer.valueOf(i));
        String str = String.format("%02d", Integer.valueOf(i2));
        String str2 = String.format("%02d", Integer.valueOf(i3));
        this.f53622a.setText(strValueOf);
        this.f53624c.setText(str);
        this.f53626e.setText(str2);
        if (z) {
            return;
        }
        this.f53622a.setTextColor(kvc0.m147352a(h1c0.f105416w1));
        this.f53624c.setTextColor(kvc0.m147352a(h1c0.f105416w1));
        this.f53626e.setTextColor(kvc0.m147352a(h1c0.f105416w1));
        this.f53622a.setBackgroundResource(i3c0.f110982d8);
        this.f53624c.setBackgroundResource(i3c0.f110982d8);
        this.f53626e.setBackgroundResource(i3c0.f110982d8);
        this.f53623b.setTextColor(kvc0.m147352a(h1c0.f105391o0));
        this.f53625d.setTextColor(kvc0.m147352a(h1c0.f105391o0));
        this.f53627f.setTextColor(kvc0.m147352a(h1c0.f105391o0));
        this.f53622a.setTextSize(12.0f);
        this.f53624c.setTextSize(12.0f);
        this.f53626e.setTextSize(12.0f);
        this.f53623b.setTextSize(12.0f);
        this.f53625d.setTextSize(12.0f);
        this.f53627f.setTextSize(12.0f);
        TextView textView = this.f53623b;
        int i4 = t100.f167255d;
        xdl0.m208358V(textView, i4);
        xdl0.m208359W(this.f53623b, i4);
        xdl0.m208358V(this.f53625d, i4);
        xdl0.m208359W(this.f53625d, i4);
        xdl0.m208358V(this.f53627f, i4);
        TextView textView2 = this.f53622a;
        int i5 = t100.f167265n;
        xdl0.m208325C0(textView2, i5);
        xdl0.m208325C0(this.f53624c, i5);
        xdl0.m208325C0(this.f53626e, i5);
        this.f53622a.setMinimumWidth(i5);
        this.f53624c.setMinimumWidth(i5);
        this.f53626e.setMinimumWidth(i5);
        xdl0.m208370d0(this.f53622a, t100.m186890d(2.5f));
        xdl0.m208372e0(this.f53622a, t100.m186890d(2.5f));
        xdl0.m208370d0(this.f53624c, t100.m186890d(2.5f));
        xdl0.m208372e0(this.f53624c, t100.m186890d(2.5f));
        xdl0.m208370d0(this.f53626e, t100.m186890d(2.5f));
        xdl0.m208372e0(this.f53626e, t100.m186890d(2.5f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78582a(this);
    }

    public VoiceSweetTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

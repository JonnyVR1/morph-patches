package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mmkv.MMKV;
import p153l.bnl0;
import p153l.n2p0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetTimeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f54470a;

    /* JADX INFO: renamed from: b */
    public TextView f54471b;

    /* JADX INFO: renamed from: c */
    public TextView f54472c;

    /* JADX INFO: renamed from: d */
    public TextView f54473d;

    /* JADX INFO: renamed from: e */
    public TextView f54474e;

    /* JADX INFO: renamed from: f */
    public TextView f54475f;

    public VoiceSweetTimeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79765a(View view) {
        n2p0.m161247a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79766b(long j, boolean z) {
        long j2 = j / 1000;
        int i = (int) (j2 / 86400);
        long j3 = j2 - ((long) (MMKV.ExpireInDay * i));
        int i2 = (int) (j3 / 3600);
        int i3 = (int) ((j3 - ((long) (i2 * MMKV.ExpireInHour))) / 60);
        String strValueOf = i > 99 ? String.valueOf(i) : String.format("%02d", Integer.valueOf(i));
        String str = String.format("%02d", Integer.valueOf(i2));
        String str2 = String.format("%02d", Integer.valueOf(i3));
        this.f54470a.setText(strValueOf);
        this.f54472c.setText(str);
        this.f54474e.setText(str2);
        if (z) {
            return;
        }
        this.f54470a.setTextColor(n3d0.m161277a(n9c0.f140877w1));
        this.f54472c.setTextColor(n3d0.m161277a(n9c0.f140877w1));
        this.f54474e.setTextColor(n3d0.m161277a(n9c0.f140877w1));
        this.f54470a.setBackgroundResource(obc0.f146310d8);
        this.f54472c.setBackgroundResource(obc0.f146310d8);
        this.f54474e.setBackgroundResource(obc0.f146310d8);
        this.f54471b.setTextColor(n3d0.m161277a(n9c0.f140852o0));
        this.f54473d.setTextColor(n3d0.m161277a(n9c0.f140852o0));
        this.f54475f.setTextColor(n3d0.m161277a(n9c0.f140852o0));
        this.f54470a.setTextSize(12.0f);
        this.f54472c.setTextSize(12.0f);
        this.f54474e.setTextSize(12.0f);
        this.f54471b.setTextSize(12.0f);
        this.f54473d.setTextSize(12.0f);
        this.f54475f.setTextSize(12.0f);
        TextView textView = this.f54471b;
        int i4 = qa00.f156317d;
        bnl0.m105538V(textView, i4);
        bnl0.m105539W(this.f54471b, i4);
        bnl0.m105538V(this.f54473d, i4);
        bnl0.m105539W(this.f54473d, i4);
        bnl0.m105538V(this.f54475f, i4);
        TextView textView2 = this.f54470a;
        int i5 = qa00.f156327n;
        bnl0.m105505C0(textView2, i5);
        bnl0.m105505C0(this.f54472c, i5);
        bnl0.m105505C0(this.f54474e, i5);
        this.f54470a.setMinimumWidth(i5);
        this.f54472c.setMinimumWidth(i5);
        this.f54474e.setMinimumWidth(i5);
        bnl0.m105550d0(this.f54470a, qa00.m175859d(2.5f));
        bnl0.m105552e0(this.f54470a, qa00.m175859d(2.5f));
        bnl0.m105550d0(this.f54472c, qa00.m175859d(2.5f));
        bnl0.m105552e0(this.f54472c, qa00.m175859d(2.5f));
        bnl0.m105550d0(this.f54474e, qa00.m175859d(2.5f));
        bnl0.m105552e0(this.f54474e, qa00.m175859d(2.5f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79765a(this);
    }

    public VoiceSweetTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

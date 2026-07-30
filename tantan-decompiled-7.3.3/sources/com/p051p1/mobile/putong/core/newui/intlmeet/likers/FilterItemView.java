package com.p051p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.ddc0;
import p153l.gbc0;
import p153l.pec0;
import p153l.qa00;
import p153l.vli;

/* JADX INFO: loaded from: classes11.dex */
public class FilterItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f24954a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f24955b;

    public FilterItemView(Context context) {
        super(context);
        m40378a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m40378a(Context context) {
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(gbc0.f103190R);
        setPadding(qa00.m175859d(18.0f), 0, qa00.m175859d(18.0f), 0);
        setMinimumWidth(qa00.m175859d(68.0f));
        LayoutInflater.from(context).inflate(pec0.f151926N, (ViewGroup) this, true);
        this.f24954a = (ImageView) findViewById(ddc0.f87904j);
        this.f24955b = (VText_NoTopPadding) findViewById(ddc0.f87905k);
    }

    /* JADX INFO: renamed from: b */
    public void m40379b(vli vliVar) {
        if (vliVar == null) {
            return;
        }
        this.f24955b.setText(vliVar.f184588b);
        setSelected(vliVar.f184589c);
        this.f24955b.setSelected(vliVar.f184589c);
        bnl0.m105524M(this.f24954a, vliVar.f184589c);
        setPadding(qa00.m175859d(vliVar.f184589c ? 14.0f : 18.0f), 0, qa00.m175859d(18.0f), 0);
    }

    public FilterItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40378a(context);
    }

    public FilterItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40378a(context);
    }
}

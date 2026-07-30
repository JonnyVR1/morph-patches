package com.p000p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.b3c0;
import l.k6c0;
import l.t100;
import l.x4c0;
import l.xdl0;
import p009l.zii;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FilterItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f2990a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f2991b;

    public FilterItemView(Context context) {
        super(context);
        m3418a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3418a(Context context) {
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(b3c0.R);
        setPadding(t100.d(18.0f), 0, t100.d(18.0f), 0);
        setMinimumWidth(t100.d(68.0f));
        LayoutInflater.from(context).inflate(k6c0.N, (ViewGroup) this, true);
        this.f2990a = (ImageView) findViewById(x4c0.j);
        this.f2991b = findViewById(x4c0.k);
    }

    /* JADX INFO: renamed from: b */
    public void m3419b(zii ziiVar) {
        if (ziiVar == null) {
            return;
        }
        this.f2991b.setText(ziiVar.f23697b);
        setSelected(ziiVar.f23698c);
        this.f2991b.setSelected(ziiVar.f23698c);
        xdl0.M(this.f2990a, ziiVar.f23698c);
        setPadding(t100.d(ziiVar.f23698c ? 14.0f : 18.0f), 0, t100.d(18.0f), 0);
    }

    public FilterItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3418a(context);
    }

    public FilterItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3418a(context);
    }
}

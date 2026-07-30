package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.could.huiyansdk.C13869R;

/* JADX INFO: loaded from: classes2.dex */
public class HudView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f57564a;

    /* JADX INFO: renamed from: b */
    public long f57565b;

    /* JADX INFO: renamed from: c */
    public int f57566c;

    public HudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57565b = System.currentTimeMillis();
        this.f57566c = 0;
        m82420a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m82420a(Context context) {
        this.f57564a = (TextView) LayoutInflater.from(context).inflate(C13869R.layout.txy_huiyan_hud_view, this).findViewById(C13869R.id.txy_fps_txt_view);
    }

    public HudView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HudView(Context context) {
        this(context, null);
    }
}

package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.could.huiyansdk.C14032R;

/* JADX INFO: loaded from: classes12.dex */
public class HudView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f58412a;

    /* JADX INFO: renamed from: b */
    public long f58413b;

    /* JADX INFO: renamed from: c */
    public int f58414c;

    public HudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58413b = System.currentTimeMillis();
        this.f58414c = 0;
        m83603a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m83603a(Context context) {
        this.f58412a = (TextView) LayoutInflater.from(context).inflate(C14032R.layout.txy_huiyan_hud_view, this).findViewById(C14032R.id.txy_fps_txt_view);
    }

    public HudView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HudView(Context context) {
        this(context, null);
    }
}

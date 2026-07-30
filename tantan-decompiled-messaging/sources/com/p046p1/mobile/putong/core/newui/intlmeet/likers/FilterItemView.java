package com.p046p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VText_NoTopPadding;
import p149l.b3c0;
import p149l.k6c0;
import p149l.t100;
import p149l.x4c0;
import p149l.xdl0;
import p149l.zii;

/* JADX INFO: loaded from: classes11.dex */
public class FilterItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f24212a;

    /* JADX INFO: renamed from: b */
    public VText_NoTopPadding f24213b;

    public FilterItemView(Context context) {
        super(context);
        m39375a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39375a(Context context) {
        setOrientation(0);
        setGravity(17);
        setBackgroundResource(b3c0.f72939R);
        setPadding(t100.m186890d(18.0f), 0, t100.m186890d(18.0f), 0);
        setMinimumWidth(t100.m186890d(68.0f));
        LayoutInflater.from(context).inflate(k6c0.f121318N, (ViewGroup) this, true);
        this.f24212a = (ImageView) findViewById(x4c0.f190999j);
        this.f24213b = (VText_NoTopPadding) findViewById(x4c0.f191000k);
    }

    /* JADX INFO: renamed from: b */
    public void m39376b(zii ziiVar) {
        if (ziiVar == null) {
            return;
        }
        this.f24213b.setText(ziiVar.f203331b);
        setSelected(ziiVar.f203332c);
        this.f24213b.setSelected(ziiVar.f203332c);
        xdl0.m208344M(this.f24212a, ziiVar.f203332c);
        setPadding(t100.m186890d(ziiVar.f203332c ? 14.0f : 18.0f), 0, t100.m186890d(18.0f), 0);
    }

    public FilterItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m39375a(context);
    }

    public FilterItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m39375a(context);
    }
}

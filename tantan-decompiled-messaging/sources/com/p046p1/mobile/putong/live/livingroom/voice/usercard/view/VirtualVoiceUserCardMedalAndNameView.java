package com.p046p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.h4m0;

/* JADX INFO: loaded from: classes11.dex */
public class VirtualVoiceUserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f53850a;

    /* JADX INFO: renamed from: b */
    public VLinear f53851b;

    /* JADX INFO: renamed from: c */
    public VImage f53852c;

    /* JADX INFO: renamed from: d */
    public VText f53853d;

    /* JADX INFO: renamed from: e */
    public VLinear f53854e;

    /* JADX INFO: renamed from: f */
    public VLinear f53855f;

    /* JADX INFO: renamed from: g */
    public VText f53856g;

    /* JADX INFO: renamed from: h */
    public View f53857h;

    /* JADX INFO: renamed from: i */
    public VText f53858i;

    /* JADX INFO: renamed from: j */
    public VText f53859j;

    /* JADX INFO: renamed from: k */
    public VLinear f53860k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f53861l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f53862m;

    /* JADX INFO: renamed from: n */
    public TextView f53863n;

    /* JADX INFO: renamed from: o */
    public VText f53864o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f53865p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f53866q;

    /* JADX INFO: renamed from: r */
    public CommonMedalView f53867r;

    /* JADX INFO: renamed from: s */
    public CommonMedalView f53868s;

    /* JADX INFO: renamed from: t */
    public CommonMedalView f53869t;

    public VirtualVoiceUserCardMedalAndNameView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78730a(View view) {
        h4m0.m129275a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78731b() {
        this.f53850a.setText("");
        this.f53864o.setText("");
        this.f53865p.setVisibility(8);
        this.f53860k.setVisibility(8);
        this.f53855f.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78730a(this);
    }

    public VirtualVoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

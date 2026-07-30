package com.p046p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.vxo0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceUserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveGradientTextView f53924a;

    /* JADX INFO: renamed from: b */
    public VText f53925b;

    /* JADX INFO: renamed from: c */
    public VImage f53926c;

    /* JADX INFO: renamed from: d */
    public VText f53927d;

    /* JADX INFO: renamed from: e */
    public HorizontalScrollView f53928e;

    /* JADX INFO: renamed from: f */
    public VLinear f53929f;

    /* JADX INFO: renamed from: g */
    public VText f53930g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f53931h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53932i;

    /* JADX INFO: renamed from: j */
    public CommonMedalView f53933j;

    /* JADX INFO: renamed from: k */
    public CommonMedalView f53934k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f53935l;

    /* JADX INFO: renamed from: m */
    public CommonMedalView f53936m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f53937n;

    public VoiceUserCardMedalAndNameView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78771a(View view) {
        vxo0.m200576a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78772b() {
        this.f53924a.setText("");
        this.f53925b.setText("");
        this.f53930g.setText("");
        this.f53927d.setText("");
        this.f53932i.setVisibility(8);
        this.f53929f.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78771a(this);
    }

    public VoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

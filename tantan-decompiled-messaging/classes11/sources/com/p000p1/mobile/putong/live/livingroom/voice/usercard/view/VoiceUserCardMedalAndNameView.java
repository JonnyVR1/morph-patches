package com.p000p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import l.vxo0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceUserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveGradientTextView f7530a;

    /* JADX INFO: renamed from: b */
    public VText f7531b;

    /* JADX INFO: renamed from: c */
    public VImage f7532c;

    /* JADX INFO: renamed from: d */
    public VText f7533d;

    /* JADX INFO: renamed from: e */
    public HorizontalScrollView f7534e;

    /* JADX INFO: renamed from: f */
    public VLinear f7535f;

    /* JADX INFO: renamed from: g */
    public VText f7536g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f7537h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7538i;

    /* JADX INFO: renamed from: j */
    public CommonMedalView f7539j;

    /* JADX INFO: renamed from: k */
    public CommonMedalView f7540k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f7541l;

    /* JADX INFO: renamed from: m */
    public CommonMedalView f7542m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f7543n;

    public VoiceUserCardMedalAndNameView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8987a(View view) {
        vxo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8988b() {
        this.f7530a.setText("");
        this.f7531b.setText("");
        this.f7536g.setText("");
        this.f7533d.setText("");
        this.f7538i.setVisibility(8);
        this.f7535f.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8987a(this);
    }

    public VoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

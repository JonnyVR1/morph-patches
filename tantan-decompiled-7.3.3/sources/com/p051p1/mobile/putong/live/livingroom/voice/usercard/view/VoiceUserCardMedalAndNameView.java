package com.p051p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.z6p0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceUserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public LiveGradientTextView f54772a;

    /* JADX INFO: renamed from: b */
    public VText f54773b;

    /* JADX INFO: renamed from: c */
    public VImage f54774c;

    /* JADX INFO: renamed from: d */
    public VText f54775d;

    /* JADX INFO: renamed from: e */
    public HorizontalScrollView f54776e;

    /* JADX INFO: renamed from: f */
    public VLinear f54777f;

    /* JADX INFO: renamed from: g */
    public VText f54778g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f54779h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f54780i;

    /* JADX INFO: renamed from: j */
    public CommonMedalView f54781j;

    /* JADX INFO: renamed from: k */
    public CommonMedalView f54782k;

    /* JADX INFO: renamed from: l */
    public CommonMedalView f54783l;

    /* JADX INFO: renamed from: m */
    public CommonMedalView f54784m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f54785n;

    public VoiceUserCardMedalAndNameView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79954a(View view) {
        z6p0.m218809a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79955b() {
        this.f54772a.setText("");
        this.f54773b.setText("");
        this.f54778g.setText("");
        this.f54775d.setText("");
        this.f54780i.setVisibility(8);
        this.f54777f.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79954a(this);
    }

    public VoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p051p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.ldm0;

/* JADX INFO: loaded from: classes10.dex */
public class VirtualVoiceUserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f54698a;

    /* JADX INFO: renamed from: b */
    public VLinear f54699b;

    /* JADX INFO: renamed from: c */
    public VImage f54700c;

    /* JADX INFO: renamed from: d */
    public VText f54701d;

    /* JADX INFO: renamed from: e */
    public VLinear f54702e;

    /* JADX INFO: renamed from: f */
    public VLinear f54703f;

    /* JADX INFO: renamed from: g */
    public VText f54704g;

    /* JADX INFO: renamed from: h */
    public View f54705h;

    /* JADX INFO: renamed from: i */
    public VText f54706i;

    /* JADX INFO: renamed from: j */
    public VText f54707j;

    /* JADX INFO: renamed from: k */
    public VLinear f54708k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f54709l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f54710m;

    /* JADX INFO: renamed from: n */
    public TextView f54711n;

    /* JADX INFO: renamed from: o */
    public VText f54712o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f54713p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f54714q;

    /* JADX INFO: renamed from: r */
    public CommonMedalView f54715r;

    /* JADX INFO: renamed from: s */
    public CommonMedalView f54716s;

    /* JADX INFO: renamed from: t */
    public CommonMedalView f54717t;

    public VirtualVoiceUserCardMedalAndNameView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79913a(View view) {
        ldm0.m153783a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79914b() {
        this.f54698a.setText("");
        this.f54712o.setText("");
        this.f54713p.setVisibility(8);
        this.f54708k.setVisibility(8);
        this.f54703f.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79913a(this);
    }

    public VirtualVoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

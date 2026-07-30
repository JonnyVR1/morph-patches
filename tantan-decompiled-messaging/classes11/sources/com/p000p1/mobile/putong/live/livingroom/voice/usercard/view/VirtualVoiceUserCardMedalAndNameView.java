package com.p000p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import l.h4m0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VirtualVoiceUserCardMedalAndNameView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f7456a;

    /* JADX INFO: renamed from: b */
    public VLinear f7457b;

    /* JADX INFO: renamed from: c */
    public VImage f7458c;

    /* JADX INFO: renamed from: d */
    public VText f7459d;

    /* JADX INFO: renamed from: e */
    public VLinear f7460e;

    /* JADX INFO: renamed from: f */
    public VLinear f7461f;

    /* JADX INFO: renamed from: g */
    public VText f7462g;

    /* JADX INFO: renamed from: h */
    public View f7463h;

    /* JADX INFO: renamed from: i */
    public VText f7464i;

    /* JADX INFO: renamed from: j */
    public VText f7465j;

    /* JADX INFO: renamed from: k */
    public VLinear f7466k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f7467l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f7468m;

    /* JADX INFO: renamed from: n */
    public TextView f7469n;

    /* JADX INFO: renamed from: o */
    public VText f7470o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f7471p;

    /* JADX INFO: renamed from: q */
    public CommonMedalView f7472q;

    /* JADX INFO: renamed from: r */
    public CommonMedalView f7473r;

    /* JADX INFO: renamed from: s */
    public CommonMedalView f7474s;

    /* JADX INFO: renamed from: t */
    public CommonMedalView f7475t;

    public VirtualVoiceUserCardMedalAndNameView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8946a(View view) {
        h4m0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8947b() {
        this.f7456a.setText("");
        this.f7470o.setText("");
        this.f7471p.setVisibility(8);
        this.f7466k.setVisibility(8);
        this.f7461f.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8946a(this);
    }

    public VirtualVoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceUserCardMedalAndNameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

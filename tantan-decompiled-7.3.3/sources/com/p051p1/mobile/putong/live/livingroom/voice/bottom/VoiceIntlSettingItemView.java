package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.znn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlSettingItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53771a;

    /* JADX INFO: renamed from: b */
    public View f53772b;

    /* JADX INFO: renamed from: c */
    public TextView f53773c;

    /* JADX INFO: renamed from: d */
    public VText f53774d;

    public VoiceIntlSettingItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78963a(View view) {
        znn0.m220606a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78963a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f53771a.setImageResource(i);
    }

    public void setImageUrl(String str) {
        izs.m142871v("context_livingAct", this.f53771a, str, 0, 0, false, true, false, null);
    }

    public void setText(CharSequence charSequence) {
        this.f53774d.setText(charSequence);
    }

    public VoiceIntlSettingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceIntlSettingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

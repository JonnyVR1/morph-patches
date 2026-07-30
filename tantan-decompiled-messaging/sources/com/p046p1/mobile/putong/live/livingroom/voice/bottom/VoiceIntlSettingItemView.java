package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.ven0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlSettingItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52923a;

    /* JADX INFO: renamed from: b */
    public View f52924b;

    /* JADX INFO: renamed from: c */
    public TextView f52925c;

    /* JADX INFO: renamed from: d */
    public VText f52926d;

    public VoiceIntlSettingItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77780a(View view) {
        ven0.m198209a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77780a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f52923a.setImageResource(i);
    }

    public void setImageUrl(String str) {
        hxs.m133409v("context_livingAct", this.f52923a, str, 0, 0, false, true, false, null);
    }

    public void setText(CharSequence charSequence) {
        this.f52926d.setText(charSequence);
    }

    public VoiceIntlSettingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceIntlSettingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

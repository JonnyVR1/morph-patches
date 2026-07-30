package com.p051p1.mobile.putong.live.livingroom.voice.topbar.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import p151v.VDraweeView;
import p153l.f4p0;
import p153l.izs;
import p153l.qa00;
import p153l.wft;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceTopMenuItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54660a;

    /* JADX INFO: renamed from: b */
    public TextView f54661b;

    public VoiceTopMenuItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79889a(View view) {
        f4p0.m124024a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79890b(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.icon)) {
            VDraweeView vDraweeView = this.f54660a;
            String str = bLiveCommonViewConfig.icon;
            int i = qa00.f156333t;
            izs.m142870u("context_single_room", vDraweeView, str, i, i);
        }
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.text)) {
            this.f54661b.setText(bLiveCommonViewConfig.text);
        }
        if (wft.m206159b(3)) {
            return;
        }
        this.f54661b.setSingleLine(true);
        this.f54661b.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79889a(this);
    }

    public VoiceTopMenuItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceTopMenuItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

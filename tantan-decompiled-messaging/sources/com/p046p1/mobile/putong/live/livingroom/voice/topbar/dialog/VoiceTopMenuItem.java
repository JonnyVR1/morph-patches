package com.p046p1.mobile.putong.live.livingroom.voice.topbar.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import p147v.VDraweeView;
import p149l.bvo0;
import p149l.hxs;
import p149l.t100;
import p149l.vdt;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceTopMenuItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53812a;

    /* JADX INFO: renamed from: b */
    public TextView f53813b;

    public VoiceTopMenuItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78706a(View view) {
        bvo0.m104072a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78707b(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.icon)) {
            VDraweeView vDraweeView = this.f53812a;
            String str = bLiveCommonViewConfig.icon;
            int i = t100.f167271t;
            hxs.m133408u("context_single_room", vDraweeView, str, i, i);
        }
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.text)) {
            this.f53813b.setText(bLiveCommonViewConfig.text);
        }
        if (vdt.m198092b(3)) {
            return;
        }
        this.f53813b.setSingleLine(true);
        this.f53813b.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78706a(this);
    }

    public VoiceTopMenuItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceTopMenuItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

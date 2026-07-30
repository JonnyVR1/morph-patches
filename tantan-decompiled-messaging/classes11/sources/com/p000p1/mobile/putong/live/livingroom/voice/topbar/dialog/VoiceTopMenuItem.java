package com.p000p1.mobile.putong.live.livingroom.voice.topbar.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import l.bvo0;
import l.hxs;
import l.t100;
import l.vdt;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceTopMenuItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7418a;

    /* JADX INFO: renamed from: b */
    public TextView f7419b;

    public VoiceTopMenuItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8922a(View view) {
        bvo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8923b(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.icon)) {
            VDraweeView vDraweeView = this.f7418a;
            String str = bLiveCommonViewConfig.icon;
            int i = t100.t;
            hxs.u("context_single_room", vDraweeView, str, i, i);
        }
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.text)) {
            this.f7419b.setText(bLiveCommonViewConfig.text);
        }
        if (vdt.b(3)) {
            return;
        }
        this.f7419b.setSingleLine(true);
        this.f7419b.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8922a(this);
    }

    public VoiceTopMenuItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceTopMenuItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p051p1.mobile.putong.live.livingroom.voice.intl.preview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceModelDescribe;
import p151v.VText;
import p153l.bnl0;
import p153l.x20;
import p153l.yao0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceMicHelpDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMicHelpDialogView f54186a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f54187b;

    /* JADX INFO: renamed from: c */
    public VText f54188c;

    /* JADX INFO: renamed from: d */
    public VText f54189d;

    /* JADX INFO: renamed from: e */
    public VText f54190e;

    /* JADX INFO: renamed from: f */
    public VText f54191f;

    /* JADX INFO: renamed from: g */
    public VText f54192g;

    public VoiceMicHelpDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m79536b(View view) {
        yao0.m214899a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m79537c(BLiveVoiceModelDescribe bLiveVoiceModelDescribe, final x20 x20Var) {
        this.f54188c.setText(bLiveVoiceModelDescribe.title);
        if (!TextUtils.isEmpty(bLiveVoiceModelDescribe.content3) || !TextUtils.isEmpty(bLiveVoiceModelDescribe.content5)) {
            bnl0.m105524M(this.f54189d, true);
            this.f54189d.setText(TextUtils.isEmpty(bLiveVoiceModelDescribe.content3) ? bLiveVoiceModelDescribe.content5 : bLiveVoiceModelDescribe.content3);
        }
        if (!TextUtils.isEmpty(bLiveVoiceModelDescribe.content9)) {
            bnl0.m105524M(this.f54190e, true);
            this.f54190e.setText(bLiveVoiceModelDescribe.content9);
        }
        this.f54191f.setText(bLiveVoiceModelDescribe.content10);
        bnl0.m105509E0(this.f54192g, new View.OnClickListener() { // from class: l.xao0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79536b(this);
    }

    public VoiceMicHelpDialogView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMicHelpDialogView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

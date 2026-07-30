package com.p000p1.mobile.putong.live.livingroom.voice.intl.preview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveVoiceModelDescribe;
import l.d30;
import l.u1o0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceMicHelpDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMicHelpDialogView f6944a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f6945b;

    /* JADX INFO: renamed from: c */
    public VText f6946c;

    /* JADX INFO: renamed from: d */
    public VText f6947d;

    /* JADX INFO: renamed from: e */
    public VText f6948e;

    /* JADX INFO: renamed from: f */
    public VText f6949f;

    /* JADX INFO: renamed from: g */
    public VText f6950g;

    public VoiceMicHelpDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8552b(View view) {
        u1o0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m8553c(BLiveVoiceModelDescribe bLiveVoiceModelDescribe, final d30 d30Var) {
        this.f6946c.setText(bLiveVoiceModelDescribe.title);
        if (!TextUtils.isEmpty(bLiveVoiceModelDescribe.content3) || !TextUtils.isEmpty(bLiveVoiceModelDescribe.content5)) {
            xdl0.M(this.f6947d, true);
            this.f6947d.setText(TextUtils.isEmpty(bLiveVoiceModelDescribe.content3) ? bLiveVoiceModelDescribe.content5 : bLiveVoiceModelDescribe.content3);
        }
        if (!TextUtils.isEmpty(bLiveVoiceModelDescribe.content9)) {
            xdl0.M(this.f6948e, true);
            this.f6948e.setText(bLiveVoiceModelDescribe.content9);
        }
        this.f6949f.setText(bLiveVoiceModelDescribe.content10);
        xdl0.E0(this.f6950g, new View.OnClickListener() { // from class: l.t1o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8552b(this);
    }

    public VoiceMicHelpDialogView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMicHelpDialogView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
